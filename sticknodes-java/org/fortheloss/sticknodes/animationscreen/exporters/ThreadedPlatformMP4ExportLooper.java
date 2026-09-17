package org.fortheloss.sticknodes.animationscreen.exporters;

/* loaded from: classes2.dex */
public class ThreadedPlatformMP4ExportLooper implements org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper {
    private org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread _audioEncodingThread;
    private org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer _audioRenderer;
    private int _audioState;
    private int _cancelFailResult;
    private boolean _cancelRequested;
    private int _delayCounter;
    private org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer _exportRenderer;
    private int _exportState;
    private boolean _failedToStart;
    private java.lang.String _filename;
    private java.lang.String _filepath;
    private org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder _platformMP4Encoder;
    private org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper.PlatformMP4EncodingThread _platformMP4EncodingThread;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private java.lang.String _statusString;
    private int _videoState;
    private boolean _willEncodeAudio;

    private static class PlatformMP4EncodingThread extends java.lang.Thread implements com.badlogic.gdx.utils.Disposable {
        private volatile int _finishResult;
        private volatile boolean _isAlive;
        private volatile boolean _isCancelled;
        private volatile boolean _isFinished;
        private volatile boolean _isFinishing;
        private volatile boolean _isReadyForMorePixels;
        private java.lang.Object _lockObject;
        private volatile org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder _platformMP4Encoder;
        private volatile byte[] _rgbaPixels;

        public PlatformMP4EncodingThread(org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1._isAlive = r0
                r1._isReadyForMorePixels = r0
                r0 = 0
                r1._isCancelled = r0
                r1._isFinished = r0
                r1._finishResult = r0
                r1._isFinishing = r0
                r1._platformMP4Encoder = r2
                java.lang.Object r2 = new java.lang.Object
                r2.<init>()
                r1._lockObject = r2
                r1.start()
                return
        }

        public void cancelEncoding() {
                r2 = this;
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "PlatformMP4EncodingThread: Requested to cancel..."
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

        public void finishEncoding() {
                r2 = this;
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "PlatformMP4EncodingThread: Requested to finish..."
                r0.println(r1)
                r0 = 0
                r2._isReadyForMorePixels = r0
                r0 = 1
                r2._isFinishing = r0
                return
        }

        public boolean isCancelled() {
                r1 = this;
                boolean r0 = r1._isCancelled
                return r0
        }

        public int isFinishedEncoding() {
                r1 = this;
                boolean r0 = r1._isFinished
                if (r0 == 0) goto L7
                int r0 = r1._finishResult
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
                if (r0 == 0) goto L40
                boolean r0 = r5._isFinished
                if (r0 != 0) goto L0
                boolean r0 = r5._isCancelled
                if (r0 != 0) goto L0
                java.lang.Object r0 = r5._lockObject
                monitor-enter(r0)
                boolean r2 = r5._isFinishing     // Catch: java.lang.Throwable -> L3d
                r3 = 1
                if (r2 == 0) goto L25
                r5._finishResult = r3     // Catch: java.lang.Throwable -> L3d
                org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder r1 = r5._platformMP4Encoder     // Catch: java.lang.Throwable -> L3d
                boolean r1 = r1.finishEncoding()     // Catch: java.lang.Throwable -> L3d
                if (r1 != 0) goto L22
                r1 = 2
                r5._finishResult = r1     // Catch: java.lang.Throwable -> L3d
            L22:
                r5._isFinished = r3     // Catch: java.lang.Throwable -> L3d
                goto L3b
            L25:
                byte[] r2 = r5._rgbaPixels     // Catch: java.lang.Throwable -> L3d
                if (r2 == 0) goto L3b
                java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> L3d
                java.lang.String r4 = "PlatformMP4EncodingThread: Encoding and adding frame..."
                r2.println(r4)     // Catch: java.lang.Throwable -> L3d
                org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder r2 = r5._platformMP4Encoder     // Catch: java.lang.Throwable -> L3d
                byte[] r4 = r5._rgbaPixels     // Catch: java.lang.Throwable -> L3d
                r2.passPixels(r4)     // Catch: java.lang.Throwable -> L3d
                r5._rgbaPixels = r1     // Catch: java.lang.Throwable -> L3d
                r5._isReadyForMorePixels = r3     // Catch: java.lang.Throwable -> L3d
            L3b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
                goto L0
            L3d:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
                throw r1
            L40:
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r2 = "PlatformMP4EncodingThread: Disposing."
                r0.println(r2)
                r5._platformMP4Encoder = r1
                r5._rgbaPixels = r1
                r5._lockObject = r1
                return
        }
    }

    public ThreadedPlatformMP4ExportLooper(org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder r10, org.fortheloss.framework.Assets r11, com.badlogic.gdx.scenes.scene2d.Stage r12, org.fortheloss.sticknodes.SNShapeRenderer r13, org.fortheloss.sticknodes.data.ProjectData r14, com.badlogic.gdx.graphics.glutils.ShaderProgram r15) {
            r9 = this;
            r9.<init>()
            r0 = 0
            r9._cancelFailResult = r0
            r9._failedToStart = r0
            r9._cancelRequested = r0
            r9._willEncodeAudio = r0
            r9._exportState = r0
            r9._videoState = r0
            r9._audioState = r0
            r1 = 30
            r9._delayCounter = r1
            r9._platformMP4Encoder = r10
            com.badlogic.gdx.Application r10 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r10 = r10.getType()
            com.badlogic.gdx.Application$ApplicationType r1 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r10 != r1) goto L25
            r0 = 1
            r8 = 1
            goto L26
        L25:
            r8 = 0
        L26:
            r9._projectDataRef = r14
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r10 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer
            org.fortheloss.sticknodes.data.ProjectData r2 = r9._projectDataRef
            r6 = 0
            r1 = r10
            r3 = r12
            r4 = r11
            r5 = r13
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9._exportRenderer = r10
            return
    }

    private int audioUpdate() {
            r5 = this;
            int r0 = r5._audioState
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L43
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r5._audioEncodingThread
            boolean r0 = r0.isReady()
            if (r0 == 0) goto L64
            boolean r0 = r5._cancelRequested
            if (r0 == 0) goto L1b
            r5._cancelRequested = r2
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r5._audioEncodingThread
            r0.cancelAudioEncoding()
            r2 = 3
            goto L64
        L1b:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer r0 = r5._audioRenderer
            java.util.ArrayList r0 = r0.getNextAudioEvents()
            if (r0 != 0) goto L37
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r5._audioEncodingThread
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = r5._filepath
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r4)
            java.io.File r3 = r3.file()
            r0.finishAudioEncoding(r3)
            r5._audioState = r1
            goto L64
        L37:
            int r1 = r0.size()
            if (r1 <= 0) goto L64
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r1 = r5._audioEncodingThread
            r1.processAudioEvents(r0)
            goto L64
        L43:
            if (r0 != r1) goto L64
            java.lang.String r0 = "statusExporting5"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5._statusString = r0
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r5._audioEncodingThread
            int r2 = r0.isFinishedEncodingAudio()
        L64:
            return r2
    }

    private int videoUpdate() {
            r3 = this;
            int r0 = r3._videoState
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L4b
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r0 = r3._platformMP4EncodingThread
            boolean r0 = r0.isReady()
            if (r0 == 0) goto L61
            boolean r0 = r3._cancelRequested
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r3._exportRenderer
            if (r0 == 0) goto L19
            r0.cancel()
        L19:
            r3._cancelRequested = r2
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r0 = r3._platformMP4EncodingThread
            r0.cancelEncoding()
            r1 = 3
            goto L62
        L22:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r3._exportRenderer
            boolean r0 = r0.allFramesRendered()
            if (r0 != 0) goto L2f
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r3._exportRenderer
            r0.renderNextFrameToFBO()
        L2f:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r3._exportRenderer
            boolean r0 = r0.allFramesRendered()
            if (r0 != 0) goto L43
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r0 = r3._platformMP4EncodingThread
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r1 = r3._exportRenderer
            byte[] r1 = r1.getPixelsRGBA()
            r0.encodeFrame(r1)
            goto L61
        L43:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r0 = r3._platformMP4EncodingThread
            r0.finishEncoding()
            r3._videoState = r1
            goto L61
        L4b:
            if (r0 != r1) goto L61
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r0 = r3._platformMP4EncodingThread
            int r0 = r0.isFinishedEncoding()
            if (r0 != 0) goto L56
            return r2
        L56:
            boolean r0 = r3._willEncodeAudio
            if (r0 == 0) goto L62
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r0 = r3._platformMP4EncodingThread
            int r1 = r0.isFinishedEncoding()
            goto L62
        L61:
            r1 = 0
        L62:
            return r1
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper
    public boolean beginExport(java.lang.String r10, int r11, int r12, int r13, int r14, boolean r15, int r16) {
            r9 = this;
            r7 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r16
            boolean r0 = r0.beginExport(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper
    public boolean beginExport(java.lang.String r18, int r19, int r20, int r21, int r22, boolean r23, boolean r24, int r25) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "statusExporting2"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "..."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0._statusString = r2
            r0._filename = r1
            r2 = 0
            r0._willEncodeAudio = r2
            r10 = 1
            if (r23 == 0) goto L31
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r3 = r3.librarySoundDatas
            int r3 = r3.size()
            if (r3 <= 0) goto L31
            r0._willEncodeAudio = r10
        L31:
            if (r24 == 0) goto L36
            r3 = 32
            goto L38
        L36:
            r3 = 16
        L38:
            int r4 = r19 % r3
            java.lang.String r5 = "."
            java.lang.String r6 = ", was cropped to "
            if (r4 == 0) goto L64
            int r4 = r19 / r3
            int r4 = r4 * r3
            java.io.PrintStream r7 = java.lang.System.out
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Width wasn't divisible by "
            r8.append(r9)
            r8.append(r3)
            r8.append(r6)
            r8.append(r4)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            r7.println(r8)
            goto L66
        L64:
            r4 = r19
        L66:
            int r7 = r20 % r3
            if (r7 == 0) goto L8f
            int r7 = r20 / r3
            int r7 = r7 * r3
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Height wasn't divisible by "
            r9.append(r11)
            r9.append(r3)
            r9.append(r6)
            r9.append(r7)
            r9.append(r5)
            java.lang.String r3 = r9.toString()
            r8.println(r3)
            r3 = r7
            goto L91
        L8f:
            r3 = r20
        L91:
            boolean r5 = r0._willEncodeAudio
            if (r5 == 0) goto La5
            java.lang.String r5 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = "_no_audio.mp4"
            goto Lb4
        La5:
            java.lang.String r5 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = ".mp4"
        Lb4:
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r0._filepath = r1
            org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder r11 = r0._platformMP4Encoder
            java.io.File r12 = new java.io.File
            java.lang.String r1 = r0._filepath
            r12.<init>(r1)
            org.fortheloss.sticknodes.data.ProjectData r1 = r0._projectDataRef
            int r13 = r1.getActualFPS()
            org.fortheloss.sticknodes.data.ProjectData r1 = r0._projectDataRef
            boolean r1 = r1.isYoutubeShorts
            r14 = r4
            r15 = r3
            r16 = r1
            boolean r1 = r11.beginEncoding(r12, r13, r14, r15, r16)
            if (r1 != 0) goto Ldc
            r0._failedToStart = r10
        Ldc:
            boolean r1 = r0._failedToStart
            if (r1 == 0) goto Le1
            return r2
        Le1:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r1 = new org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread
            org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder r2 = r0._platformMP4Encoder
            r1.<init>(r2)
            r0._platformMP4EncodingThread = r1
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r1 = r0._exportRenderer
            r9 = 0
            r2 = r4
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r25
            r1.initialize(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder r0 = r2._platformMP4Encoder
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2._platformMP4Encoder = r1
        La:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r0 = r2._platformMP4EncodingThread
            if (r0 == 0) goto L13
            r0.dispose()
            r2._platformMP4EncodingThread = r1
        L13:
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r2._audioEncodingThread
            if (r0 == 0) goto L1c
            r0.dispose()
            r2._audioEncodingThread = r1
        L1c:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r2._exportRenderer
            if (r0 == 0) goto L25
            r0.dispose()
            r2._exportRenderer = r1
        L25:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer r0 = r2._audioRenderer
            if (r0 == 0) goto L2e
            r0.dispose()
            r2._audioRenderer = r1
        L2e:
            r2._projectDataRef = r1
            r2._filename = r1
            r2._filepath = r1
            r2._statusString = r1
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper
    public java.lang.String getExportingStatusText() {
            r1 = this;
            java.lang.String r0 = r1._statusString
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper
    public java.lang.String getFilename() {
            r1 = this;
            java.lang.String r0 = r1._filename
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper
    public float getPercentComplete() {
            r3 = this;
            boolean r0 = r3._willEncodeAudio
            if (r0 != 0) goto Lb
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r3._exportRenderer
            float r0 = r0.getPercentComplete()
            return r0
        Lb:
            int r0 = r3._exportState
            r1 = 1063675494(0x3f666666, float:0.9)
            if (r0 != 0) goto L1b
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r3._exportRenderer
            float r0 = r0.getPercentComplete()
            float r0 = r0 * r1
            return r0
        L1b:
            r2 = 1
            if (r0 != r2) goto L2f
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r3._audioEncodingThread
            if (r0 == 0) goto L2e
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer r0 = r3._audioRenderer
            float r0 = r0.getPercentComplete()
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r0 * r2
            float r1 = r1 + r0
        L2e:
            return r1
        L2f:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper
    public void requestCancel() {
            r2 = this;
            boolean r0 = r2._cancelRequested
            if (r0 != 0) goto L10
            int r0 = r2._exportState
            r1 = 2
            if (r0 == r1) goto L10
            r1 = 3
            if (r0 != r1) goto Ld
            goto L10
        Ld:
            r0 = 1
            r2._cancelRequested = r0
        L10:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper
    public int update() {
            r10 = this;
            boolean r0 = r10._failedToStart
            r1 = 2
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r10._delayCounter
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L10
            int r0 = r0 - r2
            r10._delayCounter = r0
            return r3
        L10:
            int r0 = r10._exportState
            r4 = 3
            if (r0 != 0) goto L44
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r10._exportRenderer
            java.lang.String r0 = r0.getStatusString()
            r10._statusString = r0
            int r0 = r10.videoUpdate()
            if (r0 == r4) goto L37
            if (r0 != r1) goto L26
            goto L37
        L26:
            if (r0 != r2) goto L34
            boolean r0 = r10._willEncodeAudio
            if (r0 == 0) goto L30
            r10._exportState = r2
            goto L17c
        L30:
            r10._exportState = r4
            goto L17c
        L34:
            r3 = r0
            goto L17c
        L37:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r2 = r10._platformMP4EncodingThread
            if (r2 == 0) goto L3e
            r2.cancelEncoding()
        L3e:
            r10._cancelFailResult = r0
            r10._exportState = r1
            goto L17c
        L44:
            r5 = 0
            if (r0 != r2) goto Le6
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r10._audioEncodingThread
            if (r0 != 0) goto Lbb
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r6 = "***** BEGINNING AUDIO RENDER"
            r0.println(r6)
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r10._exportRenderer
            int r0 = r0.getStartFrame()
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r6 = r10._exportRenderer
            int r6 = r6.getEndFrame()
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r7 = r10._platformMP4EncodingThread
            if (r7 == 0) goto L67
            r7.dispose()
            r10._platformMP4EncodingThread = r5
        L67:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r7 = r10._exportRenderer
            if (r7 == 0) goto L70
            r7.dispose()
            r10._exportRenderer = r5
        L70:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer r5 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer
            org.fortheloss.sticknodes.data.ProjectData r7 = r10._projectDataRef
            r5.<init>(r7, r0, r6)
            r10._audioRenderer = r5
            r5.initialize()
            com.badlogic.gdx.Files r5 = com.badlogic.gdx.Gdx.files
            java.lang.String r7 = org.fortheloss.sticknodes.App.tempPath
            com.badlogic.gdx.files.FileHandle r5 = r5.absolute(r7)
            boolean r7 = r5.exists()
            if (r7 == 0) goto L8d
            r5.emptyDirectory()
        L8d:
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r5 = new org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread
            java.lang.String r7 = r10._filename
            org.fortheloss.sticknodes.data.ProjectData r8 = r10._projectDataRef
            int r8 = r8.getActualFPS()
            org.fortheloss.sticknodes.data.ProjectData r9 = r10._projectDataRef
            int r0 = r9.getTotalFrameCount(r0, r6)
            r5.<init>(r7, r8, r0)
            r10._audioEncodingThread = r5
            boolean r0 = r5.isOkay()
            if (r0 != 0) goto Lbb
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r0 = r10._platformMP4EncodingThread
            if (r0 == 0) goto Laf
            r0.cancelEncoding()
        Laf:
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r10._audioEncodingThread
            if (r0 == 0) goto Lb6
            r0.cancelAudioEncoding()
        Lb6:
            r10._cancelFailResult = r1
            r10._exportState = r1
            return r3
        Lbb:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer r0 = r10._audioRenderer
            java.lang.String r0 = r0.getStatusString()
            r10._statusString = r0
            int r0 = r10.audioUpdate()
            if (r0 == r4) goto Ld2
            if (r0 != r1) goto Lcc
            goto Ld2
        Lcc:
            if (r0 != r2) goto L34
            r10._exportState = r4
            goto L17c
        Ld2:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r2 = r10._platformMP4EncodingThread
            if (r2 == 0) goto Ld9
            r2.cancelEncoding()
        Ld9:
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r2 = r10._audioEncodingThread
            if (r2 == 0) goto Le0
            r2.cancelAudioEncoding()
        Le0:
            r10._cancelFailResult = r0
            r10._exportState = r1
            goto L17c
        Le6:
            java.lang.String r6 = "..."
            if (r0 != r1) goto L151
            java.lang.String r0 = "statusExporting3"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r10._statusString = r0
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r0 = r10._platformMP4EncodingThread
            if (r0 == 0) goto L112
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L112
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r0 = r10._platformMP4EncodingThread
            r0.dispose()
            r10._platformMP4EncodingThread = r5
        L112:
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r10._audioEncodingThread
            if (r0 == 0) goto L123
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L123
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r10._audioEncodingThread
            r0.dispose()
            r10._audioEncodingThread = r5
        L123:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedPlatformMP4ExportLooper$PlatformMP4EncodingThread r0 = r10._platformMP4EncodingThread
            if (r0 != 0) goto L150
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r10._audioEncodingThread
            if (r0 != 0) goto L150
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = r10._filepath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L13c
            r0.delete()
        L13c:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.tempPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L14d
            r0.emptyDirectory()
        L14d:
            int r0 = r10._cancelFailResult
            return r0
        L150:
            return r3
        L151:
            if (r0 != r4) goto L17c
            java.lang.String r0 = "statusExporting4"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r10._statusString = r0
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.tempPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L17b
            r0.emptyDirectory()
        L17b:
            return r2
        L17c:
            return r3
    }
}
