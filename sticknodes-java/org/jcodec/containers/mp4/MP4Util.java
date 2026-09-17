package org.jcodec.containers.mp4;

/* loaded from: classes2.dex */
public class MP4Util {
    private static java.util.Map<org.jcodec.common.Codec, java.lang.String> codecMapping;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.jcodec.containers.mp4.MP4Util.codecMapping = r0
            org.jcodec.common.Codec r1 = org.jcodec.common.Codec.MPEG2
            java.lang.String r2 = "m2v1"
            r0.put(r1, r2)
            java.util.Map<org.jcodec.common.Codec, java.lang.String> r0 = org.jcodec.containers.mp4.MP4Util.codecMapping
            org.jcodec.common.Codec r1 = org.jcodec.common.Codec.H264
            java.lang.String r2 = "avc1"
            r0.put(r1, r2)
            java.util.Map<org.jcodec.common.Codec, java.lang.String> r0 = org.jcodec.containers.mp4.MP4Util.codecMapping
            org.jcodec.common.Codec r1 = org.jcodec.common.Codec.J2K
            java.lang.String r2 = "mjp2"
            r0.put(r1, r2)
            return
    }

    public static void doWriteMovieToChannel(org.jcodec.common.io.SeekableByteChannel r2, org.jcodec.containers.mp4.boxes.MovieBox r3, int r4) throws java.io.IOException {
            int r0 = estimateMoovBoxSize(r3)
            int r0 = r0 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Using "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r1 = " bytes for MOOV box"
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            org.jcodec.common.logging.Logger.debug(r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r0)
            r3.write(r4)
            java.nio.Buffer r3 = r4.flip()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            r2.write(r4)
            return
    }

    public static int estimateMoovBoxSize(org.jcodec.containers.mp4.boxes.MovieBox r7) {
            org.jcodec.containers.mp4.boxes.TrakBox[] r7 = r7.getTracks()
            int r0 = r7.length
            r1 = 4096(0x1000, float:5.74E-42)
            r2 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto La7
            r4 = r7[r3]
            int r1 = r1 + 4096
            java.util.List r5 = r4.getEdits()
            if (r5 == 0) goto L23
            int r6 = r5.size()
            int r6 = r6 << 3
            int r5 = r5.size()
            int r5 = r5 << 2
            int r6 = r6 + r5
            goto L24
        L23:
            r6 = 0
        L24:
            int r1 = r1 + r6
            org.jcodec.containers.mp4.boxes.ChunkOffsetsBox r5 = r4.getStco()
            if (r5 == 0) goto L33
            long[] r5 = r5.getChunkOffsets()
            int r5 = r5.length
            int r5 = r5 << 2
            goto L34
        L33:
            r5 = 0
        L34:
            int r1 = r1 + r5
            org.jcodec.containers.mp4.boxes.ChunkOffsets64Box r5 = r4.getCo64()
            if (r5 == 0) goto L43
            long[] r5 = r5.getChunkOffsets()
            int r5 = r5.length
            int r5 = r5 << 3
            goto L44
        L43:
            r5 = 0
        L44:
            int r1 = r1 + r5
            org.jcodec.containers.mp4.boxes.SampleSizesBox r5 = r4.getStsz()
            if (r5 == 0) goto L59
            int r6 = r5.getDefaultSize()
            if (r6 == 0) goto L52
            goto L59
        L52:
            int r5 = r5.getCount()
            int r5 = r5 << 2
            goto L5a
        L59:
            r5 = 0
        L5a:
            int r1 = r1 + r5
            org.jcodec.containers.mp4.boxes.TimeToSampleBox r5 = r4.getStts()
            if (r5 == 0) goto L69
            org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry[] r5 = r5.getEntries()
            int r5 = r5.length
            int r5 = r5 << 3
            goto L6a
        L69:
            r5 = 0
        L6a:
            int r1 = r1 + r5
            org.jcodec.containers.mp4.boxes.SyncSamplesBox r5 = r4.getStss()
            if (r5 == 0) goto L79
            int[] r5 = r5.getSyncSamples()
            int r5 = r5.length
            int r5 = r5 << 2
            goto L7a
        L79:
            r5 = 0
        L7a:
            int r1 = r1 + r5
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox r5 = r4.getCtts()
            if (r5 == 0) goto L89
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry[] r5 = r5.getEntries()
            int r5 = r5.length
            int r5 = r5 << 3
            goto L8a
        L89:
            r5 = 0
        L8a:
            int r1 = r1 + r5
            org.jcodec.containers.mp4.boxes.SampleToChunkBox r4 = r4.getStsc()
            if (r4 == 0) goto La1
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r5 = r4.getSampleToChunk()
            int r5 = r5.length
            int r5 = r5 << 3
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r4 = r4.getSampleToChunk()
            int r4 = r4.length
            int r4 = r4 << 2
            int r5 = r5 + r4
            goto La2
        La1:
            r5 = 0
        La2:
            int r1 = r1 + r5
            int r3 = r3 + 1
            goto L9
        La7:
            return r1
    }

    public static void writeMovie(org.jcodec.common.io.SeekableByteChannel r1, org.jcodec.containers.mp4.boxes.MovieBox r2) throws java.io.IOException {
            r0 = 0
            doWriteMovieToChannel(r1, r2, r0)
            return
    }
}
