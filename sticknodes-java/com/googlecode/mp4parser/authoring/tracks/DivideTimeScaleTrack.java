package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class DivideTimeScaleTrack implements com.googlecode.mp4parser.authoring.Track {
    com.googlecode.mp4parser.authoring.Track source;
    private int timeScaleDivisor;

    public DivideTimeScaleTrack(com.googlecode.mp4parser.authoring.Track r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.timeScaleDivisor = r2
            return
    }

    java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> adjustCtts() {
            r6 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r6.source
            java.util.List r0 = r0.getCompositionTimeEntries()
            if (r0 == 0) goto L36
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L1c
            return r1
        L1c:
            java.lang.Object r2 = r0.next()
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r2 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r2
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r3 = new com.coremedia.iso.boxes.CompositionTimeToSample$Entry
            int r4 = r2.getCount()
            int r2 = r2.getOffset()
            int r5 = r6.timeScaleDivisor
            int r2 = r2 / r5
            r3.<init>(r4, r2)
            r1.add(r3)
            goto L15
        L36:
            r0 = 0
            return r0
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
            java.util.List r0 = r1.adjustCtts()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long getDuration() {
            r7 = this;
            long[] r0 = r7.getSampleDurations()
            int r1 = r0.length
            r2 = 0
            r4 = 0
        L8:
            if (r4 < r1) goto Lb
            return r2
        Lb:
            r5 = r0[r4]
            long r2 = r2 + r5
            int r4 = r4 + 1
            goto L8
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
            int r2 = r7.timeScaleDivisor
            long r5 = (long) r2
            long r3 = r3 / r5
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
            int r3 = r5.timeScaleDivisor
            long r3 = (long) r3
            long r1 = r1 / r3
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
