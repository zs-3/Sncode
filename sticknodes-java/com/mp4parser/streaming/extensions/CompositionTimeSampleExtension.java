package com.mp4parser.streaming.extensions;

/* loaded from: classes2.dex */
public class CompositionTimeSampleExtension implements com.mp4parser.streaming.SampleExtension {
    public static java.util.Map<java.lang.Integer, com.mp4parser.streaming.extensions.CompositionTimeSampleExtension> pool;
    private int ctts;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            com.mp4parser.streaming.extensions.CompositionTimeSampleExtension.pool = r0
            return
    }

    public CompositionTimeSampleExtension() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.mp4parser.streaming.extensions.CompositionTimeSampleExtension create(int r2) {
            java.util.Map<java.lang.Integer, com.mp4parser.streaming.extensions.CompositionTimeSampleExtension> r0 = com.mp4parser.streaming.extensions.CompositionTimeSampleExtension.pool
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.get(r1)
            com.mp4parser.streaming.extensions.CompositionTimeSampleExtension r0 = (com.mp4parser.streaming.extensions.CompositionTimeSampleExtension) r0
            if (r0 != 0) goto L1e
            com.mp4parser.streaming.extensions.CompositionTimeSampleExtension r0 = new com.mp4parser.streaming.extensions.CompositionTimeSampleExtension
            r0.<init>()
            r0.ctts = r2
            java.util.Map<java.lang.Integer, com.mp4parser.streaming.extensions.CompositionTimeSampleExtension> r1 = com.mp4parser.streaming.extensions.CompositionTimeSampleExtension.pool
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r0)
        L1e:
            return r0
    }

    public int getCompositionTimeOffset() {
            r1 = this;
            int r0 = r1.ctts
            return r0
    }
}
