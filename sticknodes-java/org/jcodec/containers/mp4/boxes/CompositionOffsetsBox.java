package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class CompositionOffsetsBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry[] entries;

    public static class Entry {
        public int count;
        public int offset;

        public Entry(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.count = r1
                r0.offset = r2
                return
        }

        public int getOffset() {
                r1 = this;
                int r0 = r1.offset
                return r0
        }
    }

    public CompositionOffsetsBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.CompositionOffsetsBox createCompositionOffsetsBox(org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry[] r3) {
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox r0 = new org.jcodec.containers.mp4.boxes.CompositionOffsetsBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.entries = r3
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "ctts"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r4) {
            r3 = this;
            super.doWrite(r4)
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry[] r0 = r3.entries
            int r0 = r0.length
            r4.putInt(r0)
            r0 = 0
        La:
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry[] r1 = r3.entries
            int r2 = r1.length
            if (r0 >= r2) goto L22
            r1 = r1[r0]
            int r1 = r1.count
            r4.putInt(r1)
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry[] r1 = r3.entries
            r1 = r1[r0]
            int r1 = r1.offset
            r4.putInt(r1)
            int r0 = r0 + 1
            goto La
        L22:
            return
    }

    public org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry[] getEntries() {
            r1 = this;
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry[] r0 = r1.entries
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r7) {
            r6 = this;
            super.parse(r7)
            int r0 = r7.getInt()
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry[] r1 = new org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry[r0]
            r6.entries = r1
            r1 = 0
        Lc:
            if (r1 >= r0) goto L22
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry[] r2 = r6.entries
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry r3 = new org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry
            int r4 = r7.getInt()
            int r5 = r7.getInt()
            r3.<init>(r4, r5)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lc
        L22:
            return
    }
}
