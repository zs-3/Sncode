package org.jcodec.codecs.h264.io.model;

/* loaded from: classes2.dex */
public class NALUnit {
    public int nal_ref_idc;
    public org.jcodec.codecs.h264.io.model.NALUnitType type;

    public NALUnit(org.jcodec.codecs.h264.io.model.NALUnitType r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.nal_ref_idc = r2
            return
    }

    public static org.jcodec.codecs.h264.io.model.NALUnit read(java.nio.ByteBuffer r2) {
            byte r2 = r2.get()
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r2 >> 5
            r0 = r0 & 3
            r2 = r2 & 31
            org.jcodec.codecs.h264.io.model.NALUnitType r2 = org.jcodec.codecs.h264.io.model.NALUnitType.fromValue(r2)
            org.jcodec.codecs.h264.io.model.NALUnit r1 = new org.jcodec.codecs.h264.io.model.NALUnit
            r1.<init>(r2, r0)
            return r1
    }

    public void write(java.nio.ByteBuffer r3) {
            r2 = this;
            org.jcodec.codecs.h264.io.model.NALUnitType r0 = r2.type
            int r0 = r0.getValue()
            int r1 = r2.nal_ref_idc
            int r1 = r1 << 5
            r0 = r0 | r1
            byte r0 = (byte) r0
            r3.put(r0)
            return
    }
}
