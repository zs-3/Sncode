package com.googlecode.mp4parser.authoring;

/* loaded from: classes2.dex */
public class CencMp4TrackImplImpl extends com.googlecode.mp4parser.authoring.Mp4TrackImpl implements com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private java.util.UUID defaultKeyId;
    private java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> sampleEncryptionEntries;

    private class FindSaioSaizPair {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private com.coremedia.iso.boxes.Container container;
        private com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox saio;
        private com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox saiz;
        final /* synthetic */ com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl this$0;

        static {
                java.lang.Class<com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl> r0 = com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl.class
                return
        }

        public FindSaioSaizPair(com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl r1, com.coremedia.iso.boxes.Container r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.container = r2
                return
        }

        static /* synthetic */ com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox access$0(com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl.FindSaioSaizPair r0) {
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r0 = r0.saio
                return r0
        }

        static /* synthetic */ com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox access$1(com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl.FindSaioSaizPair r0) {
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r0 = r0.saiz
                return r0
        }

        public com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox getSaio() {
                r1 = this;
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r0 = r1.saio
                return r0
        }

        public com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox getSaiz() {
                r1 = this;
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r0 = r1.saiz
                return r0
        }

        public com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl.FindSaioSaizPair invoke() {
                r5 = this;
                com.coremedia.iso.boxes.Container r0 = r5.container
                java.lang.Class<com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox> r1 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox.class
                java.util.List r0 = r0.getBoxes(r1)
                com.coremedia.iso.boxes.Container r1 = r5.container
                java.lang.Class<com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox> r2 = com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox.class
                java.util.List r1 = r1.getBoxes(r2)
                r2 = 0
                r5.saiz = r2
                r5.saio = r2
                r2 = 0
            L16:
                int r3 = r0.size()
                if (r2 < r3) goto L1d
                return r5
            L1d:
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r3 = r5.saiz
                java.lang.String r4 = "cenc"
                if (r3 != 0) goto L2f
                java.lang.Object r3 = r0.get(r2)
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r3 = (com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox) r3
                java.lang.String r3 = r3.getAuxInfoType()
                if (r3 == 0) goto L3f
            L2f:
                java.lang.Object r3 = r0.get(r2)
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r3 = (com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox) r3
                java.lang.String r3 = r3.getAuxInfoType()
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L48
            L3f:
                java.lang.Object r3 = r0.get(r2)
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r3 = (com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox) r3
                r5.saiz = r3
                goto L6a
            L48:
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r3 = r5.saiz
                if (r3 == 0) goto Lc1
                java.lang.String r3 = r3.getAuxInfoType()
                if (r3 != 0) goto Lc1
                java.lang.Object r3 = r0.get(r2)
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r3 = (com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox) r3
                java.lang.String r3 = r3.getAuxInfoType()
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto Lc1
                java.lang.Object r3 = r0.get(r2)
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r3 = (com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox) r3
                r5.saiz = r3
            L6a:
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r3 = r5.saio
                if (r3 != 0) goto L7a
                java.lang.Object r3 = r1.get(r2)
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r3 = (com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox) r3
                java.lang.String r3 = r3.getAuxInfoType()
                if (r3 == 0) goto L8a
            L7a:
                java.lang.Object r3 = r1.get(r2)
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r3 = (com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox) r3
                java.lang.String r3 = r3.getAuxInfoType()
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L93
            L8a:
                java.lang.Object r3 = r1.get(r2)
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r3 = (com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox) r3
                r5.saio = r3
                goto Lb5
            L93:
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r3 = r5.saio
                if (r3 == 0) goto Lb9
                java.lang.String r3 = r3.getAuxInfoType()
                if (r3 != 0) goto Lb9
                java.lang.Object r3 = r1.get(r2)
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r3 = (com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox) r3
                java.lang.String r3 = r3.getAuxInfoType()
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto Lb9
                java.lang.Object r3 = r1.get(r2)
                com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r3 = (com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox) r3
                r5.saio = r3
            Lb5:
                int r2 = r2 + 1
                goto L16
            Lb9:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Are there two cenc labeled saio?"
                r0.<init>(r1)
                throw r0
            Lc1:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Are there two cenc labeled saiz?"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            java.lang.Class<com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl> r0 = com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl.class
            return
    }

    public CencMp4TrackImplImpl(java.lang.String r27, com.coremedia.iso.boxes.TrackBox r28, com.coremedia.iso.IsoFile... r29) throws java.io.IOException {
            r26 = this;
            r0 = r26
            r1 = r28
            r26.<init>(r27, r28, r29)
            java.lang.String r2 = "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]"
            com.coremedia.iso.boxes.Box r2 = com.googlecode.mp4parser.util.Path.getPath(r1, r2)
            com.coremedia.iso.boxes.SchemeTypeBox r2 = (com.coremedia.iso.boxes.SchemeTypeBox) r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.sampleEncryptionEntries = r2
            com.coremedia.iso.boxes.TrackHeaderBox r2 = r28.getTrackHeaderBox()
            long r2 = r2.getTrackId()
            com.coremedia.iso.boxes.Container r4 = r28.getParent()
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieExtendsBox> r5 = com.coremedia.iso.boxes.fragment.MovieExtendsBox.class
            java.util.List r4 = r4.getBoxes(r5)
            int r4 = r4.size()
            java.lang.String r5 = "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]"
            if (r4 <= 0) goto L12c
            com.coremedia.iso.boxes.Container r4 = r28.getParent()
            com.coremedia.iso.boxes.Box r4 = (com.coremedia.iso.boxes.Box) r4
            com.coremedia.iso.boxes.Container r4 = r4.getParent()
            java.lang.Class<com.coremedia.iso.boxes.fragment.MovieFragmentBox> r9 = com.coremedia.iso.boxes.fragment.MovieFragmentBox.class
            java.util.List r4 = r4.getBoxes(r9)
            java.util.Iterator r4 = r4.iterator()
        L44:
            boolean r9 = r4.hasNext()
            if (r9 != 0) goto L4c
            goto L1e1
        L4c:
            java.lang.Object r9 = r4.next()
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r9 = (com.coremedia.iso.boxes.fragment.MovieFragmentBox) r9
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r10 = com.coremedia.iso.boxes.fragment.TrackFragmentBox.class
            java.util.List r10 = r9.getBoxes(r10)
            java.util.Iterator r10 = r10.iterator()
        L5c:
            boolean r11 = r10.hasNext()
            if (r11 != 0) goto L63
            goto L44
        L63:
            java.lang.Object r11 = r10.next()
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r11 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r11
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r12 = r11.getTrackFragmentHeaderBox()
            long r12 = r12.getTrackId()
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L5c
            com.coremedia.iso.boxes.Box r12 = com.googlecode.mp4parser.util.Path.getPath(r1, r5)
            com.mp4parser.iso23001.part7.TrackEncryptionBox r12 = (com.mp4parser.iso23001.part7.TrackEncryptionBox) r12
            java.util.UUID r13 = r12.getDefault_KID()
            r0.defaultKeyId = r13
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r13 = r11.getTrackFragmentHeaderBox()
            boolean r13 = r13.hasBaseDataOffset()
            if (r13 == 0) goto L9e
            com.coremedia.iso.boxes.Container r13 = r28.getParent()
            com.coremedia.iso.boxes.Box r13 = (com.coremedia.iso.boxes.Box) r13
            com.coremedia.iso.boxes.Container r13 = r13.getParent()
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r14 = r11.getTrackFragmentHeaderBox()
            long r14 = r14.getBaseDataOffset()
            goto La1
        L9e:
            r13 = r9
            r14 = 0
        La1:
            com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl$FindSaioSaizPair r6 = new com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl$FindSaioSaizPair
            r6.<init>(r0, r11)
            com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl$FindSaioSaizPair r6 = r6.invoke()
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r7 = r6.getSaio()
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r6 = r6.getSaiz()
            long[] r7 = r7.getOffsets()
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackRunBox> r8 = com.coremedia.iso.boxes.fragment.TrackRunBox.class
            java.util.List r8 = r11.getBoxes(r8)
            r17 = r2
            r11 = 0
            r16 = 0
        Lc1:
            int r2 = r7.length
            if (r11 < r2) goto Lc7
            r2 = r17
            goto L5c
        Lc7:
            java.lang.Object r2 = r8.get(r11)
            com.coremedia.iso.boxes.fragment.TrackRunBox r2 = (com.coremedia.iso.boxes.fragment.TrackRunBox) r2
            java.util.List r2 = r2.getEntries()
            int r2 = r2.size()
            r19 = r7[r11]
            r22 = r4
            r29 = r7
            r21 = r8
            r3 = r16
            r7 = 0
        Le1:
            int r4 = r16 + r2
            if (r3 < r4) goto L11b
            long r2 = r14 + r19
            java.nio.ByteBuffer r2 = r13.getByteBuffer(r2, r7)
            r3 = r16
        Led:
            if (r3 < r4) goto Lfa
            int r11 = r11 + 1
            r7 = r29
            r16 = r4
            r8 = r21
            r4 = r22
            goto Lc1
        Lfa:
            short r7 = r6.getSize(r3)
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r8 = r0.sampleEncryptionEntries
            r23 = r4
            int r4 = r12.getDefaultIvSize()
            r24 = r9
            r25 = r10
            long r9 = (long) r7
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r4 = r0.parseCencAuxDataFormat(r4, r2, r9)
            r8.add(r4)
            int r3 = r3 + 1
            r4 = r23
            r9 = r24
            r10 = r25
            goto Led
        L11b:
            r24 = r9
            r25 = r10
            short r4 = r6.getSize(r3)
            long r9 = (long) r4
            long r7 = r7 + r9
            int r3 = r3 + 1
            r9 = r24
            r10 = r25
            goto Le1
        L12c:
            com.coremedia.iso.boxes.Box r2 = com.googlecode.mp4parser.util.Path.getPath(r1, r5)
            com.mp4parser.iso23001.part7.TrackEncryptionBox r2 = (com.mp4parser.iso23001.part7.TrackEncryptionBox) r2
            java.util.UUID r3 = r2.getDefault_KID()
            r0.defaultKeyId = r3
            java.lang.String r3 = "mdia[0]/minf[0]/stbl[0]/stco[0]"
            com.coremedia.iso.boxes.Box r3 = com.googlecode.mp4parser.util.Path.getPath(r1, r3)
            com.coremedia.iso.boxes.ChunkOffsetBox r3 = (com.coremedia.iso.boxes.ChunkOffsetBox) r3
            if (r3 != 0) goto L14a
            java.lang.String r3 = "mdia[0]/minf[0]/stbl[0]/co64[0]"
            com.coremedia.iso.boxes.Box r3 = com.googlecode.mp4parser.util.Path.getPath(r1, r3)
            com.coremedia.iso.boxes.ChunkOffsetBox r3 = (com.coremedia.iso.boxes.ChunkOffsetBox) r3
        L14a:
            com.coremedia.iso.boxes.SampleTableBox r4 = r28.getSampleTableBox()
            com.coremedia.iso.boxes.SampleToChunkBox r4 = r4.getSampleToChunkBox()
            long[] r3 = r3.getChunkOffsets()
            int r3 = r3.length
            long[] r3 = r4.blowup(r3)
            com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl$FindSaioSaizPair r4 = new com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl$FindSaioSaizPair
            java.lang.String r5 = "mdia[0]/minf[0]/stbl[0]"
            com.coremedia.iso.boxes.Box r5 = com.googlecode.mp4parser.util.Path.getPath(r1, r5)
            com.coremedia.iso.boxes.Container r5 = (com.coremedia.iso.boxes.Container) r5
            r4.<init>(r0, r5)
            com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl$FindSaioSaizPair r4 = r4.invoke()
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r5 = com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl.FindSaioSaizPair.access$0(r4)
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r4 = com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl.FindSaioSaizPair.access$1(r4)
            com.coremedia.iso.boxes.Container r1 = r28.getParent()
            com.coremedia.iso.boxes.MovieBox r1 = (com.coremedia.iso.boxes.MovieBox) r1
            com.coremedia.iso.boxes.Container r1 = r1.getParent()
            long[] r6 = r5.getOffsets()
            int r6 = r6.length
            r7 = 1
            if (r6 != r7) goto L1d3
            long[] r3 = r5.getOffsets()
            r6 = 0
            r7 = r3[r6]
            int r3 = r4.getDefaultSampleInfoSize()
            if (r3 <= 0) goto L19f
            int r3 = r4.getSampleCount()
            int r5 = r4.getDefaultSampleInfoSize()
            int r3 = r3 * r5
            int r3 = r3 + r6
            goto L1a7
        L19f:
            r3 = 0
            r5 = 0
        L1a1:
            int r9 = r4.getSampleCount()
            if (r5 < r9) goto L1c9
        L1a7:
            long r9 = (long) r3
            java.nio.ByteBuffer r9 = r1.getByteBuffer(r7, r9)
            r8 = 0
        L1ad:
            int r1 = r4.getSampleCount()
            if (r8 < r1) goto L1b4
            goto L1e1
        L1b4:
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r1 = r0.sampleEncryptionEntries
            int r3 = r2.getDefaultIvSize()
            short r5 = r4.getSize(r8)
            long r5 = (long) r5
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r3 = r0.parseCencAuxDataFormat(r3, r9, r5)
            r1.add(r3)
            int r8 = r8 + 1
            goto L1ad
        L1c9:
            short[] r9 = r4.getSampleInfoSizes()
            short r9 = r9[r5]
            int r3 = r3 + r9
            int r5 = r5 + 1
            goto L1a1
        L1d3:
            r6 = 0
            long[] r7 = r5.getOffsets()
            int r7 = r7.length
            int r8 = r3.length
            if (r7 != r8) goto L23c
            r7 = 0
            r8 = 0
        L1de:
            int r9 = r3.length
            if (r7 < r9) goto L1e2
        L1e1:
            return
        L1e2:
            long[] r9 = r5.getOffsets()
            r10 = r9[r7]
            int r9 = r4.getDefaultSampleInfoSize()
            if (r9 <= 0) goto L1fb
            int r9 = r4.getSampleCount()
            long r12 = (long) r9
            r14 = r3[r7]
            long r12 = r12 * r14
            r14 = 0
            long r12 = r12 + r14
            goto L206
        L1fb:
            r14 = 0
            r12 = r14
            r9 = 0
        L1ff:
            long r14 = (long) r9
            r16 = r3[r7]
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 < 0) goto L231
        L206:
            java.nio.ByteBuffer r14 = r1.getByteBuffer(r10, r12)
            r9 = 0
        L20b:
            long r10 = (long) r9
            r12 = r3[r7]
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 < 0) goto L21a
            long r8 = (long) r8
            r10 = r3[r7]
            long r8 = r8 + r10
            int r8 = (int) r8
            int r7 = r7 + 1
            goto L1de
        L21a:
            int r10 = r8 + r9
            short r10 = r4.getSize(r10)
            long r10 = (long) r10
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r12 = r0.sampleEncryptionEntries
            int r13 = r2.getDefaultIvSize()
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r10 = r0.parseCencAuxDataFormat(r13, r14, r10)
            r12.add(r10)
            int r9 = r9 + 1
            goto L20b
        L231:
            int r14 = r8 + r9
            short r14 = r4.getSize(r14)
            long r14 = (long) r14
            long r12 = r12 + r14
            int r9 = r9 + 1
            goto L1ff
        L23c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Number of saio offsets must be either 1 or number of chunks"
            r1.<init>(r2)
            throw r1
    }

    private com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat parseCencAuxDataFormat(int r5, java.nio.ByteBuffer r6, long r7) {
            r4 = this;
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r0 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat
            r0.<init>()
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 <= 0) goto L37
            byte[] r1 = new byte[r5]
            r0.iv = r1
            r6.get(r1)
            long r1 = (long) r5
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 <= 0) goto L37
            int r5 = com.coremedia.iso.IsoTypeReader.readUInt16(r6)
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r5 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair[r5]
            r0.pairs = r5
            r5 = 0
        L20:
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r7 = r0.pairs
            int r8 = r7.length
            if (r5 < r8) goto L26
            goto L37
        L26:
            int r8 = com.coremedia.iso.IsoTypeReader.readUInt16(r6)
            long r1 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair r8 = r0.createPair(r8, r1)
            r7[r5] = r8
            int r5 = r5 + 1
            goto L20
        L37:
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public java.util.UUID getDefaultKeyId() {
            r1 = this;
            java.util.UUID r0 = r1.defaultKeyId
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.lang.String getName() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "enc("
            r0.<init>(r1)
            java.lang.String r1 = super.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> getSampleEncryptionEntries() {
            r1 = this;
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r0 = r1.sampleEncryptionEntries
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public boolean hasSubSampleEncryption() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CencMp4TrackImpl{handler='"
            r0.<init>(r1)
            java.lang.String r1 = r2.getHandler()
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
