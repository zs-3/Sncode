package com.googlecode.mp4parser.authoring.tracks.mjpeg;

/* loaded from: classes2.dex */
public class OneJpegPerIframe extends com.googlecode.mp4parser.authoring.AbstractTrack {
    java.io.File[] jpegs;
    long[] sampleDurations;
    com.coremedia.iso.boxes.SampleDescriptionBox stsd;
    long[] syncSamples;
    com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;


    public OneJpegPerIframe(java.lang.String r22, java.io.File[] r23, com.googlecode.mp4parser.authoring.Track r24) throws java.io.IOException {
            r21 = this;
            r0 = r21
            r1 = r23
            r21.<init>(r22)
            com.googlecode.mp4parser.authoring.TrackMetaData r2 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r2.<init>()
            r0.trackMetaData = r2
            r0.jpegs = r1
            long[] r2 = r24.getSyncSamples()
            int r2 = r2.length
            int r3 = r1.length
            if (r2 != r3) goto L1e6
            r2 = 0
            r3 = r1[r2]
            java.awt.image.BufferedImage r3 = javax.imageio.ImageIO.read(r3)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            int r5 = r3.getWidth()
            double r5 = (double) r5
            r4.setWidth(r5)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r0.trackMetaData
            int r3 = r3.getHeight()
            double r5 = (double) r3
            r4.setHeight(r5)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r0.trackMetaData
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r24.getTrackMetaData()
            long r4 = r4.getTimescale()
            r3.setTimescale(r4)
            long[] r3 = r24.getSampleDurations()
            long[] r4 = r24.getSyncSamples()
            int r5 = r4.length
            long[] r5 = new long[r5]
            r0.sampleDurations = r5
            r5 = 0
            r7 = 1
            r10 = r5
            r8 = 1
            r9 = 1
        L53:
            int r12 = r3.length
            if (r8 < r12) goto L1cc
            long[] r3 = r0.sampleDurations
            int r4 = r3.length
            int r4 = r4 - r7
            r3[r4] = r10
            com.coremedia.iso.boxes.SampleDescriptionBox r3 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r3.<init>()
            r0.stsd = r3
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r3 = new com.coremedia.iso.boxes.sampleentry.VisualSampleEntry
            java.lang.String r4 = "mp4v"
            r3.<init>(r4)
            com.coremedia.iso.boxes.SampleDescriptionBox r4 = r0.stsd
            r4.addBox(r3)
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox r4 = new com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox
            r4.<init>()
            java.lang.String r8 = "038080801B000100048080800D6C11000000000A1CB4000A1CB4068080800102"
            byte[] r9 = com.coremedia.iso.Hex.decodeHex(r8)
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r4.setData(r9)
            r9 = -1
            byte[] r8 = com.coremedia.iso.Hex.decodeHex(r8)
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r8 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.createFrom(r9, r8)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r8 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor) r8
            r4.setEsDescriptor(r8)
            r3.addBox(r4)
            int r1 = r1.length
            long[] r1 = new long[r1]
            r0.syncSamples = r1
            r1 = 0
        L9c:
            long[] r3 = r0.syncSamples
            int r4 = r3.length
            if (r1 < r4) goto L1c4
            java.util.List r1 = r24.getEdits()
            java.util.Iterator r4 = r1.iterator()
            r8 = 0
            r10 = r8
            r1 = 1
        Lad:
            boolean r3 = r4.hasNext()
            if (r3 != 0) goto L177
            java.util.List r1 = r24.getCompositionTimeEntries()
            if (r1 == 0) goto Lf6
            java.util.List r1 = r24.getCompositionTimeEntries()
            int r1 = r1.size()
            if (r1 <= 0) goto Lf6
            java.util.List r1 = r24.getCompositionTimeEntries()
            int[] r1 = com.coremedia.iso.boxes.CompositionTimeToSample.blowupCompositionTimes(r1)
            r3 = 0
        Lcc:
            int r4 = r1.length
            if (r3 >= r4) goto Le5
            r4 = 50
            if (r3 < r4) goto Ld4
            goto Le5
        Ld4:
            r4 = r1[r3]
            long r12 = (long) r4
            long r12 = r12 + r5
            int r4 = (int) r12
            r1[r3] = r4
            long[] r4 = r24.getSampleDurations()
            r12 = r4[r3]
            long r5 = r5 + r12
            int r3 = r3 + 1
            goto Lcc
        Le5:
            java.util.Arrays.sort(r1)
            r1 = r1[r2]
            double r1 = (double) r1
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r24.getTrackMetaData()
            long r3 = r3.getTimescale()
            double r3 = (double) r3
            double r1 = r1 / r3
            double r10 = r10 + r1
        Lf6:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L12f
            java.util.List r1 = r21.getEdits()
            com.googlecode.mp4parser.authoring.Edit r2 = new com.googlecode.mp4parser.authoring.Edit
            double r3 = -r10
            com.googlecode.mp4parser.authoring.TrackMetaData r5 = r21.getTrackMetaData()
            long r5 = r5.getTimescale()
            double r5 = (double) r5
            double r3 = r3 * r5
            long r13 = (long) r3
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r21.getTrackMetaData()
            long r15 = r3.getTimescale()
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r3 = r21.getDuration()
            double r3 = (double) r3
            com.googlecode.mp4parser.authoring.TrackMetaData r5 = r21.getTrackMetaData()
            long r5 = r5.getTimescale()
            double r5 = (double) r5
            double r19 = r3 / r5
            r12 = r2
            r12.<init>(r13, r15, r17, r19)
            r1.add(r2)
            goto L176
        L12f:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 <= 0) goto L176
            java.util.List r1 = r21.getEdits()
            com.googlecode.mp4parser.authoring.Edit r2 = new com.googlecode.mp4parser.authoring.Edit
            r13 = -1
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r21.getTrackMetaData()
            long r15 = r3.getTimescale()
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12 = r2
            r19 = r10
            r12.<init>(r13, r15, r17, r19)
            r1.add(r2)
            java.util.List r1 = r21.getEdits()
            com.googlecode.mp4parser.authoring.Edit r11 = new com.googlecode.mp4parser.authoring.Edit
            r3 = 0
            com.googlecode.mp4parser.authoring.TrackMetaData r2 = r21.getTrackMetaData()
            long r5 = r2.getTimescale()
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r9 = r21.getDuration()
            double r9 = (double) r9
            com.googlecode.mp4parser.authoring.TrackMetaData r2 = r21.getTrackMetaData()
            long r12 = r2.getTimescale()
            double r12 = (double) r12
            double r9 = r9 / r12
            r2 = r11
            r2.<init>(r3, r5, r7, r9)
            r1.add(r11)
        L176:
            return
        L177:
            java.lang.Object r3 = r4.next()
            com.googlecode.mp4parser.authoring.Edit r3 = (com.googlecode.mp4parser.authoring.Edit) r3
            long r12 = r3.getMediaTime()
            r14 = -1
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L192
            if (r7 == 0) goto L18a
            goto L192
        L18a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot accept edit list for processing (1)"
            r1.<init>(r2)
            throw r1
        L192:
            long r12 = r3.getMediaTime()
            int r16 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r16 < 0) goto L1a5
            if (r1 == 0) goto L19d
            goto L1a5
        L19d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot accept edit list for processing (2)"
            r1.<init>(r2)
            throw r1
        L1a5:
            long r12 = r3.getMediaTime()
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L1b4
            double r12 = r3.getSegmentDuration()
            double r10 = r10 + r12
            goto Lad
        L1b4:
            long r12 = r3.getMediaTime()
            double r12 = (double) r12
            long r14 = r3.getTimeScale()
            double r14 = (double) r14
            double r12 = r12 / r14
            double r10 = r10 - r12
            r1 = 0
            r7 = 0
            goto Lad
        L1c4:
            int r4 = r1 + 1
            long r8 = (long) r4
            r3[r1] = r8
            r1 = r4
            goto L9c
        L1cc:
            int r12 = r4.length
            if (r9 >= r12) goto L1df
            long r12 = (long) r8
            r14 = r4[r9]
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L1df
            long[] r12 = r0.sampleDurations
            int r13 = r9 + (-1)
            r12[r13] = r10
            int r9 = r9 + 1
            r10 = r5
        L1df:
            r12 = r3[r8]
            long r10 = r10 + r12
            int r8 = r8 + 1
            goto L53
        L1e6:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Number of sync samples doesn't match the number of stills ("
            r3.<init>(r4)
            long[] r4 = r24.getSyncSamples()
            int r4 = r4.length
            r3.append(r4)
            java.lang.String r4 = " vs. "
            r3.append(r4)
            int r1 = r1.length
            r3.append(r1)
            java.lang.String r1 = ")"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "vide"
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.stsd
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
            r1 = this;
            long[] r0 = r1.sampleDurations
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            com.googlecode.mp4parser.authoring.tracks.mjpeg.OneJpegPerIframe$1 r0 = new com.googlecode.mp4parser.authoring.tracks.mjpeg.OneJpegPerIframe$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
            long[] r0 = r1.syncSamples
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r1.trackMetaData
            return r0
    }
}
