package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class Avc1ToAvc3TrackImpl extends com.googlecode.mp4parser.authoring.WrappingTrack {
    com.mp4parser.iso14496.part15.AvcConfigurationBox avcC;
    java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    com.coremedia.iso.boxes.SampleDescriptionBox stsd;

    private class ReplaceSyncSamplesList extends java.util.AbstractList<com.googlecode.mp4parser.authoring.Sample> {
        java.util.List<com.googlecode.mp4parser.authoring.Sample> parentSamples;
        final /* synthetic */ com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl this$0;


        public ReplaceSyncSamplesList(com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl r1, java.util.List<com.googlecode.mp4parser.authoring.Sample> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.parentSamples = r2
                return
        }

        static /* synthetic */ com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl access$1(com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl.ReplaceSyncSamplesList r0) {
                com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl r0 = r0.this$0
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public com.googlecode.mp4parser.authoring.Sample get(int r4) {
                r3 = this;
                com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl r0 = r3.this$0
                long[] r0 = r0.getSyncSamples()
                int r1 = r4 + 1
                long r1 = (long) r1
                int r0 = java.util.Arrays.binarySearch(r0, r1)
                if (r0 < 0) goto L2b
                com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl r0 = r3.this$0
                com.mp4parser.iso14496.part15.AvcConfigurationBox r0 = r0.avcC
                int r0 = r0.getLengthSizeMinusOne()
                int r0 = r0 + 1
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
                java.util.List<com.googlecode.mp4parser.authoring.Sample> r2 = r3.parentSamples
                java.lang.Object r4 = r2.get(r4)
                com.googlecode.mp4parser.authoring.Sample r4 = (com.googlecode.mp4parser.authoring.Sample) r4
                com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl$ReplaceSyncSamplesList$1 r2 = new com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl$ReplaceSyncSamplesList$1
                r2.<init>(r3, r1, r0, r4)
                return r2
            L2b:
                java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r3.parentSamples
                java.lang.Object r4 = r0.get(r4)
                com.googlecode.mp4parser.authoring.Sample r4 = (com.googlecode.mp4parser.authoring.Sample) r4
                return r4
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
                java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.parentSamples
                int r0 = r0.size()
                return r0
        }
    }

    public Avc1ToAvc3TrackImpl(com.googlecode.mp4parser.authoring.Track r4) throws java.io.IOException {
            r3 = this;
            r3.<init>(r4)
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r4.getSampleDescriptionBox()
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r0 = r0.getSampleEntry()
            java.lang.String r0 = r0.getType()
            java.lang.String r1 = "avc1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L62
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = r4.getSampleDescriptionBox()
            java.nio.channels.WritableByteChannel r2 = java.nio.channels.Channels.newChannel(r0)
            r1.getBox(r2)
            com.coremedia.iso.IsoFile r1 = new com.coremedia.iso.IsoFile
            com.googlecode.mp4parser.MemoryDataSourceImpl r2 = new com.googlecode.mp4parser.MemoryDataSourceImpl
            byte[] r0 = r0.toByteArray()
            r2.<init>(r0)
            r1.<init>(r2)
            java.lang.String r0 = "stsd"
            com.coremedia.iso.boxes.Box r0 = com.googlecode.mp4parser.util.Path.getPath(r1, r0)
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = (com.coremedia.iso.boxes.SampleDescriptionBox) r0
            r3.stsd = r0
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r0 = r0.getSampleEntry()
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r0 = (com.coremedia.iso.boxes.sampleentry.VisualSampleEntry) r0
            java.lang.String r1 = "avc3"
            r0.setType(r1)
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r3.stsd
            java.lang.String r1 = "avc./avcC"
            com.coremedia.iso.boxes.Box r0 = com.googlecode.mp4parser.util.Path.getPath(r0, r1)
            com.mp4parser.iso14496.part15.AvcConfigurationBox r0 = (com.mp4parser.iso14496.part15.AvcConfigurationBox) r0
            r3.avcC = r0
            com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl$ReplaceSyncSamplesList r0 = new com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl$ReplaceSyncSamplesList
            java.util.List r4 = r4.getSamples()
            r0.<init>(r3, r4)
            r3.samples = r0
            return
        L62:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Only avc1 tracks can be converted to avc3 tracks"
            r4.<init>(r0)
            throw r4
    }

    @Override // com.googlecode.mp4parser.authoring.WrappingTrack, com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.stsd
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.WrappingTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }
}
