package org.fortheloss.sticknodes.animationscreen.exporters;

/* loaded from: classes2.dex */
public class ThreadedGifExportLooper implements com.badlogic.gdx.utils.Disposable {
    private boolean _cancelRequested;
    private org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer _exportRenderer;
    private int _exportState;
    private java.lang.String _filename;
    private org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper.GifEncodingThread _gifEncodingThread;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private java.lang.String _statusString;

    private static class GifEncodingThread extends java.lang.Thread implements com.badlogic.gdx.utils.Disposable {
        private volatile org.fortheloss.sticknodes.gifencoder.AnimatedGifEncoder _animatedGifEncoder;
        private volatile boolean _isAlive;
        private volatile boolean _isCancelled;
        private volatile boolean _isCancelling;
        private volatile boolean _isFinishedEncoding;
        private volatile boolean _isReadyForMorePixels;
        private java.lang.Object _lockObject;
        private volatile int _result;
        private volatile byte[] _rgbaPixelsRef;

        public GifEncodingThread(org.fortheloss.sticknodes.gifencoder.AnimatedGifEncoder r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1._isAlive = r0
                r1._isReadyForMorePixels = r0
                r0 = 0
                r1._isCancelling = r0
                r1._isCancelled = r0
                r1._isFinishedEncoding = r0
                r1._result = r0
                r1._animatedGifEncoder = r2
                java.lang.Object r2 = new java.lang.Object
                r2.<init>()
                r1._lockObject = r2
                r1.start()
                return
        }

        public void cancelEncoding() {
                r2 = this;
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "GifEncodingThread: Requested to cancel..."
                r0.println(r1)
                r0 = 0
                r2._isReadyForMorePixels = r0
                r0 = 1
                r2._isCancelling = r0
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                r1._isAlive = r0
                return
        }

        public synchronized void encodeFrame(byte[] r3) {
                r2 = this;
                monitor-enter(r2)
                java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Throwable -> Lf
                java.lang.String r1 = "GifEncodingThread: Received some pixels..."
                r0.println(r1)     // Catch: java.lang.Throwable -> Lf
                r0 = 0
                r2._isReadyForMorePixels = r0     // Catch: java.lang.Throwable -> Lf
                r2._rgbaPixelsRef = r3     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r2)
                return
            Lf:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
        }

        public void finishEncoding() {
                r2 = this;
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "GifEncodingThread: Requested to finish..."
                r0.println(r1)
                r0 = 0
                r2._isReadyForMorePixels = r0
                org.fortheloss.sticknodes.gifencoder.AnimatedGifEncoder r0 = r2._animatedGifEncoder
                boolean r0 = r0.finish()
                r1 = 1
                if (r0 == 0) goto L16
                r2._result = r1
                goto L19
            L16:
                r0 = 2
                r2._result = r0
            L19:
                r2._isFinishedEncoding = r1
                return
        }

        public boolean isCancelled() {
                r1 = this;
                boolean r0 = r1._isCancelled
                return r0
        }

        public int isFinishedEncoding() {
                r1 = this;
                boolean r0 = r1._isFinishedEncoding
                if (r0 == 0) goto L7
                int r0 = r1._result
                return r0
            L7:
                r0 = 0
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
                if (r0 == 0) goto L38
                boolean r0 = r5._isFinishedEncoding
                if (r0 != 0) goto L0
                boolean r0 = r5._isCancelled
                if (r0 != 0) goto L0
                java.lang.Object r0 = r5._lockObject
                monitor-enter(r0)
                boolean r2 = r5._isCancelling     // Catch: java.lang.Throwable -> L35
                r3 = 1
                if (r2 == 0) goto L1d
                org.fortheloss.sticknodes.gifencoder.AnimatedGifEncoder r1 = r5._animatedGifEncoder     // Catch: java.lang.Throwable -> L35
                r1.cancel()     // Catch: java.lang.Throwable -> L35
                r5._isCancelled = r3     // Catch: java.lang.Throwable -> L35
                goto L33
            L1d:
                byte[] r2 = r5._rgbaPixelsRef     // Catch: java.lang.Throwable -> L35
                if (r2 == 0) goto L33
                java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> L35
                java.lang.String r4 = "GifEncodingThread: Adding frame..."
                r2.println(r4)     // Catch: java.lang.Throwable -> L35
                org.fortheloss.sticknodes.gifencoder.AnimatedGifEncoder r2 = r5._animatedGifEncoder     // Catch: java.lang.Throwable -> L35
                byte[] r4 = r5._rgbaPixelsRef     // Catch: java.lang.Throwable -> L35
                r2.addFrame(r4)     // Catch: java.lang.Throwable -> L35
                r5._rgbaPixelsRef = r1     // Catch: java.lang.Throwable -> L35
                r5._isReadyForMorePixels = r3     // Catch: java.lang.Throwable -> L35
            L33:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
                goto L0
            L35:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
                throw r1
            L38:
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r2 = "GifEncodingThread: Disposing."
                r0.println(r2)
                r5._animatedGifEncoder = r1
                r5._rgbaPixelsRef = r1
                r5._lockObject = r1
                return
        }
    }

    public ThreadedGifExportLooper(com.badlogic.gdx.scenes.scene2d.Stage r10, org.fortheloss.framework.Assets r11, org.fortheloss.sticknodes.SNShapeRenderer r12, org.fortheloss.sticknodes.data.ProjectData r13, com.badlogic.gdx.graphics.g2d.BitmapFont r14, com.badlogic.gdx.graphics.glutils.ShaderProgram r15) {
            r9 = this;
            r9.<init>()
            r0 = 0
            r9._exportState = r0
            r9._cancelRequested = r0
            r9._projectDataRef = r13
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r13 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer
            org.fortheloss.sticknodes.data.ProjectData r2 = r9._projectDataRef
            org.fortheloss.framework.IPlatform r0 = org.fortheloss.sticknodes.App.platform
            boolean r0 = r0.isPro()
            if (r0 == 0) goto L17
            r14 = 0
        L17:
            r6 = r14
            r8 = 0
            r1 = r13
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9._exportRenderer = r13
            return
    }

    public void beginExport(java.lang.String r13, int r14, int r15, int r16, int r17, boolean r18, boolean r19, int r20) {
            r12 = this;
            r0 = r12
            java.lang.String r1 = "statusExporting1"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "..."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0._statusString = r1
            r1 = r13
            r0._filename = r1
            org.fortheloss.sticknodes.gifencoder.AnimatedGifEncoder r1 = new org.fortheloss.sticknodes.gifencoder.AnimatedGifEncoder
            r1.<init>()
            java.lang.String r2 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.String r3 = r0._filename
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ".gif"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3 = r18
            r4 = r19
            r1.start(r2, r3, r4)
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectDataRef
            boolean r2 = r2.isYoutubeShorts
            r6 = r14
            r7 = r15
            r1.setSize(r14, r15, r2)
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectDataRef
            int r2 = r2.getActualFPS()
            float r2 = (float) r2
            r1.setFrameRate(r2)
            r2 = 0
            r1.setRepeat(r2)
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper$GifEncodingThread r2 = new org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper$GifEncodingThread
            r2.<init>(r1)
            r0._gifEncodingThread = r2
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r3 = r0._exportRenderer
            r11 = 0
            r4 = r14
            r5 = r15
            r8 = r16
            r9 = r17
            r10 = r20
            r3.initialize(r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper$GifEncodingThread r0 = r2._gifEncodingThread
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2._gifEncodingThread = r1
        La:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r2._exportRenderer
            if (r0 == 0) goto L13
            r0.dispose()
            r2._exportRenderer = r1
        L13:
            r2._projectDataRef = r1
            r2._filename = r1
            r2._statusString = r1
            return
    }

    public java.lang.String getExportingStatusText() {
            r1 = this;
            java.lang.String r0 = r1._statusString
            return r0
    }

    public java.lang.String getFilename() {
            r1 = this;
            java.lang.String r0 = r1._filename
            return r0
    }

    public float getPercentComplete() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r2._exportRenderer
            float r0 = r0.getPercentComplete()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r1, r0)
            return r0
    }

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

    public int update() {
            r6 = this;
            int r0 = r6._exportState
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 != 0) goto L58
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r6._exportRenderer
            java.lang.String r0 = r0.getStatusString()
            r6._statusString = r0
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper$GifEncodingThread r0 = r6._gifEncodingThread
            boolean r0 = r0.isReady()
            if (r0 == 0) goto Leb
            boolean r0 = r6._cancelRequested
            if (r0 == 0) goto L2d
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r6._exportRenderer
            if (r0 == 0) goto L22
            r0.cancel()
        L22:
            r6._cancelRequested = r1
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper$GifEncodingThread r0 = r6._gifEncodingThread
            r0.cancelEncoding()
            r6._exportState = r2
            goto Leb
        L2d:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r6._exportRenderer
            boolean r0 = r0.allFramesRendered()
            if (r0 != 0) goto L3a
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r6._exportRenderer
            r0.renderNextFrameToFBO()
        L3a:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r6._exportRenderer
            boolean r0 = r0.allFramesRendered()
            if (r0 != 0) goto L4f
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper$GifEncodingThread r0 = r6._gifEncodingThread
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r2 = r6._exportRenderer
            byte[] r2 = r2.getPixelsRGBA()
            r0.encodeFrame(r2)
            goto Leb
        L4f:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper$GifEncodingThread r0 = r6._gifEncodingThread
            r0.finishEncoding()
            r6._exportState = r3
            goto Leb
        L58:
            java.lang.String r4 = ".gif"
            java.lang.String r5 = "..."
            if (r0 != r2) goto La4
            java.lang.String r0 = "statusExporting3"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            r6._statusString = r0
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper$GifEncodingThread r0 = r6._gifEncodingThread
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto Leb
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.String r2 = r6._filename
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto La2
            r0.delete()
        La2:
            r0 = 3
            return r0
        La4:
            if (r0 != r3) goto Leb
            java.lang.String r0 = "statusExporting4"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            r6._statusString = r0
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedGifExportLooper$GifEncodingThread r0 = r6._gifEncodingThread
            int r0 = r0.isFinishedEncoding()
            if (r0 != r3) goto Lea
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.String r3 = r6._filename
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            com.badlogic.gdx.files.FileHandle r1 = r1.absolute(r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto Lea
            r1.delete()
        Lea:
            return r0
        Leb:
            return r1
    }
}
