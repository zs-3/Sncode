package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class TrackFragmentHeaderBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private long baseDataOffset;
    private int defaultSampleDuration;
    private int defaultSampleFlags;
    private int defaultSampleSize;
    private int sampleDescriptionIndex;
    private int trackId;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "tfhd"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r3) {
            r2 = this;
            super.doWrite(r3)
            int r0 = r2.trackId
            r3.putInt(r0)
            boolean r0 = r2.isBaseDataOffsetAvailable()
            if (r0 == 0) goto L13
            long r0 = r2.baseDataOffset
            r3.putLong(r0)
        L13:
            boolean r0 = r2.isSampleDescriptionIndexAvailable()
            if (r0 == 0) goto L1e
            int r0 = r2.sampleDescriptionIndex
            r3.putInt(r0)
        L1e:
            boolean r0 = r2.isDefaultSampleDurationAvailable()
            if (r0 == 0) goto L29
            int r0 = r2.defaultSampleDuration
            r3.putInt(r0)
        L29:
            boolean r0 = r2.isDefaultSampleSizeAvailable()
            if (r0 == 0) goto L34
            int r0 = r2.defaultSampleSize
            r3.putInt(r0)
        L34:
            boolean r0 = r2.isDefaultSampleFlagsAvailable()
            if (r0 == 0) goto L3f
            int r0 = r2.defaultSampleFlags
            r3.putInt(r0)
        L3f:
            return
    }

    public boolean isBaseDataOffsetAvailable() {
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

    public boolean isDefaultSampleDurationAvailable() {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & 8
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isDefaultSampleFlagsAvailable() {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & 32
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isDefaultSampleSizeAvailable() {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isSampleDescriptionIndexAvailable() {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            super.parse(r3)
            int r0 = r3.getInt()
            r2.trackId = r0
            boolean r0 = r2.isBaseDataOffsetAvailable()
            if (r0 == 0) goto L15
            long r0 = r3.getLong()
            r2.baseDataOffset = r0
        L15:
            boolean r0 = r2.isSampleDescriptionIndexAvailable()
            if (r0 == 0) goto L21
            int r0 = r3.getInt()
            r2.sampleDescriptionIndex = r0
        L21:
            boolean r0 = r2.isDefaultSampleDurationAvailable()
            if (r0 == 0) goto L2d
            int r0 = r3.getInt()
            r2.defaultSampleDuration = r0
        L2d:
            boolean r0 = r2.isDefaultSampleSizeAvailable()
            if (r0 == 0) goto L39
            int r0 = r3.getInt()
            r2.defaultSampleSize = r0
        L39:
            boolean r0 = r2.isDefaultSampleFlagsAvailable()
            if (r0 == 0) goto L45
            int r3 = r3.getInt()
            r2.defaultSampleFlags = r3
        L45:
            return
    }
}
