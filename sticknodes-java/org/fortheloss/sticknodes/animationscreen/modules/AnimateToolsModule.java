package org.fortheloss.sticknodes.animationscreen.modules;

/* loaded from: classes2.dex */
public class AnimateToolsModule extends org.fortheloss.sticknodes.animationscreen.modules.Module implements org.fortheloss.framework.IImageRequester, org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter, org.fortheloss.framework.IAndroidStorageRequester, org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule {
    public static int show_edit_stickfigure_warning_count;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable _animationToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable _animationToolTable2;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable _appToolTable;
    private org.fortheloss.framework.Assets _assetsRef;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _backgroundTR;
    private boolean _calculatedScissors;
    private boolean _calculatedScissorsLeftHandMode;
    private int _callbackAndroidRequestStoragePermission;
    private int _callbackImageLoadType;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _cameraScrollPane;
    private float _cameraStartRotation;
    private float _cameraStartX;
    private float _cameraStartY;
    private float _cameraStartZoom;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable _cameraToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable _collapseableMovieclipFiltersToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable _collapseableSpriteFiltersToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable _collapseableStickfigureFiltersToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _currentActiveScrollPaneRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _defaultScrollPane;
    private org.fortheloss.sticknodes.animationscreen.dialogs.ExportDialog _exportDialogRef;
    private org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog _exportMP4DialogRef;
    private org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog _exportPNGDialogRef;
    private org.fortheloss.sticknodes.animationscreen.IDrawableFigure _figureToJoinRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _frameScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable _frameToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable _horizontalLibraryToolTables;
    private org.fortheloss.sticknodes.animationscreen.dialogs.IsSavingDialog _isSavingDialogRef;
    private boolean _isWaitingForUserToChooseStickfigure;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable _jumpToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable _libraryToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable _mcLibraryToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable _movieclipFiltersToolTable;
    private org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsImportingDialog _movieclipIsImportingDialogRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _movieclipScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable _movieclipToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable _permanentAnimationToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _playingScrollPane;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable _projectToolTable;
    private org.fortheloss.sticknodes.animationscreen.dialogs.SaveAsDialog _saveAsDialogRef;
    private com.badlogic.gdx.math.Rectangle _scissorBounds;
    private com.badlogic.gdx.math.Rectangle _scissorLeftHandModeBounds;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> _scrollPanes;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable _segmentMainNodeToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable _segmentToolTable;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable _simpleTextfieldToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable _spriteFiltersToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable _spriteLibraryToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _spriteScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable _spriteToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable _stickfigureFiltersToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _stickfigureScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable _stickfigureToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _textfieldScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable _textfieldToolTable;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> _toolTables;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _userChooseStickfigureScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable _userChooseStickfigureToolTable;
    private org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog _waitForLoadedImageDialog;
    private com.badlogic.gdx.scenes.scene2d.Actor[] mExtrasForJoinPrompt;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> mSegmentToolsCellRef;













    private class MCImportRunnable implements java.lang.Runnable {
        private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
        private com.badlogic.gdx.files.FileHandle _fileHandleRef;
        private boolean _hideStickfiguresOnImport;
        private org.fortheloss.sticknodes.movieclip.MCMovieclipSource _mcSourceRef;
        private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule this$0;


        /* renamed from: -$$Nest$fget_animateToolsModuleRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule m682$$Nest$fget_animateToolsModuleRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.MCImportRunnable r0) {
                org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r0._animateToolsModuleRef
                return r0
        }

        /* renamed from: -$$Nest$fget_mcSourceRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.movieclip.MCMovieclipSource m683$$Nest$fget_mcSourceRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.MCImportRunnable r0) {
                org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r0._mcSourceRef
                return r0
        }

        /* renamed from: -$$Nest$fput_animateToolsModuleRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m684$$Nest$fput_animateToolsModuleRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.MCImportRunnable r0, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1) {
                r0._animateToolsModuleRef = r1
                return
        }

        /* renamed from: -$$Nest$fput_fileHandleRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m685$$Nest$fput_fileHandleRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.MCImportRunnable r0, com.badlogic.gdx.files.FileHandle r1) {
                r0._fileHandleRef = r1
                return
        }

        /* renamed from: -$$Nest$fput_mcSourceRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m686$$Nest$fput_mcSourceRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.MCImportRunnable r0, org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1) {
                r0._mcSourceRef = r1
                return
        }

        /* renamed from: -$$Nest$fput_projectDataRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m687$$Nest$fput_projectDataRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.MCImportRunnable r0, org.fortheloss.sticknodes.data.ProjectData r1) {
                r0._projectDataRef = r1
                return
        }

        public MCImportRunnable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2, org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3, com.badlogic.gdx.files.FileHandle r4, org.fortheloss.sticknodes.data.ProjectData r5, boolean r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0._animateToolsModuleRef = r2
                r0._mcSourceRef = r3
                r0._fileHandleRef = r4
                r0._projectDataRef = r5
                r0._hideStickfiguresOnImport = r6
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                r0 = 250(0xfa, double:1.235E-321)
                java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L6
                goto La
            L6:
                r0 = move-exception
                r0.printStackTrace()
            La:
                org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r4._mcSourceRef
                com.badlogic.gdx.files.FileHandle r1 = r4._fileHandleRef
                org.fortheloss.sticknodes.data.ProjectData r2 = r4._projectDataRef
                boolean r3 = r4._hideStickfiguresOnImport
                boolean r0 = r0.open(r1, r2, r3)
                if (r0 == 0) goto L1d
                org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r4._mcSourceRef
                r1.recalculateAllNextFrameStickfigureIndicesForTweening()
            L1d:
                com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
                org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$MCImportRunnable$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$MCImportRunnable$1
                r2.<init>(r4, r0)
                r1.postRunnable(r2)
                return
        }
    }

    private class SaveRunnable implements java.lang.Runnable {
        private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
        private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule this$0;


        /* renamed from: -$$Nest$fget_animateToolsModuleRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule m688$$Nest$fget_animateToolsModuleRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.SaveRunnable r0) {
                org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r0._animateToolsModuleRef
                return r0
        }

        /* renamed from: -$$Nest$fput_animateToolsModuleRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m689$$Nest$fput_animateToolsModuleRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.SaveRunnable r0, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1) {
                r0._animateToolsModuleRef = r1
                return
        }

        /* renamed from: -$$Nest$fput_projectDataRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m690$$Nest$fput_projectDataRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.SaveRunnable r0, org.fortheloss.sticknodes.data.ProjectData r1) {
                r0._projectDataRef = r1
                return
        }

        public SaveRunnable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2, org.fortheloss.sticknodes.data.ProjectData r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0._animateToolsModuleRef = r2
                r0._projectDataRef = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                r0 = 1000(0x3e8, double:4.94E-321)
                java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L6
                goto La
            L6:
                r0 = move-exception
                r0.printStackTrace()
            La:
                org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
                org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1 = r3.this$0
                org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r1._animationScreenRef
                boolean r0 = r0.save(r1)
                com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
                org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$SaveRunnable$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$SaveRunnable$1
                r2.<init>(r3, r0)
                r1.postRunnable(r2)
                return
        }
    }

    /* renamed from: -$$Nest$fget_callbackImageLoadType, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m668$$Nest$fget_callbackImageLoadType(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            int r0 = r0._callbackImageLoadType
            return r0
    }

    /* renamed from: -$$Nest$fget_canvasModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CanvasModule m669$$Nest$fget_canvasModuleRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r0._canvasModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_currentActiveScrollPaneRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane m670$$Nest$fget_currentActiveScrollPaneRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r0._currentActiveScrollPaneRef
            return r0
    }

    /* renamed from: -$$Nest$fget_figureToJoinRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.IDrawableFigure m671$$Nest$fget_figureToJoinRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r0._figureToJoinRef
            return r0
    }

    /* renamed from: -$$Nest$fget_frameToolTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable m672$$Nest$fget_frameToolTable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r0._frameToolTable
            return r0
    }

    /* renamed from: -$$Nest$fget_framesModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.FramesModule m673$$Nest$fget_framesModuleRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r0._framesModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_isWaitingForUserToChooseStickfigure, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m674$$Nest$fget_isWaitingForUserToChooseStickfigure(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            boolean r0 = r0._isWaitingForUserToChooseStickfigure
            return r0
    }

    /* renamed from: -$$Nest$fget_movieclipScrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane m675$$Nest$fget_movieclipScrollPane(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r0._movieclipScrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_projectDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.ProjectData m676$$Nest$fget_projectDataRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            org.fortheloss.sticknodes.data.ProjectData r0 = r0._projectDataRef
            return r0
    }

    /* renamed from: -$$Nest$fget_sessionDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.SessionData m677$$Nest$fget_sessionDataRef(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            org.fortheloss.sticknodes.data.SessionData r0 = r0._sessionDataRef
            return r0
    }

    /* renamed from: -$$Nest$fget_spriteScrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane m678$$Nest$fget_spriteScrollPane(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r0._spriteScrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_stickfigureScrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane m679$$Nest$fget_stickfigureScrollPane(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r0._stickfigureScrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_userChooseStickfigureToolTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable m680$$Nest$fget_userChooseStickfigureToolTable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r0 = r0._userChooseStickfigureToolTable
            return r0
    }

    /* renamed from: -$$Nest$fput_callbackImageLoadType, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m681$$Nest$fput_callbackImageLoadType(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0, int r1) {
            r0._callbackImageLoadType = r1
            return
    }

    static {
            return
    }

    public AnimateToolsModule(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, com.badlogic.gdx.graphics.glutils.FrameBuffer r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0._cameraStartZoom = r1
            r2 = 0
            r0._cameraStartX = r2
            r0._cameraStartY = r2
            r0._cameraStartRotation = r1
            r1 = 0
            r0._calculatedScissors = r1
            r0._calculatedScissorsLeftHandMode = r1
            r0._isWaitingForUserToChooseStickfigure = r1
            r0._callbackImageLoadType = r1
            r0._callbackAndroidRequestStoragePermission = r1
            r0.setNeedsToBeDrawn()
            r0.addWidgetClickListener()
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$1
            r1.<init>(r0)
            r0.addListener(r1)
            return
    }

    private void actuallyExport() {
            r5 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L43
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isDeniedAccessToPhotos()
            if (r0 == 0) goto L33
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            java.lang.String r1 = "photosDeniedTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            boolean r4 = r4.isPro()
            if (r4 == 0) goto L25
            java.lang.String r4 = "Stick Nodes Pro"
            goto L27
        L25:
            java.lang.String r4 = "Stick Nodes"
        L27:
            r2[r3] = r4
            java.lang.String r3 = "iosPhotosDenied"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r3, r2)
            r0.showErrorDialog(r1, r2)
            return
        L33:
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportGifPngMp4Dialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportGifPngMp4Dialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r5._animationScreenRef
            r0.<init>(r1)
            r0.initialize(r5)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r5._animationScreenRef
            r1.addDialogToStage(r0)
            goto L54
        L43:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            java.lang.String r1 = "animationExportFailedTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "animationExportFailedInfo3"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
        L54:
            return
    }

    private void actuallyImportMovieclip() {
            r3 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L1b
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r1, r3)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r1.addDialogToStage(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.showAndroidOpenWithMessage()
            goto L2c
        L1b:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "errorImportingMCTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "errorImportingInfo3MC"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
        L2c:
            return
    }

    private void actuallyImportSound() {
            r3 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L1d
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportSoundDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r1, r3)
            org.fortheloss.framework.Assets r1 = r3._assetsRef
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r1.addDialogToStage(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.showAndroidOpenWithMessage()
            goto L2e
        L1d:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "errorImportingSoundTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "errorImportSoundInfo4"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
        L2e:
            return
    }

    private void actuallyImportStickfigure() {
            r3 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L1b
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r1, r3)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r1.addDialogToStage(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.showAndroidOpenWithMessage()
            goto L2c
        L1b:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "errorImportingTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "errorImportingInfo3"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
        L2c:
            return
    }

    private void actuallyLoadSpriteImage() {
            r3 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "about_to_load_sprite_image"
            r0.setCrashlyticsKeyString(r1, r2)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.Desktop
            if (r0 != r1) goto L44
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = "Stick Nodes/sprite.png"
            com.badlogic.gdx.files.FileHandle r0 = r0.external(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L29
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = "Stick Nodes/sprite.jpg"
            com.badlogic.gdx.files.FileHandle r0 = r0.external(r1)
        L29:
            boolean r1 = r0.exists()
            if (r1 == 0) goto L43
            com.badlogic.gdx.graphics.Pixmap r1 = new com.badlogic.gdx.graphics.Pixmap
            r1.<init>(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.CreateSpriteDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r3._animationScreenRef
            r0.<init>(r2, r3)
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r1.addDialogToStage(r0)
        L43:
            return
        L44:
            java.lang.Thread r0 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$10 r1 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$10
            r1.<init>(r3)
            r0.<init>(r1)
            r0.start()
            return
    }

    private void actuallyOpenProject() {
            r3 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L1b
            org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r1)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r1.addDialogToStage(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.showAndroidOpenWithMessage()
            goto L2c
        L1b:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "errorOpeningTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "errorOpeningInfo2"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
        L2c:
            return
    }

    private void actuallySave() {
            r2 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r2._projectDataRef
            java.lang.String r0 = r0.projectName
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14
            org.fortheloss.sticknodes.data.ProjectData r0 = r2._projectDataRef
            java.lang.String r0 = r0.projectName
            r2.saveProject(r0)
            goto L17
        L14:
            r2.saveAs()
        L17:
            return
    }

    private void actuallySaveAs() {
            r0 = this;
            r0.showSaveAsDialog()
            return
    }

    private void actuallySendFile() {
            r3 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L16
            org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.SendFileDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r1, r3)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r1.addDialogToStage(r0)
            goto L27
        L16:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "errorSubmittingTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "errorSubmittingInfo2"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
        L27:
            return
    }

    private void actuallySubmitStickfigure() {
            r3 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L18
            org.fortheloss.sticknodes.animationscreen.dialogs.PreSubmitStickfigureFormDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PreSubmitStickfigureFormDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r1)
            org.fortheloss.framework.Assets r1 = r3._assetsRef
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r1.addDialogToStage(r0)
            goto L29
        L18:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "errorSubmittingTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "errorSubmittingInfo2"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
        L29:
            return
    }

    private org.fortheloss.sticknodes.animationscreen.IDrawableFigure getCurrentlySelectedFigure() {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto Le
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
        Le:
            if (r0 != 0) goto L16
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
        L16:
            return r0
    }

    private void showLoopDialog() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "aboutLoopingTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "aboutLoopingInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
            return
    }

    private void showSaveAsDialog() {
            r3 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L1a
            org.fortheloss.sticknodes.animationscreen.dialogs.SaveAsDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.SaveAsDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r1, r3)
            r3._saveAsDialogRef = r0
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.SaveAsDialog r1 = r3._saveAsDialogRef
            r0.addDialogToStage(r1)
            goto L2b
        L1a:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "errorSavingTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "errorSavingInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
        L2b:
            return
    }

    private void showTweeningDialog() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "aboutTweeningTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "aboutTweeningInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void act(float r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 == 0) goto L9
            return
        L9:
            super.act(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r1._currentActiveScrollPaneRef
            if (r2 == 0) goto L31
            boolean r2 = r2.isFlinging()
            if (r2 != 0) goto L2e
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r1._currentActiveScrollPaneRef
            boolean r2 = r2.isPanning()
            if (r2 != 0) goto L2e
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r1._currentActiveScrollPaneRef
            float r2 = r2.getVisualScrollY()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r1._currentActiveScrollPaneRef
            float r0 = r0.getScrollY()
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L31
        L2e:
            r1.setNeedsToBeDrawn()
        L31:
            boolean r2 = org.fortheloss.sticknodes.App.BACK_KEY_PRESSED
            if (r2 == 0) goto L42
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsImportingDialog r2 = r1._movieclipIsImportingDialogRef
            if (r2 == 0) goto L42
            boolean r2 = r2.isShowing()
            if (r2 == 0) goto L42
            r2 = 0
            org.fortheloss.sticknodes.App.BACK_KEY_PRESSED = r2
        L42:
            return
    }

    public void actuallyImportMovieclipFile(com.badlogic.gdx.files.FileHandle r11, boolean r12) {
            r10 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "AnimateToolsModule.importMovieclipFile()"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = new org.fortheloss.sticknodes.movieclip.MCMovieclipSource
            r0.<init>()
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsImportingDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsImportingDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r10._animationScreenRef
            org.fortheloss.framework.Assets r3 = r10._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r5 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r6 = 1
            java.lang.Object r3 = r3.get(r4, r5, r6)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            java.lang.String r4 = "loading_spinner"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r3.findRegion(r4)
            r1.<init>(r2, r3)
            r10._movieclipIsImportingDialogRef = r1
            r1.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r10._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsImportingDialog r2 = r10._movieclipIsImportingDialogRef
            r1.addDialogToStage(r2)
            java.lang.Thread r1 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$MCImportRunnable r2 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$MCImportRunnable
            org.fortheloss.sticknodes.data.ProjectData r8 = r10._projectDataRef
            r3 = r2
            r4 = r10
            r5 = r10
            r6 = r0
            r7 = r11
            r9 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.<init>(r2)
            r1.start()
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsImportingDialog r11 = r10._movieclipIsImportingDialogRef
            r11.setMCToReadFrom(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            r11.resetSavePromptTimer()
            return
    }

    public void addMovieclip(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.AddMCAsDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.AddMCAsDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            org.fortheloss.sticknodes.data.ProjectData r1 = r2._projectDataRef
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r1.getLibraryMovieclip(r3)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0.initialize(r3, r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.addDialogToStage(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void addSprite(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r2._projectDataRef
            org.fortheloss.sticknodes.sprite.ISpriteSource r3 = r0.getLibrarySprite(r3)
            boolean r0 = r3 instanceof org.fortheloss.sticknodes.sprite.SpriteSource
            r1 = 1
            if (r0 == 0) goto L1b
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = new org.fortheloss.sticknodes.sprite.SpriteRef
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteSource r3 = (org.fortheloss.sticknodes.sprite.SpriteSource) r3
            r0.setSpriteSource(r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.addSprite(r0, r1, r1)
            goto L2a
        L1b:
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r0 = new org.fortheloss.sticknodes.sprite.SpriteGroupRef
            r0.<init>()
            org.fortheloss.sticknodes.sprite.SpriteGroupSource r3 = (org.fortheloss.sticknodes.sprite.SpriteGroupSource) r3
            r0.setSpriteGroupSource(r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.addSprite(r0, r1, r1)
        L2a:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void addStickfigure(int r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.data.ProjectData r2 = r3._projectDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r2.getLibraryStickfigure(r4)
            r1.<init>(r4)
            r4 = 1
            r0.addStickfigure(r1, r4, r4)
            return
    }

    public void addTextfield() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.TextfieldBox r1 = new org.fortheloss.sticknodes.TextfieldBox
            org.fortheloss.sticknodes.data.ProjectData r2 = r3._projectDataRef
            org.fortheloss.sticknodes.animationscreen.FontLoader r2 = r2.getFontLoader()
            r1.<init>(r2)
            r2 = 1
            r0.addTextfield(r1, r2, r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void addTweenedFrame(int r3, boolean r4, boolean r5) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            r1 = 1
            boolean r3 = r0.addTweenedFrame(r3, r4, r5, r1)
            if (r3 != 0) goto L23
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            java.lang.String r4 = "tweenedFrameErrorTitle"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r5 = "tweenedFrameErrorInfo"
            java.lang.String r5 = org.fortheloss.sticknodes.App.localize(r5)
            r3.showErrorDialog(r4, r5)
        L23:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.maybeUpdateJoinChains()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void addTweenedFrames(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            r1 = 1
            boolean r3 = r0.addTweenedFrames(r3, r1)
            if (r3 != 0) goto L23
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            java.lang.String r0 = "tweenedFrameErrorTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "tweenedFrameErrorInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r3.showErrorDialog(r0, r1)
        L23:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.maybeUpdateJoinChains()
            return
    }

    public void alignText(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.setTextfieldAlign(r3, r1)
            return
    }

    public void beginStickfigurePacks() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.beginPackScreenshotter()
            return
    }

    public void beginStickfigureScreenshots() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.beginScreenshotter()
            return
    }

    public void breakApartMC() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getCurrentlySelectedMC()
            r0.breakApartMC(r1)
            return
    }

    public void centerCamera() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.centerCamera(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void centerFigure() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.centerFigure(r0)
            return
    }

    public void changeMode(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            int r0 = r0.getMode()
            if (r0 != r2) goto Lc
            r0 = 2
            if (r2 == r0) goto Lc
            return
        Lc:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.setSessionMode(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r2 = r1._permanentAnimationToolTable
            r2.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void clearFigureFilters() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.clearFigureFilters(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r2._stickfigureFiltersToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r2._movieclipFiltersToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r2._spriteFiltersToolTable
            r0.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void clearFrame() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$11 r0 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$11
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r2, r1)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void clearSound() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            r0.clearSound(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r2._frameToolTable
            r0.update()
            return
    }

    public void clearSoundSearchFilter() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r1._frameToolTable
            r0.clearSoundSearchFilter()
            return
    }

    public void copyCamera() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.copyCamera(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0 = r2._cameraToolTable
            r0.update()
            return
    }

    public void copyCameraWobbleProperties() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.copyCameraWobbleProperties(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0 = r2._cameraToolTable
            r0.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void copyFigureFilters() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.copyFigureFilters(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r2._stickfigureFiltersToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r2._movieclipFiltersToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r2._spriteFiltersToolTable
            r0.update()
            return
    }

    public void copyMC() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r3._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r3._animationScreenRef
            r2.copyMC(r0, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = r3._movieclipToolTable
            r0.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void copySound() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            r0.copySound(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r2._frameToolTable
            r0.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void copySprite() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r3._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r3._animationScreenRef
            r2.copySprite(r0, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = r3._spriteToolTable
            r0.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void copyStickfigure(boolean r5) {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r4._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r3 = r4._projectDataRef
            int r3 = r3.getUID()
            r2.copyStickfigure(r0, r5, r1, r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r5 = r4._stickfigureToolTable
            r5.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void copyStickfigurePropertiesBundle() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r0.copyStickfigurePropertiesBundle(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r2._stickfigureToolTable
            r0.update()
            return
    }

    public void copyText() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.copyTextfieldText(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0 = r2._textfieldToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable r0 = r2._simpleTextfieldToolTable
            r0.update()
            return
    }

    public void copyTextfield() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.copyTextfield(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0 = r2._textfieldToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable r0 = r2._simpleTextfieldToolTable
            r0.update()
            return
    }

    public void createNewMC() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r1 = 0
            r2 = -1
            r3 = 1
            r0.setToMovieclipScreen(r1, r2, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void createNewStickfigure() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r1 = 0
            r2 = 0
            r0.setToCreateScreen(r1, r2)
            return
    }

    public void deleteMC() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getCurrentlySelectedMC()
            r0.deleteMC(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void deleteSound(int r3) {
            r2 = this;
            if (r3 >= 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.animationscreen.dialogs.DeleteSoundDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.DeleteSoundDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            org.fortheloss.sticknodes.data.ProjectData r1 = r2._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r1 = r1.librarySoundDatas
            java.lang.Object r1 = r1.get(r3)
            org.fortheloss.sticknodes.data.SoundData r1 = (org.fortheloss.sticknodes.data.SoundData) r1
            java.lang.String r1 = r1.fileName
            r0.initialize(r3, r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.addDialogToStage(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void deleteSprite() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.deleteSpriteRef(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void deleteStickfigure(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r0.deleteStickfigure(r1, r3)
            return
    }

    public void deleteTextfield() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.deleteTextfield(r1)
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
            r3._projectDataRef = r0
            r3._sessionDataRef = r0
            r3._assetsRef = r0
            r3._canvasModuleRef = r0
            r3._framesModuleRef = r0
            r3._backgroundTR = r0
            r3._exportDialogRef = r0
            r3._exportMP4DialogRef = r0
            r3._exportPNGDialogRef = r0
            r3._saveAsDialogRef = r0
            r3._isSavingDialogRef = r0
            r3._movieclipIsImportingDialogRef = r0
            r3._currentActiveScrollPaneRef = r0
            r3._defaultScrollPane = r0
            r3._playingScrollPane = r0
            r3._frameScrollPane = r0
            r3._stickfigureScrollPane = r0
            r3._spriteScrollPane = r0
            r3._movieclipScrollPane = r0
            r3._textfieldScrollPane = r0
            r3._cameraScrollPane = r0
            r3._userChooseStickfigureScrollPane = r0
            r3._appToolTable = r0
            r3._permanentAnimationToolTable = r0
            r3._jumpToolTable = r0
            r3._projectToolTable = r0
            r3._animationToolTable = r0
            r3._animationToolTable2 = r0
            r3._horizontalLibraryToolTables = r0
            r3._libraryToolTable = r0
            r3._mcLibraryToolTable = r0
            r3._spriteLibraryToolTable = r0
            r3._simpleTextfieldToolTable = r0
            r3._frameToolTable = r0
            r3._stickfigureToolTable = r0
            r3._stickfigureFiltersToolTable = r0
            r3._collapseableStickfigureFiltersToolTable = r0
            r3._segmentToolTable = r0
            r3._segmentMainNodeToolTable = r0
            r3._spriteToolTable = r0
            r3._spriteFiltersToolTable = r0
            r3._collapseableSpriteFiltersToolTable = r0
            r3._movieclipToolTable = r0
            r3._movieclipFiltersToolTable = r0
            r3._collapseableMovieclipFiltersToolTable = r0
            r3._textfieldToolTable = r0
            r3._cameraToolTable = r0
            r3._userChooseStickfigureToolTable = r0
            r3.mSegmentToolsCellRef = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r1 = r3._waitForLoadedImageDialog
            if (r1 == 0) goto L78
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r1 = r1.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            if (r1 == 0) goto L76
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r1 = r3._waitForLoadedImageDialog
            r1.hideImmediately()
        L76:
            r3._waitForLoadedImageDialog = r0
        L78:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r1 = r3._toolTables
            if (r1 == 0) goto L94
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L82:
            if (r1 < 0) goto L92
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r2 = r3._toolTables
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r2 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L82
        L92:
            r3._toolTables = r0
        L94:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r1 = r3._scrollPanes
            if (r1 == 0) goto Lb0
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L9e:
            if (r1 < 0) goto Lae
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r2 = r3._scrollPanes
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L9e
        Lae:
            r3._scrollPanes = r0
        Lb0:
            r3._scissorBounds = r0
            r3._scissorLeftHandModeBounds = r0
            r3._figureToJoinRef = r0
            r3.mExtrasForJoinPrompt = r0
            super.dispose()
            return
    }

    public void downloadStickfigures() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$9 r0 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$9
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r2, r1)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r18, float r19) {
            r17 = this;
            r0 = r17
            r12 = r18
            boolean r1 = r0._needsToBeDrawn
            if (r1 == 0) goto L159
            r1 = 0
            r0._needsToBeDrawn = r1
            boolean r1 = r0._calculatedScissors
            r13 = 1
            if (r1 != 0) goto L5b
            com.badlogic.gdx.math.Rectangle r1 = new com.badlogic.gdx.math.Rectangle
            r1.<init>()
            r0._scissorBounds = r1
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r17.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r17.getStage()
            com.badlogic.gdx.graphics.Camera r3 = r2.getCamera()
            int r2 = r1.getScreenX()
            float r4 = (float) r2
            int r2 = r1.getScreenY()
            float r5 = (float) r2
            int r2 = r1.getScreenWidth()
            float r6 = (float) r2
            int r1 = r1.getScreenHeight()
            float r7 = (float) r1
            com.badlogic.gdx.math.Matrix4 r8 = r18.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r9 = new com.badlogic.gdx.math.Rectangle
            float r1 = r17.getX()
            float r2 = r17.getY()
            float r10 = r17.getWidth()
            float r11 = r17.getHeight()
            r9.<init>(r1, r2, r10, r11)
            com.badlogic.gdx.math.Rectangle r10 = r0._scissorBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r3, r4, r5, r6, r7, r8, r9, r10)
            r0._calculatedScissors = r13
        L5b:
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r1 = r0._fboRef
            r1.bind()
            r18.flush()
            com.badlogic.gdx.math.Rectangle r1 = r0._scissorBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r1)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r14 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r1.glClearColor(r14, r14, r14, r15)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r11 = 16384(0x4000, float:2.2959E-41)
            r1.glClear(r11)
            r12.setColor(r15, r15, r15, r15)
            com.badlogic.gdx.graphics.g2d.TextureRegion r2 = r0._backgroundTR
            float r1 = r17.getX()
            float r3 = r17.getWidth()
            float r3 = r3 + r1
            float r4 = r17.getY()
            r5 = 0
            r6 = 0
            float r7 = r17.getHeight()
            float r8 = r17.getWidth()
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r16 = 1119092736(0x42b40000, float:90.0)
            r1 = r18
            r11 = r16
            r1.draw(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            super.draw(r18, r19)
            r18.flush()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
            org.fortheloss.sticknodes.data.SessionData r1 = r0._sessionDataRef
            boolean r1 = r1.getIsLeftHandMode()
            if (r1 == 0) goto L156
            boolean r1 = r0._calculatedScissorsLeftHandMode
            if (r1 != 0) goto L115
            com.badlogic.gdx.math.Rectangle r1 = new com.badlogic.gdx.math.Rectangle
            r1.<init>()
            r0._scissorLeftHandModeBounds = r1
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r17.getStage()
            com.badlogic.gdx.utils.viewport.Viewport r1 = r1.getViewport()
            com.badlogic.gdx.scenes.scene2d.Stage r2 = r17.getStage()
            com.badlogic.gdx.graphics.Camera r3 = r2.getCamera()
            int r2 = r1.getScreenX()
            float r4 = (float) r2
            int r2 = r1.getScreenY()
            float r5 = (float) r2
            int r2 = r1.getScreenWidth()
            float r6 = (float) r2
            int r1 = r1.getScreenHeight()
            float r7 = (float) r1
            com.badlogic.gdx.math.Matrix4 r8 = r18.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r9 = new com.badlogic.gdx.math.Rectangle
            float r1 = r17.getX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r2 = r0._permanentAnimationToolTable
            float r2 = r2.getX()
            float r1 = r1 + r2
            float r2 = r17.getY()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r10 = r0._permanentAnimationToolTable
            float r10 = r10.getY()
            float r2 = r2 + r10
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r10 = r0._permanentAnimationToolTable
            float r10 = r10.getWidth()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r11 = r0._permanentAnimationToolTable
            float r11 = r11.getHeight()
            r9.<init>(r1, r2, r10, r11)
            com.badlogic.gdx.math.Rectangle r10 = r0._scissorLeftHandModeBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r3, r4, r5, r6, r7, r8, r9, r10)
            r0._calculatedScissorsLeftHandMode = r13
        L115:
            com.badlogic.gdx.math.Rectangle r1 = r0._scissorLeftHandModeBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r1)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r1.glClearColor(r14, r14, r14, r15)
            com.badlogic.gdx.graphics.GL20 r1 = com.badlogic.gdx.Gdx.gl
            r2 = 16384(0x4000, float:2.2959E-41)
            r1.glClear(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r1 = r0._permanentAnimationToolTable
            float r1 = r1.getX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r2 = r0._permanentAnimationToolTable
            float r2 = r2.getY()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r3 = r0._permanentAnimationToolTable
            float r4 = r17.getX()
            float r4 = r4 + r1
            float r5 = r17.getY()
            float r5 = r5 + r2
            r3.setPosition(r4, r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r3 = r0._permanentAnimationToolTable
            r4 = r19
            r3.draw(r12, r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r3 = r0._permanentAnimationToolTable
            r3.setPosition(r1, r2)
            super.draw(r18, r19)
            r18.flush()
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.popScissors()
        L156:
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
        L159:
            return
    }

    public void editMC(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.EditMCDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.EditMCDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            r0.initialize(r2, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.addDialogToStage(r0)
            return
    }

    public void editMCInPlace() {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r4._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r2 = r4._projectDataRef
            int r3 = r0.getLibraryID()
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = r2.getLibraryMovieclip(r3)
            int r0 = r0.getCurrentFrameIndex()
            r3 = 1
            r1.setToMovieclipScreen(r2, r0, r3)
            return
    }

    public void editMCResult(boolean r4, int r5) {
            r3 = this;
            r0 = 1
            r1 = -1
            if (r4 == 0) goto L10
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r2 = r3._projectDataRef
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r5 = r2.getLibraryMovieclip(r5)
            r4.setToMovieclipScreen(r5, r1, r0)
            goto L23
        L10:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r4 = new org.fortheloss.sticknodes.movieclip.MCMovieclipSource
            org.fortheloss.sticknodes.data.ProjectData r2 = r3._projectDataRef
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r5 = r2.getLibraryMovieclip(r5)
            r4.<init>(r5)
            r4.setLibraryID(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r3._animationScreenRef
            r5.setToMovieclipScreen(r4, r1, r0)
        L23:
            return
    }

    public void editMovieclipImportsList() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.showMovieclipImportListEditorDialog(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void editSelectedStickfigure() {
            r5 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            int r0 = r0.getLibraryID()
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.show_edit_stickfigure_warning_count
            r2 = 2
            r3 = 1
            if (r1 >= r2) goto L43
            org.fortheloss.sticknodes.data.SessionData r1 = r5._sessionDataRef
            boolean r1 = r1.getNerdModeEnabled()
            if (r1 != 0) goto L43
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.show_edit_stickfigure_warning_count
            int r1 = r1 + r3
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.show_edit_stickfigure_warning_count = r1
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$8 r1 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$8
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r5._animationScreenRef
            r1.<init>(r5, r2, r0)
            java.lang.String r0 = "editStickfigureTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r2 = "editStickfigureInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "okay"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r4 = 0
            r1.initialize(r0, r2, r3, r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            r0.addDialogToStage(r1)
            goto L54
        L43:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r5._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.data.ProjectData r4 = r5._projectDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r4.getLibraryStickfigure(r0)
            r2.<init>(r0, r3)
            r0 = 0
            r1.setToCreateScreen(r2, r0)
        L54:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void editSpriteImportsList() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.showSpriteImportListEditorDialog(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void editStickfigure(int r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.data.ProjectData r2 = r3._projectDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r2.getLibraryStickfigure(r4)
            r2 = 1
            r1.<init>(r4, r2)
            r4 = 0
            r0.setToCreateScreen(r1, r4)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void editStickfigureImportsList() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.showStickfigureImportListEditorDialog(r1)
            return
    }

    public void enableCulling(boolean r1) {
            r0 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModuleRef
            r1.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModuleRef
            r1.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r1 = r0._permanentAnimationToolTable
            r1.update()
            r0.setNeedsToBeDrawn()
            return
    }

    public void export() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallyExport()
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void flipFigureX(boolean r5) {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r4.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            if (r5 == 0) goto L3f
            boolean r5 = r0.isJoined()
            r1 = 1
            if (r5 == 0) goto L39
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r0.getJoinedToNode()
            float r5 = r5.getAngle()
            r2 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 % r2
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L21
            float r5 = r5 + r2
        L21:
            r2 = 1110704128(0x42340000, float:45.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L33
            r2 = 1124532224(0x43070000, float:135.0)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 > 0) goto L33
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r5.flipFigureY(r0, r1)
            goto L45
        L33:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r5.flipFigureX(r0, r1)
            goto L45
        L39:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r5.flipFigureX(r0, r1)
            goto L45
        L3f:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r1 = 0
            r5.flipFigureX(r0, r1)
        L45:
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 == 0) goto L59
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r5 = r4._stickfigureToolTable
            r5.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r5 = r4._segmentToolTable
            r5.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r5 = r4._segmentMainNodeToolTable
            r5.update()
            goto L68
        L59:
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r5 == 0) goto L63
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r5 = r4._spriteToolTable
            r5.update()
            goto L68
        L63:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r5 = r4._movieclipToolTable
            r5.update()
        L68:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void flipFigureY(boolean r5) {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r4.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            if (r5 == 0) goto L3f
            boolean r5 = r0.isJoined()
            r1 = 1
            if (r5 == 0) goto L39
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r0.getJoinedToNode()
            float r5 = r5.getAngle()
            r2 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 % r2
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L21
            float r5 = r5 + r2
        L21:
            r2 = 1110704128(0x42340000, float:45.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L33
            r2 = 1124532224(0x43070000, float:135.0)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 > 0) goto L33
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r5.flipFigureX(r0, r1)
            goto L45
        L33:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r5.flipFigureY(r0, r1)
            goto L45
        L39:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r5.flipFigureY(r0, r1)
            goto L45
        L3f:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r1 = 0
            r5.flipFigureY(r0, r1)
        L45:
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r5 == 0) goto L59
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r5 = r4._stickfigureToolTable
            r5.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r5 = r4._segmentToolTable
            r5.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r5 = r4._segmentMainNodeToolTable
            r5.update()
            goto L68
        L59:
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r5 == 0) goto L63
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r5 = r4._spriteToolTable
            r5.update()
            goto L68
        L63:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r5 = r4._movieclipToolTable
            r5.update()
        L68:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void flipSegmentX(boolean r3) {
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
            r0.flipSegmentX(r1, r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r3 = r2._segmentToolTable
            r3.update()
        L27:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void flipSegmentY(boolean r3) {
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
            r0.flipSegmentY(r1, r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r3 = r2._segmentToolTable
            r3.update()
        L27:
            return
    }

    public void fullscreenChanged() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r2._animationToolTable
            r1 = 1
            r0.update(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r2._animationToolTable2
            r0.update(r1)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public org.fortheloss.sticknodes.data.IFrameData getCurrentFrame() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r1._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.IDrawableFigure getFigureToJoin() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r1._figureToJoinRef
            return r0
    }

    public void getPro() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$6 r0 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$6
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r2, r1)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public com.badlogic.gdx.graphics.glutils.FrameBuffer getScreenFBO() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r0 = r0.getScreenFBO()
            return r0
    }

    public void goToWebsite() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$7 r0 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$7
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r2, r1)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    public void importMovieclip() {
            r2 = this;
            r0 = 0
            r1 = -1
            r2.importMovieclip(r0, r1)
            return
    }

    public void importMovieclip(java.lang.String r1, int r2) {
            r0 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.oneTimeUsePrefix = r1
            if (r2 < 0) goto L6
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportMovieclipDialog.oneTimeSort = r2
        L6:
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.androidHasStoragePermission()
            if (r1 == 0) goto L12
            r0.actuallyImportMovieclip()
            goto L25
        L12:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            r1.<init>(r2, r0)
            r1.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            r2.addDialogToStage(r1)
            r1 = 11
            r0._callbackAndroidRequestStoragePermission = r1
        L25:
            return
    }

    public void importMovieclipFile(com.badlogic.gdx.files.FileHandle r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipHideImportedStickfiguresDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipHideImportedStickfiguresDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            org.fortheloss.framework.Assets r1 = r2._assetsRef
            r0.initialize(r3, r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.addDialogToStage(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void importSound() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallyImportSound()
            goto L1f
        Lc:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            r0 = 8
            r2._callbackAndroidRequestStoragePermission = r0
        L1f:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void importStickfigure(java.lang.String r2) {
            r1 = this;
            r0 = -1
            r1.importStickfigure(r2, r0)
            return
    }

    public void importStickfigure(java.lang.String r1, int r2) {
            r0 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.oneTimeUsePrefix = r1
            if (r2 < 0) goto L6
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.oneTimeSort = r2
        L6:
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.androidHasStoragePermission()
            if (r1 == 0) goto L12
            r0.actuallyImportStickfigure()
            goto L24
        L12:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            r1.<init>(r2, r0)
            r1.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r0._animationScreenRef
            r2.addDialogToStage(r1)
            r1 = 7
            r0._callbackAndroidRequestStoragePermission = r1
        L24:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.Module
    public void initialize(org.fortheloss.framework.Assets r15) {
            r14 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            super.initialize(r15)
            r14._assetsRef = r15
            java.lang.String r1 = org.fortheloss.sticknodes.App.animationMenuAtlas
            r2 = 1
            java.lang.Object r1 = r15.get(r1, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r3 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            java.lang.Object r3 = r15.get(r3, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            java.lang.String r4 = org.fortheloss.sticknodes.App.colorPickerAtlas
            java.lang.Object r15 = r15.get(r4, r0, r2)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r15 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r15
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r14._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r0 = r0.getProjectData()
            r14._projectDataRef = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r14._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            r14._sessionDataRef = r0
            boolean r0 = r0.getIsLeftHandMode()
            java.lang.String r4 = "square"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r1.findRegion(r4)
            r14._backgroundTR = r4
            r4 = 1139277824(0x43e80000, float:464.0)
            if (r0 != 0) goto L50
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r14.getStage()
            float r4 = r4.getHeight()
            r14.setSize(r5, r4)
            goto L66
        L50:
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r4
            com.badlogic.gdx.scenes.scene2d.Stage r4 = r14.getStage()
            float r4 = r4.getHeight()
            r6 = 1135345664(0x43ac0000, float:344.0)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r6
            float r4 = r4 - r7
            r14.setSize(r5, r4)
        L66:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTableGrayBackground()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r14._scrollPanes = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r14._toolTables = r5
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r14._canvasModuleRef
            org.fortheloss.sticknodes.data.ProjectData r7 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r8 = r14._sessionDataRef
            r5.<init>(r14, r6, r7, r8)
            r14._permanentAnimationToolTable = r5
            r5.initialize(r1, r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r5 = r14._permanentAnimationToolTable
            float r6 = r14.getWidth()
            r5.setWidth(r6)
            r5 = 0
            if (r0 != 0) goto La5
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r6 = r14._permanentAnimationToolTable
            float r7 = r14.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r8 = r14._permanentAnimationToolTable
            float r8 = r8.getHeight()
            float r7 = r7 - r8
            r6.setPosition(r5, r7)
            goto Lc7
        La5:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r6 = r14._permanentAnimationToolTable
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r14.getStage()
            float r7 = r7.getWidth()
            float r8 = r14.getWidth()
            float r7 = r7 - r8
            float r7 = -r7
            com.badlogic.gdx.scenes.scene2d.Stage r8 = r14.getStage()
            float r8 = r8.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r9 = r14._permanentAnimationToolTable
            float r9 = r9.getHeight()
            float r8 = r8 - r9
            r6.setPosition(r7, r8)
        Lc7:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r6 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r7 = r14._permanentAnimationToolTable
            r6.add(r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r6 = r14._permanentAnimationToolTable
            r14.addActor(r6)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r14._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r8 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r9 = r14._sessionDataRef
            r6.<init>(r7, r14, r8, r9)
            r14._jumpToolTable = r6
            r6.initialize(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r6 = r14._jumpToolTable
            float r7 = r14.getWidth()
            r6.setWidth(r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r6 = r14._jumpToolTable
            r6.setPosition(r5, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r6 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r7 = r14._jumpToolTable
            r6.add(r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r6 = r14._jumpToolTable
            r14.addActor(r6)
            r6 = 1109393408(0x42200000, float:40.0)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r6
            int r6 = (int) r7
            float r7 = r14.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r8 = r14._permanentAnimationToolTable
            float r8 = r8.getHeight()
            float r7 = r7 - r8
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r8 = r14._jumpToolTable
            float r8 = r8.getHeight()
            float r7 = r7 - r8
            float r8 = (float) r6
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r9 = r9 * r8
            float r7 = r7 - r9
            if (r0 == 0) goto L12b
            float r0 = r14.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r7 = r14._jumpToolTable
            float r7 = r7.getHeight()
            float r0 = r0 - r7
            float r7 = r0 - r8
        L12b:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r9 = r14.getWidth()
            r0.<init>(r6, r9)
            r14._defaultScrollPane = r0
            float r9 = r14.getWidth()
            r0.setSize(r9, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r9 = r14._jumpToolTable
            float r9 = r9.getHeight()
            r10 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r10
            float r9 = r9 + r8
            int r9 = (int) r9
            float r9 = (float) r9
            r0.setPosition(r5, r9)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r14._defaultScrollPane
            r0.add(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable
            org.fortheloss.sticknodes.data.ProjectData r9 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r10 = r14._sessionDataRef
            r0.<init>(r14, r9, r10)
            r14._appToolTable = r0
            r0.initialize(r1, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable r9 = r14._appToolTable
            r0.add(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AppToolTable r9 = r14._appToolTable
            r0.add(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable
            org.fortheloss.sticknodes.data.ProjectData r9 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r10 = r14._sessionDataRef
            r0.<init>(r14, r9, r10)
            r14._projectToolTable = r0
            r0.initialize(r1, r15, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r9 = r14._projectToolTable
            r0.add(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r9 = r14._projectToolTable
            r0.add(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable
            org.fortheloss.sticknodes.data.ProjectData r9 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r10 = r14._sessionDataRef
            r0.<init>(r14, r9, r10)
            r14._animationToolTable = r0
            org.fortheloss.sticknodes.data.ProjectData r9 = r14._projectDataRef
            r0.setFramesContainerRef(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r14._animationToolTable
            r9 = 0
            r0.initialize(r1, r4, r9)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r10 = r14._animationToolTable
            r0.add(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r10 = r14._animationToolTable
            r0.add(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable
            org.fortheloss.sticknodes.data.ProjectData r10 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r11 = r14._sessionDataRef
            r0.<init>(r14, r10, r11)
            r14._libraryToolTable = r0
            r0.initialize(r1, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r10 = r14._libraryToolTable
            r0.add(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable
            org.fortheloss.sticknodes.data.ProjectData r10 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r11 = r14._sessionDataRef
            r0.<init>(r14, r10, r11)
            r14._mcLibraryToolTable = r0
            r0.initialize(r1, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r10 = r14._mcLibraryToolTable
            r0.add(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable
            org.fortheloss.sticknodes.data.ProjectData r10 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r11 = r14._sessionDataRef
            r0.<init>(r14, r10, r11)
            r14._spriteLibraryToolTable = r0
            r0.initialize(r1, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r10 = r14._spriteLibraryToolTable
            r0.add(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable
            org.fortheloss.sticknodes.data.ProjectData r10 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r11 = r14._sessionDataRef
            r0.<init>(r14, r10, r11)
            r14._horizontalLibraryToolTables = r0
            float r10 = r14.getWidth()
            r0.initialize(r10, r1, r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable r0 = r14._horizontalLibraryToolTables
            r10 = 3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable[] r11 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable[r10]
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r12 = r14._libraryToolTable
            r11[r9] = r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r12 = r14._mcLibraryToolTable
            r11[r2] = r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r12 = r14._spriteLibraryToolTable
            r13 = 2
            r11[r13] = r12
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.String r12 = "libraryToolsNew"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            r10[r9] = r12
            java.lang.String r12 = "mcLibraryToolsTitle"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            r10[r2] = r12
            java.lang.String r12 = "spriteLibraryToolsTitle"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            r10[r13] = r12
            r0.setTables(r11, r10)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable r10 = r14._horizontalLibraryToolTables
            r0.add(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable r10 = r14._horizontalLibraryToolTables
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r10)
            float r10 = r14.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r10)
            r10 = 8
            r0.align(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12)
            r14._simpleTextfieldToolTable = r0
            r0.initialize(r1, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable r11 = r14._simpleTextfieldToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable r11 = r14._simpleTextfieldToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r11 = r14.getWidth()
            r0.<init>(r6, r11)
            r14._playingScrollPane = r0
            float r11 = r14.getWidth()
            r0.setSize(r11, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._playingScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r11 = r14._jumpToolTable
            float r11 = r11.getHeight()
            float r11 = r11 + r8
            int r11 = (int) r11
            float r11 = (float) r11
            r0.setPosition(r5, r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r11 = r14._playingScrollPane
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12)
            r14._animationToolTable2 = r0
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            r0.setFramesContainerRef(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r14._animationToolTable2
            r0.initialize(r1, r4, r2)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r11 = r14._animationToolTable2
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._playingScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r11 = r14._animationToolTable2
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r11 = r14.getWidth()
            r0.<init>(r6, r11)
            r14._frameScrollPane = r0
            float r11 = r14.getWidth()
            r0.setSize(r11, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._frameScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r11 = r14._jumpToolTable
            float r11 = r11.getHeight()
            float r11 = r11 + r8
            int r11 = (int) r11
            float r11 = (float) r11
            r0.setPosition(r5, r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r11 = r14._frameScrollPane
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12)
            r14._frameToolTable = r0
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            r0.setFramesContainerRef(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r14._frameToolTable
            r0.initialize(r1, r15, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r11 = r14._frameToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._frameScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r11 = r14._frameToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$2 r0 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$2
            float r11 = r14.getWidth()
            r0.<init>(r14, r6, r11)
            r14._stickfigureScrollPane = r0
            float r11 = r14.getWidth()
            r0.setSize(r11, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r11 = r14._jumpToolTable
            float r11 = r11.getHeight()
            float r11 = r11 + r8
            int r11 = (int) r11
            float r11 = (float) r11
            r0.setPosition(r5, r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r11 = r14._stickfigureScrollPane
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12)
            r14._stickfigureToolTable = r0
            r0.initialize(r1, r15, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r11 = r14._stickfigureToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r11 = r14._stickfigureToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12, r9)
            r14._stickfigureFiltersToolTable = r0
            r0.setShowTitle(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r14._stickfigureFiltersToolTable
            r0.initialize(r1, r15, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r11 = r14._stickfigureFiltersToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12)
            r14._collapseableStickfigureFiltersToolTable = r0
            float r11 = r14.getWidth()
            r0.initialize(r11, r3, r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0 = r14._collapseableStickfigureFiltersToolTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r11 = r14._stickfigureFiltersToolTable
            java.lang.String r12 = "stickfigureFilters"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            r0.setToolTable(r11, r12)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r11 = r14._collapseableStickfigureFiltersToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r11 = r14._collapseableStickfigureFiltersToolTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r11)
            float r11 = r14.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r11)
            r0.align(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12)
            r14._segmentToolTable = r0
            r0.initialize(r1, r15, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r11 = r14._segmentToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r11 = r14._segmentToolTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r11)
            r14.mSegmentToolsCellRef = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12)
            r14._segmentMainNodeToolTable = r0
            r0.initialize(r1, r15, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r11 = r14._segmentMainNodeToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$3 r0 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$3
            float r11 = r14.getWidth()
            r0.<init>(r14, r6, r11)
            r14._spriteScrollPane = r0
            float r11 = r14.getWidth()
            r0.setSize(r11, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._spriteScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r11 = r14._jumpToolTable
            float r11 = r11.getHeight()
            float r11 = r11 + r8
            int r11 = (int) r11
            float r11 = (float) r11
            r0.setPosition(r5, r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r11 = r14._spriteScrollPane
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12)
            r14._spriteToolTable = r0
            r0.initialize(r1, r15, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r11 = r14._spriteToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._spriteScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r11 = r14._spriteToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._spriteScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12, r13)
            r14._spriteFiltersToolTable = r0
            r0.setShowTitle(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r14._spriteFiltersToolTable
            r0.initialize(r1, r15, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r11 = r14._spriteFiltersToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12)
            r14._collapseableSpriteFiltersToolTable = r0
            float r11 = r14.getWidth()
            r0.initialize(r11, r3, r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0 = r14._collapseableSpriteFiltersToolTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r11 = r14._spriteFiltersToolTable
            java.lang.String r12 = "spriteFiltersTitle"
            java.lang.String r12 = org.fortheloss.sticknodes.App.localize(r12)
            r0.setToolTable(r11, r12)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r11 = r14._collapseableSpriteFiltersToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._spriteScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r11 = r14._collapseableSpriteFiltersToolTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r11)
            float r11 = r14.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r11)
            r0.align(r10)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$4 r0 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$4
            float r11 = r14.getWidth()
            r0.<init>(r14, r6, r11)
            r14._movieclipScrollPane = r0
            float r11 = r14.getWidth()
            r0.setSize(r11, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._movieclipScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r11 = r14._jumpToolTable
            float r11 = r11.getHeight()
            float r11 = r11 + r8
            int r11 = (int) r11
            float r11 = (float) r11
            r0.setPosition(r5, r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r11 = r14._movieclipScrollPane
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12)
            r14._movieclipToolTable = r0
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r11 = r14._framesModuleRef
            r0.initialize(r1, r15, r4, r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r11 = r14._movieclipToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._movieclipScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r11 = r14._movieclipToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._movieclipScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12, r2)
            r14._movieclipFiltersToolTable = r0
            r0.setShowTitle(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r14._movieclipFiltersToolTable
            r0.initialize(r1, r15, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r11 = r14._movieclipFiltersToolTable
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable
            org.fortheloss.sticknodes.data.ProjectData r11 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r12 = r14._sessionDataRef
            r0.<init>(r14, r11, r12)
            r14._collapseableMovieclipFiltersToolTable = r0
            float r11 = r14.getWidth()
            r0.initialize(r11, r3, r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0 = r14._collapseableMovieclipFiltersToolTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r3 = r14._movieclipFiltersToolTable
            java.lang.String r11 = "movieclipFilters"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            r0.setToolTable(r3, r11)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r3 = r14._collapseableMovieclipFiltersToolTable
            r0.add(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._movieclipScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r3 = r14._collapseableMovieclipFiltersToolTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r3)
            float r3 = r14.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            r0.align(r10)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r3 = r14.getWidth()
            r0.<init>(r6, r3)
            r14._textfieldScrollPane = r0
            float r3 = r14.getWidth()
            r0.setSize(r3, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._textfieldScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r3 = r14._jumpToolTable
            float r3 = r3.getHeight()
            float r3 = r3 + r8
            int r3 = (int) r3
            float r3 = (float) r3
            r0.setPosition(r5, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r3 = r14._textfieldScrollPane
            r0.add(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable
            org.fortheloss.sticknodes.data.ProjectData r3 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r10 = r14._sessionDataRef
            r0.<init>(r14, r3, r10)
            r14._textfieldToolTable = r0
            r0.initialize(r1, r15, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r15 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0 = r14._textfieldToolTable
            r15.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r15 = r14._textfieldScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0 = r14._textfieldToolTable
            r15.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r0 = r14.getWidth()
            r15.<init>(r6, r0)
            r14._cameraScrollPane = r15
            float r0 = r14.getWidth()
            r15.setSize(r0, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r15 = r14._cameraScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r14._jumpToolTable
            float r0 = r0.getHeight()
            float r0 = r0 + r8
            int r0 = (int) r0
            float r0 = (float) r0
            r15.setPosition(r5, r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r15 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._cameraScrollPane
            r15.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r14._framesModuleRef
            org.fortheloss.sticknodes.data.ProjectData r3 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r10 = r14._sessionDataRef
            r15.<init>(r14, r0, r3, r10)
            r14._cameraToolTable = r15
            r15.initialize(r1, r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r15 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0 = r14._cameraToolTable
            r15.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r15 = r14._cameraScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0 = r14._cameraToolTable
            r15.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r0 = r14.getWidth()
            r15.<init>(r6, r0)
            r14._userChooseStickfigureScrollPane = r15
            float r0 = r14.getWidth()
            r15.setSize(r0, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r15 = r14._userChooseStickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r14._jumpToolTable
            float r0 = r0.getHeight()
            float r0 = r0 + r8
            int r0 = (int) r0
            float r0 = (float) r0
            r15.setPosition(r5, r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r15 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._userChooseStickfigureScrollPane
            r15.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable
            org.fortheloss.sticknodes.data.ProjectData r0 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r1 = r14._sessionDataRef
            r15.<init>(r14, r0, r1)
            r14._userChooseStickfigureToolTable = r15
            r15.initialize(r4)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r15 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r0 = r14._userChooseStickfigureToolTable
            r15.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r15 = r14._userChooseStickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r0 = r14._userChooseStickfigureToolTable
            r15.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r15 = r14._defaultScrollPane
            r14._currentActiveScrollPaneRef = r15
            r14.addActor(r15)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r15 = r14._toolTables
            int r15 = r15.size()
            int r15 = r15 - r2
        L5f7:
            if (r15 < 0) goto L607
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            java.lang.Object r0 = r0.get(r15)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r0 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable) r0
            r0.update()
            int r15 = r15 + (-1)
            goto L5f7
        L607:
            com.badlogic.gdx.scenes.scene2d.Actor[] r15 = new com.badlogic.gdx.scenes.scene2d.Actor[r2]
            r14.mExtrasForJoinPrompt = r15
            java.lang.String r15 = "lockToCamera"
            java.lang.String r15 = org.fortheloss.sticknodes.App.localize(r15)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            java.lang.String r15 = "..."
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCameraStickfigureLockButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r15 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r15, r0)
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$5 r0 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$5
            r0.<init>(r14)
            r15.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.Actor[] r0 = r14.mExtrasForJoinPrompt
            r0[r9] = r15
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void invertFigureColor(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.invertFigureColor(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public boolean isSpriteNameUnique(java.lang.String r5) {
            r4 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r0 = r0.librarySprites
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
        La:
            if (r1 < 0) goto L21
            java.lang.Object r3 = r0.get(r1)
            org.fortheloss.sticknodes.sprite.ISpriteSource r3 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L1e
            r5 = 0
            return r5
        L1e:
            int r1 = r1 + (-1)
            goto La
        L21:
            return r2
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void joinFigure() {
            r7 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r7.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            r7._figureToJoinRef = r0
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r7._canvasModuleRef
            java.lang.String r0 = "selectNodeTitle"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r0 = "selectStickfigureJoin2"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r0)
            r5 = 0
            com.badlogic.gdx.scenes.scene2d.Actor[] r6 = r7.mExtrasForJoinPrompt
            r2 = r7
            r1.promptUserToChooseStickfigure(r2, r3, r4, r5, r6)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r7._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r7._figureToJoinRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getMainNode()
            r0.setSessionSelectionToNode(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r7._stickfigureToolTable
            r0.update()
            return
    }

    public void jumpToNextSubmenu(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getMode()
            r1 = 3
            if (r0 == r1) goto Le
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r2._currentActiveScrollPaneRef
            r0.jumpToNextSubmenu(r3)
        Le:
            return
    }

    public void jumpToSubmenu(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getMode()
            r1 = 3
            if (r0 == r1) goto Le
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r2._currentActiveScrollPaneRef
            r0.jumpToSubmenuIndex(r3)
        Le:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void loadSpriteImage() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallyLoadSpriteImage()
            goto L1f
        Lc:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            r0 = 12
            r2._callbackAndroidRequestStoragePermission = r0
        L1f:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void lockFigure(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.lockFigure(r3, r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void lockNode(boolean r3) {
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
            r0.lockNode(r1, r3)
        L22:
            return
    }

    public void mcImported() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0 = r1._mcLibraryToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0 = r1._mcLibraryToolTable
            r0.updateMCLibrary()
            r1.setNeedsToBeDrawn()
            return
    }

    public void newProject() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.NewProjectDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.NewProjectDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    public void onLoadUnloadFontClick(java.lang.String r8) {
            r7 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r7._projectDataRef
            org.fortheloss.sticknodes.animationscreen.FontLoader r0 = r0.getFontLoader()
            org.fortheloss.sticknodes.data.ProjectData r1 = r7._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
            int r8 = r0.getFontID(r8)
            boolean r2 = r0.isFontLoaded(r8)
            if (r2 != 0) goto L18
            r0.loadFont(r8)
            goto L1b
        L18:
            r0.unloadFont(r8)
        L1b:
            int r0 = r1.size()
            r2 = 1
            int r0 = r0 - r2
        L21:
            if (r0 < 0) goto L49
            java.lang.Object r3 = r1.get(r0)
            org.fortheloss.sticknodes.data.FrameData r3 = (org.fortheloss.sticknodes.data.FrameData) r3
            java.util.ArrayList r3 = r3.getTextfieldBoxes()
            int r4 = r3.size()
            int r4 = r4 - r2
        L32:
            if (r4 < 0) goto L46
            java.lang.Object r5 = r3.get(r4)
            org.fortheloss.sticknodes.TextfieldBox r5 = (org.fortheloss.sticknodes.TextfieldBox) r5
            int r6 = r5.getFontID()
            if (r6 != r8) goto L43
            r5.setFontID(r8, r2)
        L43:
            int r4 = r4 + (-1)
            goto L32
        L46:
            int r0 = r0 + (-1)
            goto L21
        L49:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r8 = r7._textfieldToolTable
            r8.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r8 = r7._canvasModuleRef
            r8.setNeedsToBeDrawn()
            return
    }

    public void onLoadUnloadFontQuestionClick() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "loadingFontsTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "loadingFontsInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
            return
    }

    public void onSessionModeChange() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = r3._isWaitingForUserToChooseStickfigure
            if (r0 == 0) goto Le
            return
        Le:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getMode()
            r1 = 1
            if (r0 == 0) goto L68
            if (r0 == r1) goto L50
            r2 = 2
            if (r0 == r2) goto L38
            r2 = 3
            if (r0 == r2) goto L20
            goto L7f
        L20:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._playingScrollPane
            if (r0 == r2) goto L32
            r3.removeActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._playingScrollPane
            r3.addActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._playingScrollPane
            r3._currentActiveScrollPaneRef = r0
        L32:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r3._animationToolTable2
            r0.update(r1)
            goto L7f
        L38:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._cameraScrollPane
            if (r0 == r2) goto L4a
            r3.removeActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._cameraScrollPane
            r3.addActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._cameraScrollPane
            r3._currentActiveScrollPaneRef = r0
        L4a:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r3._animationToolTable
            r0.update(r1)
            goto L7f
        L50:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._defaultScrollPane
            if (r0 == r2) goto L62
            r3.removeActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._defaultScrollPane
            r3.addActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._defaultScrollPane
            r3._currentActiveScrollPaneRef = r0
        L62:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r3._animationToolTable
            r0.update(r1)
            goto L7f
        L68:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._cameraScrollPane
            if (r0 != r2) goto L7a
            r3.removeActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._defaultScrollPane
            r3.addActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._defaultScrollPane
            r3._currentActiveScrollPaneRef = r0
        L7a:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r3._animationToolTable
            r0.update(r1)
        L7f:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._currentActiveScrollPaneRef
            r0.updateAllToolTables()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r0 = r3._permanentAnimationToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r3._jumpToolTable
            r0.update()
            return
    }

    public void onSessionScreenChange() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 != 0) goto L23
            r0 = 1
            r2.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r2.setTouchable(r0)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            r1 = 0
            r0.updateBackgroundImage(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r2._jumpToolTable
            r0.update()
            r2.setNeedsToBeDrawn()
            goto L2f
        L23:
            r0 = 0
            r2.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r2.setTouchable(r0)
            r2.setNeedsToBeDrawn()
        L2f:
            return
    }

    public void onSessionSelectionChange() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 == 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._currentActiveScrollPaneRef
            boolean r1 = r3._isWaitingForUserToChooseStickfigure
            if (r1 == 0) goto L10
            return
        L10:
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            int r1 = r1.getCurrentlySelected()
            switch(r1) {
                case 0: goto Ld4;
                case 1: goto L7e;
                case 2: goto L6b;
                case 3: goto L57;
                case 4: goto L43;
                case 5: goto L2f;
                case 6: goto L1b;
                default: goto L19;
            }
        L19:
            goto Le6
        L1b:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._spriteScrollPane
            if (r1 == r2) goto Le6
            r3.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._spriteScrollPane
            r3.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._spriteScrollPane
            r3._currentActiveScrollPaneRef = r1
            goto Le6
        L2f:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._movieclipScrollPane
            if (r1 == r2) goto Le6
            r3.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._movieclipScrollPane
            r3.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._movieclipScrollPane
            r3._currentActiveScrollPaneRef = r1
            goto Le6
        L43:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._frameScrollPane
            if (r1 == r2) goto Le6
            r3.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._frameScrollPane
            r3.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._frameScrollPane
            r3._currentActiveScrollPaneRef = r1
            goto Le6
        L57:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._cameraScrollPane
            if (r1 == r2) goto Le6
            r3.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._cameraScrollPane
            r3.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._cameraScrollPane
            r3._currentActiveScrollPaneRef = r1
            goto Le6
        L6b:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._textfieldScrollPane
            if (r1 == r2) goto Le6
            r3.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._textfieldScrollPane
            r3.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._textfieldScrollPane
            r3._currentActiveScrollPaneRef = r1
            goto Le6
        L7e:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._stickfigureScrollPane
            if (r1 == r2) goto L90
            r3.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._stickfigureScrollPane
            r3.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._stickfigureScrollPane
            r3._currentActiveScrollPaneRef = r1
        L90:
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r1 == 0) goto Lbd
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            boolean r1 = r1.isMainNode()
            if (r1 == 0) goto Lbd
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r1 = r3.mSegmentToolsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r2 = r3._segmentToolTable
            if (r1 != r2) goto Le6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r1 = r3.mSegmentToolsCellRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r2 = r3._segmentMainNodeToolTable
            r1.setActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            r3.snapScrollPaneToLastClickedWidget(r1)
            goto Le6
        Lbd:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r1 = r3.mSegmentToolsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r2 = r3._segmentMainNodeToolTable
            if (r1 != r2) goto Le6
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r1 = r3.mSegmentToolsCellRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r2 = r3._segmentToolTable
            r1.setActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            r3.snapScrollPaneToLastClickedWidget(r1)
            goto Le6
        Ld4:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._defaultScrollPane
            if (r1 == r2) goto Le6
            r3.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._defaultScrollPane
            r3.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._defaultScrollPane
            r3._currentActiveScrollPaneRef = r1
        Le6:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            r1.updateAllToolTables()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r1 = r3._permanentAnimationToolTable
            r1.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r1 = r3._jumpToolTable
            r1.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            if (r1 == r0) goto Lfc
            r3.snapScrollPaneToLastClickedWidget(r1)
        Lfc:
            return
    }

    @Override // org.fortheloss.framework.IAndroidStorageRequester
    public void onStoragePermissionResult(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L4e
            int r2 = r1._callbackAndroidRequestStoragePermission
            r0 = 12
            if (r2 != r0) goto Lc
            r1.actuallyLoadSpriteImage()
            goto L4e
        Lc:
            r0 = 2
            if (r2 != r0) goto L13
            r1.actuallyExport()
            goto L4e
        L13:
            r0 = 4
            if (r2 != r0) goto L1a
            r1.actuallySave()
            goto L4e
        L1a:
            r0 = 5
            if (r2 != r0) goto L21
            r1.actuallySaveAs()
            goto L4e
        L21:
            r0 = 6
            if (r2 != r0) goto L28
            r1.actuallyOpenProject()
            goto L4e
        L28:
            r0 = 7
            if (r2 != r0) goto L2f
            r1.actuallyImportStickfigure()
            goto L4e
        L2f:
            r0 = 8
            if (r2 != r0) goto L37
            r1.actuallyImportSound()
            goto L4e
        L37:
            r0 = 9
            if (r2 != r0) goto L3f
            r1.actuallySendFile()
            goto L4e
        L3f:
            r0 = 10
            if (r2 != r0) goto L47
            r1.actuallySubmitStickfigure()
            goto L4e
        L47:
            r0 = 11
            if (r2 != r0) goto L4e
            r1.actuallyImportMovieclip()
        L4e:
            r2 = 0
            r1._callbackAndroidRequestStoragePermission = r2
            return
    }

    public void openProject() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallyOpenProject()
            goto L1e
        Lc:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            r0 = 6
            r2._callbackAndroidRequestStoragePermission = r0
        L1e:
            return
    }

    public void pasteCamera() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.pasteCamera(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0 = r2._cameraToolTable
            r0.update()
            return
    }

    public void pasteCameraWobbleProperties() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.pasteCameraWobbleProperties(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0 = r2._cameraToolTable
            r0.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void pasteFigureFilters() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.pasteFigureFilters(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r2._stickfigureFiltersToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r2._movieclipFiltersToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r2._spriteFiltersToolTable
            r0.update()
            return
    }

    public void pasteMC() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.pasteMC()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void pasteSound() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            r0.pasteSound(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r2._frameToolTable
            r0.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void pasteSprite() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.pasteSprite()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void pasteStickfigure() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.pasteStickfigure()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void pasteStickfigurePropertiesBundle() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 == 0) goto L21
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.StickfigurePropertiesBundle r0 = r0.getCopiedStickfigurePropertiesBundle()
            if (r0 != 0) goto L11
            goto L21
        L11:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r0.pasteStickfigurePropertiesBundle(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r2._stickfigureToolTable
            r0.update()
        L21:
            return
    }

    public void pasteText() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.pasteTextfieldText(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0 = r2._textfieldToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable r0 = r2._simpleTextfieldToolTable
            r0.update()
            return
    }

    public void pasteTextfield() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.pasteTextfield()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void persistFigure(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.persistFigure(r3, r0)
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void playSound(int r4) {
            r3 = this;
            if (r4 >= 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r0 = r0.librarySoundDatas
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Ld:
            if (r0 < 0) goto L21
            org.fortheloss.sticknodes.data.ProjectData r1 = r3._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r1 = r1.librarySoundDatas
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.data.SoundData r1 = (org.fortheloss.sticknodes.data.SoundData) r1
            com.badlogic.gdx.audio.Sound r1 = r1.sound
            r1.stop()
            int r0 = r0 + (-1)
            goto Ld
        L21:
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r0 = r0.librarySoundDatas
            java.lang.Object r4 = r0.get(r4)
            org.fortheloss.sticknodes.data.SoundData r4 = (org.fortheloss.sticknodes.data.SoundData) r4
            com.badlogic.gdx.audio.Sound r4 = r4.sound
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentFrame()
            float r0 = r0.getSoundVolume()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r3._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            float r1 = r1.getSoundPitch()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r3._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r2 = r2.getCurrentFrame()
            float r2 = r2.getSoundPan()
            r4.play(r0, r1, r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void pushFigureBackward() {
            r8 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r8.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r8._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.SessionData r2 = r8._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = r2.peekAtUndo()
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction
            r4 = -1
            if (r3 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction r2 = (org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction) r2
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = r2.getInitiatingFigure()
            if (r3 != r0) goto L26
            short r2 = r2.getDirection()
            if (r2 == r4) goto L38
        L26:
            org.fortheloss.sticknodes.data.SessionData r2 = r8._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction> r3 = org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction r2 = (org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction) r2
            r2.initialize(r1, r0, r4)
            org.fortheloss.sticknodes.data.SessionData r3 = r8._sessionDataRef
            r3.addUserAction(r2)
        L38:
            org.fortheloss.sticknodes.data.SessionData r2 = r8._sessionDataRef
            r3 = 1
            r2.blockUserActions(r3)
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r2 == 0) goto L98
            r2 = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            boolean r5 = r2.getPushJoinedFigures()
            if (r5 == 0) goto L92
            boolean r5 = r2.hasJoinAnchorNode()
            if (r5 == 0) goto L92
            java.lang.Class<java.util.Stack> r5 = java.util.Stack.class
            java.lang.Object r5 = com.badlogic.gdx.utils.Pools.obtain(r5)
            java.util.Stack r5 = (java.util.Stack) r5
            java.util.ArrayList r1 = r1.getDrawableFigures()
            int r6 = r1.size()
            int r6 = r6 - r3
        L62:
            if (r6 < 0) goto L8b
            java.lang.Object r3 = r1.get(r6)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            if (r3 == r0) goto L85
            boolean r7 = r3.checkIsJoinedTo(r2)
            if (r7 == 0) goto L73
            goto L85
        L73:
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L88
            java.lang.Object r3 = r5.pop()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r8._canvasModuleRef
            r7.moveFigure(r4, r3)
            goto L73
        L85:
            r5.add(r3)
        L88:
            int r6 = r6 + (-1)
            goto L62
        L8b:
            r5.clear()
            com.badlogic.gdx.utils.Pools.free(r5)
            goto L9d
        L92:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r8._canvasModuleRef
            r1.moveFigure(r4, r0)
            goto L9d
        L98:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r8._canvasModuleRef
            r1.moveFigure(r4, r0)
        L9d:
            org.fortheloss.sticknodes.data.SessionData r0 = r8._sessionDataRef
            r1 = 0
            r0.blockUserActions(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r8._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r8._stickfigureScrollPane
            if (r0 != r1) goto Laf
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r8._stickfigureToolTable
            r0.update()
            goto Lc2
        Laf:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r8._movieclipScrollPane
            if (r0 != r1) goto Lb9
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = r8._movieclipToolTable
            r0.update()
            goto Lc2
        Lb9:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r8._spriteScrollPane
            if (r0 != r1) goto Lc2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = r8._spriteToolTable
            r0.update()
        Lc2:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void pushFigureForward() {
            r10 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r10.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r10._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.SessionData r2 = r10._sessionDataRef
            org.fortheloss.sticknodes.data.useractions.UserAction r2 = r2.peekAtUndo()
            boolean r3 = r2 instanceof org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction
            r4 = 1
            if (r3 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction r2 = (org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction) r2
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = r2.getInitiatingFigure()
            if (r3 != r0) goto L26
            short r2 = r2.getDirection()
            if (r2 == r4) goto L38
        L26:
            org.fortheloss.sticknodes.data.SessionData r2 = r10._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction> r3 = org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction r2 = (org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction) r2
            r2.initialize(r1, r0, r4)
            org.fortheloss.sticknodes.data.SessionData r3 = r10._sessionDataRef
            r3.addUserAction(r2)
        L38:
            org.fortheloss.sticknodes.data.SessionData r2 = r10._sessionDataRef
            r2.blockUserActions(r4)
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r3 = 0
            if (r2 == 0) goto L98
            r2 = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            boolean r5 = r2.getPushJoinedFigures()
            if (r5 == 0) goto L92
            boolean r5 = r2.hasJoinAnchorNode()
            if (r5 == 0) goto L92
            java.lang.Class<java.util.Stack> r5 = java.util.Stack.class
            java.lang.Object r5 = com.badlogic.gdx.utils.Pools.obtain(r5)
            java.util.Stack r5 = (java.util.Stack) r5
            java.util.ArrayList r1 = r1.getDrawableFigures()
            int r6 = r1.size()
            r7 = 0
        L62:
            if (r7 >= r6) goto L8b
            java.lang.Object r8 = r1.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            if (r8 == r0) goto L85
            boolean r9 = r8.checkIsJoinedTo(r2)
            if (r9 == 0) goto L73
            goto L85
        L73:
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L88
            java.lang.Object r8 = r5.pop()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r9 = r10._canvasModuleRef
            r9.moveFigure(r4, r8)
            goto L73
        L85:
            r5.add(r8)
        L88:
            int r7 = r7 + 1
            goto L62
        L8b:
            r5.clear()
            com.badlogic.gdx.utils.Pools.free(r5)
            goto L9d
        L92:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModuleRef
            r1.moveFigure(r4, r0)
            goto L9d
        L98:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModuleRef
            r1.moveFigure(r4, r0)
        L9d:
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionDataRef
            r0.blockUserActions(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r10._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r10._stickfigureScrollPane
            if (r0 != r1) goto Lae
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r10._stickfigureToolTable
            r0.update()
            goto Lc1
        Lae:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r10._movieclipScrollPane
            if (r0 != r1) goto Lb8
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = r10._movieclipToolTable
            r0.update()
            goto Lc1
        Lb8:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r10._spriteScrollPane
            if (r0 != r1) goto Lc1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = r10._spriteToolTable
            r0.update()
        Lc1:
            return
    }

    public void rateApp() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.PleaseRateDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.PleaseRateDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            org.fortheloss.framework.Assets r1 = r2._assetsRef
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    public void redo() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.redo()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void resetSegmentLength() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L28
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L28
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r2 = 0
            r0.resetSegmentLength(r1, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0 = r3._segmentToolTable
            r0.update()
        L28:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void resetSegmentThickness() {
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
            r0.resetSegmentThickness(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0 = r2._segmentToolTable
            r0.update()
        L27:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    public void rotateAllCameras(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            r1 = 1
            r0.rotateAllCameras(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    public void rotateCameraTo(float r5, boolean r6) {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            float r0 = r4._cameraStartRotation
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1e
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            float r0 = r0.getCameraRotationDeg()
            r4._cameraStartRotation = r0
        L1e:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r2 = r4._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r2.getCurrentlySelectedFrameCamera()
            float r3 = r4._cameraStartRotation
            r0.rotateCameraTo(r5, r2, r3, r6)
            if (r6 == 0) goto L2f
            r4._cameraStartRotation = r1
        L2f:
            return
    }

    public void rotateMCTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r1 != 0) goto Lb
            goto L12
        Lb:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = (org.fortheloss.sticknodes.movieclip.MCReference) r0
            r1.rotateMCTo(r3, r0)
        L12:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void rotateSpriteTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.rotateSpriteTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void rotateStickfigureTo(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            float r3 = (float) r3
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            r1.rotateStickfigureTo(r3, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r3 = r2._segmentToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r3 = r2._segmentMainNodeToolTable
            r3.update()
            return
    }

    public void rotateTextfieldTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.rotateTextfieldTo(r3, r1)
            return
    }

    public void runnableDoneImportingMC(boolean r6, org.fortheloss.sticknodes.movieclip.MCMovieclipSource r7) {
            r5 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AnimateToolsModule.runnableDoneImportingMC("
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "last_status_event"
            r0.setCrashlyticsKeyString(r2, r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsImportingDialog r0 = r5._movieclipIsImportingDialogRef
            if (r0 == 0) goto L24
            r0.hideImmediately()
        L24:
            if (r6 == 0) goto Lf0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r5._animationScreenRef
            r6.importMovieclip(r7)
            java.util.ArrayList r6 = r7.getSoundsNotFoundFilenames()
            int r7 = r6.size()
            if (r7 <= 0) goto Lcd
            org.fortheloss.framework.IPlatform r7 = org.fortheloss.sticknodes.App.platform
            boolean r7 = r7.isPro()
            java.lang.String r0 = "\n\n"
            if (r7 != 0) goto L56
            java.lang.String r6 = "mcImportMissingSoundsProOnly"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            goto Lcf
        L56:
            java.lang.String r7 = "mcImportMissingSounds1"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            r1 = 0
            r2 = 10
            int r3 = r6.size()
            int r2 = java.lang.Math.min(r2, r3)
        L85:
            if (r1 >= r2) goto Lb4
            java.lang.Object r3 = r6.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r3)
            java.lang.String r7 = r4.toString()
            int r3 = r2 + (-1)
            if (r1 == r3) goto Lb1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r3.toString()
        Lb1:
            int r1 = r1 + 1
            goto L85
        Lb4:
            java.lang.String r6 = "mcImportedMissingSounds2"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            goto Lcf
        Lcd:
            java.lang.String r6 = ""
        Lcf:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r5._animationScreenRef
            java.lang.String r0 = "mcImportedTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "mcImportedInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r7.showErrorDialog(r0, r6)
            goto L104
        Lf0:
            r7.dispose()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r5._animationScreenRef
            java.lang.String r7 = "errorImportingMCTitle"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r0 = "errorImportingInfo1MC"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r6.showErrorDialog(r7, r0)
        L104:
            return
    }

    public void runnableDoneSaving(boolean r4) {
            r3 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AnimateToolsModule.runnableDoneSaving("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "last_status_event"
            r0.setCrashlyticsKeyString(r2, r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.IsSavingDialog r0 = r3._isSavingDialogRef
            if (r0 == 0) goto L24
            r0.hideImmediately()
        L24:
            if (r4 != 0) goto L3b
            r4 = 1
            org.fortheloss.sticknodes.App.verifyPathsExist(r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            java.lang.String r0 = "errorSavingSpaceTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "errorSavingSpaceInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r4.showErrorDialog(r0, r1)
        L3b:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r4 = r3._projectToolTable
            r4.update()
            r4 = 5
            org.fortheloss.sticknodes.App.vibrate(r4)
            r3.setNeedsToBeDrawn()
            return
    }

    public void save() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallySave()
            goto L1e
        Lc:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            r0 = 4
            r2._callbackAndroidRequestStoragePermission = r0
        L1e:
            return
    }

    public void saveAs() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallySaveAs()
            goto L1e
        Lc:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            r0 = 5
            r2._callbackAndroidRequestStoragePermission = r0
        L1e:
            return
    }

    public void saveProject(java.lang.String r6) {
            r5 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "AnimateToolsModule.saveProject()"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.sticknodes.data.ProjectData r0 = r5._projectDataRef
            r0.projectName = r6
            org.fortheloss.sticknodes.animationscreen.dialogs.IsSavingDialog r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.IsSavingDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.framework.Assets r1 = r5._assetsRef
            java.lang.String r2 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r3 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r4 = 1
            java.lang.Object r1 = r1.get(r2, r3, r4)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r2 = "loading_spinner"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r2)
            r6.<init>(r0, r1)
            r5._isSavingDialogRef = r6
            r6.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r5._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.IsSavingDialog r0 = r5._isSavingDialogRef
            r6.addDialogToStage(r0)
            java.lang.Thread r6 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$SaveRunnable r0 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$SaveRunnable
            org.fortheloss.sticknodes.data.ProjectData r1 = r5._projectDataRef
            r0.<init>(r5, r5, r1)
            r6.<init>(r0)
            r6.start()
            org.fortheloss.sticknodes.animationscreen.dialogs.IsSavingDialog r6 = r5._isSavingDialogRef
            org.fortheloss.sticknodes.data.ProjectData r0 = r5._projectDataRef
            r6.setProjectDataToReadFrom(r0)
            org.fortheloss.sticknodes.data.SessionData r6 = r5._sessionDataRef
            long r0 = java.lang.System.currentTimeMillis()
            r6.setLastSaveMillis(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r5._animationScreenRef
            r6.resetSavePromptTimer()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void scaleFigureTo(float r5) {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r4.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4._canvasModuleRef
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = 1
            r1.scaleFigureTo(r5, r0, r2, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    public void scrollToTextAreaForTyping() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._textfieldScrollPane
            if (r0 != r1) goto Lf
            r0 = 1138491392(0x43dc0000, float:440.0)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r2 = r2 * r0
            r1.setScrollY(r2)
        Lf:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void selectFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModuleRef
            r0.selectFigure(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void selectFigure(org.fortheloss.sticknodes.stickfigure.INode r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModuleRef
            r0.selectFigure(r2)
            return
    }

    public void selectLastImportedMC() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0 = r1._mcLibraryToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0 = r1._mcLibraryToolTable
            r0.updateMCLibrary()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0 = r1._mcLibraryToolTable
            r0.selectLastImportedMC()
            return
    }

    public void selectLastImportedSprite() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0 = r1._spriteLibraryToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0 = r1._spriteLibraryToolTable
            r0.updateSpriteLibrary()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0 = r1._spriteLibraryToolTable
            r0.selectLastImportedSprite()
            return
    }

    public void selectLastImportedStickfigure() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0 = r1._libraryToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0 = r1._libraryToolTable
            r0.updateStickfigureLibrary()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0 = r1._libraryToolTable
            r0.selectLastImportedStickfigure()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void selectNextFigure() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3._canvasModuleRef
            r2 = 1
            r1.selectFigure(r2, r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void selectPreviousFigure() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3._canvasModuleRef
            r2 = -1
            r1.selectFigure(r2, r0)
            return
    }

    public void sendFile() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallySendFile()
            goto L1f
        Lc:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            r0 = 9
            r2._callbackAndroidRequestStoragePermission = r0
        L1f:
            return
    }

    public void setCacheGraphic(boolean r6) {
            r5 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r5._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            if (r0 == 0) goto L76
            int r1 = r0.getPlaymode()
            if (r1 == 0) goto Lf
            goto L76
        Lf:
            if (r6 != 0) goto L1d
            int r6 = r0.getLibraryID()
            int r0 = r0.getCurrentFrameIndex()
            org.fortheloss.sticknodes.movieclip.MCCache.removeFromCache(r6, r0)
            goto L6a
        L1d:
            int r6 = r0.getLibraryID()
            int r1 = r0.getCurrentFrameIndex()
            int r6 = org.fortheloss.sticknodes.movieclip.MCCache.addToCache(r6, r1)
            r1 = -1
            r2 = 0
            r3 = 1
            java.lang.String r4 = "cannotCacheTitle"
            if (r6 != r1) goto L4c
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r5._animationScreenRef
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r0 = r0.getCurrentFrameIndex()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "cannotCacheInfo1"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0, r3)
            r6.showErrorDialog(r1, r0)
            goto L6a
        L4c:
            if (r6 != 0) goto L6a
            r5.showEditCacheDialog()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r6 = r5._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r3 = 20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "cannotCacheInfo2"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r2, r1)
            r6.showErrorDialog(r0, r1)
        L6a:
            int[][] r6 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r5._canvasModuleRef
            r6.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r5._framesModuleRef
            r6.setNeedsToBeDrawn()
        L76:
            return
    }

    public void setCameraWidescreen(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.setCameraWidescreen(r1, r3)
            return
    }

    public void setCameraWobbleRotation(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.setCameraWobbleRotation(r1, r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r3 = r2._cameraToolTable
            r3.update()
            return
    }

    public void setCameraWobbleRotationIntensity(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.setCameraWobbleRotationIntensity(r1, r3)
            return
    }

    public void setCameraWobbleScale(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.setCameraWobbleScale(r1, r3)
            return
    }

    public void setCameraWobbleSpeedTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.setCameraWobbleSpeed(r1, r3)
            return
    }

    public void setCameraWobbleXY(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.setCameraWobbleXY(r1, r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r3 = r2._cameraToolTable
            r3.update()
            return
    }

    public void setCameraWobbleXYIntensity(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getCurrentlySelectedFrameCamera()
            r0.setCameraWobbleXYIntensity(r1, r3)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFPS(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            r0.fps = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable
            r0 = 0
            r2.update(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable2
            r2.update(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r1._animationScreenRef
            r2.playbackSettingChanged()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureBlurTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureBlurTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureDropShadowAlphaTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureDropShadowAlphaTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureDropShadowAngleTo(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureDropShadowAngleTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureDropShadowBlurTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureDropShadowBlurTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureDropShadowColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureDropShadowColor(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureDropShadowDistanceTo(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureDropShadowDistanceTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureGlowAmountTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureGlowTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureGlowColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureGlowColor(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureGlowIntensityAmountTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureGlowIntensityTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureHueShiftTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureHueShiftTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureMotionBlurAngle(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureMotionBlurAngle(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureMotionBlurEnabled(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureMotionBlurEnabled(r3, r0)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r3 = r2._spriteFiltersToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r3 = r2._stickfigureFiltersToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r3 = r2._movieclipFiltersToolTable
            r3.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureMotionBlurIsOmniDirectional(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureMotionBlurIsOmniDirectional(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureOutlineAlphaTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureOutlineAlphaTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureOutlineColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureOutlineColor(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureOutlineThicknessTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureOutlineThicknessTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigurePixelationTo(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigurePixelationTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureSaturationTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureSaturationTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureTintAmountTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureTintAmountTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureTintColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureTintColor(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureTransparencyTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureTransparencyTo(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureUseJoinParentFilters(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureUseJoinParentFilters(r3, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r3 = r2._stickfigureFiltersToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r3 = r2._movieclipFiltersToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r3 = r2._spriteFiltersToolTable
            r3.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFigureVisibleInOnionSkin(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setFigureVisibleInOnionSkin(r3, r0)
            return
    }

    public void setFrameBackgroundColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 == 0) goto L14
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r1 != 0) goto Ld
            goto L14
        Ld:
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModuleRef
            r1.setFrameBackgroundColor(r3, r0)
        L14:
            return
    }

    public void setFrameCameraMoveDuringDelay(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0.setFrameCameraMoveDuringDelay(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r3 = r2._frameToolTable
            r3.update()
            return
    }

    public void setFrameCameraMoveDuringDelayProperties(boolean r3, boolean r4, short r5) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0.setFrameCameraMoveDuringDelayProperties(r3, r4, r5, r1)
            return
    }

    public void setFrameDelaySeconds(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0.setFrameDelaySeconds(r3, r1)
            return
    }

    public void setFrameExpandedGradient(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 == 0) goto L14
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r1 != 0) goto Ld
            goto L14
        Ld:
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModuleRef
            r1.setFrameExpandedGradient(r3, r0)
        L14:
            return
    }

    public void setFrameGradient(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 == 0) goto L14
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r1 != 0) goto Ld
            goto L14
        Ld:
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModuleRef
            r1.setFrameGradient(r3, r0)
        L14:
            return
    }

    public void setFrameIsDelayed(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0.setFrameIsDelayed(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r3 = r2._frameToolTable
            r3.update()
            return
    }

    public void setFrameIsRepeating(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0.setFrameIsRepeating(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r3 = r2._frameToolTable
            r3.update()
            return
    }

    public void setFrameIsUsingSlowMotionTweenedFrames(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0.setFrameIsUsingSlowMotionTweenedFrames(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r3 = r2._frameToolTable
            r3.update()
            return
    }

    public void setFrameRepeatGoBackFrames(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0.setFrameRepeatGoBackFrames(r3, r1)
            return
    }

    public void setFrameRepeatLoops(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0.setFrameRepeatLoops(r3, r1)
            return
    }

    public void setFrameSilencesSounds(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 == 0) goto L14
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r1 != 0) goto Ld
            goto L14
        Ld:
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModuleRef
            r1.setFrameSilencesSounds(r3, r0)
        L14:
            return
    }

    public void setFrameSlowMotionTweenedFrames(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0.setFrameSlowMotionTweenedFrames(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r3 = r2._frameToolTable
            r3.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFrameSound(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            int r0 = r0.getSoundToPlayLibraryID()
            if (r0 != r3) goto L16
            return
        L16:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            r0.setFrameSound(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r3 = r2._frameToolTable
            r3.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFrameSoundPan(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            r0.setFrameSoundPan(r3, r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFrameSoundPitch(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            r0.setFrameSoundPitch(r3, r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFrameSoundVolume(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            r0.setFrameSoundVolume(r3, r1)
            return
    }

    public void setFrameTweening(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 == 0) goto L19
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r1 != 0) goto Ld
            goto L19
        Ld:
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModuleRef
            r1.setFrameTweening(r3, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r3 = r2._frameToolTable
            r3.update()
        L19:
            return
    }

    public void setFrameUseTweenPropertiesDuringRepeating(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentlySelectedFrameData()
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            r0.setFrameUseTweenPropertiesDuringRepeating(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r3 = r2._frameToolTable
            r3.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    public void setIsYoutubeShorts(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            r0.isYoutubeShorts = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r2 = r1._projectToolTable
            r2.update()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r1._framesModuleRef
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModuleRef
            r2.setNeedsToBeDrawn()
            return
    }

    public void setLoop(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 != 0) goto L25
            if (r3 == 0) goto L25
            org.fortheloss.sticknodes.data.ProjectData r0 = r2._projectDataRef
            boolean r0 = r0.hasShownLoopMessage
            if (r0 != 0) goto L25
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getMode()
            r1 = 3
            if (r0 == r1) goto L25
            org.fortheloss.sticknodes.data.ProjectData r0 = r2._projectDataRef
            r1 = 1
            r0.hasShownLoopMessage = r1
            r2.showLoopDialog()
        L25:
            org.fortheloss.sticknodes.data.ProjectData r0 = r2._projectDataRef
            r0.isLoop = r3
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.playbackSettingChanged()
            return
    }

    public void setMCCurrentFrame(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getCurrentlySelectedMC()
            r0.setMCCurrentFrameIndex(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r3 = r2._movieclipToolTable
            r3.update()
            return
    }

    public void setMCPlayDuringDelay(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getCurrentlySelectedMC()
            r0.setMCPlayDuringDelay(r3, r1)
            return
    }

    public void setMCPlaymode(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getCurrentlySelectedMC()
            r0.setMCPlaymode(r3, r1)
            return
    }

    public void setMCStartFrame(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getCurrentlySelectedMC()
            r0.setMCStartFrameIndex(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r3 = r2._movieclipToolTable
            r3.update()
            return
    }

    public void setMCVolumeScale(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCurrentlySelectedMC()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r1.getCurrentlySelectedMC()
            r0.setMCVolumeScale(r3, r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setPlayFullscreen(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.setPlayFullscreen(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable
            r0 = 0
            r2.update(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable2
            r2.update(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setPolyfillColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setPolyfillColor(r3, r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setPushJoinedFigures(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r2.getCurrentlySelectedFigure()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L16
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            boolean r1 = r0.hasJoinAnchorNode()
            if (r1 != 0) goto L11
            goto L16
        L11:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setPushJoinedFigures(r3, r0)
        L16:
            return
    }

    public void setReferences(org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2) {
            r0 = this;
            r0._canvasModuleRef = r1
            r0._framesModuleRef = r2
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
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$12 r1 = new org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule$12
            r1.<init>(r2, r3)
            r0.postRunnable(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setSegmentDragLockAngle(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentDragLockAngle(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setSegmentIsDragLocked(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setSegmentIsDragLocked(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r3 = r2._segmentToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r3 = r2._segmentMainNodeToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r3 = r2._segmentToolTable
            r3.update()
        L27:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setShapeSegmentCurvePolyfillPrecision(short r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.setShapeSegmentCurvePolyfillPrecision(r3, r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setShapeTrapezoidIsRounded1(boolean r3) {
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
            r0.setShapeTrapezoidIsRounded1(r3, r1)
        L22:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setShapeTrapezoidIsRounded2(boolean r3) {
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
            r0.setShapeTrapezoidIsRounded2(r3, r1)
        L22:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setShapeTrapezoidThickness1(int r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L2a
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L2a
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            float r4 = (float) r4
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.setShapeTrapezoidThickness1(r4, r1, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r4 = r3._segmentToolTable
            r4.update()
        L2a:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setShapeTrapezoidThickness2(int r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 == 0) goto L2a
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            boolean r0 = r0.isMainNode()
            if (r0 == 0) goto L15
            goto L2a
        L15:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            float r4 = (float) r4
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.setShapeTrapezoidThickness2(r4, r1, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r4 = r3._segmentToolTable
            r4.update()
        L2a:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setShowFilters(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            if (r2 == 0) goto L6
            r2 = 2
            goto L7
        L6:
            r2 = 0
        L7:
            r0.setShowFilters(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setSpriteGroupStateIndex(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteGroupRef
            if (r1 != 0) goto Lb
            return
        Lb:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            org.fortheloss.sticknodes.sprite.SpriteGroupRef r0 = (org.fortheloss.sticknodes.sprite.SpriteGroupRef) r0
            r1.setSpriteGroupStateIndex(r3, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r3 = r2._spriteToolTable
            r3.update()
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setSpriteOriginX(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setSpriteOriginX(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setSpriteOriginY(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setSpriteOriginY(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setSpriteScaleLinked(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setSpriteScaleLinked(r3, r0)
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setSpriteScaleMode(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setSpriteScaleMode(r3, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r3 = r2._spriteToolTable
            r3.update()
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setSpriteScaleX(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setSpriteScaleX(r3, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r3 = r2._spriteToolTable
            r3.update()
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setSpriteScaleY(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.setSpriteScaleY(r3, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r3 = r2._spriteToolTable
            r3.update()
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setStickfigureDoesSetJoinsState(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r0.setStickfigureDoesSetJoinsState(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r3 = r2._stickfigureToolTable
            r3.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setStickfigureScaleJoinedStickfigures(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r0.setStickfigureScaleJoinedStickfigures(r3, r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setStickfigureStateIndexOfJoins(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r0.setStickfigureStateIndexOfJoins(r3, r1)
            return
    }

    public void setTextfieldColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.setTextfieldColor(r3, r1)
            return
    }

    public void setTextfieldDrawAboveWidescreenBars(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.setTextfieldDrawAboveWidescreenBars(r3, r1)
            return
    }

    public void setTextfieldFont(java.lang.String r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.data.ProjectData r0 = r2._projectDataRef
            org.fortheloss.sticknodes.animationscreen.FontLoader r0 = r0.getFontLoader()
            int r3 = r0.getFontID(r3)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.setTextfieldFont(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r3 = r2._textfieldToolTable
            r3.update()
            return
    }

    public void setTextfieldHasShadow(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.setTextfieldHasShadow(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r3 = r2._textfieldToolTable
            r3.update()
            return
    }

    public void setTextfieldLocked(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.setTextfieldLocked(r3, r1)
            return
    }

    public void setTextfieldLockedToCamera(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            if (r3 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r3.addTextfieldToCameraLock(r1)
            goto L26
        L17:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r2._framesModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            int r1 = r1.getID()
            r3.removeTextfieldFromCameraLock(r1)
        L26:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r3 = r2._textfieldToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.showQuickResizeTool(r0)
            return
    }

    public void setTextfieldScale(float r5) {
            r4 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r4._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r4._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = 1
            r0.setTextfieldScale(r5, r1, r2, r3)
            return
    }

    public void setTextfieldShadowColor(com.badlogic.gdx.graphics.Color r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.setTextfieldShadowColor(r3, r1)
            return
    }

    public void setTextfieldText(java.lang.String r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.setTextfieldText(r3, r1)
            return
    }

    public void setTextfieldTransparencyTo(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCurrentlySelectedTextfieldBox()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r1.getCurrentlySelectedTextfieldBox()
            r0.setTextfieldTransparencyTo(r3, r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setTweenedFrames(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            r0.numTweenedFrames = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable
            r0 = 0
            r2.update(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable2
            r2.update(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r1._animationScreenRef
            r2.playbackSettingChanged()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setTweening(boolean r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            r1 = 1
            if (r0 != 0) goto L25
            if (r4 == 0) goto L25
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
            boolean r0 = r0.hasShownTweeningMessage
            if (r0 != 0) goto L25
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getMode()
            r2 = 3
            if (r0 == r2) goto L25
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
            r0.hasShownTweeningMessage = r1
            r3.showTweeningDialog()
        L25:
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
            r0.tweeningEnabled = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r4 = r3._animationToolTable
            r4.update(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r4 = r3._animationToolTable2
            r4.update(r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModuleRef
            r4.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            r4.playbackSettingChanged()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setUsePolyfillColor(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            r0.usePolyfillColor(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r3 = r2._segmentToolTable
            r3.update()
            return
    }

    public void setWatermarkColor(com.badlogic.gdx.graphics.Color r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            com.badlogic.gdx.graphics.Color r0 = r0.watermarkColor
            r0.set(r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r1._canvasModuleRef
            r2.updateWatermark()
            return
    }

    public void setWatermarkEnabled(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r1._projectDataRef
            r0.watermarkEnabled = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ProjectToolTable r2 = r1._projectToolTable
            r2.update()
            return
    }

    public void setWatermarkText(java.lang.String r4) {
            r3 = this;
            org.fortheloss.sticknodes.data.ProjectData r0 = r3._projectDataRef
            int r1 = r4.length()
            r2 = 22
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            java.lang.String r4 = r4.substring(r2, r1)
            r0.watermarkText = r4
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r4 = r3._canvasModuleRef
            r4.updateWatermark()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void showAddTweenedFrameDialog() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.AddTweenedFrameInstructionsDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.AddTweenedFrameInstructionsDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            org.fortheloss.framework.Assets r1 = r2._assetsRef
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    public void showAppSettings() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.AppSettingsDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r3._canvasModuleRef
            r0.<init>(r1, r2)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    public void showAutoMoveCameraDialog() {
            r7 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r7._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.data.SessionData r0 = r7._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            org.fortheloss.sticknodes.data.FrameData r0 = r0.getFrameData()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r7._framesModuleRef
            int r1 = r1.getFrameIndex(r0)
            org.fortheloss.sticknodes.data.ProjectData r2 = r7._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            if (r1 < r2) goto L37
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r7._animationScreenRef
            java.lang.String r1 = "autoCameraErrorTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "autoCameraError5"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
            goto L54
        L37:
            org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.AutoCameraDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r7._animationScreenRef
            r1.<init>(r2)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r7._framesModuleRef
            org.fortheloss.framework.Assets r4 = r7._assetsRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r6 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r3 = r4.get(r5, r6, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            r1.initialize(r0, r2, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r7._animationScreenRef
            r0.addDialogToStage(r1)
        L54:
            return
    }

    public void showEditCacheDialog() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.EditCacheDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.EditCacheDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            org.fortheloss.sticknodes.data.ProjectData r1 = r2._projectDataRef
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    public void showExportDialog(int r3) {
            r2 = this;
            if (r3 != 0) goto L18
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportDialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r1 = r2._projectDataRef
            r3.<init>(r0, r2, r1)
            r2._exportDialogRef = r3
            r3.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportDialog r0 = r2._exportDialogRef
            r3.addDialogToStage(r0)
            goto L49
        L18:
            r0 = 1
            if (r3 != r0) goto L31
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r1 = r2._projectDataRef
            r3.<init>(r0, r2, r1)
            r2._exportMP4DialogRef = r3
            r3.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r0 = r2._exportMP4DialogRef
            r3.addDialogToStage(r0)
            goto L49
        L31:
            r0 = 2
            if (r3 != r0) goto L49
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r1 = r2._projectDataRef
            r3.<init>(r0, r2, r1)
            r2._exportPNGDialogRef = r3
            r3.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportPNGDialog r0 = r2._exportPNGDialogRef
            r3.addDialogToStage(r0)
        L49:
            return
    }

    public void showExportMP4OverwriteDialog(java.lang.String r15, int r16, int r17, int r18, int r19, boolean r20, boolean r21, boolean r22, int r23, boolean r24) {
            r14 = this;
            r0 = r14
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4OverwriteDialog r13 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4OverwriteDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            r13.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportMP4Dialog r12 = r0._exportMP4DialogRef
            r1 = r13
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r1.initialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            r1.addDialogToStage(r13)
            return
    }

    public void showExportOverwriteDialog(java.lang.String r13, int r14, int r15, int r16, int r17, boolean r18, int r19, boolean r20) {
            r12 = this;
            r0 = r12
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportOverwriteDialog r11 = new org.fortheloss.sticknodes.animationscreen.dialogs.ExportOverwriteDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            r11.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.ExportDialog r10 = r0._exportDialogRef
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r1.initialize(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            r1.addDialogToStage(r11)
            return
    }

    public void showLagDialog() {
            r6 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.LagDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6._animationScreenRef
            r0.<init>(r1)
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            org.fortheloss.framework.Assets r2 = r6._assetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r4 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r5 = 1
            java.lang.Object r2 = r2.get(r3, r4, r5)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r2
            r0.initialize(r6, r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6._animationScreenRef
            r1.addDialogToStage(r0)
            return
    }

    public void showLockToCameraDialog() {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            r1.showLockToCameraDialog(r0)
            return
    }

    public void showLockToCameraDialog(org.fortheloss.sticknodes.animationscreen.FrameCamera r8) {
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.LockToCameraDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r7._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r7._framesModuleRef
            r0.<init>(r1, r2)
            org.fortheloss.sticknodes.data.ProjectData r1 = r7._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r2 = r7._sessionDataRef
            org.fortheloss.framework.Assets r3 = r7._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r5 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r6 = 1
            java.lang.Object r3 = r3.get(r4, r5, r6)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            r0.initialize(r8, r1, r2, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r8 = r7._animationScreenRef
            r8.addDialogToStage(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void showMultiSoundImportErrorDialog(java.util.ArrayList<java.lang.String> r3, int r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.MultiSoundImportErrorDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.MultiSoundImportErrorDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            r0.initialize(r3, r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.addDialogToStage(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void showMultiStickfigureImportErrorDialog(java.util.ArrayList<java.lang.String> r3, int r4) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.MultiStickfigureImportErrorDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.MultiStickfigureImportErrorDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            r0.initialize(r3, r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.addDialogToStage(r0)
            return
    }

    public void showProjectOverwriteDialog(java.lang.String r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.ProjectOverwriteDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.ProjectOverwriteDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.SaveAsDialog r1 = r2._saveAsDialogRef
            r0.initialize(r3, r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            r3.addDialogToStage(r0)
            return
    }

    public void spriteImported() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0 = r1._spriteLibraryToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0 = r1._spriteLibraryToolTable
            r0.updateSpriteLibrary()
            r1.setNeedsToBeDrawn()
            return
    }

    public void stickfigureImported() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0 = r1._libraryToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0 = r1._libraryToolTable
            r0.updateStickfigureLibrary()
            r1.setNeedsToBeDrawn()
            return
    }

    public void submitStickfigure() {
            r2 = this;
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r0 = r0.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r0 != r1) goto L26
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.iosCanUseMail()
            if (r0 == 0) goto L16
            r2.actuallySubmitStickfigure()
            goto L45
        L16:
            org.fortheloss.sticknodes.animationscreen.dialogs.IOSMailErrorDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.IOSMailErrorDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            goto L45
        L26:
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto L32
            r2.actuallySubmitStickfigure()
            goto L45
        L32:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            r0 = 10
            r2._callbackAndroidRequestStoragePermission = r0
        L45:
            return
    }

    public void toggleCameraMode() {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r1._framesModuleRef
            r0.toggleCameraMode()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModuleRef
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CameraToolTable r0 = r1._cameraToolTable
            r0.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void toggleFigureTweenMode() {
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r4.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            byte r1 = r0.getTweenMode()
            r2 = 1
            if (r1 != 0) goto L14
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4._canvasModuleRef
            r1.setFigureTweenMode(r2, r0)
            goto L35
        L14:
            r3 = 2
            if (r1 != r2) goto L1d
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4._canvasModuleRef
            r1.setFigureTweenMode(r3, r0)
            goto L35
        L1d:
            r2 = 3
            if (r1 != r3) goto L26
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4._canvasModuleRef
            r1.setFigureTweenMode(r2, r0)
            goto L35
        L26:
            if (r1 != r2) goto L2f
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4._canvasModuleRef
            r2 = 4
            r1.setFigureTweenMode(r2, r0)
            goto L35
        L2f:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r4._canvasModuleRef
            r2 = 0
            r1.setFigureTweenMode(r2, r0)
        L35:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r4._stickfigureToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = r4._movieclipToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = r4._spriteToolTable
            r0.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void toggleSpriteLockState() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.toggleSpriteLockState(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = r2._spriteToolTable
            r0.update()
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void toggleSpriteSmartStretchState() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r2._canvasModuleRef
            r1.toggleSpriteSmartStretchState(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = r2._spriteToolTable
            r0.update()
            r2.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void tweenStickfigureColors(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getCurrentlySelectedStickfigure()
            r0.tweenStickfigureColors(r3, r1)
            return
    }

    public void undo() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.undo()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void unjoinFigure() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r3._canvasModuleRef
            r2 = 0
            r1.unjoinFigure(r0, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r3._stickfigureToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = r3._movieclipToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = r3._spriteToolTable
            r0.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void unjoinFigure(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            r1 = 1
            r0.unjoinFigure(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r3 = r2._stickfigureToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r3 = r2._movieclipToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r3 = r2._spriteToolTable
            r3.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void unlockFigureFromCamera() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3.getCurrentlySelectedFigure()
            if (r0 == 0) goto L34
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 == 0) goto Lf
            goto L34
        Lf:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r3._framesModuleRef
            int r0 = r0.getID()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r3._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r2 = r2.getCurrentFrame()
            org.fortheloss.sticknodes.data.FrameData r2 = (org.fortheloss.sticknodes.data.FrameData) r2
            r1.removeFigureFromCameraLock(r0, r2)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r0.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r3._stickfigureToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = r3._movieclipToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = r3._spriteToolTable
            r0.update()
        L34:
            return
    }

    public void updateAnimationTools() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r2._animationToolTable
            r1 = 1
            r0.update(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r2._animationToolTable2
            r0.update(r1)
            r2.setNeedsToBeDrawn()
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

    public void updateFrameTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r1._frameToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateJumpToolTable() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r1._jumpToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateLibraryTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0 = r1._libraryToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0 = r1._libraryToolTable
            r0.updateStickfigureLibrary()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateMCLibraryTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0 = r1._mcLibraryToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0 = r1._mcLibraryToolTable
            r0.updateMCLibrary()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateMovieclipTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipToolTable r0 = r1._movieclipToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateSegmentTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0 = r1._segmentToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r0 = r1._segmentMainNodeToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateSpriteLibraryTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0 = r1._spriteLibraryToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0 = r1._spriteLibraryToolTable
            r0.updateSpriteLibrary()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateSpriteTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = r1._spriteToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateStickfigureTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r1._stickfigureToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateTextfieldTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.TextfieldToolTable r0 = r1._textfieldToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateZoomDisplay(float r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r0 = r1._permanentAnimationToolTable
            r0.setZoom(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r2 = r1._permanentAnimationToolTable
            r2.update()
            r1.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void useCircleOutline(boolean r3) {
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
            r0.useCircleOutline(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r3 = r2._segmentToolTable
            r3.update()
        L27:
            return
    }

    public void useFrameGradient(boolean r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getCurrentlySelectedFrameData()
            if (r0 == 0) goto L19
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.data.FrameData
            if (r1 != 0) goto Ld
            goto L19
        Ld:
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r2._framesModuleRef
            r1.useFrameGradient(r3, r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r3 = r2._frameToolTable
            r3.update()
        L19:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void useSegmentColor(boolean r3) {
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
            r0.useSegmentColor(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r3 = r2._segmentToolTable
            r3.update()
        L27:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void useSegmentGradient(boolean r3) {
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
            r0.useSegmentGradient(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r3 = r2._segmentToolTable
            r3.update()
        L27:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void useSegmentScale(boolean r3) {
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
            r0.useSegmentScale(r3, r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r3 = r2._segmentToolTable
            r3.update()
        L27:
            return
    }

    public void userChoosingFigure(boolean r7, java.lang.String r8, java.lang.String r9, org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.userChoosingFigure(r1, r2, r3, r4, r5)
            return
    }

    public void userChoosingFigure(boolean r2, java.lang.String r3, java.lang.String r4, org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter r5, com.badlogic.gdx.scenes.scene2d.Actor[] r6) {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            int r0 = r0.getScreen()
            if (r0 == 0) goto L9
            return
        L9:
            r1._isWaitingForUserToChooseStickfigure = r2
            if (r2 == 0) goto L32
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r2 = r1._userChooseStickfigureToolTable
            r2.setMessage(r3, r4, r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r2 = r1._userChooseStickfigureToolTable
            r2.addExtras(r6)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r1._currentActiveScrollPaneRef
            r1.removeActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r1._userChooseStickfigureScrollPane
            r1.addActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r1._userChooseStickfigureScrollPane
            r1._currentActiveScrollPaneRef = r2
            r2.updateAllToolTables()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentAnimationToolTable r2 = r1._permanentAnimationToolTable
            r2.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r2 = r1._jumpToolTable
            r2.update()
        L32:
            r1.setNeedsToBeDrawn()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter
    public void userChoseNode(org.fortheloss.sticknodes.stickfigure.INode r4) {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r1 = 0
            r2 = 0
            r0.promptUserToChooseStickfigure(r1, r1, r1, r2)
            r3.onSessionSelectionChange()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3._figureToJoinRef
            if (r0 == 0) goto L1d
            boolean r2 = r4 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r2 != 0) goto L13
            goto L1d
        L13:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r3._canvasModuleRef
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r2.joinFigureTo(r0, r4)
            r3._figureToJoinRef = r1
            return
        L1d:
            r3._figureToJoinRef = r1
            return
    }

    public void zoomCameraTo(float r10, boolean r11) {
            r9 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            if (r0 != 0) goto L9
            return
        L9:
            float r0 = r9._cameraStartZoom
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L36
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            float r0 = r0.getCameraScale()
            r9._cameraStartZoom = r0
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            float r0 = r0.getCameraOffsetX()
            r9._cameraStartX = r0
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getCurrentlySelectedFrameCamera()
            float r0 = r0.getCameraOffsetY()
            r9._cameraStartY = r0
        L36:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r2 = r9._canvasModuleRef
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r4 = r0.getCurrentlySelectedFrameCamera()
            float r5 = r9._cameraStartZoom
            float r6 = r9._cameraStartX
            float r7 = r9._cameraStartY
            r3 = r10
            r8 = r11
            r2.zoomCameraTo(r3, r4, r5, r6, r7, r8)
            if (r11 == 0) goto L4d
            r9._cameraStartZoom = r1
        L4d:
            return
    }
}
