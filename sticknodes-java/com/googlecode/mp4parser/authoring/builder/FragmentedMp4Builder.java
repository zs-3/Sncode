package com.googlecode.mp4parser.authoring.builder;

/* loaded from: classes2.dex */
public class FragmentedMp4Builder implements com.googlecode.mp4parser.authoring.builder.Mp4Builder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.logging.Logger LOG = null;
    protected com.googlecode.mp4parser.authoring.builder.Fragmenter fragmenter;



    static {
            java.lang.Class<com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder> r0 = com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder.LOG = r0
            return
    }

    public FragmentedMp4Builder() {
            r0 = this;
            r0.<init>()
            return
    }

    private long getTrackDuration(com.googlecode.mp4parser.authoring.Movie r5, com.googlecode.mp4parser.authoring.Track r6) {
            r4 = this;
            long r0 = r6.getDuration()
            long r2 = r5.getTimescale()
            long r0 = r0 * r2
            com.googlecode.mp4parser.authoring.TrackMetaData r5 = r6.getTrackMetaData()
            long r5 = r5.getTimescale()
            long r0 = r0 / r5
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.builder.Mp4Builder
    public com.coremedia.iso.boxes.Container build(com.googlecode.mp4parser.authoring.Movie r4) {
            r3 = this;
            java.util.logging.Logger r0 = com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder.LOG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Creating movie "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.fine(r1)
            com.googlecode.mp4parser.authoring.builder.Fragmenter r0 = r3.fragmenter
            if (r0 != 0) goto L20
            com.googlecode.mp4parser.authoring.builder.TimeBasedFragmenter r0 = new com.googlecode.mp4parser.authoring.builder.TimeBasedFragmenter
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0.<init>(r1)
            r3.fragmenter = r0
        L20:
            com.googlecode.mp4parser.BasicContainer r0 = new com.googlecode.mp4parser.BasicContainer
            r0.<init>()
            com.coremedia.iso.boxes.Box r1 = r3.createFtyp(r4)
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r3.createMoov(r4)
            r0.addBox(r1)
            java.util.List r1 = r3.createMoofMdat(r4)
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L49
            com.coremedia.iso.boxes.Box r4 = r3.createMfra(r4, r0)
            r0.addBox(r4)
            return r0
        L49:
            java.lang.Object r2 = r1.next()
            com.coremedia.iso.boxes.Box r2 = (com.coremedia.iso.boxes.Box) r2
            r0.addBox(r2)
            goto L3b
    }

    protected com.coremedia.iso.boxes.DataInformationBox createDinf(com.googlecode.mp4parser.authoring.Movie r3, com.googlecode.mp4parser.authoring.Track r4) {
            r2 = this;
            com.coremedia.iso.boxes.DataInformationBox r3 = new com.coremedia.iso.boxes.DataInformationBox
            r3.<init>()
            com.coremedia.iso.boxes.DataReferenceBox r4 = new com.coremedia.iso.boxes.DataReferenceBox
            r4.<init>()
            r3.addBox(r4)
            com.coremedia.iso.boxes.DataEntryUrlBox r0 = new com.coremedia.iso.boxes.DataEntryUrlBox
            r0.<init>()
            r1 = 1
            r0.setFlags(r1)
            r4.addBox(r0)
            return r3
    }

    protected com.coremedia.iso.boxes.Box createEdts(com.googlecode.mp4parser.authoring.Track r13, com.googlecode.mp4parser.authoring.Movie r14) {
            r12 = this;
            java.util.List r0 = r13.getEdits()
            if (r0 == 0) goto L6f
            java.util.List r0 = r13.getEdits()
            int r0 = r0.size()
            if (r0 <= 0) goto L6f
            com.coremedia.iso.boxes.EditListBox r0 = new com.coremedia.iso.boxes.EditListBox
            r0.<init>()
            r1 = 1
            r0.setVersion(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r1 = r13.getEdits()
            java.util.Iterator r10 = r1.iterator()
        L26:
            boolean r1 = r10.hasNext()
            if (r1 != 0) goto L38
            r0.setEntries(r9)
            com.coremedia.iso.boxes.EditBox r13 = new com.coremedia.iso.boxes.EditBox
            r13.<init>()
            r13.addBox(r0)
            return r13
        L38:
            java.lang.Object r1 = r10.next()
            com.googlecode.mp4parser.authoring.Edit r1 = (com.googlecode.mp4parser.authoring.Edit) r1
            com.coremedia.iso.boxes.EditListBox$Entry r11 = new com.coremedia.iso.boxes.EditListBox$Entry
            double r2 = r1.getSegmentDuration()
            long r4 = r14.getTimescale()
            double r4 = (double) r4
            double r2 = r2 * r4
            long r3 = java.lang.Math.round(r2)
            long r5 = r1.getMediaTime()
            com.googlecode.mp4parser.authoring.TrackMetaData r2 = r13.getTrackMetaData()
            long r7 = r2.getTimescale()
            long r5 = r5 * r7
            long r7 = r1.getTimeScale()
            long r5 = r5 / r7
            double r7 = r1.getMediaRate()
            r1 = r11
            r2 = r0
            r1.<init>(r2, r3, r5, r7)
            r9.add(r11)
            goto L26
        L6f:
            r13 = 0
            return r13
    }

    protected int createFragment(java.util.List<com.coremedia.iso.boxes.Box> r8, com.googlecode.mp4parser.authoring.Track r9, long r10, long r12, int r14) {
            r7 = this;
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L18
            r0 = r7
            r1 = r10
            r3 = r12
            r5 = r9
            r6 = r14
            com.coremedia.iso.boxes.Box r0 = r0.createMoof(r1, r3, r5, r6)
            r8.add(r0)
            r0 = r7
            com.coremedia.iso.boxes.Box r9 = r0.createMdat(r1, r3, r5, r6)
            r8.add(r9)
        L18:
            return r14
    }

    public com.coremedia.iso.boxes.Box createFtyp(com.googlecode.mp4parser.authoring.Movie r5) {
            r4 = this;
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.lang.String r0 = "isom"
            r5.add(r0)
            java.lang.String r1 = "iso2"
            r5.add(r1)
            java.lang.String r1 = "avc1"
            r5.add(r1)
            com.coremedia.iso.boxes.FileTypeBox r1 = new com.coremedia.iso.boxes.FileTypeBox
            r2 = 0
            r1.<init>(r0, r2, r5)
            return r1
    }

    protected com.coremedia.iso.boxes.Box createMdat(long r8, long r10, com.googlecode.mp4parser.authoring.Track r12, int r13) {
            r7 = this;
            com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder$1Mdat r13 = new com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder$1Mdat
            r0 = r13
            r1 = r7
            r2 = r8
            r4 = r10
            r6 = r12
            r0.<init>(r1, r2, r4, r6)
            return r13
    }

    protected com.coremedia.iso.boxes.Box createMdhd(com.googlecode.mp4parser.authoring.Movie r3, com.googlecode.mp4parser.authoring.Track r4) {
            r2 = this;
            com.coremedia.iso.boxes.MediaHeaderBox r3 = new com.coremedia.iso.boxes.MediaHeaderBox
            r3.<init>()
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r4.getTrackMetaData()
            java.util.Date r0 = r0.getCreationTime()
            r3.setCreationTime(r0)
            java.util.Date r0 = r2.getDate()
            r3.setModificationTime(r0)
            r0 = 0
            r3.setDuration(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r4.getTrackMetaData()
            long r0 = r0.getTimescale()
            r3.setTimescale(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r4.getTrackMetaData()
            java.lang.String r4 = r4.getLanguage()
            r3.setLanguage(r4)
            return r3
    }

    protected com.coremedia.iso.boxes.Box createMdia(com.googlecode.mp4parser.authoring.Track r3, com.googlecode.mp4parser.authoring.Movie r4) {
            r2 = this;
            com.coremedia.iso.boxes.MediaBox r0 = new com.coremedia.iso.boxes.MediaBox
            r0.<init>()
            com.coremedia.iso.boxes.Box r1 = r2.createMdhd(r4, r3)
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r2.createMdiaHdlr(r3, r4)
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r3 = r2.createMinf(r3, r4)
            r0.addBox(r3)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMdiaHdlr(com.googlecode.mp4parser.authoring.Track r1, com.googlecode.mp4parser.authoring.Movie r2) {
            r0 = this;
            com.coremedia.iso.boxes.HandlerBox r2 = new com.coremedia.iso.boxes.HandlerBox
            r2.<init>()
            java.lang.String r1 = r1.getHandler()
            r2.setHandlerType(r1)
            return r2
    }

    protected void createMfhd(long r1, long r3, com.googlecode.mp4parser.authoring.Track r5, int r6, com.coremedia.iso.boxes.fragment.MovieFragmentBox r7) {
            r0 = this;
            com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox r1 = new com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox
            r1.<init>()
            long r2 = (long) r6
            r1.setSequenceNumber(r2)
            r7.addBox(r1)
            return
    }

    protected com.coremedia.iso.boxes.Box createMfra(com.googlecode.mp4parser.authoring.Movie r4, com.coremedia.iso.boxes.Container r5) {
            r3 = this;
            com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessBox r0 = new com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessBox
            r0.<init>()
            java.util.List r4 = r4.getTracks()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L23
            com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox r4 = new com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox
            r4.<init>()
            r0.addBox(r4)
            long r1 = r0.getSize()
            r4.setMfraSize(r1)
            return r0
        L23:
            java.lang.Object r1 = r4.next()
            com.googlecode.mp4parser.authoring.Track r1 = (com.googlecode.mp4parser.authoring.Track) r1
            com.coremedia.iso.boxes.Box r1 = r3.createTfra(r1, r5)
            r0.addBox(r1)
            goto Ld
    }

    protected com.coremedia.iso.boxes.Box createMinf(com.googlecode.mp4parser.authoring.Track r4, com.googlecode.mp4parser.authoring.Movie r5) {
            r3 = this;
            com.coremedia.iso.boxes.MediaInformationBox r0 = new com.coremedia.iso.boxes.MediaInformationBox
            r0.<init>()
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "vide"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1a
            com.coremedia.iso.boxes.VideoMediaHeaderBox r1 = new com.coremedia.iso.boxes.VideoMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L82
        L1a:
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "soun"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2f
            com.coremedia.iso.boxes.SoundMediaHeaderBox r1 = new com.coremedia.iso.boxes.SoundMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L82
        L2f:
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "text"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L44
            com.coremedia.iso.boxes.NullMediaHeaderBox r1 = new com.coremedia.iso.boxes.NullMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L82
        L44:
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "subt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L59
            com.coremedia.iso.boxes.SubtitleMediaHeaderBox r1 = new com.coremedia.iso.boxes.SubtitleMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L82
        L59:
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "hint"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            com.coremedia.iso.boxes.HintMediaHeaderBox r1 = new com.coremedia.iso.boxes.HintMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L82
        L6e:
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "sbtl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L82
            com.coremedia.iso.boxes.NullMediaHeaderBox r1 = new com.coremedia.iso.boxes.NullMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
        L82:
            com.coremedia.iso.boxes.DataInformationBox r1 = r3.createDinf(r5, r4)
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r4 = r3.createStbl(r5, r4)
            r0.addBox(r4)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMoof(long r10, long r12, com.googlecode.mp4parser.authoring.Track r14, int r15) {
            r9 = this;
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r8 = new com.coremedia.iso.boxes.fragment.MovieFragmentBox
            r8.<init>()
            r0 = r9
            r1 = r10
            r3 = r12
            r5 = r14
            r6 = r15
            r7 = r8
            r0.createMfhd(r1, r3, r5, r6, r7)
            r0.createTraf(r1, r3, r5, r6, r7)
            java.util.List r10 = r8.getTrackRunBoxes()
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            com.coremedia.iso.boxes.fragment.TrackRunBox r10 = (com.coremedia.iso.boxes.fragment.TrackRunBox) r10
            r11 = 1
            r10.setDataOffset(r11)
            long r11 = r8.getSize()
            r13 = 8
            long r11 = r11 + r13
            int r12 = (int) r11
            r10.setDataOffset(r12)
            return r8
    }

    protected java.util.List<com.coremedia.iso.boxes.Box> createMoofMdat(com.googlecode.mp4parser.authoring.Movie r27) {
            r26 = this;
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.List r0 = r27.getTracks()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto Ldd
            r11 = 1
            r12 = 1
        L1f:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L26
            return r8
        L26:
            r0 = 0
            r1 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            java.util.Set r3 = r10.entrySet()
            java.util.Iterator r3 = r3.iterator()
            r13 = r0
        L35:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto Lb0
            java.lang.Object r0 = r9.get(r13)
            r14 = r0
            long[] r14 = (long[]) r14
            r15 = 0
            r4 = r14[r15]
            int r0 = r14.length
            if (r0 <= r11) goto L4b
            r6 = r14[r11]
            goto L55
        L4b:
            java.util.List r0 = r13.getSamples()
            int r0 = r0.size()
            int r0 = r0 + r11
            long r6 = (long) r0
        L55:
            long[] r0 = r13.getSampleDurations()
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r13.getTrackMetaData()
            r16 = r12
            long r11 = r3.getTimescale()
            r17 = r1
            r1 = r4
        L66:
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L95
            r0 = r26
            r1 = r8
            r2 = r13
            r3 = r4
            r5 = r6
            r7 = r16
            r0.createFragment(r1, r2, r3, r5, r7)
            int r0 = r14.length
            r3 = 1
            if (r0 != r3) goto L80
            r9.remove(r13)
            r10.remove(r13)
            goto L91
        L80:
            int r0 = r14.length
            int r0 = r0 - r3
            long[] r1 = new long[r0]
            java.lang.System.arraycopy(r14, r3, r1, r15, r0)
            r9.put(r13, r1)
            java.lang.Double r0 = java.lang.Double.valueOf(r17)
            r10.put(r13, r0)
        L91:
            int r12 = r16 + 1
            r11 = 1
            goto L1f
        L95:
            r3 = 1
            r19 = 1
            long r21 = r1 - r19
            int r21 = com.googlecode.mp4parser.util.CastUtils.l2i(r21)
            r22 = r4
            r3 = r0[r21]
            double r3 = (double) r3
            r24 = r6
            double r5 = (double) r11
            double r3 = r3 / r5
            double r17 = r17 + r3
            long r1 = r1 + r19
            r4 = r22
            r6 = r24
            goto L66
        Lb0:
            r16 = r12
            r4 = 1
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getValue()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto Ld8
            java.lang.Object r1 = r0.getValue()
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            java.lang.Object r0 = r0.getKey()
            r13 = r0
            com.googlecode.mp4parser.authoring.Track r13 = (com.googlecode.mp4parser.authoring.Track) r13
        Ld8:
            r12 = r16
            r11 = 1
            goto L35
        Ldd:
            java.lang.Object r1 = r0.next()
            com.googlecode.mp4parser.authoring.Track r1 = (com.googlecode.mp4parser.authoring.Track) r1
            r2 = r26
            com.googlecode.mp4parser.authoring.builder.Fragmenter r3 = r2.fragmenter
            long[] r3 = r3.sampleNumbers(r1)
            r9.put(r1, r3)
            r3 = 0
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r10.put(r1, r3)
            goto L17
    }

    protected com.coremedia.iso.boxes.Box createMoov(com.googlecode.mp4parser.authoring.Movie r4) {
            r3 = this;
            com.coremedia.iso.boxes.MovieBox r0 = new com.coremedia.iso.boxes.MovieBox
            r0.<init>()
            com.coremedia.iso.boxes.Box r1 = r3.createMvhd(r4)
            r0.addBox(r1)
            java.util.List r1 = r4.getTracks()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L22
            com.coremedia.iso.boxes.Box r4 = r3.createMvex(r4)
            r0.addBox(r4)
            return r0
        L22:
            java.lang.Object r2 = r1.next()
            com.googlecode.mp4parser.authoring.Track r2 = (com.googlecode.mp4parser.authoring.Track) r2
            com.coremedia.iso.boxes.Box r2 = r3.createTrak(r2, r4)
            r0.addBox(r2)
            goto L14
    }

    protected com.coremedia.iso.boxes.Box createMvex(com.googlecode.mp4parser.authoring.Movie r9) {
            r8 = this;
            com.coremedia.iso.boxes.fragment.MovieExtendsBox r0 = new com.coremedia.iso.boxes.fragment.MovieExtendsBox
            r0.<init>()
            com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox r1 = new com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox
            r1.<init>()
            r2 = 1
            r1.setVersion(r2)
            java.util.List r2 = r9.getTracks()
            java.util.Iterator r2 = r2.iterator()
        L16:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L3c
            r0.addBox(r1)
            java.util.List r1 = r9.getTracks()
            java.util.Iterator r3 = r1.iterator()
        L27:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L2e
            return r0
        L2e:
            java.lang.Object r1 = r3.next()
            com.googlecode.mp4parser.authoring.Track r1 = (com.googlecode.mp4parser.authoring.Track) r1
            com.coremedia.iso.boxes.Box r1 = r8.createTrex(r9, r1)
            r0.addBox(r1)
            goto L27
        L3c:
            java.lang.Object r3 = r2.next()
            com.googlecode.mp4parser.authoring.Track r3 = (com.googlecode.mp4parser.authoring.Track) r3
            long r3 = r8.getTrackDuration(r9, r3)
            long r5 = r1.getFragmentDuration()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L16
            r1.setFragmentDuration(r3)
            goto L16
    }

    protected com.coremedia.iso.boxes.Box createMvhd(com.googlecode.mp4parser.authoring.Movie r8) {
            r7 = this;
            com.coremedia.iso.boxes.MovieHeaderBox r0 = new com.coremedia.iso.boxes.MovieHeaderBox
            r0.<init>()
            r1 = 1
            r0.setVersion(r1)
            java.util.Date r1 = r7.getDate()
            r0.setCreationTime(r1)
            java.util.Date r1 = r7.getDate()
            r0.setModificationTime(r1)
            r1 = 0
            r0.setDuration(r1)
            long r3 = r8.getTimescale()
            r0.setTimescale(r3)
            java.util.List r8 = r8.getTracks()
            java.util.Iterator r8 = r8.iterator()
        L2b:
            boolean r3 = r8.hasNext()
            if (r3 != 0) goto L38
            r3 = 1
            long r1 = r1 + r3
            r0.setNextTrackId(r1)
            return r0
        L38:
            java.lang.Object r3 = r8.next()
            com.googlecode.mp4parser.authoring.Track r3 = (com.googlecode.mp4parser.authoring.Track) r3
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r3.getTrackMetaData()
            long r4 = r4.getTrackId()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L2b
            com.googlecode.mp4parser.authoring.TrackMetaData r1 = r3.getTrackMetaData()
            long r1 = r1.getTrackId()
            goto L2b
    }

    protected void createSaio(long r3, long r5, com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack r7, int r8, com.coremedia.iso.boxes.fragment.TrackFragmentBox r9) {
            r2 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r3 = r7.getSampleDescriptionBox()
            java.lang.String r4 = "enc.[0]/sinf[0]/schm[0]"
            com.coremedia.iso.boxes.Box r3 = com.googlecode.mp4parser.util.Path.getPath(r3, r4)
            com.coremedia.iso.boxes.SchemeTypeBox r3 = (com.coremedia.iso.boxes.SchemeTypeBox) r3
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r3 = new com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox
            r3.<init>()
            r9.addBox(r3)
            java.lang.String r4 = "cenc"
            r3.setAuxInfoType(r4)
            r4 = 1
            r3.setFlags(r4)
            r5 = 8
            java.util.List r7 = r9.getBoxes()
            java.util.Iterator r7 = r7.iterator()
        L27:
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L2e
            goto L40
        L2e:
            java.lang.Object r8 = r7.next()
            com.coremedia.iso.boxes.Box r8 = (com.coremedia.iso.boxes.Box) r8
            boolean r0 = r8 instanceof com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox
            if (r0 == 0) goto L6f
            com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox r8 = (com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox) r8
            int r7 = r8.getOffsetToFirstIV()
            long r7 = (long) r7
            long r5 = r5 + r7
        L40:
            com.coremedia.iso.boxes.Container r7 = r9.getParent()
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r7 = (com.coremedia.iso.boxes.fragment.MovieFragmentBox) r7
            r0 = 16
            long r5 = r5 + r0
            java.util.List r7 = r7.getBoxes()
            java.util.Iterator r0 = r7.iterator()
        L51:
            boolean r7 = r0.hasNext()
            if (r7 != 0) goto L58
            goto L60
        L58:
            java.lang.Object r7 = r0.next()
            com.coremedia.iso.boxes.Box r7 = (com.coremedia.iso.boxes.Box) r7
            if (r7 != r9) goto L69
        L60:
            long[] r4 = new long[r4]
            r7 = 0
            r4[r7] = r5
            r3.setOffsets(r4)
            return
        L69:
            long r7 = r7.getSize()
            long r5 = r5 + r7
            goto L51
        L6f:
            long r0 = r8.getSize()
            long r5 = r5 + r0
            goto L27
    }

    protected void createSaiz(long r6, long r8, com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack r10, int r11, com.coremedia.iso.boxes.fragment.TrackFragmentBox r12) {
            r5 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r11 = r10.getSampleDescriptionBox()
            java.lang.String r0 = "enc.[0]/sinf[0]/schm[0]"
            com.coremedia.iso.boxes.Box r0 = com.googlecode.mp4parser.util.Path.getPath(r11, r0)
            com.coremedia.iso.boxes.SchemeTypeBox r0 = (com.coremedia.iso.boxes.SchemeTypeBox) r0
            java.lang.String r0 = "enc.[0]/sinf[0]/schi[0]/tenc[0]"
            com.coremedia.iso.boxes.Box r11 = com.googlecode.mp4parser.util.Path.getPath(r11, r0)
            com.mp4parser.iso23001.part7.TrackEncryptionBox r11 = (com.mp4parser.iso23001.part7.TrackEncryptionBox) r11
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r0 = new com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox
            r0.<init>()
            java.lang.String r1 = "cenc"
            r0.setAuxInfoType(r1)
            r1 = 1
            r0.setFlags(r1)
            boolean r1 = r10.hasSubSampleEncryption()
            if (r1 == 0) goto L5b
            long r1 = r8 - r6
            int r1 = com.googlecode.mp4parser.util.CastUtils.l2i(r1)
            short[] r2 = new short[r1]
            java.util.List r10 = r10.getSampleEncryptionEntries()
            r3 = 1
            long r6 = r6 - r3
            int r6 = com.googlecode.mp4parser.util.CastUtils.l2i(r6)
            long r8 = r8 - r3
            int r7 = com.googlecode.mp4parser.util.CastUtils.l2i(r8)
            java.util.List r10 = r10.subList(r6, r7)
            r6 = 0
        L45:
            if (r6 < r1) goto L4b
            r0.setSampleInfoSizes(r2)
            goto L6a
        L4b:
            java.lang.Object r7 = r10.get(r6)
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r7 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat) r7
            int r7 = r7.getSize()
            short r7 = (short) r7
            r2[r6] = r7
            int r6 = r6 + 1
            goto L45
        L5b:
            int r10 = r11.getDefaultIvSize()
            r0.setDefaultSampleInfoSize(r10)
            long r8 = r8 - r6
            int r6 = com.googlecode.mp4parser.util.CastUtils.l2i(r8)
            r0.setSampleCount(r6)
        L6a:
            r12.addBox(r0)
            return
    }

    protected void createSenc(long r3, long r5, com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack r7, int r8, com.coremedia.iso.boxes.fragment.TrackFragmentBox r9) {
            r2 = this;
            com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox r8 = new com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox
            r8.<init>()
            boolean r0 = r7.hasSubSampleEncryption()
            r8.setSubSampleEncryption(r0)
            java.util.List r7 = r7.getSampleEncryptionEntries()
            r0 = 1
            long r3 = r3 - r0
            int r3 = com.googlecode.mp4parser.util.CastUtils.l2i(r3)
            long r5 = r5 - r0
            int r4 = com.googlecode.mp4parser.util.CastUtils.l2i(r5)
            java.util.List r3 = r7.subList(r3, r4)
            r8.setEntries(r3)
            r9.addBox(r8)
            return
    }

    protected com.coremedia.iso.boxes.Box createStbl(com.googlecode.mp4parser.authoring.Movie r1, com.googlecode.mp4parser.authoring.Track r2) {
            r0 = this;
            com.coremedia.iso.boxes.SampleTableBox r1 = new com.coremedia.iso.boxes.SampleTableBox
            r1.<init>()
            r0.createStsd(r2, r1)
            com.coremedia.iso.boxes.TimeToSampleBox r2 = new com.coremedia.iso.boxes.TimeToSampleBox
            r2.<init>()
            r1.addBox(r2)
            com.coremedia.iso.boxes.SampleToChunkBox r2 = new com.coremedia.iso.boxes.SampleToChunkBox
            r2.<init>()
            r1.addBox(r2)
            com.coremedia.iso.boxes.SampleSizeBox r2 = new com.coremedia.iso.boxes.SampleSizeBox
            r2.<init>()
            r1.addBox(r2)
            com.coremedia.iso.boxes.StaticChunkOffsetBox r2 = new com.coremedia.iso.boxes.StaticChunkOffsetBox
            r2.<init>()
            r1.addBox(r2)
            return r1
    }

    protected void createStsd(com.googlecode.mp4parser.authoring.Track r1, com.coremedia.iso.boxes.SampleTableBox r2) {
            r0 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = r1.getSampleDescriptionBox()
            r2.addBox(r1)
            return
    }

    protected void createTfdt(long r8, com.googlecode.mp4parser.authoring.Track r10, com.coremedia.iso.boxes.fragment.TrackFragmentBox r11) {
            r7 = this;
            com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox r0 = new com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox
            r0.<init>()
            r1 = 1
            r0.setVersion(r1)
            long[] r10 = r10.getSampleDurations()
            r2 = 0
        Lf:
            long r4 = (long) r1
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 < 0) goto L1b
            r0.setBaseMediaDecodeTime(r2)
            r11.addBox(r0)
            return
        L1b:
            int r4 = r1 + (-1)
            r4 = r10[r4]
            long r2 = r2 + r4
            int r1 = r1 + 1
            goto Lf
    }

    protected void createTfhd(long r1, long r3, com.googlecode.mp4parser.authoring.Track r5, int r6, com.coremedia.iso.boxes.fragment.TrackFragmentBox r7) {
            r0 = this;
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r1 = new com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox
            r1.<init>()
            com.coremedia.iso.boxes.fragment.SampleFlags r2 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r2.<init>()
            r1.setDefaultSampleFlags(r2)
            r2 = -1
            r1.setBaseDataOffset(r2)
            com.googlecode.mp4parser.authoring.TrackMetaData r2 = r5.getTrackMetaData()
            long r2 = r2.getTrackId()
            r1.setTrackId(r2)
            r2 = 1
            r1.setDefaultBaseIsMoof(r2)
            r7.addBox(r1)
            return
    }

    protected com.coremedia.iso.boxes.Box createTfra(com.googlecode.mp4parser.authoring.Track r34, com.coremedia.iso.boxes.Container r35) {
            r33 = this;
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox r0 = new com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox
            r0.<init>()
            r1 = 1
            r0.setVersion(r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.lang.String r2 = "moov/mvex/trex"
            r3 = r35
            java.util.List r2 = com.googlecode.mp4parser.util.Path.getPaths(r3, r2)
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
        L1b:
            boolean r5 = r2.hasNext()
            if (r5 != 0) goto L1b6
            java.util.List r2 = r35.getBoxes()
            java.util.Iterator r5 = r2.iterator()
            r2 = 0
            r6 = r2
        L2c:
            boolean r8 = r5.hasNext()
            if (r8 != 0) goto L41
            r0.setEntries(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r1 = r34.getTrackMetaData()
            long r1 = r1.getTrackId()
            r0.setTrackId(r1)
            return r0
        L41:
            java.lang.Object r8 = r5.next()
            r15 = r8
            com.coremedia.iso.boxes.Box r15 = (com.coremedia.iso.boxes.Box) r15
            boolean r8 = r15 instanceof com.coremedia.iso.boxes.fragment.MovieFragmentBox
            if (r8 == 0) goto L19d
            r8 = r15
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r8 = (com.coremedia.iso.boxes.fragment.MovieFragmentBox) r8
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r9 = com.coremedia.iso.boxes.fragment.TrackFragmentBox.class
            java.util.List r13 = r8.getBoxes(r9)
            r14 = 0
            r11 = 0
        L57:
            int r8 = r13.size()
            if (r11 < r8) goto L5f
            goto L19d
        L5f:
            java.lang.Object r8 = r13.get(r11)
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r8 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r8
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r9 = r8.getTrackFragmentHeaderBox()
            long r9 = r9.getTrackId()
            com.googlecode.mp4parser.authoring.TrackMetaData r12 = r34.getTrackMetaData()
            long r16 = r12.getTrackId()
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 != 0) goto L17e
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackRunBox> r9 = com.coremedia.iso.boxes.fragment.TrackRunBox.class
            java.util.List r12 = r8.getBoxes(r9)
            r9 = 0
        L80:
            int r8 = r12.size()
            if (r9 < r8) goto L88
            goto L17e
        L88:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.lang.Object r8 = r12.get(r9)
            r17 = r8
            com.coremedia.iso.boxes.fragment.TrackRunBox r17 = (com.coremedia.iso.boxes.fragment.TrackRunBox) r17
            r18 = r6
            r7 = 0
        L98:
            java.util.List r6 = r17.getEntries()
            int r6 = r6.size()
            if (r7 < r6) goto Lcc
            int r6 = r10.size()
            java.util.List r7 = r17.getEntries()
            int r7 = r7.size()
            if (r6 != r7) goto Lc4
            java.util.List r6 = r17.getEntries()
            int r6 = r6.size()
            if (r6 <= 0) goto Lc4
            java.lang.Object r6 = r10.get(r14)
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry r6 = (com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry) r6
            r1.add(r6)
            goto Lc7
        Lc4:
            r1.addAll(r10)
        Lc7:
            int r9 = r9 + 1
            r6 = r18
            goto L80
        Lcc:
            java.util.List r6 = r17.getEntries()
            java.lang.Object r6 = r6.get(r7)
            r20 = r6
            com.coremedia.iso.boxes.fragment.TrackRunBox$Entry r20 = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry) r20
            if (r7 != 0) goto Le5
            boolean r6 = r17.isFirstSampleFlagsPresent()
            if (r6 == 0) goto Le5
            com.coremedia.iso.boxes.fragment.SampleFlags r6 = r17.getFirstSampleFlags()
            goto Lf4
        Le5:
            boolean r6 = r17.isSampleFlagsPresent()
            if (r6 == 0) goto Lf0
            com.coremedia.iso.boxes.fragment.SampleFlags r6 = r20.getSampleFlags()
            goto Lf4
        Lf0:
            com.coremedia.iso.boxes.fragment.SampleFlags r6 = r4.getDefaultSampleFlags()
        Lf4:
            if (r6 != 0) goto L10b
            java.lang.String r8 = r34.getHandler()
            java.lang.String r14 = "vide"
            boolean r8 = r8.equals(r14)
            if (r8 != 0) goto L103
            goto L10b
        L103:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot find SampleFlags for video track but it's required to build tfra"
            r0.<init>(r1)
            throw r0
        L10b:
            if (r6 == 0) goto L12c
            int r6 = r6.getSampleDependsOn()
            r8 = 2
            if (r6 != r8) goto L115
            goto L12c
        L115:
            r21 = r0
            r22 = r1
            r23 = r4
            r24 = r5
            r27 = r7
            r28 = r9
            r4 = r10
            r30 = r11
            r31 = r12
            r1 = r13
            r25 = r15
            r32 = 0
            goto L161
        L12c:
            com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry r14 = new com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$Entry
            int r6 = r11 + 1
            r21 = r0
            r22 = r1
            long r0 = (long) r6
            int r6 = r9 + 1
            r23 = r4
            r24 = r5
            long r4 = (long) r6
            int r6 = r7 + 1
            r25 = r4
            long r4 = (long) r6
            r6 = r14
            r27 = r7
            r7 = r18
            r28 = r9
            r29 = r10
            r9 = r2
            r30 = r11
            r31 = r12
            r11 = r0
            r1 = r13
            r0 = r14
            r32 = 0
            r13 = r25
            r25 = r15
            r15 = r4
            r6.<init>(r7, r9, r11, r13, r15)
            r4 = r29
            r4.add(r0)
        L161:
            long r5 = r20.getSampleDuration()
            long r18 = r18 + r5
            int r7 = r27 + 1
            r13 = r1
            r10 = r4
            r0 = r21
            r1 = r22
            r4 = r23
            r5 = r24
            r15 = r25
            r9 = r28
            r11 = r30
            r12 = r31
            r14 = 0
            goto L98
        L17e:
            r21 = r0
            r22 = r1
            r23 = r4
            r24 = r5
            r30 = r11
            r1 = r13
            r25 = r15
            r32 = 0
            int r11 = r30 + 1
            r13 = r1
            r0 = r21
            r1 = r22
            r4 = r23
            r5 = r24
            r15 = r25
            r14 = 0
            goto L57
        L19d:
            r21 = r0
            r22 = r1
            r23 = r4
            r24 = r5
            r25 = r15
            long r0 = r25.getSize()
            long r2 = r2 + r0
            r0 = r21
            r1 = r22
            r4 = r23
            r5 = r24
            goto L2c
        L1b6:
            r21 = r0
            r22 = r1
            r23 = r4
            java.lang.Object r0 = r2.next()
            r4 = r0
            com.coremedia.iso.boxes.fragment.TrackExtendsBox r4 = (com.coremedia.iso.boxes.fragment.TrackExtendsBox) r4
            long r0 = r4.getTrackId()
            com.googlecode.mp4parser.authoring.TrackMetaData r5 = r34.getTrackMetaData()
            long r5 = r5.getTrackId()
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = r21
            r1 = r22
            if (r7 != 0) goto L1d9
            goto L1b
        L1d9:
            r4 = r23
            goto L1b
    }

    protected com.coremedia.iso.boxes.Box createTkhd(com.googlecode.mp4parser.authoring.Movie r3, com.googlecode.mp4parser.authoring.Track r4) {
            r2 = this;
            com.coremedia.iso.boxes.TrackHeaderBox r3 = new com.coremedia.iso.boxes.TrackHeaderBox
            r3.<init>()
            r0 = 1
            r3.setVersion(r0)
            r0 = 7
            r3.setFlags(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r4.getTrackMetaData()
            int r0 = r0.getGroup()
            r3.setAlternateGroup(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r4.getTrackMetaData()
            java.util.Date r0 = r0.getCreationTime()
            r3.setCreationTime(r0)
            r0 = 0
            r3.setDuration(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r4.getTrackMetaData()
            double r0 = r0.getHeight()
            r3.setHeight(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r4.getTrackMetaData()
            double r0 = r0.getWidth()
            r3.setWidth(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r4.getTrackMetaData()
            int r0 = r0.getLayer()
            r3.setLayer(r0)
            java.util.Date r0 = r2.getDate()
            r3.setModificationTime(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r4.getTrackMetaData()
            long r0 = r0.getTrackId()
            r3.setTrackId(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r4.getTrackMetaData()
            float r4 = r4.getVolume()
            r3.setVolume(r4)
            return r3
    }

    protected void createTraf(long r17, long r19, com.googlecode.mp4parser.authoring.Track r21, int r22, com.coremedia.iso.boxes.fragment.MovieFragmentBox r23) {
            r16 = this;
            r8 = r17
            r10 = r21
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r11 = new com.coremedia.iso.boxes.fragment.TrackFragmentBox
            r11.<init>()
            r0 = r23
            r0.addBox(r11)
            r0 = r16
            r1 = r17
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r11
            r0.createTfhd(r1, r3, r5, r6, r7)
            r12 = r16
            r12.createTfdt(r8, r10, r11)
            r0.createTrun(r1, r3, r5, r6, r7)
            boolean r0 = r10 instanceof com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
            if (r0 == 0) goto L3e
            r13 = r10
            com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack r13 = (com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack) r13
            r0 = r16
            r1 = r17
            r3 = r19
            r5 = r13
            r6 = r22
            r7 = r11
            r0.createSaiz(r1, r3, r5, r6, r7)
            r0.createSenc(r1, r3, r5, r6, r7)
            r0.createSaio(r1, r3, r5, r6, r7)
        L3e:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r1 = r21.getSampleGroups()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L4f:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto Lfa
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L5d:
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L64
            return
        L64:
            java.lang.Object r0 = r2.next()
            r3 = r0
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox r4 = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox
            r4.<init>()
            java.lang.Object r0 = r3.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.getValue()
            java.util.List r1 = (java.util.List) r1
            r4.setGroupEntries(r1)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox r5 = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox
            r5.<init>()
            r5.setGroupingType(r0)
            r0 = 0
            r6 = 1
            long r13 = r8 - r6
            int r1 = com.googlecode.mp4parser.util.CastUtils.l2i(r13)
            r13 = r0
            r14 = r1
        L92:
            long r0 = r19 - r6
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            if (r14 < r0) goto La1
            r11.addBox(r4)
            r11.addBox(r5)
            goto L5d
        La1:
            r0 = 0
            r1 = 0
        La3:
            java.lang.Object r15 = r3.getValue()
            java.util.List r15 = (java.util.List) r15
            int r15 = r15.size()
            if (r0 < r15) goto Ld1
            if (r13 == 0) goto Lc1
            int r0 = r13.getGroupDescriptionIndex()
            if (r0 == r1) goto Lb8
            goto Lc1
        Lb8:
            long r0 = r13.getSampleCount()
            long r0 = r0 + r6
            r13.setSampleCount(r0)
            goto Lce
        Lc1:
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry r0 = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry
            r0.<init>(r6, r1)
            java.util.List r1 = r5.getEntries()
            r1.add(r0)
            r13 = r0
        Lce:
            int r14 = r14 + 1
            goto L92
        Ld1:
            java.lang.Object r15 = r3.getValue()
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r15 = r15.get(r0)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r15 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r15
            java.util.Map r6 = r21.getSampleGroups()
            java.lang.Object r6 = r6.get(r15)
            long[] r6 = (long[]) r6
            r15 = r1
            r7 = r2
            long r1 = (long) r14
            int r1 = java.util.Arrays.binarySearch(r6, r1)
            if (r1 < 0) goto Lf3
            int r1 = r0 + 1
            goto Lf4
        Lf3:
            r1 = r15
        Lf4:
            int r0 = r0 + 1
            r2 = r7
            r6 = 1
            goto La3
        Lfa:
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r3 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r3
            java.lang.String r3 = r3.getType()
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L11a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
        L11a:
            java.lang.Object r2 = r2.getKey()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r2 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r2
            r4.add(r2)
            goto L4f
    }

    protected com.coremedia.iso.boxes.Box createTrak(com.googlecode.mp4parser.authoring.Track r4, com.googlecode.mp4parser.authoring.Movie r5) {
            r3 = this;
            java.util.logging.Logger r0 = com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder.LOG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Creating Track "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.fine(r1)
            com.coremedia.iso.boxes.TrackBox r0 = new com.coremedia.iso.boxes.TrackBox
            r0.<init>()
            com.coremedia.iso.boxes.Box r1 = r3.createTkhd(r5, r4)
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r3.createEdts(r4, r5)
            if (r1 == 0) goto L28
            r0.addBox(r1)
        L28:
            com.coremedia.iso.boxes.Box r4 = r3.createMdia(r4, r5)
            r0.addBox(r4)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createTrex(com.googlecode.mp4parser.authoring.Movie r4, com.googlecode.mp4parser.authoring.Track r5) {
            r3 = this;
            com.coremedia.iso.boxes.fragment.TrackExtendsBox r4 = new com.coremedia.iso.boxes.fragment.TrackExtendsBox
            r4.<init>()
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r5.getTrackMetaData()
            long r0 = r0.getTrackId()
            r4.setTrackId(r0)
            r0 = 1
            r4.setDefaultSampleDescriptionIndex(r0)
            r0 = 0
            r4.setDefaultSampleDuration(r0)
            r4.setDefaultSampleSize(r0)
            com.coremedia.iso.boxes.fragment.SampleFlags r0 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r0.<init>()
            java.lang.String r1 = r5.getHandler()
            java.lang.String r2 = "soun"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3a
            java.lang.String r5 = r5.getHandler()
            java.lang.String r1 = "subt"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L41
        L3a:
            r5 = 2
            r0.setSampleDependsOn(r5)
            r0.setSampleIsDependedOn(r5)
        L41:
            r4.setDefaultSampleFlags(r0)
            return r4
    }

    protected void createTrun(long r19, long r21, com.googlecode.mp4parser.authoring.Track r23, int r24, com.coremedia.iso.boxes.fragment.TrackFragmentBox r25) {
            r18 = this;
            com.coremedia.iso.boxes.fragment.TrackRunBox r0 = new com.coremedia.iso.boxes.fragment.TrackRunBox
            r0.<init>()
            r1 = 1
            r0.setVersion(r1)
            long[] r2 = r18.getSampleSizes(r19, r21, r23, r24)
            r0.setSampleDurationPresent(r1)
            r0.setSampleSizePresent(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            long r4 = r21 - r19
            int r4 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)
            r3.<init>(r4)
            java.util.List r4 = r23.getCompositionTimeEntries()
            if (r4 == 0) goto L37
            int r5 = r4.size()
            if (r5 <= 0) goto L37
            int r5 = r4.size()
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry[] r5 = new com.coremedia.iso.boxes.CompositionTimeToSample.Entry[r5]
            java.lang.Object[] r4 = r4.toArray(r5)
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry[] r4 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry[]) r4
            goto L38
        L37:
            r4 = 0
        L38:
            r5 = 0
            if (r4 == 0) goto L42
            r6 = r4[r5]
            int r6 = r6.getCount()
            goto L43
        L42:
            r6 = -1
        L43:
            long r6 = (long) r6
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L4c
            r10 = 1
            goto L4d
        L4c:
            r10 = 0
        L4d:
            r0.setSampleCompositionTimeOffsetPresent(r10)
            r12 = 1
            r14 = 0
        L53:
            int r15 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r15 < 0) goto L140
            java.util.List r12 = r23.getSampleDependencies()
            if (r12 == 0) goto L67
            java.util.List r12 = r23.getSampleDependencies()
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L75
        L67:
            long[] r12 = r23.getSyncSamples()
            if (r12 == 0) goto L77
            long[] r12 = r23.getSyncSamples()
            int r12 = r12.length
            if (r12 != 0) goto L75
            goto L77
        L75:
            r15 = 1
            goto L78
        L77:
            r15 = 0
        L78:
            r0.setSampleFlagsPresent(r15)
            r12 = 0
        L7c:
            int r13 = r2.length
            if (r12 < r13) goto L88
            r0.setEntries(r3)
            r13 = r25
            r13.addBox(r0)
            return
        L88:
            r13 = r25
            com.coremedia.iso.boxes.fragment.TrackRunBox$Entry r8 = new com.coremedia.iso.boxes.fragment.TrackRunBox$Entry
            r8.<init>()
            r10 = r2[r12]
            r8.setSampleSize(r10)
            if (r15 == 0) goto Lfc
            com.coremedia.iso.boxes.fragment.SampleFlags r9 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r9.<init>()
            java.util.List r10 = r23.getSampleDependencies()
            if (r10 == 0) goto Lca
            java.util.List r10 = r23.getSampleDependencies()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Lca
            java.util.List r10 = r23.getSampleDependencies()
            java.lang.Object r10 = r10.get(r12)
            com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry r10 = (com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry) r10
            int r11 = r10.getSampleDependsOn()
            r9.setSampleDependsOn(r11)
            int r11 = r10.getSampleIsDependentOn()
            r9.setSampleIsDependedOn(r11)
            int r10 = r10.getSampleHasRedundancy()
            r9.setSampleHasRedundancy(r10)
        Lca:
            long[] r10 = r23.getSyncSamples()
            if (r10 == 0) goto Lf6
            long[] r10 = r23.getSyncSamples()
            int r10 = r10.length
            if (r10 <= 0) goto Lf6
            long[] r10 = r23.getSyncSamples()
            r24 = r2
            long r1 = (long) r12
            long r1 = r19 + r1
            int r1 = java.util.Arrays.binarySearch(r10, r1)
            if (r1 < 0) goto Lee
            r9.setSampleIsDifferenceSample(r5)
            r1 = 2
            r9.setSampleDependsOn(r1)
            goto Lf8
        Lee:
            r1 = 1
            r9.setSampleIsDifferenceSample(r1)
            r9.setSampleDependsOn(r1)
            goto Lf8
        Lf6:
            r24 = r2
        Lf8:
            r8.setSampleFlags(r9)
            goto Lfe
        Lfc:
            r24 = r2
        Lfe:
            long[] r1 = r23.getSampleDurations()
            long r9 = (long) r12
            long r9 = r19 + r9
            r16 = 1
            long r9 = r9 - r16
            int r2 = com.googlecode.mp4parser.util.CastUtils.l2i(r9)
            r9 = r1[r2]
            r8.setSampleDuration(r9)
            if (r4 == 0) goto L134
            r1 = r4[r14]
            int r1 = r1.getOffset()
            r8.setSampleCompositionTimeOffset(r1)
            long r6 = r6 - r16
            r1 = 0
            int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r9 != 0) goto L134
            int r1 = r4.length
            int r1 = r1 - r14
            r2 = 1
            if (r1 <= r2) goto L134
            int r14 = r14 + 1
            r1 = r4[r14]
            int r1 = r1.getCount()
            long r1 = (long) r1
            r6 = r1
        L134:
            r3.add(r8)
            int r12 = r12 + 1
            r2 = r24
            r1 = 1
            r8 = 0
            goto L7c
        L140:
            r24 = r2
            if (r4 == 0) goto L15c
            r1 = 1
            long r6 = r6 - r1
            r1 = 0
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 != 0) goto L15e
            int r8 = r4.length
            int r8 = r8 - r14
            r9 = 1
            if (r8 <= r9) goto L15f
            int r14 = r14 + 1
            r6 = r4[r14]
            int r6 = r6.getCount()
            long r6 = (long) r6
            goto L15f
        L15c:
            r1 = 0
        L15e:
            r9 = 1
        L15f:
            r10 = 1
            long r12 = r12 + r10
            r8 = r1
            r1 = 1
            r2 = r24
            goto L53
    }

    public java.util.Date getDate() {
            r1 = this;
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            return r0
    }

    public com.googlecode.mp4parser.authoring.builder.Fragmenter getFragmenter() {
            r1 = this;
            com.googlecode.mp4parser.authoring.builder.Fragmenter r0 = r1.fragmenter
            return r0
    }

    protected long[] getSampleSizes(long r1, long r3, com.googlecode.mp4parser.authoring.Track r5, int r6) {
            r0 = this;
            java.util.List r1 = r0.getSamples(r1, r3, r5)
            int r2 = r1.size()
            long[] r3 = new long[r2]
            r4 = 0
        Lb:
            if (r4 < r2) goto Le
            return r3
        Le:
            java.lang.Object r5 = r1.get(r4)
            com.googlecode.mp4parser.authoring.Sample r5 = (com.googlecode.mp4parser.authoring.Sample) r5
            long r5 = r5.getSize()
            r3[r4] = r5
            int r4 = r4 + 1
            goto Lb
    }

    protected java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples(long r1, long r3, com.googlecode.mp4parser.authoring.Track r5) {
            r0 = this;
            java.util.List r5 = r5.getSamples()
            int r1 = com.googlecode.mp4parser.util.CastUtils.l2i(r1)
            int r1 = r1 + (-1)
            int r2 = com.googlecode.mp4parser.util.CastUtils.l2i(r3)
            int r2 = r2 + (-1)
            java.util.List r1 = r5.subList(r1, r2)
            return r1
    }

    public void setFragmenter(com.googlecode.mp4parser.authoring.builder.Fragmenter r1) {
            r0 = this;
            r0.fragmenter = r1
            return
    }

    protected java.util.List<com.googlecode.mp4parser.authoring.Track> sortTracksInSequence(java.util.List<com.googlecode.mp4parser.authoring.Track> r2, int r3, java.util.Map<com.googlecode.mp4parser.authoring.Track, long[]> r4) {
            r1 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r2)
            com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder$1 r2 = new com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder$1
            r2.<init>(r1, r4, r3)
            java.util.Collections.sort(r0, r2)
            return r0
    }
}
