package org.jcodec.common;

/* loaded from: classes2.dex */
public class JCodecUtil {
    private static final org.jcodec.common.VideoDecoder[] knownDecoders = null;

    static {
            r0 = 3
            org.jcodec.common.VideoDecoder[] r0 = new org.jcodec.common.VideoDecoder[r0]
            org.jcodec.codecs.prores.ProresDecoder r1 = new org.jcodec.codecs.prores.ProresDecoder
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            org.jcodec.codecs.mpeg12.MPEGDecoder r1 = new org.jcodec.codecs.mpeg12.MPEGDecoder
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            org.jcodec.codecs.h264.H264Decoder r1 = new org.jcodec.codecs.h264.H264Decoder
            r1.<init>()
            r2 = 2
            r0[r2] = r1
            org.jcodec.common.JCodecUtil.knownDecoders = r0
            return
    }

    public static byte[] asciiString(java.lang.String r3) {
            char[] r3 = r3.toCharArray()
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L13
            char r2 = r3[r1]
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L13:
            return r0
    }
}
