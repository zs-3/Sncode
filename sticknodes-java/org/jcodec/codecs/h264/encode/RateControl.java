package org.jcodec.codecs.h264.encode;

/* loaded from: classes2.dex */
public interface RateControl {
    boolean accept(int r1);

    int getInitQp(org.jcodec.codecs.h264.io.model.SliceType r1);

    int getQpDelta();

    void reset();
}
