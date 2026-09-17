package com.mp4parser.streaming.rawformats;

/* loaded from: classes2.dex */
public class H264TrackAdapter extends com.mp4parser.streaming.AbstractStreamingTrack {
    com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl h264Track;



    public H264TrackAdapter(com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl r4) throws java.lang.InterruptedException {
            r3 = this;
            r3.<init>()
            r3.h264Track = r4
            java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
            r1 = 100
            r2 = 1
            r0.<init>(r1, r2)
            r3.samples = r0
            com.mp4parser.streaming.rawformats.H264TrackAdapter$1 r0 = new com.mp4parser.streaming.rawformats.H264TrackAdapter$1
            r0.<init>(r3)
            r0.start()
            com.coremedia.iso.boxes.SampleDescriptionBox r4 = r4.getSampleDescriptionBox()
            r3.stsd = r4
            return
    }

    public static void main(java.lang.String[] r3) throws java.io.IOException, java.lang.InterruptedException {
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl r3 = new com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl
            com.googlecode.mp4parser.FileDataSourceImpl r0 = new com.googlecode.mp4parser.FileDataSourceImpl
            java.lang.String r1 = "c:\\content\\big_buck_bunny_1080p_h264-2min.h264"
            r0.<init>(r1)
            r3.<init>(r0)
            com.mp4parser.streaming.rawformats.H264TrackAdapter r0 = new com.mp4parser.streaming.rawformats.H264TrackAdapter
            r0.<init>(r3)
            com.mp4parser.streaming.MultiTrackFragmentedMp4Writer r3 = new com.mp4parser.streaming.MultiTrackFragmentedMp4Writer
            r1 = 1
            com.mp4parser.streaming.StreamingTrack[] r1 = new com.mp4parser.streaming.StreamingTrack[r1]
            r2 = 0
            r1[r2] = r0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.lang.String r2 = "output.mp4"
            r0.<init>(r2)
            r3.<init>(r1, r0)
            r3.write()
            return
    }

    @Override // com.mp4parser.streaming.StreamingTrack
    public java.lang.String getHandler() {
            r1 = this;
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl r0 = r1.h264Track
            java.lang.String r0 = r0.getHandler()
            return r0
    }

    @Override // com.mp4parser.streaming.StreamingTrack
    public java.lang.String getLanguage() {
            r1 = this;
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl r0 = r1.h264Track
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            java.lang.String r0 = r0.getLanguage()
            return r0
    }

    @Override // com.mp4parser.streaming.StreamingTrack
    public long getTimescale() {
            r2 = this;
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl r0 = r2.h264Track
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            long r0 = r0.getTimescale()
            return r0
    }

    public void parse() throws java.lang.InterruptedException {
            r7 = this;
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl r0 = r7.h264Track
            java.util.List r0 = r0.getSamples()
            r1 = 0
        L7:
            int r2 = r0.size()
            if (r1 < r2) goto L15
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "Jo!"
            r0.println(r1)
            return
        L15:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Jo! "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r4 = " of "
            r3.append(r4)
            int r4 = r0.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl r2 = r7.h264Track
            long[] r2 = r2.getSampleDurations()
            r3 = r2[r1]
            java.lang.Object r2 = r0.get(r1)
            com.googlecode.mp4parser.authoring.Sample r2 = (com.googlecode.mp4parser.authoring.Sample) r2
            java.util.concurrent.BlockingQueue<com.mp4parser.streaming.StreamingSample> r5 = r7.samples
            com.mp4parser.streaming.rawformats.H264TrackAdapter$2 r6 = new com.mp4parser.streaming.rawformats.H264TrackAdapter$2
            r6.<init>(r7, r2, r3)
            r5.put(r6)
            int r1 = r1 + 1
            goto L7
    }
}
