package com.google.firebase.encoders.proto;

/* loaded from: classes2.dex */
final class LengthCountingOutputStream extends java.io.OutputStream {
    private long length;

    LengthCountingOutputStream() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.length = r0
            return
    }

    long getLength() {
            r2 = this;
            long r0 = r2.length
            return r0
    }

    @Override // java.io.OutputStream
    public void write(int r5) {
            r4 = this;
            long r0 = r4.length
            r2 = 1
            long r0 = r0 + r2
            r4.length = r0
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r5) {
            r4 = this;
            long r0 = r4.length
            int r5 = r5.length
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.length = r0
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r4 < 0) goto L14
            int r0 = r3.length
            if (r4 > r0) goto L14
            if (r5 < 0) goto L14
            int r4 = r4 + r5
            int r3 = r3.length
            if (r4 > r3) goto L14
            if (r4 < 0) goto L14
            long r3 = r2.length
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.length = r3
            return
        L14:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
    }
}
