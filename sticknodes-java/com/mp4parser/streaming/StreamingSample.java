package com.mp4parser.streaming;

/* loaded from: classes2.dex */
public interface StreamingSample {
    java.nio.ByteBuffer getContent();

    long getDuration();

    com.mp4parser.streaming.SampleExtension[] getExtensions();
}
