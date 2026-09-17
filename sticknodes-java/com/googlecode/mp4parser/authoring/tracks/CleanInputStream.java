package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class CleanInputStream extends java.io.FilterInputStream {
    int prev;
    int prevprev;

    public CleanInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.prevprev = r1
            r0.prev = r1
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r2 = this;
            int r0 = super.read()
            r1 = 3
            if (r0 != r1) goto L18
            int r1 = r2.prevprev
            if (r1 != 0) goto L18
            int r1 = r2.prev
            if (r1 != 0) goto L18
            r0 = -1
            r2.prevprev = r0
            r2.prev = r0
            int r0 = super.read()
        L18:
            int r1 = r2.prev
            r2.prevprev = r1
            r2.prev = r0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            java.util.Objects.requireNonNull(r5)
            if (r6 < 0) goto L2e
            if (r7 < 0) goto L2e
            int r0 = r5.length
            int r0 = r0 - r6
            if (r7 > r0) goto L2e
            if (r7 != 0) goto Lf
            r5 = 0
            return r5
        Lf:
            int r0 = r4.read()
            r1 = -1
            if (r0 != r1) goto L17
            return r1
        L17:
            byte r0 = (byte) r0
            r5[r6] = r0
            r0 = 1
        L1b:
            if (r0 < r7) goto L1e
            goto L2d
        L1e:
            int r2 = r4.read()     // Catch: java.io.IOException -> L2d
            if (r2 != r1) goto L25
            goto L2d
        L25:
            int r3 = r6 + r0
            byte r2 = (byte) r2     // Catch: java.io.IOException -> L2d
            r5[r3] = r2     // Catch: java.io.IOException -> L2d
            int r0 = r0 + 1
            goto L1b
        L2d:
            return r0
        L2e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r5.<init>()
            throw r5
    }
}
