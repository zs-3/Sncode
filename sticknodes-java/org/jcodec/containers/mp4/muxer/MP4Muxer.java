package org.jcodec.containers.mp4.muxer;

/* loaded from: classes2.dex */
public class MP4Muxer {
    protected long mdatOffset;
    private int nextTrackId;
    protected org.jcodec.common.io.SeekableByteChannel out;
    private java.util.List<org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack> tracks;

    public MP4Muxer(org.jcodec.common.io.SeekableByteChannel r4, org.jcodec.containers.mp4.boxes.FileTypeBox r5) throws java.io.IOException {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.nextTrackId = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.tracks = r0
            r3.out = r4
            r0 = 1024(0x400, float:1.435E-42)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r5.write(r0)
            java.lang.String r5 = "wide"
            r1 = 8
            org.jcodec.containers.mp4.boxes.Header r5 = org.jcodec.containers.mp4.boxes.Header.createHeader(r5, r1)
            r5.write(r0)
            java.lang.String r5 = "mdat"
            r1 = 1
            org.jcodec.containers.mp4.boxes.Header r5 = org.jcodec.containers.mp4.boxes.Header.createHeader(r5, r1)
            r5.write(r0)
            int r5 = r0.position()
            long r1 = (long) r5
            r3.mdatOffset = r1
            r1 = 0
            r0.putLong(r1)
            java.nio.Buffer r5 = r0.flip()
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            r4.write(r0)
            return
    }

    public static org.jcodec.containers.mp4.muxer.MP4Muxer createMP4Muxer(org.jcodec.common.io.SeekableByteChannel r1, org.jcodec.containers.mp4.Brand r2) throws java.io.IOException {
            org.jcodec.containers.mp4.muxer.MP4Muxer r0 = new org.jcodec.containers.mp4.muxer.MP4Muxer
            org.jcodec.containers.mp4.boxes.FileTypeBox r2 = r2.getFileTypeBox()
            r0.<init>(r1, r2)
            return r0
    }

    private org.jcodec.containers.mp4.boxes.MovieHeaderBox movieHeader(org.jcodec.containers.mp4.boxes.NodeBox r14) {
            r13 = this;
            java.util.List<org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack> r14 = r13.tracks
            r0 = 0
            java.lang.Object r14 = r14.get(r0)
            org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack r14 = (org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack) r14
            int r14 = r14.getTimescale()
            java.util.List<org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack> r1 = r13.tracks
            java.lang.Object r0 = r1.get(r0)
            org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack r0 = (org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack) r0
            long r0 = r0.getTrackTotalDuration()
            org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack r2 = r13.getVideoTrack()
            if (r2 == 0) goto L27
            int r14 = r2.getTimescale()
            long r0 = r2.getTrackTotalDuration()
        L27:
            r2 = r14
            r3 = r0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            java.util.Date r14 = new java.util.Date
            r14.<init>()
            long r7 = r14.getTime()
            java.util.Date r14 = new java.util.Date
            r14.<init>()
            long r9 = r14.getTime()
            r14 = 9
            int[] r11 = new int[r14]
            r11 = {x004e: FILL_ARRAY_DATA , data: [65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824} // fill-array
            int r12 = r13.nextTrackId
            org.jcodec.containers.mp4.boxes.MovieHeaderBox r14 = org.jcodec.containers.mp4.boxes.MovieHeaderBox.createMovieHeaderBox(r2, r3, r5, r6, r7, r9, r11, r12)
            return r14
    }

    public static org.jcodec.containers.mp4.boxes.VideoSampleEntry videoSampleEntry(java.lang.String r17, org.jcodec.common.model.Size r18, java.lang.String r19) {
            org.jcodec.containers.mp4.boxes.Header r0 = new org.jcodec.containers.mp4.boxes.Header
            r1 = r17
            r0.<init>(r1)
            int r1 = r18.getWidth()
            short r6 = (short) r1
            int r1 = r18.getHeight()
            short r7 = (short) r1
            if (r19 == 0) goto L16
            r13 = r19
            goto L19
        L16:
            java.lang.String r1 = "jcodec"
            r13 = r1
        L19:
            r14 = 24
            r15 = 1
            r16 = -1
            r1 = 0
            r2 = 0
            java.lang.String r3 = "jcod"
            r4 = 0
            r5 = 768(0x300, float:1.076E-42)
            r8 = 72
            r10 = 72
            r12 = 1
            org.jcodec.containers.mp4.boxes.VideoSampleEntry r0 = org.jcodec.containers.mp4.boxes.VideoSampleEntry.createVideoSampleEntry(r0, r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16)
            return r0
    }

    public org.jcodec.containers.mp4.muxer.FramesMP4MuxerTrack addTrack(org.jcodec.containers.mp4.TrackType r5, int r6) {
            r4 = this;
            org.jcodec.containers.mp4.muxer.FramesMP4MuxerTrack r0 = new org.jcodec.containers.mp4.muxer.FramesMP4MuxerTrack
            org.jcodec.common.io.SeekableByteChannel r1 = r4.out
            int r2 = r4.nextTrackId
            int r3 = r2 + 1
            r4.nextTrackId = r3
            r0.<init>(r1, r2, r5, r6)
            java.util.List<org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack> r5 = r4.tracks
            r5.add(r0)
            return r0
    }

    public org.jcodec.containers.mp4.boxes.MovieBox finalizeHeader() throws java.io.IOException {
            r4 = this;
            org.jcodec.containers.mp4.boxes.MovieBox r0 = org.jcodec.containers.mp4.boxes.MovieBox.createMovieBox()
            org.jcodec.containers.mp4.boxes.MovieHeaderBox r1 = r4.movieHeader(r0)
            r0.addFirst(r1)
            java.util.List<org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack> r2 = r4.tracks
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r2.next()
            org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack r3 = (org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack) r3
            org.jcodec.containers.mp4.boxes.Box r3 = r3.finish(r1)
            if (r3 == 0) goto L11
            r0.add(r3)
            goto L11
        L27:
            return r0
    }

    public org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack getVideoTrack() {
            r3 = this;
            java.util.List<org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack> r0 = r3.tracks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack r1 = (org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack) r1
            boolean r2 = r1.isVideo()
            if (r2 == 0) goto L6
            return r1
        L19:
            r0 = 0
            return r0
    }

    public void storeHeader(org.jcodec.containers.mp4.boxes.MovieBox r5) throws java.io.IOException {
            r4 = this;
            org.jcodec.common.io.SeekableByteChannel r0 = r4.out
            long r0 = r0.position()
            long r2 = r4.mdatOffset
            long r0 = r0 - r2
            r2 = 8
            long r0 = r0 + r2
            org.jcodec.common.io.SeekableByteChannel r2 = r4.out
            org.jcodec.containers.mp4.MP4Util.writeMovie(r2, r5)
            org.jcodec.common.io.SeekableByteChannel r5 = r4.out
            long r2 = r4.mdatOffset
            r5.setPosition(r2)
            org.jcodec.common.io.SeekableByteChannel r5 = r4.out
            org.jcodec.common.io.NIOUtils.writeLong(r5, r0)
            return
    }

    public void writeHeader() throws java.io.IOException {
            r1 = this;
            org.jcodec.containers.mp4.boxes.MovieBox r0 = r1.finalizeHeader()
            r1.storeHeader(r0)
            return
    }
}
