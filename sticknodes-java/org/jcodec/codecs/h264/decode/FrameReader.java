package org.jcodec.codecs.h264.decode;

/* loaded from: classes2.dex */
public class FrameReader {
    private org.jcodec.common.IntObjectMap<org.jcodec.codecs.h264.io.model.PictureParameterSet> pps;
    private org.jcodec.common.IntObjectMap<org.jcodec.codecs.h264.io.model.SeqParameterSet> sps;

    public FrameReader() {
            r1 = this;
            r1.<init>()
            org.jcodec.common.IntObjectMap r0 = new org.jcodec.common.IntObjectMap
            r0.<init>()
            r1.sps = r0
            org.jcodec.common.IntObjectMap r0 = new org.jcodec.common.IntObjectMap
            r0.<init>()
            r1.pps = r0
            return
    }
}
