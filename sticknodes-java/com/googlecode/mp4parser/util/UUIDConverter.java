package com.googlecode.mp4parser.util;

/* loaded from: classes2.dex */
public class UUIDConverter {
    public UUIDConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.UUID convert(byte[] r5) {
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r5.order(r0)
            java.util.UUID r0 = new java.util.UUID
            long r1 = r5.getLong()
            long r3 = r5.getLong()
            r0.<init>(r1, r3)
            return r0
    }

    public static byte[] convert(java.util.UUID r9) {
            long r0 = r9.getMostSignificantBits()
            long r2 = r9.getLeastSignificantBits()
            r9 = 16
            byte[] r4 = new byte[r9]
            r5 = 0
        Ld:
            r6 = 8
            if (r5 < r6) goto L23
            r0 = 8
        L13:
            if (r0 < r9) goto L16
            return r4
        L16:
            int r1 = 7 - r0
            int r1 = r1 * 8
            long r7 = r2 >>> r1
            int r1 = (int) r7
            byte r1 = (byte) r1
            r4[r0] = r1
            int r0 = r0 + 1
            goto L13
        L23:
            int r7 = 7 - r5
            int r7 = r7 * 8
            long r6 = r0 >>> r7
            int r7 = (int) r6
            byte r6 = (byte) r7
            r4[r5] = r6
            int r5 = r5 + 1
            goto Ld
    }
}
