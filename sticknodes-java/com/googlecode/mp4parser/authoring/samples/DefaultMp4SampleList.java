package com.googlecode.mp4parser.authoring.samples;

/* loaded from: classes2.dex */
public class DefaultMp4SampleList extends java.util.AbstractList<com.googlecode.mp4parser.authoring.Sample> {
    private static final long MAX_MAP_SIZE = 268435456;
    java.lang.ref.SoftReference<java.nio.ByteBuffer[]>[] cache;
    int[] chunkNumsStartSampleNum;
    long[] chunkOffsets;
    long[] chunkSizes;
    int lastChunk;
    long[][] sampleOffsetsWithinChunks;
    com.coremedia.iso.boxes.SampleSizeBox ssb;
    com.coremedia.iso.boxes.Container topLevel;
    com.coremedia.iso.boxes.TrackBox trackBox;


    public DefaultMp4SampleList(long r21, com.coremedia.iso.boxes.Container r23) {
            r20 = this;
            r0 = r20
            r1 = r21
            r3 = r23
            r20.<init>()
            r4 = 0
            r0.trackBox = r4
            r0.cache = r4
            r4 = 0
            r0.lastChunk = r4
            r0.topLevel = r3
            java.lang.Class<com.coremedia.iso.boxes.MovieBox> r5 = com.coremedia.iso.boxes.MovieBox.class
            java.util.List r3 = r3.getBoxes(r5)
            java.lang.Object r3 = r3.get(r4)
            com.coremedia.iso.boxes.MovieBox r3 = (com.coremedia.iso.boxes.MovieBox) r3
            java.lang.Class<com.coremedia.iso.boxes.TrackBox> r5 = com.coremedia.iso.boxes.TrackBox.class
            java.util.List r3 = r3.getBoxes(r5)
            java.util.Iterator r3 = r3.iterator()
        L29:
            boolean r5 = r3.hasNext()
            if (r5 != 0) goto L16d
            com.coremedia.iso.boxes.TrackBox r3 = r0.trackBox
            if (r3 == 0) goto L159
            com.coremedia.iso.boxes.SampleTableBox r1 = r3.getSampleTableBox()
            com.coremedia.iso.boxes.ChunkOffsetBox r1 = r1.getChunkOffsetBox()
            long[] r1 = r1.getChunkOffsets()
            r0.chunkOffsets = r1
            int r2 = r1.length
            long[] r2 = new long[r2]
            r0.chunkSizes = r2
            java.lang.Class<java.lang.ref.SoftReference> r2 = java.lang.ref.SoftReference.class
            int r1 = r1.length
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            java.lang.ref.SoftReference[] r1 = (java.lang.ref.SoftReference[]) r1
            r0.cache = r1
            long[] r1 = r0.chunkOffsets
            int r1 = r1.length
            long[][] r1 = new long[r1][]
            r0.sampleOffsetsWithinChunks = r1
            com.coremedia.iso.boxes.TrackBox r1 = r0.trackBox
            com.coremedia.iso.boxes.SampleTableBox r1 = r1.getSampleTableBox()
            com.coremedia.iso.boxes.SampleSizeBox r1 = r1.getSampleSizeBox()
            r0.ssb = r1
            com.coremedia.iso.boxes.TrackBox r1 = r0.trackBox
            com.coremedia.iso.boxes.SampleTableBox r1 = r1.getSampleTableBox()
            com.coremedia.iso.boxes.SampleToChunkBox r1 = r1.getSampleToChunkBox()
            java.util.List r1 = r1.getEntries()
            int r2 = r1.size()
            com.coremedia.iso.boxes.SampleToChunkBox$Entry[] r2 = new com.coremedia.iso.boxes.SampleToChunkBox.Entry[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            r3 = r1
            com.coremedia.iso.boxes.SampleToChunkBox$Entry[] r3 = (com.coremedia.iso.boxes.SampleToChunkBox.Entry[]) r3
            r1 = r3[r4]
            long r5 = r1.getFirstChunk()
            long r1 = r1.getSamplesPerChunk()
            int r1 = com.googlecode.mp4parser.util.CastUtils.l2i(r1)
            int r7 = r20.size()
            r8 = 1
            r2 = 0
            r9 = 1
            r10 = 0
            r11 = 1
        L96:
            int r2 = r2 + r8
            long r12 = (long) r2
            r16 = -1
            int r17 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r17 != 0) goto Lbd
            int r5 = r3.length
            if (r5 <= r9) goto Lb6
            int r5 = r9 + 1
            r6 = r3[r9]
            long r9 = r6.getSamplesPerChunk()
            int r9 = com.googlecode.mp4parser.util.CastUtils.l2i(r9)
            long r12 = r6.getFirstChunk()
            r10 = r1
            r1 = r9
            r9 = r5
            r5 = r12
            goto Lbd
        Lb6:
            r10 = r1
            r1 = -1
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lbd:
            long[][] r12 = r0.sampleOffsetsWithinChunks
            int r13 = r2 + (-1)
            long[] r14 = new long[r10]
            r12[r13] = r14
            int r11 = r11 + r10
            if (r11 <= r7) goto L96
            int r2 = r2 + r8
            int[] r1 = new int[r2]
            r0.chunkNumsStartSampleNum = r1
            r1 = r3[r4]
            long r5 = r1.getFirstChunk()
            long r1 = r1.getSamplesPerChunk()
            int r1 = com.googlecode.mp4parser.util.CastUtils.l2i(r1)
            r2 = 0
            r9 = 1
            r10 = 1
            r11 = 0
        Ldf:
            int[] r12 = r0.chunkNumsStartSampleNum
            int r13 = r2 + 1
            r12[r2] = r9
            long r14 = (long) r13
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r2 != 0) goto L10c
            int r2 = r3.length
            if (r2 <= r10) goto L105
            int r2 = r10 + 1
            r5 = r3[r10]
            long r10 = r5.getSamplesPerChunk()
            int r6 = com.googlecode.mp4parser.util.CastUtils.l2i(r10)
            long r10 = r5.getFirstChunk()
            r18 = r10
            r11 = r1
            r10 = r2
            r1 = r6
            r5 = r18
            goto L10c
        L105:
            r11 = r1
            r1 = -1
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L10c:
            int r9 = r9 + r11
            if (r9 <= r7) goto L157
            int[] r1 = r0.chunkNumsStartSampleNum
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1[r13] = r2
            r1 = 0
            r5 = r1
            r12 = 1
        L11a:
            long r7 = (long) r12
            com.coremedia.iso.boxes.SampleSizeBox r3 = r0.ssb
            long r9 = r3.getSampleCount()
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto L126
            return
        L126:
            int[] r3 = r0.chunkNumsStartSampleNum
            r3 = r3[r4]
            if (r12 == r3) goto L153
            long[] r3 = r0.chunkSizes
            int r7 = r4 + (-1)
            r8 = r3[r7]
            com.coremedia.iso.boxes.SampleSizeBox r10 = r0.ssb
            int r11 = r12 + (-1)
            long r13 = r10.getSampleSizeAtIndex(r11)
            long r8 = r8 + r13
            r3[r7] = r8
            long[][] r3 = r0.sampleOffsetsWithinChunks
            r3 = r3[r7]
            int[] r8 = r0.chunkNumsStartSampleNum
            r7 = r8[r7]
            int r7 = r12 - r7
            r3[r7] = r5
            com.coremedia.iso.boxes.SampleSizeBox r3 = r0.ssb
            long r7 = r3.getSampleSizeAtIndex(r11)
            long r5 = r5 + r7
            int r12 = r12 + 1
            goto L11a
        L153:
            int r4 = r4 + 1
            r5 = r1
            goto L126
        L157:
            r2 = r13
            goto Ldf
        L159:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "This MP4 does not contain track "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            throw r3
        L16d:
            java.lang.Object r5 = r3.next()
            com.coremedia.iso.boxes.TrackBox r5 = (com.coremedia.iso.boxes.TrackBox) r5
            com.coremedia.iso.boxes.TrackHeaderBox r6 = r5.getTrackHeaderBox()
            long r6 = r6.getTrackId()
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 != 0) goto L29
            r0.trackBox = r5
            goto L29
    }

    @Override // java.util.AbstractList, java.util.List
    public com.googlecode.mp4parser.authoring.Sample get(int r21) {
            r20 = this;
            r8 = r20
            r0 = r21
            long r1 = (long) r0
            com.coremedia.iso.boxes.SampleSizeBox r3 = r8.ssb
            long r3 = r3.getSampleCount()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto Leb
            int r1 = r20.getChunkForSample(r21)
            int[] r2 = r8.chunkNumsStartSampleNum
            r2 = r2[r1]
            int r2 = r2 + (-1)
            long[] r3 = r8.chunkOffsets
            long r4 = (long) r1
            int r1 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)
            r6 = r3[r1]
            int r1 = r0 - r2
            long[][] r3 = r8.sampleOffsetsWithinChunks
            int r9 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)
            r3 = r3[r9]
            r9 = r3[r1]
            java.lang.ref.SoftReference<java.nio.ByteBuffer[]>[] r1 = r8.cache
            int r11 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)
            r1 = r1[r11]
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r1.get()
            java.nio.ByteBuffer[] r1 = (java.nio.ByteBuffer[]) r1
            goto L40
        L3f:
            r1 = 0
        L40:
            if (r1 != 0) goto Lc0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r13 = 0
            r15 = 0
        L4a:
            int r11 = r3.length     // Catch: java.io.IOException -> Lb5
            if (r15 < r11) goto L84
            com.coremedia.iso.boxes.Container r11 = r8.topLevel     // Catch: java.io.IOException -> Lb5
            long r6 = r6 + r13
            long r13 = -r13
            int r15 = r3.length     // Catch: java.io.IOException -> Lb5
            int r15 = r15 + (-1)
            r16 = r3[r15]     // Catch: java.io.IOException -> Lb5
            long r13 = r13 + r16
            com.coremedia.iso.boxes.SampleSizeBox r15 = r8.ssb     // Catch: java.io.IOException -> Lb5
            int r3 = r3.length     // Catch: java.io.IOException -> Lb5
            int r2 = r2 + r3
            int r2 = r2 + (-1)
            long r2 = r15.getSampleSizeAtIndex(r2)     // Catch: java.io.IOException -> Lb5
            long r13 = r13 + r2
            java.nio.ByteBuffer r2 = r11.getByteBuffer(r6, r13)     // Catch: java.io.IOException -> Lb5
            r1.add(r2)     // Catch: java.io.IOException -> Lb5
            int r2 = r1.size()     // Catch: java.io.IOException -> Lb5
            java.nio.ByteBuffer[] r2 = new java.nio.ByteBuffer[r2]     // Catch: java.io.IOException -> Lb5
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch: java.io.IOException -> Lb5
            java.nio.ByteBuffer[] r1 = (java.nio.ByteBuffer[]) r1     // Catch: java.io.IOException -> Lb5
            java.lang.ref.SoftReference<java.nio.ByteBuffer[]>[] r2 = r8.cache     // Catch: java.io.IOException -> Lb5
            int r3 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)     // Catch: java.io.IOException -> Lb5
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference     // Catch: java.io.IOException -> Lb5
            r4.<init>(r1)     // Catch: java.io.IOException -> Lb5
            r2[r3] = r4     // Catch: java.io.IOException -> Lb5
            goto Lc0
        L84:
            r16 = r3[r15]     // Catch: java.io.IOException -> Lb5
            com.coremedia.iso.boxes.SampleSizeBox r11 = r8.ssb     // Catch: java.io.IOException -> Lb5
            int r12 = r15 + r2
            long r11 = r11.getSampleSizeAtIndex(r12)     // Catch: java.io.IOException -> Lb5
            long r16 = r16 + r11
            long r16 = r16 - r13
            r11 = 268435456(0x10000000, double:1.32624737E-315)
            int r18 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r18 <= 0) goto Lae
            com.coremedia.iso.boxes.Container r11 = r8.topLevel     // Catch: java.io.IOException -> Lb5
            r16 = r4
            long r4 = r6 + r13
            r18 = r3[r15]     // Catch: java.io.IOException -> Lb5
            long r12 = r18 - r13
            java.nio.ByteBuffer r4 = r11.getByteBuffer(r4, r12)     // Catch: java.io.IOException -> Lb5
            r1.add(r4)     // Catch: java.io.IOException -> Lb5
            r4 = r3[r15]     // Catch: java.io.IOException -> Lb5
            r13 = r4
            goto Lb0
        Lae:
            r16 = r4
        Lb0:
            int r15 = r15 + 1
            r4 = r16
            goto L4a
        Lb5:
            r0 = move-exception
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        Lc0:
            int r2 = r1.length
            r6 = r9
            r12 = 0
        Lc3:
            if (r12 < r2) goto Lc7
            r5 = 0
            goto Ld3
        Lc7:
            r3 = r1[r12]
            int r4 = r3.limit()
            long r4 = (long) r4
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 >= 0) goto Le2
            r5 = r3
        Ld3:
            com.coremedia.iso.boxes.SampleSizeBox r1 = r8.ssb
            long r3 = r1.getSampleSizeAtIndex(r0)
            com.googlecode.mp4parser.authoring.samples.DefaultMp4SampleList$1 r0 = new com.googlecode.mp4parser.authoring.samples.DefaultMp4SampleList$1
            r1 = r0
            r2 = r20
            r1.<init>(r2, r3, r5, r6)
            return r0
        Le2:
            int r3 = r3.limit()
            long r3 = (long) r3
            long r6 = r6 - r3
            int r12 = r12 + 1
            goto Lc3
        Leb:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.googlecode.mp4parser.authoring.Sample r1 = r0.get(r1)
            return r1
    }

    synchronized int getChunkForSample(int r4) {
            r3 = this;
            monitor-enter(r3)
            int r4 = r4 + 1
            int[] r0 = r3.chunkNumsStartSampleNum     // Catch: java.lang.Throwable -> L40
            int r1 = r3.lastChunk     // Catch: java.lang.Throwable -> L40
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L40
            if (r4 < r2) goto L13
            int r2 = r1 + 1
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L40
            if (r4 >= r2) goto L13
            monitor-exit(r3)
            return r1
        L13:
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L40
            if (r4 >= r0) goto L2b
            r0 = 0
            r3.lastChunk = r0     // Catch: java.lang.Throwable -> L40
        L1a:
            int[] r0 = r3.chunkNumsStartSampleNum     // Catch: java.lang.Throwable -> L40
            int r1 = r3.lastChunk     // Catch: java.lang.Throwable -> L40
            int r2 = r1 + 1
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L40
            if (r0 <= r4) goto L26
            monitor-exit(r3)
            return r1
        L26:
            int r1 = r1 + 1
            r3.lastChunk = r1     // Catch: java.lang.Throwable -> L40
            goto L1a
        L2b:
            int r1 = r1 + 1
            r3.lastChunk = r1     // Catch: java.lang.Throwable -> L40
        L2f:
            int[] r0 = r3.chunkNumsStartSampleNum     // Catch: java.lang.Throwable -> L40
            int r1 = r3.lastChunk     // Catch: java.lang.Throwable -> L40
            int r2 = r1 + 1
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L40
            if (r0 <= r4) goto L3b
            monitor-exit(r3)
            return r1
        L3b:
            int r1 = r1 + 1
            r3.lastChunk = r1     // Catch: java.lang.Throwable -> L40
            goto L2f
        L40:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r2 = this;
            com.coremedia.iso.boxes.TrackBox r0 = r2.trackBox
            com.coremedia.iso.boxes.SampleTableBox r0 = r0.getSampleTableBox()
            com.coremedia.iso.boxes.SampleSizeBox r0 = r0.getSampleSizeBox()
            long r0 = r0.getSampleCount()
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            return r0
    }
}
