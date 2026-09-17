package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class ChunkOffsets64Box extends org.jcodec.containers.mp4.boxes.FullBox {
    private long[] chunkOffsets;

    public ChunkOffsets64Box(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.ChunkOffsets64Box createChunkOffsets64Box(long[] r4) {
            org.jcodec.containers.mp4.boxes.ChunkOffsets64Box r0 = new org.jcodec.containers.mp4.boxes.ChunkOffsets64Box
            java.lang.String r1 = fourcc()
            r2 = 0
            org.jcodec.containers.mp4.boxes.Header r1 = org.jcodec.containers.mp4.boxes.Header.createHeader(r1, r2)
            r0.<init>(r1)
            r0.chunkOffsets = r4
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "co64"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r6) {
            r5 = this;
            super.doWrite(r6)
            long[] r0 = r5.chunkOffsets
            int r0 = r0.length
            r6.putInt(r0)
            long[] r0 = r5.chunkOffsets
            int r1 = r0.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L17
            r3 = r0[r2]
            r6.putLong(r3)
            int r2 = r2 + 1
            goto Ld
        L17:
            return
    }

    public long[] getChunkOffsets() {
            r1 = this;
            long[] r0 = r1.chunkOffsets
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r6) {
            r5 = this;
            super.parse(r6)
            int r0 = r6.getInt()
            long[] r1 = new long[r0]
            r5.chunkOffsets = r1
            r1 = 0
        Lc:
            if (r1 >= r0) goto L19
            long[] r2 = r5.chunkOffsets
            long r3 = r6.getLong()
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lc
        L19:
            return
    }
}
