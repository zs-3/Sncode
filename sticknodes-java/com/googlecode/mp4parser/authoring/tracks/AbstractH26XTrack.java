package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public abstract class AbstractH26XTrack extends com.googlecode.mp4parser.authoring.AbstractTrack {
    public static int BUFFER = 67107840;
    protected java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> ctts;
    private com.googlecode.mp4parser.DataSource dataSource;
    protected long[] decodingTimes;
    protected java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> sdtp;
    protected java.util.List<java.lang.Integer> stss;
    protected com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;
    boolean tripleZeroIsEndOfSequence;

    public static class LookAhead {
        java.nio.ByteBuffer buffer;
        long bufferStartPos;
        com.googlecode.mp4parser.DataSource dataSource;
        int inBufferPos;
        long start;

        public LookAhead(com.googlecode.mp4parser.DataSource r3) throws java.io.IOException {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.bufferStartPos = r0
                r0 = 0
                r2.inBufferPos = r0
                r2.dataSource = r3
                r2.fillBuffer()
                return
        }

        public void discardByte() {
                r1 = this;
                int r0 = r1.inBufferPos
                int r0 = r0 + 1
                r1.inBufferPos = r0
                return
        }

        public void discardNext3AndMarkStart() {
                r5 = this;
                int r0 = r5.inBufferPos
                int r0 = r0 + 3
                r5.inBufferPos = r0
                long r1 = r5.bufferStartPos
                long r3 = (long) r0
                long r1 = r1 + r3
                r5.start = r1
                return
        }

        public void fillBuffer() throws java.io.IOException {
                r7 = this;
                com.googlecode.mp4parser.DataSource r0 = r7.dataSource
                long r1 = r7.bufferStartPos
                long r3 = r0.size()
                long r5 = r7.bufferStartPos
                long r3 = r3 - r5
                int r5 = com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.BUFFER
                long r5 = (long) r5
                long r3 = java.lang.Math.min(r3, r5)
                java.nio.ByteBuffer r0 = r0.map(r1, r3)
                r7.buffer = r0
                return
        }

        public java.nio.ByteBuffer getNal() {
                r7 = this;
                long r0 = r7.start
                long r2 = r7.bufferStartPos
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L23
                java.nio.ByteBuffer r4 = r7.buffer
                long r0 = r0 - r2
                int r1 = (int) r0
                r4.position(r1)
                java.nio.ByteBuffer r0 = r7.buffer
                java.nio.ByteBuffer r0 = r0.slice()
                int r1 = r7.inBufferPos
                long r1 = (long) r1
                long r3 = r7.start
                long r5 = r7.bufferStartPos
                long r3 = r3 - r5
                long r1 = r1 - r3
                int r2 = (int) r1
                r0.limit(r2)
                return r0
            L23:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "damn! NAL exceeds buffer"
                r0.<init>(r1)
                throw r0
        }

        public boolean nextThreeEquals000or001orEof(boolean r8) throws java.io.IOException {
                r7 = this;
                java.nio.ByteBuffer r0 = r7.buffer
                int r0 = r0.limit()
                int r1 = r7.inBufferPos
                int r0 = r0 - r1
                r2 = 0
                r3 = 1
                r4 = 3
                if (r0 < r4) goto L3d
                java.nio.ByteBuffer r0 = r7.buffer
                byte r0 = r0.get(r1)
                if (r0 != 0) goto L3c
                java.nio.ByteBuffer r0 = r7.buffer
                int r1 = r7.inBufferPos
                int r1 = r1 + r3
                byte r0 = r0.get(r1)
                if (r0 != 0) goto L3c
                java.nio.ByteBuffer r0 = r7.buffer
                int r1 = r7.inBufferPos
                int r1 = r1 + 2
                byte r0 = r0.get(r1)
                if (r0 != 0) goto L2f
                if (r8 != 0) goto L3b
            L2f:
                java.nio.ByteBuffer r8 = r7.buffer
                int r0 = r7.inBufferPos
                int r0 = r0 + 2
                byte r8 = r8.get(r0)
                if (r8 != r3) goto L3c
            L3b:
                return r3
            L3c:
                return r2
            L3d:
                long r4 = r7.bufferStartPos
                long r0 = (long) r1
                long r4 = r4 + r0
                r0 = 3
                long r4 = r4 + r0
                com.googlecode.mp4parser.DataSource r0 = r7.dataSource
                long r0 = r0.size()
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 <= 0) goto L60
                long r0 = r7.bufferStartPos
                int r8 = r7.inBufferPos
                long r4 = (long) r8
                long r0 = r0 + r4
                com.googlecode.mp4parser.DataSource r8 = r7.dataSource
                long r4 = r8.size()
                int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r8 != 0) goto L5f
                return r3
            L5f:
                return r2
            L60:
                long r0 = r7.start
                r7.bufferStartPos = r0
                r7.inBufferPos = r2
                r7.fillBuffer()
                boolean r8 = r7.nextThreeEquals000or001orEof(r8)
                return r8
        }

        public boolean nextThreeEquals001() throws java.io.IOException {
                r6 = this;
                java.nio.ByteBuffer r0 = r6.buffer
                int r0 = r0.limit()
                int r1 = r6.inBufferPos
                int r0 = r0 - r1
                r2 = 0
                r3 = 3
                if (r0 < r3) goto L2f
                java.nio.ByteBuffer r0 = r6.buffer
                byte r0 = r0.get(r1)
                if (r0 != 0) goto L2e
                java.nio.ByteBuffer r0 = r6.buffer
                int r1 = r6.inBufferPos
                r3 = 1
                int r1 = r1 + r3
                byte r0 = r0.get(r1)
                if (r0 != 0) goto L2e
                java.nio.ByteBuffer r0 = r6.buffer
                int r1 = r6.inBufferPos
                int r1 = r1 + 2
                byte r0 = r0.get(r1)
                if (r0 != r3) goto L2e
                return r3
            L2e:
                return r2
            L2f:
                long r3 = r6.bufferStartPos
                long r0 = (long) r1
                long r3 = r3 + r0
                r0 = 3
                long r3 = r3 + r0
                com.googlecode.mp4parser.DataSource r0 = r6.dataSource
                long r0 = r0.size()
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 >= 0) goto L41
                return r2
            L41:
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
        }
    }

    static {
            return
    }

    public AbstractH26XTrack(com.googlecode.mp4parser.DataSource r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public AbstractH26XTrack(com.googlecode.mp4parser.DataSource r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.ctts = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.sdtp = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.stss = r0
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r0.<init>()
            r1.trackMetaData = r0
            r1.dataSource = r2
            r1.tripleZeroIsEndOfSequence = r3
            return
    }

    protected static java.io.InputStream cleanBuffer(java.io.InputStream r1) {
            com.googlecode.mp4parser.authoring.tracks.CleanInputStream r0 = new com.googlecode.mp4parser.authoring.tracks.CleanInputStream
            r0.<init>(r1)
            return r0
    }

    protected static byte[] toArray(java.nio.ByteBuffer r3) {
            java.nio.ByteBuffer r3 = r3.duplicate()
            int r0 = r3.remaining()
            byte[] r1 = new byte[r0]
            r2 = 0
            r3.get(r1, r2, r0)
            return r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.DataSource r0 = r1.dataSource
            r0.close()
            return
    }

    protected com.googlecode.mp4parser.authoring.Sample createSampleObject(java.util.List<? extends java.nio.ByteBuffer> r7) {
            r6 = this;
            int r0 = r7.size()
            r1 = 4
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.util.Iterator r3 = r7.iterator()
        L11:
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L43
            int r2 = r7.size()
            int r2 = r2 * 2
            java.nio.ByteBuffer[] r4 = new java.nio.ByteBuffer[r2]
            r2 = 0
        L20:
            int r3 = r7.size()
            if (r2 < r3) goto L2c
            com.googlecode.mp4parser.authoring.SampleImpl r7 = new com.googlecode.mp4parser.authoring.SampleImpl
            r7.<init>(r4)
            return r7
        L2c:
            int r3 = r2 * 2
            int r5 = r2 * 4
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r0, r5, r1)
            r4[r3] = r5
            int r3 = r3 + 1
            java.lang.Object r5 = r7.get(r2)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            r4[r3] = r5
            int r2 = r2 + 1
            goto L20
        L43:
            java.lang.Object r4 = r3.next()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r4.remaining()
            r2.putInt(r4)
            goto L11
    }

    protected java.nio.ByteBuffer findNextNal(com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack.LookAhead r2) throws java.io.IOException {
            r1 = this;
        L0:
            boolean r0 = r2.nextThreeEquals001()     // Catch: java.io.EOFException -> L1e
            if (r0 == 0) goto L1a
            r2.discardNext3AndMarkStart()     // Catch: java.io.EOFException -> L1e
        L9:
            boolean r0 = r1.tripleZeroIsEndOfSequence     // Catch: java.io.EOFException -> L1e
            boolean r0 = r2.nextThreeEquals000or001orEof(r0)     // Catch: java.io.EOFException -> L1e
            if (r0 == 0) goto L16
            java.nio.ByteBuffer r2 = r2.getNal()     // Catch: java.io.EOFException -> L1e
            return r2
        L16:
            r2.discardByte()     // Catch: java.io.EOFException -> L1e
            goto L9
        L1a:
            r2.discardByte()     // Catch: java.io.EOFException -> L1e
            goto L0
        L1e:
            r2 = 0
            return r2
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample$Entry> r0 = r1.ctts
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry> r0 = r1.sdtp
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
            r1 = this;
            long[] r0 = r1.decodingTimes
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r4 = this;
            java.util.List<java.lang.Integer> r0 = r4.stss
            int r0 = r0.size()
            long[] r0 = new long[r0]
            r1 = 0
        L9:
            java.util.List<java.lang.Integer> r2 = r4.stss
            int r2 = r2.size()
            if (r1 < r2) goto L12
            return r0
        L12:
            java.util.List<java.lang.Integer> r2 = r4.stss
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L9
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r1.trackMetaData
            return r0
    }
}
