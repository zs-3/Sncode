package org.jcodec.codecs.h264.encode;

/* loaded from: classes2.dex */
public class EncodedMB {
    private int[] mx;
    private int[] my;
    private int[] nc;
    private org.jcodec.common.model.Picture8Bit pixels;
    private int qp;
    private org.jcodec.codecs.h264.io.model.MBType type;

    public EncodedMB() {
            r2 = this;
            r2.<init>()
            org.jcodec.common.model.ColorSpace r0 = org.jcodec.common.model.ColorSpace.YUV420J
            r1 = 16
            org.jcodec.common.model.Picture8Bit r0 = org.jcodec.common.model.Picture8Bit.create(r1, r1, r0)
            r2.pixels = r0
            int[] r0 = new int[r1]
            r2.nc = r0
            int[] r0 = new int[r1]
            r2.mx = r0
            int[] r0 = new int[r1]
            r2.my = r0
            return
    }

    public int[] getMx() {
            r1 = this;
            int[] r0 = r1.mx
            return r0
    }

    public int[] getMy() {
            r1 = this;
            int[] r0 = r1.my
            return r0
    }

    public int[] getNc() {
            r1 = this;
            int[] r0 = r1.nc
            return r0
    }

    public org.jcodec.common.model.Picture8Bit getPixels() {
            r1 = this;
            org.jcodec.common.model.Picture8Bit r0 = r1.pixels
            return r0
    }

    public int getQp() {
            r1 = this;
            int r0 = r1.qp
            return r0
    }

    public org.jcodec.codecs.h264.io.model.MBType getType() {
            r1 = this;
            org.jcodec.codecs.h264.io.model.MBType r0 = r1.type
            return r0
    }

    public void setQp(int r1) {
            r0 = this;
            r0.qp = r1
            return
    }

    public void setType(org.jcodec.codecs.h264.io.model.MBType r1) {
            r0 = this;
            r0.type = r1
            return
    }
}
