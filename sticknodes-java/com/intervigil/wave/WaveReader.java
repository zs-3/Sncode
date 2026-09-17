package com.intervigil.wave;

/* loaded from: classes2.dex */
public class WaveReader {
    private java.io.File mInFile;
    private java.io.BufferedInputStream mInStream;

    public WaveReader(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.mInFile = r1
            return
    }

    private static int readUnsignedInt(java.io.BufferedInputStream r2) throws java.io.IOException {
            r0 = 4
            byte[] r0 = new byte[r0]
            int r2 = r2.read(r0)
            r1 = -1
            if (r2 != r1) goto Lb
            return r1
        Lb:
            r2 = 0
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r1 = 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r2 = r2 | r1
            r1 = 2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r2 = r2 | r1
            r1 = 3
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    private static int readUnsignedIntLE(java.io.BufferedInputStream r2) throws java.io.IOException {
            r0 = 4
            byte[] r0 = new byte[r0]
            int r2 = r2.read(r0)
            r1 = -1
            if (r2 != r1) goto Lb
            return r1
        Lb:
            r2 = 0
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1 = 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r2 = r2 | r1
            r1 = 2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r2 = r2 | r1
            r1 = 3
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r2 = r2 | r0
            return r2
    }

    public void closeWaveFile() throws java.io.IOException {
            r1 = this;
            java.io.BufferedInputStream r0 = r1.mInStream
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }

    public byte[] openWave() throws java.io.FileNotFoundException, com.intervigil.wave.exception.InvalidWaveException, java.io.IOException {
            r4 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r4.mInFile
            r0.<init>(r1)
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r2 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r0, r2)
            r4.mInStream = r1
            r2 = 12
            r1.skip(r2)
        L15:
            java.io.BufferedInputStream r0 = r4.mInStream
            int r0 = readUnsignedInt(r0)
            r1 = -1
            if (r0 != r1) goto L20
            r0 = 0
            return r0
        L20:
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            if (r0 != r1) goto L34
            java.io.BufferedInputStream r0 = r4.mInStream
            int r0 = readUnsignedIntLE(r0)
            byte[] r1 = new byte[r0]
            java.io.BufferedInputStream r2 = r4.mInStream
            r3 = 0
            r2.read(r1, r3, r0)
            return r1
        L34:
            java.io.BufferedInputStream r0 = r4.mInStream
            int r0 = readUnsignedIntLE(r0)
            java.io.BufferedInputStream r1 = r4.mInStream
            long r2 = (long) r0
            r1.skip(r2)
            goto L15
    }
}
