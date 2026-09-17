package com.googlecode.mp4parser.authoring.samples;

/* loaded from: classes2.dex */
public class FragmentedMp4SampleList extends java.util.AbstractList<com.googlecode.mp4parser.authoring.Sample> {
    private java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentBox> allTrafs;
    private int[] firstSamples;
    com.coremedia.iso.IsoFile[] fragments;
    private java.lang.ref.SoftReference<com.googlecode.mp4parser.authoring.Sample>[] sampleCache;
    private int size_;
    com.coremedia.iso.boxes.Container topLevel;
    com.coremedia.iso.boxes.TrackBox trackBox;
    com.coremedia.iso.boxes.fragment.TrackExtendsBox trex;
    private java.util.Map<com.coremedia.iso.boxes.fragment.TrackRunBox, java.lang.ref.SoftReference<java.nio.ByteBuffer>> trunDataCache;


    public FragmentedMp4SampleList(long r5, com.coremedia.iso.boxes.Container r7, com.coremedia.iso.IsoFile... r8) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.trackBox = r0
            r4.trex = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.trunDataCache = r0
            r0 = -1
            r4.size_ = r0
            r4.topLevel = r7
            r4.fragments = r8
            java.lang.String r8 = "moov[0]/trak"
            java.util.List r8 = com.googlecode.mp4parser.util.Path.getPaths(r7, r8)
            java.util.Iterator r8 = r8.iterator()
        L20:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L7b
            com.coremedia.iso.boxes.TrackBox r8 = r4.trackBox
            if (r8 == 0) goto L67
            java.lang.String r5 = "moov[0]/mvex[0]/trex"
            java.util.List r5 = com.googlecode.mp4parser.util.Path.getPaths(r7, r5)
            java.util.Iterator r7 = r5.iterator()
        L34:
            boolean r5 = r7.hasNext()
            if (r5 != 0) goto L4c
            java.lang.Class<java.lang.ref.SoftReference> r5 = java.lang.ref.SoftReference.class
            int r6 = r4.size()
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r6)
            java.lang.ref.SoftReference[] r5 = (java.lang.ref.SoftReference[]) r5
            r4.sampleCache = r5
            r4.initAllFragments()
            return
        L4c:
            java.lang.Object r5 = r7.next()
            com.coremedia.iso.boxes.fragment.TrackExtendsBox r5 = (com.coremedia.iso.boxes.fragment.TrackExtendsBox) r5
            long r0 = r5.getTrackId()
            com.coremedia.iso.boxes.TrackBox r6 = r4.trackBox
            com.coremedia.iso.boxes.TrackHeaderBox r6 = r6.getTrackHeaderBox()
            long r2 = r6.getTrackId()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L34
            r4.trex = r5
            goto L34
        L67:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "This MP4 does not contain track "
            r8.<init>(r0)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            throw r7
        L7b:
            java.lang.Object r0 = r8.next()
            com.coremedia.iso.boxes.TrackBox r0 = (com.coremedia.iso.boxes.TrackBox) r0
            com.coremedia.iso.boxes.TrackHeaderBox r1 = r0.getTrackHeaderBox()
            long r1 = r1.getTrackId()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L20
            r4.trackBox = r0
            goto L20
    }

    private int getTrafSize(com.coremedia.iso.boxes.fragment.TrackFragmentBox r5) {
            r4 = this;
            java.util.List r5 = r5.getBoxes()
            r0 = 0
            r1 = 0
        L6:
            int r2 = r5.size()
            if (r0 < r2) goto Ld
            return r1
        Ld:
            java.lang.Object r2 = r5.get(r0)
            com.coremedia.iso.boxes.Box r2 = (com.coremedia.iso.boxes.Box) r2
            boolean r3 = r2 instanceof com.coremedia.iso.boxes.fragment.TrackRunBox
            if (r3 == 0) goto L22
            com.coremedia.iso.boxes.fragment.TrackRunBox r2 = (com.coremedia.iso.boxes.fragment.TrackRunBox) r2
            long r2 = r2.getSampleCount()
            int r2 = com.googlecode.mp4parser.util.CastUtils.l2i(r2)
            int r1 = r1 + r2
        L22:
            int r0 = r0 + 1
            goto L6
    }

    private java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentBox> initAllFragments() {
            r13 = this;
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r0 = r13.allTrafs
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.coremedia.iso.boxes.Container r1 = r13.topLevel
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieFragmentBox> r2 = com.coremedia.iso.boxes.fragment.MovieFragmentBox.class
            java.util.List r1 = r1.getBoxes(r2)
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L9a
            com.coremedia.iso.IsoFile[] r1 = r13.fragments
            r2 = 0
            if (r1 == 0) goto L72
            int r3 = r1.length
            r4 = 0
        L23:
            if (r4 < r3) goto L26
            goto L72
        L26:
            r5 = r1[r4]
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieFragmentBox> r6 = com.coremedia.iso.boxes.fragment.MovieFragmentBox.class
            java.util.List r5 = r5.getBoxes(r6)
            java.util.Iterator r5 = r5.iterator()
        L32:
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L3b
            int r4 = r4 + 1
            goto L23
        L3b:
            java.lang.Object r6 = r5.next()
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r6 = (com.coremedia.iso.boxes.fragment.MovieFragmentBox) r6
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r7 = com.coremedia.iso.boxes.fragment.TrackFragmentBox.class
            java.util.List r6 = r6.getBoxes(r7)
            java.util.Iterator r6 = r6.iterator()
        L4b:
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L52
            goto L32
        L52:
            java.lang.Object r7 = r6.next()
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r7 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r7
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r8 = r7.getTrackFragmentHeaderBox()
            long r8 = r8.getTrackId()
            com.coremedia.iso.boxes.TrackBox r10 = r13.trackBox
            com.coremedia.iso.boxes.TrackHeaderBox r10 = r10.getTrackHeaderBox()
            long r10 = r10.getTrackId()
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L4b
            r0.add(r7)
            goto L4b
        L72:
            r13.allTrafs = r0
            int r1 = r0.size()
            int[] r1 = new int[r1]
            r13.firstSamples = r1
            r1 = 1
        L7d:
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r3 = r13.allTrafs
            int r3 = r3.size()
            if (r2 < r3) goto L86
            return r0
        L86:
            int[] r3 = r13.firstSamples
            r3[r2] = r1
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r3 = r13.allTrafs
            java.lang.Object r3 = r3.get(r2)
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r3 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r3
            int r3 = r13.getTrafSize(r3)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L7d
        L9a:
            java.lang.Object r2 = r1.next()
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r2 = (com.coremedia.iso.boxes.fragment.MovieFragmentBox) r2
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r3 = com.coremedia.iso.boxes.fragment.TrackFragmentBox.class
            java.util.List r2 = r2.getBoxes(r3)
            java.util.Iterator r2 = r2.iterator()
        Laa:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto Lb2
            goto L16
        Lb2:
            java.lang.Object r3 = r2.next()
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r3 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r3
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r4 = r3.getTrackFragmentHeaderBox()
            long r4 = r4.getTrackId()
            com.coremedia.iso.boxes.TrackBox r6 = r13.trackBox
            com.coremedia.iso.boxes.TrackHeaderBox r6 = r6.getTrackHeaderBox()
            long r6 = r6.getTrackId()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto Laa
            r0.add(r3)
            goto Laa
    }

    @Override // java.util.AbstractList, java.util.List
    public com.googlecode.mp4parser.authoring.Sample get(int r17) {
            r16 = this;
            r7 = r16
            java.lang.ref.SoftReference<com.googlecode.mp4parser.authoring.Sample>[] r0 = r7.sampleCache
            r1 = r0[r17]
            if (r1 == 0) goto L13
            r0 = r0[r17]
            java.lang.Object r0 = r0.get()
            com.googlecode.mp4parser.authoring.Sample r0 = (com.googlecode.mp4parser.authoring.Sample) r0
            if (r0 == 0) goto L13
            return r0
        L13:
            int r0 = r17 + 1
            int[] r1 = r7.firstSamples
            int r1 = r1.length
            int r1 = r1 + (-1)
        L1a:
            int[] r2 = r7.firstSamples
            r2 = r2[r1]
            int r2 = r0 - r2
            if (r2 < 0) goto L140
            java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r2 = r7.allTrafs
            java.lang.Object r2 = r2.get(r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r2 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r2
            int[] r3 = r7.firstSamples
            r1 = r3[r1]
            int r0 = r0 - r1
            com.coremedia.iso.boxes.Container r1 = r2.getParent()
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r1 = (com.coremedia.iso.boxes.fragment.MovieFragmentBox) r1
            java.util.List r3 = r2.getBoxes()
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L3e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L138
            java.lang.Object r6 = r3.next()
            com.coremedia.iso.boxes.Box r6 = (com.coremedia.iso.boxes.Box) r6
            boolean r8 = r6 instanceof com.coremedia.iso.boxes.fragment.TrackRunBox
            if (r8 == 0) goto L3e
            com.coremedia.iso.boxes.fragment.TrackRunBox r6 = (com.coremedia.iso.boxes.fragment.TrackRunBox) r6
            java.util.List r8 = r6.getEntries()
            int r8 = r8.size()
            int r9 = r0 - r5
            if (r8 >= r9) goto L66
            java.util.List r6 = r6.getEntries()
            int r6 = r6.size()
            int r5 = r5 + r6
            goto L3e
        L66:
            java.util.List r8 = r6.getEntries()
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r0 = r2.getTrackFragmentHeaderBox()
            boolean r10 = r6.isSampleSizePresent()
            boolean r2 = r0.hasDefaultSampleSize()
            r11 = 0
            if (r10 != 0) goto L93
            if (r2 == 0) goto L82
            long r2 = r0.getDefaultSampleSize()
        L80:
            r13 = r2
            goto L94
        L82:
            com.coremedia.iso.boxes.fragment.TrackExtendsBox r2 = r7.trex
            if (r2 == 0) goto L8b
            long r2 = r2.getDefaultSampleSize()
            goto L80
        L8b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size."
            r0.<init>(r1)
            throw r0
        L93:
            r13 = r11
        L94:
            java.util.Map<com.coremedia.iso.boxes.fragment.TrackRunBox, java.lang.ref.SoftReference<java.nio.ByteBuffer>> r2 = r7.trunDataCache
            java.lang.Object r2 = r2.get(r6)
            java.lang.ref.SoftReference r2 = (java.lang.ref.SoftReference) r2
            if (r2 == 0) goto La5
            java.lang.Object r2 = r2.get()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            goto La6
        La5:
            r2 = 0
        La6:
            if (r2 != 0) goto Lfa
            boolean r2 = r0.hasBaseDataOffset()
            if (r2 == 0) goto Lb7
            long r2 = r0.getBaseDataOffset()
            long r11 = r11 + r2
            com.coremedia.iso.boxes.Container r1 = r1.getParent()
        Lb7:
            boolean r0 = r6.isDataOffsetPresent()
            if (r0 == 0) goto Lc3
            int r0 = r6.getDataOffset()
            long r2 = (long) r0
            long r11 = r11 + r2
        Lc3:
            java.util.Iterator r0 = r8.iterator()
            r2 = 0
        Lc8:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto Le6
            long r2 = (long) r2
            java.nio.ByteBuffer r0 = r1.getByteBuffer(r11, r2)     // Catch: java.io.IOException -> Ldf
            java.util.Map<com.coremedia.iso.boxes.fragment.TrackRunBox, java.lang.ref.SoftReference<java.nio.ByteBuffer>> r1 = r7.trunDataCache     // Catch: java.io.IOException -> Ldf
            java.lang.ref.SoftReference r2 = new java.lang.ref.SoftReference     // Catch: java.io.IOException -> Ldf
            r2.<init>(r0)     // Catch: java.io.IOException -> Ldf
            r1.put(r6, r2)     // Catch: java.io.IOException -> Ldf
            r6 = r0
            goto Lfb
        Ldf:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        Le6:
            java.lang.Object r3 = r0.next()
            com.coremedia.iso.boxes.fragment.TrackRunBox$Entry r3 = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry) r3
            if (r10 == 0) goto Lf6
            long r4 = (long) r2
            long r2 = r3.getSampleSize()
            long r4 = r4 + r2
            int r2 = (int) r4
            goto Lc8
        Lf6:
            long r2 = (long) r2
            long r2 = r2 + r13
            int r2 = (int) r2
            goto Lc8
        Lfa:
            r6 = r2
        Lfb:
            r4 = 0
            r15 = 0
        Lfd:
            if (r4 < r9) goto L122
            if (r10 == 0) goto L10d
            java.lang.Object r0 = r8.get(r9)
            com.coremedia.iso.boxes.fragment.TrackRunBox$Entry r0 = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry) r0
            long r0 = r0.getSampleSize()
            r3 = r0
            goto L10e
        L10d:
            r3 = r13
        L10e:
            com.googlecode.mp4parser.authoring.samples.FragmentedMp4SampleList$1 r0 = new com.googlecode.mp4parser.authoring.samples.FragmentedMp4SampleList$1
            r1 = r0
            r2 = r16
            r5 = r6
            r6 = r15
            r1.<init>(r2, r3, r5, r6)
            java.lang.ref.SoftReference<com.googlecode.mp4parser.authoring.Sample>[] r1 = r7.sampleCache
            java.lang.ref.SoftReference r2 = new java.lang.ref.SoftReference
            r2.<init>(r0)
            r1[r17] = r2
            return r0
        L122:
            if (r10 == 0) goto L131
            long r0 = (long) r15
            java.lang.Object r2 = r8.get(r4)
            com.coremedia.iso.boxes.fragment.TrackRunBox$Entry r2 = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry) r2
            long r2 = r2.getSampleSize()
            long r0 = r0 + r2
            goto L133
        L131:
            long r0 = (long) r15
            long r0 = r0 + r13
        L133:
            int r1 = (int) r0
            r15 = r1
            int r4 = r4 + 1
            goto Lfd
        L138:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Couldn't find sample in the traf I was looking"
            r0.<init>(r1)
            throw r0
        L140:
            int r1 = r1 + (-1)
            goto L1a
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.googlecode.mp4parser.authoring.Sample r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r14 = this;
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackRunBox> r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.class
            int r1 = r14.size_
            r2 = -1
            if (r1 == r2) goto L8
            return r1
        L8:
            com.coremedia.iso.boxes.Container r1 = r14.topLevel
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieFragmentBox> r2 = com.coremedia.iso.boxes.fragment.MovieFragmentBox.class
            java.util.List r1 = r1.getBoxes(r2)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L16:
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L7f
            com.coremedia.iso.IsoFile[] r4 = r14.fragments
            int r5 = r4.length
            r6 = 0
        L20:
            if (r6 < r5) goto L25
            r14.size_ = r3
            return r3
        L25:
            r1 = r4[r6]
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieFragmentBox> r7 = com.coremedia.iso.boxes.fragment.MovieFragmentBox.class
            java.util.List r1 = r1.getBoxes(r7)
            java.util.Iterator r7 = r1.iterator()
        L31:
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L3a
            int r6 = r6 + 1
            goto L20
        L3a:
            java.lang.Object r1 = r7.next()
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r1 = (com.coremedia.iso.boxes.fragment.MovieFragmentBox) r1
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r8 = com.coremedia.iso.boxes.fragment.TrackFragmentBox.class
            java.util.List r1 = r1.getBoxes(r8)
            java.util.Iterator r8 = r1.iterator()
        L4a:
            boolean r1 = r8.hasNext()
            if (r1 != 0) goto L51
            goto L31
        L51:
            java.lang.Object r1 = r8.next()
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r1 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r1
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r9 = r1.getTrackFragmentHeaderBox()
            long r9 = r9.getTrackId()
            com.coremedia.iso.boxes.TrackBox r11 = r14.trackBox
            com.coremedia.iso.boxes.TrackHeaderBox r11 = r11.getTrackHeaderBox()
            long r11 = r11.getTrackId()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L4a
            long r9 = (long) r3
            java.util.List r1 = r1.getBoxes(r0)
            java.lang.Object r1 = r1.get(r2)
            com.coremedia.iso.boxes.fragment.TrackRunBox r1 = (com.coremedia.iso.boxes.fragment.TrackRunBox) r1
            long r11 = r1.getSampleCount()
            long r9 = r9 + r11
            int r3 = (int) r9
            goto L4a
        L7f:
            java.lang.Object r4 = r1.next()
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r4 = (com.coremedia.iso.boxes.fragment.MovieFragmentBox) r4
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r5 = com.coremedia.iso.boxes.fragment.TrackFragmentBox.class
            java.util.List r4 = r4.getBoxes(r5)
            java.util.Iterator r4 = r4.iterator()
        L8f:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L96
            goto L16
        L96:
            java.lang.Object r5 = r4.next()
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r5 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r5
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r6 = r5.getTrackFragmentHeaderBox()
            long r6 = r6.getTrackId()
            com.coremedia.iso.boxes.TrackBox r8 = r14.trackBox
            com.coremedia.iso.boxes.TrackHeaderBox r8 = r8.getTrackHeaderBox()
            long r8 = r8.getTrackId()
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L8f
            long r6 = (long) r3
            java.util.List r3 = r5.getBoxes(r0)
            java.lang.Object r3 = r3.get(r2)
            com.coremedia.iso.boxes.fragment.TrackRunBox r3 = (com.coremedia.iso.boxes.fragment.TrackRunBox) r3
            long r8 = r3.getSampleCount()
            long r6 = r6 + r8
            int r3 = (int) r6
            goto L8f
    }
}
