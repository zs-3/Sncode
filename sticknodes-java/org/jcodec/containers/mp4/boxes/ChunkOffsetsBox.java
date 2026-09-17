package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class ChunkOffsetsBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private long[] chunkOffsets;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "stco"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r6) {
            r5 = this;
            super.doWrite(r6)
            long[] r0 = r5.chunkOffsets
            int r0 = r0.length
            r6.putInt(r0)
            long[] r0 = r5.chunkOffsets
            int r1 = r0.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            int r4 = (int) r3
            r6.putInt(r4)
            int r2 = r2 + 1
            goto Ld
        L18:
            return
    }

    public long[] getChunkOffsets() {
            r1 = this;
            long[] r0 = r1.chunkOffsets
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r8) {
            r7 = this;
            super.parse(r8)
            int r0 = r8.getInt()
            long[] r1 = new long[r0]
            r7.chunkOffsets = r1
            r1 = 0
        Lc:
            if (r1 >= r0) goto L20
            long[] r2 = r7.chunkOffsets
            int r3 = r8.getInt()
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lc
        L20:
            return
    }
}
