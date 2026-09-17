package org.fortheloss.sticknodes.animationscreen.exporters;

/* loaded from: classes2.dex */
public class ThreadedMP4JcodecExportLooper implements org.fortheloss.sticknodes.animationscreen.exporters.IThreadedMP4ExportLooper {
    private org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread _audioEncodingThread;
    private org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer _audioRenderer;
    private int _audioState;
    private int _cancelFailResult;
    private boolean _cancelRequested;
    private org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer _exportRenderer;
    private int _exportState;
    private boolean _failedToStart;
    private org.jcodec.common.io.FileChannelWrapper _fileChannelWrapper;
    private java.lang.String _filename;
    private java.lang.String _filepath;
    private org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper.JcodecMP4EncodingThread _jcodecMP4EncodingThread;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private java.lang.String _statusString;
    private int _videoState;
    private boolean _willEncodeAudio;

    private static class JcodecMP4EncodingThread extends java.lang.Thread implements com.badlogic.gdx.utils.Disposable {
        private java.nio.ByteBuffer _encodedByteBuffer;
        private int _encodedFrameIndex;
        private org.jcodec.codecs.h264.H264Encoder _encoder;
        private int _exportHeight;
        private int _exportWidth;
        private volatile int _finishResult;
        private volatile int _fps;
        private volatile boolean _isAlive;
        private volatile boolean _isCancelled;
        private volatile boolean _isFinished;
        private volatile boolean _isFinishing;
        private volatile boolean _isReadyForMorePixels;
        private boolean _isVertical;
        private java.lang.Object _lockObject;
        private volatile org.jcodec.containers.mp4.muxer.MP4Muxer _mp4Muxer;
        private org.jcodec.containers.mp4.muxer.FramesMP4MuxerTrack _outTrack;
        private org.jcodec.common.model.Picture8Bit _pictureRGB;
        private org.jcodec.common.model.Picture8Bit _pictureToEncode;
        private java.nio.ByteBuffer _pps;
        private java.util.ArrayList<java.nio.ByteBuffer> _ppsList;
        private volatile byte[] _rgbaPixels;
        private java.nio.ByteBuffer _sps;
        private java.util.ArrayList<java.nio.ByteBuffer> _spsList;
        private org.jcodec.scale.Transform8Bit _transform;

        public JcodecMP4EncodingThread(org.jcodec.containers.mp4.muxer.MP4Muxer r4, int r5, int r6, int r7, boolean r8) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3._fps = r0
                r3._encodedFrameIndex = r0
                r1 = 1
                r3._isAlive = r1
                r3._isReadyForMorePixels = r1
                r3._isCancelled = r0
                r3._isFinished = r0
                r3._finishResult = r0
                r3._isFinishing = r0
                r3._isVertical = r0
                r3._exportWidth = r6
                r3._exportHeight = r7
                r3._mp4Muxer = r4
                r3._fps = r5
                org.jcodec.containers.mp4.muxer.MP4Muxer r4 = r3._mp4Muxer
                org.jcodec.containers.mp4.TrackType r5 = org.jcodec.containers.mp4.TrackType.VIDEO
                int r6 = r3._fps
                org.jcodec.containers.mp4.muxer.FramesMP4MuxerTrack r4 = r4.addTrack(r5, r6)
                r3._outTrack = r4
                int r4 = r3._exportWidth
                int r5 = r3._exportHeight
                int r4 = r4 * r5
                int r4 = r4 * 3
                java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
                r3._encodedByteBuffer = r4
                org.jcodec.codecs.h264.H264Encoder r4 = new org.jcodec.codecs.h264.H264Encoder
                org.jcodec.codecs.h264.encode.H264FixedRateControl r5 = new org.jcodec.codecs.h264.encode.H264FixedRateControl
                r6 = 512(0x200, float:7.175E-43)
                r5.<init>(r6)
                r4.<init>(r5)
                r3._encoder = r4
                org.jcodec.common.model.ColorSpace r5 = org.jcodec.common.model.ColorSpace.RGB
                org.jcodec.common.model.ColorSpace[] r4 = r4.getSupportedColorSpaces()
                r4 = r4[r0]
                org.jcodec.scale.Transform8Bit r4 = org.jcodec.scale.ColorUtil.getTransform8Bit(r5, r4)
                r3._transform = r4
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r3._spsList = r4
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r3._ppsList = r4
                int r4 = r3._exportWidth
                int r6 = r3._exportHeight
                if (r8 == 0) goto L6e
                r3._isVertical = r1
                r2 = r6
                r6 = r4
                r4 = r2
            L6e:
                org.jcodec.common.model.Picture8Bit r5 = org.jcodec.common.model.Picture8Bit.create(r4, r6, r5)
                r3._pictureRGB = r5
                org.jcodec.codecs.h264.H264Encoder r5 = r3._encoder
                org.jcodec.common.model.ColorSpace[] r5 = r5.getSupportedColorSpaces()
                r5 = r5[r0]
                org.jcodec.common.model.Picture8Bit r4 = org.jcodec.common.model.Picture8Bit.create(r4, r6, r5)
                r3._pictureToEncode = r4
                java.lang.Object r4 = new java.lang.Object
                r4.<init>()
                r3._lockObject = r4
                r3.start()
                return
        }

        public void cancelEncoding() {
                r2 = this;
                boolean r0 = r2._isCancelled
                if (r0 == 0) goto L5
                return
            L5:
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r1 = "JcodecMP4EncodingThread: Requested to cancel..."
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
                java.lang.String r1 = "JcodecMP4EncodingThread: Requested to finish..."
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
                r24 = this;
                r1 = r24
            L2:
                boolean r0 = r1._isAlive
                if (r0 == 0) goto L156
                boolean r0 = r1._isFinished
                if (r0 != 0) goto L2
                boolean r0 = r1._isCancelled
                if (r0 != 0) goto L2
                java.lang.Object r3 = r1._lockObject
                monitor-enter(r3)
                boolean r0 = r1._isFinishing     // Catch: java.lang.Throwable -> L14f
                r4 = 4
                r5 = 1
                if (r0 == 0) goto L33
                r1._finishResult = r5     // Catch: java.lang.Throwable -> L14f
                org.jcodec.containers.mp4.muxer.FramesMP4MuxerTrack r0 = r1._outTrack     // Catch: java.lang.Throwable -> L14f
                java.nio.ByteBuffer r2 = r1._sps     // Catch: java.lang.Throwable -> L14f
                java.nio.ByteBuffer r6 = r1._pps     // Catch: java.lang.Throwable -> L14f
                org.jcodec.containers.mp4.boxes.SampleEntry r2 = org.jcodec.codecs.h264.H264Utils.createMOVSampleEntryFromBuffer(r2, r6, r4)     // Catch: java.lang.Throwable -> L14f
                r0.addSampleEntry(r2)     // Catch: java.lang.Throwable -> L14f
                org.jcodec.containers.mp4.muxer.MP4Muxer r0 = r1._mp4Muxer     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L14f
                r0.writeHeader()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L14f
                goto L2f
            L2c:
                r0 = 2
                r1._finishResult = r0     // Catch: java.lang.Throwable -> L14f
            L2f:
                r1._isFinished = r5     // Catch: java.lang.Throwable -> L14f
                goto L14a
            L33:
                byte[] r0 = r1._rgbaPixels     // Catch: java.lang.Throwable -> L14f
                if (r0 == 0) goto L14a
                org.jcodec.common.model.Picture8Bit r0 = r1._pictureRGB     // Catch: java.lang.Throwable -> L14f
                r6 = 0
                byte[] r0 = r0.getPlaneData(r6)     // Catch: java.lang.Throwable -> L14f
                byte[] r7 = r1._rgbaPixels     // Catch: java.lang.Throwable -> L14f
                int r7 = r7.length     // Catch: java.lang.Throwable -> L14f
                int r7 = r7 - r4
                boolean r4 = r1._isVertical     // Catch: java.lang.Throwable -> L14f
                if (r4 != 0) goto L82
                r4 = 0
            L47:
                int r8 = r1._exportHeight     // Catch: java.lang.Throwable -> L14f
                if (r4 >= r8) goto Lc0
                int r8 = r1._exportWidth     // Catch: java.lang.Throwable -> L14f
                int r8 = r8 - r5
            L4e:
                if (r8 < 0) goto L7f
                int r9 = r1._exportWidth     // Catch: java.lang.Throwable -> L14f
                int r9 = r9 * r4
                int r9 = r9 + r8
                int r9 = r9 * 3
                byte[] r10 = r1._rgbaPixels     // Catch: java.lang.Throwable -> L14f
                r10 = r10[r7]     // Catch: java.lang.Throwable -> L14f
                int r10 = r10 + (-128)
                byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L14f
                r0[r9] = r10     // Catch: java.lang.Throwable -> L14f
                int r10 = r9 + 1
                byte[] r11 = r1._rgbaPixels     // Catch: java.lang.Throwable -> L14f
                int r12 = r7 + 1
                r11 = r11[r12]     // Catch: java.lang.Throwable -> L14f
                int r11 = r11 + (-128)
                byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L14f
                r0[r10] = r11     // Catch: java.lang.Throwable -> L14f
                int r9 = r9 + 2
                byte[] r10 = r1._rgbaPixels     // Catch: java.lang.Throwable -> L14f
                int r11 = r7 + 2
                r10 = r10[r11]     // Catch: java.lang.Throwable -> L14f
                int r10 = r10 + (-128)
                byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L14f
                r0[r9] = r10     // Catch: java.lang.Throwable -> L14f
                int r7 = r7 + (-4)
                int r8 = r8 + (-1)
                goto L4e
            L7f:
                int r4 = r4 + 1
                goto L47
            L82:
                int r4 = r1._exportWidth     // Catch: java.lang.Throwable -> L14f
                int r4 = r4 - r5
                r7 = 0
            L86:
                if (r4 < 0) goto Lc0
                int r8 = r1._exportHeight     // Catch: java.lang.Throwable -> L14f
                int r8 = r8 - r5
            L8b:
                if (r8 < 0) goto Lbd
                int r9 = r1._exportWidth     // Catch: java.lang.Throwable -> L14f
                int r9 = r9 * r8
                int r9 = r9 + r4
                int r9 = r9 * 3
                int r10 = r7 + 1
                byte[] r11 = r1._rgbaPixels     // Catch: java.lang.Throwable -> L14f
                r11 = r11[r9]     // Catch: java.lang.Throwable -> L14f
                int r11 = r11 + (-128)
                byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L14f
                r0[r7] = r11     // Catch: java.lang.Throwable -> L14f
                int r7 = r10 + 1
                byte[] r11 = r1._rgbaPixels     // Catch: java.lang.Throwable -> L14f
                int r12 = r9 + 1
                r11 = r11[r12]     // Catch: java.lang.Throwable -> L14f
                int r11 = r11 + (-128)
                byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L14f
                r0[r10] = r11     // Catch: java.lang.Throwable -> L14f
                int r10 = r7 + 1
                byte[] r11 = r1._rgbaPixels     // Catch: java.lang.Throwable -> L14f
                int r9 = r9 + 2
                r9 = r11[r9]     // Catch: java.lang.Throwable -> L14f
                int r9 = r9 + (-128)
                byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L14f
                r0[r7] = r9     // Catch: java.lang.Throwable -> L14f
                int r8 = r8 + (-1)
                r7 = r10
                goto L8b
            Lbd:
                int r4 = r4 + (-1)
                goto L86
            Lc0:
                org.jcodec.scale.Transform8Bit r0 = r1._transform     // Catch: java.lang.Throwable -> L14f
                org.jcodec.common.model.Picture8Bit r4 = r1._pictureRGB     // Catch: java.lang.Throwable -> L14f
                org.jcodec.common.model.Picture8Bit r7 = r1._pictureToEncode     // Catch: java.lang.Throwable -> L14f
                r0.transform(r4, r7)     // Catch: java.lang.Throwable -> L14f
                java.nio.ByteBuffer r0 = r1._encodedByteBuffer     // Catch: java.lang.Throwable -> L14f
                r0.clear()     // Catch: java.lang.Throwable -> L14f
                org.jcodec.codecs.h264.H264Encoder r0 = r1._encoder     // Catch: java.lang.Throwable -> L14f
                org.jcodec.common.model.Picture8Bit r4 = r1._pictureToEncode     // Catch: java.lang.Throwable -> L14f
                java.nio.ByteBuffer r7 = r1._encodedByteBuffer     // Catch: java.lang.Throwable -> L14f
                java.nio.ByteBuffer r8 = r0.encodeFrame8Bit(r4, r7)     // Catch: java.lang.Throwable -> L14f
                java.util.ArrayList<java.nio.ByteBuffer> r0 = r1._spsList     // Catch: java.lang.Throwable -> L14f
                r0.clear()     // Catch: java.lang.Throwable -> L14f
                java.util.ArrayList<java.nio.ByteBuffer> r0 = r1._ppsList     // Catch: java.lang.Throwable -> L14f
                r0.clear()     // Catch: java.lang.Throwable -> L14f
                java.nio.ByteBuffer r0 = r1._encodedByteBuffer     // Catch: java.lang.Throwable -> L14f
                java.util.ArrayList<java.nio.ByteBuffer> r4 = r1._spsList     // Catch: java.lang.Throwable -> L14f
                java.util.ArrayList<java.nio.ByteBuffer> r7 = r1._ppsList     // Catch: java.lang.Throwable -> L14f
                org.jcodec.codecs.h264.H264Utils.wipePSinplace(r0, r4, r7)     // Catch: java.lang.Throwable -> L14f
                org.jcodec.codecs.h264.H264Utils.encodeMOVPacket(r8)     // Catch: java.lang.Throwable -> L14f
                java.nio.ByteBuffer r0 = r1._sps     // Catch: java.lang.Throwable -> L14f
                if (r0 != 0) goto L104
                java.util.ArrayList<java.nio.ByteBuffer> r0 = r1._spsList     // Catch: java.lang.Throwable -> L14f
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L14f
                if (r0 == 0) goto L104
                java.util.ArrayList<java.nio.ByteBuffer> r0 = r1._spsList     // Catch: java.lang.Throwable -> L14f
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L14f
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.Throwable -> L14f
                r1._sps = r0     // Catch: java.lang.Throwable -> L14f
            L104:
                java.nio.ByteBuffer r0 = r1._pps     // Catch: java.lang.Throwable -> L14f
                if (r0 != 0) goto L11a
                java.util.ArrayList<java.nio.ByteBuffer> r0 = r1._ppsList     // Catch: java.lang.Throwable -> L14f
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L14f
                if (r0 == 0) goto L11a
                java.util.ArrayList<java.nio.ByteBuffer> r0 = r1._ppsList     // Catch: java.lang.Throwable -> L14f
                java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L14f
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.Throwable -> L14f
                r1._pps = r0     // Catch: java.lang.Throwable -> L14f
            L11a:
                org.jcodec.containers.mp4.muxer.FramesMP4MuxerTrack r0 = r1._outTrack     // Catch: java.io.IOException -> L13d java.lang.Throwable -> L14f
                int r4 = r1._encodedFrameIndex     // Catch: java.io.IOException -> L13d java.lang.Throwable -> L14f
                long r9 = (long) r4     // Catch: java.io.IOException -> L13d java.lang.Throwable -> L14f
                int r4 = r1._fps     // Catch: java.io.IOException -> L13d java.lang.Throwable -> L14f
                long r11 = (long) r4     // Catch: java.io.IOException -> L13d java.lang.Throwable -> L14f
                r13 = 1
                int r4 = r1._encodedFrameIndex     // Catch: java.io.IOException -> L13d java.lang.Throwable -> L14f
                long r6 = (long) r4
                r17 = 0
                r18 = 0
                r19 = 0
                r23 = r3
                long r2 = (long) r4
                r22 = 0
                r15 = r6
                r20 = r2
                org.jcodec.containers.mp4.MP4Packet r2 = org.jcodec.containers.mp4.MP4Packet.createMP4Packet(r8, r9, r11, r13, r15, r17, r18, r19, r20, r22)     // Catch: java.io.IOException -> L13f java.lang.Throwable -> L154
                r0.addFrame(r2)     // Catch: java.io.IOException -> L13f java.lang.Throwable -> L154
                goto L13f
            L13d:
                r23 = r3
            L13f:
                int r0 = r1._encodedFrameIndex     // Catch: java.lang.Throwable -> L154
                int r0 = r0 + r5
                r1._encodedFrameIndex = r0     // Catch: java.lang.Throwable -> L154
                r0 = 0
                r1._rgbaPixels = r0     // Catch: java.lang.Throwable -> L154
                r1._isReadyForMorePixels = r5     // Catch: java.lang.Throwable -> L154
                goto L14c
            L14a:
                r23 = r3
            L14c:
                monitor-exit(r23)     // Catch: java.lang.Throwable -> L154
                goto L2
            L14f:
                r0 = move-exception
                r23 = r3
            L152:
                monitor-exit(r23)     // Catch: java.lang.Throwable -> L154
                throw r0
            L154:
                r0 = move-exception
                goto L152
            L156:
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.String r2 = "JcodecMP4EncodingThread: Disposing."
                r0.println(r2)
                r0 = 0
                r1._transform = r0
                r1._outTrack = r0
                r1._encoder = r0
                r1._mp4Muxer = r0
                r1._pictureRGB = r0
                r1._pictureToEncode = r0
                r1._encodedByteBuffer = r0
                r1._spsList = r0
                r1._ppsList = r0
                r1._rgbaPixels = r0
                r1._lockObject = r0
                return
        }
    }

    public ThreadedMP4JcodecExportLooper(com.badlogic.gdx.scenes.scene2d.Stage r10, org.fortheloss.framework.Assets r11, org.fortheloss.sticknodes.SNShapeRenderer r12, org.fortheloss.sticknodes.data.ProjectData r13, com.badlogic.gdx.graphics.glutils.ShaderProgram r14) {
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
            r9._projectDataRef = r13
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r13 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer
            org.fortheloss.sticknodes.data.ProjectData r2 = r9._projectDataRef
            r6 = 0
            r8 = 0
            r1 = r13
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9._exportRenderer = r13
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
            if (r0 == 0) goto L77
            boolean r0 = r5._cancelRequested
            if (r0 == 0) goto L1b
            r5._cancelRequested = r2
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r5._audioEncodingThread
            r0.cancelAudioEncoding()
            r2 = 3
            goto L77
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
            goto L77
        L37:
            int r1 = r0.size()
            if (r1 <= 0) goto L77
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r1 = r5._audioEncodingThread
            r1.processAudioEvents(r0)
            goto L77
        L43:
            if (r0 != r1) goto L77
            java.lang.String r0 = "statusOldMethod"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.String r1 = "statusExporting5"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "..."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r5._statusString = r0
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r5._audioEncodingThread
            int r2 = r0.isFinishedEncodingAudio()
        L77:
            return r2
    }

    private int videoUpdate() {
            r3 = this;
            int r0 = r3._videoState
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L4b
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r0 = r3._jcodecMP4EncodingThread
            boolean r0 = r0.isReady()
            if (r0 == 0) goto L60
            boolean r0 = r3._cancelRequested
            if (r0 == 0) goto L22
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r3._exportRenderer
            if (r0 == 0) goto L19
            r0.cancel()
        L19:
            r3._cancelRequested = r1
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r0 = r3._jcodecMP4EncodingThread
            r0.cancelEncoding()
            r1 = 3
            goto L60
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
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r0 = r3._jcodecMP4EncodingThread
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r2 = r3._exportRenderer
            byte[] r2 = r2.getPixelsRGBA()
            r0.encodeFrame(r2)
            goto L60
        L43:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r0 = r3._jcodecMP4EncodingThread
            r0.finishEncoding()
            r3._videoState = r2
            goto L60
        L4b:
            if (r0 != r2) goto L60
            boolean r0 = r3._willEncodeAudio
            if (r0 == 0) goto L5f
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r0 = r3._jcodecMP4EncodingThread
            int r1 = r0.isFinishedEncoding()
            if (r1 == 0) goto L60
            org.jcodec.common.io.FileChannelWrapper r0 = r3._fileChannelWrapper
            org.jcodec.common.io.NIOUtils.closeQuietly(r0)
            goto L60
        L5f:
            r1 = 1
        L60:
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
            java.lang.String r2 = "statusOldMethod"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "statusExporting1"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "("
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ") "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "..."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0._statusString = r2
            r0._filename = r1
            r2 = 0
            r0._willEncodeAudio = r2
            r10 = 1
            if (r23 == 0) goto L44
            org.fortheloss.sticknodes.data.ProjectData r3 = r0._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.SoundData> r3 = r3.librarySoundDatas
            int r3 = r3.size()
            if (r3 <= 0) goto L44
            r0._willEncodeAudio = r10
        L44:
            int r3 = r19 % 16
            java.lang.String r4 = "."
            if (r3 == 0) goto L68
            int r3 = r19 / 16
            int r3 = r3 * 16
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Width wasn't divisible by 16, was cropped to "
            r6.append(r7)
            r6.append(r3)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r5.println(r6)
            goto L6a
        L68:
            r3 = r19
        L6a:
            int r5 = r20 % 16
            if (r5 == 0) goto L8c
            int r5 = r20 / 16
            int r5 = r5 * 16
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Height wasn't divisible by 16, was cropped to "
            r7.append(r8)
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.println(r4)
            goto L8e
        L8c:
            r5 = r20
        L8e:
            boolean r4 = r0._willEncodeAudio
            if (r4 == 0) goto La2
            java.lang.String r4 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r1)
            java.lang.String r1 = "_no_audio.mp4"
            goto Lb1
        La2:
            java.lang.String r4 = org.fortheloss.sticknodes.App.exportsPath
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r1)
            java.lang.String r1 = ".mp4"
        Lb1:
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r0._filepath = r1
            r1 = 0
            r0._fileChannelWrapper = r1
            java.io.File r4 = new java.io.File     // Catch: java.io.FileNotFoundException -> Lcb
            java.lang.String r6 = r0._filepath     // Catch: java.io.FileNotFoundException -> Lcb
            r4.<init>(r6)     // Catch: java.io.FileNotFoundException -> Lcb
            org.jcodec.common.io.FileChannelWrapper r4 = org.jcodec.common.io.NIOUtils.writableChannel(r4)     // Catch: java.io.FileNotFoundException -> Lcb
            r0._fileChannelWrapper = r4     // Catch: java.io.FileNotFoundException -> Lcb
            goto Lcd
        Lcb:
            r0._failedToStart = r10
        Lcd:
            org.jcodec.common.io.FileChannelWrapper r4 = r0._fileChannelWrapper
            if (r4 == 0) goto Lda
            org.jcodec.containers.mp4.Brand r6 = org.jcodec.containers.mp4.Brand.MP4     // Catch: java.io.IOException -> Ld8
            org.jcodec.containers.mp4.muxer.MP4Muxer r1 = org.jcodec.containers.mp4.muxer.MP4Muxer.createMP4Muxer(r4, r6)     // Catch: java.io.IOException -> Ld8
            goto Lda
        Ld8:
            r0._failedToStart = r10
        Lda:
            r12 = r1
            boolean r1 = r0._failedToStart
            if (r1 == 0) goto Le0
            return r2
        Le0:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r1 = new org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectDataRef
            int r13 = r2.getActualFPS()
            org.fortheloss.sticknodes.data.ProjectData r2 = r0._projectDataRef
            boolean r2 = r2.isYoutubeShorts
            r11 = r1
            r14 = r3
            r15 = r5
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r0._jcodecMP4EncodingThread = r1
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r1 = r0._exportRenderer
            r9 = 0
            r2 = r3
            r3 = r5
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
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r0 = r2._jcodecMP4EncodingThread
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2._jcodecMP4EncodingThread = r1
        La:
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r2._audioEncodingThread
            if (r0 == 0) goto L13
            r0.dispose()
            r2._audioEncodingThread = r1
        L13:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r2._exportRenderer
            if (r0 == 0) goto L1c
            r0.dispose()
            r2._exportRenderer = r1
        L1c:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer r0 = r2._audioRenderer
            if (r0 == 0) goto L25
            r0.dispose()
            r2._audioRenderer = r1
        L25:
            r2._projectDataRef = r1
            r2._filename = r1
            r2._filepath = r1
            r2._fileChannelWrapper = r1
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
            r13 = this;
            boolean r0 = r13._failedToStart
            r1 = 2
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r13._exportState
            java.lang.String r2 = ") "
            java.lang.String r3 = "("
            java.lang.String r4 = "statusOldMethod"
            r5 = 3
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L5b
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r4)
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r4 = r13._exportRenderer
            java.lang.String r4 = r4.getStatusString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            r8.append(r0)
            r8.append(r2)
            r8.append(r4)
            java.lang.String r0 = r8.toString()
            r13._statusString = r0
            int r0 = r13.videoUpdate()
            if (r0 == r5) goto L4e
            if (r0 != r1) goto L3d
            goto L4e
        L3d:
            if (r0 != r6) goto L4b
            boolean r0 = r13._willEncodeAudio
            if (r0 == 0) goto L47
            r13._exportState = r6
            goto L1c4
        L47:
            r13._exportState = r5
            goto L1c4
        L4b:
            r7 = r0
            goto L1c4
        L4e:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r2 = r13._jcodecMP4EncodingThread
            if (r2 == 0) goto L55
            r2.cancelEncoding()
        L55:
            r13._cancelFailResult = r0
            r13._exportState = r1
            goto L1c4
        L5b:
            r8 = 0
            if (r0 != r6) goto L10f
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r13._audioEncodingThread
            if (r0 != 0) goto Lcb
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r0 = r13._exportRenderer
            int r0 = r0.getStartFrame()
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r9 = r13._exportRenderer
            int r9 = r9.getEndFrame()
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r10 = r13._jcodecMP4EncodingThread
            if (r10 == 0) goto L77
            r10.dispose()
            r13._jcodecMP4EncodingThread = r8
        L77:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.ExportRenderer r10 = r13._exportRenderer
            if (r10 == 0) goto L80
            r10.dispose()
            r13._exportRenderer = r8
        L80:
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer r8 = new org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer
            org.fortheloss.sticknodes.data.ProjectData r10 = r13._projectDataRef
            r8.<init>(r10, r0, r9)
            r13._audioRenderer = r8
            r8.initialize()
            com.badlogic.gdx.Files r8 = com.badlogic.gdx.Gdx.files
            java.lang.String r10 = org.fortheloss.sticknodes.App.tempPath
            com.badlogic.gdx.files.FileHandle r8 = r8.absolute(r10)
            boolean r10 = r8.exists()
            if (r10 == 0) goto L9d
            r8.emptyDirectory()
        L9d:
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r8 = new org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread
            java.lang.String r10 = r13._filename
            org.fortheloss.sticknodes.data.ProjectData r11 = r13._projectDataRef
            int r11 = r11.getActualFPS()
            org.fortheloss.sticknodes.data.ProjectData r12 = r13._projectDataRef
            int r0 = r12.getTotalFrameCount(r0, r9)
            r8.<init>(r10, r11, r0)
            r13._audioEncodingThread = r8
            boolean r0 = r8.isOkay()
            if (r0 != 0) goto Lcb
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r0 = r13._jcodecMP4EncodingThread
            if (r0 == 0) goto Lbf
            r0.cancelEncoding()
        Lbf:
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r13._audioEncodingThread
            if (r0 == 0) goto Lc6
            r0.cancelAudioEncoding()
        Lc6:
            r13._cancelFailResult = r1
            r13._exportState = r1
            return r7
        Lcb:
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r4)
            org.fortheloss.sticknodes.animationscreen.exporters.renderers.AudioRenderer r4 = r13._audioRenderer
            java.lang.String r4 = r4.getStatusString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            r8.append(r0)
            r8.append(r2)
            r8.append(r4)
            java.lang.String r0 = r8.toString()
            r13._statusString = r0
            int r0 = r13.audioUpdate()
            if (r0 == r5) goto Lfb
            if (r0 != r1) goto Lf5
            goto Lfb
        Lf5:
            if (r0 != r6) goto L4b
            r13._exportState = r5
            goto L1c4
        Lfb:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r2 = r13._jcodecMP4EncodingThread
            if (r2 == 0) goto L102
            r2.cancelEncoding()
        L102:
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r2 = r13._audioEncodingThread
            if (r2 == 0) goto L109
            r2.cancelAudioEncoding()
        L109:
            r13._cancelFailResult = r0
            r13._exportState = r1
            goto L1c4
        L10f:
            java.lang.String r9 = "..."
            if (r0 != r1) goto L18c
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r1 = "statusExporting3"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            r4.append(r2)
            r4.append(r1)
            r4.append(r9)
            java.lang.String r0 = r4.toString()
            r13._statusString = r0
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r0 = r13._jcodecMP4EncodingThread
            if (r0 == 0) goto L14d
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L14d
            org.jcodec.common.io.FileChannelWrapper r0 = r13._fileChannelWrapper
            org.jcodec.common.io.NIOUtils.closeQuietly(r0)
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r0 = r13._jcodecMP4EncodingThread
            r0.dispose()
            r13._jcodecMP4EncodingThread = r8
        L14d:
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r13._audioEncodingThread
            if (r0 == 0) goto L15e
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L15e
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r13._audioEncodingThread
            r0.dispose()
            r13._audioEncodingThread = r8
        L15e:
            org.fortheloss.sticknodes.animationscreen.exporters.ThreadedMP4JcodecExportLooper$JcodecMP4EncodingThread r0 = r13._jcodecMP4EncodingThread
            if (r0 != 0) goto L18b
            org.fortheloss.sticknodes.animationscreen.exporters.AudioEncodingThread r0 = r13._audioEncodingThread
            if (r0 != 0) goto L18b
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = r13._filepath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L177
            r0.delete()
        L177:
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.tempPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L188
            r0.emptyDirectory()
        L188:
            int r0 = r13._cancelFailResult
            return r0
        L18b:
            return r7
        L18c:
            if (r0 != r5) goto L1c4
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r1 = "statusExporting4"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            r4.append(r2)
            r4.append(r1)
            r4.append(r9)
            java.lang.String r0 = r4.toString()
            r13._statusString = r0
            com.badlogic.gdx.Files r0 = com.badlogic.gdx.Gdx.files
            java.lang.String r1 = org.fortheloss.sticknodes.App.tempPath
            com.badlogic.gdx.files.FileHandle r0 = r0.absolute(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L1c3
            r0.emptyDirectory()
        L1c3:
            return r6
        L1c4:
            return r7
    }
}
