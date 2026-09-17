package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class ReplaceSampleTrack extends com.googlecode.mp4parser.authoring.AbstractTrack {
    com.googlecode.mp4parser.authoring.Track origTrack;
    private com.googlecode.mp4parser.authoring.Sample sampleContent;
    private long sampleNumber;
    private java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;

    /* renamed from: com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private class ReplaceASingleEntryList extends java.util.AbstractList<com.googlecode.mp4parser.authoring.Sample> {
        final /* synthetic */ com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack this$0;

        private ReplaceASingleEntryList(com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ ReplaceASingleEntryList(com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack r1, com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack.ReplaceASingleEntryList r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public com.googlecode.mp4parser.authoring.Sample get(int r6) {
                r5 = this;
                com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack r0 = r5.this$0
                long r0 = com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack.access$0(r0)
                long r2 = (long) r6
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L12
                com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack r6 = r5.this$0
                com.googlecode.mp4parser.authoring.Sample r6 = com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack.access$1(r6)
                return r6
            L12:
                com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack r0 = r5.this$0
                com.googlecode.mp4parser.authoring.Track r0 = r0.origTrack
                java.util.List r0 = r0.getSamples()
                java.lang.Object r6 = r0.get(r6)
                com.googlecode.mp4parser.authoring.Sample r6 = (com.googlecode.mp4parser.authoring.Sample) r6
                return r6
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                com.googlecode.mp4parser.authoring.Sample r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack r0 = r1.this$0
                com.googlecode.mp4parser.authoring.Track r0 = r0.origTrack
                java.util.List r0 = r0.getSamples()
                int r0 = r0.size()
                return r0
        }
    }

    public ReplaceSampleTrack(com.googlecode.mp4parser.authoring.Track r3, long r4, java.nio.ByteBuffer r6) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "replace("
            r0.<init>(r1)
            java.lang.String r1 = r3.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.origTrack = r3
            r2.sampleNumber = r4
            com.googlecode.mp4parser.authoring.SampleImpl r3 = new com.googlecode.mp4parser.authoring.SampleImpl
            r3.<init>(r6)
            r2.sampleContent = r3
            com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack$ReplaceASingleEntryList r3 = new com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack$ReplaceASingleEntryList
            r4 = 0
            r3.<init>(r2, r4)
            r2.samples = r3
            return
    }

    static /* synthetic */ long access$0(com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack r2) {
            long r0 = r2.sampleNumber
            return r0
    }

    static /* synthetic */ com.googlecode.mp4parser.authoring.Sample access$1(com.googlecode.mp4parser.authoring.tracks.ReplaceSampleTrack r0) {
            com.googlecode.mp4parser.authoring.Sample r0 = r0.sampleContent
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.origTrack
            r0.close()
            return
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.origTrack
            java.util.List r0 = r0.getCompositionTimeEntries()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.origTrack
            java.lang.String r0 = r0.getHandler()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.origTrack
            java.util.List r0 = r0.getSampleDependencies()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.origTrack
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r0.getSampleDescriptionBox()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public synchronized long[] getSampleDurations() {
            r1 = this;
            monitor-enter(r1)
            com.googlecode.mp4parser.authoring.Track r0 = r1.origTrack     // Catch: java.lang.Throwable -> L9
            long[] r0 = r0.getSampleDurations()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.origTrack
            com.coremedia.iso.boxes.SubSampleInformationBox r0 = r0.getSubsampleInformationBox()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public synchronized long[] getSyncSamples() {
            r1 = this;
            monitor-enter(r1)
            com.googlecode.mp4parser.authoring.Track r0 = r1.origTrack     // Catch: java.lang.Throwable -> L9
            long[] r0 = r0.getSyncSamples()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.origTrack
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            return r0
    }
}
