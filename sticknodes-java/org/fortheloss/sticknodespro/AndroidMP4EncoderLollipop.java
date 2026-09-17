package org.fortheloss.sticknodespro;

@android.annotation.TargetApi(21)
/* loaded from: classes2.dex */
public class AndroidMP4EncoderLollipop implements org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder {
    private android.media.MediaCodec.BufferInfo _bufferInfo;
    private java.lang.String _codecName;
    private int _colorFormat;
    private int _currentFrameIndex;
    private boolean _debugRecordedNullImage;
    private int _frameRate;
    private int _height;
    private boolean _isVertical;
    private android.media.MediaCodec _mediaCodec;
    private android.media.MediaMuxer _mediaMuxer;
    private int _trackIndex;
    private byte[] _u;
    private byte[] _v;
    private int _width;
    private byte[] _y;

    public AndroidMP4EncoderLollipop(int r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._width = r0
            r1._height = r0
            r1._frameRate = r0
            r1._trackIndex = r0
            r1._currentFrameIndex = r0
            r1._debugRecordedNullImage = r0
            r1._isVertical = r0
            r1._colorFormat = r2
            r1._codecName = r3
            return
    }

    private int clamp(int r2) {
            r1 = this;
            r0 = 255(0xff, float:3.57E-43)
            if (r2 >= 0) goto L6
            r2 = 0
            goto La
        L6:
            if (r2 <= r0) goto La
            r2 = 255(0xff, float:3.57E-43)
        La:
            return r2
    }

    private long computePresentationTime(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            int r5 = r4._frameRate
            long r2 = (long) r5
            long r0 = r0 / r2
            return r0
    }

    private void drainEncoder(boolean r9) {
            r8 = this;
        L0:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Start drainEncoder() loop."
            r0.println(r1)
            android.media.MediaCodec r0 = r8._mediaCodec
            android.media.MediaCodec$BufferInfo r1 = r8._bufferInfo
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = r0.dequeueOutputBuffer(r1, r2)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Encoder status is "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            r1 = -1
            if (r0 != r1) goto L3b
            if (r9 != 0) goto L33
            goto L183
        L33:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Waiting for more output."
            r0.println(r1)
            goto L0
        L3b:
            r1 = -2
            if (r0 != r1) goto L6b
            android.media.MediaCodec r0 = r8._mediaCodec
            android.media.MediaFormat r0 = r0.getOutputFormat()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Starting MediaMuxer object with new format "
            r2.append(r4)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            android.media.MediaMuxer r1 = r8._mediaMuxer
            int r0 = r1.addTrack(r0)
            r8._trackIndex = r0
            android.media.MediaMuxer r0 = r8._mediaMuxer
            r0.start()
            goto L0
        L6b:
            if (r0 >= 0) goto L88
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unexpected result from MediaCodec.dequeOutputBuffer(), "
            r2.append(r4)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            goto L0
        L88:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "1"
            r1.println(r2)
            android.media.MediaCodec r1 = r8._mediaCodec
            java.nio.ByteBuffer r1 = r1.getOutputBuffer(r0)
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "2"
            r2.println(r3)
            if (r1 != 0) goto Lbb
            java.io.PrintStream r9 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed, encoder outputbuffer "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " was null."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            goto L183
        Lbb:
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "3"
            r2.println(r3)
            android.media.MediaCodec$BufferInfo r2 = r8._bufferInfo
            int r2 = r2.flags
            r2 = r2 & 2
            r3 = 0
            if (r2 == 0) goto Ld6
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r4 = "Ignoring BUFFER_FLAG_CODEC_CONFIG flag."
            r2.println(r4)
            android.media.MediaCodec$BufferInfo r2 = r8._bufferInfo
            r2.size = r3
        Ld6:
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r4 = "4"
            r2.println(r4)
            android.media.MediaCodec$BufferInfo r2 = r8._bufferInfo
            int r4 = r2.size
            if (r4 == 0) goto L161
            int r2 = r2.offset
            r1.position(r2)
            android.media.MediaCodec$BufferInfo r2 = r8._bufferInfo
            int r4 = r2.offset
            int r2 = r2.size
            int r4 = r4 + r2
            r1.limit(r4)
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r4 = "4.1"
            r2.println(r4)
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r8._trackIndex
            r4.append(r5)
            java.lang.String r5 = ", "
            r4.append(r5)
            r4.append(r1)
            r4.append(r5)
            android.media.MediaCodec$BufferInfo r6 = r8._bufferInfo
            int r6 = r6.offset
            r4.append(r6)
            r4.append(r5)
            android.media.MediaCodec$BufferInfo r6 = r8._bufferInfo
            long r6 = r6.presentationTimeUs
            r4.append(r6)
            r4.append(r5)
            android.media.MediaCodec$BufferInfo r5 = r8._bufferInfo
            int r5 = r5.size
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.println(r4)
            android.media.MediaMuxer r2 = r8._mediaMuxer
            int r4 = r8._trackIndex
            android.media.MediaCodec$BufferInfo r5 = r8._bufferInfo
            r2.writeSampleData(r4, r1, r5)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "4.2"
            r1.println(r2)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Sent "
            r2.append(r4)
            android.media.MediaCodec$BufferInfo r4 = r8._bufferInfo
            int r4 = r4.size
            r2.append(r4)
            java.lang.String r4 = " bytes to the MediaMuxer object."
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
        L161:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "5"
            r1.println(r2)
            android.media.MediaCodec r1 = r8._mediaCodec
            r1.releaseOutputBuffer(r0, r3)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "6"
            r0.println(r1)
            android.media.MediaCodec$BufferInfo r0 = r8._bufferInfo
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L0
            java.io.PrintStream r9 = java.lang.System.out
            java.lang.String r0 = "EOS flag reached."
            r9.println(r0)
        L183:
            return
    }

    private void populateYUVPlanesPlanar(byte[] r14, byte[] r15, byte[] r16, byte[] r17) {
            r13 = this;
            r0 = r13
            boolean r1 = r0._isVertical
            if (r1 == 0) goto L8
            int r2 = r0._height
            goto La
        L8:
            int r2 = r0._width
        La:
            if (r1 == 0) goto Lf
            int r1 = r0._width
            goto L11
        Lf:
            int r1 = r0._height
        L11:
            int r1 = r1 + (-1)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L17:
            if (r1 < 0) goto L85
            r7 = 0
        L1a:
            if (r7 >= r2) goto L82
            int r8 = r1 * r2
            int r8 = r8 + r7
            int r8 = r8 * 4
            r9 = r14[r8]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r10 = r8 + 1
            r10 = r14[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r8 = r8 + 2
            r8 = r14[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r11 = r9 * 66
            int r12 = r10 * 129
            int r11 = r11 + r12
            int r12 = r8 * 25
            int r11 = r11 + r12
            int r11 = r11 + 128
            int r11 = r11 >> 8
            int r11 = r11 + 16
            int r12 = r4 + 1
            int r11 = r13.clamp(r11)
            byte r11 = (byte) r11
            r15[r4] = r11
            int r4 = r1 % 2
            if (r4 != 0) goto L7c
            int r4 = r5 % 2
            if (r4 != 0) goto L7c
            int r4 = r9 * (-38)
            int r11 = r10 * 74
            int r4 = r4 - r11
            int r11 = r8 * 112
            int r4 = r4 + r11
            int r4 = r4 + 128
            int r4 = r4 >> 8
            int r4 = r4 + 128
            int r4 = r13.clamp(r4)
            byte r4 = (byte) r4
            r16[r6] = r4
            int r9 = r9 * 112
            int r10 = r10 * 94
            int r9 = r9 - r10
            int r8 = r8 * 18
            int r9 = r9 - r8
            int r9 = r9 + 128
            int r4 = r9 >> 8
            int r4 = r4 + 128
            int r4 = r13.clamp(r4)
            byte r4 = (byte) r4
            r17[r6] = r4
            int r6 = r6 + 1
        L7c:
            int r5 = r5 + 1
            int r7 = r7 + 1
            r4 = r12
            goto L1a
        L82:
            int r1 = r1 + (-1)
            goto L17
        L85:
            return
    }

    private void populateYUVPlanesSemiPlanar(byte[] r15, byte[] r16, byte[] r17, int r18) {
            r14 = this;
            r0 = r14
            r1 = r17
            boolean r2 = r0._isVertical
            if (r2 == 0) goto La
            int r3 = r0._height
            goto Lc
        La:
            int r3 = r0._width
        Lc:
            if (r2 == 0) goto L11
            int r2 = r0._width
            goto L13
        L11:
            int r2 = r0._height
        L13:
            int r2 = r2 + (-1)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L19:
            if (r2 < 0) goto L8c
            r8 = 0
        L1c:
            if (r8 >= r3) goto L89
            int r9 = r2 * r3
            int r9 = r9 + r8
            int r9 = r9 * 4
            r10 = r15[r9]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r11 = r9 + 1
            r11 = r15[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r9 = r9 + 2
            r9 = r15[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r12 = r10 * 66
            int r13 = r11 * 129
            int r12 = r12 + r13
            int r13 = r9 * 25
            int r12 = r12 + r13
            int r12 = r12 + 128
            int r12 = r12 >> 8
            int r12 = r12 + 16
            int r13 = r5 + 1
            int r12 = r14.clamp(r12)
            byte r12 = (byte) r12
            r16[r5] = r12
            int r5 = r2 % 2
            if (r5 != 0) goto L83
            int r5 = r6 % 2
            if (r5 != 0) goto L83
            int r5 = r10 * (-38)
            int r12 = r11 * 74
            int r5 = r5 - r12
            int r12 = r9 * 112
            int r5 = r5 + r12
            int r5 = r5 + 128
            int r5 = r5 >> 8
            int r5 = r5 + 128
            int r5 = r14.clamp(r5)
            byte r5 = (byte) r5
            r1[r7] = r5
            int r5 = r7 + 1
            int r12 = r1.length
            if (r5 >= r12) goto L81
            int r10 = r10 * 112
            int r11 = r11 * 94
            int r10 = r10 - r11
            int r9 = r9 * 18
            int r10 = r10 - r9
            int r10 = r10 + 128
            int r9 = r10 >> 8
            int r9 = r9 + 128
            int r9 = r14.clamp(r9)
            byte r9 = (byte) r9
            r1[r5] = r9
        L81:
            int r7 = r7 + r18
        L83:
            int r6 = r6 + 1
            int r8 = r8 + 1
            r5 = r13
            goto L1c
        L89:
            int r2 = r2 + (-1)
            goto L19
        L8c:
            return
    }

    private void releaseEncoder() {
            r2 = this;
            android.media.MediaCodec r0 = r2._mediaCodec
            r1 = 0
            if (r0 == 0) goto Lf
            r0.stop()
            android.media.MediaCodec r0 = r2._mediaCodec
            r0.release()
            r2._mediaCodec = r1
        Lf:
            android.media.MediaMuxer r0 = r2._mediaMuxer
            if (r0 == 0) goto L18
            r0.release()
            r2._mediaMuxer = r1
        L18:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder
    public boolean beginEncoding(java.io.File r7, int r8, int r9, int r10, boolean r11) {
            r6 = this;
            java.lang.String r0 = "android native mp4 export"
            java.lang.String r1 = "error"
            r6._isVertical = r11
            if (r11 == 0) goto Lb
            r2 = r9
            r11 = r10
            goto Ld
        Lb:
            r11 = r9
            r2 = r10
        Ld:
            java.lang.String r3 = "video/avc"
            android.media.MediaFormat r3 = android.media.MediaFormat.createVideoFormat(r3, r11, r2)
            r4 = 6000000(0x5b8d80, float:8.407791E-39)
            java.lang.String r5 = "bitrate"
            r3.setInteger(r5, r4)
            java.lang.String r4 = "frame-rate"
            r3.setInteger(r4, r8)
            r4 = 2135033992(0x7f420888, float:2.5791453E38)
            java.lang.String r5 = "color-format"
            r3.setInteger(r5, r4)
            java.lang.String r4 = "i-frame-interval"
            r5 = 1
            r3.setInteger(r4, r5)
            java.lang.String r4 = "max-width"
            r3.setInteger(r4, r11)
            java.lang.String r4 = "max-height"
            r3.setInteger(r4, r2)
            int r11 = r11 * r2
            java.lang.String r2 = "max-input-size"
            r3.setInteger(r2, r11)
            r11 = 0
            java.lang.String r2 = r6._codecName     // Catch: java.lang.Exception -> L96
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r2)     // Catch: java.lang.Exception -> L96
            r6._mediaCodec = r2     // Catch: java.lang.Exception -> L96
            r4 = 0
            r2.configure(r3, r4, r4, r5)
            android.media.MediaCodec r2 = r6._mediaCodec
            r2.start()
            r6._width = r9
            r6._height = r10
            r6._frameRate = r8
            android.media.MediaCodec$BufferInfo r8 = new android.media.MediaCodec$BufferInfo
            r8.<init>()
            r6._bufferInfo = r8
            android.media.MediaMuxer r8 = new android.media.MediaMuxer     // Catch: java.lang.Exception -> L6a
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Exception -> L6a
            r8.<init>(r7, r11)     // Catch: java.lang.Exception -> L6a
            r6._mediaMuxer = r8     // Catch: java.lang.Exception -> L6a
            return r5
        L6a:
            r7 = move-exception
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform
            r8.logNonFatalException(r7)
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Couldn't create MediaMuxer object, failure. "
            r9.append(r10)
            java.lang.String r7 = r7.getMessage()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.println(r7)
            org.fortheloss.framework.IPlatform r7 = org.fortheloss.sticknodes.App.platform
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7.analyticsSendValue(r1, r0, r8)
            return r11
        L96:
            r7 = move-exception
            org.fortheloss.framework.IPlatform r8 = org.fortheloss.sticknodes.App.platform
            r8.logNonFatalException(r7)
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Couldn't create the MediaCodec object, failure. "
            r9.append(r10)
            java.lang.String r7 = r7.getMessage()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.println(r7)
            org.fortheloss.framework.IPlatform r7 = org.fortheloss.sticknodes.App.platform
            r8 = 4613937818241073152(0x4008000000000000, double:3.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7.analyticsSendValue(r1, r0, r8)
            return r11
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r1.releaseEncoder()
            r0 = 0
            r1._mediaCodec = r0
            r1._codecName = r0
            r1._bufferInfo = r0
            r1._mediaMuxer = r0
            r1._y = r0
            r1._u = r0
            r1._v = r0
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder
    public boolean finishEncoding() {
            r1 = this;
            r0 = 0
            r1.passPixels(r0)
            r1.releaseEncoder()
            r0 = 1
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder
    public void passPixels(byte[] r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r0._currentFrameIndex
            int r3 = r2 + 1
            r0._currentFrameIndex = r3
            long r8 = r0.computePresentationTime(r2)
            android.media.MediaCodec r2 = r0._mediaCodec
            r3 = -1
            int r5 = r2.dequeueInputBuffer(r3)
            if (r5 < 0) goto L13e
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2d
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.String r6 = "EOS flag queued."
            r4.println(r6)
            android.media.MediaCodec r4 = r0._mediaCodec
            r6 = 0
            r7 = 0
            r10 = 4
            r4.queueInputBuffer(r5, r6, r7, r8, r10)
            goto L135
        L2d:
            android.media.MediaCodec r4 = r0._mediaCodec
            java.nio.ByteBuffer r4 = r4.getInputBuffer(r5)
            int r7 = r4.remaining()
            android.media.MediaCodec r6 = r0._mediaCodec
            android.media.Image r6 = r6.getInputImage(r5)
            if (r6 != 0) goto L75
            boolean r1 = r0._debugRecordedNullImage
            if (r1 != 0) goto L6d
            r0._debugRecordedNullImage = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", buffer limit: "
            r1.append(r2)
            int r2 = r4.limit()
            r1.append(r2)
            android.media.MediaCodec r1 = r0._mediaCodec
            r1.getName()
            android.media.MediaCodec r1 = r0._mediaCodec
            android.media.MediaCodecInfo r1 = r1.getCodecInfo()
            r1.getName()
            org.fortheloss.framework.IPlatform r1 = org.fortheloss.sticknodes.App.platform
            java.lang.String r2 = "error"
            java.lang.String r3 = "android native mp4 export - getInputImage() is null (Lollipop)"
            r1.analyticsSendEvent(r2, r3)
        L6d:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "Couldn't get input image."
            r1.println(r2)
            return
        L75:
            android.media.Image$Plane[] r4 = r6.getPlanes()
            r6 = r4[r2]
            java.nio.ByteBuffer r6 = r6.getBuffer()
            r10 = r4[r3]
            java.nio.ByteBuffer r10 = r10.getBuffer()
            r11 = 2
            r11 = r4[r11]
            java.nio.ByteBuffer r11 = r11.getBuffer()
            r4 = r4[r3]
            int r4 = r4.getPixelStride()
            boolean r12 = r0._isVertical
            if (r12 == 0) goto Ld1
            int r12 = r1.length
            byte[] r12 = new byte[r12]
            r13 = 0
            r14 = 0
        L9b:
            int r15 = r0._width
            if (r13 >= r15) goto Ld2
            int r15 = r0._height
            int r15 = r15 - r3
        La2:
            if (r15 < 0) goto Lcd
            int r2 = r0._width
            int r2 = r2 * r15
            int r2 = r2 + r13
            int r2 = r2 * 4
            int r16 = r14 + 1
            r17 = r1[r2]
            r12[r14] = r17
            int r14 = r16 + 1
            int r17 = r2 + 1
            r17 = r1[r17]
            r12[r16] = r17
            int r16 = r14 + 1
            int r17 = r2 + 2
            r17 = r1[r17]
            r12[r14] = r17
            int r14 = r16 + 1
            int r2 = r2 + 3
            r2 = r1[r2]
            r12[r16] = r2
            int r15 = r15 + (-1)
            r2 = 0
            goto La2
        Lcd:
            int r13 = r13 + 1
            r2 = 0
            goto L9b
        Ld1:
            r12 = r1
        Ld2:
            if (r4 != r3) goto L109
            byte[] r2 = r0._y
            if (r2 != 0) goto Lf0
            int r2 = r6.limit()
            byte[] r2 = new byte[r2]
            r0._y = r2
            int r2 = r10.limit()
            byte[] r2 = new byte[r2]
            r0._u = r2
            int r2 = r11.limit()
            byte[] r2 = new byte[r2]
            r0._v = r2
        Lf0:
            byte[] r2 = r0._y
            byte[] r4 = r0._u
            byte[] r13 = r0._v
            r0.populateYUVPlanesPlanar(r12, r2, r4, r13)
            byte[] r2 = r0._y
            r6.put(r2)
            byte[] r2 = r0._u
            r10.put(r2)
            byte[] r2 = r0._v
            r11.put(r2)
            goto L12e
        L109:
            byte[] r2 = r0._y
            if (r2 != 0) goto L11d
            int r2 = r6.limit()
            byte[] r2 = new byte[r2]
            r0._y = r2
            int r2 = r10.limit()
            byte[] r2 = new byte[r2]
            r0._u = r2
        L11d:
            byte[] r2 = r0._y
            byte[] r11 = r0._u
            r0.populateYUVPlanesSemiPlanar(r12, r2, r11, r4)
            byte[] r2 = r0._y
            r6.put(r2)
            byte[] r2 = r0._u
            r10.put(r2)
        L12e:
            android.media.MediaCodec r4 = r0._mediaCodec
            r6 = 0
            r10 = 0
            r4.queueInputBuffer(r5, r6, r7, r8, r10)
        L135:
            if (r1 != 0) goto L139
            r2 = 1
            goto L13a
        L139:
            r2 = 0
        L13a:
            r0.drainEncoder(r2)
            return
        L13e:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "Couldn't get input buffer."
            r1.println(r2)
            return
    }
}
