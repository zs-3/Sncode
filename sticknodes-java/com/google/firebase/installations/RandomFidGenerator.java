package com.google.firebase.installations;

/* loaded from: classes2.dex */
public class RandomFidGenerator {
    private static final byte FID_4BIT_PREFIX = 0;
    private static final byte REMOVE_PREFIX_MASK = 0;

    static {
            java.lang.String r0 = "01110000"
            r1 = 2
            byte r0 = java.lang.Byte.parseByte(r0, r1)
            com.google.firebase.installations.RandomFidGenerator.FID_4BIT_PREFIX = r0
            java.lang.String r0 = "00001111"
            byte r0 = java.lang.Byte.parseByte(r0, r1)
            com.google.firebase.installations.RandomFidGenerator.REMOVE_PREFIX_MASK = r0
            return
    }

    public RandomFidGenerator() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String encodeFidBase64UrlSafe(byte[] r2) {
            java.lang.String r0 = new java.lang.String
            r1 = 11
            byte[] r2 = android.util.Base64.encode(r2, r1)
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            r0.<init>(r2, r1)
            r2 = 0
            r1 = 22
            java.lang.String r2 = r0.substring(r2, r1)
            return r2
    }

    private static byte[] getBytesFromUUID(java.util.UUID r2, byte[] r3) {
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            long r0 = r2.getMostSignificantBits()
            r3.putLong(r0)
            long r0 = r2.getLeastSignificantBits()
            r3.putLong(r0)
            byte[] r2 = r3.array()
            return r2
    }

    public java.lang.String createRandomFid() {
            r4 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r1 = 17
            byte[] r1 = new byte[r1]
            byte[] r0 = getBytesFromUUID(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 16
            r0[r3] = r2
            byte r2 = com.google.firebase.installations.RandomFidGenerator.REMOVE_PREFIX_MASK
            r3 = r0[r1]
            r2 = r2 & r3
            byte r3 = com.google.firebase.installations.RandomFidGenerator.FID_4BIT_PREFIX
            r2 = r2 | r3
            byte r2 = (byte) r2
            r0[r1] = r2
            java.lang.String r0 = encodeFidBase64UrlSafe(r0)
            return r0
    }
}
