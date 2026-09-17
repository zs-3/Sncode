package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class UBJsonReader implements com.badlogic.gdx.utils.BaseJsonReader {
    public boolean oldFormat;

    public UBJsonReader() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.oldFormat = r0
            return
    }

    @Override // com.badlogic.gdx.utils.BaseJsonReader
    public com.badlogic.gdx.utils.JsonValue parse(com.badlogic.gdx.files.FileHandle r5) {
            r4 = this;
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r0 = r5.read(r0)     // Catch: java.lang.Exception -> Lb
            com.badlogic.gdx.utils.JsonValue r5 = r4.parse(r0)     // Catch: java.lang.Exception -> Lb
            return r5
        Lb:
            r0 = move-exception
            com.badlogic.gdx.utils.SerializationException r1 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error parsing file: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    public com.badlogic.gdx.utils.JsonValue parse(java.io.DataInputStream r2) throws java.io.IOException {
            r1 = this;
            byte r0 = r2.readByte()     // Catch: java.lang.Throwable -> Lc
            com.badlogic.gdx.utils.JsonValue r0 = r1.parse(r2, r0)     // Catch: java.lang.Throwable -> Lc
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r2)
            return r0
        Lc:
            r0 = move-exception
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r2)
            throw r0
    }

    protected com.badlogic.gdx.utils.JsonValue parse(java.io.DataInputStream r3, byte r4) throws java.io.IOException {
            r2 = this;
            r0 = 91
            if (r4 != r0) goto L9
            com.badlogic.gdx.utils.JsonValue r3 = r2.parseArray(r3)
            return r3
        L9:
            r0 = 123(0x7b, float:1.72E-43)
            if (r4 != r0) goto L12
            com.badlogic.gdx.utils.JsonValue r3 = r2.parseObject(r3)
            return r3
        L12:
            r0 = 90
            if (r4 != r0) goto L1e
            com.badlogic.gdx.utils.JsonValue r3 = new com.badlogic.gdx.utils.JsonValue
            com.badlogic.gdx.utils.JsonValue$ValueType r4 = com.badlogic.gdx.utils.JsonValue.ValueType.nullValue
            r3.<init>(r4)
            return r3
        L1e:
            r0 = 84
            if (r4 != r0) goto L29
            com.badlogic.gdx.utils.JsonValue r3 = new com.badlogic.gdx.utils.JsonValue
            r4 = 1
            r3.<init>(r4)
            return r3
        L29:
            r0 = 70
            if (r4 != r0) goto L34
            com.badlogic.gdx.utils.JsonValue r3 = new com.badlogic.gdx.utils.JsonValue
            r4 = 0
            r3.<init>(r4)
            return r3
        L34:
            r0 = 66
            if (r4 != r0) goto L43
            com.badlogic.gdx.utils.JsonValue r4 = new com.badlogic.gdx.utils.JsonValue
            short r3 = r2.readUChar(r3)
            long r0 = (long) r3
            r4.<init>(r0)
            return r4
        L43:
            r0 = 85
            if (r4 != r0) goto L52
            com.badlogic.gdx.utils.JsonValue r4 = new com.badlogic.gdx.utils.JsonValue
            short r3 = r2.readUChar(r3)
            long r0 = (long) r3
            r4.<init>(r0)
            return r4
        L52:
            r0 = 105(0x69, float:1.47E-43)
            if (r4 != r0) goto L6a
            com.badlogic.gdx.utils.JsonValue r4 = new com.badlogic.gdx.utils.JsonValue
            boolean r0 = r2.oldFormat
            if (r0 == 0) goto L61
            short r3 = r3.readShort()
            goto L65
        L61:
            byte r3 = r3.readByte()
        L65:
            long r0 = (long) r3
            r4.<init>(r0)
            return r4
        L6a:
            r0 = 73
            if (r4 != r0) goto L82
            com.badlogic.gdx.utils.JsonValue r4 = new com.badlogic.gdx.utils.JsonValue
            boolean r0 = r2.oldFormat
            if (r0 == 0) goto L79
            int r3 = r3.readInt()
            goto L7d
        L79:
            short r3 = r3.readShort()
        L7d:
            long r0 = (long) r3
            r4.<init>(r0)
            return r4
        L82:
            r0 = 108(0x6c, float:1.51E-43)
            if (r4 != r0) goto L91
            com.badlogic.gdx.utils.JsonValue r4 = new com.badlogic.gdx.utils.JsonValue
            int r3 = r3.readInt()
            long r0 = (long) r3
            r4.<init>(r0)
            return r4
        L91:
            r0 = 76
            if (r4 != r0) goto L9f
            com.badlogic.gdx.utils.JsonValue r4 = new com.badlogic.gdx.utils.JsonValue
            long r0 = r3.readLong()
            r4.<init>(r0)
            return r4
        L9f:
            r0 = 100
            if (r4 != r0) goto Lae
            com.badlogic.gdx.utils.JsonValue r4 = new com.badlogic.gdx.utils.JsonValue
            float r3 = r3.readFloat()
            double r0 = (double) r3
            r4.<init>(r0)
            return r4
        Lae:
            r0 = 68
            if (r4 != r0) goto Lbc
            com.badlogic.gdx.utils.JsonValue r4 = new com.badlogic.gdx.utils.JsonValue
            double r0 = r3.readDouble()
            r4.<init>(r0)
            return r4
        Lbc:
            r0 = 115(0x73, float:1.61E-43)
            if (r4 == r0) goto Lea
            r0 = 83
            if (r4 != r0) goto Lc5
            goto Lea
        Lc5:
            r0 = 97
            if (r4 == r0) goto Le5
            r0 = 65
            if (r4 != r0) goto Lce
            goto Le5
        Lce:
            r0 = 67
            if (r4 != r0) goto Ldd
            com.badlogic.gdx.utils.JsonValue r4 = new com.badlogic.gdx.utils.JsonValue
            char r3 = r3.readChar()
            long r0 = (long) r3
            r4.<init>(r0)
            return r4
        Ldd:
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r4 = "Unrecognized data type"
            r3.<init>(r4)
            throw r3
        Le5:
            com.badlogic.gdx.utils.JsonValue r3 = r2.parseData(r3, r4)
            return r3
        Lea:
            com.badlogic.gdx.utils.JsonValue r0 = new com.badlogic.gdx.utils.JsonValue
            java.lang.String r3 = r2.parseString(r3, r4)
            r0.<init>(r3)
            return r0
    }

    public com.badlogic.gdx.utils.JsonValue parse(java.io.InputStream r3) {
            r2 = this;
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L16
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L16
            com.badlogic.gdx.utils.JsonValue r3 = r2.parse(r1)     // Catch: java.lang.Throwable -> Le java.io.IOException -> L11
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r1)
            return r3
        Le:
            r3 = move-exception
            r0 = r1
            goto L1d
        L11:
            r3 = move-exception
            r0 = r1
            goto L17
        L14:
            r3 = move-exception
            goto L1d
        L16:
            r3 = move-exception
        L17:
            com.badlogic.gdx.utils.SerializationException r1 = new com.badlogic.gdx.utils.SerializationException     // Catch: java.lang.Throwable -> L14
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L1d:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            throw r3
    }

    protected com.badlogic.gdx.utils.JsonValue parseArray(java.io.DataInputStream r15) throws java.io.IOException {
            r14 = this;
            com.badlogic.gdx.utils.JsonValue r0 = new com.badlogic.gdx.utils.JsonValue
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.array
            r0.<init>(r1)
            byte r1 = r15.readByte()
            r2 = 0
            r3 = 36
            if (r1 != r3) goto L1c
            byte r1 = r15.readByte()
            byte r3 = r15.readByte()
            r13 = r3
            r3 = r1
            r1 = r13
            goto L1d
        L1c:
            r3 = 0
        L1d:
            r4 = 35
            r5 = -1
            r7 = 0
            if (r1 != r4) goto L41
            long r5 = r14.parseSize(r15, r2, r5)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L39
            if (r1 != 0) goto L30
            return r0
        L30:
            if (r3 != 0) goto L37
            byte r1 = r15.readByte()
            goto L41
        L37:
            r1 = r3
            goto L41
        L39:
            com.badlogic.gdx.utils.GdxRuntimeException r15 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Unrecognized data type"
            r15.<init>(r0)
            throw r15
        L41:
            r2 = 0
            r9 = r7
        L43:
            int r4 = r15.available()
            if (r4 <= 0) goto L7c
            r4 = 93
            if (r1 == r4) goto L7c
            com.badlogic.gdx.utils.JsonValue r1 = r14.parse(r15, r1)
            r1.parent = r0
            r4 = 1
            if (r2 == 0) goto L60
            r1.prev = r2
            r2.next = r1
            int r2 = r0.size
            int r2 = r2 + r4
            r0.size = r2
            goto L64
        L60:
            r0.child = r1
            r0.size = r4
        L64:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L70
            r11 = 1
            long r9 = r9 + r11
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 < 0) goto L70
            goto L7c
        L70:
            if (r3 != 0) goto L77
            byte r2 = r15.readByte()
            goto L78
        L77:
            r2 = r3
        L78:
            r13 = r2
            r2 = r1
            r1 = r13
            goto L43
        L7c:
            return r0
    }

    protected com.badlogic.gdx.utils.JsonValue parseData(java.io.DataInputStream r10, byte r11) throws java.io.IOException {
            r9 = this;
            byte r0 = r10.readByte()
            r1 = 65
            if (r11 != r1) goto Ld
            long r1 = r9.readUInt(r10)
            goto L12
        Ld:
            short r11 = r9.readUChar(r10)
            long r1 = (long) r11
        L12:
            com.badlogic.gdx.utils.JsonValue r11 = new com.badlogic.gdx.utils.JsonValue
            com.badlogic.gdx.utils.JsonValue$ValueType r3 = com.badlogic.gdx.utils.JsonValue.ValueType.array
            r11.<init>(r3)
            r3 = 0
            r4 = 0
        L1c:
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 >= 0) goto L3a
            com.badlogic.gdx.utils.JsonValue r6 = r9.parse(r10, r0)
            r6.parent = r11
            r7 = 1
            if (r3 == 0) goto L31
            r3.next = r6
            int r3 = r11.size
            int r3 = r3 + r7
            r11.size = r3
            goto L35
        L31:
            r11.child = r6
            r11.size = r7
        L35:
            r7 = 1
            long r4 = r4 + r7
            r3 = r6
            goto L1c
        L3a:
            return r11
    }

    protected com.badlogic.gdx.utils.JsonValue parseObject(java.io.DataInputStream r14) throws java.io.IOException {
            r13 = this;
            com.badlogic.gdx.utils.JsonValue r0 = new com.badlogic.gdx.utils.JsonValue
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.object
            r0.<init>(r1)
            byte r1 = r14.readByte()
            r2 = 0
            r3 = 36
            if (r1 != r3) goto L1c
            byte r1 = r14.readByte()
            byte r3 = r14.readByte()
            r12 = r3
            r3 = r1
            r1 = r12
            goto L1d
        L1c:
            r3 = 0
        L1d:
            r4 = 35
            r5 = -1
            r7 = 0
            if (r1 != r4) goto L3d
            long r5 = r13.parseSize(r14, r2, r5)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L35
            if (r1 != 0) goto L30
            return r0
        L30:
            byte r1 = r14.readByte()
            goto L3d
        L35:
            com.badlogic.gdx.utils.GdxRuntimeException r14 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r0 = "Unrecognized data type"
            r14.<init>(r0)
            throw r14
        L3d:
            r2 = 0
            r9 = r7
        L3f:
            int r4 = r14.available()
            if (r4 <= 0) goto L81
            r4 = 125(0x7d, float:1.75E-43)
            if (r1 == r4) goto L81
            r4 = 1
            java.lang.String r1 = r13.parseString(r14, r4, r1)
            if (r3 != 0) goto L55
            byte r11 = r14.readByte()
            goto L56
        L55:
            r11 = r3
        L56:
            com.badlogic.gdx.utils.JsonValue r11 = r13.parse(r14, r11)
            r11.setName(r1)
            r11.parent = r0
            if (r2 == 0) goto L6b
            r11.prev = r2
            r2.next = r11
            int r1 = r0.size
            int r1 = r1 + r4
            r0.size = r1
            goto L6f
        L6b:
            r0.child = r11
            r0.size = r4
        L6f:
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L7b
            r1 = 1
            long r9 = r9 + r1
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L7b
            goto L81
        L7b:
            byte r1 = r14.readByte()
            r2 = r11
            goto L3f
        L81:
            return r0
    }

    protected long parseSize(java.io.DataInputStream r2, byte r3, boolean r4, long r5) throws java.io.IOException {
            r1 = this;
            r0 = 105(0x69, float:1.47E-43)
            if (r3 != r0) goto La
            short r2 = r1.readUChar(r2)
            long r2 = (long) r2
            return r2
        La:
            r0 = 73
            if (r3 != r0) goto L14
            int r2 = r1.readUShort(r2)
            long r2 = (long) r2
            return r2
        L14:
            r0 = 108(0x6c, float:1.51E-43)
            if (r3 != r0) goto L1d
            long r2 = r1.readUInt(r2)
            return r2
        L1d:
            r0 = 76
            if (r3 != r0) goto L26
            long r2 = r2.readLong()
            return r2
        L26:
            if (r4 == 0) goto L52
            short r3 = (short) r3
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            r5 = 24
            long r3 = r3 << r5
            byte r5 = r2.readByte()
            short r5 = (short) r5
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r0 = 16
            long r5 = r5 << r0
            long r3 = r3 | r5
            byte r5 = r2.readByte()
            short r5 = (short) r5
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r0 = 8
            long r5 = r5 << r0
            long r3 = r3 | r5
            byte r2 = r2.readByte()
            short r2 = (short) r2
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r5 = (long) r2
            long r2 = r3 | r5
            return r2
        L52:
            return r5
    }

    protected long parseSize(java.io.DataInputStream r7, boolean r8, long r9) throws java.io.IOException {
            r6 = this;
            byte r2 = r7.readByte()
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            long r7 = r0.parseSize(r1, r2, r3, r4)
            return r7
    }

    protected java.lang.String parseString(java.io.DataInputStream r2, byte r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.parseString(r2, r0, r3)
            return r2
    }

    protected java.lang.String parseString(java.io.DataInputStream r9, boolean r10, byte r11) throws java.io.IOException {
            r8 = this;
            r0 = -1
            r2 = 83
            if (r11 != r2) goto Lc
            r10 = 1
            long r0 = r8.parseSize(r9, r10, r0)
            goto L22
        Lc:
            r2 = 115(0x73, float:1.61E-43)
            if (r11 != r2) goto L16
            short r10 = r8.readUChar(r9)
            long r0 = (long) r10
            goto L22
        L16:
            if (r10 == 0) goto L22
            r5 = 0
            r6 = -1
            r2 = r8
            r3 = r9
            r4 = r11
            long r0 = r2.parseSize(r3, r4, r5, r6)
        L22:
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 < 0) goto L32
            if (r2 <= 0) goto L2f
            java.lang.String r9 = r8.readString(r9, r0)
            goto L31
        L2f:
            java.lang.String r9 = ""
        L31:
            return r9
        L32:
            com.badlogic.gdx.utils.GdxRuntimeException r9 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r10 = "Unrecognized data type, string expected"
            r9.<init>(r10)
            throw r9
    }

    protected java.lang.String readString(java.io.DataInputStream r1, long r2) throws java.io.IOException {
            r0 = this;
            int r3 = (int) r2
            byte[] r2 = new byte[r3]
            r1.readFully(r2)
            java.lang.String r1 = new java.lang.String
            java.lang.String r3 = "UTF-8"
            r1.<init>(r2, r3)
            return r1
    }

    protected short readUChar(java.io.DataInputStream r1) throws java.io.IOException {
            r0 = this;
            byte r1 = r1.readByte()
            short r1 = (short) r1
            r1 = r1 & 255(0xff, float:3.57E-43)
            short r1 = (short) r1
            return r1
    }

    protected long readUInt(java.io.DataInputStream r5) throws java.io.IOException {
            r4 = this;
            int r5 = r5.readInt()
            long r0 = (long) r5
            r2 = -1
            long r0 = r0 & r2
            return r0
    }

    protected int readUShort(java.io.DataInputStream r2) throws java.io.IOException {
            r1 = this;
            short r2 = r2.readShort()
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            return r2
    }
}
