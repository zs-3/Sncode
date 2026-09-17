package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class MultiplyTimeScaleTrack implements com.googlecode.mp4parser.authoring.Track {
    com.googlecode.mp4parser.authoring.Track source;
    private int timeScaleFactor;

    public MultiplyTimeScaleTrack(com.googlecode.mp4parser.authoring.Track r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.timeScaleFactor = r2
            return
    }

    static java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> adjustCtts(java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> r4, int r5) {
            if (r4 == 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L16
            return r0
        L16:
            java.lang.Object r1 = r4.next()
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r1 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r1
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r2 = new com.coremedia.iso.boxes.CompositionTimeToSample$Entry
            int r3 = r1.getCount()
            int r1 = r1.getOffset()
            int r1 = r1 * r5
            r2.<init>(r3, r1)
            r0.add(r2)
            goto Lf
        L2f:
            r4 = 0
            return r4
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
            r2 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r2.source
            java.util.List r0 = r0.getCompositionTimeEntries()
            int r1 = r2.timeScaleFactor
            java.util.List r0 = adjustCtts(r0, r1)
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long getDuration() {
            r4 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r4.source
            long r0 = r0.getDuration()
            int r2 = r4.timeScaleFactor
            long r2 = (long) r2
            long r0 = r0 * r2
            return r0
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
            java.lang.String r1 = "timscale("
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
            r7 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r7.source
            long[] r0 = r0.getSampleDurations()
            int r0 = r0.length
            long[] r0 = new long[r0]
            r1 = 0
        La:
            com.googlecode.mp4parser.authoring.Track r2 = r7.source
            long[] r2 = r2.getSampleDurations()
            int r2 = r2.length
            if (r1 < r2) goto L14
            return r0
        L14:
            com.googlecode.mp4parser.authoring.Track r2 = r7.source
            long[] r2 = r2.getSampleDurations()
            r3 = r2[r1]
            int r2 = r7.timeScaleFactor
            long r5 = (long) r2
            long r3 = r3 * r5
            r0[r1] = r3
            int r1 = r1 + 1
            goto La
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
            r5 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r5.source
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            java.lang.Object r0 = r0.clone()
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = (com.googlecode.mp4parser.authoring.TrackMetaData) r0
            com.googlecode.mp4parser.authoring.Track r1 = r5.source
            com.googlecode.mp4parser.authoring.TrackMetaData r1 = r1.getTrackMetaData()
            long r1 = r1.getTimescale()
            int r3 = r5.timeScaleFactor
            long r3 = (long) r3
            long r1 = r1 * r3
            r0.setTimescale(r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MultiplyTimeScaleTrack{source="
            r0.<init>(r1)
            com.googlecode.mp4parser.authoring.Track r1 = r2.source
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
