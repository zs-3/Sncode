package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class GamaExtension extends org.jcodec.containers.mp4.boxes.Box {
    private float gamma;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "gama"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r3) {
            r2 = this;
            float r0 = r2.gamma
            r1 = 1199570944(0x47800000, float:65536.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r3.putInt(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            int r2 = r2.getInt()
            float r2 = (float) r2
            r0 = 1199570944(0x47800000, float:65536.0)
            float r2 = r2 / r0
            r1.gamma = r2
            return
    }
}
