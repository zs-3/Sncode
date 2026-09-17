package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class CroppedTrack extends com.googlecode.mp4parser.authoring.AbstractTrack {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int fromSample;
    com.googlecode.mp4parser.authoring.Track origTrack;
    private int toSample;

    static {
            java.lang.Class<com.googlecode.mp4parser.authoring.tracks.CroppedTrack> r0 = com.googlecode.mp4parser.authoring.tracks.CroppedTrack.class
            return
    }

    public CroppedTrack(com.googlecode.mp4parser.authoring.Track r3, long r4, long r6) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "crop("
            r0.<init>(r1)
            java.lang.String r1 = r3.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.origTrack = r3
            int r3 = (int) r4
            r2.fromSample = r3
            int r3 = (int) r6
            r2.toSample = r3
            return
    }

    static java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries(java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> r7, long r8, long r10) {
            if (r7 == 0) goto L8c
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L8c
            r0 = 0
            java.util.ListIterator r7 = r7.listIterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L13:
            java.lang.Object r3 = r7.next()
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r3 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r3
            int r4 = r3.getCount()
            long r4 = (long) r4
            long r4 = r4 + r0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L85
            int r4 = r3.getCount()
            long r4 = (long) r4
            long r4 = r4 + r0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 < 0) goto L3c
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r7 = new com.coremedia.iso.boxes.CompositionTimeToSample$Entry
            long r10 = r10 - r8
            int r8 = (int) r10
            int r9 = r3.getOffset()
            r7.<init>(r8, r9)
            r2.add(r7)
            return r2
        L3c:
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r4 = new com.coremedia.iso.boxes.CompositionTimeToSample$Entry
            int r5 = r3.getCount()
            long r5 = (long) r5
            long r5 = r5 + r0
            long r5 = r5 - r8
            int r8 = (int) r5
            int r9 = r3.getOffset()
            r4.<init>(r8, r9)
            r2.add(r4)
            int r8 = r3.getCount()
        L54:
            long r8 = (long) r8
            long r0 = r0 + r8
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L76
            java.lang.Object r8 = r7.next()
            r3 = r8
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r3 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r3
            int r8 = r3.getCount()
            long r8 = (long) r8
            long r8 = r8 + r0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 < 0) goto L6e
            goto L76
        L6e:
            r2.add(r3)
            int r8 = r3.getCount()
            goto L54
        L76:
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r7 = new com.coremedia.iso.boxes.CompositionTimeToSample$Entry
            long r10 = r10 - r0
            int r8 = (int) r10
            int r9 = r3.getOffset()
            r7.<init>(r8, r9)
            r2.add(r7)
            return r2
        L85:
            int r3 = r3.getCount()
            long r3 = (long) r3
            long r0 = r0 + r3
            goto L13
        L8c:
            r7 = 0
            return r7
    }

    static java.util.List<com.coremedia.iso.boxes.TimeToSampleBox.Entry> getDecodingTimeEntries(java.util.List<com.coremedia.iso.boxes.TimeToSampleBox.Entry> r7, long r8, long r10) {
            if (r7 == 0) goto L83
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L83
            r0 = 0
            java.util.ListIterator r7 = r7.listIterator()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L13:
            java.lang.Object r3 = r7.next()
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r3 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r3
            long r4 = r3.getCount()
            long r4 = r4 + r0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L7d
            long r4 = r3.getCount()
            long r4 = r4 + r0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 < 0) goto L39
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r7 = new com.coremedia.iso.boxes.TimeToSampleBox$Entry
            long r10 = r10 - r8
            long r8 = r3.getDelta()
            r7.<init>(r10, r8)
            r2.add(r7)
            return r2
        L39:
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r4 = new com.coremedia.iso.boxes.TimeToSampleBox$Entry
            long r5 = r3.getCount()
            long r5 = r5 + r0
            long r5 = r5 - r8
            long r8 = r3.getDelta()
            r4.<init>(r5, r8)
            r2.add(r4)
            long r8 = r3.getCount()
        L4f:
            long r0 = r0 + r8
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L6f
            java.lang.Object r8 = r7.next()
            r3 = r8
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r3 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r3
            long r8 = r3.getCount()
            long r8 = r8 + r0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 < 0) goto L67
            goto L6f
        L67:
            r2.add(r3)
            long r8 = r3.getCount()
            goto L4f
        L6f:
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r7 = new com.coremedia.iso.boxes.TimeToSampleBox$Entry
            long r10 = r10 - r0
            long r8 = r3.getDelta()
            r7.<init>(r10, r8)
            r2.add(r7)
            return r2
        L7d:
            long r3 = r3.getCount()
            long r0 = r0 + r3
            goto L13
        L83:
            r7 = 0
            return r7
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
            r5 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r5.origTrack
            java.util.List r0 = r0.getCompositionTimeEntries()
            int r1 = r5.fromSample
            long r1 = (long) r1
            int r3 = r5.toSample
            long r3 = (long) r3
            java.util.List r0 = getCompositionTimeEntries(r0, r1, r3)
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
            r3 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r3.origTrack
            java.util.List r0 = r0.getSampleDependencies()
            if (r0 == 0) goto L23
            com.googlecode.mp4parser.authoring.Track r0 = r3.origTrack
            java.util.List r0 = r0.getSampleDependencies()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L23
            com.googlecode.mp4parser.authoring.Track r0 = r3.origTrack
            java.util.List r0 = r0.getSampleDependencies()
            int r1 = r3.fromSample
            int r2 = r3.toSample
            java.util.List r0 = r0.subList(r1, r2)
            return r0
        L23:
            r0 = 0
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
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.toSample     // Catch: java.lang.Throwable -> L16
            int r1 = r5.fromSample     // Catch: java.lang.Throwable -> L16
            int r0 = r0 - r1
            long[] r1 = new long[r0]     // Catch: java.lang.Throwable -> L16
            com.googlecode.mp4parser.authoring.Track r2 = r5.origTrack     // Catch: java.lang.Throwable -> L16
            long[] r2 = r2.getSampleDurations()     // Catch: java.lang.Throwable -> L16
            int r3 = r5.fromSample     // Catch: java.lang.Throwable -> L16
            r4 = 0
            java.lang.System.arraycopy(r2, r3, r1, r4, r0)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r5)
            return r1
        L16:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r3 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r3.origTrack
            java.util.List r0 = r0.getSamples()
            int r1 = r3.fromSample
            int r2 = r3.toSample
            java.util.List r0 = r0.subList(r1, r2)
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
            r9 = this;
            monitor-enter(r9)
            com.googlecode.mp4parser.authoring.Track r0 = r9.origTrack     // Catch: java.lang.Throwable -> L51
            long[] r0 = r0.getSyncSamples()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L4e
            com.googlecode.mp4parser.authoring.Track r0 = r9.origTrack     // Catch: java.lang.Throwable -> L51
            long[] r0 = r0.getSyncSamples()     // Catch: java.lang.Throwable -> L51
            int r1 = r0.length     // Catch: java.lang.Throwable -> L51
            r2 = 0
            r3 = 0
        L12:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L51
            if (r3 >= r4) goto L22
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L51
            int r6 = r9.fromSample     // Catch: java.lang.Throwable -> L51
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L51
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L1f
            goto L22
        L1f:
            int r3 = r3 + 1
            goto L12
        L22:
            if (r1 <= 0) goto L33
            int r4 = r9.toSample     // Catch: java.lang.Throwable -> L51
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L51
            int r6 = r1 + (-1)
            r6 = r0[r6]     // Catch: java.lang.Throwable -> L51
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L30
            goto L33
        L30:
            int r1 = r1 + (-1)
            goto L22
        L33:
            int r1 = r1 - r3
            long[] r0 = new long[r1]     // Catch: java.lang.Throwable -> L51
            com.googlecode.mp4parser.authoring.Track r4 = r9.origTrack     // Catch: java.lang.Throwable -> L51
            long[] r4 = r4.getSyncSamples()     // Catch: java.lang.Throwable -> L51
            java.lang.System.arraycopy(r4, r3, r0, r2, r1)     // Catch: java.lang.Throwable -> L51
        L3f:
            if (r2 < r1) goto L43
            monitor-exit(r9)
            return r0
        L43:
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L51
            int r5 = r9.fromSample     // Catch: java.lang.Throwable -> L51
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L51
            long r3 = r3 - r5
            r0[r2] = r3     // Catch: java.lang.Throwable -> L51
            int r2 = r2 + 1
            goto L3f
        L4e:
            r0 = 0
            monitor-exit(r9)
            return r0
        L51:
            r0 = move-exception
            monitor-exit(r9)
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
