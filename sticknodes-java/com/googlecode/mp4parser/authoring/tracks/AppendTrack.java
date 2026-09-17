package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class AppendTrack extends com.googlecode.mp4parser.authoring.AbstractTrack {
    private static com.googlecode.mp4parser.util.Logger LOG;
    com.coremedia.iso.boxes.SampleDescriptionBox stsd;
    com.googlecode.mp4parser.authoring.Track[] tracks;

    static {
            java.lang.Class<com.googlecode.mp4parser.authoring.tracks.AppendTrack> r0 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.class
            com.googlecode.mp4parser.util.Logger r0 = com.googlecode.mp4parser.util.Logger.getLogger(r0)
            com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG = r0
            return
    }

    public AppendTrack(com.googlecode.mp4parser.authoring.Track... r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = appendTracknames(r7)
            r6.<init>(r0)
            r6.tracks = r7
            int r0 = r7.length
            r1 = 0
            r2 = 0
        Lc:
            if (r2 < r0) goto Lf
            return
        Lf:
            r3 = r7[r2]
            com.coremedia.iso.boxes.SampleDescriptionBox r4 = r6.stsd
            if (r4 != 0) goto L30
            com.coremedia.iso.boxes.SampleDescriptionBox r4 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r4.<init>()
            r6.stsd = r4
            com.coremedia.iso.boxes.SampleDescriptionBox r3 = r3.getSampleDescriptionBox()
            java.lang.Class<com.coremedia.iso.boxes.sampleentry.SampleEntry> r5 = com.coremedia.iso.boxes.sampleentry.SampleEntry.class
            java.util.List r3 = r3.getBoxes(r5)
            java.lang.Object r3 = r3.get(r1)
            com.coremedia.iso.boxes.Box r3 = (com.coremedia.iso.boxes.Box) r3
            r4.addBox(r3)
            goto L3a
        L30:
            com.coremedia.iso.boxes.SampleDescriptionBox r3 = r3.getSampleDescriptionBox()
            com.coremedia.iso.boxes.SampleDescriptionBox r3 = r6.mergeStsds(r4, r3)
            r6.stsd = r3
        L3a:
            int r2 = r2 + 1
            goto Lc
    }

    public static java.lang.String appendTracknames(com.googlecode.mp4parser.authoring.Track... r6) {
            int r0 = r6.length
            r1 = 0
            java.lang.String r2 = ""
            r3 = 0
        L5:
            if (r3 < r0) goto L12
            int r6 = r2.length()
            int r6 = r6 + (-3)
            java.lang.String r6 = r2.substring(r1, r6)
            return r6
        L12:
            r4 = r6[r3]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.<init>(r2)
            java.lang.String r2 = r4.getName()
            r5.append(r2)
            java.lang.String r2 = " + "
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            int r3 = r3 + 1
            goto L5
    }

    private com.coremedia.iso.boxes.sampleentry.AudioSampleEntry mergeAudioSampleEntries(com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r8, com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r9) {
            r7 = this;
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r0 = new com.coremedia.iso.boxes.sampleentry.AudioSampleEntry
            java.lang.String r1 = r9.getType()
            r0.<init>(r1)
            long r1 = r8.getBytesPerFrame()
            long r3 = r9.getBytesPerFrame()
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L17d
            long r1 = r8.getBytesPerFrame()
            r0.setBytesPerFrame(r1)
            long r1 = r8.getBytesPerPacket()
            long r3 = r9.getBytesPerPacket()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L17c
            long r1 = r8.getBytesPerPacket()
            r0.setBytesPerPacket(r1)
            long r1 = r8.getBytesPerSample()
            long r3 = r9.getBytesPerSample()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L175
            long r1 = r8.getBytesPerSample()
            r0.setBytesPerSample(r1)
            int r1 = r8.getChannelCount()
            int r2 = r9.getChannelCount()
            if (r1 != r2) goto L174
            int r1 = r8.getChannelCount()
            r0.setChannelCount(r1)
            int r1 = r8.getPacketSize()
            int r2 = r9.getPacketSize()
            if (r1 != r2) goto L16d
            int r1 = r8.getPacketSize()
            r0.setPacketSize(r1)
            int r1 = r8.getCompressionId()
            int r2 = r9.getCompressionId()
            if (r1 != r2) goto L16c
            int r1 = r8.getCompressionId()
            r0.setCompressionId(r1)
            long r1 = r8.getSampleRate()
            long r3 = r9.getSampleRate()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L16c
            long r1 = r8.getSampleRate()
            r0.setSampleRate(r1)
            int r1 = r8.getSampleSize()
            int r2 = r9.getSampleSize()
            if (r1 != r2) goto L16c
            int r1 = r8.getSampleSize()
            r0.setSampleSize(r1)
            long r1 = r8.getSamplesPerPacket()
            long r3 = r9.getSamplesPerPacket()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L16c
            long r1 = r8.getSamplesPerPacket()
            r0.setSamplesPerPacket(r1)
            int r1 = r8.getSoundVersion()
            int r2 = r9.getSoundVersion()
            if (r1 != r2) goto L16c
            int r1 = r8.getSoundVersion()
            r0.setSoundVersion(r1)
            byte[] r1 = r8.getSoundVersion2Data()
            byte[] r2 = r9.getSoundVersion2Data()
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L16c
            byte[] r1 = r8.getSoundVersion2Data()
            r0.setSoundVersion2Data(r1)
            java.util.List r1 = r8.getBoxes()
            int r1 = r1.size()
            java.util.List r2 = r9.getBoxes()
            int r2 = r2.size()
            if (r1 != r2) goto L16b
            java.util.List r8 = r8.getBoxes()
            java.util.Iterator r8 = r8.iterator()
            java.util.List r9 = r9.getBoxes()
            java.util.Iterator r9 = r9.iterator()
        Lf5:
            boolean r1 = r8.hasNext()
            if (r1 != 0) goto Lfc
            goto L16b
        Lfc:
            java.lang.Object r1 = r8.next()
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
            java.lang.Object r2 = r9.next()
            com.coremedia.iso.boxes.Box r2 = (com.coremedia.iso.boxes.Box) r2
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            java.nio.channels.WritableByteChannel r6 = java.nio.channels.Channels.newChannel(r3)     // Catch: java.io.IOException -> L160
            r1.getBox(r6)     // Catch: java.io.IOException -> L160
            java.nio.channels.WritableByteChannel r6 = java.nio.channels.Channels.newChannel(r4)     // Catch: java.io.IOException -> L160
            r2.getBox(r6)     // Catch: java.io.IOException -> L160
            byte[] r3 = r3.toByteArray()
            byte[] r4 = r4.toByteArray()
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L132
            r0.addBox(r1)
            goto Lf5
        L132:
            java.lang.String r3 = r1.getType()
            java.lang.String r4 = "esds"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Lf5
            java.lang.String r3 = r2.getType()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Lf5
            r3 = r1
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox r3 = (com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox) r3
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox r2 = (com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox) r2
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r4 = r3.getEsDescriptor()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r2 = r2.getEsDescriptor()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r2 = r7.mergeDescriptors(r4, r2)
            r3.setDescriptor(r2)
            r0.addBox(r1)
            goto Lf5
        L160:
            r8 = move-exception
            com.googlecode.mp4parser.util.Logger r9 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r8 = r8.getMessage()
            r9.logWarn(r8)
            return r5
        L16b:
            return r0
        L16c:
            return r5
        L16d:
            com.googlecode.mp4parser.util.Logger r8 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r9 = "ChannelCount differ"
            r8.logError(r9)
        L174:
            return r5
        L175:
            com.googlecode.mp4parser.util.Logger r8 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r9 = "BytesPerSample differ"
            r8.logError(r9)
        L17c:
            return r5
        L17d:
            com.googlecode.mp4parser.util.Logger r8 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r9 = "BytesPerFrame differ"
            r8.logError(r9)
            return r5
    }

    private com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor mergeDescriptors(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r9, com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r10) {
            r8 = this;
            boolean r0 = r9 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor
            r1 = 0
            if (r0 == 0) goto L17a
            boolean r0 = r10 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor
            if (r0 == 0) goto L17a
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r9 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor) r9
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r10 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor) r10
            int r0 = r9.getURLFlag()
            int r2 = r10.getURLFlag()
            if (r0 == r2) goto L18
            return r1
        L18:
            r9.getURLLength()
            r10.getURLLength()
            int r0 = r9.getDependsOnEsId()
            int r2 = r10.getDependsOnEsId()
            if (r0 == r2) goto L29
            return r1
        L29:
            int r0 = r9.getEsId()
            int r2 = r10.getEsId()
            if (r0 == r2) goto L34
            return r1
        L34:
            int r0 = r9.getoCREsId()
            int r2 = r10.getoCREsId()
            if (r0 == r2) goto L3f
            return r1
        L3f:
            int r0 = r9.getoCRstreamFlag()
            int r2 = r10.getoCRstreamFlag()
            if (r0 == r2) goto L4a
            return r1
        L4a:
            int r0 = r9.getRemoteODFlag()
            int r2 = r10.getRemoteODFlag()
            if (r0 == r2) goto L55
            return r1
        L55:
            int r0 = r9.getStreamDependenceFlag()
            int r2 = r10.getStreamDependenceFlag()
            if (r0 == r2) goto L60
            return r1
        L60:
            r9.getStreamPriority()
            r10.getStreamPriority()
            java.lang.String r0 = r9.getURLString()
            if (r0 == 0) goto L78
            java.lang.String r0 = r9.getURLString()
            java.lang.String r2 = r10.getURLString()
            r0.equals(r2)
            goto L7b
        L78:
            r10.getURLString()
        L7b:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r0 = r9.getDecoderConfigDescriptor()
            if (r0 == 0) goto L90
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r0 = r9.getDecoderConfigDescriptor()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r2 = r10.getDecoderConfigDescriptor()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L141
            goto L96
        L90:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r0 = r10.getDecoderConfigDescriptor()
            if (r0 == 0) goto L141
        L96:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r0 = r9.getDecoderConfigDescriptor()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r2 = r10.getDecoderConfigDescriptor()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r3 = r0.getAudioSpecificInfo()
            if (r3 == 0) goto Lb9
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r3 = r2.getAudioSpecificInfo()
            if (r3 == 0) goto Lb9
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r3 = r0.getAudioSpecificInfo()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r4 = r2.getAudioSpecificInfo()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lb9
            return r1
        Lb9:
            long r3 = r0.getAvgBitRate()
            long r5 = r2.getAvgBitRate()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto Ld4
            long r3 = r0.getAvgBitRate()
            long r5 = r2.getAvgBitRate()
            long r3 = r3 + r5
            r5 = 2
            long r3 = r3 / r5
            r0.setAvgBitRate(r3)
        Ld4:
            r0.getBufferSizeDB()
            r2.getBufferSizeDB()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r3 = r0.getDecoderSpecificInfo()
            if (r3 == 0) goto Lef
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r3 = r0.getDecoderSpecificInfo()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r4 = r2.getDecoderSpecificInfo()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lf6
            goto Lf5
        Lef:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r3 = r2.getDecoderSpecificInfo()
            if (r3 == 0) goto Lf6
        Lf5:
            return r1
        Lf6:
            long r3 = r0.getMaxBitRate()
            long r5 = r2.getMaxBitRate()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L111
            long r3 = r0.getMaxBitRate()
            long r5 = r2.getMaxBitRate()
            long r3 = java.lang.Math.max(r3, r5)
            r0.setMaxBitRate(r3)
        L111:
            java.util.List r3 = r0.getProfileLevelIndicationDescriptors()
            java.util.List r4 = r2.getProfileLevelIndicationDescriptors()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L120
            return r1
        L120:
            int r3 = r0.getObjectTypeIndication()
            int r4 = r2.getObjectTypeIndication()
            if (r3 == r4) goto L12b
            return r1
        L12b:
            int r3 = r0.getStreamType()
            int r4 = r2.getStreamType()
            if (r3 == r4) goto L136
            return r1
        L136:
            int r0 = r0.getUpStream()
            int r2 = r2.getUpStream()
            if (r0 == r2) goto L141
            return r1
        L141:
            java.util.List r0 = r9.getOtherDescriptors()
            if (r0 == 0) goto L156
            java.util.List r0 = r9.getOtherDescriptors()
            java.util.List r2 = r10.getOtherDescriptors()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L15d
            goto L15c
        L156:
            java.util.List r0 = r10.getOtherDescriptors()
            if (r0 == 0) goto L15d
        L15c:
            return r1
        L15d:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r0 = r9.getSlConfigDescriptor()
            if (r0 == 0) goto L172
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r0 = r9.getSlConfigDescriptor()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r10 = r10.getSlConfigDescriptor()
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto L179
            goto L178
        L172:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r10 = r10.getSlConfigDescriptor()
            if (r10 == 0) goto L179
        L178:
            return r1
        L179:
            return r9
        L17a:
            com.googlecode.mp4parser.util.Logger r9 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r10 = "I can only merge ESDescriptors"
            r9.logError(r10)
            return r1
    }

    private com.coremedia.iso.boxes.sampleentry.SampleEntry mergeSampleEntry(com.coremedia.iso.boxes.sampleentry.SampleEntry r3, com.coremedia.iso.boxes.sampleentry.SampleEntry r4) {
            r2 = this;
            java.lang.String r0 = r3.getType()
            java.lang.String r1 = r4.getType()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            boolean r0 = r3 instanceof com.coremedia.iso.boxes.sampleentry.VisualSampleEntry
            if (r0 == 0) goto L21
            boolean r0 = r4 instanceof com.coremedia.iso.boxes.sampleentry.VisualSampleEntry
            if (r0 == 0) goto L21
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r3 = (com.coremedia.iso.boxes.sampleentry.VisualSampleEntry) r3
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r4 = (com.coremedia.iso.boxes.sampleentry.VisualSampleEntry) r4
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r3 = r2.mergeVisualSampleEntry(r3, r4)
            return r3
        L21:
            boolean r0 = r3 instanceof com.coremedia.iso.boxes.sampleentry.AudioSampleEntry
            if (r0 == 0) goto L32
            boolean r0 = r4 instanceof com.coremedia.iso.boxes.sampleentry.AudioSampleEntry
            if (r0 == 0) goto L32
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r3 = (com.coremedia.iso.boxes.sampleentry.AudioSampleEntry) r3
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r4 = (com.coremedia.iso.boxes.sampleentry.AudioSampleEntry) r4
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r3 = r2.mergeAudioSampleEntries(r3, r4)
            return r3
        L32:
            return r1
    }

    private com.coremedia.iso.boxes.SampleDescriptionBox mergeStsds(com.coremedia.iso.boxes.SampleDescriptionBox r6, com.coremedia.iso.boxes.SampleDescriptionBox r7) throws java.io.IOException {
            r5 = this;
            java.lang.Class<com.coremedia.iso.boxes.sampleentry.SampleEntry> r0 = com.coremedia.iso.boxes.sampleentry.SampleEntry.class
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            java.nio.channels.WritableByteChannel r3 = java.nio.channels.Channels.newChannel(r1)     // Catch: java.io.IOException -> L78
            r6.getBox(r3)     // Catch: java.io.IOException -> L78
            java.nio.channels.WritableByteChannel r3 = java.nio.channels.Channels.newChannel(r2)     // Catch: java.io.IOException -> L78
            r7.getBox(r3)     // Catch: java.io.IOException -> L78
            byte[] r1 = r1.toByteArray()
            byte[] r2 = r2.toByteArray()
            boolean r1 = java.util.Arrays.equals(r2, r1)
            if (r1 != 0) goto L77
            java.util.List r1 = r6.getBoxes(r0)
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.coremedia.iso.boxes.sampleentry.SampleEntry r1 = (com.coremedia.iso.boxes.sampleentry.SampleEntry) r1
            java.util.List r3 = r7.getBoxes(r0)
            java.lang.Object r3 = r3.get(r2)
            com.coremedia.iso.boxes.sampleentry.SampleEntry r3 = (com.coremedia.iso.boxes.sampleentry.SampleEntry) r3
            com.coremedia.iso.boxes.sampleentry.SampleEntry r1 = r5.mergeSampleEntry(r1, r3)
            if (r1 == 0) goto L4b
            java.util.List r7 = java.util.Collections.singletonList(r1)
            r6.setBoxes(r7)
            goto L77
        L4b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot merge "
            r3.<init>(r4)
            java.util.List r6 = r6.getBoxes(r0)
            java.lang.Object r6 = r6.get(r2)
            r3.append(r6)
            java.lang.String r6 = " and "
            r3.append(r6)
            java.util.List r6 = r7.getBoxes(r0)
            java.lang.Object r6 = r6.get(r2)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r1.<init>(r6)
            throw r1
        L77:
            return r6
        L78:
            r6 = move-exception
            com.googlecode.mp4parser.util.Logger r7 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r6 = r6.getMessage()
            r7.logError(r6)
            r6 = 0
            return r6
    }

    private com.coremedia.iso.boxes.sampleentry.VisualSampleEntry mergeVisualSampleEntry(com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r8, com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r9) {
            r7 = this;
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r0 = new com.coremedia.iso.boxes.sampleentry.VisualSampleEntry
            r0.<init>()
            double r1 = r8.getHorizresolution()
            double r3 = r9.getHorizresolution()
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L145
            double r1 = r8.getHorizresolution()
            r0.setHorizresolution(r1)
            java.lang.String r1 = r8.getCompressorname()
            r0.setCompressorname(r1)
            int r1 = r8.getDepth()
            int r2 = r9.getDepth()
            if (r1 != r2) goto L13d
            int r1 = r8.getDepth()
            r0.setDepth(r1)
            int r1 = r8.getFrameCount()
            int r2 = r9.getFrameCount()
            if (r1 != r2) goto L135
            int r1 = r8.getFrameCount()
            r0.setFrameCount(r1)
            int r1 = r8.getHeight()
            int r2 = r9.getHeight()
            if (r1 != r2) goto L12d
            int r1 = r8.getHeight()
            r0.setHeight(r1)
            int r1 = r8.getWidth()
            int r2 = r9.getWidth()
            if (r1 != r2) goto L125
            int r1 = r8.getWidth()
            r0.setWidth(r1)
            double r1 = r8.getVertresolution()
            double r3 = r9.getVertresolution()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L11d
            double r1 = r8.getVertresolution()
            r0.setVertresolution(r1)
            double r1 = r8.getHorizresolution()
            double r3 = r9.getHorizresolution()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L115
            double r1 = r8.getHorizresolution()
            r0.setHorizresolution(r1)
            java.util.List r1 = r8.getBoxes()
            int r1 = r1.size()
            java.util.List r2 = r9.getBoxes()
            int r2 = r2.size()
            if (r1 != r2) goto L114
            java.util.List r8 = r8.getBoxes()
            java.util.Iterator r8 = r8.iterator()
            java.util.List r9 = r9.getBoxes()
            java.util.Iterator r9 = r9.iterator()
        Lac:
            boolean r1 = r8.hasNext()
            if (r1 != 0) goto Lb3
            goto L114
        Lb3:
            java.lang.Object r1 = r8.next()
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
            java.lang.Object r2 = r9.next()
            com.coremedia.iso.boxes.Box r2 = (com.coremedia.iso.boxes.Box) r2
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            java.nio.channels.WritableByteChannel r6 = java.nio.channels.Channels.newChannel(r3)     // Catch: java.io.IOException -> L109
            r1.getBox(r6)     // Catch: java.io.IOException -> L109
            java.nio.channels.WritableByteChannel r6 = java.nio.channels.Channels.newChannel(r4)     // Catch: java.io.IOException -> L109
            r2.getBox(r6)     // Catch: java.io.IOException -> L109
            byte[] r3 = r3.toByteArray()
            byte[] r4 = r4.toByteArray()
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto Le9
            r0.addBox(r1)
            goto Lac
        Le9:
            boolean r3 = r1 instanceof com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox
            if (r3 == 0) goto Lac
            boolean r3 = r2 instanceof com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox
            if (r3 == 0) goto Lac
            r3 = r1
            com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox r3 = (com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox) r3
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r4 = r3.getDescriptor()
            com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox r2 = (com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox) r2
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r2 = r2.getDescriptor()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r2 = r7.mergeDescriptors(r4, r2)
            r3.setDescriptor(r2)
            r0.addBox(r1)
            goto Lac
        L109:
            r8 = move-exception
            com.googlecode.mp4parser.util.Logger r9 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r8 = r8.getMessage()
            r9.logWarn(r8)
            return r5
        L114:
            return r0
        L115:
            com.googlecode.mp4parser.util.Logger r8 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r9 = "horizontal resolution differs"
            r8.logError(r9)
            return r5
        L11d:
            com.googlecode.mp4parser.util.Logger r8 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r9 = "vert resolution differs"
            r8.logError(r9)
            return r5
        L125:
            com.googlecode.mp4parser.util.Logger r8 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r9 = "width differs"
            r8.logError(r9)
            return r5
        L12d:
            com.googlecode.mp4parser.util.Logger r8 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r9 = "height differs"
            r8.logError(r9)
            return r5
        L135:
            com.googlecode.mp4parser.util.Logger r8 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r9 = "frame count differs"
            r8.logError(r9)
            return r5
        L13d:
            com.googlecode.mp4parser.util.Logger r8 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r9 = "Depth differs"
            r8.logError(r9)
            return r5
        L145:
            com.googlecode.mp4parser.util.Logger r8 = com.googlecode.mp4parser.authoring.tracks.AppendTrack.LOG
            java.lang.String r9 = "Horizontal Resolution differs"
            r8.logError(r9)
            return r5
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r4 = this;
            com.googlecode.mp4parser.authoring.Track[] r0 = r4.tracks
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 < r1) goto L7
            return
        L7:
            r3 = r0[r2]
            r3.close()
            int r2 = r2 + 1
            goto L4
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r9 = this;
            com.googlecode.mp4parser.authoring.Track[] r0 = r9.tracks
            r1 = 0
            r0 = r0[r1]
            java.util.List r0 = r0.getCompositionTimeEntries()
            if (r0 == 0) goto L80
            com.googlecode.mp4parser.authoring.Track[] r0 = r9.tracks
            r0 = r0[r1]
            java.util.List r0 = r0.getCompositionTimeEntries()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L80
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.googlecode.mp4parser.authoring.Track[] r2 = r9.tracks
            int r3 = r2.length
            r4 = 0
        L22:
            if (r4 < r3) goto L70
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.Iterator r6 = r0.iterator()
        L2d:
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L34
            return r5
        L34:
            java.lang.Object r0 = r6.next()
            r7 = r0
            int[] r7 = (int[]) r7
            int r8 = r7.length
            r0 = 0
        L3d:
            if (r0 < r8) goto L40
            goto L2d
        L40:
            r2 = r7[r0]
            boolean r3 = r5.isEmpty()
            r4 = 1
            if (r3 != 0) goto L65
            java.lang.Object r3 = r5.getLast()
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r3 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r3
            int r3 = r3.getOffset()
            if (r3 == r2) goto L56
            goto L65
        L56:
            java.lang.Object r2 = r5.getLast()
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r2 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry) r2
            int r3 = r2.getCount()
            int r3 = r3 + r4
            r2.setCount(r3)
            goto L6d
        L65:
            com.coremedia.iso.boxes.CompositionTimeToSample$Entry r3 = new com.coremedia.iso.boxes.CompositionTimeToSample$Entry
            r3.<init>(r4, r2)
            r5.add(r3)
        L6d:
            int r0 = r0 + 1
            goto L3d
        L70:
            r5 = r2[r4]
            java.util.List r5 = r5.getCompositionTimeEntries()
            int[] r5 = com.coremedia.iso.boxes.CompositionTimeToSample.blowupCompositionTimes(r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L22
        L80:
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r2 = this;
            com.googlecode.mp4parser.authoring.Track[] r0 = r2.tracks
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.getHandler()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r5 = this;
            com.googlecode.mp4parser.authoring.Track[] r0 = r5.tracks
            r1 = 0
            r0 = r0[r1]
            java.util.List r0 = r0.getSampleDependencies()
            if (r0 == 0) goto L30
            com.googlecode.mp4parser.authoring.Track[] r0 = r5.tracks
            r0 = r0[r1]
            java.util.List r0 = r0.getSampleDependencies()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L30
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.googlecode.mp4parser.authoring.Track[] r2 = r5.tracks
            int r3 = r2.length
        L21:
            if (r1 < r3) goto L24
            return r0
        L24:
            r4 = r2[r1]
            java.util.List r4 = r4.getSampleDependencies()
            r0.addAll(r4)
            int r1 = r1 + 1
            goto L21
        L30:
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.stsd
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public synchronized long[] getSampleDurations() {
            r12 = this;
            monitor-enter(r12)
            com.googlecode.mp4parser.authoring.Track[] r0 = r12.tracks     // Catch: java.lang.Throwable -> L36
            int r1 = r0.length     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            if (r3 < r1) goto L2b
            long[] r0 = new long[r4]     // Catch: java.lang.Throwable -> L36
            com.googlecode.mp4parser.authoring.Track[] r1 = r12.tracks     // Catch: java.lang.Throwable -> L36
            int r3 = r1.length     // Catch: java.lang.Throwable -> L36
            r4 = 0
            r5 = 0
        L10:
            if (r4 < r3) goto L14
            monitor-exit(r12)
            return r0
        L14:
            r6 = r1[r4]     // Catch: java.lang.Throwable -> L36
            long[] r6 = r6.getSampleDurations()     // Catch: java.lang.Throwable -> L36
            int r7 = r6.length     // Catch: java.lang.Throwable -> L36
            r8 = 0
        L1c:
            if (r8 < r7) goto L21
            int r4 = r4 + 1
            goto L10
        L21:
            r9 = r6[r8]     // Catch: java.lang.Throwable -> L36
            int r11 = r5 + 1
            r0[r5] = r9     // Catch: java.lang.Throwable -> L36
            int r8 = r8 + 1
            r5 = r11
            goto L1c
        L2b:
            r5 = r0[r3]     // Catch: java.lang.Throwable -> L36
            long[] r5 = r5.getSampleDurations()     // Catch: java.lang.Throwable -> L36
            int r5 = r5.length     // Catch: java.lang.Throwable -> L36
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L7
        L36:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.googlecode.mp4parser.authoring.Track[] r1 = r5.tracks
            int r2 = r1.length
            r3 = 0
        L9:
            if (r3 < r2) goto Lc
            return r0
        Lc:
            r4 = r1[r3]
            java.util.List r4 = r4.getSamples()
            r0.addAll(r4)
            int r3 = r3 + 1
            goto L9
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r2 = this;
            com.googlecode.mp4parser.authoring.Track[] r0 = r2.tracks
            r1 = 0
            r0 = r0[r1]
            com.coremedia.iso.boxes.SubSampleInformationBox r0 = r0.getSubsampleInformationBox()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r15 = this;
            com.googlecode.mp4parser.authoring.Track[] r0 = r15.tracks
            r1 = 0
            r0 = r0[r1]
            long[] r0 = r0.getSyncSamples()
            if (r0 == 0) goto L65
            com.googlecode.mp4parser.authoring.Track[] r0 = r15.tracks
            r0 = r0[r1]
            long[] r0 = r0.getSyncSamples()
            int r0 = r0.length
            if (r0 <= 0) goto L65
            com.googlecode.mp4parser.authoring.Track[] r0 = r15.tracks
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L1b:
            if (r3 < r2) goto L52
            long[] r5 = new long[r4]
            r2 = 0
            com.googlecode.mp4parser.authoring.Track[] r6 = r15.tracks
            int r7 = r6.length
            r0 = 0
            r4 = 0
        L26:
            if (r0 < r7) goto L29
            return r5
        L29:
            r8 = r6[r0]
            long[] r9 = r8.getSyncSamples()
            if (r9 == 0) goto L45
            long[] r9 = r8.getSyncSamples()
            int r10 = r9.length
            r11 = 0
        L37:
            if (r11 < r10) goto L3a
            goto L45
        L3a:
            r12 = r9[r11]
            int r14 = r4 + 1
            long r12 = r12 + r2
            r5[r4] = r12
            int r11 = r11 + 1
            r4 = r14
            goto L37
        L45:
            java.util.List r8 = r8.getSamples()
            int r8 = r8.size()
            long r8 = (long) r8
            long r2 = r2 + r8
            int r0 = r0 + 1
            goto L26
        L52:
            r5 = r0[r3]
            long[] r6 = r5.getSyncSamples()
            if (r6 == 0) goto L60
            long[] r5 = r5.getSyncSamples()
            int r5 = r5.length
            goto L61
        L60:
            r5 = 0
        L61:
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L1b
        L65:
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r2 = this;
            com.googlecode.mp4parser.authoring.Track[] r0 = r2.tracks
            r1 = 0
            r0 = r0[r1]
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            return r0
    }
}
