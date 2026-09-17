package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class TrunBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private int dataOffset;
    private int firstSampleFlags;
    private int[] sampleCompositionOffset;
    private int sampleCount;
    private int[] sampleDuration;
    private int[] sampleFlags;
    private int[] sampleSize;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "trun"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r3) {
            r2 = this;
            super.doWrite(r3)
            int r0 = r2.sampleCount
            r3.putInt(r0)
            boolean r0 = r2.isDataOffsetAvailable()
            if (r0 == 0) goto L13
            int r0 = r2.dataOffset
            r3.putInt(r0)
        L13:
            boolean r0 = r2.isFirstSampleFlagsAvailable()
            if (r0 == 0) goto L1e
            int r0 = r2.firstSampleFlags
            r3.putInt(r0)
        L1e:
            r0 = 0
        L1f:
            int r1 = r2.sampleCount
            if (r0 >= r1) goto L5a
            boolean r1 = r2.isSampleDurationAvailable()
            if (r1 == 0) goto L30
            int[] r1 = r2.sampleDuration
            r1 = r1[r0]
            r3.putInt(r1)
        L30:
            boolean r1 = r2.isSampleSizeAvailable()
            if (r1 == 0) goto L3d
            int[] r1 = r2.sampleSize
            r1 = r1[r0]
            r3.putInt(r1)
        L3d:
            boolean r1 = r2.isSampleFlagsAvailable()
            if (r1 == 0) goto L4a
            int[] r1 = r2.sampleFlags
            r1 = r1[r0]
            r3.putInt(r1)
        L4a:
            boolean r1 = r2.isSampleCompositionOffsetAvailable()
            if (r1 == 0) goto L57
            int[] r1 = r2.sampleCompositionOffset
            r1 = r1[r0]
            r3.putInt(r1)
        L57:
            int r0 = r0 + 1
            goto L1f
        L5a:
            return
    }

    public boolean isDataOffsetAvailable() {
            r2 = this;
            int r0 = r2.flags
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public boolean isFirstSampleFlagsAvailable() {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isSampleCompositionOffsetAvailable() {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isSampleDurationAvailable() {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isSampleFlagsAvailable() {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isSampleSizeAvailable() {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r4) {
            r3 = this;
            super.parse(r4)
            boolean r0 = r3.isSampleFlagsAvailable()
            if (r0 == 0) goto L18
            boolean r0 = r3.isFirstSampleFlagsAvailable()
            if (r0 != 0) goto L10
            goto L18
        L10:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Broken stream"
            r4.<init>(r0)
            throw r4
        L18:
            int r0 = r4.getInt()
            r3.sampleCount = r0
            boolean r0 = r3.isDataOffsetAvailable()
            if (r0 == 0) goto L2a
            int r0 = r4.getInt()
            r3.dataOffset = r0
        L2a:
            boolean r0 = r3.isFirstSampleFlagsAvailable()
            if (r0 == 0) goto L36
            int r0 = r4.getInt()
            r3.firstSampleFlags = r0
        L36:
            boolean r0 = r3.isSampleDurationAvailable()
            if (r0 == 0) goto L42
            int r0 = r3.sampleCount
            int[] r0 = new int[r0]
            r3.sampleDuration = r0
        L42:
            boolean r0 = r3.isSampleSizeAvailable()
            if (r0 == 0) goto L4e
            int r0 = r3.sampleCount
            int[] r0 = new int[r0]
            r3.sampleSize = r0
        L4e:
            boolean r0 = r3.isSampleFlagsAvailable()
            if (r0 == 0) goto L5a
            int r0 = r3.sampleCount
            int[] r0 = new int[r0]
            r3.sampleFlags = r0
        L5a:
            boolean r0 = r3.isSampleCompositionOffsetAvailable()
            if (r0 == 0) goto L66
            int r0 = r3.sampleCount
            int[] r0 = new int[r0]
            r3.sampleCompositionOffset = r0
        L66:
            r0 = 0
        L67:
            int r1 = r3.sampleCount
            if (r0 >= r1) goto La6
            boolean r1 = r3.isSampleDurationAvailable()
            if (r1 == 0) goto L79
            int[] r1 = r3.sampleDuration
            int r2 = r4.getInt()
            r1[r0] = r2
        L79:
            boolean r1 = r3.isSampleSizeAvailable()
            if (r1 == 0) goto L87
            int[] r1 = r3.sampleSize
            int r2 = r4.getInt()
            r1[r0] = r2
        L87:
            boolean r1 = r3.isSampleFlagsAvailable()
            if (r1 == 0) goto L95
            int[] r1 = r3.sampleFlags
            int r2 = r4.getInt()
            r1[r0] = r2
        L95:
            boolean r1 = r3.isSampleCompositionOffsetAvailable()
            if (r1 == 0) goto La3
            int[] r1 = r3.sampleCompositionOffset
            int r2 = r4.getInt()
            r1[r0] = r2
        La3:
            int r0 = r0 + 1
            goto L67
        La6:
            return
    }
}
