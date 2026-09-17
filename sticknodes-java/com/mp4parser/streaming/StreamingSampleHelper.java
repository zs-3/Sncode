package com.mp4parser.streaming;

/* loaded from: classes2.dex */
public class StreamingSampleHelper {
    public StreamingSampleHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static <B extends com.mp4parser.streaming.SampleExtension> B getSampleExtension(com.mp4parser.streaming.StreamingSample r4, java.lang.Class<B> r5) {
            com.mp4parser.streaming.SampleExtension[] r4 = r4.getExtensions()
            int r0 = r4.length
            r1 = 0
        L6:
            if (r1 < r0) goto La
            r4 = 0
            return r4
        La:
            r2 = r4[r1]
            java.lang.Class r3 = r2.getClass()
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 == 0) goto L17
            return r2
        L17:
            int r1 = r1 + 1
            goto L6
    }

    static boolean hasSampleExtension(com.mp4parser.streaming.StreamingSample r4, java.lang.Class<? extends com.mp4parser.streaming.SampleExtension> r5) {
            com.mp4parser.streaming.SampleExtension[] r4 = r4.getExtensions()
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L7:
            if (r2 < r0) goto La
            return r1
        La:
            r3 = r4[r2]
            java.lang.Class r3 = r3.getClass()
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 == 0) goto L18
            r4 = 1
            return r4
        L18:
            int r2 = r2 + 1
            goto L7
    }
}
