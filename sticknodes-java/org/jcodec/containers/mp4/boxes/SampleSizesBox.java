package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class SampleSizesBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private int count;
    private int defaultSize;
    private int[] sizes;

    public SampleSizesBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.SampleSizesBox createSampleSizesBox2(int[] r3) {
            org.jcodec.containers.mp4.boxes.SampleSizesBox r0 = new org.jcodec.containers.mp4.boxes.SampleSizesBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.sizes = r3
            int r3 = r3.length
            r0.count = r3
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "stsz"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r6) {
            r5 = this;
            super.doWrite(r6)
            int r0 = r5.defaultSize
            r6.putInt(r0)
            int r0 = r5.defaultSize
            if (r0 != 0) goto L21
            int r0 = r5.count
            r6.putInt(r0)
            int[] r0 = r5.sizes
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L26
            r3 = r0[r2]
            long r3 = (long) r3
            int r4 = (int) r3
            r6.putInt(r4)
            int r2 = r2 + 1
            goto L15
        L21:
            int r0 = r5.count
            r6.putInt(r0)
        L26:
            return
    }

    public int getCount() {
            r1 = this;
            int r0 = r1.count
            return r0
    }

    public int getDefaultSize() {
            r1 = this;
            int r0 = r1.defaultSize
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r4) {
            r3 = this;
            super.parse(r4)
            int r0 = r4.getInt()
            r3.defaultSize = r0
            int r0 = r4.getInt()
            r3.count = r0
            int r1 = r3.defaultSize
            if (r1 != 0) goto L27
            int[] r0 = new int[r0]
            r3.sizes = r0
            r0 = 0
        L18:
            int r1 = r3.count
            if (r0 >= r1) goto L27
            int[] r1 = r3.sizes
            int r2 = r4.getInt()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L18
        L27:
            return
    }
}
