package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class SoundMediaHeaderBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private short balance;

    public SoundMediaHeaderBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.SoundMediaHeaderBox createSoundMediaHeaderBox() {
            org.jcodec.containers.mp4.boxes.SoundMediaHeaderBox r0 = new org.jcodec.containers.mp4.boxes.SoundMediaHeaderBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "smhd"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            super.doWrite(r2)
            short r0 = r1.balance
            r2.putShort(r0)
            r0 = 0
            r2.putShort(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            super.parse(r2)
            short r0 = r2.getShort()
            r1.balance = r0
            r2.getShort()
            return
    }
}
