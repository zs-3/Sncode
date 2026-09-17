package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class CencEncryptingTrackImpl implements com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack {
    java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> cencSampleAuxiliaryData;
    java.lang.Object configurationBox;
    java.util.UUID defaultKeyId;
    boolean dummyIvs;
    private final java.lang.String encryptionAlgo;
    com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> indexToKey;
    java.util.Map<java.util.UUID, javax.crypto.SecretKey> keys;
    java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> sampleGroups;
    java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    com.googlecode.mp4parser.authoring.Track source;
    com.coremedia.iso.boxes.SampleDescriptionBox stsd;
    boolean subSampleEncryption;


    public CencEncryptingTrackImpl(com.googlecode.mp4parser.authoring.Track r9, java.util.UUID r10, java.util.Map<java.util.UUID, javax.crypto.SecretKey> r11, java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry, long[]> r12, java.lang.String r13, boolean r14) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public CencEncryptingTrackImpl(com.googlecode.mp4parser.authoring.Track r17, java.util.UUID r18, java.util.Map<java.util.UUID, javax.crypto.SecretKey> r19, java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry, long[]> r20, java.lang.String r21, boolean r22, boolean r23) {
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r22
            r16.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r4 = 0
            r0.subSampleEncryption = r4
            r5 = 0
            r0.stsd = r5
            r6 = r17
            r0.source = r6
            r0.keys = r2
            r0.defaultKeyId = r1
            r0.dummyIvs = r3
            r7 = r21
            r0.encryptionAlgo = r7
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.sampleGroups = r7
            java.util.Map r7 = r17.getSampleGroups()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L37:
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L254
            if (r20 == 0) goto L66
            java.util.Set r7 = r20.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L47:
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L4e
            goto L66
        L4e:
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> r9 = r0.sampleGroups
            java.lang.Object r10 = r8.getKey()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r10 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r10
            java.lang.Object r8 = r8.getValue()
            long[] r8 = (long[]) r8
            r9.put(r10, r8)
            goto L47
        L66:
            com.googlecode.mp4parser.authoring.tracks.CencEncryptingTrackImpl$1 r7 = new com.googlecode.mp4parser.authoring.tracks.CencEncryptingTrackImpl$1
            java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> r8 = r0.sampleGroups
            r7.<init>(r0, r8)
            r0.sampleGroups = r7
            java.util.List r7 = r17.getSamples()
            r0.samples = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.cencSampleAuxiliaryData = r7
            java.math.BigInteger r8 = new java.math.BigInteger
            java.lang.String r7 = "1"
            r8.<init>(r7)
            r9 = 8
            byte[] r7 = new byte[r9]
            if (r3 != 0) goto L91
            java.security.SecureRandom r3 = new java.security.SecureRandom
            r3.<init>()
            r3.nextBytes(r7)
        L91:
            java.math.BigInteger r10 = new java.math.BigInteger
            r11 = 1
            r10.<init>(r11, r7)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            if (r20 == 0) goto La5
            java.util.Set r3 = r20.keySet()
            r12.addAll(r3)
        La5:
            com.googlecode.mp4parser.util.RangeStartMap r3 = new com.googlecode.mp4parser.util.RangeStartMap
            r3.<init>()
            r0.indexToKey = r3
            r13 = -1
            r14 = 0
            r15 = -1
        Laf:
            java.util.List r3 = r17.getSamples()
            int r3 = r3.size()
            if (r14 < r3) goto L1ba
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = r17.getSampleDescriptionBox()
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r1 = r1.getSampleEntry()
            java.util.List r1 = r1.getBoxes()
            java.util.Iterator r3 = r1.iterator()
        Lc9:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L191
            r1 = 0
        Ld0:
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r2 = r0.samples
            int r2 = r2.size()
            if (r1 < r2) goto Ld9
            return
        Ld9:
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r2 = r0.samples
            java.lang.Object r2 = r2.get(r1)
            com.googlecode.mp4parser.authoring.Sample r2 = (com.googlecode.mp4parser.authoring.Sample) r2
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat r3 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat
            r3.<init>()
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r5 = r0.cencSampleAuxiliaryData
            r5.add(r3)
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r5 = r0.indexToKey
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Object r5 = r5.get(r6)
            if (r5 == 0) goto L18d
            byte[] r5 = r10.toByteArray()
            byte[] r6 = new byte[r9]
            int r7 = r5.length
            int r7 = r7 - r9
            if (r7 <= 0) goto L104
            int r7 = r5.length
            int r7 = r7 - r9
            goto L105
        L104:
            r7 = 0
        L105:
            int r12 = r5.length
            int r12 = 8 - r12
            if (r12 >= 0) goto L10c
            r12 = 0
            goto L10f
        L10c:
            int r12 = r5.length
            int r12 = 8 - r12
        L10f:
            int r14 = r5.length
            if (r14 <= r9) goto L115
            r14 = 8
            goto L116
        L115:
            int r14 = r5.length
        L116:
            java.lang.System.arraycopy(r5, r7, r6, r12, r14)
            r3.iv = r6
            java.nio.ByteBuffer r2 = r2.asByteBuffer()
            java.nio.Buffer r2 = r2.rewind()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            boolean r5 = r0.subSampleEncryption
            if (r5 == 0) goto L188
            if (r23 == 0) goto L13c
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r5 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair[r11]
            int r2 = r2.remaining()
            r6 = 0
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair r2 = r3.createPair(r2, r6)
            r5[r4] = r2
            r3.pairs = r5
            goto L188
        L13c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 5
            r5.<init>(r6)
        L142:
            int r6 = r2.remaining()
            if (r6 > 0) goto L157
            int r2 = r5.size()
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r2 = new com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair[r2]
            java.lang.Object[] r2 = r5.toArray(r2)
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair[] r2 = (com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat.Pair[]) r2
            r3.pairs = r2
            goto L188
        L157:
            long r6 = com.coremedia.iso.IsoTypeReaderVariable.read(r2, r13)
            int r6 = com.googlecode.mp4parser.util.CastUtils.l2i(r6)
            int r7 = r6 + r13
            r12 = 112(0x70, float:1.57E-43)
            if (r7 < r12) goto L175
            java.nio.ByteBuffer r12 = r2.duplicate()
            boolean r12 = r0.isClearNal(r12)
            if (r12 == 0) goto L170
            goto L175
        L170:
            int r12 = r7 % 16
            int r12 = r12 + 96
            goto L176
        L175:
            r12 = r7
        L176:
            int r7 = r7 - r12
            long r14 = (long) r7
            com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat$Pair r7 = r3.createPair(r12, r14)
            r5.add(r7)
            int r7 = r2.position()
            int r7 = r7 + r6
            r2.position(r7)
            goto L142
        L188:
            java.math.BigInteger r2 = r10.add(r8)
            r10 = r2
        L18d:
            int r1 = r1 + 1
            goto Ld0
        L191:
            java.lang.Object r1 = r3.next()
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
            boolean r2 = r1 instanceof com.mp4parser.iso14496.part15.AvcConfigurationBox
            if (r2 == 0) goto L1a8
            r0.configurationBox = r1
            r2 = r1
            com.mp4parser.iso14496.part15.AvcConfigurationBox r2 = (com.mp4parser.iso14496.part15.AvcConfigurationBox) r2
            r0.subSampleEncryption = r11
            int r2 = r2.getLengthSizeMinusOne()
            int r2 = r2 + r11
            r13 = r2
        L1a8:
            boolean r2 = r1 instanceof com.mp4parser.iso14496.part15.HevcConfigurationBox
            if (r2 == 0) goto Lc9
            r0.configurationBox = r1
            com.mp4parser.iso14496.part15.HevcConfigurationBox r1 = (com.mp4parser.iso14496.part15.HevcConfigurationBox) r1
            r0.subSampleEncryption = r11
            int r1 = r1.getLengthSizeMinusOne()
            int r13 = r1 + 1
            goto Lc9
        L1ba:
            r3 = 0
            r7 = 0
        L1bc:
            int r4 = r12.size()
            if (r3 < r4) goto L232
            if (r15 == r7) goto L22d
            if (r7 != 0) goto L1d6
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r3 = r0.indexToKey
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            java.lang.Object r15 = r2.get(r1)
            javax.crypto.SecretKey r15 = (javax.crypto.SecretKey) r15
            r3.put(r4, r15)
            goto L22c
        L1d6:
            int r3 = r7 + (-1)
            java.lang.Object r4 = r12.get(r3)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry r4 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry) r4
            java.util.UUID r4 = r4.getKid()
            if (r4 == 0) goto L223
            java.lang.Object r4 = r12.get(r3)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry r4 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry) r4
            java.util.UUID r4 = r4.getKid()
            java.lang.Object r4 = r2.get(r4)
            javax.crypto.SecretKey r4 = (javax.crypto.SecretKey) r4
            if (r4 == 0) goto L200
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r3 = r0.indexToKey
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r3.put(r15, r4)
            goto L22c
        L200:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Key "
            r2.<init>(r4)
            java.lang.Object r3 = r12.get(r3)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry r3 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry) r3
            java.util.UUID r3 = r3.getKid()
            r2.append(r3)
            java.lang.String r3 = " was not supplied for decryption"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L223:
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r3 = r0.indexToKey
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r3.put(r4, r5)
        L22c:
            r15 = r7
        L22d:
            int r14 = r14 + 1
            r4 = 0
            goto Laf
        L232:
            java.lang.Object r4 = r12.get(r3)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r4 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r4
            java.util.Map r5 = r16.getSampleGroups()
            java.lang.Object r4 = r5.get(r4)
            long[] r4 = (long[]) r4
            r5 = r10
            long r9 = (long) r14
            int r4 = java.util.Arrays.binarySearch(r4, r9)
            if (r4 < 0) goto L24c
            int r7 = r3 + 1
        L24c:
            int r3 = r3 + 1
            r10 = r5
            r5 = 0
            r9 = 8
            goto L1bc
        L254:
            java.lang.Object r4 = r7.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            boolean r5 = r5 instanceof com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry
            if (r5 != 0) goto L273
            java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> r5 = r0.sampleGroups
            java.lang.Object r8 = r4.getKey()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r8 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r8
            java.lang.Object r4 = r4.getValue()
            long[] r4 = (long[]) r4
            r5.put(r8, r4)
        L273:
            r4 = 0
            r5 = 0
            goto L37
    }

    public CencEncryptingTrackImpl(com.googlecode.mp4parser.authoring.Track r8, java.util.UUID r9, javax.crypto.SecretKey r10, boolean r11) {
            r7 = this;
            java.util.Map r3 = java.util.Collections.singletonMap(r9, r10)
            r4 = 0
            java.lang.String r5 = "cenc"
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            r0.close()
            return
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            java.util.List r0 = r0.getCompositionTimeEntries()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public java.util.UUID getDefaultKeyId() {
            r1 = this;
            java.util.UUID r0 = r1.defaultKeyId
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long getDuration() {
            r2 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r2.source
            long r0 = r0.getDuration()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Edit> getEdits() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            java.util.List r0 = r0.getEdits()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            java.lang.String r0 = r0.getHandler()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getName() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "enc("
            r0.<init>(r1)
            com.googlecode.mp4parser.authoring.Track r1 = r2.source
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            java.util.List r0 = r0.getSampleDependencies()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public synchronized com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r6 = this;
            monitor-enter(r6)
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r6.stsd     // Catch: java.lang.Throwable -> Lf3
            if (r0 != 0) goto Lef
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lf3
            r0.<init>()     // Catch: java.lang.Throwable -> Lf3
            com.googlecode.mp4parser.authoring.Track r1 = r6.source     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = r1.getSampleDescriptionBox()     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            java.nio.channels.WritableByteChannel r2 = java.nio.channels.Channels.newChannel(r0)     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            r1.getBox(r2)     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            com.coremedia.iso.IsoFile r1 = new com.coremedia.iso.IsoFile     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            com.googlecode.mp4parser.MemoryDataSourceImpl r2 = new com.googlecode.mp4parser.MemoryDataSourceImpl     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            byte[] r0 = r0.toByteArray()     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            r2.<init>(r0)     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            r1.<init>(r2)     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            java.util.List r0 = r1.getBoxes()     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = (com.coremedia.iso.boxes.SampleDescriptionBox) r0     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            r6.stsd = r0     // Catch: java.io.IOException -> Le7 java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.OriginalFormatBox r0 = new com.coremedia.iso.boxes.OriginalFormatBox     // Catch: java.lang.Throwable -> Lf3
            r0.<init>()     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.SampleDescriptionBox r2 = r6.stsd     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r2.getSampleEntry()     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = r2.getType()     // Catch: java.lang.Throwable -> Lf3
            r0.setDataFormat(r2)     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.SampleDescriptionBox r2 = r6.stsd     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r2.getSampleEntry()     // Catch: java.lang.Throwable -> Lf3
            boolean r2 = r2 instanceof com.coremedia.iso.boxes.sampleentry.AudioSampleEntry     // Catch: java.lang.Throwable -> Lf3
            if (r2 == 0) goto L5c
            com.coremedia.iso.boxes.SampleDescriptionBox r2 = r6.stsd     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r2.getSampleEntry()     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r2 = (com.coremedia.iso.boxes.sampleentry.AudioSampleEntry) r2     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r3 = "enca"
            r2.setType(r3)     // Catch: java.lang.Throwable -> Lf3
            goto L73
        L5c:
            com.coremedia.iso.boxes.SampleDescriptionBox r2 = r6.stsd     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r2.getSampleEntry()     // Catch: java.lang.Throwable -> Lf3
            boolean r2 = r2 instanceof com.coremedia.iso.boxes.sampleentry.VisualSampleEntry     // Catch: java.lang.Throwable -> Lf3
            if (r2 == 0) goto Lc9
            com.coremedia.iso.boxes.SampleDescriptionBox r2 = r6.stsd     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r2.getSampleEntry()     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r2 = (com.coremedia.iso.boxes.sampleentry.VisualSampleEntry) r2     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r3 = "encv"
            r2.setType(r3)     // Catch: java.lang.Throwable -> Lf3
        L73:
            com.coremedia.iso.boxes.ProtectionSchemeInformationBox r2 = new com.coremedia.iso.boxes.ProtectionSchemeInformationBox     // Catch: java.lang.Throwable -> Lf3
            r2.<init>()     // Catch: java.lang.Throwable -> Lf3
            r2.addBox(r0)     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.SchemeTypeBox r0 = new com.coremedia.iso.boxes.SchemeTypeBox     // Catch: java.lang.Throwable -> Lf3
            r0.<init>()     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r3 = r6.encryptionAlgo     // Catch: java.lang.Throwable -> Lf3
            r0.setSchemeType(r3)     // Catch: java.lang.Throwable -> Lf3
            r3 = 65536(0x10000, float:9.18355E-41)
            r0.setSchemeVersion(r3)     // Catch: java.lang.Throwable -> Lf3
            r2.addBox(r0)     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.SchemeInformationBox r0 = new com.coremedia.iso.boxes.SchemeInformationBox     // Catch: java.lang.Throwable -> Lf3
            r0.<init>()     // Catch: java.lang.Throwable -> Lf3
            com.mp4parser.iso23001.part7.TrackEncryptionBox r3 = new com.mp4parser.iso23001.part7.TrackEncryptionBox     // Catch: java.lang.Throwable -> Lf3
            r3.<init>()     // Catch: java.lang.Throwable -> Lf3
            java.util.UUID r4 = r6.defaultKeyId     // Catch: java.lang.Throwable -> Lf3
            if (r4 != 0) goto L9d
            r4 = 0
            goto L9f
        L9d:
            r4 = 8
        L9f:
            r3.setDefaultIvSize(r4)     // Catch: java.lang.Throwable -> Lf3
            java.util.UUID r4 = r6.defaultKeyId     // Catch: java.lang.Throwable -> Lf3
            if (r4 != 0) goto La7
            goto La8
        La7:
            r1 = 1
        La8:
            r3.setDefaultAlgorithmId(r1)     // Catch: java.lang.Throwable -> Lf3
            java.util.UUID r1 = r6.defaultKeyId     // Catch: java.lang.Throwable -> Lf3
            if (r1 != 0) goto Lb6
            java.util.UUID r1 = new java.util.UUID     // Catch: java.lang.Throwable -> Lf3
            r4 = 0
            r1.<init>(r4, r4)     // Catch: java.lang.Throwable -> Lf3
        Lb6:
            r3.setDefault_KID(r1)     // Catch: java.lang.Throwable -> Lf3
            r0.addBox(r3)     // Catch: java.lang.Throwable -> Lf3
            r2.addBox(r0)     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r6.stsd     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r0 = r0.getSampleEntry()     // Catch: java.lang.Throwable -> Lf3
            r0.addBox(r2)     // Catch: java.lang.Throwable -> Lf3
            goto Lef
        Lc9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lf3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = "I don't know how to cenc "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.SampleDescriptionBox r2 = r6.stsd     // Catch: java.lang.Throwable -> Lf3
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r2.getSampleEntry()     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = r2.getType()     // Catch: java.lang.Throwable -> Lf3
            r1.append(r2)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lf3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf3
            throw r0     // Catch: java.lang.Throwable -> Lf3
        Le7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r1 = "Dumping stsd to memory failed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf3
            throw r0     // Catch: java.lang.Throwable -> Lf3
        Lef:
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r6.stsd     // Catch: java.lang.Throwable -> Lf3
            monitor-exit(r6)
            return r0
        Lf3:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            long[] r0 = r0.getSampleDurations()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> getSampleEncryptionEntries() {
            r1 = this;
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r0 = r1.cencSampleAuxiliaryData
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> getSampleGroups() {
            r1 = this;
            java.util.Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry, long[]> r0 = r1.sampleGroups
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r5 = this;
            com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList r0 = new com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r1 = r5.indexToKey
            com.googlecode.mp4parser.authoring.Track r2 = r5.source
            java.util.List r2 = r2.getSamples()
            java.util.List<com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat> r3 = r5.cencSampleAuxiliaryData
            java.lang.String r4 = r5.encryptionAlgo
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            com.coremedia.iso.boxes.SubSampleInformationBox r0 = r0.getSubsampleInformationBox()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            long[] r0 = r0.getSyncSamples()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.source
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack
    public boolean hasSubSampleEncryption() {
            r1 = this;
            boolean r0 = r1.subSampleEncryption
            return r0
    }

    public boolean isClearNal(java.nio.ByteBuffer r5) {
            r4 = this;
            java.lang.Object r0 = r4.configurationBox
            boolean r1 = r0 instanceof com.mp4parser.iso14496.part15.HevcConfigurationBox
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L27
            java.nio.ByteBuffer r5 = r5.slice()
            com.googlecode.mp4parser.authoring.tracks.h265.H265NalUnitHeader r5 = com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImpl.getNalUnitHeader(r5)
            int r5 = r5.nalUnitType
            if (r5 < 0) goto L18
            r0 = 9
            if (r5 <= r0) goto L26
        L18:
            r0 = 21
            r1 = 16
            if (r5 < r1) goto L20
            if (r5 <= r0) goto L26
        L20:
            if (r5 < r1) goto L25
            if (r5 > r0) goto L25
            goto L26
        L25:
            r2 = 1
        L26:
            return r2
        L27:
            boolean r0 = r0 instanceof com.mp4parser.iso14496.part15.AvcConfigurationBox
            if (r0 == 0) goto L4e
            java.nio.ByteBuffer r5 = r5.slice()
            com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader r5 = com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl.getNalUnitHeader(r5)
            int r5 = r5.nal_unit_type
            r0 = 19
            if (r5 == r0) goto L4d
            r0 = 2
            if (r5 == r0) goto L4d
            r0 = 3
            if (r5 == r0) goto L4d
            r0 = 4
            if (r5 == r0) goto L4d
            r0 = 20
            if (r5 == r0) goto L4d
            r0 = 5
            if (r5 == r0) goto L4d
            if (r5 != r3) goto L4c
            goto L4d
        L4c:
            r2 = 1
        L4d:
            return r2
        L4e:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "Subsample encryption is activated but the CencEncryptingTrackImpl can't say if this sample is to be encrypted or not!"
            r5.<init>(r0)
            throw r5
    }
}
