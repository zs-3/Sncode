package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class TextTrackImpl extends com.googlecode.mp4parser.authoring.AbstractTrack {
    com.coremedia.iso.boxes.SampleDescriptionBox sampleDescriptionBox;
    java.util.List<com.googlecode.mp4parser.authoring.tracks.TextTrackImpl.Line> subs;
    com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;

    public static class Line {
        long from;
        java.lang.String text;
        long to;

        public Line(long r1, long r3, java.lang.String r5) {
                r0 = this;
                r0.<init>()
                r0.from = r1
                r0.to = r3
                r0.text = r5
                return
        }

        public long getFrom() {
                r2 = this;
                long r0 = r2.from
                return r0
        }

        public java.lang.String getText() {
                r1 = this;
                java.lang.String r0 = r1.text
                return r0
        }

        public long getTo() {
                r2 = this;
                long r0 = r2.to
                return r0
        }
    }

    public TextTrackImpl() {
            r5 = this;
            java.lang.String r0 = "subtiles"
            r5.<init>(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r0.<init>()
            r5.trackMetaData = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r5.subs = r0
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r0.<init>()
            r5.sampleDescriptionBox = r0
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry r0 = new com.coremedia.iso.boxes.sampleentry.TextSampleEntry
            java.lang.String r1 = "tx3g"
            r0.<init>(r1)
            r1 = 1
            r0.setDataReferenceIndex(r1)
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$StyleRecord r2 = new com.coremedia.iso.boxes.sampleentry.TextSampleEntry$StyleRecord
            r2.<init>()
            r0.setStyleRecord(r2)
            com.coremedia.iso.boxes.sampleentry.TextSampleEntry$BoxRecord r2 = new com.coremedia.iso.boxes.sampleentry.TextSampleEntry$BoxRecord
            r2.<init>()
            r0.setBoxRecord(r2)
            com.coremedia.iso.boxes.SampleDescriptionBox r2 = r5.sampleDescriptionBox
            r2.addBox(r0)
            com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox r2 = new com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox
            r2.<init>()
            com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$FontRecord r3 = new com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$FontRecord
            java.lang.String r4 = "Serif"
            r3.<init>(r1, r4)
            java.util.List r1 = java.util.Collections.singletonList(r3)
            r2.setEntries(r1)
            r0.addBox(r2)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r5.trackMetaData
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            r0.setCreationTime(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r5.trackMetaData
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            r0.setModificationTime(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r5.trackMetaData
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.setTimescale(r1)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "sbtl"
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.sampleDescriptionBox
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.googlecode.mp4parser.authoring.tracks.TextTrackImpl$Line> r1 = r9.subs
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r4 = r2
        Le:
            boolean r6 = r1.hasNext()
            if (r6 != 0) goto L36
            int r1 = r0.size()
            long[] r6 = new long[r1]
            r1 = 0
            java.util.Iterator r7 = r0.iterator()
        L1f:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L26
            return r6
        L26:
            java.lang.Object r0 = r7.next()
            java.lang.Long r0 = (java.lang.Long) r0
            int r2 = r1 + 1
            long r3 = r0.longValue()
            r6[r1] = r3
            r1 = r2
            goto L1f
        L36:
            java.lang.Object r6 = r1.next()
            com.googlecode.mp4parser.authoring.tracks.TextTrackImpl$Line r6 = (com.googlecode.mp4parser.authoring.tracks.TextTrackImpl.Line) r6
            long r7 = r6.from
            long r7 = r7 - r4
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto L4b
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r0.add(r4)
            goto L4d
        L4b:
            if (r4 < 0) goto L5c
        L4d:
            long r4 = r6.to
            long r7 = r6.from
            long r4 = r4 - r7
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.add(r4)
            long r4 = r6.to
            goto Le
        L5c:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Subtitle display times may not intersect"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r10 = this;
            java.lang.String r0 = "UTF-8"
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.List<com.googlecode.mp4parser.authoring.tracks.TextTrackImpl$Line> r2 = r10.subs
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r5 = r3
        L10:
            boolean r7 = r2.hasNext()
            if (r7 != 0) goto L17
            return r1
        L17:
            java.lang.Object r7 = r2.next()
            com.googlecode.mp4parser.authoring.tracks.TextTrackImpl$Line r7 = (com.googlecode.mp4parser.authoring.tracks.TextTrackImpl.Line) r7
            long r8 = r7.from
            long r8 = r8 - r5
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L34
            com.googlecode.mp4parser.authoring.SampleImpl r5 = new com.googlecode.mp4parser.authoring.SampleImpl
            r6 = 2
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            r5.<init>(r6)
            r1.add(r5)
            goto L36
        L34:
            if (r5 < 0) goto L71
        L36:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            java.io.DataOutputStream r6 = new java.io.DataOutputStream
            r6.<init>(r5)
            java.lang.String r8 = r7.text     // Catch: java.io.IOException -> L69
            byte[] r8 = r8.getBytes(r0)     // Catch: java.io.IOException -> L69
            int r8 = r8.length     // Catch: java.io.IOException -> L69
            r6.writeShort(r8)     // Catch: java.io.IOException -> L69
            java.lang.String r8 = r7.text     // Catch: java.io.IOException -> L69
            byte[] r8 = r8.getBytes(r0)     // Catch: java.io.IOException -> L69
            r6.write(r8)     // Catch: java.io.IOException -> L69
            r6.close()     // Catch: java.io.IOException -> L69
            com.googlecode.mp4parser.authoring.SampleImpl r6 = new com.googlecode.mp4parser.authoring.SampleImpl
            byte[] r5 = r5.toByteArray()
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r6.<init>(r5)
            r1.add(r6)
            long r5 = r7.to
            goto L10
        L69:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "VM is broken. Does not support UTF-8"
            r0.<init>(r1)
            throw r0
        L71:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Subtitle display times may not intersect"
            r0.<init>(r1)
            throw r0
    }

    public java.util.List<com.googlecode.mp4parser.authoring.tracks.TextTrackImpl.Line> getSubs() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.tracks.TextTrackImpl$Line> r0 = r1.subs
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
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
