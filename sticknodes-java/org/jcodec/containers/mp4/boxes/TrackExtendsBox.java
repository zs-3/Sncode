package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class TrackExtendsBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private int defaultSampleBytes;
    private int defaultSampleDescriptionIndex;
    private int defaultSampleDuration;
    private int defaultSampleFlags;
    private int trackId;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "trex"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            super.doWrite(r2)
            int r0 = r1.trackId
            r2.putInt(r0)
            int r0 = r1.defaultSampleDescriptionIndex
            r2.putInt(r0)
            int r0 = r1.defaultSampleDuration
            r2.putInt(r0)
            int r0 = r1.defaultSampleBytes
            r2.putInt(r0)
            int r0 = r1.defaultSampleFlags
            r2.putInt(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            super.parse(r2)
            int r0 = r2.getInt()
            r1.trackId = r0
            int r0 = r2.getInt()
            r1.defaultSampleDescriptionIndex = r0
            int r0 = r2.getInt()
            r1.defaultSampleDuration = r0
            int r0 = r2.getInt()
            r1.defaultSampleBytes = r0
            int r2 = r2.getInt()
            r1.defaultSampleFlags = r2
            return
    }
}
