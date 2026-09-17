package com.coremedia.iso;

/* loaded from: classes.dex */
public final class IsoTypeWriter {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static {
            return
    }

    public IsoTypeWriter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void writeFixedPoint0230(java.nio.ByteBuffer r2, double r3) {
            r0 = 4742290407621132288(0x41d0000000000000, double:1.073741824E9)
            double r3 = r3 * r0
            int r3 = (int) r3
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = r4 & r3
            int r4 = r4 >> 24
            byte r4 = (byte) r4
            r2.put(r4)
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = r4 & r3
            int r4 = r4 >> 16
            byte r4 = (byte) r4
            r2.put(r4)
            r4 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r3
            int r4 = r4 >> 8
            byte r4 = (byte) r4
            r2.put(r4)
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            return
    }

    public static void writeFixedPoint1616(java.nio.ByteBuffer r2, double r3) {
            r0 = 4679240012837945344(0x40f0000000000000, double:65536.0)
            double r3 = r3 * r0
            int r3 = (int) r3
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = r4 & r3
            int r4 = r4 >> 24
            byte r4 = (byte) r4
            r2.put(r4)
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = r4 & r3
            int r4 = r4 >> 16
            byte r4 = (byte) r4
            r2.put(r4)
            r4 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r3
            int r4 = r4 >> 8
            byte r4 = (byte) r4
            r2.put(r4)
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            return
    }

    public static void writeFixedPoint88(java.nio.ByteBuffer r2, double r3) {
            r0 = 4643211215818981376(0x4070000000000000, double:256.0)
            double r3 = r3 * r0
            int r3 = (int) r3
            short r3 = (short) r3
            r4 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r3
            int r4 = r4 >> 8
            byte r4 = (byte) r4
            r2.put(r4)
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            return
    }

    public static void writeIso639(java.nio.ByteBuffer r5, java.lang.String r6) {
            byte[] r0 = r6.getBytes()
            int r0 = r0.length
            r1 = 3
            if (r0 != r1) goto L21
            r0 = 0
            r2 = 0
        La:
            if (r0 < r1) goto L10
            writeUInt16(r5, r2)
            return
        L10:
            byte[] r3 = r6.getBytes()
            r3 = r3[r0]
            int r3 = r3 + (-96)
            int r4 = 2 - r0
            int r4 = r4 * 5
            int r3 = r3 << r4
            int r2 = r2 + r3
            int r0 = r0 + 1
            goto La
        L21:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\" language string isn't exactly 3 characters long!"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }

    public static void writePascalUtfString(java.nio.ByteBuffer r1, java.lang.String r2) {
            byte[] r2 = com.coremedia.iso.Utf8.convert(r2)
            int r0 = r2.length
            writeUInt8(r1, r0)
            r1.put(r2)
            return
    }

    public static void writeUInt16(java.nio.ByteBuffer r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r0 = r2 >> 8
            writeUInt8(r1, r0)
            r2 = r2 & 255(0xff, float:3.57E-43)
            writeUInt8(r1, r2)
            return
    }

    public static void writeUInt16BE(java.nio.ByteBuffer r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            r0 = r2 & 255(0xff, float:3.57E-43)
            writeUInt8(r1, r0)
            int r2 = r2 >> 8
            writeUInt8(r1, r2)
            return
    }

    public static void writeUInt24(java.nio.ByteBuffer r1, int r2) {
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            int r0 = r2 >> 8
            writeUInt16(r1, r0)
            writeUInt8(r1, r2)
            return
    }

    public static void writeUInt32(java.nio.ByteBuffer r0, long r1) {
            int r2 = (int) r1
            r0.putInt(r2)
            return
    }

    public static void writeUInt32BE(java.nio.ByteBuffer r2, long r3) {
            int r0 = (int) r3
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            writeUInt16BE(r2, r0)
            r0 = 16
            long r3 = r3 >> r0
            r0 = 65535(0xffff, double:3.23786E-319)
            long r3 = r3 & r0
            int r4 = (int) r3
            writeUInt16BE(r2, r4)
            return
    }

    public static void writeUInt48(java.nio.ByteBuffer r2, long r3) {
            r0 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            long r3 = r3 & r0
            r0 = 32
            long r0 = r3 >> r0
            int r1 = (int) r0
            writeUInt16(r2, r1)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            writeUInt32(r2, r3)
            return
    }

    public static void writeUInt64(java.nio.ByteBuffer r0, long r1) {
            r0.putLong(r1)
            return
    }

    public static void writeUInt8(java.nio.ByteBuffer r0, int r1) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r0.put(r1)
            return
    }

    public static void writeUtf8String(java.nio.ByteBuffer r0, java.lang.String r1) {
            byte[] r1 = com.coremedia.iso.Utf8.convert(r1)
            r0.put(r1)
            r1 = 0
            writeUInt8(r0, r1)
            return
    }

    public static void writeZeroTermUtf8String(java.nio.ByteBuffer r0, java.lang.String r1) {
            byte[] r1 = com.coremedia.iso.Utf8.convert(r1)
            r0.put(r1)
            r1 = 0
            writeUInt8(r0, r1)
            return
    }
}
