package com.googlecode.mp4parser.authoring.builder;

/* loaded from: classes2.dex */
public class TimeBasedFragmenter implements com.googlecode.mp4parser.authoring.builder.Fragmenter {
    private double fragmentLength;

    public TimeBasedFragmenter(double r1) {
            r0 = this;
            r0.<init>()
            r0.fragmentLength = r1
            return
    }

    public static void main(java.lang.String[] r3) {
            com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder r3 = new com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder
            r3.<init>()
            com.googlecode.mp4parser.authoring.builder.TimeBasedFragmenter r0 = new com.googlecode.mp4parser.authoring.builder.TimeBasedFragmenter
            r1 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r0.<init>(r1)
            r3.setFragmenter(r0)
            return
    }

    @Override // com.googlecode.mp4parser.authoring.builder.Fragmenter
    public long[] sampleNumbers(com.googlecode.mp4parser.authoring.Track r17) {
            r16 = this;
            r0 = 1
            long[] r1 = new long[r0]
            r2 = 1
            r4 = 0
            r1[r4] = r2
            long[] r2 = r17.getSampleDurations()
            long[] r3 = r17.getSyncSamples()
            com.googlecode.mp4parser.authoring.TrackMetaData r5 = r17.getTrackMetaData()
            long r5 = r5.getTimescale()
            r7 = 0
            r10 = r7
            r9 = 0
        L1c:
            int r12 = r2.length
            if (r9 < r12) goto L20
            return r1
        L20:
            r12 = r2[r9]
            double r12 = (double) r12
            double r14 = (double) r5
            double r12 = r12 / r14
            double r10 = r10 + r12
            r12 = r16
            double r13 = r12.fragmentLength
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L47
            if (r3 == 0) goto L39
            int r13 = r9 + 1
            long r13 = (long) r13
            int r13 = java.util.Arrays.binarySearch(r3, r13)
            if (r13 < 0) goto L47
        L39:
            if (r9 <= 0) goto L46
            long[] r10 = new long[r0]
            int r11 = r9 + 1
            long r13 = (long) r11
            r10[r4] = r13
            long[] r1 = com.googlecode.mp4parser.util.Mp4Arrays.copyOfAndAppend(r1, r10)
        L46:
            r10 = r7
        L47:
            int r9 = r9 + 1
            goto L1c
    }
}
