package com.coremedia.iso.boxes.mdat;

/* loaded from: classes.dex */
public class SampleList extends java.util.AbstractList<com.googlecode.mp4parser.authoring.Sample> {
    java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;

    public SampleList(com.coremedia.iso.boxes.TrackBox r5, com.coremedia.iso.IsoFile... r6) {
            r4 = this;
            r4.<init>()
            com.coremedia.iso.boxes.Container r0 = r5.getParent()
            com.coremedia.iso.boxes.Box r0 = (com.coremedia.iso.boxes.Box) r0
            com.coremedia.iso.boxes.Container r0 = r0.getParent()
            com.coremedia.iso.boxes.Container r1 = r5.getParent()
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieExtendsBox> r2 = com.coremedia.iso.boxes.fragment.MovieExtendsBox.class
            java.util.List r1 = r1.getBoxes(r2)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L38
            int r6 = r6.length
            if (r6 > 0) goto L30
            com.googlecode.mp4parser.authoring.samples.DefaultMp4SampleList r6 = new com.googlecode.mp4parser.authoring.samples.DefaultMp4SampleList
            com.coremedia.iso.boxes.TrackHeaderBox r5 = r5.getTrackHeaderBox()
            long r1 = r5.getTrackId()
            r6.<init>(r1, r0)
            r4.samples = r6
            goto L47
        L30:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "The TrackBox comes from a standard MP4 file. Only use the additionalFragments param if you are dealing with ( fragmented MP4 files AND additional fragments in standalone files )"
            r5.<init>(r6)
            throw r5
        L38:
            com.googlecode.mp4parser.authoring.samples.FragmentedMp4SampleList r1 = new com.googlecode.mp4parser.authoring.samples.FragmentedMp4SampleList
            com.coremedia.iso.boxes.TrackHeaderBox r5 = r5.getTrackHeaderBox()
            long r2 = r5.getTrackId()
            r1.<init>(r2, r0, r6)
            r4.samples = r1
        L47:
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public com.googlecode.mp4parser.authoring.Sample get(int r2) {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            java.lang.Object r2 = r0.get(r2)
            com.googlecode.mp4parser.authoring.Sample r2 = (com.googlecode.mp4parser.authoring.Sample) r2
            return r2
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
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            int r0 = r0.size()
            return r0
    }
}
