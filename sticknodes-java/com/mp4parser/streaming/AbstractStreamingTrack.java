package com.mp4parser.streaming;

/* loaded from: classes2.dex */
public abstract class AbstractStreamingTrack implements com.mp4parser.streaming.StreamingTrack {
    protected java.util.concurrent.BlockingQueue<com.mp4parser.streaming.StreamingSample> samples;
    protected com.coremedia.iso.boxes.SampleDescriptionBox stsd;
    protected com.coremedia.iso.boxes.TrackHeaderBox tkhd;
    protected java.util.HashMap<java.lang.Class<? extends com.mp4parser.streaming.TrackExtension>, com.mp4parser.streaming.TrackExtension> trackExtensions;

    public AbstractStreamingTrack() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r1)
            r3.samples = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.trackExtensions = r0
            com.coremedia.iso.boxes.TrackHeaderBox r0 = new com.coremedia.iso.boxes.TrackHeaderBox
            r0.<init>()
            r3.tkhd = r0
            r1 = 1
            r0.setTrackId(r1)
            return
    }

    @Override // com.mp4parser.streaming.StreamingTrack
    public void addTrackExtension(com.mp4parser.streaming.TrackExtension r3) {
            r2 = this;
            java.util.HashMap<java.lang.Class<? extends com.mp4parser.streaming.TrackExtension>, com.mp4parser.streaming.TrackExtension> r0 = r2.trackExtensions
            java.lang.Class r1 = r3.getClass()
            r0.put(r1, r3)
            return
    }

    @Override // com.mp4parser.streaming.StreamingTrack
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.stsd
            return r0
    }

    @Override // com.mp4parser.streaming.StreamingTrack
    public java.util.concurrent.BlockingQueue<com.mp4parser.streaming.StreamingSample> getSamples() {
            r1 = this;
            java.util.concurrent.BlockingQueue<com.mp4parser.streaming.StreamingSample> r0 = r1.samples
            return r0
    }

    @Override // com.mp4parser.streaming.StreamingTrack
    public <T extends com.mp4parser.streaming.TrackExtension> T getTrackExtension(java.lang.Class<T> r2) {
            r1 = this;
            java.util.HashMap<java.lang.Class<? extends com.mp4parser.streaming.TrackExtension>, com.mp4parser.streaming.TrackExtension> r0 = r1.trackExtensions
            java.lang.Object r2 = r0.get(r2)
            com.mp4parser.streaming.TrackExtension r2 = (com.mp4parser.streaming.TrackExtension) r2
            return r2
    }

    @Override // com.mp4parser.streaming.StreamingTrack
    public com.coremedia.iso.boxes.TrackHeaderBox getTrackHeaderBox() {
            r1 = this;
            com.coremedia.iso.boxes.TrackHeaderBox r0 = r1.tkhd
            return r0
    }

    @Override // com.mp4parser.streaming.StreamingTrack
    public boolean hasMoreSamples() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.mp4parser.streaming.StreamingTrack
    public void removeTrackExtension(java.lang.Class<? extends com.mp4parser.streaming.TrackExtension> r2) {
            r1 = this;
            java.util.HashMap<java.lang.Class<? extends com.mp4parser.streaming.TrackExtension>, com.mp4parser.streaming.TrackExtension> r0 = r1.trackExtensions
            r0.remove(r2)
            return
    }
}
