package com.googlecode.mp4parser.authoring.builder;

/* loaded from: classes2.dex */
public class DefaultMp4Builder implements com.googlecode.mp4parser.authoring.builder.Mp4Builder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static java.util.logging.Logger LOG;
    java.util.Map<com.googlecode.mp4parser.authoring.Track, com.coremedia.iso.boxes.StaticChunkOffsetBox> chunkOffsetBoxes;
    private com.googlecode.mp4parser.authoring.builder.Fragmenter fragmenter;
    java.util.Set<com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox> sampleAuxiliaryInformationOffsetsBoxes;
    java.util.HashMap<com.googlecode.mp4parser.authoring.Track, java.util.List<com.googlecode.mp4parser.authoring.Sample>> track2Sample;
    java.util.HashMap<com.googlecode.mp4parser.authoring.Track, long[]> track2SampleSizes;


    private class InterleaveChunkMdat implements com.coremedia.iso.boxes.Box {
        java.util.List<java.util.List<com.googlecode.mp4parser.authoring.Sample>> chunkList;
        long contentSize;
        com.coremedia.iso.boxes.Container parent;
        final /* synthetic */ com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder this$0;
        java.util.List<com.googlecode.mp4parser.authoring.Track> tracks;


        private InterleaveChunkMdat(com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder r17, com.googlecode.mp4parser.authoring.Movie r18, java.util.Map<com.googlecode.mp4parser.authoring.Track, int[]> r19, long r20) {
                r16 = this;
                r0 = r16
                r1 = r19
                r2 = r17
                r0.this$0 = r2
                r16.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r0.chunkList = r2
                r2 = r20
                r0.contentSize = r2
                java.util.List r2 = r18.getTracks()
                r0.tracks = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.Set r3 = r19.keySet()
                r2.<init>(r3)
                com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder$InterleaveChunkMdat$1 r3 = new com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder$InterleaveChunkMdat$1
                r3.<init>(r0)
                java.util.Collections.sort(r2, r3)
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Iterator r6 = r2.iterator()
            L40:
                boolean r7 = r6.hasNext()
                if (r7 != 0) goto Lf7
            L46:
                r6 = 0
                java.util.Iterator r7 = r2.iterator()
            L4b:
                boolean r8 = r7.hasNext()
                if (r8 != 0) goto Lc1
                if (r6 != 0) goto L54
                return
            L54:
                java.lang.Object r7 = r3.get(r6)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r8 = r7.intValue()
                java.lang.Object r7 = r1.get(r6)
                int[] r7 = (int[]) r7
                r9 = r7[r8]
                java.lang.Object r7 = r4.get(r6)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r10 = r7.intValue()
                java.lang.Object r7 = r5.get(r6)
                java.lang.Double r7 = (java.lang.Double) r7
                double r11 = r7.doubleValue()
                r7 = r10
            L7b:
                int r13 = r10 + r9
                if (r7 < r13) goto La4
                java.util.List<java.util.List<com.googlecode.mp4parser.authoring.Sample>> r7 = r0.chunkList
                java.util.List r9 = r6.getSamples()
                java.util.List r9 = r9.subList(r10, r13)
                r7.add(r9)
                int r8 = r8 + 1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                r3.put(r6, r7)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
                r4.put(r6, r7)
                java.lang.Double r7 = java.lang.Double.valueOf(r11)
                r5.put(r6, r7)
                goto L46
            La4:
                long[] r13 = r6.getSampleDurations()
                r14 = r13[r7]
                double r13 = (double) r14
                com.googlecode.mp4parser.authoring.TrackMetaData r15 = r6.getTrackMetaData()
                r18 = r8
                r17 = r9
                long r8 = r15.getTimescale()
                double r8 = (double) r8
                double r13 = r13 / r8
                double r11 = r11 + r13
                int r7 = r7 + 1
                r9 = r17
                r8 = r18
                goto L7b
            Lc1:
                java.lang.Object r8 = r7.next()
                com.googlecode.mp4parser.authoring.Track r8 = (com.googlecode.mp4parser.authoring.Track) r8
                if (r6 == 0) goto Le1
                java.lang.Object r9 = r5.get(r8)
                java.lang.Double r9 = (java.lang.Double) r9
                double r9 = r9.doubleValue()
                java.lang.Object r11 = r5.get(r6)
                java.lang.Double r11 = (java.lang.Double) r11
                double r11 = r11.doubleValue()
                int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r13 >= 0) goto L4b
            Le1:
                java.lang.Object r9 = r3.get(r8)
                java.lang.Integer r9 = (java.lang.Integer) r9
                int r9 = r9.intValue()
                java.lang.Object r10 = r1.get(r8)
                int[] r10 = (int[]) r10
                int r10 = r10.length
                if (r9 >= r10) goto L4b
                r6 = r8
                goto L4b
            Lf7:
                java.lang.Object r7 = r6.next()
                com.googlecode.mp4parser.authoring.Track r7 = (com.googlecode.mp4parser.authoring.Track) r7
                r8 = 0
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                r3.put(r7, r9)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r4.put(r7, r8)
                r8 = 0
                java.lang.Double r8 = java.lang.Double.valueOf(r8)
                r5.put(r7, r8)
                goto L40
        }

        /* synthetic */ InterleaveChunkMdat(com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder r1, com.googlecode.mp4parser.authoring.Movie r2, java.util.Map r3, long r4, com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder.InterleaveChunkMdat r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        private boolean isSmallBox(long r4) {
                r3 = this;
                r0 = 8
                long r4 = r4 + r0
                r0 = 4294967296(0x100000000, double:2.121995791E-314)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 >= 0) goto Le
                r4 = 1
                return r4
            Le:
                r4 = 0
                return r4
        }

        @Override // com.coremedia.iso.boxes.Box
        public void getBox(java.nio.channels.WritableByteChannel r6) throws java.io.IOException {
                r5 = this;
                r0 = 16
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                long r1 = r5.getSize()
                boolean r3 = r5.isSmallBox(r1)
                if (r3 == 0) goto L14
                com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
                goto L19
            L14:
                r3 = 1
                com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r3)
            L19:
                java.lang.String r3 = "mdat"
                byte[] r3 = com.coremedia.iso.IsoFile.fourCCtoBytes(r3)
                r0.put(r3)
                boolean r3 = r5.isSmallBox(r1)
                if (r3 == 0) goto L30
                r1 = 8
                byte[] r1 = new byte[r1]
                r0.put(r1)
                goto L33
            L30:
                com.coremedia.iso.IsoTypeWriter.writeUInt64(r0, r1)
            L33:
                r0.rewind()
                r6.write(r0)
                java.util.List<java.util.List<com.googlecode.mp4parser.authoring.Sample>> r0 = r5.chunkList
                java.util.Iterator r0 = r0.iterator()
            L3f:
                boolean r1 = r0.hasNext()
                if (r1 != 0) goto L46
                return
            L46:
                java.lang.Object r1 = r0.next()
                java.util.List r1 = (java.util.List) r1
                java.util.Iterator r1 = r1.iterator()
            L50:
                boolean r2 = r1.hasNext()
                if (r2 != 0) goto L57
                goto L3f
            L57:
                java.lang.Object r2 = r1.next()
                com.googlecode.mp4parser.authoring.Sample r2 = (com.googlecode.mp4parser.authoring.Sample) r2
                r2.writeTo(r6)
                goto L50
        }

        public long getDataOffset() {
                r7 = this;
                r0 = 16
                r2 = r7
            L3:
                boolean r3 = r2 instanceof com.coremedia.iso.boxes.Box
                if (r3 != 0) goto L8
                return r0
            L8:
                r3 = r2
                com.coremedia.iso.boxes.Box r3 = (com.coremedia.iso.boxes.Box) r3
                com.coremedia.iso.boxes.Container r4 = r3.getParent()
                java.util.List r4 = r4.getBoxes()
                java.util.Iterator r4 = r4.iterator()
            L17:
                boolean r5 = r4.hasNext()
                if (r5 != 0) goto L1e
                goto L26
            L1e:
                java.lang.Object r5 = r4.next()
                com.coremedia.iso.boxes.Box r5 = (com.coremedia.iso.boxes.Box) r5
                if (r2 != r5) goto L2b
            L26:
                com.coremedia.iso.boxes.Container r2 = r3.getParent()
                goto L3
            L2b:
                long r5 = r5.getSize()
                long r0 = r0 + r5
                goto L17
        }

        @Override // com.coremedia.iso.boxes.Box
        public long getOffset() {
                r2 = this;
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Doesn't have any meaning for programmatically created boxes"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.coremedia.iso.boxes.Box
        public com.coremedia.iso.boxes.Container getParent() {
                r1 = this;
                com.coremedia.iso.boxes.Container r0 = r1.parent
                return r0
        }

        @Override // com.coremedia.iso.boxes.Box
        public long getSize() {
                r4 = this;
                long r0 = r4.contentSize
                r2 = 16
                long r0 = r0 + r2
                return r0
        }

        @Override // com.coremedia.iso.boxes.Box
        public java.lang.String getType() {
                r1 = this;
                java.lang.String r0 = "mdat"
                return r0
        }

        @Override // com.coremedia.iso.boxes.Box
        public void parse(com.googlecode.mp4parser.DataSource r1, java.nio.ByteBuffer r2, long r3, com.coremedia.iso.BoxParser r5) throws java.io.IOException {
                r0 = this;
                return
        }

        @Override // com.coremedia.iso.boxes.Box
        public void setParent(com.coremedia.iso.boxes.Container r1) {
                r0 = this;
                r0.parent = r1
                return
        }
    }

    static {
            java.lang.Class<com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder> r0 = com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder.LOG = r0
            return
    }

    public DefaultMp4Builder() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.chunkOffsetBoxes = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.sampleAuxiliaryInformationOffsetsBoxes = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.track2Sample = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.track2SampleSizes = r0
            return
    }

    public static long gcd(long r3, long r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return r3
        L7:
            long r3 = r3 % r5
            long r3 = gcd(r5, r3)
            return r3
    }

    private static long sum(int[] r6) {
            int r0 = r6.length
            r1 = 0
            r3 = 0
        L4:
            if (r3 < r0) goto L7
            return r1
        L7:
            r4 = r6[r3]
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L4
    }

    private static long sum(long[] r6) {
            int r0 = r6.length
            r1 = 0
            r3 = 0
        L4:
            if (r3 < r0) goto L7
            return r1
        L7:
            r4 = r6[r3]
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L4
    }

    @Override // com.googlecode.mp4parser.authoring.builder.Mp4Builder
    public com.coremedia.iso.boxes.Container build(com.googlecode.mp4parser.authoring.Movie r12) {
            r11 = this;
            com.googlecode.mp4parser.authoring.builder.Fragmenter r0 = r11.fragmenter
            if (r0 != 0) goto Ld
            com.googlecode.mp4parser.authoring.builder.TimeBasedFragmenter r0 = new com.googlecode.mp4parser.authoring.builder.TimeBasedFragmenter
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0.<init>(r1)
            r11.fragmenter = r0
        Ld:
            java.util.logging.Logger r0 = com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder.LOG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Creating movie "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.fine(r1)
            java.util.List r0 = r12.getTracks()
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 != 0) goto L118
            com.googlecode.mp4parser.BasicContainer r1 = new com.googlecode.mp4parser.BasicContainer
            r1.<init>()
            com.coremedia.iso.boxes.FileTypeBox r0 = r11.createFileTypeBox(r12)
            r1.addBox(r0)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.List r0 = r12.getTracks()
            java.util.Iterator r3 = r0.iterator()
        L48:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L109
            com.coremedia.iso.boxes.MovieBox r0 = r11.createMovieBox(r12, r6)
            r1.addBox(r0)
            java.lang.String r3 = "trak/mdia/minf/stbl/stsz"
            java.util.List r0 = com.googlecode.mp4parser.util.Path.getPaths(r0, r3)
            r3 = 0
            java.util.Iterator r0 = r0.iterator()
            r7 = r3
        L62:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto Lf8
            com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder$InterleaveChunkMdat r0 = new com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder$InterleaveChunkMdat
            r9 = 0
            r3 = r0
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r9)
            r1.addBox(r0)
            long r3 = r0.getDataOffset()
            java.util.Map<com.googlecode.mp4parser.authoring.Track, com.coremedia.iso.boxes.StaticChunkOffsetBox> r12 = r11.chunkOffsetBoxes
            java.util.Collection r12 = r12.values()
            java.util.Iterator r5 = r12.iterator()
        L82:
            boolean r12 = r5.hasNext()
            if (r12 != 0) goto Le1
            java.util.Set<com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox> r12 = r11.sampleAuxiliaryInformationOffsetsBoxes
            java.util.Iterator r12 = r12.iterator()
        L8e:
            boolean r0 = r12.hasNext()
            if (r0 != 0) goto L95
            return r1
        L95:
            java.lang.Object r0 = r12.next()
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r0 = (com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox) r0
            long r3 = r0.getSize()
            r5 = 44
            long r3 = r3 + r5
            r6 = r0
        La3:
            r5 = r6
            com.coremedia.iso.boxes.Box r5 = (com.coremedia.iso.boxes.Box) r5
            com.coremedia.iso.boxes.Container r7 = r5.getParent()
            java.util.List r5 = r7.getBoxes()
            java.util.Iterator r8 = r5.iterator()
        Lb2:
            boolean r5 = r8.hasNext()
            if (r5 != 0) goto Lb9
            goto Lc1
        Lb9:
            java.lang.Object r5 = r8.next()
            com.coremedia.iso.boxes.Box r5 = (com.coremedia.iso.boxes.Box) r5
            if (r5 != r6) goto Ldb
        Lc1:
            boolean r5 = r7 instanceof com.coremedia.iso.boxes.Box
            if (r5 != 0) goto Ld9
            long[] r5 = r0.getOffsets()
            r6 = 0
        Lca:
            int r7 = r5.length
            if (r6 < r7) goto Ld1
            r0.setOffsets(r5)
            goto L8e
        Ld1:
            r7 = r5[r6]
            long r7 = r7 + r3
            r5[r6] = r7
            int r6 = r6 + 1
            goto Lca
        Ld9:
            r6 = r7
            goto La3
        Ldb:
            long r9 = r5.getSize()
            long r3 = r3 + r9
            goto Lb2
        Le1:
            java.lang.Object r12 = r5.next()
            com.coremedia.iso.boxes.StaticChunkOffsetBox r12 = (com.coremedia.iso.boxes.StaticChunkOffsetBox) r12
            long[] r9 = r12.getChunkOffsets()
            r12 = 0
        Lec:
            int r0 = r9.length
            if (r12 < r0) goto Lf0
            goto L82
        Lf0:
            r6 = r9[r12]
            long r6 = r6 + r3
            r9[r12] = r6
            int r12 = r12 + 1
            goto Lec
        Lf8:
            java.lang.Object r3 = r0.next()
            com.coremedia.iso.boxes.SampleSizeBox r3 = (com.coremedia.iso.boxes.SampleSizeBox) r3
            long[] r3 = r3.getSampleSizes()
            long r3 = sum(r3)
            long r7 = r7 + r3
            goto L62
        L109:
            java.lang.Object r0 = r3.next()
            com.googlecode.mp4parser.authoring.Track r0 = (com.googlecode.mp4parser.authoring.Track) r0
            int[] r4 = r11.getChunkSizes(r0)
            r6.put(r0, r4)
            goto L48
        L118:
            java.lang.Object r1 = r0.next()
            com.googlecode.mp4parser.authoring.Track r1 = (com.googlecode.mp4parser.authoring.Track) r1
            java.util.List r3 = r1.getSamples()
            r11.putSamples(r1, r3)
            int r4 = r3.size()
            long[] r5 = new long[r4]
        L12b:
            if (r2 < r4) goto L134
            java.util.HashMap<com.googlecode.mp4parser.authoring.Track, long[]> r2 = r11.track2SampleSizes
            r2.put(r1, r5)
            goto L28
        L134:
            java.lang.Object r6 = r3.get(r2)
            com.googlecode.mp4parser.authoring.Sample r6 = (com.googlecode.mp4parser.authoring.Sample) r6
            long r6 = r6.getSize()
            r5[r2] = r6
            int r2 = r2 + 1
            goto L12b
    }

    protected void createCencBoxes(com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack r17, com.coremedia.iso.boxes.SampleTableBox r18, int[] r19) {
            r16 = this;
            r0 = r18
            r1 = r19
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox r2 = new com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox
            r2.<init>()
            java.lang.String r3 = "cenc"
            r2.setAuxInfoType(r3)
            r3 = 1
            r2.setFlags(r3)
            java.util.List r3 = r17.getSampleEncryptionEntries()
            boolean r4 = r17.hasSubSampleEncryption()
            if (r4 == 0) goto L39
            int r4 = r3.size()
            short[] r6 = new short[r4]
            r7 = 0
        L23:
            if (r7 < r4) goto L29
            r2.setSampleInfoSizes(r6)
            goto L49
        L29:
            java.lang.Object r8 = r3.get(r7)
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r8 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat) r8
            int r8 = r8.getSize()
            short r8 = (short) r8
            r6[r7] = r8
            int r7 = r7 + 1
            goto L23
        L39:
            r4 = 8
            r2.setDefaultSampleInfoSize(r4)
            java.util.List r4 = r17.getSamples()
            int r4 = r4.size()
            r2.setSampleCount(r4)
        L49:
            com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox r4 = new com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox
            r4.<init>()
            com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox r6 = new com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox
            r6.<init>()
            boolean r7 = r17.hasSubSampleEncryption()
            r6.setSubSampleEncryption(r7)
            r6.setEntries(r3)
            int r7 = r6.getOffsetToFirstIV()
            long r7 = (long) r7
            int r9 = r1.length
            long[] r9 = new long[r9]
            r10 = 0
            r11 = 0
        L67:
            int r12 = r1.length
            if (r10 < r12) goto L7e
            r4.setOffsets(r9)
            r0.addBox(r2)
            r0.addBox(r4)
            r0.addBox(r6)
            r12 = r16
            java.util.Set<com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox> r0 = r12.sampleAuxiliaryInformationOffsetsBoxes
            r0.add(r4)
            return
        L7e:
            r12 = r16
            r9[r10] = r7
            r13 = 0
        L83:
            r14 = r1[r10]
            if (r13 < r14) goto L8a
            int r10 = r10 + 1
            goto L67
        L8a:
            int r14 = r11 + 1
            java.lang.Object r11 = r3.get(r11)
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r11 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat) r11
            int r11 = r11.getSize()
            r15 = r6
            long r5 = (long) r11
            long r7 = r7 + r5
            int r13 = r13 + 1
            r11 = r14
            r6 = r15
            goto L83
    }

    protected void createCtts(com.googlecode.mp4parser.authoring.Track r2, com.coremedia.iso.boxes.SampleTableBox r3) {
            r1 = this;
            java.util.List r2 = r2.getCompositionTimeEntries()
            if (r2 == 0) goto L17
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L17
            com.coremedia.iso.boxes.CompositionTimeToSample r0 = new com.coremedia.iso.boxes.CompositionTimeToSample
            r0.<init>()
            r0.setEntries(r2)
            r3.addBox(r0)
        L17:
            return
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
            r1 = 0
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

    protected com.coremedia.iso.boxes.FileTypeBox createFileTypeBox(com.googlecode.mp4parser.authoring.Movie r5) {
            r4 = this;
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.lang.String r0 = "mp42"
            r5.add(r0)
            java.lang.String r1 = "isom"
            r5.add(r1)
            com.coremedia.iso.boxes.FileTypeBox r1 = new com.coremedia.iso.boxes.FileTypeBox
            r2 = 0
            r1.<init>(r0, r2, r5)
            return r1
    }

    protected com.coremedia.iso.boxes.MovieBox createMovieBox(com.googlecode.mp4parser.authoring.Movie r17, java.util.Map<com.googlecode.mp4parser.authoring.Track, int[]> r18) {
            r16 = this;
            com.coremedia.iso.boxes.MovieBox r0 = new com.coremedia.iso.boxes.MovieBox
            r0.<init>()
            com.coremedia.iso.boxes.MovieHeaderBox r1 = new com.coremedia.iso.boxes.MovieHeaderBox
            r1.<init>()
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            r1.setCreationTime(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            r1.setModificationTime(r2)
            com.googlecode.mp4parser.util.Matrix r2 = r17.getMatrix()
            r1.setMatrix(r2)
            long r2 = r16.getTimescale(r17)
            java.util.List r4 = r17.getTracks()
            java.util.Iterator r4 = r4.iterator()
            r7 = 0
        L2f:
            boolean r9 = r4.hasNext()
            if (r9 != 0) goto La2
            r1.setDuration(r7)
            r1.setTimescale(r2)
            java.util.List r2 = r17.getTracks()
            java.util.Iterator r9 = r2.iterator()
            r5 = 0
        L45:
            boolean r2 = r9.hasNext()
            if (r2 != 0) goto L80
            r2 = 1
            long r5 = r5 + r2
            r1.setNextTrackId(r5)
            r0.addBox(r1)
            java.util.List r1 = r17.getTracks()
            java.util.Iterator r2 = r1.iterator()
        L5c:
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L6c
            com.coremedia.iso.boxes.Box r1 = r16.createUdta(r17)
            if (r1 == 0) goto L6b
            r0.addBox(r1)
        L6b:
            return r0
        L6c:
            java.lang.Object r1 = r2.next()
            com.googlecode.mp4parser.authoring.Track r1 = (com.googlecode.mp4parser.authoring.Track) r1
            r10 = r16
            r11 = r17
            r12 = r18
            com.coremedia.iso.boxes.TrackBox r1 = r10.createTrackBox(r1, r11, r12)
            r0.addBox(r1)
            goto L5c
        L80:
            r10 = r16
            r11 = r17
            r12 = r18
            java.lang.Object r2 = r9.next()
            com.googlecode.mp4parser.authoring.Track r2 = (com.googlecode.mp4parser.authoring.Track) r2
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r2.getTrackMetaData()
            long r3 = r3.getTrackId()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L45
            com.googlecode.mp4parser.authoring.TrackMetaData r2 = r2.getTrackMetaData()
            long r2 = r2.getTrackId()
            r5 = r2
            goto L45
        La2:
            r10 = r16
            r11 = r17
            r12 = r18
            java.lang.Object r9 = r4.next()
            com.googlecode.mp4parser.authoring.Track r9 = (com.googlecode.mp4parser.authoring.Track) r9
            java.util.List r13 = r9.getEdits()
            if (r13 == 0) goto Le2
            java.util.List r13 = r9.getEdits()
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto Lbf
            goto Le2
        Lbf:
            r13 = 0
            java.util.List r9 = r9.getEdits()
            java.util.Iterator r15 = r9.iterator()
        Lc9:
            boolean r9 = r15.hasNext()
            if (r9 != 0) goto Ld4
            double r5 = (double) r2
            double r13 = r13 * r5
            long r5 = (long) r13
            goto Lf1
        Ld4:
            java.lang.Object r5 = r15.next()
            com.googlecode.mp4parser.authoring.Edit r5 = (com.googlecode.mp4parser.authoring.Edit) r5
            double r5 = r5.getSegmentDuration()
            long r5 = (long) r5
            double r5 = (double) r5
            double r13 = r13 + r5
            goto Lc9
        Le2:
            long r5 = r9.getDuration()
            long r5 = r5 * r2
            com.googlecode.mp4parser.authoring.TrackMetaData r9 = r9.getTrackMetaData()
            long r13 = r9.getTimescale()
            long r5 = r5 / r13
        Lf1:
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L2f
            r7 = r5
            goto L2f
    }

    protected void createSdtp(com.googlecode.mp4parser.authoring.Track r2, com.coremedia.iso.boxes.SampleTableBox r3) {
            r1 = this;
            java.util.List r0 = r2.getSampleDependencies()
            if (r0 == 0) goto L1f
            java.util.List r0 = r2.getSampleDependencies()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            com.coremedia.iso.boxes.SampleDependencyTypeBox r0 = new com.coremedia.iso.boxes.SampleDependencyTypeBox
            r0.<init>()
            java.util.List r2 = r2.getSampleDependencies()
            r0.setEntries(r2)
            r3.addBox(r0)
        L1f:
            return
    }

    protected com.coremedia.iso.boxes.Box createStbl(com.googlecode.mp4parser.authoring.Track r17, com.googlecode.mp4parser.authoring.Movie r18, java.util.Map<com.googlecode.mp4parser.authoring.Track, int[]> r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            com.coremedia.iso.boxes.SampleTableBox r3 = new com.coremedia.iso.boxes.SampleTableBox
            r3.<init>()
            r0.createStsd(r1, r3)
            r0.createStts(r1, r3)
            r0.createCtts(r1, r3)
            r0.createStss(r1, r3)
            r0.createSdtp(r1, r3)
            r0.createStsc(r1, r2, r3)
            r0.createStsz(r1, r3)
            r4 = r18
            r0.createStco(r1, r4, r2, r3)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Map r5 = r17.getSampleGroups()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L36:
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto Lea
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r6 = r4.iterator()
        L44:
            boolean r4 = r6.hasNext()
            if (r4 != 0) goto L5e
            boolean r4 = r1 instanceof com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
            if (r4 == 0) goto L5a
            r4 = r1
            com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack r4 = (com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack) r4
            java.lang.Object r2 = r2.get(r1)
            int[] r2 = (int[]) r2
            r0.createCencBoxes(r4, r3, r2)
        L5a:
            r0.createSubs(r1, r3)
            return r3
        L5e:
            java.lang.Object r4 = r6.next()
            r7 = r4
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox r8 = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox
            r8.<init>()
            java.lang.Object r4 = r7.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r7.getValue()
            java.util.List r5 = (java.util.List) r5
            r8.setGroupEntries(r5)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox r9 = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox
            r9.<init>()
            r9.setGroupingType(r4)
            r4 = 0
            r10 = 0
            r11 = r4
            r12 = 0
        L85:
            java.util.List r4 = r17.getSamples()
            int r4 = r4.size()
            if (r12 < r4) goto L96
            r3.addBox(r8)
            r3.addBox(r9)
            goto L44
        L96:
            r4 = 0
            r5 = 0
        L98:
            java.lang.Object r13 = r7.getValue()
            java.util.List r13 = (java.util.List) r13
            int r13 = r13.size()
            if (r4 < r13) goto Lc8
            r13 = 1
            if (r11 == 0) goto Lb8
            int r4 = r11.getGroupDescriptionIndex()
            if (r4 == r5) goto Laf
            goto Lb8
        Laf:
            long r4 = r11.getSampleCount()
            long r4 = r4 + r13
            r11.setSampleCount(r4)
            goto Lc5
        Lb8:
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry r4 = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$Entry
            r4.<init>(r13, r5)
            java.util.List r5 = r9.getEntries()
            r5.add(r4)
            r11 = r4
        Lc5:
            int r12 = r12 + 1
            goto L85
        Lc8:
            java.lang.Object r13 = r7.getValue()
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r13.get(r4)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r13 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r13
            java.util.Map r14 = r17.getSampleGroups()
            java.lang.Object r13 = r14.get(r13)
            long[] r13 = (long[]) r13
            long r14 = (long) r12
            int r13 = java.util.Arrays.binarySearch(r13, r14)
            if (r13 < 0) goto Le7
            int r5 = r4 + 1
        Le7:
            int r4 = r4 + 1
            goto L98
        Lea:
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r7 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r7
            java.lang.String r7 = r7.getType()
            java.lang.Object r8 = r4.get(r7)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L10a
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r4.put(r7, r8)
        L10a:
            java.lang.Object r6 = r6.getKey()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r6 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r6
            r8.add(r6)
            goto L36
    }

    protected void createStco(com.googlecode.mp4parser.authoring.Track r22, com.googlecode.mp4parser.authoring.Movie r23, java.util.Map<com.googlecode.mp4parser.authoring.Track, int[]> r24, com.coremedia.iso.boxes.SampleTableBox r25) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            java.util.Map<com.googlecode.mp4parser.authoring.Track, com.coremedia.iso.boxes.StaticChunkOffsetBox> r3 = r0.chunkOffsetBoxes
            java.lang.Object r3 = r3.get(r1)
            if (r3 != 0) goto L162
            r3 = 0
            java.util.logging.Logger r5 = com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder.LOG
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r5 = r5.isLoggable(r6)
            if (r5 == 0) goto L35
            java.util.logging.Logger r5 = com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder.LOG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Calculating chunk offsets for track_"
            r6.<init>(r7)
            com.googlecode.mp4parser.authoring.TrackMetaData r7 = r22.getTrackMetaData()
            long r7 = r7.getTrackId()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.fine(r6)
        L35:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.Set r6 = r24.keySet()
            r5.<init>(r6)
            com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder$1 r6 = new com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder$1
            r6.<init>(r0)
            java.util.Collections.sort(r5, r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r9 = r5.iterator()
        L59:
            boolean r10 = r9.hasNext()
            r11 = 0
            if (r10 != 0) goto L134
            r12 = r3
        L61:
            r3 = 0
            java.util.Iterator r10 = r5.iterator()
        L66:
            boolean r4 = r10.hasNext()
            if (r4 != 0) goto Lf9
            if (r3 != 0) goto L70
            goto L162
        L70:
            java.util.Map<com.googlecode.mp4parser.authoring.Track, com.coremedia.iso.boxes.StaticChunkOffsetBox> r4 = r0.chunkOffsetBoxes
            java.lang.Object r4 = r4.get(r3)
            com.coremedia.iso.boxes.ChunkOffsetBox r4 = (com.coremedia.iso.boxes.ChunkOffsetBox) r4
            long[] r9 = r4.getChunkOffsets()
            r10 = 1
            long[] r10 = new long[r10]
            r10[r11] = r12
            long[] r9 = com.googlecode.mp4parser.util.Mp4Arrays.copyOfAndAppend(r9, r10)
            r4.setChunkOffsets(r9)
            java.lang.Object r4 = r6.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r9 = r2.get(r3)
            int[] r9 = (int[]) r9
            r9 = r9[r4]
            java.lang.Object r10 = r7.get(r3)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r14 = r10.intValue()
            java.lang.Object r10 = r8.get(r3)
            java.lang.Double r10 = (java.lang.Double) r10
            double r15 = r10.doubleValue()
            r10 = r14
        Laf:
            int r11 = r14 + r9
            if (r10 < r11) goto Lcc
            int r4 = r4 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.put(r3, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r7.put(r3, r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r15)
            r8.put(r3, r4)
            r11 = 0
            goto L61
        Lcc:
            java.util.HashMap<com.googlecode.mp4parser.authoring.Track, long[]> r11 = r0.track2SampleSizes
            java.lang.Object r11 = r11.get(r3)
            long[] r11 = (long[]) r11
            r17 = r11[r10]
            long r12 = r12 + r17
            long[] r11 = r3.getSampleDurations()
            r18 = r4
            r17 = r5
            r4 = r11[r10]
            double r4 = (double) r4
            com.googlecode.mp4parser.authoring.TrackMetaData r11 = r3.getTrackMetaData()
            r19 = r12
            long r11 = r11.getTimescale()
            double r11 = (double) r11
            double r4 = r4 / r11
            double r15 = r15 + r4
            int r10 = r10 + 1
            r5 = r17
            r4 = r18
            r12 = r19
            goto Laf
        Lf9:
            r17 = r5
            java.lang.Object r4 = r10.next()
            com.googlecode.mp4parser.authoring.Track r4 = (com.googlecode.mp4parser.authoring.Track) r4
            if (r3 == 0) goto L11b
            java.lang.Object r5 = r8.get(r4)
            java.lang.Double r5 = (java.lang.Double) r5
            double r14 = r5.doubleValue()
            java.lang.Object r5 = r8.get(r3)
            java.lang.Double r5 = (java.lang.Double) r5
            double r18 = r5.doubleValue()
            int r5 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r5 >= 0) goto L12f
        L11b:
            java.lang.Object r5 = r6.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r9 = r2.get(r4)
            int[] r9 = (int[]) r9
            int r9 = r9.length
            if (r5 >= r9) goto L12f
            r3 = r4
        L12f:
            r5 = r17
            r11 = 0
            goto L66
        L134:
            r17 = r5
            java.lang.Object r5 = r9.next()
            com.googlecode.mp4parser.authoring.Track r5 = (com.googlecode.mp4parser.authoring.Track) r5
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r6.put(r5, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.put(r5, r10)
            r10 = 0
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r8.put(r5, r10)
            java.util.Map<com.googlecode.mp4parser.authoring.Track, com.coremedia.iso.boxes.StaticChunkOffsetBox> r10 = r0.chunkOffsetBoxes
            com.coremedia.iso.boxes.StaticChunkOffsetBox r11 = new com.coremedia.iso.boxes.StaticChunkOffsetBox
            r11.<init>()
            r10.put(r5, r11)
            r5 = r17
            goto L59
        L162:
            java.util.Map<com.googlecode.mp4parser.authoring.Track, com.coremedia.iso.boxes.StaticChunkOffsetBox> r2 = r0.chunkOffsetBoxes
            java.lang.Object r1 = r2.get(r1)
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
            r2 = r25
            r2.addBox(r1)
            return
    }

    protected void createStsc(com.googlecode.mp4parser.authoring.Track r11, java.util.Map<com.googlecode.mp4parser.authoring.Track, int[]> r12, com.coremedia.iso.boxes.SampleTableBox r13) {
            r10 = this;
            java.lang.Object r11 = r12.get(r11)
            int[] r11 = (int[]) r11
            com.coremedia.iso.boxes.SampleToChunkBox r12 = new com.coremedia.iso.boxes.SampleToChunkBox
            r12.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r12.setEntries(r0)
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            r2 = 0
        L17:
            int r3 = r11.length
            if (r2 < r3) goto L1e
            r13.addBox(r12)
            return
        L1e:
            r3 = r11[r2]
            long r3 = (long) r3
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L3d
            java.util.List r0 = r12.getEntries()
            com.coremedia.iso.boxes.SampleToChunkBox$Entry r1 = new com.coremedia.iso.boxes.SampleToChunkBox$Entry
            int r3 = r2 + 1
            long r4 = (long) r3
            r3 = r11[r2]
            long r6 = (long) r3
            r8 = 1
            r3 = r1
            r3.<init>(r4, r6, r8)
            r0.add(r1)
            r0 = r11[r2]
            long r0 = (long) r0
        L3d:
            int r2 = r2 + 1
            goto L17
    }

    protected void createStsd(com.googlecode.mp4parser.authoring.Track r1, com.coremedia.iso.boxes.SampleTableBox r2) {
            r0 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = r1.getSampleDescriptionBox()
            r2.addBox(r1)
            return
    }

    protected void createStss(com.googlecode.mp4parser.authoring.Track r2, com.coremedia.iso.boxes.SampleTableBox r3) {
            r1 = this;
            long[] r2 = r2.getSyncSamples()
            if (r2 == 0) goto L14
            int r0 = r2.length
            if (r0 <= 0) goto L14
            com.coremedia.iso.boxes.SyncSampleBox r0 = new com.coremedia.iso.boxes.SyncSampleBox
            r0.<init>()
            r0.setSampleNumber(r2)
            r3.addBox(r0)
        L14:
            return
    }

    protected void createStsz(com.googlecode.mp4parser.authoring.Track r3, com.coremedia.iso.boxes.SampleTableBox r4) {
            r2 = this;
            com.coremedia.iso.boxes.SampleSizeBox r0 = new com.coremedia.iso.boxes.SampleSizeBox
            r0.<init>()
            java.util.HashMap<com.googlecode.mp4parser.authoring.Track, long[]> r1 = r2.track2SampleSizes
            java.lang.Object r3 = r1.get(r3)
            long[] r3 = (long[]) r3
            r0.setSampleSizes(r3)
            r4.addBox(r0)
            return
    }

    protected void createStts(com.googlecode.mp4parser.authoring.Track r12, com.coremedia.iso.boxes.SampleTableBox r13) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            long[] r12 = r12.getSampleDurations()
            int r1 = r12.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 < r1) goto L1a
            com.coremedia.iso.boxes.TimeToSampleBox r12 = new com.coremedia.iso.boxes.TimeToSampleBox
            r12.<init>()
            r12.setEntries(r0)
            r13.addBox(r12)
            return
        L1a:
            r4 = r12[r3]
            r6 = 1
            if (r2 == 0) goto L31
            long r8 = r2.getDelta()
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L31
            long r4 = r2.getCount()
            long r4 = r4 + r6
            r2.setCount(r4)
            goto L39
        L31:
            com.coremedia.iso.boxes.TimeToSampleBox$Entry r2 = new com.coremedia.iso.boxes.TimeToSampleBox$Entry
            r2.<init>(r6, r4)
            r0.add(r2)
        L39:
            int r3 = r3 + 1
            goto Lc
    }

    protected void createSubs(com.googlecode.mp4parser.authoring.Track r2, com.coremedia.iso.boxes.SampleTableBox r3) {
            r1 = this;
            com.coremedia.iso.boxes.SubSampleInformationBox r0 = r2.getSubsampleInformationBox()
            if (r0 == 0) goto Ld
            com.coremedia.iso.boxes.SubSampleInformationBox r2 = r2.getSubsampleInformationBox()
            r3.addBox(r2)
        Ld:
            return
    }

    protected com.coremedia.iso.boxes.TrackBox createTrackBox(com.googlecode.mp4parser.authoring.Track r9, com.googlecode.mp4parser.authoring.Movie r10, java.util.Map<com.googlecode.mp4parser.authoring.Track, int[]> r11) {
            r8 = this;
            com.coremedia.iso.boxes.TrackBox r0 = new com.coremedia.iso.boxes.TrackBox
            r0.<init>()
            com.coremedia.iso.boxes.TrackHeaderBox r1 = new com.coremedia.iso.boxes.TrackHeaderBox
            r1.<init>()
            r2 = 1
            r1.setEnabled(r2)
            r1.setInMovie(r2)
            r1.setInPreview(r2)
            r1.setInPoster(r2)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r9.getTrackMetaData()
            com.googlecode.mp4parser.util.Matrix r3 = r3.getMatrix()
            r1.setMatrix(r3)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r9.getTrackMetaData()
            int r3 = r3.getGroup()
            r1.setAlternateGroup(r3)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r9.getTrackMetaData()
            java.util.Date r3 = r3.getCreationTime()
            r1.setCreationTime(r3)
            java.util.List r3 = r9.getEdits()
            if (r3 == 0) goto L74
            java.util.List r3 = r9.getEdits()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L49
            goto L74
        L49:
            r3 = 0
            java.util.List r5 = r9.getEdits()
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L67
            com.googlecode.mp4parser.authoring.TrackMetaData r5 = r9.getTrackMetaData()
            long r5 = r5.getTimescale()
            long r3 = r3 * r5
            r1.setDuration(r3)
            goto L8a
        L67:
            java.lang.Object r6 = r5.next()
            com.googlecode.mp4parser.authoring.Edit r6 = (com.googlecode.mp4parser.authoring.Edit) r6
            double r6 = r6.getSegmentDuration()
            long r6 = (long) r6
            long r3 = r3 + r6
            goto L53
        L74:
            long r3 = r9.getDuration()
            long r5 = r8.getTimescale(r10)
            long r3 = r3 * r5
            com.googlecode.mp4parser.authoring.TrackMetaData r5 = r9.getTrackMetaData()
            long r5 = r5.getTimescale()
            long r3 = r3 / r5
            r1.setDuration(r3)
        L8a:
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r9.getTrackMetaData()
            double r3 = r3.getHeight()
            r1.setHeight(r3)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r9.getTrackMetaData()
            double r3 = r3.getWidth()
            r1.setWidth(r3)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r9.getTrackMetaData()
            int r3 = r3.getLayer()
            r1.setLayer(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            r1.setModificationTime(r3)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r9.getTrackMetaData()
            long r3 = r3.getTrackId()
            r1.setTrackId(r3)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r9.getTrackMetaData()
            float r3 = r3.getVolume()
            r1.setVolume(r3)
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r8.createEdts(r9, r10)
            r0.addBox(r1)
            com.coremedia.iso.boxes.MediaBox r1 = new com.coremedia.iso.boxes.MediaBox
            r1.<init>()
            r0.addBox(r1)
            com.coremedia.iso.boxes.MediaHeaderBox r3 = new com.coremedia.iso.boxes.MediaHeaderBox
            r3.<init>()
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r9.getTrackMetaData()
            java.util.Date r4 = r4.getCreationTime()
            r3.setCreationTime(r4)
            long r4 = r9.getDuration()
            r3.setDuration(r4)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r9.getTrackMetaData()
            long r4 = r4.getTimescale()
            r3.setTimescale(r4)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r9.getTrackMetaData()
            java.lang.String r4 = r4.getLanguage()
            r3.setLanguage(r4)
            r1.addBox(r3)
            com.coremedia.iso.boxes.HandlerBox r3 = new com.coremedia.iso.boxes.HandlerBox
            r3.<init>()
            r1.addBox(r3)
            java.lang.String r4 = r9.getHandler()
            r3.setHandlerType(r4)
            com.coremedia.iso.boxes.MediaInformationBox r3 = new com.coremedia.iso.boxes.MediaInformationBox
            r3.<init>()
            java.lang.String r4 = r9.getHandler()
            java.lang.String r5 = "vide"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L134
            com.coremedia.iso.boxes.VideoMediaHeaderBox r4 = new com.coremedia.iso.boxes.VideoMediaHeaderBox
            r4.<init>()
            r3.addBox(r4)
            goto L19c
        L134:
            java.lang.String r4 = r9.getHandler()
            java.lang.String r5 = "soun"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L149
            com.coremedia.iso.boxes.SoundMediaHeaderBox r4 = new com.coremedia.iso.boxes.SoundMediaHeaderBox
            r4.<init>()
            r3.addBox(r4)
            goto L19c
        L149:
            java.lang.String r4 = r9.getHandler()
            java.lang.String r5 = "text"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L15e
            com.coremedia.iso.boxes.NullMediaHeaderBox r4 = new com.coremedia.iso.boxes.NullMediaHeaderBox
            r4.<init>()
            r3.addBox(r4)
            goto L19c
        L15e:
            java.lang.String r4 = r9.getHandler()
            java.lang.String r5 = "subt"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L173
            com.coremedia.iso.boxes.SubtitleMediaHeaderBox r4 = new com.coremedia.iso.boxes.SubtitleMediaHeaderBox
            r4.<init>()
            r3.addBox(r4)
            goto L19c
        L173:
            java.lang.String r4 = r9.getHandler()
            java.lang.String r5 = "hint"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L188
            com.coremedia.iso.boxes.HintMediaHeaderBox r4 = new com.coremedia.iso.boxes.HintMediaHeaderBox
            r4.<init>()
            r3.addBox(r4)
            goto L19c
        L188:
            java.lang.String r4 = r9.getHandler()
            java.lang.String r5 = "sbtl"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L19c
            com.coremedia.iso.boxes.NullMediaHeaderBox r4 = new com.coremedia.iso.boxes.NullMediaHeaderBox
            r4.<init>()
            r3.addBox(r4)
        L19c:
            com.coremedia.iso.boxes.DataInformationBox r4 = new com.coremedia.iso.boxes.DataInformationBox
            r4.<init>()
            com.coremedia.iso.boxes.DataReferenceBox r5 = new com.coremedia.iso.boxes.DataReferenceBox
            r5.<init>()
            r4.addBox(r5)
            com.coremedia.iso.boxes.DataEntryUrlBox r6 = new com.coremedia.iso.boxes.DataEntryUrlBox
            r6.<init>()
            r6.setFlags(r2)
            r5.addBox(r6)
            r3.addBox(r4)
            com.coremedia.iso.boxes.Box r9 = r8.createStbl(r9, r10, r11)
            r3.addBox(r9)
            r1.addBox(r3)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createUdta(com.googlecode.mp4parser.authoring.Movie r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    int[] getChunkSizes(com.googlecode.mp4parser.authoring.Track r12) {
            r11 = this;
            com.googlecode.mp4parser.authoring.builder.Fragmenter r0 = r11.fragmenter
            long[] r0 = r0.sampleNumbers(r12)
            int r1 = r0.length
            int[] r1 = new int[r1]
            r2 = 0
        La:
            int r3 = r0.length
            if (r2 < r3) goto Le
            return r1
        Le:
            r3 = r0[r2]
            r5 = 1
            long r3 = r3 - r5
            int r7 = r0.length
            int r8 = r2 + 1
            if (r7 != r8) goto L22
            java.util.List r5 = r12.getSamples()
            int r5 = r5.size()
            long r5 = (long) r5
            goto L26
        L22:
            r9 = r0[r8]
            long r5 = r9 - r5
        L26:
            long r5 = r5 - r3
            int r3 = com.googlecode.mp4parser.util.CastUtils.l2i(r5)
            r1[r2] = r3
            r2 = r8
            goto La
    }

    public long getTimescale(com.googlecode.mp4parser.authoring.Movie r5) {
            r4 = this;
            java.util.List r0 = r5.getTracks()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            com.googlecode.mp4parser.authoring.Track r0 = (com.googlecode.mp4parser.authoring.Track) r0
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            long r0 = r0.getTimescale()
            java.util.List r5 = r5.getTracks()
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L25
            return r0
        L25:
            java.lang.Object r2 = r5.next()
            com.googlecode.mp4parser.authoring.Track r2 = (com.googlecode.mp4parser.authoring.Track) r2
            com.googlecode.mp4parser.authoring.TrackMetaData r2 = r2.getTrackMetaData()
            long r2 = r2.getTimescale()
            long r0 = com.googlecode.mp4parser.util.Math.lcm(r0, r2)
            goto L1e
    }

    protected java.util.List<com.googlecode.mp4parser.authoring.Sample> putSamples(com.googlecode.mp4parser.authoring.Track r2, java.util.List<com.googlecode.mp4parser.authoring.Sample> r3) {
            r1 = this;
            java.util.HashMap<com.googlecode.mp4parser.authoring.Track, java.util.List<com.googlecode.mp4parser.authoring.Sample>> r0 = r1.track2Sample
            java.lang.Object r2 = r0.put(r2, r3)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public void setFragmenter(com.googlecode.mp4parser.authoring.builder.Fragmenter r1) {
            r0 = this;
            r0.fragmenter = r1
            return
    }
}
