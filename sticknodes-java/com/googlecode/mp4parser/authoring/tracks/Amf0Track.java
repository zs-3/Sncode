package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class Amf0Track extends com.googlecode.mp4parser.authoring.AbstractTrack {
    java.util.SortedMap<java.lang.Long, byte[]> rawSamples;
    private com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;


    public Amf0Track(java.util.Map<java.lang.Long, byte[]> r3) {
            r2 = this;
            java.lang.String r0 = "amf0"
            r2.<init>(r0)
            com.googlecode.mp4parser.authoring.tracks.Amf0Track$1 r0 = new com.googlecode.mp4parser.authoring.tracks.Amf0Track$1
            r0.<init>(r2)
            r2.rawSamples = r0
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r0.<init>()
            r2.trackMetaData = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r3)
            r2.rawSamples = r0
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r2.trackMetaData
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r3.setCreationTime(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r2.trackMetaData
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r3.setModificationTime(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r2.trackMetaData
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.setTimescale(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r2.trackMetaData
            java.lang.String r0 = "eng"
            r3.setLanguage(r0)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "data"
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r3 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r0.<init>()
            com.googlecode.mp4parser.boxes.adobe.ActionMessageFormat0SampleEntryBox r1 = new com.googlecode.mp4parser.boxes.adobe.ActionMessageFormat0SampleEntryBox
            r1.<init>()
            r2 = 1
            r1.setDataReferenceIndex(r2)
            r0.addBox(r1)
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
            r7 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            java.util.SortedMap<java.lang.Long, byte[]> r1 = r7.rawSamples
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.util.Collections.sort(r0)
            int r1 = r0.size()
            long[] r1 = new long[r1]
            r2 = 0
        L15:
            int r3 = r0.size()
            if (r2 < r3) goto L1c
            return r1
        L1c:
            java.lang.Object r3 = r0.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r5 = 0
            long r3 = r3 - r5
            r1[r2] = r3
            int r2 = r2 + 1
            goto L15
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r4 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.SortedMap<java.lang.Long, byte[]> r1 = r4.rawSamples
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L16
            return r0
        L16:
            java.lang.Object r2 = r1.next()
            byte[] r2 = (byte[]) r2
            com.googlecode.mp4parser.authoring.SampleImpl r3 = new com.googlecode.mp4parser.authoring.SampleImpl
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            r3.<init>(r2)
            r0.add(r3)
            goto Lf
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r1.trackMetaData
            return r0
    }
}
