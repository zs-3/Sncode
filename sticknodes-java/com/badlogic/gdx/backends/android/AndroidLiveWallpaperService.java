package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public abstract class AndroidLiveWallpaperService extends android.service.wallpaper.WallpaperService {
    static boolean DEBUG = false;
    static final java.lang.String TAG = "WallpaperService";
    protected volatile com.badlogic.gdx.backends.android.AndroidLiveWallpaper app;
    protected int engines;
    protected volatile boolean isPreviewNotified;
    protected volatile com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.AndroidWallpaperEngine linkedEngine;
    protected volatile boolean notifiedPreviewState;
    volatile int[] sync;
    protected android.view.SurfaceHolder.Callback view;
    protected int viewFormat;
    protected int viewHeight;
    protected int viewWidth;
    protected int visibleEngines;

    public class AndroidWallpaperEngine extends android.service.wallpaper.WallpaperService.Engine {
        protected int engineFormat;
        protected int engineHeight;
        protected boolean engineIsVisible;
        protected int engineWidth;
        boolean iconDropConsumed;
        boolean offsetsConsumed;
        final /* synthetic */ com.badlogic.gdx.backends.android.AndroidLiveWallpaperService this$0;
        int xIconDrop;
        float xOffset;
        float xOffsetStep;
        int xPixelOffset;
        int yIconDrop;
        float yOffset;
        float yOffsetStep;
        int yPixelOffset;




        public AndroidWallpaperEngine(com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2)
                r2 = 0
                r1.engineIsVisible = r2
                r0 = 1
                r1.iconDropConsumed = r0
                r1.offsetsConsumed = r0
                r0 = 0
                r1.xOffset = r0
                r1.yOffset = r0
                r1.xOffsetStep = r0
                r1.yOffsetStep = r0
                r1.xPixelOffset = r2
                r1.yPixelOffset = r2
                boolean r2 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                if (r2 == 0) goto L38
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = " > AndroidWallpaperEngine() "
                r2.append(r0)
                int r0 = r1.hashCode()
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "WallpaperService"
                android.util.Log.d(r0, r2)
            L38:
                return
        }

        private void notifySurfaceChanged(int r3, int r4, int r5, boolean r6) {
                r2 = this;
                java.lang.String r0 = "WallpaperService"
                if (r6 != 0) goto L1c
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r6 = r2.this$0
                int r1 = r6.viewFormat
                if (r3 != r1) goto L1c
                int r1 = r6.viewWidth
                if (r4 != r1) goto L1c
                int r6 = r6.viewHeight
                if (r5 != r6) goto L1c
                boolean r3 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                if (r3 == 0) goto L51
                java.lang.String r3 = " > surface is current, skipping surfaceChanged event"
                android.util.Log.d(r0, r3)
                goto L51
            L1c:
                r2.engineFormat = r3
                r2.engineWidth = r4
                r2.engineHeight = r5
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r3 = r2.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r3 = r3.linkedEngine
                if (r3 != r2) goto L48
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r3 = r2.this$0
                int r4 = r2.engineFormat
                r3.viewFormat = r4
                int r4 = r2.engineWidth
                r3.viewWidth = r4
                int r4 = r2.engineHeight
                r3.viewHeight = r4
                android.view.SurfaceHolder$Callback r3 = r3.view
                android.view.SurfaceHolder r4 = r2.getSurfaceHolder()
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r5 = r2.this$0
                int r6 = r5.viewFormat
                int r0 = r5.viewWidth
                int r5 = r5.viewHeight
                r3.surfaceChanged(r4, r6, r0, r5)
                goto L51
            L48:
                boolean r3 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                if (r3 == 0) goto L51
                java.lang.String r3 = " > engine is not active, skipping surfaceChanged event"
                android.util.Log.d(r0, r3)
            L51:
                return
        }

        private void notifyVisibilityChanged(boolean r2) {
                r1 = this;
                boolean r0 = r1.engineIsVisible
                if (r0 == r2) goto L10
                r1.engineIsVisible = r2
                if (r2 == 0) goto Lc
                r1.onResume()
                goto L1b
            Lc:
                r1.onPause()
                goto L1b
            L10:
                boolean r2 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                if (r2 == 0) goto L1b
                java.lang.String r2 = "WallpaperService"
                java.lang.String r0 = " > visible state is current, skipping visibilityChanged event!"
                android.util.Log.d(r2, r0)
            L1b:
                return
        }

        protected void notifyIconDropped() {
                r2 = this;
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r2.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r0 = r0.linkedEngine
                if (r0 != r2) goto L23
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r2.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r0.app
                com.badlogic.gdx.ApplicationListener r0 = r0.listener
                boolean r0 = r0 instanceof com.badlogic.gdx.backends.android.AndroidWallpaperListener
                if (r0 == 0) goto L23
                boolean r0 = r2.iconDropConsumed
                if (r0 != 0) goto L23
                r0 = 1
                r2.iconDropConsumed = r0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r2.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r0.app
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine$1 r1 = new com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine$1
                r1.<init>(r2)
                r0.postRunnable(r1)
            L23:
                return
        }

        protected void notifyOffsetsChanged() {
                r2 = this;
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r2.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r0 = r0.linkedEngine
                if (r0 != r2) goto L23
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r2.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r0.app
                com.badlogic.gdx.ApplicationListener r0 = r0.listener
                boolean r0 = r0 instanceof com.badlogic.gdx.backends.android.AndroidWallpaperListener
                if (r0 == 0) goto L23
                boolean r0 = r2.offsetsConsumed
                if (r0 != 0) goto L23
                r0 = 1
                r2.offsetsConsumed = r0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r2.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r0.app
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine$2 r1 = new com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine$2
                r1.<init>(r2)
                r0.postRunnable(r1)
            L23:
                return
        }

        protected void notifyPreviewState() {
                r3 = this;
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r3.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r0 = r0.linkedEngine
                if (r0 != r3) goto L24
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r3.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r0.app
                com.badlogic.gdx.ApplicationListener r0 = r0.listener
                boolean r0 = r0 instanceof com.badlogic.gdx.backends.android.AndroidWallpaperListener
                if (r0 == 0) goto L24
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r3.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r0 = r0.linkedEngine
                boolean r0 = r0.isPreview()
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r1 = r3.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r1 = r1.app
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine$3 r2 = new com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine$3
                r2.<init>(r3, r0)
                r1.postRunnable(r2)
            L24:
                return
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public android.os.Bundle onCommand(java.lang.String r4, int r5, int r6, int r7, android.os.Bundle r8, boolean r9) {
                r3 = this;
                boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                r1 = 0
                if (r0 == 0) goto L4c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = " > AndroidWallpaperEngine - onCommand("
                r0.append(r2)
                r0.append(r4)
                java.lang.String r2 = " "
                r0.append(r2)
                r0.append(r5)
                r0.append(r2)
                r0.append(r6)
                r0.append(r2)
                r0.append(r7)
                r0.append(r2)
                r0.append(r8)
                r0.append(r2)
                r0.append(r9)
                java.lang.String r2 = "), linked: "
                r0.append(r2)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r2 = r3.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r2 = r2.linkedEngine
                if (r2 != r3) goto L3f
                r2 = 1
                goto L40
            L3f:
                r2 = 0
            L40:
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "WallpaperService"
                android.util.Log.d(r2, r0)
            L4c:
                java.lang.String r0 = "android.home.drop"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L5d
                r3.iconDropConsumed = r1
                r3.xIconDrop = r5
                r3.yIconDrop = r6
                r3.notifyIconDropped()
            L5d:
                android.os.Bundle r4 = super.onCommand(r4, r5, r6, r7, r8, r9)
                return r4
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public android.app.WallpaperColors onComputeColors() {
                r8 = this;
                com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 27
                if (r1 < r2) goto L57
                boolean r1 = r0 instanceof com.badlogic.gdx.backends.android.AndroidLiveWallpaper
                if (r1 == 0) goto L57
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = (com.badlogic.gdx.backends.android.AndroidLiveWallpaper) r0
                com.badlogic.gdx.graphics.Color[] r0 = r0.wallpaperColors
                if (r0 == 0) goto L57
                android.app.WallpaperColors r1 = new android.app.WallpaperColors
                r2 = 0
                r3 = r0[r2]
                float r3 = r3.r
                r4 = r0[r2]
                float r4 = r4.g
                r5 = r0[r2]
                float r5 = r5.b
                r2 = r0[r2]
                float r2 = r2.a
                android.graphics.Color r2 = android.graphics.Color.valueOf(r3, r4, r5, r2)
                r3 = 1
                r4 = r0[r3]
                float r4 = r4.r
                r5 = r0[r3]
                float r5 = r5.g
                r6 = r0[r3]
                float r6 = r6.b
                r3 = r0[r3]
                float r3 = r3.a
                android.graphics.Color r3 = android.graphics.Color.valueOf(r4, r5, r6, r3)
                r4 = 2
                r5 = r0[r4]
                float r5 = r5.r
                r6 = r0[r4]
                float r6 = r6.g
                r7 = r0[r4]
                float r7 = r7.b
                r0 = r0[r4]
                float r0 = r0.a
                android.graphics.Color r0 = android.graphics.Color.valueOf(r5, r6, r7, r0)
                r1.<init>(r2, r3, r0)
                return r1
            L57:
                android.app.WallpaperColors r0 = super.onComputeColors()
                return r0
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onCreate(android.view.SurfaceHolder r3) {
                r2 = this;
                boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                if (r0 == 0) goto L4b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = " > AndroidWallpaperEngine - onCreate() "
                r0.append(r1)
                int r1 = r2.hashCode()
                r0.append(r1)
                java.lang.String r1 = " running: "
                r0.append(r1)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r1 = r2.this$0
                int r1 = r1.engines
                r0.append(r1)
                java.lang.String r1 = ", linked: "
                r0.append(r1)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r1 = r2.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r1 = r1.linkedEngine
                if (r1 != r2) goto L2e
                r1 = 1
                goto L2f
            L2e:
                r1 = 0
            L2f:
                r0.append(r1)
                java.lang.String r1 = ", thread: "
                r0.append(r1)
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "WallpaperService"
                android.util.Log.d(r1, r0)
            L4b:
                super.onCreate(r3)
                return
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onDestroy() {
                r0 = this;
                super.onDestroy()
                return
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onOffsetsChanged(float r2, float r3, float r4, float r5, int r6, int r7) {
                r1 = this;
                r0 = 0
                r1.offsetsConsumed = r0
                r1.xOffset = r2
                r1.yOffset = r3
                r1.xOffsetStep = r4
                r1.yOffsetStep = r5
                r1.xPixelOffset = r6
                r1.yPixelOffset = r7
                r1.notifyOffsetsChanged()
                com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
                boolean r0 = r0.isContinuousRendering()
                if (r0 != 0) goto L1f
                com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
                r0.requestRendering()
            L1f:
                super.onOffsetsChanged(r2, r3, r4, r5, r6, r7)
                return
        }

        public void onPause() {
                r5 = this;
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r1 = r0.visibleEngines
                r2 = 1
                int r1 = r1 - r2
                r0.visibleEngines = r1
                boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                r1 = 0
                java.lang.String r3 = "WallpaperService"
                if (r0 == 0) goto L50
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = " > AndroidWallpaperEngine - onPause() "
                r0.append(r4)
                int r4 = r5.hashCode()
                r0.append(r4)
                java.lang.String r4 = ", running: "
                r0.append(r4)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r5.this$0
                int r4 = r4.engines
                r0.append(r4)
                java.lang.String r4 = ", linked: "
                r0.append(r4)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r5.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r4 = r4.linkedEngine
                if (r4 != r5) goto L39
                r4 = 1
                goto L3a
            L39:
                r4 = 0
            L3a:
                r0.append(r4)
                java.lang.String r4 = ", visible: "
                r0.append(r4)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r5.this$0
                int r4 = r4.visibleEngines
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r3, r0)
            L50:
                java.lang.String r0 = "engine paused"
                android.util.Log.i(r3, r0)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r4 = r0.visibleEngines
                int r0 = r0.engines
                if (r4 < r0) goto L6d
                java.lang.String r0 = "wallpaper lifecycle error, counted too many visible engines! repairing.."
                android.util.Log.e(r3, r0)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r4 = r0.engines
                int r4 = r4 - r2
                int r1 = java.lang.Math.max(r4, r1)
                r0.visibleEngines = r1
            L6d:
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r0 = r0.linkedEngine
                if (r0 == 0) goto L7e
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r1 = r0.visibleEngines
                if (r1 != 0) goto L7e
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r0.app
                r0.onPause()
            L7e:
                boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                if (r0 == 0) goto L87
                java.lang.String r0 = " > AndroidWallpaperEngine - onPause() done!"
                android.util.Log.d(r3, r0)
            L87:
                return
        }

        public void onResume() {
                r5 = this;
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r1 = r0.visibleEngines
                r2 = 1
                int r1 = r1 + r2
                r0.visibleEngines = r1
                boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                java.lang.String r1 = "WallpaperService"
                r3 = 0
                if (r0 == 0) goto L50
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = " > AndroidWallpaperEngine - onResume() "
                r0.append(r4)
                int r4 = r5.hashCode()
                r0.append(r4)
                java.lang.String r4 = ", running: "
                r0.append(r4)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r5.this$0
                int r4 = r4.engines
                r0.append(r4)
                java.lang.String r4 = ", linked: "
                r0.append(r4)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r5.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r4 = r4.linkedEngine
                if (r4 != r5) goto L39
                r4 = 1
                goto L3a
            L39:
                r4 = 0
            L3a:
                r0.append(r4)
                java.lang.String r4 = ", visible: "
                r0.append(r4)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r5.this$0
                int r4 = r4.visibleEngines
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
            L50:
                java.lang.String r0 = "engine resumed"
                android.util.Log.i(r1, r0)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r0 = r0.linkedEngine
                if (r0 == 0) goto Lad
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r0 = r0.linkedEngine
                if (r0 == r5) goto L86
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                r0.setLinkedEngine(r5)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                android.view.SurfaceHolder$Callback r0 = r0.view
                android.view.SurfaceHolder r1 = r5.getSurfaceHolder()
                r0.surfaceDestroyed(r1)
                int r0 = r5.engineFormat
                int r1 = r5.engineWidth
                int r4 = r5.engineHeight
                r5.notifySurfaceChanged(r0, r1, r4, r3)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                android.view.SurfaceHolder$Callback r0 = r0.view
                android.view.SurfaceHolder r1 = r5.getSurfaceHolder()
                r0.surfaceCreated(r1)
                goto L8f
            L86:
                int r0 = r5.engineFormat
                int r1 = r5.engineWidth
                int r4 = r5.engineHeight
                r5.notifySurfaceChanged(r0, r1, r4, r3)
            L8f:
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r1 = r0.visibleEngines
                if (r1 != r2) goto L9a
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r0.app
                r0.onResume()
            L9a:
                r5.notifyPreviewState()
                r5.notifyOffsetsChanged()
                com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
                boolean r0 = r0.isContinuousRendering()
                if (r0 != 0) goto Lad
                com.badlogic.gdx.Graphics r0 = com.badlogic.gdx.Gdx.graphics
                r0.requestRendering()
            Lad:
                return
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceChanged(android.view.SurfaceHolder r5, int r6, int r7, int r8) {
                r4 = this;
                boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                r1 = 1
                java.lang.String r2 = "WallpaperService"
                if (r0 == 0) goto L5c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = " > AndroidWallpaperEngine - onSurfaceChanged() isPreview: "
                r0.append(r3)
                boolean r3 = r4.isPreview()
                r0.append(r3)
                java.lang.String r3 = ", "
                r0.append(r3)
                int r3 = r4.hashCode()
                r0.append(r3)
                java.lang.String r3 = ", running: "
                r0.append(r3)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r3 = r4.this$0
                int r3 = r3.engines
                r0.append(r3)
                java.lang.String r3 = ", linked: "
                r0.append(r3)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r3 = r4.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r3 = r3.linkedEngine
                if (r3 != r4) goto L3d
                r3 = 1
                goto L3e
            L3d:
                r3 = 0
            L3e:
                r0.append(r3)
                java.lang.String r3 = ", sufcace valid: "
                r0.append(r3)
                android.view.SurfaceHolder r3 = r4.getSurfaceHolder()
                android.view.Surface r3 = r3.getSurface()
                boolean r3 = r3.isValid()
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r2, r0)
            L5c:
                java.lang.String r0 = "engine surface changed"
                android.util.Log.i(r2, r0)
                super.onSurfaceChanged(r5, r6, r7, r8)
                r4.notifySurfaceChanged(r6, r7, r8, r1)
                return
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceCreated(android.view.SurfaceHolder r6) {
                r5 = this;
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r1 = r0.engines
                r2 = 1
                int r1 = r1 + r2
                r0.engines = r1
                r0.setLinkedEngine(r5)
                boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                java.lang.String r1 = "WallpaperService"
                r3 = 0
                if (r0 == 0) goto L47
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = " > AndroidWallpaperEngine - onSurfaceCreated() "
                r0.append(r4)
                int r4 = r5.hashCode()
                r0.append(r4)
                java.lang.String r4 = ", running: "
                r0.append(r4)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r5.this$0
                int r4 = r4.engines
                r0.append(r4)
                java.lang.String r4 = ", linked: "
                r0.append(r4)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r5.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r4 = r4.linkedEngine
                if (r4 != r5) goto L3c
                r4 = 1
                goto L3d
            L3c:
                r4 = 0
            L3d:
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
            L47:
                java.lang.String r0 = "engine surface created"
                android.util.Log.i(r1, r0)
                super.onSurfaceCreated(r6)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r1 = r0.engines
                if (r1 != r2) goto L57
                r0.visibleEngines = r3
            L57:
                if (r1 != r2) goto L82
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r0.app
                if (r0 != 0) goto L82
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                r0.viewFormat = r3
                r0.viewWidth = r3
                r0.viewHeight = r3
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r1 = new com.badlogic.gdx.backends.android.AndroidLiveWallpaper
                r1.<init>(r0)
                r0.app = r1
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                r0.onCreateApplication()
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r0.app
                com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r0 = r0.graphics
                if (r0 == 0) goto L7a
                goto L82
            L7a:
                java.lang.Error r6 = new java.lang.Error
                java.lang.String r0 = "You must override 'AndroidLiveWallpaperService.onCreateApplication' method and call 'initialize' from its body."
                r6.<init>(r0)
                throw r6
            L82:
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r1 = r0.app
                com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r1 = r1.graphics
                com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r1 = r1.view
                r0.view = r1
                android.view.SurfaceHolder r0 = r5.getSurfaceHolder()
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r1 = r5.this$0
                android.view.SurfaceHolder$Callback r1 = r1.view
                r0.removeCallback(r1)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r1 = r0.viewFormat
                r5.engineFormat = r1
                int r1 = r0.viewWidth
                r5.engineWidth = r1
                int r1 = r0.viewHeight
                r5.engineHeight = r1
                int r1 = r0.engines
                if (r1 != r2) goto Laf
                android.view.SurfaceHolder$Callback r0 = r0.view
                r0.surfaceCreated(r6)
                goto Lc4
            Laf:
                android.view.SurfaceHolder$Callback r0 = r0.view
                r0.surfaceDestroyed(r6)
                int r0 = r5.engineFormat
                int r1 = r5.engineWidth
                int r2 = r5.engineHeight
                r5.notifySurfaceChanged(r0, r1, r2, r3)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                android.view.SurfaceHolder$Callback r0 = r0.view
                r0.surfaceCreated(r6)
            Lc4:
                r5.notifyPreviewState()
                r5.notifyOffsetsChanged()
                com.badlogic.gdx.Graphics r6 = com.badlogic.gdx.Gdx.graphics
                boolean r6 = r6.isContinuousRendering()
                if (r6 != 0) goto Ld7
                com.badlogic.gdx.Graphics r6 = com.badlogic.gdx.Gdx.graphics
                r6.requestRendering()
            Ld7:
                return
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceDestroyed(android.view.SurfaceHolder r6) {
                r5 = this;
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r1 = r0.engines
                r2 = 1
                int r1 = r1 - r2
                r0.engines = r1
                boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                java.lang.String r1 = "WallpaperService"
                r3 = 0
                if (r0 == 0) goto L4d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = " > AndroidWallpaperEngine - onSurfaceDestroyed() "
                r0.append(r4)
                int r4 = r5.hashCode()
                r0.append(r4)
                java.lang.String r4 = ", running: "
                r0.append(r4)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r5.this$0
                int r4 = r4.engines
                r0.append(r4)
                java.lang.String r4 = " ,linked: "
                r0.append(r4)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r4 = r5.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r4 = r4.linkedEngine
                if (r4 != r5) goto L38
                goto L39
            L38:
                r2 = 0
            L39:
                r0.append(r2)
                java.lang.String r2 = ", isVisible: "
                r0.append(r2)
                boolean r2 = r5.engineIsVisible
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r1, r0)
            L4d:
                java.lang.String r0 = "engine surface destroyed"
                android.util.Log.i(r1, r0)
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r1 = r0.engines
                if (r1 != 0) goto L5b
                r0.onDeepPauseApplication()
            L5b:
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r0 = r0.linkedEngine
                if (r0 != r5) goto L6a
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                android.view.SurfaceHolder$Callback r0 = r0.view
                if (r0 == 0) goto L6a
                r0.surfaceDestroyed(r6)
            L6a:
                r5.engineFormat = r3
                r5.engineWidth = r3
                r5.engineHeight = r3
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r5.this$0
                int r1 = r0.engines
                if (r1 != 0) goto L79
                r1 = 0
                r0.linkedEngine = r1
            L79:
                super.onSurfaceDestroyed(r6)
                return
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onTouchEvent(android.view.MotionEvent r3) {
                r2 = this;
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r2.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r0 = r0.linkedEngine
                if (r0 != r2) goto L10
                com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r2.this$0
                com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r0.app
                com.badlogic.gdx.backends.android.AndroidInput r0 = r0.input
                r1 = 0
                r0.onTouch(r1, r3)
            L10:
                return
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onVisibilityChanged(boolean r5) {
                r4 = this;
                boolean r0 = r4.isVisible()
                boolean r1 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                java.lang.String r2 = "WallpaperService"
                if (r1 == 0) goto L46
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = " > AndroidWallpaperEngine - onVisibilityChanged(paramVisible: "
                r1.append(r3)
                r1.append(r5)
                java.lang.String r3 = " reportedVisible: "
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = ") "
                r1.append(r3)
                int r3 = r4.hashCode()
                r1.append(r3)
                java.lang.String r3 = ", sufcace valid: "
                r1.append(r3)
                android.view.SurfaceHolder r3 = r4.getSurfaceHolder()
                android.view.Surface r3 = r3.getSurface()
                boolean r3 = r3.isValid()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r2, r1)
            L46:
                super.onVisibilityChanged(r5)
                if (r0 != 0) goto L58
                r0 = 1
                if (r5 != r0) goto L58
                boolean r5 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
                if (r5 == 0) goto L57
                java.lang.String r5 = " > fake visibilityChanged event! Android WallpaperService likes do that!"
                android.util.Log.d(r2, r5)
            L57:
                return
            L58:
                r4.notifyVisibilityChanged(r5)
                return
        }
    }

    static {
            return
    }

    public AndroidLiveWallpaperService() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.app = r0
            r2.view = r0
            r1 = 0
            r2.engines = r1
            r2.visibleEngines = r1
            r2.linkedEngine = r0
            r2.isPreviewNotified = r1
            r2.notifiedPreviewState = r1
            int[] r0 = new int[r1]
            r2.sync = r0
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r2 = this;
            java.lang.String r0 = "WallpaperService"
            java.lang.String r1 = "service finalized"
            android.util.Log.i(r0, r1)
            super.finalize()
            return
    }

    public com.badlogic.gdx.backends.android.AndroidLiveWallpaper getLiveWallpaper() {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r1.app
            return r0
    }

    public android.view.SurfaceHolder getSurfaceHolder() {
            r2 = this;
            boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
            if (r0 == 0) goto Lb
            java.lang.String r0 = "WallpaperService"
            java.lang.String r1 = " > AndroidLiveWallpaperService - getSurfaceHolder()"
            android.util.Log.d(r0, r1)
        Lb:
            int[] r0 = r2.sync
            monitor-enter(r0)
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r1 = r2.linkedEngine     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L15
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L15:
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r1 = r2.linkedEngine     // Catch: java.lang.Throwable -> L1d
            android.view.SurfaceHolder r1 = r1.getSurfaceHolder()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    public android.view.WindowManager getWindowManager() {
            r1 = this;
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            return r0
    }

    public void initialize(com.badlogic.gdx.ApplicationListener r2) {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r0 = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
            r0.<init>()
            r1.initialize(r2, r0)
            return
    }

    public void initialize(com.badlogic.gdx.ApplicationListener r3, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r4) {
            r2 = this;
            boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
            if (r0 == 0) goto Lb
            java.lang.String r0 = "WallpaperService"
            java.lang.String r1 = " > AndroidLiveWallpaperService - initialize()"
            android.util.Log.d(r0, r1)
        Lb:
            com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r2.app
            r0.initialize(r3, r4)
            boolean r3 = r4.getTouchEventsForLiveWallpaper
            if (r3 == 0) goto L23
            java.lang.String r3 = android.os.Build.VERSION.SDK
            int r3 = java.lang.Integer.parseInt(r3)
            r4 = 7
            if (r3 < r4) goto L23
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r3 = r2.linkedEngine
            r4 = 1
            r3.setTouchEventsEnabled(r4)
        L23:
            return
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public void onCreate() {
            r3 = this;
            boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
            java.lang.String r1 = "WallpaperService"
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " > AndroidLiveWallpaperService - onCreate() "
            r0.append(r2)
            int r2 = r3.hashCode()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1e:
            java.lang.String r0 = "service created"
            android.util.Log.i(r1, r0)
            super.onCreate()
            return
    }

    public void onCreateApplication() {
            r2 = this;
            boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
            if (r0 == 0) goto Lb
            java.lang.String r0 = "WallpaperService"
            java.lang.String r1 = " > AndroidLiveWallpaperService - onCreateApplication()"
            android.util.Log.d(r0, r1)
        Lb:
            return
    }

    @Override // android.service.wallpaper.WallpaperService
    public android.service.wallpaper.WallpaperService.Engine onCreateEngine() {
            r2 = this;
            boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
            java.lang.String r1 = "WallpaperService"
            if (r0 == 0) goto Lb
            java.lang.String r0 = " > AndroidLiveWallpaperService - onCreateEngine()"
            android.util.Log.d(r1, r0)
        Lb:
            java.lang.String r0 = "engine created"
            android.util.Log.i(r1, r0)
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine r0 = new com.badlogic.gdx.backends.android.AndroidLiveWallpaperService$AndroidWallpaperEngine
            r0.<init>(r2)
            return r0
    }

    public void onDeepPauseApplication() {
            r2 = this;
            boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
            if (r0 == 0) goto Lb
            java.lang.String r0 = "WallpaperService"
            java.lang.String r1 = " > AndroidLiveWallpaperService - onDeepPauseApplication()"
            android.util.Log.d(r0, r1)
        Lb:
            com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r2.app
            if (r0 == 0) goto L16
            com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r2.app
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper r0 = r0.graphics
            r0.clearManagedCaches()
        L16:
            return
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public void onDestroy() {
            r3 = this;
            boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
            java.lang.String r1 = "WallpaperService"
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " > AndroidLiveWallpaperService - onDestroy() "
            r0.append(r2)
            int r2 = r3.hashCode()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1e:
            java.lang.String r0 = "service destroyed"
            android.util.Log.i(r1, r0)
            super.onDestroy()
            com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r3.app
            if (r0 == 0) goto L34
            com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = r3.app
            r0.onDestroy()
            r0 = 0
            r3.app = r0
            r3.view = r0
        L34:
            return
    }

    protected void setLinkedEngine(com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.AndroidWallpaperEngine r2) {
            r1 = this;
            int[] r0 = r1.sync
            monitor-enter(r0)
            r1.linkedEngine = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }
}
