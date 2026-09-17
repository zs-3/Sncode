package org.fortheloss.sticknodes.animationscreen.modules;

/* loaded from: classes2.dex */
public class MovieclipToolsModule extends org.fortheloss.sticknodes.animationscreen.modules.Module implements org.fortheloss.framework.IImageRequester, org.fortheloss.framework.IAndroidStorageRequester, org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter, org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule, org.fortheloss.sticknodes.animationscreen.modules.ICreationBasedModule {
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable _animationToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable _animationToolTable2;
    private org.fortheloss.framework.Assets _assetsRef;
    private boolean _backgroundImageOnTop;
    private float _backgroundImageTransparency;
    private com.badlogic.gdx.graphics.g2d.TextureRegion _backgroundTR;
    private boolean _calculatedScissors;
    private int _callbackAndroidRequestStoragePermission;
    private int _callbackImageLoadType;
    private org.fortheloss.sticknodes.animationscreen.dialogs.CancelMovieclipDialog _cancelDialog;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable _collapseableSpriteFiltersToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable _collapseableStickfigureFiltersToolTable;
    private org.fortheloss.sticknodes.movieclip.MCMovieclipSource _createdMCSource;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _currentActiveScrollPaneRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _defaultScrollPane;
    private org.fortheloss.sticknodes.animationscreen.IDrawableFigure _figureToJoinRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _frameScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable _frameToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable _horizontalLibraryToolTables;
    private boolean _incrementingTracedFrame;
    private boolean _isWaitingForUserToChooseStickfigure;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable _jumpToolTable;
    private int _lastSelectedFrameTraceIndex;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable _libraryToolTable;
    private int _mcFrameIndexOffsetWhenIncrementing;
    private org.fortheloss.sticknodes.animationscreen.dialogs.AddMovieclipToLibraryDialog _movieclipAddToLibraryDialogRef;
    private org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog _movieclipIsSavingDialogRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable _movieclipModeToolTable;
    private org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipSaveAsDialog _movieclipSaveAsDialogRef;
    private org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipOverwriteDialog _movieclipSaveOverwriteDialogRef;
    private boolean _ownsTracingBackgroundImage;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable _permanentMovieclipToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _playingScrollPane;
    private float _previewZoom;
    private com.badlogic.gdx.math.Vector2 _previewZoomPosition;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private com.badlogic.gdx.math.Rectangle _scissorBounds1;
    private com.badlogic.gdx.math.Rectangle _scissorPermanentToolsBounds;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> _scrollPanes;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable _segmentMainNodeToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable _segmentToolTable;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable _spriteFiltersToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable _spriteLibraryToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _spriteScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable _spriteToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable _stickfigureFiltersToolTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _stickfigureScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable _stickfigureToolTable;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> _toolTables;
    private org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog _traceFrameDialogRef;
    private com.badlogic.gdx.graphics.Texture _tracingBackgroundImage;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane _userChooseStickfigureScrollPane;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable _userChooseStickfigureToolTable;
    private org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog _waitForLoadedImageDialog;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> mSegmentToolsCellRef;




    /* renamed from: org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$4, reason: invalid class name */
    class AnonymousClass4 extends org.fortheloss.sticknodes.animationscreen.dialogs.BackgroundQualityDialog {
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule this$0;


        AnonymousClass4(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1, org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        static /* synthetic */ org.fortheloss.sticknodes.animationscreen.AnimationScreen access$000(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule.AnonymousClass4 r0) {
                org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0._animationScreenRef
                return r0
        }

        @Override // org.fortheloss.sticknodes.animationscreen.dialogs.BackgroundQualityDialog
        protected void continueLoading() {
                r3 = this;
                super.continueLoading()
                int r0 = r3.getQuality()
                java.lang.Thread r1 = new java.lang.Thread
                org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$4$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$4$1
                r2.<init>(r3, r0)
                r1.<init>(r2)
                r1.start()
                return
        }
    }





    private class MCSaveRunnable implements java.lang.Runnable {
        private org.fortheloss.framework.Assets _assetsRef;
        private com.badlogic.gdx.graphics.g2d.SpriteBatch _batchRef;
        private java.lang.String _filename;
        private org.fortheloss.sticknodes.movieclip.MCMovieclipSource _mcSourceRef;
        private org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule _movieclipToolsModuleRef;
        private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
        private org.fortheloss.sticknodes.SNShapeRenderer _shapeRendererRef;
        private com.badlogic.gdx.scenes.scene2d.Stage _stageRef;
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule this$0;


        /* renamed from: -$$Nest$fget_movieclipToolsModuleRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule m831$$Nest$fget_movieclipToolsModuleRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule.MCSaveRunnable r0) {
                org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r0._movieclipToolsModuleRef
                return r0
        }

        /* renamed from: -$$Nest$fput_assetsRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m832$$Nest$fput_assetsRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule.MCSaveRunnable r0, org.fortheloss.framework.Assets r1) {
                r0._assetsRef = r1
                return
        }

        /* renamed from: -$$Nest$fput_batchRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m833$$Nest$fput_batchRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule.MCSaveRunnable r0, com.badlogic.gdx.graphics.g2d.SpriteBatch r1) {
                r0._batchRef = r1
                return
        }

        /* renamed from: -$$Nest$fput_filename, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m834$$Nest$fput_filename(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule.MCSaveRunnable r0, java.lang.String r1) {
                r0._filename = r1
                return
        }

        /* renamed from: -$$Nest$fput_mcSourceRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m835$$Nest$fput_mcSourceRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule.MCSaveRunnable r0, org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1) {
                r0._mcSourceRef = r1
                return
        }

        /* renamed from: -$$Nest$fput_movieclipToolsModuleRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m836$$Nest$fput_movieclipToolsModuleRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule.MCSaveRunnable r0, org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1) {
                r0._movieclipToolsModuleRef = r1
                return
        }

        /* renamed from: -$$Nest$fput_projectDataRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m837$$Nest$fput_projectDataRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule.MCSaveRunnable r0, org.fortheloss.sticknodes.data.ProjectData r1) {
                r0._projectDataRef = r1
                return
        }

        /* renamed from: -$$Nest$fput_shapeRendererRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m838$$Nest$fput_shapeRendererRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule.MCSaveRunnable r0, org.fortheloss.sticknodes.SNShapeRenderer r1) {
                r0._shapeRendererRef = r1
                return
        }

        /* renamed from: -$$Nest$fput_stageRef, reason: not valid java name */
        static /* bridge */ /* synthetic */ void m839$$Nest$fput_stageRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule.MCSaveRunnable r0, com.badlogic.gdx.scenes.scene2d.Stage r1) {
                r0._stageRef = r1
                return
        }

        public MCSaveRunnable(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r1, org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2, org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3, java.lang.String r4, org.fortheloss.sticknodes.data.ProjectData r5, com.badlogic.gdx.scenes.scene2d.Stage r6, org.fortheloss.sticknodes.SNShapeRenderer r7, com.badlogic.gdx.graphics.g2d.SpriteBatch r8, org.fortheloss.framework.Assets r9) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0._movieclipToolsModuleRef = r2
                r0._mcSourceRef = r3
                r0._filename = r4
                r0._projectDataRef = r5
                r0._stageRef = r6
                r0._shapeRendererRef = r7
                r0._batchRef = r8
                r0._assetsRef = r9
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                r0 = 250(0xfa, double:1.235E-321)
                java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L6
                goto La
            L6:
                r0 = move-exception
                r0.printStackTrace()
            La:
                org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r8._mcSourceRef
                java.lang.String r2 = r8._filename
                org.fortheloss.sticknodes.data.ProjectData r3 = r8._projectDataRef
                com.badlogic.gdx.scenes.scene2d.Stage r4 = r8._stageRef
                org.fortheloss.sticknodes.SNShapeRenderer r5 = r8._shapeRendererRef
                com.badlogic.gdx.graphics.g2d.SpriteBatch r6 = r8._batchRef
                org.fortheloss.framework.Assets r7 = r8._assetsRef
                boolean r0 = r1.save(r2, r3, r4, r5, r6, r7)
                com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
                org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$MCSaveRunnable$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$MCSaveRunnable$1
                r2.<init>(r8, r0)
                r1.postRunnable(r2)
                return
        }
    }

    /* renamed from: -$$Nest$fget_callbackImageLoadType, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m817$$Nest$fget_callbackImageLoadType(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0) {
            int r0 = r0._callbackImageLoadType
            return r0
    }

    /* renamed from: -$$Nest$fget_canvasModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.CanvasModule m818$$Nest$fget_canvasModuleRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r0._canvasModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_currentActiveScrollPaneRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane m819$$Nest$fget_currentActiveScrollPaneRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r0._currentActiveScrollPaneRef
            return r0
    }

    /* renamed from: -$$Nest$fget_frameToolTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable m820$$Nest$fget_frameToolTable(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r0._frameToolTable
            return r0
    }

    /* renamed from: -$$Nest$fget_framesModuleRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.FramesModule m821$$Nest$fget_framesModuleRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r0._framesModuleRef
            return r0
    }

    /* renamed from: -$$Nest$fget_movieclipModeToolTable, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable m822$$Nest$fget_movieclipModeToolTable(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0 = r0._movieclipModeToolTable
            return r0
    }

    /* renamed from: -$$Nest$fget_projectDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.ProjectData m823$$Nest$fget_projectDataRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0) {
            org.fortheloss.sticknodes.data.ProjectData r0 = r0._projectDataRef
            return r0
    }

    /* renamed from: -$$Nest$fget_sessionDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.SessionData m824$$Nest$fget_sessionDataRef(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0) {
            org.fortheloss.sticknodes.data.SessionData r0 = r0._sessionDataRef
            return r0
    }

    /* renamed from: -$$Nest$fget_spriteScrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane m825$$Nest$fget_spriteScrollPane(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r0._spriteScrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_stickfigureScrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane m826$$Nest$fget_stickfigureScrollPane(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0) {
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r0._stickfigureScrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_tracingBackgroundImage, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.graphics.Texture m827$$Nest$fget_tracingBackgroundImage(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0) {
            com.badlogic.gdx.graphics.Texture r0 = r0._tracingBackgroundImage
            return r0
    }

    /* renamed from: -$$Nest$fput_callbackImageLoadType, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m828$$Nest$fput_callbackImageLoadType(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0, int r1) {
            r0._callbackImageLoadType = r1
            return
    }

    /* renamed from: -$$Nest$fput_ownsTracingBackgroundImage, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m829$$Nest$fput_ownsTracingBackgroundImage(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0, boolean r1) {
            r0._ownsTracingBackgroundImage = r1
            return
    }

    /* renamed from: -$$Nest$fput_tracingBackgroundImage, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m830$$Nest$fput_tracingBackgroundImage(org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0, com.badlogic.gdx.graphics.Texture r1) {
            r0._tracingBackgroundImage = r1
            return
    }

    public MovieclipToolsModule(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, com.badlogic.gdx.graphics.glutils.FrameBuffer r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0._lastSelectedFrameTraceIndex = r1
            r0._mcFrameIndexOffsetWhenIncrementing = r1
            r0._incrementingTracedFrame = r1
            r0._ownsTracingBackgroundImage = r1
            r2 = 1056964608(0x3f000000, float:0.5)
            r0._backgroundImageTransparency = r2
            r0._backgroundImageOnTop = r1
            r0._calculatedScissors = r1
            r0._isWaitingForUserToChooseStickfigure = r1
            r0._callbackImageLoadType = r1
            r0._callbackAndroidRequestStoragePermission = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0._previewZoom = r1
            r0.setNeedsToBeDrawn()
            r0.addWidgetClickListener()
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$1
            r1.<init>(r0)
            r0.addListener(r1)
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

    private void actuallyLoadBackground() {
            r3 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "about_to_set_movieclip_background_image"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$4 r0 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$4
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r3, r1)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r1.addDialogToStage(r0)
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
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$6 r1 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$6
            r1.<init>(r3)
            r0.<init>(r1)
            r0.start()
            return
    }

    private void actuallySaveMovieclip() {
            r3 = this;
            boolean r0 = org.fortheloss.sticknodes.App.verifyPathsExist()
            if (r0 == 0) goto L2b
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipSaveAsDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipSaveAsDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r1, r3)
            r3._movieclipSaveAsDialogRef = r0
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r3._createdMCSource
            java.lang.String r1 = r1.getName()
            if (r1 == 0) goto L1e
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r3._createdMCSource
            java.lang.String r1 = r1.getName()
            goto L20
        L1e:
            java.lang.String r1 = ""
        L20:
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipSaveAsDialog r1 = r3._movieclipSaveAsDialogRef
            r0.addDialogToStage(r1)
            goto L3c
        L2b:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            java.lang.String r1 = "errorSavingMCTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "errorSavingStickfigureInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r0.showErrorDialog(r1, r2)
        L3c:
            return
    }

    private void actuallySetFrameIndexToTrace(int r3) {
            r2 = this;
            float r0 = r2._backgroundImageTransparency
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb
            r0 = 1056964608(0x3f000000, float:0.5)
            r2._backgroundImageTransparency = r0
        Lb:
            boolean r0 = r2._incrementingTracedFrame
            r2.clearBackgroundImage()
            r2._incrementingTracedFrame = r0
            r2._lastSelectedFrameTraceIndex = r3
            org.fortheloss.sticknodes.data.ProjectData r0 = r2._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r0.frames
            java.lang.Object r0 = r0.get(r3)
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r1 = r2._frameToolTable
            r1.setTracedFrameIndex(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r3 = r2._frameToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            com.badlogic.gdx.graphics.glutils.FrameBuffer r3 = r3.getTracingFBO()
            com.badlogic.gdx.graphics.GLTexture r3 = r3.getColorBufferTexture()
            com.badlogic.gdx.graphics.Texture r3 = (com.badlogic.gdx.graphics.Texture) r3
            r2._tracingBackgroundImage = r3
            r3 = 0
            r2._ownsTracingBackgroundImage = r3
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setTracingFrameData(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r3 = r2._movieclipModeToolTable
            r3.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            com.badlogic.gdx.graphics.Texture r0 = r2._tracingBackgroundImage
            r3.updateBackgroundImage(r0)
            r2.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3 = r2._canvasModuleRef
            r3.setNeedsToBeDrawn()
            return
    }

    private org.fortheloss.sticknodes.animationscreen.IDrawableFigure getCurrentlySelectedFigure() {
            r1 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto Le
            org.fortheloss.sticknodes.data.SessionData r0 = r1._sessionDataRef
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCurrentlySelectedSprite()
        Le:
            return r0
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
    public void act(float r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 2
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
            boolean r3 = org.fortheloss.sticknodes.App.BACK_KEY_PRESSED
            if (r3 == 0) goto L9d
            r3 = 0
            org.fortheloss.sticknodes.App.BACK_KEY_PRESSED = r3
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            int r3 = r3.getMode()
            r0 = 3
            if (r3 != r0) goto L46
            r3 = 1
            org.fortheloss.sticknodes.App.BACK_KEY_PRESSED = r3
            goto L9d
        L46:
            org.fortheloss.sticknodes.animationscreen.dialogs.AddMovieclipToLibraryDialog r3 = r2._movieclipAddToLibraryDialogRef
            if (r3 == 0) goto L56
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L56
            org.fortheloss.sticknodes.animationscreen.dialogs.AddMovieclipToLibraryDialog r3 = r2._movieclipAddToLibraryDialogRef
            r3.hideImmediately()
            goto L9d
        L56:
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipOverwriteDialog r3 = r2._movieclipSaveOverwriteDialogRef
            if (r3 == 0) goto L66
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L66
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipOverwriteDialog r3 = r2._movieclipSaveOverwriteDialogRef
            r3.hideImmediately()
            goto L9d
        L66:
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipSaveAsDialog r3 = r2._movieclipSaveAsDialogRef
            if (r3 == 0) goto L76
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L76
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipSaveAsDialog r3 = r2._movieclipSaveAsDialogRef
            r3.hideImmediately()
            goto L9d
        L76:
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog r3 = r2._traceFrameDialogRef
            if (r3 == 0) goto L86
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L86
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog r3 = r2._traceFrameDialogRef
            r3.hideImmediately()
            goto L9d
        L86:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            boolean r3 = r3.hasActiveDialogs()
            if (r3 != 0) goto L9d
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r2._createdMCSource
            int r3 = r3.getLibraryID()
            if (r3 >= 0) goto L9a
            r2.cancelMovieclipMode()
            goto L9d
        L9a:
            r2.addMovieclipToLibrary()
        L9d:
            return
    }

    public void addMovieclipToLibrary() {
            r3 = this;
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._createdMCSource
            r0.recalculateAllNextFrameStickfigureIndicesForTweening()
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._createdMCSource
            int r0 = r0.getLibraryID()
            if (r0 >= 0) goto L34
            org.fortheloss.sticknodes.animationscreen.dialogs.AddMovieclipToLibraryDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.AddMovieclipToLibraryDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r1, r3)
            r3._movieclipAddToLibraryDialogRef = r0
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r3._createdMCSource
            java.lang.String r1 = r1.getName()
            if (r1 == 0) goto L25
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r3._createdMCSource
            java.lang.String r1 = r1.getName()
            goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = r3._createdMCSource
            r0.initialize(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.AddMovieclipToLibraryDialog r1 = r3._movieclipAddToLibraryDialogRef
            r0.addDialogToStage(r1)
            goto L3f
        L34:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r3._createdMCSource
            r0.movieclipSourceEdited(r1)
            r0 = 1
            r3.setToAnimateScreen(r0)
        L3f:
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

    public void cancelMovieclipMode() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.CancelMovieclipDialog r0 = r2._cancelDialog
            if (r0 == 0) goto L17
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r0.getDialog()
            if (r0 == 0) goto L17
            org.fortheloss.sticknodes.animationscreen.dialogs.CancelMovieclipDialog r0 = r2._cancelDialog
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r0.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 == 0) goto L17
            return
        L17:
            org.fortheloss.sticknodes.animationscreen.dialogs.CancelMovieclipDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.CancelMovieclipDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r2._cancelDialog = r0
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.CancelMovieclipDialog r1 = r2._cancelDialog
            r0.addDialogToStage(r1)
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
            if (r0 != r2) goto L9
            return
        L9:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.setSessionMode(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r2 = r1._permanentMovieclipToolTable
            r2.update()
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
            r0 = 0
            r3._lastSelectedFrameTraceIndex = r0
            r3._incrementingTracedFrame = r0
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r0.setTracingStickfigure(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r0.setTracingFrameData(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r0.updateBackgroundImage(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r3._frameToolTable
            r1 = -1
            r0.setTracedFrameIndex(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r3._frameToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0 = r3._movieclipModeToolTable
            r0.update()
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
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$7 r0 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$7
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
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r2._spriteFiltersToolTable
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
            org.fortheloss.sticknodes.data.MCFrameData r1 = (org.fortheloss.sticknodes.data.MCFrameData) r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r4._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = r4._createdMCSource
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void createNewStickfigure() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r1 = 0
            r2 = 2
            r0.setToCreateScreen(r1, r2)
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
            r3._canvasModuleRef = r0
            r3._framesModuleRef = r0
            r3._backgroundTR = r0
            r3._movieclipAddToLibraryDialogRef = r0
            r3._traceFrameDialogRef = r0
            r3._movieclipSaveAsDialogRef = r0
            r3._movieclipSaveOverwriteDialogRef = r0
            r3._movieclipIsSavingDialogRef = r0
            r3._cancelDialog = r0
            com.badlogic.gdx.graphics.Texture r1 = r3._tracingBackgroundImage
            if (r1 == 0) goto L26
            boolean r2 = r3._ownsTracingBackgroundImage
            if (r2 == 0) goto L24
            r1.dispose()
        L24:
            r3._tracingBackgroundImage = r0
        L26:
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r3._createdMCSource
            if (r1 == 0) goto L37
            int r1 = r1.getLibraryID()
            if (r1 >= 0) goto L35
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r1 = r3._createdMCSource
            r1.dispose()
        L35:
            r3._createdMCSource = r0
        L37:
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r1 = r3._waitForLoadedImageDialog
            if (r1 == 0) goto L4c
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r1 = r1.getDialog()
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            if (r1 == 0) goto L4a
            org.fortheloss.sticknodes.animationscreen.dialogs.BlankDialog r1 = r3._waitForLoadedImageDialog
            r1.hideImmediately()
        L4a:
            r3._waitForLoadedImageDialog = r0
        L4c:
            r3._currentActiveScrollPaneRef = r0
            r3._defaultScrollPane = r0
            r3._playingScrollPane = r0
            r3._frameScrollPane = r0
            r3._stickfigureScrollPane = r0
            r3._spriteScrollPane = r0
            r3._userChooseStickfigureScrollPane = r0
            r3._permanentMovieclipToolTable = r0
            r3._jumpToolTable = r0
            r3._movieclipModeToolTable = r0
            r3._animationToolTable = r0
            r3._animationToolTable2 = r0
            r3._horizontalLibraryToolTables = r0
            r3._libraryToolTable = r0
            r3._spriteLibraryToolTable = r0
            r3._frameToolTable = r0
            r3._stickfigureToolTable = r0
            r3._stickfigureFiltersToolTable = r0
            r3._collapseableStickfigureFiltersToolTable = r0
            r3._segmentToolTable = r0
            r3._segmentMainNodeToolTable = r0
            r3._spriteToolTable = r0
            r3._spriteFiltersToolTable = r0
            r3._collapseableSpriteFiltersToolTable = r0
            r3._userChooseStickfigureToolTable = r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r1 = r3._toolTables
            if (r1 == 0) goto L9a
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L88:
            if (r1 < 0) goto L98
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r2 = r3._toolTables
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r2 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L88
        L98:
            r3._toolTables = r0
        L9a:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r1 = r3._scrollPanes
            if (r1 == 0) goto Lb6
            int r1 = r1.size()
            int r1 = r1 + (-1)
        La4:
            if (r1 < 0) goto Lb4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r2 = r3._scrollPanes
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto La4
        Lb4:
            r3._scrollPanes = r0
        Lb6:
            r3._scissorBounds1 = r0
            r3._scissorPermanentToolsBounds = r0
            r3.mSegmentToolsCellRef = r0
            return
    }

    @Override // com.badlogic.gdx.scenes.scene2d.Group, com.badlogic.gdx.scenes.scene2d.Actor
    public void draw(com.badlogic.gdx.graphics.g2d.Batch r18, float r19) {
            r17 = this;
            r0 = r17
            boolean r1 = r0._needsToBeDrawn
            if (r1 == 0) goto L135
            r1 = 0
            r0._needsToBeDrawn = r1
            boolean r2 = r0._calculatedScissors
            r3 = 1
            if (r2 != 0) goto Lac
            com.badlogic.gdx.math.Rectangle r2 = new com.badlogic.gdx.math.Rectangle
            r2.<init>()
            r0._scissorBounds1 = r2
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
            int r2 = r2.getScreenHeight()
            float r9 = (float) r2
            com.badlogic.gdx.math.Matrix4 r10 = r18.getTransformMatrix()
            com.badlogic.gdx.math.Rectangle r11 = new com.badlogic.gdx.math.Rectangle
            float r2 = r17.getX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r4 = r0._permanentMovieclipToolTable
            float r4 = r4.getX()
            float r2 = r2 + r4
            float r4 = r17.getY()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r12 = r0._permanentMovieclipToolTable
            float r12 = r12.getY()
            float r4 = r4 + r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r12 = r0._permanentMovieclipToolTable
            float r12 = r12.getWidth()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r13 = r0._permanentMovieclipToolTable
            float r13 = r13.getHeight()
            r11.<init>(r2, r4, r12, r13)
            com.badlogic.gdx.math.Rectangle r12 = r0._scissorPermanentToolsBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.calculateScissors(r5, r6, r7, r8, r9, r10, r11, r12)
            r0._calculatedScissors = r3
        Lac:
            com.badlogic.gdx.graphics.glutils.FrameBuffer.unbind()
            com.badlogic.gdx.graphics.glutils.FrameBuffer r2 = r0._fboRef
            r2.bind()
            r18.flush()
            com.badlogic.gdx.math.Rectangle r2 = r0._scissorBounds1
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r0._currentActiveScrollPaneRef
            r2.setVisible(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r2 = r0._permanentMovieclipToolTable
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
            com.badlogic.gdx.math.Rectangle r6 = r0._scissorPermanentToolsBounds
            com.badlogic.gdx.scenes.scene2d.utils.ScissorStack.pushScissors(r6)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r6 = r0._currentActiveScrollPaneRef
            r6.setVisible(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r1 = r0._permanentMovieclipToolTable
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
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r1 = r0._permanentMovieclipToolTable
            r1.setVisible(r3)
        L135:
            return
    }

    public void drawNodesOnTracedFbo(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r1._canvasModuleRef
            r0.setDrawNodesOnTracedFbo(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void editSelectedStickfigure() {
            r6 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r6._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r0.getCurrentlySelectedStickfigure()
            if (r0 != 0) goto L9
            return
        L9:
            int r0 = r0.getLibraryID()
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.show_edit_stickfigure_warning_count
            r2 = 1
            r3 = 2
            if (r1 >= r3) goto L43
            org.fortheloss.sticknodes.data.SessionData r1 = r6._sessionDataRef
            boolean r1 = r1.getNerdModeEnabled()
            if (r1 != 0) goto L43
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.show_edit_stickfigure_warning_count
            int r1 = r1 + r2
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule.show_edit_stickfigure_warning_count = r1
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$5 r1 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$5
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r6._animationScreenRef
            r1.<init>(r6, r2, r0)
            java.lang.String r0 = "editStickfigureTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r2 = "editStickfigureInfo"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "okay"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r4 = 0
            r1.initialize(r0, r2, r3, r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.addDialogToStage(r1)
            goto L53
        L43:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = new org.fortheloss.sticknodes.stickfigure.Stickfigure
            org.fortheloss.sticknodes.data.ProjectData r5 = r6._projectDataRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r5.getLibraryStickfigure(r0)
            r4.<init>(r0, r2)
            r1.setToCreateScreen(r4, r3)
        L53:
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
            r4 = 2
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
            if (r5 == 0) goto L54
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r5 = r4._segmentToolTable
            r5.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r5 = r4._segmentMainNodeToolTable
            r5.update()
            goto L5d
        L54:
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r5 == 0) goto L5d
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r5 = r4._spriteToolTable
            r5.update()
        L5d:
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
            if (r5 == 0) goto L54
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r5 = r4._segmentToolTable
            r5.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r5 = r4._segmentMainNodeToolTable
            r5.update()
            goto L5d
        L54:
            boolean r5 = r0 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r5 == 0) goto L5d
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r5 = r4._spriteToolTable
            r5.update()
        L5d:
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

    public com.badlogic.gdx.graphics.Color getBackgroundColor() {
            r1 = this;
            com.badlogic.gdx.graphics.Color r0 = org.fortheloss.sticknodes.data.MCFrameData.getBackgroundColor()
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

    public int getLastSelectedFrameIndexToTrace() {
            r1 = this;
            int r0 = r1._lastSelectedFrameTraceIndex
            return r0
    }

    public org.fortheloss.sticknodes.movieclip.MCMovieclipSource getMCMovieclipSourceBeingEdited() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._createdMCSource
            return r0
    }

    public java.lang.String getMCName() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._createdMCSource
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.getName()
            return r0
    }

    public float getPreviewZoom() {
            r1 = this;
            float r0 = r1._previewZoom
            return r0
    }

    public com.badlogic.gdx.math.Vector2 getPreviewZoomPosition() {
            r1 = this;
            com.badlogic.gdx.math.Vector2 r0 = r1._previewZoomPosition
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void importSound() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallyImportSound()
            goto L1e
        Lc:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
            r0 = 3
            r2._callbackAndroidRequestStoragePermission = r0
        L1e:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void importStickfigure(java.lang.String r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.ImportDialog.oneTimeUsePrefix = r2
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            boolean r2 = r2.androidHasStoragePermission()
            if (r2 == 0) goto Le
            r1.actuallyImportStickfigure()
            goto L20
        Le:
            org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.StoragePermissionRequestDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r2.<init>(r0, r1)
            r2.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.addDialogToStage(r2)
            r2 = 2
            r1._callbackAndroidRequestStoragePermission = r2
        L20:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.Module
    public void initialize(org.fortheloss.framework.Assets r15) {
            r14 = this;
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r0 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            super.initialize(r15)
            r14._assetsRef = r15
            com.badlogic.gdx.math.Vector2 r1 = new com.badlogic.gdx.math.Vector2
            r2 = 0
            r1.<init>(r2, r2)
            r14._previewZoomPosition = r1
            java.lang.String r1 = org.fortheloss.sticknodes.App.animationMenuAtlas
            r3 = 1
            java.lang.Object r1 = r15.get(r1, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r1 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r1
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            java.lang.Object r4 = r15.get(r4, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            java.lang.String r5 = org.fortheloss.sticknodes.App.colorPickerAtlas
            java.lang.Object r15 = r15.get(r5, r0, r3)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r15 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r15
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r14._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r0 = r0.getProjectData()
            r14._projectDataRef = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r14._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            r14._sessionDataRef = r0
            boolean r0 = r0.getIsLeftHandMode()
            com.badlogic.gdx.graphics.Color r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDefaultStageBGColor()
            org.fortheloss.sticknodes.data.MCFrameData.setBackgroundColor(r5)
            java.lang.String r5 = "square"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r5 = r1.findRegion(r5)
            r14._backgroundTR = r5
            r5 = 1139277824(0x43e80000, float:464.0)
            if (r0 != 0) goto L5f
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r5
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r14.getStage()
            float r5 = r5.getHeight()
            r14.setSize(r6, r5)
            goto L75
        L5f:
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r5
            com.badlogic.gdx.scenes.scene2d.Stage r5 = r14.getStage()
            float r5 = r5.getHeight()
            r7 = 1135345664(0x43ac0000, float:344.0)
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r7
            float r5 = r5 - r8
            r14.setSize(r6, r5)
        L75:
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTableGrayBackground()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r14._scrollPanes = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r14._toolTables = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable
            org.fortheloss.sticknodes.data.ProjectData r7 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r8 = r14._sessionDataRef
            r6.<init>(r14, r7, r8)
            r14._permanentMovieclipToolTable = r6
            r6.initialize(r1, r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r6 = r14._permanentMovieclipToolTable
            float r7 = r14.getWidth()
            r6.setWidth(r7)
            if (r0 != 0) goto Lb1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r6 = r14._permanentMovieclipToolTable
            float r7 = r14.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r8 = r14._permanentMovieclipToolTable
            float r8 = r8.getHeight()
            float r7 = r7 - r8
            r6.setPosition(r2, r7)
            goto Ld3
        Lb1:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r6 = r14._permanentMovieclipToolTable
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r14.getStage()
            float r7 = r7.getWidth()
            float r8 = r14.getWidth()
            float r7 = r7 - r8
            float r7 = -r7
            com.badlogic.gdx.scenes.scene2d.Stage r8 = r14.getStage()
            float r8 = r8.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r9 = r14._permanentMovieclipToolTable
            float r9 = r9.getHeight()
            float r8 = r8 - r9
            r6.setPosition(r7, r8)
        Ld3:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r6 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r7 = r14._permanentMovieclipToolTable
            r6.add(r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r6 = r14._permanentMovieclipToolTable
            r14.addActor(r6)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r7 = r14._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r8 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r9 = r14._sessionDataRef
            r6.<init>(r7, r14, r8, r9)
            r14._jumpToolTable = r6
            r6.initialize(r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r6 = r14._jumpToolTable
            float r7 = r14.getWidth()
            r6.setWidth(r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r6 = r14._jumpToolTable
            r6.setPosition(r2, r2)
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
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r8 = r14._permanentMovieclipToolTable
            float r8 = r8.getHeight()
            float r7 = r7 - r8
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r8 = r14._jumpToolTable
            float r8 = r8.getHeight()
            float r7 = r7 - r8
            float r8 = (float) r6
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r9 = r9 * r8
            float r7 = r7 - r9
            if (r0 == 0) goto L137
            float r0 = r14.getHeight()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r7 = r14._jumpToolTable
            float r7 = r7.getHeight()
            float r0 = r0 - r7
            float r7 = r0 - r8
        L137:
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
            r0.setPosition(r2, r9)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r9 = r14._defaultScrollPane
            r0.add(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r9 = r14._canvasModuleRef
            org.fortheloss.sticknodes.data.ProjectData r10 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r11 = r14._sessionDataRef
            r0.<init>(r14, r9, r10, r11)
            r14._movieclipModeToolTable = r0
            r0.initialize(r1, r15, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r9 = r14._movieclipModeToolTable
            r0.add(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r9 = r14._movieclipModeToolTable
            r0.add(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable
            org.fortheloss.sticknodes.data.ProjectData r9 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r10 = r14._sessionDataRef
            r0.<init>(r14, r9, r10)
            r14._animationToolTable = r0
            r9 = 0
            r0.initialize(r1, r5, r9)
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
            r0.initialize(r1, r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable
            org.fortheloss.sticknodes.data.ProjectData r10 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r11 = r14._sessionDataRef
            r0.<init>(r14, r10, r11)
            r14._spriteLibraryToolTable = r0
            r0.initialize(r1, r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable
            org.fortheloss.sticknodes.data.ProjectData r10 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r11 = r14._sessionDataRef
            r0.<init>(r14, r10, r11)
            r14._horizontalLibraryToolTables = r0
            float r10 = r14.getWidth()
            r0.initialize(r10, r1, r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable r0 = r14._horizontalLibraryToolTables
            r10 = 2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable[] r11 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable[r10]
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r12 = r14._libraryToolTable
            r11[r9] = r12
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r12 = r14._spriteLibraryToolTable
            r11[r3] = r12
            java.lang.String[] r12 = new java.lang.String[r10]
            java.lang.String r13 = "libraryToolsNew"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            r12[r9] = r13
            java.lang.String r13 = "spriteLibraryToolsTitle"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            r12[r3] = r13
            r0.setTables(r11, r12)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable r11 = r14._horizontalLibraryToolTables
            r0.add(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalToolTable r11 = r14._horizontalLibraryToolTables
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r11)
            float r11 = r14.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r11)
            r11 = 8
            r0.align(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._defaultScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r12 = r14.getWidth()
            r0.<init>(r6, r12)
            r14._playingScrollPane = r0
            float r12 = r14.getWidth()
            r0.setSize(r12, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._playingScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r12 = r14._jumpToolTable
            float r12 = r12.getHeight()
            float r12 = r12 + r8
            int r12 = (int) r12
            float r12 = (float) r12
            r0.setPosition(r2, r12)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r12 = r14._playingScrollPane
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable
            org.fortheloss.sticknodes.data.ProjectData r12 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r13 = r14._sessionDataRef
            r0.<init>(r14, r12, r13)
            r14._animationToolTable2 = r0
            r0.initialize(r1, r5, r3)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r12 = r14._animationToolTable2
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._playingScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r12 = r14._animationToolTable2
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane
            float r12 = r14.getWidth()
            r0.<init>(r6, r12)
            r14._frameScrollPane = r0
            float r12 = r14.getWidth()
            r0.setSize(r12, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._frameScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r12 = r14._jumpToolTable
            float r12 = r12.getHeight()
            float r12 = r12 + r8
            int r12 = (int) r12
            float r12 = (float) r12
            r0.setPosition(r2, r12)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r12 = r14._frameScrollPane
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable
            org.fortheloss.sticknodes.data.ProjectData r12 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r13 = r14._sessionDataRef
            r0.<init>(r14, r12, r13)
            r14._frameToolTable = r0
            r0.initialize(r1, r15, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r12 = r14._frameToolTable
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._frameScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r12 = r14._frameToolTable
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$2 r0 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$2
            float r12 = r14.getWidth()
            r0.<init>(r14, r6, r12)
            r14._stickfigureScrollPane = r0
            float r12 = r14.getWidth()
            r0.setSize(r12, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r12 = r14._jumpToolTable
            float r12 = r12.getHeight()
            float r12 = r12 + r8
            int r12 = (int) r12
            float r12 = (float) r12
            r0.setPosition(r2, r12)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r12 = r14._stickfigureScrollPane
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable
            org.fortheloss.sticknodes.data.ProjectData r12 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r13 = r14._sessionDataRef
            r0.<init>(r14, r12, r13)
            r14._stickfigureToolTable = r0
            r0.initialize(r1, r15, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r12 = r14._stickfigureToolTable
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r12 = r14._stickfigureToolTable
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable
            org.fortheloss.sticknodes.data.ProjectData r12 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r13 = r14._sessionDataRef
            r0.<init>(r14, r12, r13, r9)
            r14._stickfigureFiltersToolTable = r0
            r0.setShowTitle(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r14._stickfigureFiltersToolTable
            r0.initialize(r1, r15, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r12 = r14._stickfigureFiltersToolTable
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable
            org.fortheloss.sticknodes.data.ProjectData r12 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r13 = r14._sessionDataRef
            r0.<init>(r14, r12, r13)
            r14._collapseableStickfigureFiltersToolTable = r0
            float r12 = r14.getWidth()
            r0.initialize(r12, r4, r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0 = r14._collapseableStickfigureFiltersToolTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r12 = r14._stickfigureFiltersToolTable
            java.lang.String r13 = "stickfigureFilters"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            r0.setToolTable(r12, r13)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r12 = r14._collapseableStickfigureFiltersToolTable
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r12 = r14._collapseableStickfigureFiltersToolTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r12)
            float r12 = r14.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r12)
            r0.align(r11)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable
            org.fortheloss.sticknodes.data.ProjectData r12 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r13 = r14._sessionDataRef
            r0.<init>(r14, r12, r13)
            r14._segmentToolTable = r0
            r0.initialize(r1, r15, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r12 = r14._segmentToolTable
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._stickfigureScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r12 = r14._segmentToolTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r12)
            r14.mSegmentToolsCellRef = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable
            org.fortheloss.sticknodes.data.ProjectData r12 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r13 = r14._sessionDataRef
            r0.<init>(r14, r12, r13)
            r14._segmentMainNodeToolTable = r0
            r0.initialize(r1, r15, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r12 = r14._segmentMainNodeToolTable
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$3 r0 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$3
            float r12 = r14.getWidth()
            r0.<init>(r14, r6, r12)
            r14._spriteScrollPane = r0
            float r12 = r14.getWidth()
            r0.setSize(r12, r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._spriteScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r12 = r14._jumpToolTable
            float r12 = r12.getHeight()
            float r12 = r12 + r8
            int r12 = (int) r12
            float r12 = (float) r12
            r0.setPosition(r2, r12)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r0 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r12 = r14._spriteScrollPane
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable
            org.fortheloss.sticknodes.data.ProjectData r12 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r13 = r14._sessionDataRef
            r0.<init>(r14, r12, r13)
            r14._spriteToolTable = r0
            r0.initialize(r1, r15, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r12 = r14._spriteToolTable
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._spriteScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r12 = r14._spriteToolTable
            r0.add(r12)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._spriteScrollPane
            r0.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable
            org.fortheloss.sticknodes.data.ProjectData r12 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r13 = r14._sessionDataRef
            r0.<init>(r14, r12, r13, r10)
            r14._spriteFiltersToolTable = r0
            r0.setShowTitle(r9)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r14._spriteFiltersToolTable
            r0.initialize(r1, r15, r5)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r15 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r14._spriteFiltersToolTable
            r15.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable
            org.fortheloss.sticknodes.data.ProjectData r0 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r1 = r14._sessionDataRef
            r15.<init>(r14, r0, r1)
            r14._collapseableSpriteFiltersToolTable = r15
            float r0 = r14.getWidth()
            r15.initialize(r0, r4, r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r15 = r14._collapseableSpriteFiltersToolTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r14._spriteFiltersToolTable
            java.lang.String r1 = "spriteFiltersTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r15.setToolTable(r0, r1)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r15 = r14._toolTables
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0 = r14._collapseableSpriteFiltersToolTable
            r15.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r15 = r14._spriteScrollPane
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.CollapseableToolTable r0 = r14._collapseableSpriteFiltersToolTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.add(r0)
            float r0 = r14.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r15 = r15.width(r0)
            r15.align(r11)
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
            r15.setPosition(r2, r0)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane> r15 = r14._scrollPanes
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r14._userChooseStickfigureScrollPane
            r15.add(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable
            org.fortheloss.sticknodes.data.ProjectData r0 = r14._projectDataRef
            org.fortheloss.sticknodes.data.SessionData r1 = r14._sessionDataRef
            r15.<init>(r14, r0, r1)
            r14._userChooseStickfigureToolTable = r15
            r15.initialize(r5)
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
            int r15 = r15 - r3
        L45e:
            if (r15 < 0) goto L46e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r0 = r14._toolTables
            java.lang.Object r0 = r0.get(r15)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable r0 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable) r0
            r0.update()
            int r15 = r15 + (-1)
            goto L45e
        L46e:
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
            r4 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r4.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            r4._figureToJoinRef = r0
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r4._canvasModuleRef
            java.lang.String r1 = "selectNodeTitle"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "selectStickfigureJoin2"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r3 = 0
            r0.promptUserToChooseStickfigure(r4, r1, r2, r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r4._stickfigureToolTable
            r0.update()
            return
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
            r0 = 4
            r2._callbackAndroidRequestStoragePermission = r0
        L1e:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void loadSpriteImage() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallyLoadSpriteImage()
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

    public void onFrameChange() {
            r3 = this;
            int r0 = r3._lastSelectedFrameTraceIndex
            if (r0 < 0) goto L24
            boolean r0 = r3._incrementingTracedFrame
            if (r0 != 0) goto L9
            goto L24
        L9:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModuleRef
            int r0 = r0.getCurrentFrameIndex()
            int r1 = r3._mcFrameIndexOffsetWhenIncrementing
            int r0 = r0 + r1
            r1 = 0
            org.fortheloss.sticknodes.data.ProjectData r2 = r3._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r2.frames
            int r2 = r2.size()
            int r2 = r2 + (-1)
            int r0 = com.badlogic.gdx.math.MathUtils.clamp(r0, r1, r2)
            r3.actuallySetFrameIndexToTrace(r0)
        L24:
            return
    }

    public void onSessionModeChange() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 == r1) goto La
            return
        La:
            boolean r0 = r3._isWaitingForUserToChooseStickfigure
            if (r0 == 0) goto Lf
            return
        Lf:
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getMode()
            r1 = 1
            if (r0 == r1) goto L39
            r2 = 3
            if (r0 == r2) goto L21
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r3._animationToolTable
            r0.update(r1)
            goto L50
        L21:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._playingScrollPane
            if (r0 == r2) goto L33
            r3.removeActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._playingScrollPane
            r3.addActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._playingScrollPane
            r3._currentActiveScrollPaneRef = r0
        L33:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r3._animationToolTable2
            r0.update(r1)
            goto L50
        L39:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._defaultScrollPane
            if (r0 == r2) goto L4b
            r3.removeActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._defaultScrollPane
            r3.addActor(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._defaultScrollPane
            r3._currentActiveScrollPaneRef = r0
        L4b:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r0 = r3._animationToolTable
            r0.update(r1)
        L50:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._currentActiveScrollPaneRef
            r0.updateAllToolTables()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r0 = r3._permanentMovieclipToolTable
            r0.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r3._jumpToolTable
            r0.update()
            return
    }

    public void onSessionScreenChange() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L24
            r0 = 1
            r3.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r3.setTouchable(r0)
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r3._canvasModuleRef
            r1 = 0
            r0.updateBackgroundImage(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0 = r3._jumpToolTable
            r0.update()
            r3.setNeedsToBeDrawn()
            goto L5f
        L24:
            r0 = 0
            r3.setVisible(r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r1)
            r3.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            int r1 = r1.getScreen()
            if (r1 != 0) goto L5f
            r1 = 1065353216(0x3f800000, float:1.0)
            r3._previewZoom = r1
            com.badlogic.gdx.math.Vector2 r1 = r3._previewZoomPosition
            r2 = 0
            r1.set(r2, r2)
            r3._incrementingTracedFrame = r0
            r3._mcFrameIndexOffsetWhenIncrementing = r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            com.badlogic.gdx.math.Vector2 r2 = r3._previewZoomPosition
            float r2 = r2.x
            r1.setCameraOffsetX(r2, r0)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            com.badlogic.gdx.math.Vector2 r2 = r3._previewZoomPosition
            float r2 = r2.y
            r1.setCameraOffsetY(r2, r0)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            float r1 = r3._previewZoom
            r0.setCameraScale(r1)
        L5f:
            return
    }

    public void onSessionSelectionChange() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3._sessionDataRef
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 == r1) goto La
            return
        La:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r3._currentActiveScrollPaneRef
            boolean r1 = r3._isWaitingForUserToChooseStickfigure
            if (r1 == 0) goto L11
            return
        L11:
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            int r1 = r1.getCurrentlySelected()
            if (r1 == 0) goto La1
            r2 = 1
            if (r1 == r2) goto L4b
            r2 = 4
            if (r1 == r2) goto L38
            r2 = 6
            if (r1 == r2) goto L24
            goto Lb3
        L24:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._spriteScrollPane
            if (r1 == r2) goto Lb3
            r3.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._spriteScrollPane
            r3.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._spriteScrollPane
            r3._currentActiveScrollPaneRef = r1
            goto Lb3
        L38:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._frameScrollPane
            if (r1 == r2) goto Lb3
            r3.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._frameScrollPane
            r3.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._frameScrollPane
            r3._currentActiveScrollPaneRef = r1
            goto Lb3
        L4b:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._stickfigureScrollPane
            if (r1 == r2) goto L5d
            r3.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._stickfigureScrollPane
            r3.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._stickfigureScrollPane
            r3._currentActiveScrollPaneRef = r1
        L5d:
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            boolean r1 = r1 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r1 == 0) goto L8a
            org.fortheloss.sticknodes.data.SessionData r1 = r3._sessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r1 = r1.getCurrentlySelectedNode()
            boolean r1 = r1.isMainNode()
            if (r1 == 0) goto L8a
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r1 = r3.mSegmentToolsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r2 = r3._segmentToolTable
            if (r1 != r2) goto Lb3
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r1 = r3.mSegmentToolsCellRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r2 = r3._segmentMainNodeToolTable
            r1.setActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            r3.snapScrollPaneToLastClickedWidget(r1)
            goto Lb3
        L8a:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r1 = r3.mSegmentToolsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r1 = r1.getActor()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentMainNodeToolTable r2 = r3._segmentMainNodeToolTable
            if (r1 != r2) goto Lb3
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable> r1 = r3.mSegmentToolsCellRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SegmentToolTable r2 = r3._segmentToolTable
            r1.setActor(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            r3.snapScrollPaneToLastClickedWidget(r1)
            goto Lb3
        La1:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r2 = r3._defaultScrollPane
            if (r1 == r2) goto Lb3
            r3.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._defaultScrollPane
            r3.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._defaultScrollPane
            r3._currentActiveScrollPaneRef = r1
        Lb3:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            r1.updateAllToolTables()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r1 = r3._permanentMovieclipToolTable
            r1.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r1 = r3._jumpToolTable
            r1.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r3._currentActiveScrollPaneRef
            if (r1 == r0) goto Lc9
            r3.snapScrollPaneToLastClickedWidget(r1)
        Lc9:
            return
    }

    @Override // org.fortheloss.framework.IAndroidStorageRequester
    public void onStoragePermissionResult(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L26
            int r2 = r1._callbackAndroidRequestStoragePermission
            r0 = 4
            if (r2 != r0) goto Lb
            r1.actuallyLoadBackground()
            goto L26
        Lb:
            r0 = 5
            if (r2 != r0) goto L12
            r1.actuallyLoadSpriteImage()
            goto L26
        L12:
            r0 = 1
            if (r2 != r0) goto L19
            r1.actuallySaveMovieclip()
            goto L26
        L19:
            r0 = 2
            if (r2 != r0) goto L20
            r1.actuallyImportStickfigure()
            goto L26
        L20:
            r0 = 3
            if (r2 != r0) goto L26
            r1.actuallyImportSound()
        L26:
            r2 = 0
            r1._callbackAndroidRequestStoragePermission = r2
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
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FigureFiltersToolTable r0 = r2._spriteFiltersToolTable
            r0.update()
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
            r9 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r9.getCurrentlySelectedFigure()
            if (r0 != 0) goto L7
            return
        L7:
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r9._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getCurrentFrame()
            org.fortheloss.sticknodes.data.SessionData r2 = r9._sessionDataRef
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
            org.fortheloss.sticknodes.data.SessionData r2 = r9._sessionDataRef
            java.lang.Class<org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction> r3 = org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction.class
            java.lang.Object r2 = r2.getUserAction(r3)
            org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction r2 = (org.fortheloss.sticknodes.data.useractions.MassFigureOrderChangeAction) r2
            r2.initialize(r1, r0, r4)
            org.fortheloss.sticknodes.data.SessionData r3 = r9._sessionDataRef
            r3.addUserAction(r2)
        L38:
            org.fortheloss.sticknodes.data.SessionData r2 = r9._sessionDataRef
            r3 = 1
            r2.blockUserActions(r3)
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            r5 = 0
            if (r2 == 0) goto L9e
            r2 = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            boolean r6 = r2.getPushJoinedFigures()
            if (r6 == 0) goto L98
            boolean r6 = r2.hasJoinAnchorNode()
            if (r6 == 0) goto L98
            java.lang.Class<java.util.Stack> r6 = java.util.Stack.class
            java.lang.Object r6 = com.badlogic.gdx.utils.Pools.obtain(r6)
            java.util.Stack r6 = (java.util.Stack) r6
            java.util.ArrayList r1 = r1.getDrawableFigures()
            int r7 = r1.size()
            int r7 = r7 - r3
        L63:
            if (r7 < 0) goto L8c
            java.lang.Object r3 = r1.get(r7)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            if (r3 == r0) goto L86
            boolean r8 = r3.checkIsJoinedTo(r2)
            if (r8 == 0) goto L74
            goto L86
        L74:
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L89
            java.lang.Object r3 = r6.pop()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r8 = r9._canvasModuleRef
            r8.moveFigure(r4, r3)
            goto L74
        L86:
            r6.add(r3)
        L89:
            int r7 = r7 + (-1)
            goto L63
        L8c:
            r6.clear()
            com.badlogic.gdx.utils.Pools.free(r6)
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionDataRef
            r0.blockUserActions(r5)
            goto La3
        L98:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r9._canvasModuleRef
            r1.moveFigure(r4, r0)
            goto La3
        L9e:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r9._canvasModuleRef
            r1.moveFigure(r4, r0)
        La3:
            org.fortheloss.sticknodes.data.SessionData r0 = r9._sessionDataRef
            r0.blockUserActions(r5)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r9._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r9._stickfigureScrollPane
            if (r0 != r1) goto Lb4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r9._stickfigureToolTable
            r0.update()
            goto Lbd
        Lb4:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r9._spriteScrollPane
            if (r0 != r1) goto Lbd
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = r9._spriteToolTable
            r0.update()
        Lbd:
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
            if (r2 == 0) goto L9d
            r2 = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            boolean r5 = r2.getPushJoinedFigures()
            if (r5 == 0) goto L97
            boolean r5 = r2.hasJoinAnchorNode()
            if (r5 == 0) goto L97
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
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionDataRef
            r0.blockUserActions(r3)
            goto La2
        L97:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModuleRef
            r1.moveFigure(r4, r0)
            goto La2
        L9d:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r10._canvasModuleRef
            r1.moveFigure(r4, r0)
        La2:
            org.fortheloss.sticknodes.data.SessionData r0 = r10._sessionDataRef
            r0.blockUserActions(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r0 = r10._currentActiveScrollPaneRef
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r10._stickfigureScrollPane
            if (r0 != r1) goto Lb3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r10._stickfigureToolTable
            r0.update()
            goto Lbc
        Lb3:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r10._spriteScrollPane
            if (r0 != r1) goto Lbc
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r0 = r10._spriteToolTable
            r0.update()
        Lbc:
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

    public void runnableDoneSavingMC(boolean r4) {
            r3 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MovieclipToolsModule.runnableDoneSavingMC("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "last_status_event"
            r0.setCrashlyticsKeyString(r2, r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog r0 = r3._movieclipIsSavingDialogRef
            if (r0 == 0) goto L24
            r0.hideImmediately()
        L24:
            if (r4 != 0) goto L37
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            java.lang.String r0 = "errorSavingSpaceTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "errorSavingSpaceInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r4.showErrorDialog(r0, r1)
        L37:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r4 = r3._movieclipModeToolTable
            r4.update()
            r3.setNeedsToBeDrawn()
            return
    }

    public void saveMovieclip() {
            r2 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.androidHasStoragePermission()
            if (r0 == 0) goto Lc
            r2.actuallySaveMovieclip()
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

    public void saveMovieclipToFile(java.lang.String r13) {
            r12 = this;
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            java.lang.String r1 = "last_status_event"
            java.lang.String r2 = "MovieclipToolsModule.saveMovieclipToFile()"
            r0.setCrashlyticsKeyString(r1, r2)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r12._createdMCSource
            int r0 = r0.getLibraryID()
            if (r0 >= 0) goto L16
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r12._createdMCSource
            r0.setName(r13)
        L16:
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r12._animationScreenRef
            org.fortheloss.framework.Assets r2 = r12._assetsRef
            java.lang.String r3 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r4 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            r5 = 1
            java.lang.Object r2 = r2.get(r3, r4, r5)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r2 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r2
            java.lang.String r3 = "loading_spinner"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r2 = r2.findRegion(r3)
            r0.<init>(r1, r2)
            r12._movieclipIsSavingDialogRef = r0
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r12._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog r1 = r12._movieclipIsSavingDialogRef
            r0.addDialogToStage(r1)
            java.lang.Thread r0 = new java.lang.Thread
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$MCSaveRunnable r11 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$MCSaveRunnable
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r4 = r12._createdMCSource
            org.fortheloss.sticknodes.data.ProjectData r6 = r12._projectDataRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r12._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r7 = r1.getStage()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r12._animationScreenRef
            org.fortheloss.sticknodes.SNShapeRenderer r8 = r1.getShapeRenderer()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r12._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r1 = r1.getStage()
            com.badlogic.gdx.graphics.g2d.Batch r1 = r1.getBatch()
            r9 = r1
            com.badlogic.gdx.graphics.g2d.SpriteBatch r9 = (com.badlogic.gdx.graphics.g2d.SpriteBatch) r9
            org.fortheloss.framework.Assets r10 = r12._assetsRef
            r1 = r11
            r2 = r12
            r3 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.<init>(r11)
            r0.start()
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipIsSavingDialog r13 = r12._movieclipIsSavingDialogRef
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r12._createdMCSource
            r13.setMCToReadFrom(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r12._animationScreenRef
            r13.resetSavePromptTimer()
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

    public void setBackgroundColor(com.badlogic.gdx.graphics.Color r1) {
            r0 = this;
            org.fortheloss.sticknodes.data.MCFrameData.setBackgroundColor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r1 = r0._canvasModuleRef
            r1.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r0._framesModuleRef
            r1.setNeedsToBeDrawn()
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

    public void setCreatedMovieclip(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r4) {
            r3 = this;
            r3._createdMCSource = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r0 = r3._movieclipModeToolTable
            int r4 = r4.getLibraryID()
            r1 = 0
            r2 = 1
            if (r4 >= 0) goto Le
            r4 = 1
            goto Lf
        Le:
            r4 = 0
        Lf:
            r0.setCreateOrEditing(r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r4 = r3._permanentMovieclipToolTable
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._createdMCSource
            int r0 = r0.getLibraryID()
            if (r0 >= 0) goto L1d
            r1 = 1
        L1d:
            r4.setCreateOrEditing(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r4 = r3._movieclipModeToolTable
            r4.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r4 = r3._animationToolTable
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._createdMCSource
            r4.setFramesContainerRef(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r4 = r3._animationToolTable2
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._createdMCSource
            r4.setFramesContainerRef(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r4 = r3._frameToolTable
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._createdMCSource
            r4.setFramesContainerRef(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r4 = r3._animationToolTable
            r4.update(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r4 = r3._animationToolTable2
            r4.update(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r4 = r3._frameToolTable
            r4.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setFPS(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._createdMCSource
            r0.fps = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable
            r0 = 0
            r2.update(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable2
            r2.update(r0)
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

    @Override // org.fortheloss.sticknodes.animationscreen.modules.ICreationBasedModule
    public void setFrameIndexToTrace(int r1, boolean r2) {
            r0 = this;
            r0._lastSelectedFrameTraceIndex = r1
            r0._incrementingTracedFrame = r2
            if (r2 == 0) goto L11
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2 = r0._framesModuleRef
            int r2 = r2.getCurrentFrameIndex()
            int r2 = r1 - r2
            r0._mcFrameIndexOffsetWhenIncrementing = r2
            goto L14
        L11:
            r2 = 0
            r0._mcFrameIndexOffsetWhenIncrementing = r2
        L14:
            r0.actuallySetFrameIndexToTrace(r1)
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
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$8 r1 = new org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule$8
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

    public void setToAnimateScreen(boolean r2) {
            r1 = this;
            r2 = 1056964608(0x3f000000, float:0.5)
            r1._backgroundImageTransparency = r2
            r2 = 0
            r1._backgroundImageOnTop = r2
            r1.clearBackgroundImage()
            com.badlogic.gdx.graphics.Color r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDefaultStageBGColor()
            org.fortheloss.sticknodes.data.MCFrameData.setBackgroundColor(r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r1._animationScreenRef
            r0 = 1
            r2.setToAnimateScreen(r0, r0)
            r2 = 0
            r1._createdMCSource = r2
            return
    }

    public void setTweenLoopProtection(boolean r2) {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._createdMCSource
            r0.setTweenLoopProtectionEnabled(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable
            r0 = 1
            r2.update(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable2
            r2.update(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void setTweenedFrames(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r1._createdMCSource
            r0.numTweenedFrames = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable
            r0 = 0
            r2.update(r0)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r2 = r1._animationToolTable2
            r2.update(r0)
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
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r3._createdMCSource
            r0.tweeningEnabled = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r4 = r3._animationToolTable
            r4.update(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.AnimationToolTable r4 = r3._animationToolTable2
            r4.update(r1)
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r3._framesModuleRef
            r4.setNeedsToBeDrawn()
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

    public void showAboutMCsDialog() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.AboutMovieclipsDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.AboutMovieclipsDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            r0.initialize()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
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

    public void showMovieclipOverwriteDialog(java.lang.String r3) {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipOverwriteDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipOverwriteDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1, r2)
            r2._movieclipSaveOverwriteDialogRef = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipSaveAsDialog r1 = r2._movieclipSaveAsDialogRef
            r0.initialize(r3, r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r2._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipOverwriteDialog r0 = r2._movieclipSaveOverwriteDialogRef
            r3.addDialogToStage(r0)
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

    public void showSelectFrameToTraceFromDialog() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.TraceFrameDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r2 = 1
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

    public void showTweenLoopProtectionDialog() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipTweenLoopProtectionDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipTweenLoopProtectionDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r0.<init>(r1)
            org.fortheloss.framework.Assets r1 = r2._assetsRef
            r0.initialize(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r2._animationScreenRef
            r1.addDialogToStage(r0)
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
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteToolTable r3 = r2._spriteToolTable
            r3.update()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule
    public void unlockFigureFromCamera() {
            r0 = this;
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

    public void updateOffset(int r5, int r6, int r7) {
            r4 = this;
            com.badlogic.gdx.math.Vector2 r0 = r4._previewZoomPosition
            float r1 = r0.x
            float r0 = r0.y
            int r5 = r5 * 20
            float r5 = (float) r5
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r2
            float r1 = r1 + r5
            int r6 = r6 * 20
            float r5 = (float) r6
            float r5 = r5 * r2
            float r0 = r0 + r5
            float r5 = r4._previewZoom
            float r6 = (float) r7
            r7 = 1017370378(0x3ca3d70a, float:0.02)
            float r6 = r6 * r7
            float r6 = r6 + r5
            r4._previewZoom = r6
            r2 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r2
            int r6 = java.lang.Math.round(r6)
            float r6 = (float) r6
            float r6 = r6 / r2
            r4._previewZoom = r6
            int r2 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r2 >= 0) goto L32
            r4._previewZoom = r7
            goto L3a
        L32:
            r7 = 1084227584(0x40a00000, float:5.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L3a
            r4._previewZoom = r7
        L3a:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r4._canvasModuleRef
            float r6 = r6.getWidth()
            float r6 = r6 * r5
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r4._canvasModuleRef
            float r7 = r7.getWidth()
            float r2 = r4._previewZoom
            float r7 = r7 * r2
            float r6 = r6 - r7
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r4._canvasModuleRef
            float r7 = r7.getHeight()
            float r7 = r7 * r5
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            float r5 = r5.getHeight()
            float r2 = r4._previewZoom
            float r5 = r5 * r2
            float r7 = r7 - r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r5
            float r1 = r1 + r6
            float r7 = r7 * r5
            float r0 = r0 + r7
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            float r5 = r5.getWidth()
            float r6 = r4._previewZoom
            float r5 = r5 * r6
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r6 = r4._canvasModuleRef
            float r6 = r6.getHeight()
            float r7 = r4._previewZoom
            float r6 = r6 * r7
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r4._canvasModuleRef
            float r7 = r7.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r2
            float r7 = -r7
            r3 = 1077936128(0x40400000, float:3.0)
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 >= 0) goto L97
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            float r5 = r5.getWidth()
            float r5 = r5 * r2
            float r1 = -r5
            goto Lae
        L97:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r4._canvasModuleRef
            float r7 = r7.getWidth()
            float r7 = r7 * r3
            float r7 = r7 - r5
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 <= 0) goto Lae
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r7 = r4._canvasModuleRef
            float r7 = r7.getWidth()
            float r7 = r7 * r3
            float r1 = r7 - r5
        Lae:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            float r5 = r5.getHeight()
            float r5 = r5 * r2
            float r5 = -r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto Lc5
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            float r5 = r5.getHeight()
            float r5 = r5 * r2
            float r0 = -r5
            goto Ldc
        Lc5:
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            float r5 = r5.getHeight()
            float r5 = r5 * r3
            float r5 = r5 - r6
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto Ldc
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            float r5 = r5.getHeight()
            float r5 = r5 * r3
            float r0 = r5 - r6
        Ldc:
            com.badlogic.gdx.math.Vector2 r5 = r4._previewZoomPosition
            r5.set(r1, r0)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            com.badlogic.gdx.math.Vector2 r6 = r4._previewZoomPosition
            float r6 = r6.x
            r7 = 0
            r5.setCameraOffsetX(r6, r7)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            com.badlogic.gdx.math.Vector2 r6 = r4._previewZoomPosition
            float r6 = r6.y
            r5.setCameraOffsetY(r6, r7)
            org.fortheloss.sticknodes.animationscreen.FrameCamera r5 = org.fortheloss.sticknodes.animationscreen.FrameCamera.mcDefaultInstance
            float r6 = r4._previewZoom
            r5.setCameraScale(r6)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MovieclipModeToolTable r5 = r4._movieclipModeToolTable
            r5.update()
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r5 = r4._canvasModuleRef
            r5.setNeedsToBeDrawn()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r5 = r4._framesModuleRef
            r5.setNeedsToBeDrawn()
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

    public void updateStickfigureTools() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r1._stickfigureToolTable
            r0.update()
            r1.setNeedsToBeDrawn()
            return
    }

    public void updateZoomDisplay(float r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r0 = r1._permanentMovieclipToolTable
            r0.setZoom(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r2 = r1._permanentMovieclipToolTable
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

    public void userChoosingFigure(boolean r1, java.lang.String r2, java.lang.String r3, org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter r4) {
            r0 = this;
            r0._isWaitingForUserToChooseStickfigure = r1
            if (r1 == 0) goto L24
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r1 = r0._userChooseStickfigureToolTable
            r1.setMessage(r2, r3, r4)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r0._currentActiveScrollPaneRef
            r0.removeActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r0._userChooseStickfigureScrollPane
            r0.addActor(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTableScrollPane r1 = r0._userChooseStickfigureScrollPane
            r0._currentActiveScrollPaneRef = r1
            r1.updateAllToolTables()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentMovieclipToolTable r1 = r0._permanentMovieclipToolTable
            r1.update()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r1 = r0._jumpToolTable
            r1.update()
        L24:
            r0.setNeedsToBeDrawn()
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
}
