package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class TrackHeaderBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private long altGroup;
    private long created;
    private long duration;
    private float height;
    private short layer;
    private int[] matrix;
    private long modified;
    private int trackId;
    private float volume;
    private float width;

    public TrackHeaderBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.TrackHeaderBox createTrackHeaderBox(int r3, long r4, float r6, float r7, long r8, long r10, float r12, short r13, long r14, int[] r16) {
            org.jcodec.containers.mp4.boxes.TrackHeaderBox r0 = new org.jcodec.containers.mp4.boxes.TrackHeaderBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r1 = r3
            r0.trackId = r1
            r1 = r4
            r0.duration = r1
            r1 = r6
            r0.width = r1
            r1 = r7
            r0.height = r1
            r1 = r8
            r0.created = r1
            r1 = r10
            r0.modified = r1
            r1 = r12
            r0.volume = r1
            r1 = r13
            r0.layer = r1
            r1 = r14
            r0.altGroup = r1
            r1 = r16
            r0.matrix = r1
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "tkhd"
            return r0
    }

    private void readMatrix(java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = 9
            int[] r1 = new int[r0]
            r4.matrix = r1
            r1 = 0
        L7:
            if (r1 >= r0) goto L14
            int[] r2 = r4.matrix
            int r3 = r5.getInt()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L7
        L14:
            return
    }

    private float readVolume(java.nio.ByteBuffer r5) {
            r4 = this;
            short r5 = r5.getShort()
            double r0 = (double) r5
            r2 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r0 = r0 / r2
            float r5 = (float) r0
            return r5
    }

    private void writeMatrix(java.nio.ByteBuffer r3) {
            r2 = this;
            r0 = 0
        L1:
            r1 = 9
            if (r0 >= r1) goto Lf
            int[] r1 = r2.matrix
            r1 = r1[r0]
            r3.putInt(r1)
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    private void writeVolume(java.nio.ByteBuffer r5) {
            r4 = this;
            float r0 = r4.volume
            double r0 = (double) r0
            r2 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            short r0 = (short) r0
            r5.putShort(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r4) {
            r3 = this;
            super.doWrite(r4)
            long r0 = r3.created
            int r0 = org.jcodec.containers.mp4.TimeUtil.toMovTime(r0)
            r4.putInt(r0)
            long r0 = r3.modified
            int r0 = org.jcodec.containers.mp4.TimeUtil.toMovTime(r0)
            r4.putInt(r0)
            int r0 = r3.trackId
            r4.putInt(r0)
            r0 = 0
            r4.putInt(r0)
            long r1 = r3.duration
            int r2 = (int) r1
            r4.putInt(r2)
            r4.putInt(r0)
            r4.putInt(r0)
            short r1 = r3.layer
            r4.putShort(r1)
            long r1 = r3.altGroup
            int r2 = (int) r1
            short r1 = (short) r2
            r4.putShort(r1)
            r3.writeVolume(r4)
            r4.putShort(r0)
            r3.writeMatrix(r4)
            float r0 = r3.width
            r1 = 1199570944(0x47800000, float:65536.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.putInt(r0)
            float r0 = r3.height
            float r0 = r0 * r1
            int r0 = (int) r0
            r4.putInt(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            super.parse(r3)
            byte r0 = r2.version
            if (r0 != 0) goto L1c
            int r0 = r3.getInt()
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r0)
            r2.created = r0
            int r0 = r3.getInt()
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r0)
            r2.modified = r0
            goto L32
        L1c:
            long r0 = r3.getLong()
            int r1 = (int) r0
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r1)
            r2.created = r0
            long r0 = r3.getLong()
            int r1 = (int) r0
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r1)
            r2.modified = r0
        L32:
            int r0 = r3.getInt()
            r2.trackId = r0
            r3.getInt()
            byte r0 = r2.version
            if (r0 != 0) goto L47
            int r0 = r3.getInt()
            long r0 = (long) r0
            r2.duration = r0
            goto L4d
        L47:
            long r0 = r3.getLong()
            r2.duration = r0
        L4d:
            r3.getInt()
            r3.getInt()
            short r0 = r3.getShort()
            r2.layer = r0
            short r0 = r3.getShort()
            long r0 = (long) r0
            r2.altGroup = r0
            float r0 = r2.readVolume(r3)
            r2.volume = r0
            r3.getShort()
            r2.readMatrix(r3)
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
