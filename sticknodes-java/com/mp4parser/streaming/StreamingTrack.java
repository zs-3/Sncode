package com.mp4parser.streaming;

/* loaded from: classes2.dex */
public interface StreamingTrack {
    void addTrackExtension(com.mp4parser.streaming.TrackExtension r1);

    java.lang.String getHandler();

    java.lang.String getLanguage();

    com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox();

    java.util.concurrent.BlockingQueue<com.mp4parser.streaming.StreamingSample> getSamples();

    long getTimescale();

    <T extends com.mp4parser.streaming.TrackExtension> T getTrackExtension(java.lang.Class<T> r1);

    com.coremedia.iso.boxes.TrackHeaderBox getTrackHeaderBox();

    boolean hasMoreSamples();

    void removeTrackExtension(java.lang.Class<? extends com.mp4parser.streaming.TrackExtension> r1);
}
