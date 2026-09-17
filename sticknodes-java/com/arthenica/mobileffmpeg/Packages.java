package com.arthenica.mobileffmpeg;

/* loaded from: classes.dex */
class Packages {
    private static final java.util.List<java.lang.String> supportedExternalLibraries = null;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.arthenica.mobileffmpeg.Packages.supportedExternalLibraries = r0
            java.lang.String r1 = "fontconfig"
            r0.add(r1)
            java.lang.String r1 = "freetype"
            r0.add(r1)
            java.lang.String r1 = "fribidi"
            r0.add(r1)
            java.lang.String r1 = "gmp"
            r0.add(r1)
            java.lang.String r1 = "gnutls"
            r0.add(r1)
            java.lang.String r1 = "kvazaar"
            r0.add(r1)
            java.lang.String r1 = "mp3lame"
            r0.add(r1)
            java.lang.String r1 = "libaom"
            r0.add(r1)
            java.lang.String r1 = "libass"
            r0.add(r1)
            java.lang.String r1 = "iconv"
            r0.add(r1)
            java.lang.String r1 = "libilbc"
            r0.add(r1)
            java.lang.String r1 = "libtheora"
            r0.add(r1)
            java.lang.String r1 = "libvidstab"
            r0.add(r1)
            java.lang.String r1 = "libvorbis"
            r0.add(r1)
            java.lang.String r1 = "libvpx"
            r0.add(r1)
            java.lang.String r1 = "libwebp"
            r0.add(r1)
            java.lang.String r1 = "libxml2"
            r0.add(r1)
            java.lang.String r1 = "opencore-amr"
            r0.add(r1)
            java.lang.String r1 = "openh264"
            r0.add(r1)
            java.lang.String r1 = "opus"
            r0.add(r1)
            java.lang.String r1 = "rubberband"
            r0.add(r1)
            java.lang.String r1 = "sdl2"
            r0.add(r1)
            java.lang.String r1 = "shine"
            r0.add(r1)
            java.lang.String r1 = "snappy"
            r0.add(r1)
            java.lang.String r1 = "soxr"
            r0.add(r1)
            java.lang.String r1 = "speex"
            r0.add(r1)
            java.lang.String r1 = "tesseract"
            r0.add(r1)
            java.lang.String r1 = "twolame"
            r0.add(r1)
            java.lang.String r1 = "wavpack"
            r0.add(r1)
            java.lang.String r1 = "x264"
            r0.add(r1)
            java.lang.String r1 = "x265"
            r0.add(r1)
            java.lang.String r1 = "xvid"
            r0.add(r1)
            return
    }

    static java.util.List<java.lang.String> getExternalLibraries() {
            java.lang.String r0 = com.arthenica.mobileffmpeg.AbiDetect.getNativeBuildConf()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<java.lang.String> r2 = com.arthenica.mobileffmpeg.Packages.supportedExternalLibraries
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "enable-"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L49
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "enable-lib"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lf
        L49:
            r1.add(r3)
            goto Lf
        L4d:
            java.util.Collections.sort(r1)
            return r1
    }

    static java.lang.String getPackageName() {
            java.util.List r0 = getExternalLibraries()
            java.lang.String r1 = "speex"
            boolean r2 = r0.contains(r1)
            java.lang.String r3 = "fribidi"
            boolean r4 = r0.contains(r3)
            java.lang.String r5 = "gnutls"
            boolean r6 = r0.contains(r5)
            java.lang.String r7 = "xvid"
            boolean r8 = r0.contains(r7)
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L30
            if (r4 == 0) goto L30
            if (r8 == 0) goto L29
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            goto L37
        L29:
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 1
            goto L37
        L30:
            if (r2 == 0) goto L39
            r2 = 0
            r4 = 1
        L34:
            r6 = 0
        L35:
            r8 = 0
        L36:
            r9 = 0
        L37:
            r11 = 0
            goto L54
        L39:
            if (r4 == 0) goto L3e
            r2 = 1
            r4 = 0
            goto L34
        L3e:
            if (r8 == 0) goto L4d
            if (r6 == 0) goto L46
            r2 = 0
            r4 = 0
            r6 = 1
            goto L35
        L46:
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 1
            goto L54
        L4d:
            r2 = 0
            r4 = 0
            if (r6 == 0) goto L34
            r6 = 0
            r8 = 1
            goto L36
        L54:
            java.lang.String r12 = "shine"
            java.lang.String r13 = "x265"
            java.lang.String r14 = "libass"
            java.lang.String r15 = "opus"
            r16 = r11
            java.lang.String r11 = "x264"
            r17 = r8
            java.lang.String r8 = "libaom"
            r18 = r6
            java.lang.String r6 = "opencore-amr"
            r19 = r4
            java.lang.String r4 = "libvidstab"
            r20 = r2
            java.lang.String r2 = "kvazaar"
            r21 = r10
            java.lang.String r10 = "libvorbis"
            r22 = r7
            java.lang.String r7 = "libilbc"
            r23 = r13
            java.lang.String r13 = "mp3lame"
            r24 = r11
            java.lang.String r11 = "freetype"
            r25 = r1
            java.lang.String r1 = "fontconfig"
            r26 = r12
            java.lang.String r12 = "gmp"
            java.lang.String r27 = "custom"
            if (r9 == 0) goto L154
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r11)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r5)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r13)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r8)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r14)
            if (r1 == 0) goto L153
            java.lang.String r1 = "iconv"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r7)
            if (r1 == 0) goto L153
            java.lang.String r1 = "libtheora"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r10)
            if (r1 == 0) goto L153
            java.lang.String r1 = "libvpx"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            java.lang.String r1 = "libwebp"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            java.lang.String r1 = "libxml2"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r6)
            if (r1 == 0) goto L153
            boolean r1 = r0.contains(r15)
            if (r1 == 0) goto L153
            r9 = r26
            boolean r1 = r0.contains(r9)
            if (r1 == 0) goto L153
            java.lang.String r1 = "snappy"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            java.lang.String r1 = "soxr"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            r1 = r25
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            java.lang.String r1 = "twolame"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            java.lang.String r1 = "wavpack"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            r1 = r24
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            r1 = r23
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L153
            r1 = r22
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L153
            java.lang.String r0 = "full-gpl"
            return r0
        L153:
            return r27
        L154:
            r30 = r22
            r28 = r23
            r29 = r24
            r9 = r26
            r22 = r4
            r4 = r25
            if (r21 == 0) goto L208
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r11)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r5)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r13)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r8)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r14)
            if (r1 == 0) goto L207
            java.lang.String r1 = "iconv"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r7)
            if (r1 == 0) goto L207
            java.lang.String r1 = "libtheora"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r10)
            if (r1 == 0) goto L207
            java.lang.String r1 = "libvpx"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L207
            java.lang.String r1 = "libwebp"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L207
            java.lang.String r1 = "libxml2"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r6)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r15)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r9)
            if (r1 == 0) goto L207
            java.lang.String r1 = "snappy"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L207
            java.lang.String r1 = "soxr"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L207
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L207
            java.lang.String r1 = "twolame"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L207
            java.lang.String r1 = "wavpack"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L207
            java.lang.String r0 = "full"
            return r0
        L207:
            return r27
        L208:
            if (r20 == 0) goto L25a
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L259
            boolean r1 = r0.contains(r11)
            if (r1 == 0) goto L259
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L259
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L259
            boolean r1 = r0.contains(r8)
            if (r1 == 0) goto L259
            boolean r1 = r0.contains(r14)
            if (r1 == 0) goto L259
            java.lang.String r1 = "iconv"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L259
            java.lang.String r1 = "libtheora"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L259
            java.lang.String r1 = "libvpx"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L259
            java.lang.String r1 = "libwebp"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L259
            java.lang.String r1 = "snappy"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L259
            java.lang.String r0 = "video"
            return r0
        L259:
            return r27
        L25a:
            if (r19 == 0) goto L2a2
            boolean r1 = r0.contains(r13)
            if (r1 == 0) goto L2a1
            boolean r1 = r0.contains(r7)
            if (r1 == 0) goto L2a1
            boolean r1 = r0.contains(r10)
            if (r1 == 0) goto L2a1
            boolean r1 = r0.contains(r6)
            if (r1 == 0) goto L2a1
            boolean r1 = r0.contains(r15)
            if (r1 == 0) goto L2a1
            boolean r1 = r0.contains(r9)
            if (r1 == 0) goto L2a1
            java.lang.String r1 = "soxr"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L2a1
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L2a1
            java.lang.String r1 = "twolame"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L2a1
            java.lang.String r1 = "wavpack"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2a1
            java.lang.String r0 = "audio"
            return r0
        L2a1:
            return r27
        L2a2:
            if (r18 == 0) goto L2d4
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L2d3
            boolean r1 = r0.contains(r5)
            if (r1 == 0) goto L2d3
            r1 = r22
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L2d3
            r2 = r29
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L2d3
            r3 = r28
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L2d3
            r4 = r30
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L2d3
            java.lang.String r0 = "https-gpl"
            return r0
        L2d3:
            return r27
        L2d4:
            r1 = r22
            r3 = r28
            r2 = r29
            r4 = r30
            if (r17 == 0) goto L2ee
            boolean r1 = r0.contains(r12)
            if (r1 == 0) goto L2ed
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L2ed
            java.lang.String r0 = "https"
            return r0
        L2ed:
            return r27
        L2ee:
            if (r16 == 0) goto L30c
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L30b
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L30b
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L30b
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L30b
            java.lang.String r0 = "min-gpl"
            return r0
        L30b:
            return r27
        L30c:
            int r0 = r0.size()
            if (r0 != 0) goto L315
            java.lang.String r0 = "min"
            return r0
        L315:
            return r27
    }
}
