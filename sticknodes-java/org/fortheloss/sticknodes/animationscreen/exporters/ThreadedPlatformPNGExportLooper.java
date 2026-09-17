package org.fortheloss.sticknodes.animationscreen.exporters;

/* loaded from: classes2.dex */
public class ThreadedPlatformPNGExportLooper implements org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper {
    private int _cancelFailResult;
    private boolean _cancelRequested;
    private int _delayCounter;
    private org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer _exportRenderer;
    private int _exportState;
    private java.lang.String _filename;
    private org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder _platformPNGEncoderRef;
    private org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper.PlatformPNGEncodingThread _platformPNGEncodingThread;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private java.lang.String _statusString;
    private int _videoState;

    private static class PlatformPNGEncodingThread extends java.lang.Thread implements com.badlogic.gdx.utils.Disposable {
        private volatile boolean _isAlive;
        private volatile boolean _isCancelled;
        private volatile boolean _isReadyForMorePixels;
        private java.lang.Object _lockObject;
        private volatile org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder _platformPNGEncoder;
        private volatile byte[] _rgbaPixels;

        public PlatformPNGEncodingThread(org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1._isAlive = r0
                r1._isReadyForMorePixels = r0
                r0 = 0
                r1._isCancelled = r0
                r1._platformPNGEncoder = r2
                java.lang.Object r2 = new java.lang.Object
                r2.<init>()
                r1._lockObject = r2
                r1.start()
                return
        }

        public void cancelEncoding() {
                r2 = this;
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "PlatformPNGEncodingThread: Requested to cancel..."
                r0.println(r1)
                r0 = 0
                r2._isReadyForMorePixels = r0
                r0 = 1
                r2._isCancelled = r0
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                r1._isAlive = r0
                return
        }

        public synchronized void encodeFrame(byte[] r2) {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1._isReadyForMorePixels = r0     // Catch: java.lang.Throwable -> L8
                r1._rgbaPixels = r2     // Catch: java.lang.Throwable -> L8
                monitor-exit(r1)
                return
            L8:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
        }

        public boolean isCancelled() {
                r1 = this;
                boolean r0 = r1._isCancelled
                return r0
        }

        public boolean isReady() {
                r1 = this;
                boolean r0 = r1._isReadyForMorePixels
                return r0
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r5 = this;
            L0:
                boolean r0 = r5._isAlive
                r1 = 0
                if (r0 == 0) goto L30
                boolean r0 = r5._isCancelled
                if (r0 != 0) goto L0
                java.lang.Object r0 = r5._lockObject
                monitor-enter(r0)
                byte[] r2 = r5._rgbaPixels     // Catch: java.lang.Throwable -> L2d
                if (r2 == 0) goto L2b
                org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder r2 = r5._platformPNGEncoder     // Catch: java.lang.Throwable -> L2d
                boolean r2 = r2.isReadyForMorePixels()     // Catch: java.lang.Throwable -> L2d
                if (r2 == 0) goto L2b
                java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> L2d
                java.lang.String r3 = "PlatformPNGEncodingThread: Encoding and adding frame..."
                r2.println(r3)     // Catch: java.lang.Throwable -> L2d
                org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder r2 = r5._platformPNGEncoder     // Catch: java.lang.Throwable -> L2d
                byte[] r3 = r5._rgbaPixels     // Catch: java.lang.Throwable -> L2d
                r4 = 1
                r2.passPixels(r3, r4)     // Catch: java.lang.Throwable -> L2d
                r5._rgbaPixels = r1     // Catch: java.lang.Throwable -> L2d
                r5._isReadyForMorePixels = r4     // Catch: java.lang.Throwable -> L2d
            L2b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                goto L0
            L2d:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                throw r1
            L30:
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r2 = "PlatformPNGEncodingThread: Disposing."
                r0.println(r2)
                org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder r0 = r5._platformPNGEncoder
                if (r0 == 0) goto L42
                org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder r0 = r5._platformPNGEncoder
                r0.dispose()
                r5._platformPNGEncoder = r1
            L42:
                r5._rgbaPixels = r1
                r5._lockObject = r1
                return
        }
    }

    public ThreadedPlatformPNGExportLooper(org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder r11, org.fortheloss.framework.Assets r12, com.badlogic.gdx.scenes.scene2d.Stage r13, org.fortheloss.sticknodes.SNShapeRenderer r14, org.fortheloss.sticknodes.data.ProjectData r15, com.badlogic.gdx.graphics.g2d.BitmapFont r16, com.badlogic.gdx.graphics.glutils.ShaderProgram r17) {
            r10 = this;
            r0 = r10
            r10.<init>()
            r1 = 0
            r0._cancelFailResult = r1
            r0._cancelRequested = r1
            r0._exportState = r1
            r0._videoState = r1
            r1 = 30
            r0._delayCounter = r1
            r1 = r11
            r0._platformPNGEncoderRef = r1
            r2 = r15
            r0._projectDataRef = r2
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r9 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            boolean r1 = r1.isPro()
            if (r1 == 0) goto L24
            r1 = 0
            r6 = r1
            goto L26
        L24:
            r6 = r16
        L26:
            r8 = 1
            r1 = r9
            r2 = r15
            r3 = r13
            r4 = r12
            r5 = r14
            r7 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0._exportRenderer = r9
            return
    }

    private int videoUpdate() {
            r3 = this;
            int r0 = r3._videoState
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L3f
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper$PlatformPNGEncodingThread r0 = r3._platformPNGEncodingThread
            boolean r0 = r0.isReady()
            if (r0 == 0) goto L42
            boolean r0 = r3._cancelRequested
            if (r0 == 0) goto L1b
            r3._cancelRequested = r1
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper$PlatformPNGEncodingThread r0 = r3._platformPNGEncodingThread
            r0.cancelEncoding()
            r1 = 3
            goto L42
        L1b:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r3._exportRenderer
            boolean r0 = r0.allFramesRendered()
            if (r0 != 0) goto L28
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r3._exportRenderer
            r0.renderNextFrameToFBO()
        L28:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r3._exportRenderer
            boolean r0 = r0.allFramesRendered()
            if (r0 != 0) goto L3c
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper$PlatformPNGEncodingThread r0 = r3._platformPNGEncodingThread
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r2 = r3._exportRenderer
            byte[] r2 = r2.getPixelsRGBA()
            r0.encodeFrame(r2)
            goto L42
        L3c:
            r3._videoState = r2
            goto L42
        L3f:
            if (r0 != r2) goto L42
            r1 = 1
        L42:
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper
    public boolean beginExport(java.lang.String r13, int r14, int r15, int r16, int r17, boolean r18, int r19) {
            r12 = this;
            r0 = r12
            java.lang.String r1 = "..."
            r0._statusString = r1
            r1 = r13
            r0._filename = r1
            org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder r2 = r0._platformPNGEncoderRef
            java.lang.String r5 = org.fortheloss.sticknodes.App.exportsPath
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectDataRef
            boolean r7 = r3.isYoutubeShorts
            r3 = r14
            r4 = r15
            r6 = r13
            r2.begin(r3, r4, r5, r6, r7)
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper$PlatformPNGEncodingThread r1 = new org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper$PlatformPNGEncodingThread
            org.fortheloss.sticknodes.animationscreen.exporters.IPlatformPNGEncoder r2 = r0._platformPNGEncoderRef
            r1.<init>(r2)
            r0._platformPNGEncodingThread = r1
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r3 = r0._exportRenderer
            r4 = r14
            r5 = r15
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r19
            r11 = r18
            r3.initialize(r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = 1
            return r1
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._projectDataRef = r0
            r2._platformPNGEncoderRef = r0
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper$PlatformPNGEncodingThread r1 = r2._platformPNGEncodingThread
            if (r1 == 0) goto Le
            r1.dispose()
            r2._platformPNGEncodingThread = r0
        Le:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r1 = r2._exportRenderer
            if (r1 == 0) goto L17
            r1.dispose()
            r2._exportRenderer = r0
        L17:
            r2._filename = r0
            r2._statusString = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper
    public java.lang.String getExportingStatusText() {
            r1 = this;
            java.lang.String r0 = r1._statusString
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper
    public java.lang.String getFilename() {
            r1 = this;
            java.lang.String r0 = r1._filename
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper
    public float getPercentComplete() {
            r1 = this;
            int r0 = r1._exportState
            if (r0 != 0) goto Lb
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r1._exportRenderer
            float r0 = r0.getPercentComplete()
            return r0
        Lb:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper
    public void requestCancel() {
            r3 = this;
            boolean r0 = r3._cancelRequested
            if (r0 != 0) goto Lf
            int r0 = r3._exportState
            r1 = 1
            if (r0 == r1) goto Lf
            r2 = 2
            if (r0 != r2) goto Ld
            goto Lf
        Ld:
            r3._cancelRequested = r1
        Lf:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedPNGExportLooper
    public int update() {
            r5 = this;
            int r0 = r5._delayCounter
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto La
            int r0 = r0 - r2
            r5._delayCounter = r0
            return r1
        La:
            int r0 = r5._exportState
            r3 = 2
            if (r0 != 0) goto L3b
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r5._exportRenderer
            java.lang.String r0 = r0.getStatusString()
            r5._statusString = r0
            int r0 = r5.videoUpdate()
            r4 = 3
            if (r0 == r4) goto L28
            if (r0 != r3) goto L21
            goto L28
        L21:
            if (r0 != r2) goto L26
            r5._exportState = r3
            goto L8a
        L26:
            r1 = r0
            goto L8a
        L28:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r3 = r5._exportRenderer
            if (r3 == 0) goto L2f
            r3.cancel()
        L2f:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper$PlatformPNGEncodingThread r3 = r5._platformPNGEncodingThread
            if (r3 == 0) goto L36
            r3.cancelEncoding()
        L36:
            r5._cancelFailResult = r0
            r5._exportState = r2
            goto L8a
        L3b:
            java.lang.String r4 = "..."
            if (r0 != r2) goto L70
            java.lang.String r0 = "statusExporting3"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            r5._statusString = r0
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper$PlatformPNGEncodingThread r0 = r5._platformPNGEncodingThread
            if (r0 == 0) goto L68
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L68
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper$PlatformPNGEncodingThread r0 = r5._platformPNGEncodingThread
            r0.dispose()
            r0 = 0
            r5._platformPNGEncodingThread = r0
        L68:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformPNGExportLooper$PlatformPNGEncodingThread r0 = r5._platformPNGEncodingThread
            if (r0 != 0) goto L6f
            int r0 = r5._cancelFailResult
            return r0
        L6f:
            return r1
        L70:
            if (r0 != r3) goto L8a
            java.lang.String r0 = "statusExporting4"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r5._statusString = r0
            return r2
        L8a:
            return r1
    }
}
