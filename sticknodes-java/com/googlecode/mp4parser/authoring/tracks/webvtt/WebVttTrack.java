package com.googlecode.mp4parser.authoring.tracks.webvtt;

/* loaded from: classes2.dex */
public class WebVttTrack extends com.googlecode.mp4parser.authoring.AbstractTrack {
    private static final com.googlecode.mp4parser.authoring.Sample EMPTY_SAMPLE = null;
    private static final java.util.regex.Pattern WEBVTT_CUE_IDENTIFIER = null;
    private static final java.lang.String WEBVTT_CUE_IDENTIFIER_STRING = "^(?!.*(-->)).*$";
    private static final java.util.regex.Pattern WEBVTT_CUE_SETTING = null;
    private static final java.lang.String WEBVTT_CUE_SETTING_STRING = "\\S*:\\S*";
    private static final java.util.regex.Pattern WEBVTT_FILE_HEADER = null;
    private static final java.lang.String WEBVTT_FILE_HEADER_STRING = "^\ufeff?WEBVTT((\\u0020|\t).*)?$";
    private static final java.util.regex.Pattern WEBVTT_METADATA_HEADER = null;
    private static final java.lang.String WEBVTT_METADATA_HEADER_STRING = "\\S*[:=]\\S*";
    private static final java.util.regex.Pattern WEBVTT_TIMESTAMP = null;
    private static final java.lang.String WEBVTT_TIMESTAMP_STRING = "(\\d+:)?[0-5]\\d:[0-5]\\d\\.\\d{3}";
    long[] sampleDurations;
    com.mp4parser.iso14496.part30.WebVTTSampleEntry sampleEntry;
    java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    com.coremedia.iso.boxes.SampleDescriptionBox stsd;
    com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;


    private static class BoxBearingSample implements com.googlecode.mp4parser.authoring.Sample {
        java.util.List<com.coremedia.iso.boxes.Box> boxes;

        public BoxBearingSample(java.util.List<com.coremedia.iso.boxes.Box> r1) {
                r0 = this;
                r0.<init>()
                r0.boxes = r1
                return
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public java.nio.ByteBuffer asByteBuffer() {
                r2 = this;
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                r0.<init>()
                java.nio.channels.WritableByteChannel r1 = java.nio.channels.Channels.newChannel(r0)     // Catch: java.io.IOException -> L15
                r2.writeTo(r1)     // Catch: java.io.IOException -> L15
                byte[] r0 = r0.toByteArray()
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                return r0
            L15:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public long getSize() {
                r5 = this;
                java.util.List<com.coremedia.iso.boxes.Box> r0 = r5.boxes
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L8:
                boolean r3 = r0.hasNext()
                if (r3 != 0) goto Lf
                return r1
            Lf:
                java.lang.Object r3 = r0.next()
                com.coremedia.iso.boxes.Box r3 = (com.coremedia.iso.boxes.Box) r3
                long r3 = r3.getSize()
                long r1 = r1 + r3
                goto L8
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public void writeTo(java.nio.channels.WritableByteChannel r3) throws java.io.IOException {
                r2 = this;
                java.util.List<com.coremedia.iso.boxes.Box> r0 = r2.boxes
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 != 0) goto Ld
                return
            Ld:
                java.lang.Object r1 = r0.next()
                com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
                r1.getBox(r3)
                goto L6
        }
    }

    static {
            java.lang.String r0 = "^\ufeff?WEBVTT((\\u0020|\t).*)?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.WEBVTT_FILE_HEADER = r0
            java.lang.String r0 = "\\S*[:=]\\S*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.WEBVTT_METADATA_HEADER = r0
            java.lang.String r0 = "^(?!.*(-->)).*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.WEBVTT_CUE_IDENTIFIER = r0
            java.lang.String r0 = "(\\d+:)?[0-5]\\d:[0-5]\\d\\.\\d{3}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.WEBVTT_TIMESTAMP = r0
            java.lang.String r0 = "\\S*:\\S*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.WEBVTT_CUE_SETTING = r0
            com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack$1 r0 = new com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack$1
            r0.<init>()
            com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.EMPTY_SAMPLE = r0
            return
    }

    public WebVttTrack(java.io.InputStream r12, java.lang.String r13, java.util.Locale r14) throws java.io.IOException {
            r11 = this;
            r11.<init>(r13)
            com.googlecode.mp4parser.authoring.TrackMetaData r13 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r13.<init>()
            r11.trackMetaData = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r11.samples = r13
            r13 = 0
            long[] r0 = new long[r13]
            r11.sampleDurations = r0
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r11.trackMetaData
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.setTimescale(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r11.trackMetaData
            java.lang.String r14 = r14.getISO3Language()
            r0.setLanguage(r14)
            com.coremedia.iso.boxes.SampleDescriptionBox r14 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r14.<init>()
            r11.stsd = r14
            com.mp4parser.iso14496.part30.WebVTTSampleEntry r14 = new com.mp4parser.iso14496.part30.WebVTTSampleEntry
            r14.<init>()
            r11.sampleEntry = r14
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r11.stsd
            r0.addBox(r14)
            com.mp4parser.iso14496.part30.WebVTTConfigurationBox r14 = new com.mp4parser.iso14496.part30.WebVTTConfigurationBox
            r14.<init>()
            com.mp4parser.iso14496.part30.WebVTTSampleEntry r0 = r11.sampleEntry
            r0.addBox(r14)
            com.mp4parser.iso14496.part30.WebVTTSampleEntry r0 = r11.sampleEntry
            com.mp4parser.iso14496.part30.WebVTTSourceLabelBox r1 = new com.mp4parser.iso14496.part30.WebVTTSourceLabelBox
            r1.<init>()
            r0.addBox(r1)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "UTF-8"
            r1.<init>(r12, r2)
            r0.<init>(r1)
            java.lang.String r12 = r0.readLine()
            if (r12 == 0) goto L1e4
            java.util.regex.Pattern r1 = com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.WEBVTT_FILE_HEADER
            java.util.regex.Matcher r1 = r1.matcher(r12)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L1e4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = r14.getConfig()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r2 = "\n"
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r14.setConfig(r12)
        L87:
            java.lang.String r12 = r0.readLine()
            if (r12 == 0) goto L1dc
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L1a0
            r3 = 0
        L95:
            java.lang.String r12 = r0.readLine()
            if (r12 != 0) goto L9c
            return
        L9c:
            java.lang.String r14 = r12.trim()
            java.lang.String r1 = ""
            boolean r14 = r1.equals(r14)
            if (r14 == 0) goto La9
            goto L95
        La9:
            java.util.regex.Pattern r14 = com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.WEBVTT_CUE_IDENTIFIER
            java.util.regex.Matcher r14 = r14.matcher(r12)
            boolean r14 = r14.find()
            if (r14 == 0) goto Lb9
            java.lang.String r12 = r0.readLine()
        Lb9:
            java.util.regex.Pattern r14 = com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.WEBVTT_TIMESTAMP
            java.util.regex.Matcher r14 = r14.matcher(r12)
            boolean r1 = r14.find()
            if (r1 == 0) goto L18c
            java.lang.String r1 = r14.group()
            long r5 = parseTimestampUs(r1)
            boolean r1 = r14.find()
            if (r1 == 0) goto L178
            java.lang.String r14 = r14.group()
            long r7 = parseTimestampUs(r14)
            int r1 = r12.indexOf(r14)
            int r14 = r14.length()
            int r1 = r1 + r14
            java.lang.String r12 = r12.substring(r1)
            java.util.regex.Pattern r14 = com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.WEBVTT_CUE_SETTING
            java.util.regex.Matcher r14 = r14.matcher(r12)
            r12 = 0
        Lef:
            boolean r1 = r14.find()
            if (r1 != 0) goto L172
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
        Lfa:
            java.lang.String r1 = r0.readLine()
            if (r1 == 0) goto L118
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L107
            goto L118
        L107:
            int r9 = r14.length()
            if (r9 <= 0) goto L110
            r14.append(r2)
        L110:
            java.lang.String r1 = r1.trim()
            r14.append(r1)
            goto Lfa
        L118:
            r1 = 1
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 == 0) goto L132
            long[] r9 = r11.sampleDurations
            long[] r10 = new long[r1]
            long r3 = r5 - r3
            r10[r13] = r3
            long[] r3 = com.googlecode.mp4parser.util.Mp4Arrays.copyOfAndAppend(r9, r10)
            r11.sampleDurations = r3
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r3 = r11.samples
            com.googlecode.mp4parser.authoring.Sample r4 = com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.EMPTY_SAMPLE
            r3.add(r4)
        L132:
            long[] r3 = r11.sampleDurations
            long[] r1 = new long[r1]
            long r4 = r7 - r5
            r1[r13] = r4
            long[] r1 = com.googlecode.mp4parser.util.Mp4Arrays.copyOfAndAppend(r3, r1)
            r11.sampleDurations = r1
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.VTTCueBox r1 = new com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.VTTCueBox
            r1.<init>()
            if (r12 == 0) goto L152
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSettingsBox r3 = new com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CueSettingsBox
            r3.<init>()
            r3.setContent(r12)
            r1.setCueSettingsBox(r3)
        L152:
            com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CuePayloadBox r12 = new com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes.CuePayloadBox
            r12.<init>()
            java.lang.String r14 = r14.toString()
            r12.setContent(r14)
            r1.setCuePayloadBox(r12)
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r12 = r11.samples
            com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack$BoxBearingSample r14 = new com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack$BoxBearingSample
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r14.<init>(r1)
            r12.add(r14)
            r3 = r7
            goto L95
        L172:
            java.lang.String r12 = r14.group()
            goto Lef
        L178:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected cue end time: "
            r14.<init>(r0)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.<init>(r12)
            throw r13
        L18c:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected cue start time: "
            r14.<init>(r0)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.<init>(r12)
            throw r13
        L1a0:
            java.util.regex.Pattern r1 = com.googlecode.mp4parser.authoring.tracks.webvtt.WebVttTrack.WEBVTT_METADATA_HEADER
            java.util.regex.Matcher r1 = r1.matcher(r12)
            boolean r1 = r1.find()
            if (r1 == 0) goto L1c8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = r14.getConfig()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r3)
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r14.setConfig(r12)
            goto L87
        L1c8:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected WebVTT metadata header. Got "
            r14.<init>(r0)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.<init>(r12)
            throw r13
        L1dc:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Expected an empty line after webvtt header"
            r12.<init>(r13)
            throw r12
        L1e4:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected WEBVTT. Got "
            r14.<init>(r0)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.<init>(r12)
            throw r13
    }

    private static long parseTimestampUs(java.lang.String r8) throws java.lang.NumberFormatException {
            java.lang.String r0 = "(\\d+:)?[0-5]\\d:[0-5]\\d\\.\\d{3}"
            boolean r0 = r8.matches(r0)
            if (r0 == 0) goto L38
            r0 = 2
            java.lang.String r1 = "\\."
            java.lang.String[] r8 = r8.split(r1, r0)
            r0 = 0
            r2 = 0
            r3 = r8[r2]
            java.lang.String r4 = ":"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
        L1b:
            if (r2 < r4) goto L2a
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r2 = 1
            r8 = r8[r2]
            long r2 = java.lang.Long.parseLong(r8)
            long r0 = r0 + r2
            return r0
        L2a:
            r5 = r3[r2]
            r6 = 60
            long r0 = r0 * r6
            long r5 = java.lang.Long.parseLong(r5)
            long r0 = r0 + r5
            int r2 = r2 + 1
            goto L1b
        L38:
            java.lang.NumberFormatException r8 = new java.lang.NumberFormatException
            java.lang.String r0 = "has invalid format"
            r8.<init>(r0)
            throw r8
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "text"
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
            r8 = this;
            long[] r0 = r8.sampleDurations
            int r0 = r0.length
            long[] r1 = new long[r0]
            r2 = 0
        L6:
            if (r2 < r0) goto L9
            return r1
        L9:
            long[] r3 = r8.sampleDurations
            r4 = r3[r2]
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r8.trackMetaData
            long r6 = r3.getTimescale()
            long r4 = r4 * r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r1[r2] = r4
            int r2 = r2 + 1
            goto L6
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r1.trackMetaData
            return r0
    }
}
