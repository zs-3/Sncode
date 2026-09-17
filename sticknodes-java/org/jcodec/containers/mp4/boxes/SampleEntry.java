package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class SampleEntry extends org.jcodec.containers.mp4.boxes.NodeBox {
    protected short drefInd;

    public SampleEntry(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.NodeBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            r0 = 6
            byte[] r0 = new byte[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0} // fill-array
            r2.put(r0)
            short r0 = r1.drefInd
            r2.putShort(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.NodeBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r1) {
            r0 = this;
            r1.getInt()
            r1.getShort()
            short r1 = r1.getShort()
            r0.drefInd = r1
            return
    }

    protected void parseExtensions(java.nio.ByteBuffer r1) {
            r0 = this;
            super.parse(r1)
            return
    }

    protected void writeExtensions(java.nio.ByteBuffer r1) {
            r0 = this;
            super.doWrite(r1)
            return
    }
}
