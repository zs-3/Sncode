package org.fortheloss.sticknodes;

/* loaded from: classes2.dex */
public class WaveHeader {
    private short mBitsPerSample;
    private short mFormat;
    private int mNumBytes;
    private short mNumChannels;
    private int mSampleRate;

    public WaveHeader(short r1, short r2, int r3, short r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.mFormat = r1
            r0.mSampleRate = r3
            r0.mNumChannels = r2
            r0.mBitsPerSample = r4
            r0.mNumBytes = r5
            return
    }

    private static void writeId(java.io.OutputStream r2, java.lang.String r3) throws java.io.IOException {
            r0 = 0
        L1:
            int r1 = r3.length()
            if (r0 >= r1) goto L11
            char r1 = r3.charAt(r0)
            r2.write(r1)
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    private static void writeInt(java.io.OutputStream r1, int r2) throws java.io.IOException {
            int r0 = r2 >> 0
            r1.write(r0)
            int r0 = r2 >> 8
            r1.write(r0)
            int r0 = r2 >> 16
            r1.write(r0)
            int r2 = r2 >> 24
            r1.write(r2)
            return
    }

    private static void writeShort(java.io.OutputStream r1, short r2) throws java.io.IOException {
            int r0 = r2 >> 0
            r1.write(r0)
            int r2 = r2 >> 8
            r1.write(r2)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            short r1 = r3.mFormat
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            short r1 = r3.mNumChannels
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.mSampleRate
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            short r1 = r3.mBitsPerSample
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r1 = r3.mNumBytes
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = "WaveHeader format=%d numChannels=%d sampleRate=%d bitsPerSample=%d numBytes=%d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    public int write(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "RIFF"
            writeId(r3, r0)
            int r0 = r2.mNumBytes
            int r0 = r0 + 36
            writeInt(r3, r0)
            java.lang.String r0 = "WAVE"
            writeId(r3, r0)
            java.lang.String r0 = "fmt "
            writeId(r3, r0)
            r0 = 16
            writeInt(r3, r0)
            short r0 = r2.mFormat
            writeShort(r3, r0)
            short r0 = r2.mNumChannels
            writeShort(r3, r0)
            int r0 = r2.mSampleRate
            writeInt(r3, r0)
            short r0 = r2.mNumChannels
            int r1 = r2.mSampleRate
            int r0 = r0 * r1
            short r1 = r2.mBitsPerSample
            int r0 = r0 * r1
            int r0 = r0 / 8
            writeInt(r3, r0)
            short r0 = r2.mNumChannels
            short r1 = r2.mBitsPerSample
            int r0 = r0 * r1
            int r0 = r0 / 8
            short r0 = (short) r0
            writeShort(r3, r0)
            short r0 = r2.mBitsPerSample
            writeShort(r3, r0)
            java.lang.String r0 = "data"
            writeId(r3, r0)
            int r0 = r2.mNumBytes
            writeInt(r3, r0)
            r3 = 44
            return r3
    }
}
