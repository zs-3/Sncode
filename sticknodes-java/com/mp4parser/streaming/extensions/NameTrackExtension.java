package com.mp4parser.streaming.extensions;

/* loaded from: classes2.dex */
public class NameTrackExtension implements com.mp4parser.streaming.TrackExtension {
    private java.lang.String name;

    public NameTrackExtension() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.mp4parser.streaming.extensions.NameTrackExtension create(java.lang.String r1) {
            com.mp4parser.streaming.extensions.NameTrackExtension r0 = new com.mp4parser.streaming.extensions.NameTrackExtension
            r0.<init>()
            r0.name = r1
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
