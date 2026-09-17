package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class CencDecryptingTrackImpl extends com.googlecode.mp4parser.authoring.AbstractTrack {
    com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> indexToKey;
    com.googlecode.mp4parser.authoring.Track original;
    com.googlecode.mp4parser.boxes.cenc.CencDecryptingSampleList samples;

    public CencDecryptingTrackImpl(com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack r11, java.util.Map<java.util.UUID, javax.crypto.SecretKey> r12) {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "dec("
            r0.<init>(r1)
            java.lang.String r1 = r11.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            com.googlecode.mp4parser.util.RangeStartMap r0 = new com.googlecode.mp4parser.util.RangeStartMap
            r0.<init>()
            r10.indexToKey = r0
            r10.original = r11
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r11.getSampleDescriptionBox()
            java.lang.String r1 = "enc./sinf/schm"
            com.coremedia.iso.boxes.Box r0 = com.googlecode.mp4parser.util.Path.getPath(r0, r1)
            com.coremedia.iso.boxes.SchemeTypeBox r0 = (com.coremedia.iso.boxes.SchemeTypeBox) r0
            java.lang.String r1 = r0.getSchemeType()
            java.lang.String r2 = "cenc"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L50
            java.lang.String r1 = r0.getSchemeType()
            java.lang.String r2 = "cbc1"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L48
            goto L50
        L48:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "You can only use the CencDecryptingTrackImpl with CENC (cenc or cbc1) encrypted tracks"
            r11.<init>(r12)
            throw r11
        L50:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r2 = r11.getSampleGroups()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L61:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L124
            r2 = -1
            r3 = 0
            r4 = -1
            r5 = 0
        L6b:
            java.util.List r2 = r11.getSamples()
            int r2 = r2.size()
            if (r5 < r2) goto L8b
            com.googlecode.mp4parser.boxes.cenc.CencDecryptingSampleList r12 = new com.googlecode.mp4parser.boxes.cenc.CencDecryptingSampleList
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r1 = r10.indexToKey
            java.util.List r2 = r11.getSamples()
            java.util.List r11 = r11.getSampleEncryptionEntries()
            java.lang.String r0 = r0.getSchemeType()
            r12.<init>(r1, r2, r11, r0)
            r10.samples = r12
            return
        L8b:
            r2 = 0
            r6 = 0
        L8d:
            int r7 = r1.size()
            if (r2 < r7) goto L107
            if (r4 == r6) goto L103
            if (r6 != 0) goto Lab
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r2 = r10.indexToKey
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.util.UUID r7 = r11.getDefaultKeyId()
            java.lang.Object r7 = r12.get(r7)
            javax.crypto.SecretKey r7 = (javax.crypto.SecretKey) r7
            r2.put(r4, r7)
            goto L102
        Lab:
            int r2 = r6 + (-1)
            java.lang.Object r4 = r1.get(r2)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry r4 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry) r4
            boolean r4 = r4.isEncrypted()
            if (r4 == 0) goto Lf8
            java.lang.Object r4 = r1.get(r2)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry r4 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry) r4
            java.util.UUID r4 = r4.getKid()
            java.lang.Object r4 = r12.get(r4)
            javax.crypto.SecretKey r4 = (javax.crypto.SecretKey) r4
            if (r4 == 0) goto Ld5
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r2 = r10.indexToKey
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r2.put(r7, r4)
            goto L102
        Ld5:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Key "
            r12.<init>(r0)
            java.lang.Object r0 = r1.get(r2)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry r0 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry) r0
            java.util.UUID r0 = r0.getKid()
            r12.append(r0)
            java.lang.String r0 = " was not supplied for decryption"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lf8:
            com.googlecode.mp4parser.util.RangeStartMap<java.lang.Integer, javax.crypto.SecretKey> r2 = r10.indexToKey
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r7 = 0
            r2.put(r4, r7)
        L102:
            r4 = r6
        L103:
            int r5 = r5 + 1
            goto L6b
        L107:
            java.lang.Object r7 = r1.get(r2)
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r7 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r7
            java.util.Map r8 = r11.getSampleGroups()
            java.lang.Object r7 = r8.get(r7)
            long[] r7 = (long[]) r7
            long r8 = (long) r5
            int r7 = java.util.Arrays.binarySearch(r7, r8)
            if (r7 < 0) goto L120
            int r6 = r2 + 1
        L120:
            int r2 = r2 + 1
            goto L8d
        L124:
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r4 instanceof com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry
            if (r4 == 0) goto L13d
            java.lang.Object r3 = r3.getKey()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry r3 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry) r3
            r1.add(r3)
            goto L61
        L13d:
            java.util.Map r4 = r10.getSampleGroups()
            java.lang.Object r5 = r3.getKey()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry r5 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry) r5
            java.lang.Object r3 = r3.getValue()
            long[] r3 = (long[]) r3
            r4.put(r5, r3)
            goto L61
    }

    public CencDecryptingTrackImpl(com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack r2, javax.crypto.SecretKey r3) {
            r1 = this;
            java.util.UUID r0 = r2.getDefaultKeyId()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r1.<init>(r2, r3)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.original
            r0.close()
            return
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.original
            java.lang.String r0 = r0.getHandler()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r6 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r6.original
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r0.getSampleDescriptionBox()
            java.lang.String r1 = "enc./sinf/frma"
            com.coremedia.iso.boxes.Box r0 = com.googlecode.mp4parser.util.Path.getPath(r0, r1)
            com.coremedia.iso.boxes.OriginalFormatBox r0 = (com.coremedia.iso.boxes.OriginalFormatBox) r0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            com.googlecode.mp4parser.authoring.Track r2 = r6.original     // Catch: java.io.IOException -> Lb5
            com.coremedia.iso.boxes.SampleDescriptionBox r2 = r2.getSampleDescriptionBox()     // Catch: java.io.IOException -> Lb5
            java.nio.channels.WritableByteChannel r3 = java.nio.channels.Channels.newChannel(r1)     // Catch: java.io.IOException -> Lb5
            r2.getBox(r3)     // Catch: java.io.IOException -> Lb5
            com.coremedia.iso.IsoFile r2 = new com.coremedia.iso.IsoFile     // Catch: java.io.IOException -> Lb5
            com.googlecode.mp4parser.MemoryDataSourceImpl r3 = new com.googlecode.mp4parser.MemoryDataSourceImpl     // Catch: java.io.IOException -> Lb5
            byte[] r1 = r1.toByteArray()     // Catch: java.io.IOException -> Lb5
            r3.<init>(r1)     // Catch: java.io.IOException -> Lb5
            r2.<init>(r3)     // Catch: java.io.IOException -> Lb5
            java.util.List r1 = r2.getBoxes()     // Catch: java.io.IOException -> Lb5
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.io.IOException -> Lb5
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = (com.coremedia.iso.boxes.SampleDescriptionBox) r1     // Catch: java.io.IOException -> Lb5
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r1.getSampleEntry()
            boolean r2 = r2 instanceof com.coremedia.iso.boxes.sampleentry.AudioSampleEntry
            if (r2 == 0) goto L4f
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r1.getSampleEntry()
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r2 = (com.coremedia.iso.boxes.sampleentry.AudioSampleEntry) r2
            java.lang.String r0 = r0.getDataFormat()
            r2.setType(r0)
            goto L64
        L4f:
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r1.getSampleEntry()
            boolean r2 = r2 instanceof com.coremedia.iso.boxes.sampleentry.VisualSampleEntry
            if (r2 == 0) goto L99
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r1.getSampleEntry()
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r2 = (com.coremedia.iso.boxes.sampleentry.VisualSampleEntry) r2
            java.lang.String r0 = r0.getDataFormat()
            r2.setType(r0)
        L64:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r1.getSampleEntry()
            java.util.List r2 = r2.getBoxes()
            java.util.Iterator r2 = r2.iterator()
        L75:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L83
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r2 = r1.getSampleEntry()
            r2.setBoxes(r0)
            return r1
        L83:
            java.lang.Object r3 = r2.next()
            com.coremedia.iso.boxes.Box r3 = (com.coremedia.iso.boxes.Box) r3
            java.lang.String r4 = r3.getType()
            java.lang.String r5 = "sinf"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L75
            r0.add(r3)
            goto L75
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "I don't know "
            r2.<init>(r3)
            com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry r1 = r1.getSampleEntry()
            java.lang.String r1 = r1.getType()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Lb5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Dumping stsd to memory failed"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.original
            long[] r0 = r0.getSampleDurations()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            com.googlecode.mp4parser.boxes.cenc.CencDecryptingSampleList r0 = r1.samples
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.original
            long[] r0 = r0.getSyncSamples()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.Track r0 = r1.original
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            return r0
    }
}
