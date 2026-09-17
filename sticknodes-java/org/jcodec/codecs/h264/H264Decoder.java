package org.jcodec.codecs.h264;

/* loaded from: classes2.dex */
public class H264Decoder extends org.jcodec.common.VideoDecoder {
    private java.util.List<java.lang.Object> pictureBuffer;
    private org.jcodec.codecs.h264.POCManager poc;
    private org.jcodec.codecs.h264.decode.FrameReader reader;
    private boolean threaded;
    private java.util.concurrent.ExecutorService tp;


    public H264Decoder() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.pictureBuffer = r0
            org.jcodec.codecs.h264.POCManager r0 = new org.jcodec.codecs.h264.POCManager
            r0.<init>()
            r2.poc = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            r1 = 1
            if (r0 <= r1) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r2.threaded = r1
            if (r1 == 0) goto L35
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            org.jcodec.codecs.h264.H264Decoder$1 r1 = new org.jcodec.codecs.h264.H264Decoder$1
            r1.<init>(r2)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0, r1)
            r2.tp = r0
        L35:
            org.jcodec.codecs.h264.decode.FrameReader r0 = new org.jcodec.codecs.h264.decode.FrameReader
            r0.<init>()
            r2.reader = r0
            return
    }
}
