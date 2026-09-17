package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class PixelAspectExt extends org.jcodec.containers.mp4.boxes.Box {
    private int hSpacing;
    private int vSpacing;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "pasp"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r1.hSpacing
            r2.putInt(r0)
            int r0 = r1.vSpacing
            r2.putInt(r0)
            return
    }

    public org.jcodec.common.model.Rational getRational() {
            r3 = this;
            org.jcodec.common.model.Rational r0 = new org.jcodec.common.model.Rational
            int r1 = r3.hSpacing
            int r2 = r3.vSpacing
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r2.getInt()
            r1.hSpacing = r0
            int r2 = r2.getInt()
            r1.vSpacing = r2
            return
    }
}
