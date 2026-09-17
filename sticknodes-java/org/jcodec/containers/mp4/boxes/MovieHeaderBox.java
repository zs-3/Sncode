package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class MovieHeaderBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private long created;
    private long duration;
    private int[] matrix;
    private long modified;
    private int nextTrackId;
    private float rate;
    private int timescale;
    private float volume;

    public MovieHeaderBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.MovieHeaderBox createMovieHeaderBox(int r3, long r4, float r6, float r7, long r8, long r10, int[] r12, int r13) {
            org.jcodec.containers.mp4.boxes.MovieHeaderBox r0 = new org.jcodec.containers.mp4.boxes.MovieHeaderBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.timescale = r3
            r0.duration = r4
            r0.rate = r6
            r0.volume = r7
            r0.created = r8
            r0.modified = r10
            r0.matrix = r12
            r0.nextTrackId = r13
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "mvhd"
            return r0
    }

    private int[] readMatrix(java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = 9
            int[] r1 = new int[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto L10
            int r3 = r5.getInt()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L5
        L10:
            return r1
    }

    private float readRate(java.nio.ByteBuffer r2) {
            r1 = this;
            int r2 = r2.getInt()
            float r2 = (float) r2
            r0 = 1199570944(0x47800000, float:65536.0)
            float r2 = r2 / r0
            return r2
    }

    private float readVolume(java.nio.ByteBuffer r2) {
            r1 = this;
            short r2 = r2.getShort()
            float r2 = (float) r2
            r0 = 1132462080(0x43800000, float:256.0)
            float r2 = r2 / r0
            return r2
    }

    private void writeFixed1616(java.nio.ByteBuffer r5, float r6) {
            r4 = this;
            double r0 = (double) r6
            r2 = 4679240012837945344(0x40f0000000000000, double:65536.0)
            double r0 = r0 * r2
            int r6 = (int) r0
            r5.putInt(r6)
            return
    }

    private void writeFixed88(java.nio.ByteBuffer r5, float r6) {
            r4 = this;
            double r0 = (double) r6
            r2 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r0 = r0 * r2
            int r6 = (int) r0
            short r6 = (short) r6
            r5.putShort(r6)
            return
    }

    private void writeMatrix(java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            int[] r2 = r4.matrix
            int r2 = r2.length
            r3 = 9
            int r2 = java.lang.Math.min(r3, r2)
            if (r1 >= r2) goto L17
            int[] r2 = r4.matrix
            r2 = r2[r1]
            r5.putInt(r2)
            int r1 = r1 + 1
            goto L2
        L17:
            int[] r1 = r4.matrix
            int r1 = r1.length
            int r1 = java.lang.Math.min(r3, r1)
        L1e:
            if (r1 >= r3) goto L26
            r5.putInt(r0)
            int r1 = r1 + 1
            goto L1e
        L26:
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r3) {
            r2 = this;
            super.doWrite(r3)
            long r0 = r2.created
            int r0 = org.jcodec.containers.mp4.TimeUtil.toMovTime(r0)
            r3.putInt(r0)
            long r0 = r2.modified
            int r0 = org.jcodec.containers.mp4.TimeUtil.toMovTime(r0)
            r3.putInt(r0)
            int r0 = r2.timescale
            r3.putInt(r0)
            long r0 = r2.duration
            int r1 = (int) r0
            r3.putInt(r1)
            float r0 = r2.rate
            r2.writeFixed1616(r3, r0)
            float r0 = r2.volume
            r2.writeFixed88(r3, r0)
            r0 = 10
            byte[] r0 = new byte[r0]
            r3.put(r0)
            r2.writeMatrix(r3)
            r0 = 24
            byte[] r0 = new byte[r0]
            r3.put(r0)
            int r0 = r2.nextTrackId
            r3.putInt(r0)
            return
    }

    public int getTimescale() {
            r1 = this;
            int r0 = r1.timescale
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            super.parse(r3)
            byte r0 = r2.version
            if (r0 != 0) goto L29
            int r0 = r3.getInt()
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r0)
            r2.created = r0
            int r0 = r3.getInt()
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r0)
            r2.modified = r0
            int r0 = r3.getInt()
            r2.timescale = r0
            int r0 = r3.getInt()
            long r0 = (long) r0
            r2.duration = r0
            goto L4e
        L29:
            r1 = 1
            if (r0 != r1) goto L71
            long r0 = r3.getLong()
            int r1 = (int) r0
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r1)
            r2.created = r0
            long r0 = r3.getLong()
            int r1 = (int) r0
            long r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r1)
            r2.modified = r0
            int r0 = r3.getInt()
            r2.timescale = r0
            long r0 = r3.getLong()
            r2.duration = r0
        L4e:
            float r0 = r2.readRate(r3)
            r2.rate = r0
            float r0 = r2.readVolume(r3)
            r2.volume = r0
            r0 = 10
            org.jcodec.common.io.NIOUtils.skip(r3, r0)
            int[] r0 = r2.readMatrix(r3)
            r2.matrix = r0
            r0 = 24
            org.jcodec.common.io.NIOUtils.skip(r3, r0)
            int r3 = r3.getInt()
            r2.nextTrackId = r3
            return
        L71:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Unsupported version"
            r3.<init>(r0)
            throw r3
    }
}
