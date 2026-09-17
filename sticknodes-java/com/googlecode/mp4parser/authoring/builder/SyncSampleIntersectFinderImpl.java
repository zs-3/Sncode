package com.googlecode.mp4parser.authoring.builder;

/* loaded from: classes2.dex */
public class SyncSampleIntersectFinderImpl implements com.googlecode.mp4parser.authoring.builder.Fragmenter {
    private static java.util.logging.Logger LOG;
    private final int minFragmentDurationSeconds;
    private com.googlecode.mp4parser.authoring.Movie movie;
    private com.googlecode.mp4parser.authoring.Track referenceTrack;

    static {
            java.lang.Class<com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl> r0 = com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl.LOG = r0
            return
    }

    public SyncSampleIntersectFinderImpl(com.googlecode.mp4parser.authoring.Movie r1, com.googlecode.mp4parser.authoring.Track r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.movie = r1
            r0.referenceTrack = r2
            r0.minFragmentDurationSeconds = r3
            return
    }

    private static long calculateTracktimesScalingFactor(com.googlecode.mp4parser.authoring.Movie r8, com.googlecode.mp4parser.authoring.Track r9) {
            java.util.List r8 = r8.getTracks()
            java.util.Iterator r8 = r8.iterator()
            r0 = 1
        La:
            boolean r2 = r8.hasNext()
            if (r2 != 0) goto L11
            return r0
        L11:
            java.lang.Object r2 = r8.next()
            com.googlecode.mp4parser.authoring.Track r2 = (com.googlecode.mp4parser.authoring.Track) r2
            java.lang.String r3 = r2.getHandler()
            java.lang.String r4 = r9.getHandler()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto La
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r2.getTrackMetaData()
            long r3 = r3.getTimescale()
            com.googlecode.mp4parser.authoring.TrackMetaData r5 = r9.getTrackMetaData()
            long r5 = r5.getTimescale()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto La
            com.googlecode.mp4parser.authoring.TrackMetaData r2 = r2.getTrackMetaData()
            long r2 = r2.getTimescale()
            long r0 = com.googlecode.mp4parser.util.Math.lcm(r0, r2)
            goto La
    }

    static java.lang.String getFormat(com.googlecode.mp4parser.authoring.Track r1) {
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = r1.getSampleDescriptionBox()
            java.lang.String r0 = "enc./sinf/frma"
            com.coremedia.iso.boxes.Box r0 = com.googlecode.mp4parser.util.Path.getPath(r1, r0)
            com.coremedia.iso.boxes.OriginalFormatBox r0 = (com.coremedia.iso.boxes.OriginalFormatBox) r0
            if (r0 == 0) goto L13
            java.lang.String r1 = r0.getDataFormat()
            return r1
        L13:
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r1 = r1.getSampleEntry()
            java.lang.String r1 = r1.getType()
            return r1
    }

    public static java.util.List<long[]> getSyncSamplesTimestamps(com.googlecode.mp4parser.authoring.Movie r5, com.googlecode.mp4parser.authoring.Track r6) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.List r1 = r5.getTracks()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L14
            return r0
        L14:
            java.lang.Object r2 = r1.next()
            com.googlecode.mp4parser.authoring.Track r2 = (com.googlecode.mp4parser.authoring.Track) r2
            java.lang.String r3 = r2.getHandler()
            java.lang.String r4 = r6.getHandler()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Ld
            long[] r3 = r2.getSyncSamples()
            if (r3 == 0) goto Ld
            int r3 = r3.length
            if (r3 <= 0) goto Ld
            long[] r2 = getTimes(r2, r5)
            r0.add(r2)
            goto Ld
    }

    private static long[] getTimes(com.googlecode.mp4parser.authoring.Track r13, com.googlecode.mp4parser.authoring.Movie r14) {
            long[] r0 = r13.getSyncSamples()
            int r1 = r0.length
            long[] r1 = new long[r1]
            long r2 = calculateTracktimesScalingFactor(r14, r13)
            r14 = 1
            r4 = 0
            r6 = 0
            r7 = 1
        L10:
            long r8 = (long) r7
            int r10 = r0.length
            int r10 = r10 - r14
            r10 = r0[r10]
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L1a
            return r1
        L1a:
            r10 = r0[r6]
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L27
            int r8 = r6 + 1
            long r9 = r4 * r2
            r1[r6] = r9
            r6 = r8
        L27:
            long[] r8 = r13.getSampleDurations()
            int r9 = r7 + 1
            int r7 = r7 + (-1)
            r7 = r8[r7]
            long r4 = r4 + r7
            r7 = r9
            goto L10
    }

    public long[] getCommonIndices(long[] r17, long[] r18, long r19, long[]... r21) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r21
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r6 = 0
            r7 = 0
        L14:
            int r8 = r2.length
            r9 = 1
            if (r7 < r8) goto L19c
            int r2 = r4.size()
            double r2 = (double) r2
            int r7 = r1.length
            double r7 = (double) r7
            r10 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r7 = r7 * r10
            int r10 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r10 >= 0) goto Lf4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            java.lang.Object[] r5 = new java.lang.Object[r9]
            int r7 = r4.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r6] = r7
            java.lang.String r7 = "%5d - Common:  ["
            java.lang.String r5 = java.lang.String.format(r7, r5)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.util.Iterator r7 = r4.iterator()
        L4b:
            boolean r4 = r7.hasNext()
            java.lang.String r5 = "%10d,"
            if (r4 != 0) goto Lcc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.<init>(r2)
            java.lang.String r2 = "]"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.util.logging.Logger r7 = com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl.LOG
            r7.warning(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            int r7 = r1.length
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r6] = r7
            java.lang.String r7 = "%5d - In    :  ["
            java.lang.String r3 = java.lang.String.format(r7, r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            int r4 = r1.length
            r7 = 0
        L87:
            if (r7 >= r4) goto Laa
            r10 = r1[r7]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r8.<init>(r3)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r3[r6] = r10
            java.lang.String r3 = java.lang.String.format(r5, r3)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            int r7 = r7 + 1
            goto L87
        Laa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.logging.Logger r2 = com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl.LOG
            r2.warning(r1)
            java.util.logging.Logger r1 = com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl.LOG
            java.lang.String r2 = "There are less than 25% of common sync samples in the given track."
            r1.warning(r2)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r2)
            throw r1
        Lcc:
            java.lang.Object r4 = r7.next()
            java.lang.Long r4 = (java.lang.Long) r4
            long r10 = r4.longValue()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.<init>(r2)
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r2[r6] = r8
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            goto L4b
        Lf4:
            int r2 = r4.size()
            double r2 = (double) r2
            int r7 = r1.length
            double r7 = (double) r7
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r7 = r7 * r9
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 >= 0) goto L10b
            java.util.logging.Logger r1 = com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl.LOG
            java.lang.String r2 = "There are less than 50% of common sync samples in the given track. This is implausible but I'm ok to continue."
            r1.fine(r2)
            goto L132
        L10b:
            int r2 = r4.size()
            int r3 = r1.length
            if (r2 >= r3) goto L132
            java.util.logging.Logger r2 = com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl.LOG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "Common SyncSample positions vs. this tracks SyncSample positions: "
            r3.<init>(r7)
            int r7 = r4.size()
            r3.append(r7)
            java.lang.String r7 = " vs. "
            r3.append(r7)
            int r1 = r1.length
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.finest(r1)
        L132:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            int r2 = r0.minFragmentDurationSeconds
            if (r2 <= 0) goto L183
            java.util.Iterator r2 = r4.iterator()
            java.util.Iterator r3 = r5.iterator()
            r4 = -1
            r7 = r4
        L146:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L181
            boolean r9 = r3.hasNext()
            if (r9 != 0) goto L153
            goto L181
        L153:
            java.lang.Object r9 = r2.next()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            java.lang.Object r11 = r3.next()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            int r13 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r13 == 0) goto L176
            long r13 = r11 - r7
            long r13 = r13 / r19
            int r15 = r0.minFragmentDurationSeconds
            long r4 = (long) r15
            int r15 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r15 < 0) goto L17e
        L176:
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r1.add(r4)
            r7 = r11
        L17e:
            r4 = -1
            goto L146
        L181:
            r8 = r1
            goto L184
        L183:
            r8 = r4
        L184:
            int r10 = r8.size()
            long[] r11 = new long[r10]
        L18a:
            if (r6 < r10) goto L18d
            return r11
        L18d:
            java.lang.Object r1 = r8.get(r6)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r11[r6] = r1
            int r6 = r6 + 1
            goto L18a
        L19c:
            int r8 = r3.length
            r10 = 0
            r11 = 1
        L19f:
            if (r10 < r8) goto L1b9
            if (r11 == 0) goto L1b5
            r8 = r1[r7]
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r4.add(r8)
            r8 = r2[r7]
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r5.add(r8)
        L1b5:
            int r7 = r7 + 1
            goto L14
        L1b9:
            r12 = r3[r10]
            r13 = r2[r7]
            int r12 = java.util.Arrays.binarySearch(r12, r13)
            if (r12 < 0) goto L1c5
            r12 = 1
            goto L1c6
        L1c5:
            r12 = 0
        L1c6:
            r11 = r11 & r12
            int r10 = r10 + 1
            goto L19f
    }

    @Override // com.googlecode.mp4parser.authoring.builder.Fragmenter
    public long[] sampleNumbers(com.googlecode.mp4parser.authoring.Track r21) {
            r20 = this;
            r6 = r20
            r0 = r21
            java.lang.String r1 = r21.getHandler()
            java.lang.String r2 = "vide"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L55
            long[] r1 = r21.getSyncSamples()
            if (r1 == 0) goto L4d
            long[] r1 = r21.getSyncSamples()
            int r1 = r1.length
            if (r1 <= 0) goto L4d
            com.googlecode.mp4parser.authoring.Movie r1 = r6.movie
            java.util.List r1 = getSyncSamplesTimestamps(r1, r0)
            long[] r2 = r21.getSyncSamples()
            com.googlecode.mp4parser.authoring.Movie r3 = r6.movie
            long[] r3 = getTimes(r0, r3)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r21.getTrackMetaData()
            long r4 = r0.getTimescale()
            int r0 = r1.size()
            long[][] r0 = new long[r0][]
            java.lang.Object[] r0 = r1.toArray(r0)
            r7 = r0
            long[][] r7 = (long[][]) r7
            r0 = r20
            r1 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            long[] r0 = r0.getCommonIndices(r1, r2, r3, r5)
            return r0
        L4d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Video Tracks need sync samples. Only tracks other than video may have no sync samples."
            r0.<init>(r1)
            throw r0
        L55:
            java.lang.String r1 = r21.getHandler()
            java.lang.String r3 = "soun"
            boolean r1 = r3.equals(r1)
            java.lang.String r3 = "There was absolutely no Track with sync samples. I can't work with that!"
            r7 = 0
            if (r1 == 0) goto L168
            com.googlecode.mp4parser.authoring.Track r1 = r6.referenceTrack
            if (r1 != 0) goto L99
            com.googlecode.mp4parser.authoring.Movie r1 = r6.movie
            java.util.List r1 = r1.getTracks()
            java.util.Iterator r1 = r1.iterator()
        L72:
            boolean r8 = r1.hasNext()
            if (r8 != 0) goto L79
            goto L99
        L79:
            java.lang.Object r8 = r1.next()
            com.googlecode.mp4parser.authoring.Track r8 = (com.googlecode.mp4parser.authoring.Track) r8
            long[] r9 = r8.getSyncSamples()
            if (r9 == 0) goto L72
            java.lang.String r9 = r8.getHandler()
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L72
            long[] r9 = r8.getSyncSamples()
            int r9 = r9.length
            if (r9 <= 0) goto L72
            r6.referenceTrack = r8
            goto L72
        L99:
            com.googlecode.mp4parser.authoring.Track r1 = r6.referenceTrack
            if (r1 == 0) goto L162
            long[] r1 = r6.sampleNumbers(r1)
            com.googlecode.mp4parser.authoring.Track r2 = r6.referenceTrack
            java.util.List r2 = r2.getSamples()
            int r2 = r2.size()
            int r8 = r1.length
            long[] r9 = new long[r8]
            r10 = 192000(0x2ee00, double:9.48606E-319)
            com.googlecode.mp4parser.authoring.Movie r3 = r6.movie
            java.util.List r3 = r3.getTracks()
            java.util.Iterator r12 = r3.iterator()
        Lbb:
            boolean r3 = r12.hasNext()
            if (r3 != 0) goto Lc2
            goto L103
        Lc2:
            java.lang.Object r3 = r12.next()
            com.googlecode.mp4parser.authoring.Track r3 = (com.googlecode.mp4parser.authoring.Track) r3
            java.lang.String r13 = getFormat(r21)
            java.lang.String r14 = getFormat(r3)
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L15e
            com.coremedia.iso.boxes.SampleDescriptionBox r13 = r3.getSampleDescriptionBox()
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r13 = r13.getSampleEntry()
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r13 = (com.coremedia.iso.boxes.sampleentry.AudioSampleEntry) r13
            long r14 = r13.getSampleRate()
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 >= 0) goto L15e
            long r13 = r13.getSampleRate()
            java.util.List r10 = r3.getSamples()
            int r10 = r10.size()
            long r10 = (long) r10
            double r10 = (double) r10
            double r4 = (double) r2
            double r4 = r10 / r4
            long[] r2 = r3.getSampleDurations()
            r10 = r2[r7]
            r2 = 0
        L100:
            if (r2 < r8) goto L13d
            r10 = r13
        L103:
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = r21.getSampleDescriptionBox()
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r1 = r1.getSampleEntry()
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r1 = (com.coremedia.iso.boxes.sampleentry.AudioSampleEntry) r1
            long[] r0 = r21.getSampleDurations()
            r2 = r0[r7]
            long r0 = r1.getSampleRate()
            double r0 = (double) r0
            double r4 = (double) r10
            double r0 = r0 / r4
            double r4 = java.lang.Math.rint(r0)
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 != 0) goto L135
        L122:
            if (r7 < r8) goto L125
            return r9
        L125:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r10 = r9[r7]
            double r10 = (double) r10
            double r10 = r10 * r0
            double r12 = (double) r2
            double r10 = r10 / r12
            double r10 = r10 + r4
            long r4 = (long) r10
            r9[r7] = r4
            int r7 = r7 + 1
            goto L122
        L135:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Sample rates must be a multiple of the lowest sample rate to create a correct file!"
            r0.<init>(r1)
            throw r0
        L13d:
            r17 = r1[r2]
            r19 = r8
            r15 = 1
            long r7 = r17 - r15
            double r7 = (double) r7
            double r7 = r7 * r4
            r17 = r1
            double r0 = (double) r10
            double r7 = r7 * r0
            double r0 = java.lang.Math.ceil(r7)
            long r0 = (long) r0
            r9[r2] = r0
            int r2 = r2 + 1
            r0 = r21
            r1 = r17
            r8 = r19
            r7 = 0
            goto L100
        L15e:
            r0 = r21
            goto Lbb
        L162:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
        L168:
            com.googlecode.mp4parser.authoring.Movie r0 = r6.movie
            java.util.List r0 = r0.getTracks()
            java.util.Iterator r0 = r0.iterator()
        L172:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1bd
            java.lang.Object r1 = r0.next()
            com.googlecode.mp4parser.authoring.Track r1 = (com.googlecode.mp4parser.authoring.Track) r1
            long[] r2 = r1.getSyncSamples()
            if (r2 == 0) goto L172
            long[] r2 = r1.getSyncSamples()
            int r2 = r2.length
            if (r2 <= 0) goto L172
            long[] r2 = r6.sampleNumbers(r1)
            java.util.List r0 = r1.getSamples()
            int r0 = r0.size()
            int r1 = r2.length
            long[] r4 = new long[r1]
            java.util.List r3 = r21.getSamples()
            int r3 = r3.size()
            long r7 = (long) r3
            double r7 = (double) r7
            double r9 = (double) r0
            double r7 = r7 / r9
            r0 = 0
        L1a7:
            if (r0 < r1) goto L1aa
            return r4
        L1aa:
            r9 = r2[r0]
            r11 = 1
            long r9 = r9 - r11
            double r9 = (double) r9
            double r9 = r9 * r7
            double r9 = java.lang.Math.ceil(r9)
            long r9 = (long) r9
            long r9 = r9 + r11
            r4[r0] = r9
            int r0 = r0 + 1
            goto L1a7
        L1bd:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }
}
