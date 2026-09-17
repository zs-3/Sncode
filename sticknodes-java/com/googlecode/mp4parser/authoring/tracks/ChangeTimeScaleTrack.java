package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class ChangeTimeScaleTrack implements com.googlecode.mp4parser.authoring.Track {
    private static final java.util.logging.Logger LOG = null;
    java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> ctts;
    long[] decodingTimes;
    com.googlecode.mp4parser.authoring.Track source;
    long timeScale;

    static {
            java.lang.Class<com.googlecode.mp4parser.authoring.tracks.ChangeTimeScaleTrack> r0 = com.googlecode.mp4parser.authoring.tracks.ChangeTimeScaleTrack.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.authoring.tracks.ChangeTimeScaleTrack.LOG = r0
            return
    }

    public ChangeTimeScaleTrack(com.googlecode.mp4parser.authoring.Track r5, long r6, long[] r8) {
            r4 = this;
            r4.<init>()
            r4.source = r5
            r4.timeScale = r6
            double r0 = (double) r6
            com.googlecode.mp4parser.authoring.TrackMetaData r2 = r5.getTrackMetaData()
            long r2 = r2.getTimescale()
            double r2 = (double) r2
            double r0 = r0 / r2
            java.util.List r2 = r5.getCompositionTimeEntries()
            java.util.List r2 = adjustCtts(r2, r0)
            r4.ctts = r2
            long[] r2 = r5.getSampleDurations()
            long[] r5 = getTimes(r5, r8, r6)
            long[] r5 = adjustTts(r2, r0, r8, r5)
            r4.decodingTimes = r5
            return
    }

    static java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> adjustCtts(java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> r6, double r7) {
            if (r6 == 0) goto L35
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        Lf:
            boolean r1 = r6.hasNext()
            if (r1 != 0) goto L16
            return r0
        L16:
            java.lang.Object r1 = r6.next()
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r1 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r1
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r2 = new com.coremedia.iso.boxes.CompositionTimeToSample$Entry
            int r3 = r1.getCount()
            int r1 = r1.getOffset()
            double r4 = (double) r1
            double r4 = r4 * r7
            long r4 = java.lang.Math.round(r4)
            int r1 = (int) r4
            r2.<init>(r3, r1)
            r0.add(r2)
            goto Lf
        L35:
            r6 = 0
            return r6
    }

    static long[] adjustTts(long[] r18, double r19, long[] r21, long[] r22) {
            r0 = r18
            int r1 = r0.length
            long[] r1 = new long[r1]
            r2 = 1
            r3 = 0
            r5 = 1
        L9:
            int r6 = r0.length
            if (r5 <= r6) goto Ld
            return r1
        Ld:
            int r6 = r5 + (-1)
            r7 = r0[r6]
            double r7 = (double) r7
            double r7 = r7 * r19
            long r7 = java.lang.Math.round(r7)
            int r9 = r5 + 1
            long r10 = (long) r9
            r12 = r21
            int r10 = java.util.Arrays.binarySearch(r12, r10)
            if (r10 < 0) goto L5b
            r13 = r22[r10]
            int r11 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r11 == 0) goto L5b
            r13 = r22[r10]
            long r15 = r3 + r7
            long r13 = r13 - r15
            java.util.logging.Logger r11 = com.googlecode.mp4parser.authoring.tracks.ChangeTimeScaleTrack.LOG
            r15 = 4
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r16 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15[r16] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r15[r2] = r5
            r5 = 2
            r16 = r22[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r16)
            r15[r5] = r10
            r5 = 3
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r15[r5] = r10
            java.lang.String r5 = "Sample %d %d / %d - correct by %d"
            java.lang.String r5 = java.lang.String.format(r5, r15)
            r11.finest(r5)
            long r7 = r7 + r13
        L5b:
            long r3 = r3 + r7
            r1[r6] = r7
            r5 = r9
            goto L9
    }

    private static long[] getTimes(com.googlecode.mp4parser.authoring.Track r11, long[] r12, long r13) {
            int r0 = r12.length
            long[] r0 = new long[r0]
            r1 = 1
            r2 = 0
            r4 = 0
            r5 = 1
        L8:
            long r6 = (long) r5
            int r8 = r12.length
            int r8 = r8 - r1
            r8 = r12[r8]
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L12
            return r0
        L12:
            r8 = r12[r4]
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L28
            int r6 = r4 + 1
            long r7 = r2 * r13
            com.googlecode.mp4parser.authoring.TrackMetaData r9 = r11.getTrackMetaData()
            long r9 = r9.getTimescale()
            long r7 = r7 / r9
            r0[r4] = r7
            r4 = r6
        L28:
            long[] r6 = r11.getSampleDurations()
            int r7 = r5 + (-1)
            r7 = r6[r7]
            long r2 = r2 + r7
            int r5 = r5 + 1
            goto L8
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            r0.close()
            return
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r0 = r1.ctts
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long getDuration() {
            r7 = this;
            long[] r0 = r7.decodingTimes
            int r1 = r0.length
            r2 = 0
            r4 = 0
        L6:
            if (r4 < r1) goto L9
            return r2
        L9:
            r5 = r0[r4]
            long r2 = r2 + r5
            int r4 = r4 + 1
            goto L6
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Edit> getEdits() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            java.util.List r0 = r0.getEdits()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            java.lang.String r0 = r0.getHandler()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getName() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "timeScale("
            r0.<init>(r1)
            com.googlecode.mp4parser.authoring.Track r1 = r2.source
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            java.util.List r0 = r0.getSampleDependencies()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r0.getSampleDescriptionBox()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
            r1 = this;
            long[] r0 = r1.decodingTimes
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> getSampleGroups() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            java.util.Map r0 = r0.getSampleGroups()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            java.util.List r0 = r0.getSamples()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            com.coremedia.iso.boxes.SubSampleInformationBox r0 = r0.getSubsampleInformationBox()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            long[] r0 = r0.getSyncSamples()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r3 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r3.source
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            java.lang.Object r0 = r0.clone()
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = (com.googlecode.mp4parser.authoring.TrackMetaData) r0
            long r1 = r3.timeScale
            r0.setTimescale(r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChangeTimeScaleTrack{source="
            r0.<init>(r1)
            com.googlecode.mp4parser.authoring.Track r1 = r2.source
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
