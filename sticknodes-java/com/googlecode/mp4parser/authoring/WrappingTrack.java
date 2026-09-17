package com.googlecode.mp4parser.authoring;

/* loaded from: classes2.dex */
public class WrappingTrack implements com.googlecode.mp4parser.authoring.Track {
    com.googlecode.mp4parser.authoring.Track parent;

    public WrappingTrack(com.googlecode.mp4parser.authoring.Track r1) {
            r0 = this;
            r0.<init>()
            r0.parent = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            r0.close()
            return
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            java.util.List r0 = r0.getCompositionTimeEntries()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long getDuration() {
            r2 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r2.parent
            long r0 = r0.getDuration()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Edit> getEdits() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            java.util.List r0 = r0.getEdits()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            java.lang.String r0 = r0.getHandler()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getName() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            com.googlecode.mp4parser.authoring.Track r1 = r2.parent
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            java.util.List r0 = r0.getSampleDependencies()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r0.getSampleDescriptionBox()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            long[] r0 = r0.getSampleDurations()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> getSampleGroups() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            java.util.Map r0 = r0.getSampleGroups()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            java.util.List r0 = r0.getSamples()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            com.coremedia.iso.boxes.SubSampleInformationBox r0 = r0.getSubsampleInformationBox()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            long[] r0 = r0.getSyncSamples()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.parent
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            return r0
    }
}
