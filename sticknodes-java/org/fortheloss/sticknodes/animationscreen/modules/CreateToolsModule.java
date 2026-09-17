package org.fortheloss.sticknodes.animationscreen.modules;

/* loaded from: classes2.dex */
public class CreateToolsModule extends org.fortheloss.sticknodes.animationscreen.modules.Module implements org.fortheloss.framework.IImageRequester, org.fortheloss.framework.IAndroidStorageRequester, org.fortheloss.sticknodes.animationscreen.modules.ICreationBasedModule, org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter {
    private com.badlogic.gdx.graphics.g2d.TextureAtlas _animationMenuAtlasRef;
    private org.fortheloss.framework.Assets _assetsRef;
    private com.badlogic.gdx.graphics.Color _backgroundColor;
    private boolean _backgroundImageOnTop;
    private float _backgroundImageTransparency;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _backgroundTR;
    private boolean _calculatedScissors;
    private int _callbackAndroidRequestStoragePermission;
    private org.fortheloss.sticknodes.animationscreen.dialogs.CancelCreateDialog _cancelDialog;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private com.badlogic.gdx.graphics.g2d.TextureAtlas _colorPickerAtlasRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _connectorScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable _connectorToolTable;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _createdFigureArray;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _createdStickfigure;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable _creationModeToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _currentActiveScrollPaneRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode _currentWorkingConnectorAnchorRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode _currentWorkingPolyfillAnchorRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _defaultScrollPane;
    private int _drawTool;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable _drawToolTable;
    private int _fromScreenToReturnTo;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable _jumpToolTable;
    private int _lastSelectedFrameTraceIndex;
    private org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog _modifyBranchDialog;
    private boolean _ownsTracingBackgroundImage;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable _permanentCreationToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _polyfillCreationScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable _polyfillCreationToolTable;
    private int _polyfillState;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private int _promptState;
    private org.fortheloss.sticknodes.data.useractions.BranchChangeAction _propertiesBeforeTestingSmartStretch;
    private int _rememberedDrawTool;
    private com.badlogic.gdx.math.Rectangle _scissorBounds1;
    private com.badlogic.gdx.math.Rectangle _scissorPermanentToolsBounds;
    private com.badlogic.gdx.math.Rectangle _scissorTopTableBounds;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> _scrollPanes;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable _segmentCreationToolTable;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable _shapeToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable _sideDrawToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable _specialSegmentToolTable;
    private org.fortheloss.sticknodes.animationscreen.dialogs.AddStickfigureToLibraryDialog _stickfigureAddToLibraryDialogRef;
    private org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureBackupDialog _stickfigureBackupDialog;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable _stickfigureCreationToolTable;
    private org.fortheloss.sticknodes.stickfigure.StickNode _stickfigureRememberedSelectedNode;
    private float _stickfigureRememberedX;
    private float _stickfigureRememberedY;
    private org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureSaveAsDialog _stickfigureSaveAsDialogRef;
    private org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureOverwriteDialog _stickfigureSaveOverwriteDialogRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _stickfigureScrollPane;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> _toolTables;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _topTable;
    private org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog _traceFrameDialogRef;
    private org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog _traceStickfigureDialogRef;
    private com.badlogic.gdx.graphics.Texture _tracingBackgroundImage;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _userChooseStickfigureScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable _userChooseStickfigureToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable _userDoingSomethingBlankToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _userDoingSomethingScrollPane;
    private boolean _userIsDoingSomethingBlankScrollPaneShowing;
    private org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog _waitForLoadedImageDialog;
    private boolean mPolynodeSelectionPrecisionIsQuick;
    private boolean mPolynodeShowNumbers;




    /* renamed from: org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$4, reason: invalid class name */
    class AnonymousClass4 extends org.fortheloss.sticknodes.animationscreen.dialogs.BackgroundQualityDialog {
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule this$0;


        AnonymousClass4(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1, org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        static /* synthetic */ org.fortheloss.sticknodes.animationscreen.AnimationScreen access$000(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule.AnonymousClass4 r0) {
                org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0._animationScreenRef
                return r0
        }

        @Override // org.fortheloss.sticknodes.animationscreen.dialogs.BackgroundQualityDialog
        protected void continueLoading() {
                r3 = this;
                super.continueLoading()
                int r0 = r3.getQuality()
                java.lang.Thread r1 = new java.lang.Thread
                org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$4$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$4$1
                r2.<init>(r3, r0)
                r1.<init>(r2)
                r1.start()
                return
        }
    }




    /* renamed from: -$$Nest$fget_canvasModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CanvasModule m789$$Nest$fget_canvasModuleRef(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r0._canvasModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_connectorScrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane m790$$Nest$fget_connectorScrollPane(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r0._connectorScrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_createdFigureArray, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m791$$Nest$fget_createdFigureArray(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r0._createdFigureArray
            return r0
    }

    /* renamed from: -$$Nest$fget_createdStickfigure, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.stickfigure.Stickfigure m792$$Nest$fget_createdStickfigure(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0) {
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0._createdStickfigure
            return r0
    }

    /* renamed from: -$$Nest$fget_creationModeToolTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable m793$$Nest$fget_creationModeToolTable(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0 = r0._creationModeToolTable
            return r0
    }

    /* renamed from: -$$Nest$fget_currentActiveScrollPaneRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane m794$$Nest$fget_currentActiveScrollPaneRef(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r0._currentActiveScrollPaneRef
            return r0
    }

    /* renamed from: -$$Nest$fget_projectDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.ProjectData m795$$Nest$fget_projectDataRef(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0) {
            org.fortheloss.sticknodes.data.ProjectData r0 = r0._projectDataRef
            return r0
    }

    /* renamed from: -$$Nest$fget_stickfigureScrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane m796$$Nest$fget_stickfigureScrollPane(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r0._stickfigureScrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_tracingBackgroundImage, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.Texture m797$$Nest$fget_tracingBackgroundImage(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0) {
            com.badlogic.gdx.graphics.Texture r0 = r0._tracingBackgroundImage
            return r0
    }

    /* renamed from: -$$Nest$fput_ownsTracingBackgroundImage, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m798$$Nest$fput_ownsTracingBackgroundImage(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0, boolean r1) {
            r0._ownsTracingBackgroundImage = r1
            return
    }

    /* renamed from: -$$Nest$fput_tracingBackgroundImage, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m799$$Nest$fput_tracingBackgroundImage(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0, com.badlogic.gdx.graphics.Texture r1) {
            r0._tracingBackgroundImage = r1
            return
    }

    public CreateToolsModule(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, com.badlogic.gdx.graphics.glutils.FrameBuffer r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 2
            r0._rememberedDrawTool = r1
            r1 = 0
            r0._userIsDoingSomethingBlankScrollPaneShowing = r1
            r2 = 0
            r0._stickfigureRememberedX = r2
            r0._stickfigureRememberedY = r2
            r0._drawTool = r1
            r0._fromScreenToReturnTo = r1
            r0._lastSelectedFrameTraceIndex = r1
            r0._ownsTracingBackgroundImage = r1
            r2 = 1056964608(0x3f000000, float:0.5)
            r0._backgroundImageTransparency = r2
            r0._backgroundImageOnTop = r1
            r0._calculatedScissors = r1
            r0._polyfillState = r1
            r0._callbackAndroidRequestStoragePermission = r1
            r0._promptState = r1
            r2 = 1
            r0.mPolynodeSelectionPrecisionIsQuick = r2
            r0.mPolynodeShowNumbers = r1
            r0.setNeedsToBeDrawn()
            r0.addWidgetClickListener()
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$1
            r1.<init>(r0)
            r0.addListener(r1)
            return
    }

    private void actuallyLoadBackground() {
            r3 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "about_to_set_creation_background_image"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$4 r0 = new org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$4
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r3, r1)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    private void actuallySaveStickfigure() {
            r3 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L2b
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureSaveAsDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureSaveAsDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r1, r3)
            r3._stickfigureSaveAsDialogRef = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3._createdStickfigure
            java.lang.String r1 = r1.getName()
            if (r1 == 0) goto L1e
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3._createdStickfigure
            java.lang.String r1 = r1.getName()
            goto L20
        L1e:
            java.lang.String r1 = ""
        L20:
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureSaveAsDialog r1 = r3._stickfigureSaveAsDialogRef
            r0.addDialogToStage(r1)
            goto L3c
        L2b:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "errorSavingStickfigureTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "errorSavingStickfigureInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
        L3c:
            return
    }

    private void stickfigureSavingComplete() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureBackupDialog r0 = r1._stickfigureBackupDialog
            if (r0 == 0) goto La
            r0.hideImmediately()
            r0 = 0
            r1._stickfigureBackupDialog = r0
        La:
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto La
            return
        La:
            super.act(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r3 = r2._currentActiveScrollPaneRef
            if (r3 == 0) goto L32
            boolean r3 = r3.isFlinging()
            if (r3 != 0) goto L2f
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r3 = r2._currentActiveScrollPaneRef
            boolean r3 = r3.isPanning()
            if (r3 != 0) goto L2f
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r3 = r2._currentActiveScrollPaneRef
            float r3 = r3.getVisualScrollY()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r2._currentActiveScrollPaneRef
            float r0 = r0.getScrollY()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L32
        L2f:
            r2.setNeedsToBeDrawn()
        L32:
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r2._currentWorkingPolyfillAnchorRef
            if (r3 == 0) goto L39
            r3.flagPolyfillAsDirty()
        L39:
            boolean r3 = org.fortheloss.sticknodes.App.BACK_KEY_PRESSED
            if (r3 == 0) goto Lba
            r3 = 0
            org.fortheloss.sticknodes.App.BACK_KEY_PRESSED = r3
            int r0 = r2._polyfillState
            if (r0 != r1) goto L49
            r2.removeLastPolynode()
            goto Lba
        L49:
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureOverwriteDialog r0 = r2._stickfigureSaveOverwriteDialogRef
            if (r0 == 0) goto L59
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L59
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureOverwriteDialog r3 = r2._stickfigureSaveOverwriteDialogRef
            r3.hideImmediately()
            goto Lba
        L59:
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureSaveAsDialog r0 = r2._stickfigureSaveAsDialogRef
            if (r0 == 0) goto L69
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L69
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureSaveAsDialog r3 = r2._stickfigureSaveAsDialogRef
            r3.hideImmediately()
            goto Lba
        L69:
            org.fortheloss.sticknodes.animationscreen.dialogs.AddStickfigureToLibraryDialog r0 = r2._stickfigureAddToLibraryDialogRef
            if (r0 == 0) goto L79
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L79
            org.fortheloss.sticknodes.animationscreen.dialogs.AddStickfigureToLibraryDialog r3 = r2._stickfigureAddToLibraryDialogRef
            r3.hideImmediately()
            goto Lba
        L79:
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog r0 = r2._traceStickfigureDialogRef
            if (r0 == 0) goto L89
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L89
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog r3 = r2._traceStickfigureDialogRef
            r3.hideImmediately()
            goto Lba
        L89:
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog r0 = r2._traceFrameDialogRef
            if (r0 == 0) goto L99
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L99
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog r3 = r2._traceFrameDialogRef
            r3.hideImmediately()
            goto Lba
        L99:
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0 = r2._modifyBranchDialog
            if (r0 == 0) goto La7
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto La7
            r2.hideModifyBranchDialog(r1)
            goto Lba
        La7:
            boolean r0 = r2._userIsDoingSomethingBlankScrollPaneShowing
            if (r0 == 0) goto Laf
            r2.cancelTestingSmartStretch(r3)
            goto Lba
        Laf:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            boolean r3 = r3.hasActiveDialogs()
            if (r3 != 0) goto Lba
            r2.cancelCreationMode()
        Lba:
            return
    }

    public void addCurrentNodeAsPolynode() {
            r3 = this;
            boolean r0 = r3.mPolynodeSelectionPrecisionIsQuick
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = r3._polyfillState
            if (r0 == 0) goto L27
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._currentWorkingPolyfillAnchorRef
            if (r0 != 0) goto Le
            goto L27
        Le:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r1 != 0) goto L19
            return
        L19:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3._canvasModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r3._currentWorkingPolyfillAnchorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r1.addNodeAsPolynode(r2, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r0 = r3._polyfillCreationToolTable
            r0.update()
        L27:
            return
    }

    public void addStickfigureToLibrary() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.AddStickfigureToLibraryDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.AddStickfigureToLibraryDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r1, r3)
            r3._stickfigureAddToLibraryDialogRef = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3._createdStickfigure
            java.lang.String r1 = r1.getName()
            if (r1 == 0) goto L18
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3._createdStickfigure
            java.lang.String r1 = r1.getName()
            goto L1a
        L18:
            java.lang.String r1 = ""
        L1a:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r3._createdStickfigure
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.AddStickfigureToLibraryDialog r1 = r3._stickfigureAddToLibraryDialogRef
            r0.addDialogToStage(r1)
            return
    }

    public void applyBranchModification(org.fortheloss.sticknodes.stickfigure.StickNode r2, int r3, java.lang.Object r4) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModuleRef
            r0.applyBranchModification(r2, r3, r4)
            return
    }

    public void backupStickfigure() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureBackupDialog r0 = r2._stickfigureBackupDialog
            if (r0 == 0) goto L5
            return
        L5:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._createdStickfigure
            if (r0 == 0) goto L33
            r1 = 1
            int r0 = r0.getNodeCount(r1)
            r1 = 10
            if (r0 >= r1) goto L13
            goto L33
        L13:
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureBackupDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureBackupDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            r2._stickfigureBackupDialog = r0
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureBackupDialog r1 = r2._stickfigureBackupDialog
            r0.addDialogToStage(r1)
            java.lang.Thread r0 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$7 r1 = new org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$7
            r1.<init>(r2)
            r0.<init>(r1)
            r0.start()
        L33:
            return
    }

    public void beginPolyfillEditing(org.fortheloss.sticknodes.stickfigure.StickNode r4) {
            r3 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "CreateToolsModule.beginPolyfillEditing()"
            r0.setCrashlyticsKeyString(r1, r2)
            int r0 = r3._polyfillState
            r1 = 1
            if (r0 == r1) goto L55
            r3._polyfillState = r1
            r3._currentWorkingPolyfillAnchorRef = r4
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3._createdStickfigure
            r0.flagDrawPolylineForPolyfillAnchor(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r4 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._polyfillCreationScrollPane
            if (r4 == r0) goto L36
            r3.removeActor(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r4 = r3._polyfillCreationScrollPane
            r3.addActor(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r4 = r3._polyfillCreationScrollPane
            r3._currentActiveScrollPaneRef = r4
            r4.updateAllToolTables()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r4 = r3._permanentCreationToolTable
            r4.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r4 = r3._jumpToolTable
            r4.update()
        L36:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModuleRef
            r0 = 0
            r4.enableQuickResizeTool(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r4 = r3._drawToolTable
            r4.disable()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r4 = r3._sideDrawToolTable
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.setColor(r1, r1, r1, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r4 = r3._sideDrawToolTable
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r0)
            r3.setNeedsToBeDrawn()
            return
        L55:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already editing a polyfill, can't edit another without finishing or canceling."
            r4.<init>(r0)
            throw r4
    }

    public void cancelCreationMode() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.CancelCreateDialog r0 = r2._cancelDialog
            if (r0 == 0) goto L17
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r0.getDialog()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.dialogs.CancelCreateDialog r0 = r2._cancelDialog
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r0.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 == 0) goto L17
            return
        L17:
            org.fortheloss.sticknodes.animationscreen.dialogs.CancelCreateDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.CancelCreateDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r2._cancelDialog = r0
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.CancelCreateDialog r1 = r2._cancelDialog
            r0.addDialogToStage(r1)
            return
    }

    public void cancelPolyfillEditing() {
            r3 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "CreateToolsModule.cancelPolyfillEditing()"
            r0.setCrashlyticsKeyString(r1, r2)
            int r0 = r3._polyfillState
            if (r0 == 0) goto L41
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._currentWorkingPolyfillAnchorRef
            r1 = 0
            r3._polyfillState = r1
            r1 = 0
            r3._currentWorkingPolyfillAnchorRef = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r3._animationScreenRef
            r2.setSessionSelectionToNode(r0)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3._createdStickfigure
            r0.flagDrawPolylineForPolyfillAnchor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r0.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r1 = 1
            r0.enableQuickResizeTool(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r0 = r3._drawToolTable
            r0.enable()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0 = r3._sideDrawToolTable
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r1, r1, r1, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0 = r3._sideDrawToolTable
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r0.setTouchable(r1)
            r3.setNeedsToBeDrawn()
            return
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not editing a polyfill, can't cancel."
            r0.<init>(r1)
            throw r0
    }

    public void cancelTestingSmartStretch(boolean r6) {
            r5 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            r1 = 0
            r0.blockUserActions(r1)
            r5.setDrawTool(r1)
            r5._userIsDoingSomethingBlankScrollPaneShowing = r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r5._createdStickfigure
            r0.setSmartStretchEnabled(r1)
            if (r6 != 0) goto L26
            org.fortheloss.sticknodes.data.useractions.BranchChangeAction r6 = r5._propertiesBeforeTestingSmartStretch
            r6.undo()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r5._createdStickfigure
            float r0 = r5._stickfigureRememberedX
            float r1 = r5._stickfigureRememberedY
            r6.setPosition(r0, r1)
            org.fortheloss.sticknodes.data.useractions.BranchChangeAction r6 = r5._propertiesBeforeTestingSmartStretch
            r6.dispose()
            goto L6a
        L26:
            org.fortheloss.sticknodes.data.SessionData r6 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction> r0 = org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction.class
            java.lang.Object r6 = r6.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction r6 = (org.fortheloss.sticknodes.data.useractions.StickfigureChangeAction) r6
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r5._createdStickfigure
            float r0 = r0.getX()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r5._createdStickfigure
            float r1 = r1.getY()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r5._createdStickfigure
            float r3 = r5._stickfigureRememberedX
            float r4 = r5._stickfigureRememberedY
            r2.setPosition(r3, r4)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r5._createdStickfigure
            r6.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r5._sessionDataRef
            r2.addUserAction(r6)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r6 = r5._createdStickfigure
            r6.setPosition(r0, r1)
            org.fortheloss.sticknodes.data.SessionData r6 = r5._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction> r0 = org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction.class
            java.lang.Object r6 = r6.getUserAction(r0)
            org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction r6 = (org.fortheloss.sticknodes.data.useractions.DoubleUndoRedoAction) r6
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            r0.addUserAction(r6)
            org.fortheloss.sticknodes.data.SessionData r6 = r5._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.BranchChangeAction r0 = r5._propertiesBeforeTestingSmartStretch
            r6.addUserAction(r0)
        L6a:
            r6 = 0
            r5._propertiesBeforeTestingSmartStretch = r6
            r5.onSessionSelectionChange()
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r5._stickfigureRememberedSelectedNode
            if (r6 == 0) goto L79
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            r0.setSessionSelectionToNode(r6)
        L79:
            org.fortheloss.sticknodes.data.SessionData r6 = r5._sessionDataRef
            boolean r6 = r6.getQuickMenuIsEnabled()
            if (r6 == 0) goto L86
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5._canvasModuleRef
            r6.showQuickMenu()
        L86:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r6 = r5._permanentCreationToolTable
            r6.enable()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r6 = r5._drawToolTable
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r6.setTouchable(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r6 = r5._drawToolTable
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.setColor(r1, r1, r1, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r6 = r5._sideDrawToolTable
            r6.setTouchable(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r6 = r5._sideDrawToolTable
            r6.setColor(r1, r1, r1, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r6 = r5._jumpToolTable
            r6.setTouchable(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r6 = r5._jumpToolTable
            r6.setColor(r1, r1, r1, r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            r6.showQuickResizeTool(r0)
            r5.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5._canvasModuleRef
            r6.setNeedsToBeDrawn()
            return
    }

    public void centerStickfigure() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r0.centerFigure(r1)
            return
    }

    public void changeScreenFromCreationMode() {
            r4 = this;
            r0 = 0
            r4._drawTool = r0
            com.badlogic.gdx.graphics.Color r1 = r4._backgroundColor
            com.badlogic.gdx.graphics.Color r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDefaultStageBGColor()
            r1.set(r2)
            r1 = 1056964608(0x3f000000, float:0.5)
            r4._backgroundImageTransparency = r1
            r4._backgroundImageOnTop = r0
            r4._polyfillState = r0
            r1 = 0
            r4._currentWorkingPolyfillAnchorRef = r1
            r4.clearBackgroundImage()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r4._createdFigureArray
            r2.clear()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r4._createdStickfigure
            r2.dispose()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r4._animationScreenRef
            r2.setDrawOnlyMainNodes(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r4._animationScreenRef
            r2.setShowCreationDrawOrder(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r4._animationScreenRef
            r3 = 1
            r2.setShowCreationStaticNodes(r3)
            int r2 = r4._fromScreenToReturnTo
            if (r2 != 0) goto L3e
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r4._animationScreenRef
            r1.setToAnimateScreen(r3, r0)
            goto L44
        L3e:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r4._animationScreenRef
            r3 = -1
            r2.setToMovieclipScreen(r1, r3, r0)
        L44:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.ICreationBasedModule
    public void clearBackgroundImage() {
            r3 = this;
            com.badlogic.gdx.graphics.Texture r0 = r3._tracingBackgroundImage
            r1 = 0
            if (r0 == 0) goto Le
            boolean r2 = r3._ownsTracingBackgroundImage
            if (r2 == 0) goto Lc
            r0.dispose()
        Lc:
            r3._tracingBackgroundImage = r1
        Le:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r0.setTracingStickfigure(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r0.setTracingFrameData(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r0.updateBackgroundImage(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r0 = r3._creationModeToolTable
            r0.update()
            return
    }

    public void copySegment(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L27
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L27
        L15:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.copySegment(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r3 = r2._specialSegmentToolTable
            r3.update()
        L27:
            return
    }

    public void deleteOneSegment() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L23
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L23
        L15:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r2 = 0
            r0.deleteSegment(r1, r2)
        L23:
            return
    }

    public void deletePolyfill() {
            r3 = this;
            int r0 = r3._polyfillState
            if (r0 == 0) goto L32
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._currentWorkingPolyfillAnchorRef
            if (r0 != 0) goto L9
            goto L32
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction r0 = (org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction) r0
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._currentWorkingPolyfillAnchorRef
            r2 = 1
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            r1.addUserAction(r0)
            r0 = 0
            r3.setDrawTool(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._currentWorkingPolyfillAnchorRef
            r0.deletePolyAnchor()
            r3.cancelPolyfillEditing()
            r3.updateNodeCount()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r0.setNeedsToBeDrawn()
        L32:
            return
    }

    public void deleteSegmentAndChildren() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L26
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L26
        L15:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r2 = 1
            r0.deleteSegment(r1, r2)
            r3.updateRelativeAngleLocks()
        L26:
            return
    }

    public void determineBeginOrEditPolyfill() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 != 0) goto Lb
            return
        Lb:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            boolean r1 = r0.isPolyfillAnchor()
            if (r1 == 0) goto L1d
            r3.editPolyfillClick()
            goto L3a
        L1d:
            r0.convertToPolyAnchor()
            r1 = 8
            r3.setDrawTool(r1)
            r3.beginPolyfillEditing(r0)
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillConvertAnchorAction> r2 = org.fortheloss.sticknodes.data.useractions.PolyfillConvertAnchorAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.PolyfillConvertAnchorAction r1 = (org.fortheloss.sticknodes.data.useractions.PolyfillConvertAnchorAction) r1
            r1.initialize(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            r0.addUserAction(r1)
        L3a:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r0.onSessionSelectionChange()
            r3.updateNodeCount()
            return
    }

    public void disableAll(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L8
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            goto Ld
        L8:
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r0.setTouchable(r1)
        Ld:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.Module, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._assetsRef = r0
            r3._projectDataRef = r0
            r3._sessionDataRef = r0
            r3._animationMenuAtlasRef = r0
            r3._colorPickerAtlasRef = r0
            r3._canvasModuleRef = r0
            r3._createdStickfigure = r0
            r3._createdFigureArray = r0
            r3._backgroundColor = r0
            com.badlogic.gdx.graphics.Texture r1 = r3._tracingBackgroundImage
            if (r1 == 0) goto L20
            boolean r2 = r3._ownsTracingBackgroundImage
            if (r2 == 0) goto L1e
            r1.dispose()
        L1e:
            r3._tracingBackgroundImage = r0
        L20:
            r3._backgroundTR = r0
            r3._stickfigureSaveOverwriteDialogRef = r0
            r3._stickfigureSaveAsDialogRef = r0
            r3._stickfigureAddToLibraryDialogRef = r0
            r3._traceStickfigureDialogRef = r0
            r3._traceFrameDialogRef = r0
            r3._cancelDialog = r0
            r3._modifyBranchDialog = r0
            r3._stickfigureBackupDialog = r0
            org.fortheloss.sticknodes.data.useractions.BranchChangeAction r1 = r3._propertiesBeforeTestingSmartStretch
            if (r1 == 0) goto L3b
            r1.dispose()
            r3._propertiesBeforeTestingSmartStretch = r0
        L3b:
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r1 = r3._waitForLoadedImageDialog
            if (r1 == 0) goto L50
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r1 = r1.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            if (r1 == 0) goto L4e
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r1 = r3._waitForLoadedImageDialog
            r1.hideImmediately()
        L4e:
            r3._waitForLoadedImageDialog = r0
        L50:
            r3._currentActiveScrollPaneRef = r0
            r3._topTable = r0
            r3._defaultScrollPane = r0
            r3._stickfigureScrollPane = r0
            r3._polyfillCreationScrollPane = r0
            r3._connectorScrollPane = r0
            r3._userDoingSomethingScrollPane = r0
            r3._userChooseStickfigureScrollPane = r0
            r3._drawToolTable = r0
            r3._sideDrawToolTable = r0
            r3._permanentCreationToolTable = r0
            r3._jumpToolTable = r0
            r3._creationModeToolTable = r0
            r3._shapeToolTable = r0
            r3._stickfigureCreationToolTable = r0
            r3._segmentCreationToolTable = r0
            r3._specialSegmentToolTable = r0
            r3._polyfillCreationToolTable = r0
            r3._connectorToolTable = r0
            r3._userDoingSomethingBlankToolTable = r0
            r3._userChooseStickfigureToolTable = r0
            r3._stickfigureRememberedSelectedNode = r0
            r3._currentWorkingPolyfillAnchorRef = r0
            r3._currentWorkingConnectorAnchorRef = r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r1 = r3._toolTables
            if (r1 == 0) goto L9c
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L8a:
            if (r1 < 0) goto L9a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r2 = r3._toolTables
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r2 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L8a
        L9a:
            r3._toolTables = r0
        L9c:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r1 = r3._scrollPanes
            if (r1 == 0) goto Lb8
            int r1 = r1.size()
            int r1 = r1 + (-1)
        La6:
            if (r1 < 0) goto Lb6
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r2 = r3._scrollPanes
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto La6
        Lb6:
            r3._scrollPanes = r0
        Lb8:
            r3._scissorBounds1 = r0
            r3._scissorTopTableBounds = r0
            r3._scissorPermanentToolsBounds = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r18, float r19) {
            r17 = this;
            r0 = r17
            boolean r1 = r0._needsToBeDrawn
            if (r1 == 0) goto L1b9
            r1 = 0
            r0._needsToBeDrawn = r1
            boolean r2 = r0._calculatedScissors
            r3 = 1
            if (r2 != 0) goto Lff
            com.badlogic.gdx.math.Rectangle r2 = new com.badlogic.gdx.math.Rectangle
            r2.<init>()
            r0._scissorBounds1 = r2
            com.badlogic.gdx.math.Rectangle r2 = new com.badlogic.gdx.math.Rectangle
            r2.<init>()
            r0._scissorTopTableBounds = r2
            com.badlogic.gdx.math.Rectangle r2 = new com.badlogic.gdx.math.Rectangle
            r2.<init>()
            r0._scissorPermanentToolsBounds = r2
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r17.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r2 = r2.getViewport()
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r17.getStage()
            com.badlogic.gdx.graphics.Camera r5 = r4.getCamera()
            int r4 = r2.getScreenX()
            float r6 = (float) r4
            int r4 = r2.getScreenY()
            float r7 = (float) r4
            int r4 = r2.getScreenWidth()
            float r8 = (float) r4
            int r4 = r2.getScreenHeight()
            float r9 = (float) r4
            com.badlogic.gdx.math.Matrix4 r10 = r18.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r11 = new com.badlogic.gdx.math.Rectangle
            float r4 = r17.getX()
            float r12 = r17.getY()
            float r13 = r17.getWidth()
            float r14 = r17.getHeight()
            r11.<init>(r4, r12, r13, r14)
            com.badlogic.gdx.math.Rectangle r12 = r0._scissorBounds1
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r5, r6, r7, r8, r9, r10, r11, r12)
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r17.getStage()
            com.badlogic.gdx.graphics.Camera r5 = r4.getCamera()
            int r4 = r2.getScreenX()
            float r6 = (float) r4
            int r4 = r2.getScreenY()
            float r7 = (float) r4
            int r4 = r2.getScreenWidth()
            float r8 = (float) r4
            int r4 = r2.getScreenHeight()
            float r9 = (float) r4
            com.badlogic.gdx.math.Matrix4 r10 = r18.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r11 = new com.badlogic.gdx.math.Rectangle
            float r4 = r17.getX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r12 = r0._topTable
            float r12 = r12.getX()
            float r4 = r4 + r12
            float r12 = r17.getY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r0._topTable
            float r13 = r13.getY()
            float r12 = r12 + r13
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = r0._topTable
            float r13 = r13.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r0._topTable
            float r14 = r14.getHeight()
            r11.<init>(r4, r12, r13, r14)
            com.badlogic.gdx.math.Rectangle r12 = r0._scissorTopTableBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r5, r6, r7, r8, r9, r10, r11, r12)
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r17.getStage()
            com.badlogic.gdx.graphics.Camera r5 = r4.getCamera()
            int r4 = r2.getScreenX()
            float r6 = (float) r4
            int r4 = r2.getScreenY()
            float r7 = (float) r4
            int r4 = r2.getScreenWidth()
            float r8 = (float) r4
            int r2 = r2.getScreenHeight()
            float r9 = (float) r2
            com.badlogic.gdx.math.Matrix4 r10 = r18.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r11 = new com.badlogic.gdx.math.Rectangle
            float r2 = r17.getX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r4 = r0._permanentCreationToolTable
            float r4 = r4.getX()
            float r2 = r2 + r4
            float r4 = r17.getY()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r12 = r0._permanentCreationToolTable
            float r12 = r12.getY()
            float r4 = r4 + r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r12 = r0._permanentCreationToolTable
            float r12 = r12.getWidth()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r13 = r0._permanentCreationToolTable
            float r13 = r13.getHeight()
            r11.<init>(r2, r4, r12, r13)
            com.badlogic.gdx.math.Rectangle r12 = r0._scissorPermanentToolsBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r5, r6, r7, r8, r9, r10, r11, r12)
            r0._calculatedScissors = r3
        Lff:
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fboRef
            r2.bind()
            r18.flush()
            com.badlogic.gdx.math.Rectangle r2 = r0._scissorBounds1
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r0._currentActiveScrollPaneRef
            r2.setVisible(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._topTable
            r2.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r2 = r0._permanentCreationToolTable
            r2.setVisible(r1)
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.glClearColor(r4, r4, r4, r4)
            com.badlogic.gdx.graphics.GL20 r2 = com.badlogic.gdx.Gdx.gl
            r5 = 16384(0x4000, float:2.2959E-41)
            r2.glClear(r5)
            r2 = r18
            r2.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.graphics.g2d.TextureRegion r7 = r0._backgroundTR
            float r6 = r17.getX()
            float r8 = r17.getWidth()
            float r8 = r8 + r6
            float r9 = r17.getY()
            r10 = 0
            r11 = 0
            float r12 = r17.getHeight()
            float r13 = r17.getWidth()
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 1119092736(0x42b40000, float:90.0)
            r6 = r18
            r6.draw(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            super.draw(r18, r19)
            r18.flush()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
            com.badlogic.gdx.math.Rectangle r6 = r0._scissorTopTableBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r6)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r6 = r0._currentActiveScrollPaneRef
            r6.setVisible(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0._topTable
            r6.setVisible(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r6 = r0._permanentCreationToolTable
            r6.setVisible(r1)
            com.badlogic.gdx.graphics.GL20 r6 = com.badlogic.gdx.Gdx.gl
            r6.glClearColor(r4, r4, r4, r4)
            com.badlogic.gdx.graphics.GL20 r6 = com.badlogic.gdx.Gdx.gl
            r6.glClear(r5)
            super.draw(r18, r19)
            r18.flush()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
            com.badlogic.gdx.math.Rectangle r6 = r0._scissorPermanentToolsBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r6)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r6 = r0._currentActiveScrollPaneRef
            r6.setVisible(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = r0._topTable
            r6.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r1 = r0._permanentCreationToolTable
            r1.setVisible(r3)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glClearColor(r4, r4, r4, r4)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glClear(r5)
            super.draw(r18, r19)
            r18.flush()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r0._currentActiveScrollPaneRef
            r1.setVisible(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0._topTable
            r1.setVisible(r3)
        L1b9:
            return
    }

    public void drawNodesOnTracedFbo(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModuleRef
            r0.setDrawNodesOnTracedFbo(r2)
            return
    }

    public void editPolyfillClick() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L41
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            boolean r0 = r0.isPolyfillAnchor()
            if (r0 != 0) goto L17
            goto L41
        L17:
            r0 = 8
            r2.setDrawTool(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r2.beginPolyfillEditing(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillEditAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillEditAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.PolyfillEditAction r0 = (org.fortheloss.sticknodes.data.useractions.PolyfillEditAction) r0
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
        L41:
            return
    }

    public void endPolyfill() {
            r4 = this;
            int r0 = r4._polyfillState
            if (r0 == 0) goto L63
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4._currentWorkingPolyfillAnchorRef
            if (r0 != 0) goto L9
            goto L63
        L9:
            r0 = 0
            r4.setDrawTool(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4._currentWorkingPolyfillAnchorRef
            int r0 = r0.getPolynodeChildrenCount()
            r1 = 1
            if (r0 >= r1) goto L44
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            java.lang.String r2 = "polyfillError1Title"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "polyfillError1InfoNew"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.showErrorDialog(r2, r3)
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction> r2 = org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction.class
            java.lang.Object r0 = r0.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction r0 = (org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction) r0
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r4._currentWorkingPolyfillAnchorRef
            r0.initialize(r2, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4._currentWorkingPolyfillAnchorRef
            r0.deletePolyAnchor()
            r4.cancelPolyfillEditing()
            goto L5b
        L44:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillFinishAction> r1 = org.fortheloss.sticknodes.data.useractions.PolyfillFinishAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.PolyfillFinishAction r0 = (org.fortheloss.sticknodes.data.useractions.PolyfillFinishAction) r0
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r4._currentWorkingPolyfillAnchorRef
            r0.initialize(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            r1.addUserAction(r0)
            r4.finishPolyfillEditing()
        L5b:
            r4.updateNodeCount()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            r0.setNeedsToBeDrawn()
        L63:
            return
    }

    public void finishPolyfillEditing() {
            r3 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "CreateToolsModule.finishPolyfillEditing()"
            r0.setCrashlyticsKeyString(r1, r2)
            int r0 = r3._polyfillState
            if (r0 == 0) goto L3f
            r0 = 0
            r3._polyfillState = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._currentWorkingPolyfillAnchorRef
            r0.setSessionSelectionToNode(r1)
            r0 = 0
            r3._currentWorkingPolyfillAnchorRef = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3._createdStickfigure
            r1.flagDrawPolylineForPolyfillAnchor(r0)
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r1 = 1
            r0.enableQuickResizeTool(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r0 = r3._drawToolTable
            r0.enable()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0 = r3._sideDrawToolTable
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r1, r1, r1, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0 = r3._sideDrawToolTable
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r0.setTouchable(r1)
            r3.setNeedsToBeDrawn()
            return
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not editing a polyfill, can't finish."
            r0.<init>(r1)
            throw r0
    }

    public void flipSegmentX() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L32
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L32
        L15:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3._canvasModuleRef
            r2 = 0
            r1.flipSegmentX(r0, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r0 = r3._segmentCreationToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0 = r3._shapeToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0 = r3._connectorToolTable
            r0.update()
        L32:
            return
    }

    public void flipSegmentY() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L32
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L32
        L15:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3._canvasModuleRef
            r2 = 0
            r1.flipSegmentY(r0, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r0 = r3._segmentCreationToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0 = r3._shapeToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0 = r3._connectorToolTable
            r0.update()
        L32:
            return
    }

    public void flipStickfigureX() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r2 = 0
            r0.flipFigureX(r1, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable r0 = r3._stickfigureCreationToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r0 = r3._segmentCreationToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0 = r3._shapeToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0 = r3._connectorToolTable
            r0.update()
            return
    }

    public void flipStickfigureY() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r2 = 0
            r0.flipFigureY(r1, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable r0 = r3._stickfigureCreationToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r0 = r3._segmentCreationToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0 = r3._shapeToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0 = r3._connectorToolTable
            r0.update()
            return
    }

    public com.badlogic.gdx.graphics.Color getBackgroundColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._backgroundColor
            return r0
    }

    public boolean getBackgroundImageOnTop() {
            r1 = this;
            boolean r0 = r1._backgroundImageOnTop
            return r0
    }

    public float getBackgroundImageTransparency() {
            r1 = this;
            float r0 = r1._backgroundImageTransparency
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getCurrentWorkingConnectorAnchor() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._currentWorkingConnectorAnchorRef
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getCurrentWorkingPolyfillAnchor() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._currentWorkingPolyfillAnchorRef
            return r0
    }

    public int getDrawTool() {
            r1 = this;
            int r0 = r1._drawTool
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> getFigureArray() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._createdFigureArray
            return r0
    }

    public int getLastSelectedFrameIndexToTrace() {
            r1 = this;
            int r0 = r1._lastSelectedFrameTraceIndex
            return r0
    }

    public int getPolyfillState() {
            r1 = this;
            int r0 = r1._polyfillState
            return r0
    }

    public boolean getPolynodeIsShowingNumbers() {
            r1 = this;
            boolean r0 = r1.mPolynodeShowNumbers
            return r0
    }

    public boolean getPolynodeSelectionPrecisionIsQuick() {
            r1 = this;
            boolean r0 = r1.mPolynodeSelectionPrecisionIsQuick
            return r0
    }

    public com.badlogic.gdx.graphics.glutils.FrameBuffer getScreenFBO() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r0.getScreenFBO()
            return r0
    }

    public boolean hasBackgroundImage() {
            r1 = this;
            com.badlogic.gdx.graphics.Texture r0 = r1._tracingBackgroundImage
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void hideModifyBranchDialog(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0 = r2._modifyBranchDialog
            if (r0 == 0) goto L24
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getBranch()
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r1 = r2._modifyBranchDialog
            r1.hideImmediately()
            r1 = 0
            r2._modifyBranchDialog = r1
            if (r3 == 0) goto L24
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogHiddenAction> r1 = org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogHiddenAction.class
            java.lang.Object r3 = r3.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogHiddenAction r3 = (org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogHiddenAction) r3
            r3.initialize(r2, r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            r0.addUserAction(r3)
        L24:
            return
    }

    public void initialize(org.fortheloss.framework.Assets r9, float r10) {
            r8 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            super.initialize(r9)
            r8._assetsRef = r9
            java.lang.String r1 = org.fortheloss.sticknodes.App.animationMenuAtlas
            r2 = 1
            java.lang.Object r1 = r9.get(r1, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            r8._animationMenuAtlasRef = r1
            java.lang.String r1 = org.fortheloss.sticknodes.App.drawToolsAtlas
            java.lang.Object r1 = r9.get(r1, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r3 = org.fortheloss.sticknodes.App.colorPickerAtlas
            java.lang.Object r9 = r9.get(r3, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r9 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r9
            r8._colorPickerAtlasRef = r9
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r8._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r9 = r9.getProjectData()
            r8._projectDataRef = r9
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r8._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r9 = r9.getSessionData()
            r8._sessionDataRef = r9
            boolean r9 = r9.getIsLeftHandMode()
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            com.badlogic.gdx.graphics.Color r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDefaultStageBGColor()
            r0.<init>(r3)
            r8._backgroundColor = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8._createdFigureArray = r0
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = r8._animationMenuAtlasRef
            java.lang.String r3 = "square"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r0 = r0.findRegion(r3)
            r8._backgroundTR = r0
            r0 = 1135345664(0x43ac0000, float:344.0)
            r3 = 1139277824(0x43e80000, float:464.0)
            if (r9 != 0) goto L6a
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r8.getStage()
            float r3 = r3.getHeight()
            r8.setSize(r4, r3)
            goto L7e
        L6a:
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            com.badlogic.gdx.scenes.scene2d.Stage r3 = r8.getStage()
            float r3 = r3.getHeight()
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r0
            float r3 = r3 - r5
            r8.setSize(r4, r3)
        L7e:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTableGrayBackground()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r8._scrollPanes = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r8._toolTables = r4
            float r4 = r8.getX()
            float r5 = r8.getWidth()
            float r4 = r4 + r5
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r6 = 1098907648(0x41800000, float:16.0)
            float r5 = r5 * r6
            float r4 = r4 + r5
            if (r9 == 0) goto Lba
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r8.getStage()
            float r4 = r4.getWidth()
            float r5 = r8.getWidth()
            float r4 = r4 - r5
            float r4 = -r4
            float r5 = r8.getWidth()
            float r4 = r4 + r5
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r6
            float r4 = r4 + r5
        Lba:
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r5.<init>()
            r8._topTable = r5
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWhiteBackground()
            r5.setBackground(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r8._topTable
            r6 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r5.pad(r6)
            r7 = 2
            r5.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r8._topTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.space(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.pad(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.expandY()
            r5.fillY()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r8._topTable
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r0
            r5.setSize(r10, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r8._topTable
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r8.getStage()
            float r0 = r0.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r8._topTable
            float r5 = r5.getHeight()
            float r0 = r0 - r5
            r10.setPosition(r4, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r8._topTable
            r8.addActor(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r10 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable
            org.fortheloss.sticknodes.data.ProjectData r0 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r4 = r8._sessionDataRef
            r10.<init>(r8, r0, r4)
            r8._drawToolTable = r10
            r10.initialize(r1, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r10 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r0 = r8._drawToolTable
            r10.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r8._topTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r0 = r8._drawToolTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.expandX()
            r10.fillX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r10 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r8._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r1 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r4 = r8._sessionDataRef
            r10.<init>(r0, r8, r1, r4)
            r8._sideDrawToolTable = r10
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = r8._animationMenuAtlasRef
            r10.initialize(r0, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r10 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0 = r8._sideDrawToolTable
            r10.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r8._topTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0 = r8._sideDrawToolTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.add(r0)
            float r0 = r8.getWidth()
            r10.width(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r10 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable
            org.fortheloss.sticknodes.data.ProjectData r0 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r1 = r8._sessionDataRef
            r10.<init>(r8, r0, r1)
            r8._permanentCreationToolTable = r10
            com.badlogic.gdx.graphics.g2d.TextureAtlas r0 = r8._animationMenuAtlasRef
            r10.initialize(r0, r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r10 = r8._permanentCreationToolTable
            float r0 = r8.getWidth()
            r10.setWidth(r0)
            if (r9 != 0) goto L186
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r10 = r8._permanentCreationToolTable
            float r0 = r8.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r1 = r8._permanentCreationToolTable
            float r1 = r1.getHeight()
            float r0 = r0 - r1
            r10.setPosition(r6, r0)
            goto L1a8
        L186:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r10 = r8._permanentCreationToolTable
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r8.getStage()
            float r0 = r0.getWidth()
            float r1 = r8.getWidth()
            float r0 = r0 - r1
            float r0 = -r0
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r8.getStage()
            float r1 = r1.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r4 = r8._permanentCreationToolTable
            float r4 = r4.getHeight()
            float r1 = r1 - r4
            r10.setPosition(r0, r1)
        L1a8:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r10 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r0 = r8._permanentCreationToolTable
            r10.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r10 = r8._permanentCreationToolTable
            r8.addActor(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r10 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r8._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r1 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r4 = r8._sessionDataRef
            r10.<init>(r0, r8, r1, r4)
            r8._jumpToolTable = r10
            r10.initialize(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r10 = r8._jumpToolTable
            float r0 = r8.getWidth()
            r10.setWidth(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r10 = r8._jumpToolTable
            r10.setPosition(r6, r6)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r10 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r8._jumpToolTable
            r10.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r10 = r8._jumpToolTable
            r8.addActor(r10)
            r10 = 1109393408(0x42200000, float:40.0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r10
            int r10 = (int) r0
            float r0 = r8.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r1 = r8._permanentCreationToolTable
            float r1 = r1.getHeight()
            float r0 = r0 - r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r1 = r8._jumpToolTable
            float r1 = r1.getHeight()
            float r0 = r0 - r1
            float r1 = (float) r10
            r4 = 1069547520(0x3fc00000, float:1.5)
            float r4 = r4 * r1
            float r0 = r0 - r4
            if (r9 == 0) goto L20c
            float r9 = r8.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r8._jumpToolTable
            float r0 = r0.getHeight()
            float r9 = r9 - r0
            float r0 = r9 - r1
        L20c:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r4 = r8.getWidth()
            r9.<init>(r10, r4)
            r8._defaultScrollPane = r9
            float r4 = r8.getWidth()
            r9.setSize(r4, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._defaultScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r4 = r8._jumpToolTable
            float r4 = r4.getHeight()
            r5 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r5
            float r4 = r4 + r1
            int r4 = (int) r4
            float r4 = (float) r4
            r9.setPosition(r6, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r9 = r8._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r4 = r8._defaultScrollPane
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r8._canvasModuleRef
            org.fortheloss.sticknodes.data.ProjectData r5 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r7 = r8._sessionDataRef
            r9.<init>(r8, r4, r5, r7)
            r8._creationModeToolTable = r9
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = r8._animationMenuAtlasRef
            com.badlogic.gdx.graphics.g2d.TextureAtlas r5 = r8._colorPickerAtlasRef
            r9.initialize(r4, r5, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r9 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r4 = r8._creationModeToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._defaultScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r4 = r8._creationModeToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$2 r9 = new org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$2
            float r4 = r8.getWidth()
            r9.<init>(r8, r10, r4)
            r8._stickfigureScrollPane = r9
            float r4 = r8.getWidth()
            r9.setSize(r4, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r4 = r8._jumpToolTable
            float r4 = r4.getHeight()
            float r4 = r4 + r1
            int r4 = (int) r4
            float r4 = (float) r4
            r9.setPosition(r6, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r9 = r8._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r4 = r8._stickfigureScrollPane
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable
            org.fortheloss.sticknodes.data.ProjectData r4 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r5 = r8._sessionDataRef
            r9.<init>(r8, r4, r5)
            r8._shapeToolTable = r9
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = r8._animationMenuAtlasRef
            com.badlogic.gdx.graphics.g2d.TextureAtlas r5 = r8._colorPickerAtlasRef
            r9.initialize(r4, r5, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r9 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r4 = r8._shapeToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r4 = r8._shapeToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._stickfigureScrollPane
            r9.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable
            org.fortheloss.sticknodes.data.ProjectData r4 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r5 = r8._sessionDataRef
            r9.<init>(r8, r4, r5)
            r8._stickfigureCreationToolTable = r9
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = r8._animationMenuAtlasRef
            com.badlogic.gdx.graphics.g2d.TextureAtlas r5 = r8._colorPickerAtlasRef
            r9.initialize(r4, r5, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r9 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable r4 = r8._stickfigureCreationToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable r4 = r8._stickfigureCreationToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._stickfigureScrollPane
            r9.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable
            org.fortheloss.sticknodes.data.ProjectData r4 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r5 = r8._sessionDataRef
            r9.<init>(r8, r4, r5)
            r8._segmentCreationToolTable = r9
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = r8._animationMenuAtlasRef
            com.badlogic.gdx.graphics.g2d.TextureAtlas r5 = r8._colorPickerAtlasRef
            r9.initialize(r4, r5, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r9 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r4 = r8._segmentCreationToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r4 = r8._segmentCreationToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._stickfigureScrollPane
            r9.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable
            org.fortheloss.sticknodes.data.ProjectData r4 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r5 = r8._sessionDataRef
            r9.<init>(r8, r4, r5)
            r8._specialSegmentToolTable = r9
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = r8._animationMenuAtlasRef
            r9.initialize(r4, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r9 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r4 = r8._specialSegmentToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r4 = r8._specialSegmentToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._stickfigureScrollPane
            r9.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r4 = r8.getWidth()
            r9.<init>(r10, r4)
            r8._polyfillCreationScrollPane = r9
            float r4 = r8.getWidth()
            r9.setSize(r4, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._polyfillCreationScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r4 = r8._jumpToolTable
            float r4 = r4.getHeight()
            float r4 = r4 + r1
            int r4 = (int) r4
            float r4 = (float) r4
            r9.setPosition(r6, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r9 = r8._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r4 = r8._polyfillCreationScrollPane
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable
            org.fortheloss.sticknodes.data.ProjectData r4 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r5 = r8._sessionDataRef
            r9.<init>(r8, r4, r5)
            r8._polyfillCreationToolTable = r9
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = r8._animationMenuAtlasRef
            com.badlogic.gdx.graphics.g2d.TextureAtlas r5 = r8._colorPickerAtlasRef
            r9.initialize(r4, r5, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r9 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r4 = r8._polyfillCreationToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._polyfillCreationScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r4 = r8._polyfillCreationToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$3 r9 = new org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$3
            float r4 = r8.getWidth()
            r9.<init>(r8, r10, r4)
            r8._connectorScrollPane = r9
            float r4 = r8.getWidth()
            r9.setSize(r4, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._connectorScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r4 = r8._jumpToolTable
            float r4 = r4.getHeight()
            float r4 = r4 + r1
            int r4 = (int) r4
            float r4 = (float) r4
            r9.setPosition(r6, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r9 = r8._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r4 = r8._connectorScrollPane
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable
            org.fortheloss.sticknodes.data.ProjectData r4 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r5 = r8._sessionDataRef
            r9.<init>(r8, r4, r5)
            r8._connectorToolTable = r9
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = r8._animationMenuAtlasRef
            com.badlogic.gdx.graphics.g2d.TextureAtlas r5 = r8._colorPickerAtlasRef
            r9.initialize(r4, r5, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r9 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r4 = r8._connectorToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._connectorScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r4 = r8._connectorToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r4 = r8.getWidth()
            r9.<init>(r10, r4)
            r8._userChooseStickfigureScrollPane = r9
            float r4 = r8.getWidth()
            r9.setSize(r4, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._userChooseStickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r4 = r8._jumpToolTable
            float r4 = r4.getHeight()
            float r4 = r4 + r1
            int r4 = (int) r4
            float r4 = (float) r4
            r9.setPosition(r6, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r9 = r8._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r4 = r8._userChooseStickfigureScrollPane
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable
            org.fortheloss.sticknodes.data.ProjectData r4 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r5 = r8._sessionDataRef
            r9.<init>(r8, r4, r5)
            r8._userChooseStickfigureToolTable = r9
            r9.initialize(r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r9 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r4 = r8._userChooseStickfigureToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._userChooseStickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r4 = r8._userChooseStickfigureToolTable
            r9.add(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r4 = r8.getWidth()
            r9.<init>(r10, r4)
            r8._userDoingSomethingScrollPane = r9
            float r10 = r8.getWidth()
            r9.setSize(r10, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._userDoingSomethingScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r10 = r8._jumpToolTable
            float r10 = r10.getHeight()
            float r10 = r10 + r1
            int r10 = (int) r10
            float r10 = (float) r10
            r9.setPosition(r6, r10)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r9 = r8._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r10 = r8._userDoingSomethingScrollPane
            r9.add(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable
            org.fortheloss.sticknodes.data.ProjectData r10 = r8._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionDataRef
            r9.<init>(r8, r10, r0)
            r8._userDoingSomethingBlankToolTable = r9
            r9.initialize(r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r9 = r8._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable r10 = r8._userDoingSomethingBlankToolTable
            r9.add(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._userDoingSomethingScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable r10 = r8._userDoingSomethingBlankToolTable
            r9.add(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r8._defaultScrollPane
            r8._currentActiveScrollPaneRef = r9
            r8.addActor(r9)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r9 = r8._toolTables
            int r9 = r9.size()
            int r9 = r9 - r2
        L434:
            if (r9 < 0) goto L444
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r10 = r8._toolTables
            java.lang.Object r10 = r10.get(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r10 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable) r10
            r10.update()
            int r9 = r9 + (-1)
            goto L434
        L444:
            return
    }

    public boolean isPreserveVisualAngleChecked(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L9
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r1 = r0._connectorToolTable
            boolean r1 = r1.isPreserveVisualAngleChecked()
            goto Lf
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r1 = r0._specialSegmentToolTable
            boolean r1 = r1.isPreserveVisualAngleChecked()
        Lf:
            return r1
    }

    public void jumpToNextSubmenu(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r1._currentActiveScrollPaneRef
            r0.jumpToNextSubmenu(r2)
            return
    }

    public void jumpToSubmenu(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r1._currentActiveScrollPaneRef
            r0.jumpToSubmenuIndex(r2)
            return
    }

    public void loadBackground() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallyLoadBackground()
            goto L1e
        Lc:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            r0 = 1
            r2._callbackAndroidRequestStoragePermission = r0
        L1e:
            return
    }

    public void modifyBranch() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r2.showModifyBranchDialog(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogShownAction> r1 = org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogShownAction.class
            java.lang.Object r0 = r0.getUserAction(r1)
            org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogShownAction r0 = (org.fortheloss.sticknodes.data.useractions.ModifyBranchDialogShownAction) r0
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.initialize(r2, r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            r1.addUserAction(r0)
            return
    }

    public void onSessionModeChange() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto La
            return
        La:
            boolean r0 = r2._userIsDoingSomethingBlankScrollPaneShowing
            if (r0 == 0) goto Lf
            return
        Lf:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._currentWorkingConnectorAnchorRef
            if (r0 == 0) goto L14
            return
        L14:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r2._currentActiveScrollPaneRef
            r0.updateAllToolTables()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r0 = r2._permanentCreationToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r2._jumpToolTable
            r0.update()
            return
    }

    public void onSessionScreenChange() {
            r5 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L69
            r5.setVisible(r1)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r5.setTouchable(r0)
            r5.setNeedsToBeDrawn()
            r5._lastSelectedFrameTraceIndex = r2
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r5._canvasModuleRef
            r3 = 0
            r0.updateBackgroundImage(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r5._jumpToolTable
            r0.update()
            r5.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r0 = r5._drawToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0 = r5._sideDrawToolTable
            r0.update()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r5._scrollPanes
            int r0 = r0.size()
            int r0 = r0 - r1
        L36:
            if (r0 < 0) goto L52
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r3 = r5._scrollPanes
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r3 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane) r3
            r4 = 0
            r3.setScrollY(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r3 = r5._scrollPanes
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r3 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane) r3
            r3.updateVisualScroll()
            int r0 = r0 + (-1)
            goto L36
        L52:
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_CONNECTOR_SHAPE = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r5._defaultScrollPane
            r0.updateVisualScroll()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            r0.setDrawOnlyMainNodes(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            r0.setShowCreationDrawOrder(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            r0.setShowCreationStaticNodes(r1)
            goto L74
        L69:
            r5.setVisible(r2)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r5.setTouchable(r0)
            r5.setNeedsToBeDrawn()
        L74:
            return
    }

    public void onSessionSelectionChange() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 == r1) goto La
            return
        La:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r4._currentActiveScrollPaneRef
            boolean r2 = r4._userIsDoingSomethingBlankScrollPaneShowing
            if (r2 == 0) goto L11
            return
        L11:
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r4._currentWorkingConnectorAnchorRef
            if (r2 == 0) goto L16
            return
        L16:
            int r2 = r4._polyfillState
            if (r2 != 0) goto L89
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionDataRef
            int r2 = r2.getCurrentlySelected()
            if (r2 == r1) goto L35
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r4._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r3 = r4._defaultScrollPane
            if (r2 == r3) goto L64
            r4.removeActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r4._defaultScrollPane
            r4.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r4._defaultScrollPane
            r4._currentActiveScrollPaneRef = r2
            goto L64
        L35:
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r2 = r2.getCurrentlySelectedNode()
            boolean r2 = r2 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r2 == 0) goto L52
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r4._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r3 = r4._connectorScrollPane
            if (r2 == r3) goto L64
            r4.removeActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r4._connectorScrollPane
            r4.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r4._connectorScrollPane
            r4._currentActiveScrollPaneRef = r2
            goto L64
        L52:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r4._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r3 = r4._stickfigureScrollPane
            if (r2 == r3) goto L64
            r4.removeActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r4._stickfigureScrollPane
            r4.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r4._stickfigureScrollPane
            r4._currentActiveScrollPaneRef = r2
        L64:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r4._createdStickfigure
            if (r2 == 0) goto L89
            r3 = 0
            r2.flagDrawPolylineForPolyfillAnchor(r3)
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionDataRef
            int r2 = r2.getCurrentlySelected()
            if (r2 != r1) goto L89
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            if (r1 == 0) goto L89
            boolean r2 = r1.isPolyfillAnchor()
            if (r2 == 0) goto L89
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r4._createdStickfigure
            r2.flagDrawPolylineForPolyfillAnchor(r1)
        L89:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r4._currentActiveScrollPaneRef
            r1.updateAllToolTables()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r1 = r4._permanentCreationToolTable
            r1.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r1 = r4._jumpToolTable
            r1.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r4._currentActiveScrollPaneRef
            if (r1 == r0) goto L9f
            r4.snapScrollPaneToLastClickedWidget(r1)
        L9f:
            return
    }

    @Override // org.fortheloss.framework.IAndroidStorageRequester
    public void onStoragePermissionResult(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L11
            int r2 = r1._callbackAndroidRequestStoragePermission
            r0 = 1
            if (r2 != r0) goto Lb
            r1.actuallyLoadBackground()
            goto L11
        Lb:
            r0 = 2
            if (r2 != r0) goto L11
            r1.actuallySaveStickfigure()
        L11:
            r2 = 0
            r1._callbackAndroidRequestStoragePermission = r2
            return
    }

    public void pasteSegment(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getCopiedStickNode()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 == 0) goto L20
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r3 = r3.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0 = 1
            r2.promptUserToAddOrChangeConnector(r3, r0)
            goto L2d
        L20:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.pasteSegment(r1, r3)
        L2d:
            return
    }

    @Override // org.fortheloss.framework.IImageRequester
    public void pixmapIsProcessing() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r0 = r4._waitForLoadedImageDialog
            if (r0 != 0) goto L35
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r4._animationScreenRef
            r0.<init>(r1)
            r4._waitForLoadedImageDialog = r0
            java.lang.String r1 = "imageLoadingTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "pleaseWait"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "..."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r0.initialize(r1, r2, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r1 = r4._waitForLoadedImageDialog
            r0.addDialogToStage(r1)
        L35:
            return
    }

    public void promptUserToAddOrChangeConnector(org.fortheloss.sticknodes.stickfigure.StickNode r4, boolean r5) {
            r3 = this;
            r3._promptState = r5
            if (r5 == 0) goto L7
            java.lang.String r5 = "pastingConnectorTitle"
            goto L9
        L7:
            java.lang.String r5 = "selectNodeTitle"
        L9:
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            int r0 = r3._promptState
            r1 = 1
            if (r0 != r1) goto L2a
            boolean r0 = r4.isConnectorParent()
            if (r0 == 0) goto L2a
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            java.lang.String r5 = "connectorFailTitle"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r0 = "connectorFailInfoPaste"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r4.showErrorDialog(r5, r0)
            return
        L2a:
            r0 = 0
            r3.setDrawTool(r0)
            r3._currentWorkingConnectorAnchorRef = r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3._canvasModuleRef
            java.lang.String r2 = "selectNodeConnector"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r1.promptUserToChooseStickfigure(r3, r5, r2, r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r3._animationScreenRef
            r5.setSessionSelectionToNode(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r4 = r3._permanentCreationToolTable
            r4.disable()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r4 = r3._drawToolTable
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r4 = r3._drawToolTable
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1056964608(0x3f000000, float:0.5)
            r4.setColor(r0, r0, r0, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r4 = r3._sideDrawToolTable
            r4.setTouchable(r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r4 = r3._sideDrawToolTable
            r4.setColor(r0, r0, r0, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r4 = r3._jumpToolTable
            r4.setTouchable(r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r4 = r3._jumpToolTable
            r4.setColor(r0, r0, r0, r1)
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModuleRef
            r4.setNeedsToBeDrawn()
            return
    }

    public void pushBranchBack() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.pushBranchBack(r1)
        L22:
            return
    }

    public void pushBranchForward() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.pushBranchForward(r1)
        L22:
            return
    }

    public void pushPolynode(int r4) {
            r3 = this;
            int r0 = r3._polyfillState
            if (r0 == 0) goto L5b
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._currentWorkingPolyfillAnchorRef
            if (r0 != 0) goto L9
            goto L5b
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r1 == 0) goto L5b
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._currentWorkingPolyfillAnchorRef
            if (r0 == r1) goto L5b
            java.util.ArrayList r1 = r1.getPolynodeChildren()
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L22
            goto L5b
        L22:
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r1 = r1.peekAtUndo()
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.data.useractions.PolyfillReorderPolynodesAction
            if (r2 == 0) goto L36
            org.fortheloss.sticknodes.data.useractions.PolyfillReorderPolynodesAction r1 = (org.fortheloss.sticknodes.data.useractions.PolyfillReorderPolynodesAction) r1
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getPolyAnchor()
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r3._currentWorkingPolyfillAnchorRef
            if (r1 == r2) goto L4a
        L36:
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillReorderPolynodesAction> r2 = org.fortheloss.sticknodes.data.useractions.PolyfillReorderPolynodesAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.PolyfillReorderPolynodesAction r1 = (org.fortheloss.sticknodes.data.useractions.PolyfillReorderPolynodesAction) r1
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r3._currentWorkingPolyfillAnchorRef
            r1.initialize(r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r3._sessionDataRef
            r2.addUserAction(r1)
        L4a:
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._currentWorkingPolyfillAnchorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r1.polyfillAnchorPushPolynodeOrder(r0, r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r4 = r3._polyfillCreationToolTable
            r4.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModuleRef
            r4.setNeedsToBeDrawn()
        L5b:
            return
    }

    public void pushSegmentBack() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.pushSegmentBack(r1)
        L22:
            return
    }

    public void pushSegmentForward() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.pushSegmentForward(r1)
        L22:
            return
    }

    public void quickDeletePolyfill() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto L46
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            boolean r1 = r0.isPolyfillAnchor()
            if (r1 == 0) goto L46
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction> r2 = org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction.class
            java.lang.Object r1 = r1.getUserAction(r2)
            org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction r1 = (org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction) r1
            r2 = 0
            r1.initialize(r0, r2)
            org.fortheloss.sticknodes.data.SessionData r3 = r4._sessionDataRef
            r3.addUserAction(r1)
            r4.setDrawTool(r2)
            r0.deletePolyAnchor()
            r4.updateNodeCount()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0 = r4._specialSegmentToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0 = r4._connectorToolTable
            r0.update()
            r4.setNeedsToBeDrawn()
        L46:
            return
    }

    public void quickSelectNone() {
            r1 = this;
            boolean r0 = r1._userIsDoingSomethingBlankScrollPaneShowing
            if (r0 != 0) goto L31
            boolean r0 = r1.userIsTestingSmartStretch()
            if (r0 != 0) goto L31
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._currentWorkingPolyfillAnchorRef
            if (r0 != 0) goto L31
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._currentWorkingConnectorAnchorRef
            if (r0 == 0) goto L13
            goto L31
        L13:
            int r0 = r1.getDrawTool()
            if (r0 != 0) goto L1f
            int r0 = r1._rememberedDrawTool
            r1.setDrawTool(r0)
            goto L29
        L1f:
            int r0 = r1.getDrawTool()
            r1._rememberedDrawTool = r0
            r0 = 0
            r1.setDrawTool(r0)
        L29:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r0 = r1._drawToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
        L31:
            return
    }

    public void redo() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.redo()
            r1.updateNodeCount()
            return
    }

    public void removeCurrentNodeAsPolynode() {
            r4 = this;
            boolean r0 = r4.mPolynodeSelectionPrecisionIsQuick
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = r4._polyfillState
            if (r0 == 0) goto L52
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4._currentWorkingPolyfillAnchorRef
            if (r0 != 0) goto Le
            goto L52
        Le:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r1 == 0) goto L52
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r4._currentWorkingPolyfillAnchorRef
            if (r0 != r1) goto L1d
            goto L52
        L1d:
            java.util.ArrayList r1 = r1.getPolynodeChildren()
            int r1 = r1.indexOf(r0)
            r2 = -1
            if (r1 != r2) goto L29
            return
        L29:
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r4._currentWorkingPolyfillAnchorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2.removePolynodeChild(r0)
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillRemovePolynodeAction> r3 = org.fortheloss.sticknodes.data.useractions.PolyfillRemovePolynodeAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.PolyfillRemovePolynodeAction r2 = (org.fortheloss.sticknodes.data.useractions.PolyfillRemovePolynodeAction) r2
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r4._currentWorkingPolyfillAnchorRef
            r2.initialize(r0, r1, r3)
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            r0.addUserAction(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r0 = r4._polyfillCreationToolTable
            r0.update()
            r4.updateNodeCount()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            r0.setNeedsToBeDrawn()
        L52:
            return
    }

    public void removeLastPolynode() {
            r4 = this;
            int r0 = r4._polyfillState
            if (r0 == 0) goto L6c
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4._currentWorkingPolyfillAnchorRef
            if (r0 != 0) goto L9
            goto L6c
        L9:
            int r0 = r0.getPolynodeChildrenCount()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L45
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4._currentWorkingPolyfillAnchorRef
            java.util.ArrayList r0 = r0.getPolynodeChildren()
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            int r1 = r0 + (-1)
        L1f:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4._currentWorkingPolyfillAnchorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.removeLastPolynodeChild()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r4._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r4._currentWorkingPolyfillAnchorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getLastPolynodeInPolyfill()
            r2.setSessionSelectionToNode(r3)
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillRemovePolynodeAction> r3 = org.fortheloss.sticknodes.data.useractions.PolyfillRemovePolynodeAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.PolyfillRemovePolynodeAction r2 = (org.fortheloss.sticknodes.data.useractions.PolyfillRemovePolynodeAction) r2
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r4._currentWorkingPolyfillAnchorRef
            r2.initialize(r0, r1, r3)
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            r0.addUserAction(r2)
            goto L64
        L45:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction> r3 = org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction.class
            java.lang.Object r0 = r0.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction r0 = (org.fortheloss.sticknodes.data.useractions.PolyfillDeleteAnchorAction) r0
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r4._currentWorkingPolyfillAnchorRef
            r0.initialize(r3, r2)
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionDataRef
            r2.addUserAction(r0)
            r4.setDrawTool(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r4._currentWorkingPolyfillAnchorRef
            r0.deletePolyAnchor()
            r4.cancelPolyfillEditing()
        L64:
            r4.updateNodeCount()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            r0.setNeedsToBeDrawn()
        L6c:
            return
    }

    public void reverseSegmentGradient(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.reverseSegmentGradient(r3, r1)
        L22:
            return
    }

    public void rotateSegmentTo(int r5) {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L27
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L27
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            float r5 = (float) r5
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = 1
            r0.rotateSegmentTo(r5, r1, r2, r3)
        L27:
            return
    }

    public void rotateStickfigureTo(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            float r3 = (float) r3
            r1.rotateStickfigureTo(r3, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            return
    }

    public void saveStickfigure() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallySaveStickfigure()
            goto L1e
        Lc:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            r0 = 2
            r2._callbackAndroidRequestStoragePermission = r0
        L1e:
            return
    }

    public void saveStickfigureToFile(java.lang.String r3) {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._createdStickfigure
            r1 = 0
            r2.saveStickfigureToFile(r3, r0, r1)
            return
    }

    public void saveStickfigureToFile(java.lang.String r7, org.fortheloss.sticknodes.stickfigure.Stickfigure r8, boolean r9) {
            r6 = this;
            java.lang.String r0 = r8.getName()
            java.lang.String r1 = ".nodes"
            if (r9 != 0) goto L1d
            java.lang.String r2 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r7)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L31
        L1d:
            java.lang.String r2 = org.fortheloss.sticknodes.App.stickfigureBackupsPath
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r7)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L31:
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L3e
            r3.<init>(r1)     // Catch: java.io.FileNotFoundException -> L3e
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch: java.io.FileNotFoundException -> L3e
            r4.<init>(r3)     // Catch: java.io.FileNotFoundException -> L3e
            r2 = 1
            goto L45
        L3e:
            r3 = move-exception
            r3.printStackTrace()
            r3 = 0
            r4 = r2
            r2 = 0
        L45:
            java.lang.String r3 = "errorSavingSpaceInfo"
            java.lang.String r5 = "errorSavingSpaceTitle"
            if (r2 == 0) goto L113
            r8.setName(r7)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r8.setDefaults()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r8.writeData(r4)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            goto L113
        L56:
            r7 = move-exception
            goto Lb2
        L58:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto Lae
            r4.close()     // Catch: java.lang.Throwable -> L7e java.io.IOException -> L80
            com.badlogic.gdx.Files r7 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r7 = r7.absolute(r1)
            boolean r1 = r7.exists()
            if (r1 == 0) goto L70
        L6d:
            r7.delete()
        L70:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r6._animationScreenRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3)
            r7.showErrorDialog(r1, r2)
            goto Lae
        L7e:
            r7 = move-exception
            goto L91
        L80:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L7e
            com.badlogic.gdx.Files r7 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r7 = r7.absolute(r1)
            boolean r1 = r7.exists()
            if (r1 == 0) goto L70
            goto L6d
        L91:
            com.badlogic.gdx.Files r8 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r8 = r8.absolute(r1)
            boolean r9 = r8.exists()
            if (r9 == 0) goto La0
            r8.delete()
        La0:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r8 = r6._animationScreenRef
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r3)
            r8.showErrorDialog(r9, r0)
            throw r7
        Lae:
            if (r9 == 0) goto L170
            goto L16d
        Lb2:
            if (r4 == 0) goto L10a
            r4.close()     // Catch: java.lang.Throwable -> Ld6 java.io.IOException -> Ld8
            if (r2 != 0) goto L10a
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r1 = r2.absolute(r1)
            boolean r2 = r1.exists()
            if (r2 == 0) goto Lc8
        Lc5:
            r1.delete()
        Lc8:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6._animationScreenRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r1.showErrorDialog(r2, r3)
            goto L10a
        Ld6:
            r7 = move-exception
            goto Leb
        Ld8:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> Ld6
            if (r2 != 0) goto L10a
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r1 = r2.absolute(r1)
            boolean r2 = r1.exists()
            if (r2 == 0) goto Lc8
            goto Lc5
        Leb:
            if (r2 != 0) goto L109
            com.badlogic.gdx.Files r8 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r8 = r8.absolute(r1)
            boolean r9 = r8.exists()
            if (r9 == 0) goto Lfc
            r8.delete()
        Lfc:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r8 = r6._animationScreenRef
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r3)
            r8.showErrorDialog(r9, r0)
        L109:
            throw r7
        L10a:
            if (r9 == 0) goto L10f
            r8.setName(r0)
        L10f:
            r6.stickfigureSavingComplete()
            throw r7
        L113:
            if (r4 == 0) goto L16b
            r4.close()     // Catch: java.lang.Throwable -> L137 java.io.IOException -> L139
            if (r2 != 0) goto L16b
            com.badlogic.gdx.Files r7 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r7 = r7.absolute(r1)
            boolean r1 = r7.exists()
            if (r1 == 0) goto L129
        L126:
            r7.delete()
        L129:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r6._animationScreenRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3)
            r7.showErrorDialog(r1, r2)
            goto L16b
        L137:
            r7 = move-exception
            goto L14c
        L139:
            r7 = move-exception
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L137
            if (r2 != 0) goto L16b
            com.badlogic.gdx.Files r7 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r7 = r7.absolute(r1)
            boolean r1 = r7.exists()
            if (r1 == 0) goto L129
            goto L126
        L14c:
            if (r2 != 0) goto L16a
            com.badlogic.gdx.Files r8 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r8 = r8.absolute(r1)
            boolean r9 = r8.exists()
            if (r9 == 0) goto L15d
            r8.delete()
        L15d:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r8 = r6._animationScreenRef
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r3)
            r8.showErrorDialog(r9, r0)
        L16a:
            throw r7
        L16b:
            if (r9 == 0) goto L170
        L16d:
            r8.setName(r0)
        L170:
            r6.stickfigureSavingComplete()
            return
    }

    public void scaleSegmentTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.scaleSegmentTo(r3, r1)
        L22:
            return
    }

    public void scaleStickfigureTo(float r5) {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = 1
            r0.scaleFigureTo(r5, r1, r2, r3)
            return
    }

    public void sendBranchToBack() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.sendBranchToBack(r1)
        L22:
            return
    }

    public void sendBranchToFront() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.sendBranchToFront(r1)
        L22:
            return
    }

    public void sendSegmentToBack() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.sendSegmentToBack(r1)
        L22:
            return
    }

    public void sendSegmentToFront() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.sendSegmentToFront(r1)
        L22:
            return
    }

    public void setBackgroundColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = r1._backgroundColor
            r0.set(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModuleRef
            r2.setNeedsToBeDrawn()
            return
    }

    public void setBackgroundImageTransparency(float r3) {
            r2 = this;
            r2._backgroundImageTransparency = r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto La
            r2._backgroundImageTransparency = r0
            goto L12
        La:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L12
            r2._backgroundImageTransparency = r0
        L12:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setBackgroundOnTop(boolean r1) {
            r0 = this;
            r0._backgroundImageOnTop = r1
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModuleRef
            r1.setNeedsToBeDrawn()
            return
    }

    public void setCircleIsHollow(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setCircleIsHollow(r3, r1)
        L22:
            return
    }

    public void setCircleOutlineColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setCircleOutlineColor(r3, r1)
        L22:
            return
    }

    public void setConnectorNodeMethod(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 != 0) goto Lb
            return
        Lb:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.Connector r1 = (org.fortheloss.sticknodes.stickfigure.Connector) r1
            r0.setConnectorNodeMethod(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r3 = r2._connectorToolTable
            r3.update()
            return
    }

    public void setConnectorNodePercent(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 != 0) goto Lb
            return
        Lb:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.Connector r1 = (org.fortheloss.sticknodes.stickfigure.Connector) r1
            r0.setConnectorNodePercent(r3, r1)
            return
    }

    public void setConnectorNodeReversed(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 != 0) goto Lb
            return
        Lb:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.Connector r1 = (org.fortheloss.sticknodes.stickfigure.Connector) r1
            r0.setConnectorNodeReversed(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r3 = r2._connectorToolTable
            r3.update()
            return
    }

    public void setConnectorNodeValue(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r0 != 0) goto Lb
            return
        Lb:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.Connector r1 = (org.fortheloss.sticknodes.stickfigure.Connector) r1
            r0.setConnectorNodeValue(r3, r1)
            return
    }

    public void setConnectorSegmentType(int r1) {
            r0 = this;
            r0.setSegmentType(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_CONNECTOR_SHAPE = r1
            return
    }

    public void setCreatedStickfigure(org.fortheloss.sticknodes.stickfigure.Stickfigure r2) {
            r1 = this;
            r1._createdStickfigure = r2
            r0 = 0
            r2.setSmartStretchEnabled(r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._createdFigureArray
            r0.add(r2)
            r1.updateNodeCount()
            return
    }

    public void setDrawTool(int r1) {
            r0 = this;
            r0._drawTool = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r1 = r0._drawToolTable
            r1.update()
            r0.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.ICreationBasedModule
    public void setFrameIndexToTrace(int r2, boolean r3) {
            r1 = this;
            r1._lastSelectedFrameTraceIndex = r2
            float r3 = r1._backgroundImageTransparency
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto Ld
            r3 = 1056964608(0x3f000000, float:0.5)
            r1._backgroundImageTransparency = r3
        Ld:
            r1.clearBackgroundImage()
            org.fortheloss.sticknodes.data.ProjectData r3 = r1._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r3 = r3.frames
            java.lang.Object r2 = r3.get(r2)
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r1._canvasModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r3.getTracingFBO()
            com.badlogic.gdx.graphics.GLTexture r3 = r3.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            r1._tracingBackgroundImage = r3
            r3 = 0
            r1._ownsTracingBackgroundImage = r3
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r1._canvasModuleRef
            r3.setTracingFrameData(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r2 = r1._creationModeToolTable
            r2.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModuleRef
            com.badlogic.gdx.graphics.Texture r3 = r1._tracingBackgroundImage
            r2.updateBackgroundImage(r3)
            r1.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModuleRef
            r2.setNeedsToBeDrawn()
            return
    }

    public void setFromScreen(int r1) {
            r0 = this;
            r0._fromScreenToReturnTo = r1
            return
    }

    public void setGradientMode(short r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setGradientMode(r3, r1)
        L22:
            return
    }

    public void setModifyBranchSwapColors(com.badlogic.gdx.graphics.Color r2, com.badlogic.gdx.graphics.Color r3) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0 = r1._modifyBranchDialog
            if (r0 == 0) goto L7
            r0.setSwapColors(r2, r3)
        L7:
            return
    }

    public void setPolyfillColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r1.setPolyfillColor(r2, r0)
            return
    }

    public void setPolyfillColor(com.badlogic.gdx.graphics.Color r2, org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r1 = this;
            if (r3 != 0) goto La
            org.fortheloss.sticknodes.data.SessionData r3 = r1._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r3 = r3.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
        La:
            if (r3 != 0) goto Ld
            return
        Ld:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModuleRef
            r0.setPolyfillColor(r2, r3)
            return
    }

    public void setPolynodeSelectionPrecision(boolean r2) {
            r1 = this;
            boolean r0 = r1.mPolynodeSelectionPrecisionIsQuick
            r1.mPolynodeSelectionPrecisionIsQuick = r2
            if (r0 == r2) goto L30
            if (r2 == 0) goto Le
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r1._animationScreenRef
            r2.setSessionSelectionToNothing()
            goto L30
        Le:
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r1._currentWorkingPolyfillAnchorRef
            java.util.ArrayList r2 = r2.getPolynodeChildren()
            int r2 = r2.size()
            if (r2 != 0) goto L1d
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r1._currentWorkingPolyfillAnchorRef
            goto L2b
        L1d:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._currentWorkingPolyfillAnchorRef
            java.util.ArrayList r0 = r0.getPolynodeChildren()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r0.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
        L2b:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.setSessionSelectionToNode(r2)
        L30:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r2 = r1._polyfillCreationToolTable
            r2.update()
            return
    }

    public void setReferences(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1) {
            r0 = this;
            r0._canvasModuleRef = r1
            return
    }

    @Override // org.fortheloss.framework.IImageRequester
    public void setRequestedImagePixmap(com.badlogic.gdx.graphics.Pixmap r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r0 = r2._waitForLoadedImageDialog
            if (r0 == 0) goto L16
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r0.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 == 0) goto L13
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r0 = r2._waitForLoadedImageDialog
            r0.hideImmediately()
        L13:
            r0 = 0
            r2._waitForLoadedImageDialog = r0
        L16:
            if (r3 != 0) goto L2a
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            java.lang.String r0 = "imageLoadErrorTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "imageLoadErrorInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r3.showErrorDialog(r0, r1)
            return
        L2a:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$6 r1 = new org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$6
            r1.<init>(r2, r3)
            r0.postRunnable(r1)
            return
    }

    public void setSegmentColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentColor(r3, r1)
        L22:
            return
    }

    public void setSegmentDoNotApplySmartStretch(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentDoNotApplySmartStretch(r3, r1)
        L22:
            return
    }

    public void setSegmentDragLockAngle(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L27
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L27
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentDragLockAngle(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
        L27:
            return
    }

    public void setSegmentGradient(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentGradient(r3, r1)
        L22:
            return
    }

    public void setSegmentIsAngleLocked(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L31
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L31
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentIsAngleLocked(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r3 = r2._specialSegmentToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
        L31:
            return
    }

    public void setSegmentIsDragLocked(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L31
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L31
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentIsDragLocked(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r3 = r2._specialSegmentToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
        L31:
            return
    }

    public void setSegmentIsFloaty(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentIsFloaty(r3, r1)
        L22:
            return
    }

    public void setSegmentIsSmartStretch(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L31
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L31
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentIsSmartStretch(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r3 = r2._connectorToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
        L31:
            return
    }

    public void setSegmentIsStatic(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L34
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setStaticSegment(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r3 = r2._connectorToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            r2.updateRelativeAngleLocks()
        L34:
            return
    }

    public void setSegmentIsStretchy(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L27
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L27
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentIsStretchy(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
        L27:
            return
    }

    public void setSegmentLength(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L23
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L23
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            float r3 = (float) r3
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentLength(r3, r1)
        L23:
            return
    }

    public void setSegmentRelativeAngleLockMultiplier(byte r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L31
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L31
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentRelativeAngleLockMultiplier(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r3 = r2._specialSegmentToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
        L31:
            return
    }

    public void setSegmentSmartStretchMultiplier(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentSmartStretchMultiplier(r3, r1)
        L22:
            return
    }

    public void setSegmentSmartStretchResetImpulse(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentSmartStretchResetImpulse(r3, r1)
        L22:
            return
    }

    public void setSegmentThickness(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentThickness(r3, r1)
        L22:
            return
    }

    public void setSegmentType(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L31
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L31
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setLimbType(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r3 = r2._shapeToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r3 = r2._connectorToolTable
            r3.update()
        L31:
            return
    }

    public void setShapeIsFlippedTriangle(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L2a
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L2a
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setShapeIsFlippedTriangle(r3, r1)
            if (r3 == 0) goto L26
            r3 = -1
            goto L27
        L26:
            r3 = 1
        L27:
            short r3 = (short) r3
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_RIGHT_TRIANGLE_DIRECTION = r3
        L2a:
            return
    }

    public void setShapeIsHalfArc(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L31
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L31
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setShapeIsHalfArc(r3, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_HALF_ARC = r3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r3 = r2._shapeToolTable
            r3.update()
            r2.setNeedsToBeDrawn()
        L31:
            return
    }

    public void setShapeIsRightTriangle(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L2f
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L2f
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setShapeIsRightTriangle(r3, r1)
            short r3 = (short) r3
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_RIGHT_TRIANGLE_DIRECTION = r3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r3 = r2._shapeToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r3 = r2._connectorToolTable
            r3.update()
        L2f:
            return
    }

    public void setShapeIsUpsideDownTriangle(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L24
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L24
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setShapeIsUpsideDownTriangle(r3, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_RIGHT_TRIANGLE_UPSIDE_DOWN = r3
        L24:
            return
    }

    public void setShapeNumPolygonVertices(short r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L24
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L24
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setShapeNumPolygonVertices(r3, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_NUM_POLYGON_VERTICES = r3
        L24:
            return
    }

    public void setShapeSegmentCirculization(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L22
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setShapeSegmentCirculization(r3, r1)
        L22:
            return
    }

    public void setShapeSegmentCurve(int r5) {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L26
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L26
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r2 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r3 = 1
            r0.setShapeSegmentCurve(r5, r1, r2, r3)
        L26:
            return
    }

    public void setShapeSegmentCurvePolyfillPrecision(short r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r1.setShapeSegmentCurvePolyfillPrecision(r2, r0)
            return
    }

    public void setShapeSegmentCurvePolyfillPrecision(short r2, org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r1 = this;
            if (r3 != 0) goto La
            org.fortheloss.sticknodes.data.SessionData r3 = r1._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r3 = r3.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
        La:
            if (r3 != 0) goto Ld
            return
        Ld:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModuleRef
            r0.setShapeSegmentCurvePolyfillPrecision(r2, r3)
            return
    }

    public void setShapeTrapezoidIsRounded1(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L24
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L24
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setShapeTrapezoidIsRounded1(r3, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_TRAPEZOID_ROUNDED_1 = r3
        L24:
            return
    }

    public void setShapeTrapezoidIsRounded2(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L24
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L24
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setShapeTrapezoidIsRounded2(r3, r1)
            org.fortheloss.sticknodes.stickfigure.StickNode.LAST_USER_SET_TRAPEZOID_ROUNDED_2 = r3
        L24:
            return
    }

    public void setShapeTrapezoidRatio(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r0 == 0) goto L13
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L51
            boolean r1 = r0.isMainNode()
            if (r1 == 0) goto L1d
            goto L51
        L1d:
            float r1 = r0.getTrapezoidRatio()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L29
            r1 = 1
            goto L2a
        L29:
            r1 = 0
        L2a:
            if (r4 != r1) goto L2d
            return
        L2d:
            if (r4 != 0) goto L30
            goto L44
        L30:
            float r4 = r0.getTrapezoidThickness1()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.max(r1, r4)
            float r0 = r0.getTrapezoidThickness2()
            float r0 = java.lang.Math.max(r1, r0)
            float r2 = r4 / r0
        L44:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r4.setShapeTrapezoidRatio(r2, r0)
        L51:
            return
    }

    public void setShapeTrapezoidThickness1(int r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L2f
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L2f
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            float r4 = (float) r4
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.setShapeTrapezoidThickness1(r4, r1, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r4 = r3._shapeToolTable
            r4.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r4 = r3._connectorToolTable
            r4.update()
        L2f:
            return
    }

    public void setShapeTrapezoidThickness2(int r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L2f
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L2f
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            float r4 = (float) r4
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.setShapeTrapezoidThickness2(r4, r1, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r4 = r3._shapeToolTable
            r4.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r4 = r3._connectorToolTable
            r4.update()
        L2f:
            return
    }

    public void setStickfigureColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r0.setStickfigureColor(r3, r1)
            return
    }

    public void setStickfigureToTraceFromLibrary(int r3) {
            r2 = this;
            float r0 = r2._backgroundImageTransparency
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb
            r0 = 1056964608(0x3f000000, float:0.5)
            r2._backgroundImageTransparency = r0
        Lb:
            r2.clearBackgroundImage()
            org.fortheloss.sticknodes.data.ProjectData r0 = r2._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r0.libraryStickfigures
            java.lang.Object r3 = r0.get(r3)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r0.getTracingFBO()
            com.badlogic.gdx.graphics.GLTexture r0 = r0.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r0 = (com.badlogic.gdx.graphics.Texture) r0
            r2._tracingBackgroundImage = r0
            r0 = 0
            r2._ownsTracingBackgroundImage = r0
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            r0.setTracingStickfigure(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CreationModeToolTable r3 = r2._creationModeToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            com.badlogic.gdx.graphics.Texture r0 = r2._tracingBackgroundImage
            r3.updateBackgroundImage(r0)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void setUsePolyfillColor(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            r1.setUsePolyfillColor(r2, r0)
            return
    }

    public void setUsePolyfillColor(boolean r2, org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r1 = this;
            if (r3 != 0) goto La
            org.fortheloss.sticknodes.data.SessionData r3 = r1._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r3 = r3.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
        La:
            if (r3 != 0) goto Ld
            return
        Ld:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModuleRef
            r0.usePolyfillColor(r2, r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r2 = r1._polyfillCreationToolTable
            r2.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r2 = r1._segmentCreationToolTable
            r2.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r2 = r1._connectorToolTable
            r2.update()
            return
    }

    public void showBackups() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$5 r0 = new org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule$5
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r2, r1)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    public void showModifyBranchDialog(org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            r0.setCurrentlySelectedToStickNode(r5)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r4._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r4._canvasModuleRef
            r0.<init>(r1, r4, r2)
            r4._modifyBranchDialog = r0
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = r4._animationMenuAtlasRef
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = r4._colorPickerAtlasRef
            r0.initialize(r5, r1, r2, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.ModifyBranchDialog r0 = r4._modifyBranchDialog
            r5.addDialogToStage(r0)
            return
    }

    public void showPolynodeNumbers(boolean r1) {
            r0 = this;
            r0.mPolynodeShowNumbers = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PolyfillCreationToolTable r1 = r0._polyfillCreationToolTable
            r1.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModuleRef
            r1.setNeedsToBeDrawn()
            return
    }

    public void showSelectFrameToTraceFromDialog() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r2 = 0
            r0.<init>(r1, r3, r2)
            r3._traceFrameDialogRef = r0
            org.fortheloss.sticknodes.data.ProjectData r1 = r3._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r2 = r3._lastSelectedFrameTraceIndex
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog r1 = r3._traceFrameDialogRef
            r0.addDialogToStage(r1)
            return
    }

    public void showSelectStickfigureToTraceFromDialog() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r2._traceStickfigureDialogRef = r0
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog r1 = r2._traceStickfigureDialogRef
            r0.addDialogToStage(r1)
            return
    }

    public void showSmartStretchDialog() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.SmartStretchInstructionsDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.SmartStretchInstructionsDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            org.fortheloss.framework.Assets r1 = r2._assetsRef
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    public void showStickfigureOverwriteDialog(java.lang.String r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureOverwriteDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureOverwriteDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r2._stickfigureSaveOverwriteDialogRef = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureSaveAsDialog r1 = r2._stickfigureSaveAsDialogRef
            r0.initialize(r3, r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureOverwriteDialog r0 = r2._stickfigureSaveOverwriteDialogRef
            r3.addDialogToStage(r0)
            return
    }

    public void splitSegment(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L25
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L25
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.splitSegment(r1, r3)
            r2.updateRelativeAngleLocks()
        L25:
            return
    }

    public void testSmartStretch() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            r1 = 1
            r0.blockUserActions(r1)
            r0 = 0
            r4.setDrawTool(r0)
            r4._userIsDoingSomethingBlankScrollPaneShowing = r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r4._createdStickfigure
            r2.setDefaults()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r4._createdStickfigure
            r2.setSmartStretchEnabled(r1)
            org.fortheloss.sticknodes.data.useractions.BranchChangeAction r1 = new org.fortheloss.sticknodes.data.useractions.BranchChangeAction
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r4._animationScreenRef
            r1.<init>(r2)
            r4._propertiesBeforeTestingSmartStretch = r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r4._createdStickfigure
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r2.getMainNode()
            r1.initialize(r2, r0)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4._createdStickfigure
            float r1 = r1.getX()
            r4._stickfigureRememberedX = r1
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4._createdStickfigure
            float r1 = r1.getY()
            r4._stickfigureRememberedY = r1
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r2 == 0) goto L46
            r3 = r1
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            goto L47
        L46:
            r3 = 0
        L47:
            r4._stickfigureRememberedSelectedNode = r3
            if (r2 == 0) goto L5a
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            boolean r1 = r1.isStatic()
            if (r1 == 0) goto L5a
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r4._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r4._createdStickfigure
            r1.setSessionSelectionToStickfigure(r2)
        L5a:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable r1 = r4._userDoingSomethingBlankToolTable
            java.lang.String r2 = "creationSmartStretchTitle"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "creationSmartStretchInfo"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r1.setMessage(r2, r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r4._currentActiveScrollPaneRef
            r4.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r4._userDoingSomethingScrollPane
            r4.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r4._userDoingSomethingScrollPane
            r4._currentActiveScrollPaneRef = r1
            r1.updateAllToolTables()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable r1 = r4._userDoingSomethingBlankToolTable
            r1.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r1 = r4._jumpToolTable
            r1.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4._canvasModuleRef
            r1.hideQuickMenu(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r0 = r4._permanentCreationToolTable
            r0.disable()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r0 = r4._drawToolTable
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r0 = r4._drawToolTable
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r2, r2, r2, r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0 = r4._sideDrawToolTable
            r0.setTouchable(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0 = r4._sideDrawToolTable
            r0.setColor(r2, r2, r2, r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r4._jumpToolTable
            r0.setTouchable(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r4._jumpToolTable
            r0.setColor(r2, r2, r2, r3)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            r0.showQuickResizeTool(r1)
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            r0.setNeedsToBeDrawn()
            return
    }

    public void undo() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.undo()
            r1.updateNodeCount()
            return
    }

    public void updateCurrentToolTables() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r1._currentActiveScrollPaneRef
            if (r0 == 0) goto L7
            r0.updateAllToolTables()
        L7:
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateJumpToolTable() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModuleRef
            boolean r0 = r0.isWaitingForUserToChooseFigure()
            if (r0 != 0) goto L1f
            boolean r0 = r1.userIsTestingSmartStretch()
            if (r0 != 0) goto L1f
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._currentWorkingConnectorAnchorRef
            if (r0 != 0) goto L1f
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._currentWorkingPolyfillAnchorRef
            if (r0 == 0) goto L17
            goto L1f
        L17:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r1._jumpToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
        L1f:
            return
    }

    public void updateNodeCount() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3._createdStickfigure
            if (r0 == 0) goto L16
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r1 = r3._permanentCreationToolTable
            r2 = 1
            int r0 = r0.getNodeCount(r2)
            r1.setNodeCount(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r0 = r3._permanentCreationToolTable
            r0.update()
            r3.setNeedsToBeDrawn()
        L16:
            return
    }

    public void updateRelativeAngleLocks() {
            r4 = this;
            java.lang.Class<java.util.Stack> r0 = java.util.Stack.class
            java.lang.Object r0 = com.badlogic.gdx.utils.Pools.obtain(r0)
            java.util.Stack r0 = (java.util.Stack) r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r4._createdStickfigure
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getMainNode()
            r0.add(r1)
        L11:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L4f
            java.lang.Object r1 = r0.pop()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            boolean r2 = r1.isMainNode()
            if (r2 != 0) goto L33
            boolean r2 = r1.getIsAngleLocked()
            if (r2 == 0) goto L33
            boolean r2 = r1.getAngleLockIsMainNode()
            if (r2 != 0) goto L33
            r2 = 0
            r1.updateAngleLock(r2)
        L33:
            java.util.ArrayList r2 = r1.getChildrenNodes()
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L3d:
            if (r2 < 0) goto L11
            java.util.ArrayList r3 = r1.getChildrenNodes()
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r0.add(r3)
            int r2 = r2 + (-1)
            goto L3d
        L4f:
            r0.clear()
            com.badlogic.gdx.utils.Pools.free(r0)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            r0.setNeedsToBeDrawn()
            return
    }

    public void updateSegmentTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r0 = r1._segmentCreationToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0 = r1._specialSegmentToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r0 = r1._connectorToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateShapeTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ShapeToolTable r0 = r1._shapeToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateSideDrawTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r0 = r1._sideDrawToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateStickfigureTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureCreationToolTable r0 = r1._stickfigureCreationToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateZoomDisplay(float r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r0 = r1._permanentCreationToolTable
            r0.setZoom(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r2 = r1._permanentCreationToolTable
            r2.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void useCircleOutline(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L2c
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L2c
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.useCircleOutline(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r3 = r2._connectorToolTable
            r3.update()
        L2c:
            return
    }

    public void useSegmentColor(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L2c
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L2c
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.useSegmentColor(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r3 = r2._connectorToolTable
            r3.update()
        L2c:
            return
    }

    public void useSegmentGradient(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L2c
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L2c
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.useSegmentGradient(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r3 = r2._connectorToolTable
            r3.update()
        L2c:
            return
    }

    public void useSegmentScale(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L2c
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L2c
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.useSegmentScale(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentCreationToolTable r3 = r2._segmentCreationToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ConnectorToolTable r3 = r2._connectorToolTable
            r3.update()
        L2c:
            return
    }

    public void userChoosingFigure(boolean r1, java.lang.String r2, java.lang.String r3, org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter r4) {
            r0 = this;
            if (r1 == 0) goto L22
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r1 = r0._userChooseStickfigureToolTable
            r1.setMessage(r2, r3, r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r0._currentActiveScrollPaneRef
            r0.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r0._userChooseStickfigureScrollPane
            r0.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r0._userChooseStickfigureScrollPane
            r0._currentActiveScrollPaneRef = r1
            r1.updateAllToolTables()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r1 = r0._permanentCreationToolTable
            r1.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r1 = r0._jumpToolTable
            r1.update()
        L22:
            r0.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter
    public void userChoseNode(org.fortheloss.sticknodes.stickfigure.INode r11) {
            r10 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r10._currentWorkingConnectorAnchorRef
            r1 = 0
            r10._currentWorkingConnectorAnchorRef = r1
            r2 = 0
            if (r11 == 0) goto L133
            org.fortheloss.sticknodes.stickfigure.Connector r3 = r0.getConnectorChild()
            int r4 = r10._promptState
            java.lang.String r5 = "connectorFailTitle"
            r6 = 1
            if (r4 != r6) goto L3f
            if (r3 != 0) goto L29
            if (r11 != r0) goto L18
            goto L29
        L18:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r10._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = (org.fortheloss.sticknodes.stickfigure.StickNode) r11
            boolean r11 = r3.pasteSegment(r0, r2, r11)
            if (r11 != 0) goto L140
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            r11.setSessionSelectionToNode(r0)
            goto L140
        L29:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r4 = "connectorFailInfoPaste"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r11.showErrorDialog(r3, r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            r11.setSessionSelectionToNode(r0)
            goto L140
        L3f:
            java.lang.String r4 = "connectorFailInfo"
            if (r3 == 0) goto Lba
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = (org.fortheloss.sticknodes.stickfigure.StickNode) r11
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getEndNode()
            if (r11 != r0) goto L4d
            goto Lb0
        L4d:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3.getParentNode()
            if (r11 != r0) goto L61
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r11.showErrorDialog(r0, r4)
            goto Lb0
        L61:
            r0 = r11
        L62:
            if (r0 == 0) goto L6d
            if (r0 != r3) goto L68
            r0 = 1
            goto L6e
        L68:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r0.getParentNode()
            goto L62
        L6d:
            r0 = 0
        L6e:
            if (r0 != 0) goto L8a
            r7 = r11
            r8 = 0
        L72:
            boolean r9 = r7 instanceof org.fortheloss.sticknodes.stickfigure.Connector
            if (r9 == 0) goto L7e
            org.fortheloss.sticknodes.stickfigure.Connector r7 = (org.fortheloss.sticknodes.stickfigure.Connector) r7
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r7.getEndNode()
            r8 = 1
            goto L72
        L7e:
            if (r8 == 0) goto L8a
        L80:
            if (r7 == 0) goto L8a
            if (r7 != r3) goto L85
            goto L8b
        L85:
            org.fortheloss.sticknodes.stickfigure.StickNode r7 = r7.getParentNode()
            goto L80
        L8a:
            r6 = r0
        L8b:
            if (r6 == 0) goto L9b
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r11.showErrorDialog(r0, r4)
            goto Lb0
        L9b:
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ConnectorChangeEndpointAction> r4 = org.fortheloss.sticknodes.data.useractions.ConnectorChangeEndpointAction.class
            java.lang.Object r0 = r0.getUserAction(r4)
            org.fortheloss.sticknodes.data.useractions.ConnectorChangeEndpointAction r0 = (org.fortheloss.sticknodes.data.useractions.ConnectorChangeEndpointAction) r0
            r0.initialize(r3)
            org.fortheloss.sticknodes.data.SessionData r4 = r10._sessionDataRef
            r4.addUserAction(r0)
            r3.changeEndNode(r11)
        Lb0:
            r3.validatePosition()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            r11.setSessionSelectionToNode(r3)
            goto L140
        Lba:
            if (r0 != r11) goto Ld0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r11.showErrorDialog(r3, r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            r11.setSessionSelectionToNode(r0)
            goto L140
        Ld0:
            org.fortheloss.sticknodes.stickfigure.StickNode r11 = (org.fortheloss.sticknodes.stickfigure.StickNode) r11
            org.fortheloss.sticknodes.stickfigure.Connector r11 = r0.addConnectorTo(r11)
            if (r11 != 0) goto L118
            org.fortheloss.sticknodes.stickfigure.Stickfigure r11 = r0.getStickfigure()
            int r11 = r11.getNodeCount(r6)
            r3 = 400(0x190, float:5.6E-43)
            if (r11 < r3) goto L105
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r10._animationScreenRef
            java.lang.String r5 = "nodeLimitWarningTitle"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r2] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r7[r6] = r11
            java.lang.String r11 = "nodeLimitWarningInfo1"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11, r7)
            r4.showErrorDialog(r5, r11)
            goto L112
        L105:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r5)
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r11.showErrorDialog(r3, r4)
        L112:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            r11.setSessionSelectionToNode(r0)
            goto L140
        L118:
            r11.validatePosition()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r10._animationScreenRef
            r0.setSessionSelectionToNode(r11)
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.ConnectorAddAction> r3 = org.fortheloss.sticknodes.data.useractions.ConnectorAddAction.class
            java.lang.Object r0 = r0.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.ConnectorAddAction r0 = (org.fortheloss.sticknodes.data.useractions.ConnectorAddAction) r0
            r0.initialize(r11)
            org.fortheloss.sticknodes.data.SessionData r11 = r10._sessionDataRef
            r11.addUserAction(r0)
            goto L140
        L133:
            org.fortheloss.sticknodes.stickfigure.Connector r11 = r0.getConnectorChild()
            if (r11 != 0) goto L13a
            goto L13b
        L13a:
            r0 = r11
        L13b:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            r11.setSessionSelectionToNode(r0)
        L140:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r11 = r10._canvasModuleRef
            r11.promptUserToChooseStickfigure(r1, r1, r1, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r11 = r10._permanentCreationToolTable
            r11.enable()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r11 = r10._drawToolTable
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r11.setTouchable(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.DrawToolTable r11 = r10._drawToolTable
            r1 = 1065353216(0x3f800000, float:1.0)
            r11.setColor(r1, r1, r1, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r11 = r10._sideDrawToolTable
            r11.setTouchable(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SideDrawToolTable r11 = r10._sideDrawToolTable
            r11.setColor(r1, r1, r1, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r11 = r10._jumpToolTable
            r11.setTouchable(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r11 = r10._jumpToolTable
            r11.setColor(r1, r1, r1, r1)
            r10.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r11 = r10._canvasModuleRef
            r11.setNeedsToBeDrawn()
            r10.updateNodeCount()
            return
    }

    public boolean userIsTestingSmartStretch() {
            r1 = this;
            boolean r0 = r1._userIsDoingSomethingBlankScrollPaneShowing
            return r0
    }
}
