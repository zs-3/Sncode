package com.googlecode.mp4parser.authoring.builder;

/* loaded from: classes2.dex */
public class StaticFragmentIntersectionFinderImpl implements com.googlecode.mp4parser.authoring.builder.Fragmenter {
    java.util.Map<com.googlecode.mp4parser.authoring.Track, long[]> sampleNumbers;

    public StaticFragmentIntersectionFinderImpl(java.util.Map<com.googlecode.mp4parser.authoring.Track, long[]> r1) {
            r0 = this;
            r0.<init>()
            r0.sampleNumbers = r1
            return
    }

    @Override // com.googlecode.mp4parser.authoring.builder.Fragmenter
    public long[] sampleNumbers(com.googlecode.mp4parser.authoring.Track r2) {
            r1 = this;
            java.util.Map<com.googlecode.mp4parser.authoring.Track, long[]> r0 = r1.sampleNumbers
            java.lang.Object r2 = r0.get(r2)
            long[] r2 = (long[]) r2
            return r2
    }
}
