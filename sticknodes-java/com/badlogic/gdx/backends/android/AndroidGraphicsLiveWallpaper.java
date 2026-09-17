package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public final class AndroidGraphicsLiveWallpaper extends com.badlogic.gdx.backends.android.AndroidGraphics {


    public AndroidGraphicsLiveWallpaper(com.badlogic.gdx.backends.android.AndroidLiveWallpaper r2, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r3, com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidGraphics
    protected com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 createGLSurfaceView(com.badlogic.gdx.backends.android.AndroidApplicationBase r10, com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy r11) {
            r9 = this;
            boolean r0 = r9.checkGL20()
            if (r0 == 0) goto L2f
            android.opengl.GLSurfaceView$EGLConfigChooser r0 = r9.getEglConfigChooser()
            com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper$1 r8 = new com.badlogic.gdx.backends.android.AndroidGraphicsLiveWallpaper$1
            android.content.Context r10 = r10.getContext()
            r8.<init>(r9, r10, r11)
            if (r0 == 0) goto L19
            r8.setEGLConfigChooser(r0)
            goto L2b
        L19:
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r10 = r9.config
            int r2 = r10.r
            int r3 = r10.g
            int r4 = r10.b
            int r5 = r10.a
            int r6 = r10.depth
            int r7 = r10.stencil
            r1 = r8
            r1.setEGLConfigChooser(r2, r3, r4, r5, r6, r7)
        L2b:
            r8.setRenderer(r9)
            return r8
        L2f:
            com.badlogic.gdx.utils.GdxRuntimeException r10 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r11 = "libGDX requires OpenGL ES 2.0"
            r10.<init>(r11)
            throw r10
    }

    android.view.SurfaceHolder getSurfaceHolder() {
            r2 = this;
            com.badlogic.gdx.backends.android.AndroidApplicationBase r0 = r2.app
            com.badlogic.gdx.backends.android.AndroidLiveWallpaper r0 = (com.badlogic.gdx.backends.android.AndroidLiveWallpaper) r0
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r0 = r0.service
            int[] r0 = r0.sync
            monitor-enter(r0)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r1 = r2.app     // Catch: java.lang.Throwable -> L15
            com.badlogic.gdx.backends.android.AndroidLiveWallpaper r1 = (com.badlogic.gdx.backends.android.AndroidLiveWallpaper) r1     // Catch: java.lang.Throwable -> L15
            com.badlogic.gdx.backends.android.AndroidLiveWallpaperService r1 = r1.service     // Catch: java.lang.Throwable -> L15
            android.view.SurfaceHolder r1 = r1.getSurfaceHolder()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
    }

    @Override // com.badlogic.gdx.backends.android.AndroidGraphics
    protected void logManagedCachesStatus() {
            r1 = this;
            boolean r0 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG
            if (r0 == 0) goto L7
            super.logManagedCachesStatus()
        L7:
            return
    }

    public void onDestroyGLSurfaceView() {
            r3 = this;
            java.lang.String r0 = "WallpaperService"
            com.badlogic.gdx.backends.android.surfaceview.GLSurfaceView20 r1 = r3.view
            if (r1 == 0) goto L1c
            r1.onDetachedFromWindow()     // Catch: java.lang.Throwable -> L13
            boolean r1 = com.badlogic.gdx.backends.android.AndroidLiveWallpaperService.DEBUG     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L1c
            java.lang.String r1 = " > AndroidLiveWallpaper - onDestroy() stopped GLThread managed by GLSurfaceView"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L13
            goto L1c
        L13:
            r1 = move-exception
            java.lang.String r2 = "failed to destroy GLSurfaceView's thread! GLSurfaceView.onDetachedFromWindow impl changed since API lvl 16!"
            android.util.Log.e(r0, r2)
            r1.printStackTrace()
        L1c:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidGraphics, android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 r11) {
            r10 = this;
            long r0 = java.lang.System.nanoTime()
            boolean r11 = r10.resume
            if (r11 != 0) goto L14
            long r2 = r10.lastFrameTime
            long r2 = r0 - r2
            float r11 = (float) r2
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r11 = r11 / r2
            r10.deltaTime = r11
            goto L17
        L14:
            r11 = 0
            r10.deltaTime = r11
        L17:
            r10.lastFrameTime = r0
            java.lang.Object r11 = r10.synch
            monitor-enter(r11)
            boolean r2 = r10.running     // Catch: java.lang.Throwable -> L107
            boolean r3 = r10.pause     // Catch: java.lang.Throwable -> L107
            boolean r4 = r10.destroy     // Catch: java.lang.Throwable -> L107
            boolean r5 = r10.resume     // Catch: java.lang.Throwable -> L107
            boolean r6 = r10.resume     // Catch: java.lang.Throwable -> L107
            r7 = 0
            if (r6 == 0) goto L30
            r10.resume = r7     // Catch: java.lang.Throwable -> L107
            java.lang.Object r6 = r10.synch     // Catch: java.lang.Throwable -> L107
            r6.notifyAll()     // Catch: java.lang.Throwable -> L107
        L30:
            boolean r6 = r10.pause     // Catch: java.lang.Throwable -> L107
            if (r6 == 0) goto L3b
            r10.pause = r7     // Catch: java.lang.Throwable -> L107
            java.lang.Object r6 = r10.synch     // Catch: java.lang.Throwable -> L107
            r6.notifyAll()     // Catch: java.lang.Throwable -> L107
        L3b:
            boolean r6 = r10.destroy     // Catch: java.lang.Throwable -> L107
            if (r6 == 0) goto L46
            r10.destroy = r7     // Catch: java.lang.Throwable -> L107
            java.lang.Object r6 = r10.synch     // Catch: java.lang.Throwable -> L107
            r6.notifyAll()     // Catch: java.lang.Throwable -> L107
        L46:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L107
            if (r5 == 0) goto L5b
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.ApplicationListener r11 = r11.getApplicationListener()
            r11.resume()
            com.badlogic.gdx.Application r11 = com.badlogic.gdx.Gdx.app
            java.lang.String r5 = "AndroidGraphics"
            java.lang.String r6 = "resumed"
            r11.log(r5, r6)
        L5b:
            if (r2 == 0) goto Lc5
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.utils.Array r11 = r11.getRunnables()
            monitor-enter(r11)
            com.badlogic.gdx.backends.android.AndroidApplicationBase r2 = r10.app     // Catch: java.lang.Throwable -> Lc2
            com.badlogic.gdx.utils.Array r2 = r2.getExecutedRunnables()     // Catch: java.lang.Throwable -> Lc2
            r2.clear()     // Catch: java.lang.Throwable -> Lc2
            com.badlogic.gdx.backends.android.AndroidApplicationBase r2 = r10.app     // Catch: java.lang.Throwable -> Lc2
            com.badlogic.gdx.utils.Array r2 = r2.getExecutedRunnables()     // Catch: java.lang.Throwable -> Lc2
            com.badlogic.gdx.backends.android.AndroidApplicationBase r5 = r10.app     // Catch: java.lang.Throwable -> Lc2
            com.badlogic.gdx.utils.Array r5 = r5.getRunnables()     // Catch: java.lang.Throwable -> Lc2
            r2.addAll(r5)     // Catch: java.lang.Throwable -> Lc2
            com.badlogic.gdx.backends.android.AndroidApplicationBase r2 = r10.app     // Catch: java.lang.Throwable -> Lc2
            com.badlogic.gdx.utils.Array r2 = r2.getRunnables()     // Catch: java.lang.Throwable -> Lc2
            r2.clear()     // Catch: java.lang.Throwable -> Lc2
            r2 = 0
        L86:
            com.badlogic.gdx.backends.android.AndroidApplicationBase r5 = r10.app     // Catch: java.lang.Throwable -> Lc2
            com.badlogic.gdx.utils.Array r5 = r5.getExecutedRunnables()     // Catch: java.lang.Throwable -> Lc2
            int r5 = r5.size     // Catch: java.lang.Throwable -> Lc2
            if (r2 >= r5) goto La7
            com.badlogic.gdx.backends.android.AndroidApplicationBase r5 = r10.app     // Catch: java.lang.Throwable -> La0
            com.badlogic.gdx.utils.Array r5 = r5.getExecutedRunnables()     // Catch: java.lang.Throwable -> La0
            java.lang.Object r5 = r5.get(r2)     // Catch: java.lang.Throwable -> La0
            java.lang.Runnable r5 = (java.lang.Runnable) r5     // Catch: java.lang.Throwable -> La0
            r5.run()     // Catch: java.lang.Throwable -> La0
            goto La4
        La0:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> Lc2
        La4:
            int r2 = r2 + 1
            goto L86
        La7:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lc2
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.backends.android.AndroidInput r11 = r11.mo17getInput()
            r11.processEvents()
            long r5 = r10.frameId
            r8 = 1
            long r5 = r5 + r8
            r10.frameId = r5
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.ApplicationListener r11 = r11.getApplicationListener()
            r11.render()
            goto Lc5
        Lc2:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lc2
            throw r0
        Lc5:
            if (r3 == 0) goto Ld9
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.ApplicationListener r11 = r11.getApplicationListener()
            r11.pause()
            com.badlogic.gdx.Application r11 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AndroidGraphics"
            java.lang.String r3 = "paused"
            r11.log(r2, r3)
        Ld9:
            if (r4 == 0) goto Led
            com.badlogic.gdx.backends.android.AndroidApplicationBase r11 = r10.app
            com.badlogic.gdx.ApplicationListener r11 = r11.getApplicationListener()
            r11.dispose()
            com.badlogic.gdx.Application r11 = com.badlogic.gdx.Gdx.app
            java.lang.String r2 = "AndroidGraphics"
            java.lang.String r3 = "destroyed"
            r11.log(r2, r3)
        Led:
            long r2 = r10.frameStart
            long r2 = r0 - r2
            r4 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 <= 0) goto L100
            int r11 = r10.frames
            r10.fps = r11
            r10.frames = r7
            r10.frameStart = r0
        L100:
            int r11 = r10.frames
            int r11 = r11 + 1
            r10.frames = r11
            return
        L107:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L107
            throw r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidGraphics
    void resume() {
            r4 = this;
            java.lang.Object r0 = r4.synch
            monitor-enter(r0)
            r1 = 1
            r4.running = r1     // Catch: java.lang.Throwable -> L21
            r4.resume = r1     // Catch: java.lang.Throwable -> L21
        L8:
            boolean r1 = r4.resume     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1f
            r4.requestRendering()     // Catch: java.lang.InterruptedException -> L15 java.lang.Throwable -> L21
            java.lang.Object r1 = r4.synch     // Catch: java.lang.InterruptedException -> L15 java.lang.Throwable -> L21
            r1.wait()     // Catch: java.lang.InterruptedException -> L15 java.lang.Throwable -> L21
            goto L8
        L15:
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "AndroidGraphics"
            java.lang.String r3 = "waiting for resume synchronization failed!"
            r1.log(r2, r3)     // Catch: java.lang.Throwable -> L21
            goto L8
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }
}
