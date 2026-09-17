package com.googlecode.mp4parser.authoring;

/* loaded from: classes2.dex */
public class Mp4TrackImpl extends com.googlecode.mp4parser.authoring.AbstractTrack {
    private java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> compositionTimeEntries;
    private long[] decodingTimes;
    com.coremedia.iso.IsoFile[] fragments;
    private java.lang.String handler;
    private java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> sampleDependencies;
    private com.coremedia.iso.boxes.SampleDescriptionBox sampleDescriptionBox;
    private java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    private com.coremedia.iso.boxes.SubSampleInformationBox subSampleInformationBox;
    private long[] syncSamples;
    com.coremedia.iso.boxes.TrackBox trackBox;
    private com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;

    public Mp4TrackImpl(java.lang.String r29, com.coremedia.iso.boxes.TrackBox r30, com.coremedia.iso.IsoFile... r31) {
            r28 = this;
            r0 = r28
            r1 = r30
            r2 = r31
            r28.<init>(r29)
            r3 = 0
            r0.syncSamples = r3
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r4.<init>()
            r0.trackMetaData = r4
            r0.subSampleInformationBox = r3
            r0.trackBox = r1
            com.coremedia.iso.boxes.TrackHeaderBox r3 = r30.getTrackHeaderBox()
            long r3 = r3.getTrackId()
            com.coremedia.iso.boxes.mdat.SampleList r5 = new com.coremedia.iso.boxes.mdat.SampleList
            r5.<init>(r1, r2)
            r0.samples = r5
            com.coremedia.iso.boxes.MediaBox r5 = r30.getMediaBox()
            com.coremedia.iso.boxes.MediaInformationBox r5 = r5.getMediaInformationBox()
            com.coremedia.iso.boxes.SampleTableBox r5 = r5.getSampleTableBox()
            com.coremedia.iso.boxes.MediaBox r6 = r30.getMediaBox()
            com.coremedia.iso.boxes.HandlerBox r6 = r6.getHandlerBox()
            java.lang.String r6 = r6.getHandlerType()
            r0.handler = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.compositionTimeEntries = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.sampleDependencies = r7
            com.coremedia.iso.boxes.TimeToSampleBox r7 = r5.getTimeToSampleBox()
            java.util.List r7 = r7.getEntries()
            r6.addAll(r7)
            com.coremedia.iso.boxes.CompositionTimeToSample r7 = r5.getCompositionTimeToSample()
            if (r7 == 0) goto L71
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r7 = r0.compositionTimeEntries
            com.coremedia.iso.boxes.CompositionTimeToSample r8 = r5.getCompositionTimeToSample()
            java.util.List r8 = r8.getEntries()
            r7.addAll(r8)
        L71:
            com.coremedia.iso.boxes.SampleDependencyTypeBox r7 = r5.getSampleDependencyTypeBox()
            if (r7 == 0) goto L84
            java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry> r7 = r0.sampleDependencies
            com.coremedia.iso.boxes.SampleDependencyTypeBox r8 = r5.getSampleDependencyTypeBox()
            java.util.List r8 = r8.getEntries()
            r7.addAll(r8)
        L84:
            com.coremedia.iso.boxes.SyncSampleBox r7 = r5.getSyncSampleBox()
            if (r7 == 0) goto L94
            com.coremedia.iso.boxes.SyncSampleBox r7 = r5.getSyncSampleBox()
            long[] r7 = r7.getSampleNumber()
            r0.syncSamples = r7
        L94:
            java.lang.String r7 = "subs"
            com.coremedia.iso.boxes.Box r8 = com.googlecode.mp4parser.util.Path.getPath(r5, r7)
            com.coremedia.iso.boxes.SubSampleInformationBox r8 = (com.coremedia.iso.boxes.SubSampleInformationBox) r8
            r0.subSampleInformationBox = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.coremedia.iso.boxes.Container r9 = r30.getParent()
            com.coremedia.iso.boxes.Box r9 = (com.coremedia.iso.boxes.Box) r9
            com.coremedia.iso.boxes.Container r9 = r9.getParent()
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieFragmentBox> r10 = com.coremedia.iso.boxes.fragment.MovieFragmentBox.class
            java.util.List r9 = r9.getBoxes(r10)
            r8.addAll(r9)
            int r9 = r2.length
            r10 = 0
            r11 = 0
        Lb9:
            if (r11 < r9) goto L44c
            com.coremedia.iso.boxes.SampleDescriptionBox r2 = r5.getSampleDescriptionBox()
            r0.sampleDescriptionBox = r2
            com.coremedia.iso.boxes.Container r2 = r30.getParent()
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieExtendsBox> r9 = com.coremedia.iso.boxes.fragment.MovieExtendsBox.class
            java.util.List r2 = r2.getBoxes(r9)
            int r9 = r2.size()
            if (r9 <= 0) goto L379
            java.util.Iterator r2 = r2.iterator()
        Ld5:
            boolean r5 = r2.hasNext()
            if (r5 != 0) goto L12f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r8.iterator()
        Le9:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto Lf1
            goto L38d
        Lf1:
            java.lang.Object r2 = r5.next()
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r2 = (com.coremedia.iso.boxes.fragment.MovieFragmentBox) r2
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r7 = com.coremedia.iso.boxes.fragment.TrackFragmentBox.class
            java.util.List r2 = r2.getBoxes(r7)
            java.util.Iterator r9 = r2.iterator()
        L101:
            boolean r2 = r9.hasNext()
            if (r2 != 0) goto L108
            goto Le9
        L108:
            java.lang.Object r2 = r9.next()
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r2 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r2
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r7 = r2.getTrackFragmentHeaderBox()
            long r7 = r7.getTrackId()
            int r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r10 != 0) goto L101
            java.lang.String r7 = "sgpd"
            java.util.List r7 = com.googlecode.mp4parser.util.Path.getPaths(r2, r7)
            java.lang.String r8 = "sbgp"
            java.util.List r2 = com.googlecode.mp4parser.util.Path.getPaths(r2, r8)
            java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> r8 = r0.sampleGroups
            java.util.Map r2 = r0.getSampleGroups(r7, r2, r8)
            r0.sampleGroups = r2
            goto L101
        L12f:
            java.lang.Object r5 = r2.next()
            com.coremedia.iso.boxes.fragment.MovieExtendsBox r5 = (com.coremedia.iso.boxes.fragment.MovieExtendsBox) r5
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackExtendsBox> r9 = com.coremedia.iso.boxes.fragment.TrackExtendsBox.class
            java.util.List r5 = r5.getBoxes(r9)
            java.util.Iterator r9 = r5.iterator()
        L13f:
            boolean r5 = r9.hasNext()
            if (r5 != 0) goto L146
            goto Ld5
        L146:
            java.lang.Object r5 = r9.next()
            com.coremedia.iso.boxes.fragment.TrackExtendsBox r5 = (com.coremedia.iso.boxes.fragment.TrackExtendsBox) r5
            long r11 = r5.getTrackId()
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 != 0) goto L13f
            com.coremedia.iso.boxes.Container r11 = r30.getParent()
            com.coremedia.iso.boxes.Box r11 = (com.coremedia.iso.boxes.Box) r11
            com.coremedia.iso.boxes.Container r11 = r11.getParent()
            java.lang.String r12 = "/moof/traf/subs"
            java.util.List r11 = com.googlecode.mp4parser.util.Path.getPaths(r11, r12)
            int r11 = r11.size()
            if (r11 <= 0) goto L171
            com.coremedia.iso.boxes.SubSampleInformationBox r11 = new com.coremedia.iso.boxes.SubSampleInformationBox
            r11.<init>()
            r0.subSampleInformationBox = r11
        L171:
            java.util.Iterator r11 = r8.iterator()
            r14 = 1
        L177:
            boolean r16 = r11.hasNext()
            if (r16 != 0) goto L17e
            goto L13f
        L17e:
            java.lang.Object r16 = r11.next()
            r12 = r16
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r12 = (com.coremedia.iso.boxes.fragment.MovieFragmentBox) r12
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r13 = com.coremedia.iso.boxes.fragment.TrackFragmentBox.class
            java.util.List r12 = r12.getBoxes(r13)
            java.util.Iterator r12 = r12.iterator()
        L190:
            boolean r13 = r12.hasNext()
            if (r13 != 0) goto L197
            goto L177
        L197:
            java.lang.Object r13 = r12.next()
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r13 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r13
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r16 = r13.getTrackFragmentHeaderBox()
            long r19 = r16.getTrackId()
            int r16 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r16 != 0) goto L375
            com.coremedia.iso.boxes.Box r16 = com.googlecode.mp4parser.util.Path.getPath(r13, r7)
            com.coremedia.iso.boxes.SubSampleInformationBox r16 = (com.coremedia.iso.boxes.SubSampleInformationBox) r16
            r29 = r2
            r19 = r3
            if (r16 == 0) goto L20f
            long r2 = (long) r10
            long r2 = r14 - r2
            r17 = 1
            long r2 = r2 - r17
            java.util.List r4 = r16.getEntries()
            java.util.Iterator r4 = r4.iterator()
        L1c4:
            boolean r16 = r4.hasNext()
            if (r16 != 0) goto L1cb
            goto L20f
        L1cb:
            java.lang.Object r16 = r4.next()
            com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry r16 = (com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry) r16
            com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry r10 = new com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry
            r10.<init>()
            r31 = r4
            java.util.List r4 = r10.getSubsampleEntries()
            r21 = r7
            java.util.List r7 = r16.getSubsampleEntries()
            r4.addAll(r7)
            r22 = 0
            int r4 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r4 == 0) goto L1f5
            long r24 = r16.getSampleDelta()
            long r2 = r2 + r24
            r10.setSampleDelta(r2)
            goto L1fe
        L1f5:
            r22 = r2
            long r2 = r16.getSampleDelta()
            r10.setSampleDelta(r2)
        L1fe:
            r2 = r22
            com.coremedia.iso.boxes.SubSampleInformationBox r4 = r0.subSampleInformationBox
            java.util.List r4 = r4.getEntries()
            r4.add(r10)
            r4 = r31
            r7 = r21
            r10 = 0
            goto L1c4
        L20f:
            r21 = r7
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackRunBox> r2 = com.coremedia.iso.boxes.fragment.TrackRunBox.class
            java.util.List r2 = r13.getBoxes(r2)
            java.util.Iterator r2 = r2.iterator()
        L21b:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L229
            r2 = r29
            r3 = r19
            r7 = r21
            goto L376
        L229:
            java.lang.Object r3 = r2.next()
            com.coremedia.iso.boxes.fragment.TrackRunBox r3 = (com.coremedia.iso.boxes.fragment.TrackRunBox) r3
            com.coremedia.iso.boxes.Container r4 = r3.getParent()
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r4 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r4
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r4 = r4.getTrackFragmentHeaderBox()
            java.util.List r7 = r3.getEntries()
            java.util.Iterator r7 = r7.iterator()
            r10 = 1
            r13 = 1
        L243:
            boolean r16 = r7.hasNext()
            if (r16 != 0) goto L24a
            goto L21b
        L24a:
            java.lang.Object r16 = r7.next()
            com.coremedia.iso.boxes.fragment.TrackRunBox$Entry r16 = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry) r16
            boolean r22 = r3.isSampleDurationPresent()
            if (r22 == 0) goto L2ab
            int r22 = r6.size()
            if (r22 == 0) goto L294
            int r22 = r6.size()
            r31 = r2
            int r2 = r22 + (-1)
            java.lang.Object r2 = r6.get(r2)
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r2 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r2
            long r22 = r2.getDelta()
            long r24 = r16.getSampleDuration()
            int r2 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r2 == 0) goto L277
            goto L296
        L277:
            int r2 = r6.size()
            int r2 = r2 - r10
            java.lang.Object r2 = r6.get(r2)
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r2 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r2
            long r22 = r2.getCount()
            r27 = r7
            r26 = r8
            r24 = r11
            r10 = 1
            long r7 = r22 + r10
            r2.setCount(r7)
            goto L2d4
        L294:
            r31 = r2
        L296:
            r27 = r7
            r26 = r8
            r24 = r11
            r10 = 1
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r2 = new com.coremedia.iso.boxes.TimeToSampleBox$Entry
            long r7 = r16.getSampleDuration()
            r2.<init>(r10, r7)
            r6.add(r2)
            goto L2d4
        L2ab:
            r31 = r2
            r27 = r7
            r26 = r8
            r24 = r11
            r10 = 1
            boolean r2 = r4.hasDefaultSampleDuration()
            if (r2 == 0) goto L2c8
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r2 = new com.coremedia.iso.boxes.TimeToSampleBox$Entry
            long r7 = r4.getDefaultSampleDuration()
            r2.<init>(r10, r7)
            r6.add(r2)
            goto L2d4
        L2c8:
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r2 = new com.coremedia.iso.boxes.TimeToSampleBox$Entry
            long r7 = r5.getDefaultSampleDuration()
            r2.<init>(r10, r7)
            r6.add(r2)
        L2d4:
            boolean r2 = r3.isSampleCompositionTimeOffsetPresent()
            if (r2 == 0) goto L327
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r2 = r0.compositionTimeEntries
            int r2 = r2.size()
            if (r2 == 0) goto L314
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r2 = r0.compositionTimeEntries
            int r7 = r2.size()
            r8 = 1
            int r7 = r7 - r8
            java.lang.Object r2 = r2.get(r7)
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r2 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r2
            int r2 = r2.getOffset()
            long r10 = (long) r2
            long r22 = r16.getSampleCompositionTimeOffset()
            int r2 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r2 == 0) goto L2fe
            goto L315
        L2fe:
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r2 = r0.compositionTimeEntries
            int r7 = r2.size()
            int r7 = r7 - r8
            java.lang.Object r2 = r2.get(r7)
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r2 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r2
            int r7 = r2.getCount()
            int r7 = r7 + r8
            r2.setCount(r7)
            goto L327
        L314:
            r8 = 1
        L315:
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r2 = r0.compositionTimeEntries
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r7 = new com.coremedia.iso.boxes.CompositionTimeToSample$Entry
            long r10 = r16.getSampleCompositionTimeOffset()
            int r10 = com.googlecode.mp4parser.util.CastUtils.l2i(r10)
            r7.<init>(r8, r10)
            r2.add(r7)
        L327:
            boolean r2 = r3.isSampleFlagsPresent()
            if (r2 == 0) goto L332
            com.coremedia.iso.boxes.fragment.SampleFlags r2 = r16.getSampleFlags()
            goto L34e
        L332:
            if (r13 == 0) goto L33f
            boolean r2 = r3.isFirstSampleFlagsPresent()
            if (r2 == 0) goto L33f
            com.coremedia.iso.boxes.fragment.SampleFlags r2 = r3.getFirstSampleFlags()
            goto L34e
        L33f:
            boolean r2 = r4.hasDefaultSampleFlags()
            if (r2 == 0) goto L34a
            com.coremedia.iso.boxes.fragment.SampleFlags r2 = r4.getDefaultSampleFlags()
            goto L34e
        L34a:
            com.coremedia.iso.boxes.fragment.SampleFlags r2 = r5.getDefaultSampleFlags()
        L34e:
            if (r2 == 0) goto L365
            boolean r2 = r2.isSampleIsDifferenceSample()
            if (r2 != 0) goto L365
            long[] r2 = r0.syncSamples
            r7 = 1
            long[] r8 = new long[r7]
            r13 = 0
            r8[r13] = r14
            long[] r2 = com.googlecode.mp4parser.util.Mp4Arrays.copyOfAndAppend(r2, r8)
            r0.syncSamples = r2
            goto L367
        L365:
            r7 = 1
            r13 = 0
        L367:
            r10 = 1
            long r14 = r14 + r10
            r2 = r31
            r11 = r24
            r8 = r26
            r7 = r27
            r10 = 1
            goto L243
        L375:
            r13 = 0
        L376:
            r10 = 0
            goto L190
        L379:
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox> r2 = com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox.class
            java.util.List r2 = r5.getBoxes(r2)
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox> r3 = com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.class
            java.util.List r3 = r5.getBoxes(r3)
            java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> r4 = r0.sampleGroups
            java.util.Map r2 = r0.getSampleGroups(r2, r3, r4)
            r0.sampleGroups = r2
        L38d:
            long[] r2 = com.coremedia.iso.boxes.TimeToSampleBox.blowupTimeToSamples(r6)
            r0.decodingTimes = r2
            com.coremedia.iso.boxes.MediaBox r2 = r30.getMediaBox()
            com.coremedia.iso.boxes.MediaHeaderBox r2 = r2.getMediaHeaderBox()
            com.coremedia.iso.boxes.TrackHeaderBox r3 = r30.getTrackHeaderBox()
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            long r5 = r3.getTrackId()
            r4.setTrackId(r5)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            java.util.Date r5 = r2.getCreationTime()
            r4.setCreationTime(r5)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            java.lang.String r5 = r2.getLanguage()
            r4.setLanguage(r5)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            java.util.Date r5 = r2.getModificationTime()
            r4.setModificationTime(r5)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            long r5 = r2.getTimescale()
            r4.setTimescale(r5)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            double r5 = r3.getHeight()
            r4.setHeight(r5)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            double r5 = r3.getWidth()
            r4.setWidth(r5)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            int r5 = r3.getLayer()
            r4.setLayer(r5)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            com.googlecode.mp4parser.util.Matrix r5 = r3.getMatrix()
            r4.setMatrix(r5)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            float r3 = r3.getVolume()
            r4.setVolume(r3)
            java.lang.String r3 = "edts/elst"
            com.coremedia.iso.boxes.Box r3 = com.googlecode.mp4parser.util.Path.getPath(r1, r3)
            com.coremedia.iso.boxes.EditListBox r3 = (com.coremedia.iso.boxes.EditListBox) r3
            java.lang.String r4 = "../mvhd"
            com.coremedia.iso.boxes.Box r1 = com.googlecode.mp4parser.util.Path.getPath(r1, r4)
            com.coremedia.iso.boxes.MovieHeaderBox r1 = (com.coremedia.iso.boxes.MovieHeaderBox) r1
            if (r3 == 0) goto L44b
            java.util.List r3 = r3.getEntries()
            java.util.Iterator r3 = r3.iterator()
        L413:
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L41a
            goto L44b
        L41a:
            java.lang.Object r4 = r3.next()
            com.coremedia.iso.boxes.EditListBox$Entry r4 = (com.coremedia.iso.boxes.EditListBox.Entry) r4
            java.util.List<com.googlecode.mp4parser.authoring.Edit> r5 = r0.edits
            com.googlecode.mp4parser.authoring.Edit r15 = new com.googlecode.mp4parser.authoring.Edit
            long r7 = r4.getMediaTime()
            long r9 = r2.getTimescale()
            double r11 = r4.getMediaRate()
            long r13 = r4.getSegmentDuration()
            double r13 = (double) r13
            r29 = r2
            r30 = r3
            long r2 = r1.getTimescale()
            double r2 = (double) r2
            double r13 = r13 / r2
            r6 = r15
            r6.<init>(r7, r9, r11, r13)
            r5.add(r15)
            r2 = r29
            r3 = r30
            goto L413
        L44b:
            return
        L44c:
            r19 = r3
            r21 = r7
            r26 = r8
            r13 = 0
            r3 = r2[r11]
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieFragmentBox> r4 = com.coremedia.iso.boxes.fragment.MovieFragmentBox.class
            java.util.List r3 = r3.getBoxes(r4)
            r4 = r26
            r4.addAll(r3)
            int r11 = r11 + 1
            r8 = r4
            r3 = r19
            r10 = 0
            goto Lb9
    }

    private java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> getSampleGroups(java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox> r19, java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox> r20, java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> r21) {
            r18 = this;
            r0 = r21
            java.util.Iterator r1 = r19.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto Ld
            return r0
        Ld:
            java.lang.Object r2 = r1.next()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox r2 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox) r2
            java.util.Iterator r3 = r20.iterator()
            r4 = 1
            r5 = 0
            r6 = 0
        L1a:
            boolean r7 = r3.hasNext()
            if (r7 != 0) goto L4a
            if (r6 == 0) goto L23
            goto L6
        L23:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not find SampleToGroupBox for "
            r1.<init>(r3)
            java.util.List r2 = r2.getGroupEntries()
            java.lang.Object r2 = r2.get(r5)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r2 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r2
            java.lang.String r2 = r2.getType()
            r1.append(r2)
            java.lang.String r2 = "."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4a:
            java.lang.Object r7 = r3.next()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox r7 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox) r7
            java.lang.String r8 = r7.getGroupingType()
            java.util.List r9 = r2.getGroupEntries()
            java.lang.Object r9 = r9.get(r5)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r9 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r9
            java.lang.String r9 = r9.getType()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L1a
            java.util.List r6 = r7.getEntries()
            java.util.Iterator r7 = r6.iterator()
            r6 = 0
        L71:
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L79
            r6 = 1
            goto L1a
        L79:
            java.lang.Object r8 = r7.next()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry r8 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox.Entry) r8
            int r9 = r8.getGroupDescriptionIndex()
            if (r9 <= 0) goto Lc6
            java.util.List r9 = r2.getGroupEntries()
            int r10 = r8.getGroupDescriptionIndex()
            int r10 = r10 - r4
            java.lang.Object r9 = r9.get(r10)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r9 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r9
            java.lang.Object r10 = r0.get(r9)
            long[] r10 = (long[]) r10
            if (r10 != 0) goto L9e
            long[] r10 = new long[r5]
        L9e:
            long r11 = r8.getSampleCount()
            int r11 = com.googlecode.mp4parser.util.CastUtils.l2i(r11)
            int r12 = r10.length
            int r11 = r11 + r12
            long[] r11 = new long[r11]
            int r12 = r10.length
            java.lang.System.arraycopy(r10, r5, r11, r5, r12)
            r12 = 0
        Laf:
            long r13 = (long) r12
            long r15 = r8.getSampleCount()
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 < 0) goto Lbc
            r0.put(r9, r11)
            goto Lc6
        Lbc:
            int r13 = r10.length
            int r13 = r13 + r12
            int r14 = r6 + r12
            long r14 = (long) r14
            r11[r13] = r14
            int r12 = r12 + 1
            goto Laf
        Lc6:
            long r9 = (long) r6
            long r11 = r8.getSampleCount()
            long r9 = r9 + r11
            int r6 = (int) r9
            goto L71
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r4 = this;
            com.coremedia.iso.boxes.TrackBox r0 = r4.trackBox
            com.coremedia.iso.boxes.Container r0 = r0.getParent()
            boolean r1 = r0 instanceof com.googlecode.mp4parser.BasicContainer
            if (r1 == 0) goto Lf
            com.googlecode.mp4parser.BasicContainer r0 = (com.googlecode.mp4parser.BasicContainer) r0
            r0.close()
        Lf:
            com.coremedia.iso.IsoFile[] r0 = r4.fragments
            if (r0 == 0) goto L20
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 < r1) goto L18
            goto L20
        L18:
            r3 = r0[r2]
            r3.close()
            int r2 = r2 + 1
            goto L15
        L20:
            return
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r0 = r1.compositionTimeEntries
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = r1.handler
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry> r0 = r1.sampleDependencies
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.sampleDescriptionBox
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public synchronized long[] getSampleDurations() {
            r1 = this;
            monitor-enter(r1)
            long[] r0 = r1.decodingTimes     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            com.coremedia.iso.boxes.SubSampleInformationBox r0 = r1.subSampleInformationBox
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r2 = this;
            long[] r0 = r2.syncSamples
            if (r0 == 0) goto L11
            int r0 = r0.length
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r1 = r2.samples
            int r1 = r1.size()
            if (r0 != r1) goto Le
            goto L11
        Le:
            long[] r0 = r2.syncSamples
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r1.trackMetaData
            return r0
    }
}
