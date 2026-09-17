package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class ClearApertureBox extends org.jcodec.containers.mp4.boxes.FullBox {
    protected float height;
    protected float width;

    public ClearApertureBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.ClearApertureBox createClearApertureBox(int r3, int r4) {
            org.jcodec.containers.mp4.boxes.ClearApertureBox r0 = new org.jcodec.containers.mp4.boxes.ClearApertureBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = "clef"
            r1.<init>(r2)
            r0.<init>(r1)
            float r3 = (float) r3
            r0.width = r3
            float r3 = (float) r4
            r0.height = r3
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r3) {
            r2 = this;
            super.doWrite(r3)
            float r0 = r2.width
            r1 = 1199570944(0x47800000, float:65536.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r3.putInt(r0)
            float r0 = r2.height
            float r0 = r0 * r1
            int r0 = (int) r0
            r3.putInt(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            super.parse(r3)
            int r0 = r3.getInt()
            float r0 = (float) r0
            r1 = 1199570944(0x47800000, float:65536.0)
            float r0 = r0 / r1
            r2.width = r0
            int r3 = r3.getInt()
            float r3 = (float) r3
            float r3 = r3 / r1
            r2.height = r3
            return
    }
}
