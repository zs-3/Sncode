package com.googlecode.mp4parser.authoring;

/* loaded from: classes2.dex */
public class SampleImpl implements com.googlecode.mp4parser.authoring.Sample {
    private java.nio.ByteBuffer[] data;
    private final long offset;
    private final com.coremedia.iso.boxes.Container parent;
    private final long size;

    public SampleImpl(long r1, long r3, com.coremedia.iso.boxes.Container r5) {
            r0 = this;
            r0.<init>()
            r0.offset = r1
            r0.size = r3
            r1 = 0
            r0.data = r1
            r0.parent = r5
            return
    }

    public SampleImpl(long r1, long r3, java.nio.ByteBuffer r5) {
            r0 = this;
            r0.<init>()
            r0.offset = r1
            r0.size = r3
            r1 = 1
            java.nio.ByteBuffer[] r1 = new java.nio.ByteBuffer[r1]
            r2 = 0
            r1[r2] = r5
            r0.data = r1
            r1 = 0
            r0.parent = r1
            return
    }

    public SampleImpl(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.offset = r0
            int r0 = r3.limit()
            long r0 = (long) r0
            r2.size = r0
            r0 = 1
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[r0]
            r1 = 0
            r0[r1] = r3
            r2.data = r0
            r3 = 0
            r2.parent = r3
            return
    }

    public SampleImpl(java.nio.ByteBuffer[] r5) {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.offset = r0
            int r0 = r5.length
            r1 = 0
            r2 = 0
        La:
            if (r1 < r0) goto L15
            long r0 = (long) r2
            r4.size = r0
            r4.data = r5
            r5 = 0
            r4.parent = r5
            return
        L15:
            r3 = r5[r1]
            int r3 = r3.remaining()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto La
    }

    @Override // com.googlecode.mp4parser.authoring.Sample
    public java.nio.ByteBuffer asByteBuffer() {
            r5 = this;
            r5.ensureData()
            long r0 = r5.size
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer[] r1 = r5.data
            int r2 = r1.length
            r3 = 0
        L13:
            if (r3 < r2) goto L19
            r0.rewind()
            return r0
        L19:
            r4 = r1[r3]
            java.nio.ByteBuffer r4 = r4.duplicate()
            r0.put(r4)
            int r3 = r3 + 1
            goto L13
    }

    protected void ensureData() {
            r7 = this;
            java.nio.ByteBuffer[] r0 = r7.data
            if (r0 == 0) goto L5
            return
        L5:
            com.coremedia.iso.boxes.Container r0 = r7.parent
            if (r0 == 0) goto L2f
            r1 = 1
            java.nio.ByteBuffer[] r1 = new java.nio.ByteBuffer[r1]     // Catch: java.io.IOException -> L1a
            r2 = 0
            long r3 = r7.offset     // Catch: java.io.IOException -> L1a
            long r5 = r7.size     // Catch: java.io.IOException -> L1a
            java.nio.ByteBuffer r0 = r0.getByteBuffer(r3, r5)     // Catch: java.io.IOException -> L1a
            r1[r2] = r0     // Catch: java.io.IOException -> L1a
            r7.data = r1     // Catch: java.io.IOException -> L1a
            return
        L1a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "couldn't read sample "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L2f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Missing parent container, can't read sample "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.googlecode.mp4parser.authoring.Sample
    public long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SampleImpl"
            r0.append(r1)
            java.lang.String r1 = "{offset="
            r0.append(r1)
            long r1 = r3.offset
            r0.append(r1)
            java.lang.String r1 = "{size="
            r0.append(r1)
            long r1 = r3.size
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Sample
    public void writeTo(java.nio.channels.WritableByteChannel r5) throws java.io.IOException {
            r4 = this;
            r4.ensureData()
            java.nio.ByteBuffer[] r0 = r4.data
            int r1 = r0.length
            r2 = 0
        L7:
            if (r2 < r1) goto La
            return
        La:
            r3 = r0[r2]
            java.nio.ByteBuffer r3 = r3.duplicate()
            r5.write(r3)
            int r2 = r2 + 1
            goto L7
    }
}
