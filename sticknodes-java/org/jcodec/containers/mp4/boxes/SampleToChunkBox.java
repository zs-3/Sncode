package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class SampleToChunkBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry[] sampleToChunk;

    public static class SampleToChunkEntry {
        private int count;
        private int entry;
        private long first;

        public SampleToChunkEntry(long r1, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.first = r1
                r0.count = r3
                r0.entry = r4
                return
        }

        public int getCount() {
                r1 = this;
                int r0 = r1.count
                return r0
        }

        public int getEntry() {
                r1 = this;
                int r0 = r1.entry
                return r0
        }

        public long getFirst() {
                r2 = this;
                long r0 = r2.first
                return r0
        }
    }

    public SampleToChunkBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.SampleToChunkBox createSampleToChunkBox(org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry[] r3) {
            org.jcodec.containers.mp4.boxes.SampleToChunkBox r0 = new org.jcodec.containers.mp4.boxes.SampleToChunkBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.sampleToChunk = r3
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "stsc"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r7) {
            r6 = this;
            super.doWrite(r7)
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r0 = r6.sampleToChunk
            int r0 = r0.length
            r7.putInt(r0)
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r0 = r6.sampleToChunk
            int r1 = r0.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L2a
            r3 = r0[r2]
            long r4 = r3.getFirst()
            int r5 = (int) r4
            r7.putInt(r5)
            int r4 = r3.getCount()
            r7.putInt(r4)
            int r3 = r3.getEntry()
            r7.putInt(r3)
            int r2 = r2 + 1
            goto Ld
        L2a:
            return
    }

    public org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry[] getSampleToChunk() {
            r1 = this;
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r0 = r1.sampleToChunk
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r9) {
            r8 = this;
            super.parse(r9)
            int r0 = r9.getInt()
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r1 = new org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry[r0]
            r8.sampleToChunk = r1
            r1 = 0
        Lc:
            if (r1 >= r0) goto L27
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r2 = r8.sampleToChunk
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry r3 = new org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry
            int r4 = r9.getInt()
            long r4 = (long) r4
            int r6 = r9.getInt()
            int r7 = r9.getInt()
            r3.<init>(r4, r6, r7)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lc
        L27:
            return
    }
}
