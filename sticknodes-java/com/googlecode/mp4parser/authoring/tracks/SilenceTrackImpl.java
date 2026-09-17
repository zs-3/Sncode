package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class SilenceTrackImpl implements com.googlecode.mp4parser.authoring.Track {
    long[] decodingTimes;
    java.lang.String name;
    java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    com.googlecode.mp4parser.authoring.Track source;

    public SilenceTrackImpl(com.googlecode.mp4parser.authoring.Track r7, long r8) {
            r6 = this;
            r6.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r6.samples = r0
            r6.source = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = "ms silence"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.name = r0
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r7.getSampleDescriptionBox()
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r0 = r0.getSampleEntry()
            java.lang.String r0 = r0.getType()
            java.lang.String r1 = "mp4a"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7c
            com.googlecode.mp4parser.authoring.TrackMetaData r7 = r6.getTrackMetaData()
            long r0 = r7.getTimescale()
            long r0 = r0 * r8
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r4 = 1024(0x400, double:5.06E-321)
            long r0 = r0 / r4
            int r7 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            long[] r0 = new long[r7]
            r6.decodingTimes = r0
            com.googlecode.mp4parser.authoring.TrackMetaData r1 = r6.getTrackMetaData()
            long r4 = r1.getTimescale()
            long r4 = r4 * r8
            long r8 = (long) r7
            long r4 = r4 / r8
            long r4 = r4 / r2
            java.util.Arrays.fill(r0, r4)
        L5b:
            int r8 = r7 + (-1)
            if (r7 > 0) goto L60
            return
        L60:
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r7 = r6.samples
            com.googlecode.mp4parser.authoring.SampleImpl r9 = new com.googlecode.mp4parser.authoring.SampleImpl
            r0 = 6
            byte[] r0 = new byte[r0]
            r0 = {x009e: FILL_ARRAY_DATA , data: [33, 16, 4, 96, -116, 28} // fill-array
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r9.<init>(r0)
            r7.add(r9)
            r7 = r8
            goto L5b
        L7c:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Tracks of type "
            r9.<init>(r0)
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r9.append(r7)
            java.lang.String r7 = " are not supported"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            r0 = 0
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
            r0 = 0
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
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            r0 = 0
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
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            return r0
    }
}
