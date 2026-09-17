package com.mp4parser.streaming.extensions;

/* loaded from: classes2.dex */
public class SampleFlagsSampleExtension implements com.mp4parser.streaming.SampleExtension {
    public static java.util.Map<java.lang.Long, com.mp4parser.streaming.extensions.SampleFlagsSampleExtension> pool;
    private byte isLeading;
    private int sampleDegradationPriority;
    private byte sampleDependsOn;
    private byte sampleHasRedundancy;
    private byte sampleIsDependedOn;
    private boolean sampleIsNonSyncSample;
    private byte samplePaddingValue;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            com.mp4parser.streaming.extensions.SampleFlagsSampleExtension.pool = r0
            return
    }

    public SampleFlagsSampleExtension() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.mp4parser.streaming.extensions.SampleFlagsSampleExtension create(byte r4, byte r5, byte r6, byte r7, byte r8, boolean r9, int r10) {
            int r0 = r5 << 2
            int r0 = r0 + r4
            int r1 = r6 << 4
            int r0 = r0 + r1
            int r1 = r7 << 6
            int r0 = r0 + r1
            long r0 = (long) r0
            int r2 = r8 << 8
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = r10 << 11
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = r9 << 27
            long r2 = (long) r2
            long r0 = r0 + r2
            java.util.Map<java.lang.Long, com.mp4parser.streaming.extensions.SampleFlagsSampleExtension> r2 = com.mp4parser.streaming.extensions.SampleFlagsSampleExtension.pool
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r2.get(r3)
            com.mp4parser.streaming.extensions.SampleFlagsSampleExtension r2 = (com.mp4parser.streaming.extensions.SampleFlagsSampleExtension) r2
            if (r2 != 0) goto L40
            com.mp4parser.streaming.extensions.SampleFlagsSampleExtension r2 = new com.mp4parser.streaming.extensions.SampleFlagsSampleExtension
            r2.<init>()
            r2.isLeading = r4
            r2.sampleDependsOn = r5
            r2.sampleIsDependedOn = r6
            r2.sampleHasRedundancy = r7
            r2.samplePaddingValue = r8
            r2.sampleIsNonSyncSample = r9
            r2.sampleDegradationPriority = r10
            java.util.Map<java.lang.Long, com.mp4parser.streaming.extensions.SampleFlagsSampleExtension> r4 = com.mp4parser.streaming.extensions.SampleFlagsSampleExtension.pool
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r4.put(r5, r2)
        L40:
            return r2
    }

    public byte getIsLeading() {
            r1 = this;
            byte r0 = r1.isLeading
            return r0
    }

    public int getSampleDegradationPriority() {
            r1 = this;
            int r0 = r1.sampleDegradationPriority
            return r0
    }

    public byte getSampleDependsOn() {
            r1 = this;
            byte r0 = r1.sampleDependsOn
            return r0
    }

    public byte getSampleHasRedundancy() {
            r1 = this;
            byte r0 = r1.sampleHasRedundancy
            return r0
    }

    public byte getSampleIsDependedOn() {
            r1 = this;
            byte r0 = r1.sampleIsDependedOn
            return r0
    }

    public byte getSamplePaddingValue() {
            r1 = this;
            byte r0 = r1.samplePaddingValue
            return r0
    }

    public boolean isSampleIsNonSyncSample() {
            r1 = this;
            boolean r0 = r1.sampleIsNonSyncSample
            return r0
    }

    public boolean isSyncSample() {
            r1 = this;
            boolean r0 = r1.sampleIsNonSyncSample
            r0 = r0 ^ 1
            return r0
    }

    public void setIsLeading(byte r1) {
            r0 = this;
            r0.isLeading = r1
            return
    }

    public void setSampleDegradationPriority(int r1) {
            r0 = this;
            r0.sampleDegradationPriority = r1
            return
    }

    public void setSampleDependsOn(byte r1) {
            r0 = this;
            r0.sampleDependsOn = r1
            return
    }

    public void setSampleHasRedundancy(byte r1) {
            r0 = this;
            r0.sampleHasRedundancy = r1
            return
    }

    public void setSampleIsDependedOn(byte r1) {
            r0 = this;
            r0.sampleIsDependedOn = r1
            return
    }

    public void setSampleIsNonSyncSample(boolean r1) {
            r0 = this;
            r0.sampleIsNonSyncSample = r1
            return
    }

    public void setSamplePaddingValue(byte r1) {
            r0 = this;
            r0.samplePaddingValue = r1
            return
    }
}
