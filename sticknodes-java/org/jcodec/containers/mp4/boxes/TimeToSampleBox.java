package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class TimeToSampleBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry[] entries;

    public static class TimeToSampleEntry {
        int sampleCount;
        int sampleDuration;

        public TimeToSampleEntry(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.sampleCount = r1
                r0.sampleDuration = r2
                return
        }

        public int getSampleCount() {
                r1 = this;
                int r0 = r1.sampleCount
                return r0
        }

        public int getSampleDuration() {
                r1 = this;
                int r0 = r1.sampleDuration
                return r0
        }
    }

    public TimeToSampleBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.TimeToSampleBox createTimeToSampleBox(org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry[] r3) {
            org.jcodec.containers.mp4.boxes.TimeToSampleBox r0 = new org.jcodec.containers.mp4.boxes.TimeToSampleBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.entries = r3
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "stts"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r6) {
            r5 = this;
            super.doWrite(r6)
            org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry[] r0 = r5.entries
            int r0 = r0.length
            r6.putInt(r0)
            org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry[] r0 = r5.entries
            int r1 = r0.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L22
            r3 = r0[r2]
            int r4 = r3.getSampleCount()
            r6.putInt(r4)
            int r3 = r3.getSampleDuration()
            r6.putInt(r3)
            int r2 = r2 + 1
            goto Ld
        L22:
            return
    }

    public org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry[] getEntries() {
            r1 = this;
            org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry[] r0 = r1.entries
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r7) {
            r6 = this;
            super.parse(r7)
            int r0 = r7.getInt()
            org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry[] r1 = new org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry[r0]
            r6.entries = r1
            r1 = 0
        Lc:
            if (r1 >= r0) goto L22
            org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry[] r2 = r6.entries
            org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry r3 = new org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry
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
