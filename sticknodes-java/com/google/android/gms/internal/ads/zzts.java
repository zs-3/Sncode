package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@android.annotation.SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class zzts {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.regex.Pattern zzb = null;
    private static final java.util.HashMap zzc = null;

    static {
            java.lang.String r0 = "^\\D?(\\d+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzts.zzb = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.zzts.zzc = r0
            return
    }

    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzaf r19) {
            r0 = r19
            java.lang.String r1 = r0.zzj
            if (r1 != 0) goto L9
        L6:
            r2 = 0
            goto L5a6
        L9:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = r0.zzn
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            r5 = 1024(0x400, float:1.435E-42)
            r6 = 512(0x200, float:7.175E-43)
            r7 = 256(0x100, float:3.59E-43)
            r8 = 128(0x80, float:1.794E-43)
            r9 = 64
            r10 = 32
            r12 = 8
            r13 = 3
            r14 = 16
            r15 = 4
            r2 = 2
            java.lang.String r4 = "MediaCodecUtil"
            r11 = 1
            if (r3 == 0) goto L1f0
            java.lang.String r0 = r0.zzj
            int r3 = r1.length
            if (r3 >= r13) goto L42
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L42:
            java.util.regex.Pattern r3 = com.google.android.gms.internal.ads.zzts.zzb
            r13 = r1[r11]
            java.util.regex.Matcher r3 = r3.matcher(r13)
            boolean r13 = r3.matches()
            if (r13 != 0) goto L5e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L5e:
            java.lang.String r0 = r3.group(r11)
            if (r0 != 0) goto L67
        L64:
            r3 = 0
            goto L104
        L67:
            int r3 = r0.hashCode()
            r13 = 1567(0x61f, float:2.196E-42)
            if (r3 == r13) goto Lf8
            switch(r3) {
                case 1536: goto Leb;
                case 1537: goto Lde;
                case 1538: goto Ld1;
                case 1539: goto Lc4;
                case 1540: goto Lb7;
                case 1541: goto Laa;
                case 1542: goto L9d;
                case 1543: goto L8f;
                case 1544: goto L81;
                case 1545: goto L73;
                default: goto L72;
            }
        L72:
            goto L64
        L73:
            java.lang.String r3 = "09"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            goto L104
        L81:
            java.lang.String r3 = "08"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            goto L104
        L8f:
            java.lang.String r3 = "07"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L104
        L9d:
            java.lang.String r3 = "06"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            goto L104
        Laa:
            java.lang.String r3 = "05"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            goto L104
        Lb7:
            java.lang.String r3 = "04"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            goto L104
        Lc4:
            java.lang.String r3 = "03"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            goto L104
        Ld1:
            java.lang.String r3 = "02"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            goto L104
        Lde:
            java.lang.String r3 = "01"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            goto L104
        Leb:
            java.lang.String r3 = "00"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            goto L104
        Lf8:
            java.lang.String r3 = "10"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
        L104:
            if (r3 != 0) goto L115
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L115:
            r0 = r1[r2]
            if (r0 != 0) goto L11c
        L119:
            r1 = 0
            goto L1d8
        L11c:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1537: goto L1cc;
                case 1538: goto L1bf;
                case 1539: goto L1b2;
                case 1540: goto L1a5;
                case 1541: goto L198;
                case 1542: goto L18b;
                case 1543: goto L17e;
                case 1544: goto L171;
                case 1545: goto L163;
                default: goto L123;
            }
        L123:
            switch(r1) {
                case 1567: goto L155;
                case 1568: goto L147;
                case 1569: goto L137;
                case 1570: goto L127;
                default: goto L126;
            }
        L126:
            goto L119
        L127:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            r16 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            goto L1d8
        L137:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            r17 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            goto L1d8
        L147:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L1d8
        L155:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            goto L1d8
        L163:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L1d8
        L171:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L1d8
        L17e:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L1d8
        L18b:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L1d8
        L198:
            java.lang.String r1 = "05"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L1d8
        L1a5:
            java.lang.String r1 = "04"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            goto L1d8
        L1b2:
            java.lang.String r1 = "03"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            goto L1d8
        L1bf:
            java.lang.String r1 = "02"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L1d8
        L1cc:
            java.lang.String r1 = "01"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L119
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
        L1d8:
            if (r1 != 0) goto L1e9
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L1e9:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r3, r1)
            goto L5a6
        L1f0:
            r16 = 4096(0x1000, float:5.74E-42)
            r17 = 2048(0x800, float:2.87E-42)
            r3 = 0
            r5 = r1[r3]
            int r18 = r5.hashCode()
            r6 = 6
            r7 = -1
            switch(r18) {
                case 3004662: goto L23d;
                case 3006243: goto L233;
                case 3006244: goto L229;
                case 3199032: goto L21f;
                case 3214780: goto L215;
                case 3356560: goto L20b;
                case 3624515: goto L201;
                default: goto L200;
            }
        L200:
            goto L247
        L201:
            java.lang.String r8 = "vp09"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L247
            r5 = 2
            goto L248
        L20b:
            java.lang.String r8 = "mp4a"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L247
            r5 = 6
            goto L248
        L215:
            java.lang.String r8 = "hvc1"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L247
            r5 = 4
            goto L248
        L21f:
            java.lang.String r8 = "hev1"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L247
            r5 = 3
            goto L248
        L229:
            java.lang.String r8 = "avc2"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L247
            r5 = 1
            goto L248
        L233:
            java.lang.String r8 = "avc1"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L247
            r5 = 0
            goto L248
        L23d:
            java.lang.String r8 = "av01"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L247
            r5 = 5
            goto L248
        L247:
            r5 = -1
        L248:
            r8 = 20
            switch(r5) {
                case 0: goto L49b;
                case 1: goto L49b;
                case 2: goto L3ce;
                case 3: goto L3c5;
                case 4: goto L3c5;
                case 5: goto L2d2;
                case 6: goto L24f;
                default: goto L24d;
            }
        L24d:
            goto L6
        L24f:
            java.lang.String r0 = r0.zzj
            int r5 = r1.length
            if (r5 == r13) goto L263
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L263:
            r5 = r1[r11]     // Catch: java.lang.NumberFormatException -> L2c3
            int r5 = java.lang.Integer.parseInt(r5, r14)     // Catch: java.lang.NumberFormatException -> L2c3
            java.lang.String r5 = com.google.android.gms.internal.ads.zzbn.zzd(r5)     // Catch: java.lang.NumberFormatException -> L2c3
            java.lang.String r9 = "audio/mp4a-latm"
            boolean r5 = r9.equals(r5)     // Catch: java.lang.NumberFormatException -> L2c3
            if (r5 == 0) goto L6
            r1 = r1[r2]     // Catch: java.lang.NumberFormatException -> L2c3
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L2c3
            r5 = 17
            if (r1 == r5) goto L2af
            if (r1 == r8) goto L2ac
            r5 = 23
            if (r1 == r5) goto L2a9
            r5 = 29
            if (r1 == r5) goto L2a6
            r5 = 39
            if (r1 == r5) goto L2a3
            r5 = 42
            if (r1 == r5) goto L2a0
            switch(r1) {
                case 1: goto L29e;
                case 2: goto L29c;
                case 3: goto L2b1;
                case 4: goto L29a;
                case 5: goto L298;
                case 6: goto L296;
                default: goto L294;
            }     // Catch: java.lang.NumberFormatException -> L2c3
        L294:
            r13 = -1
            goto L2b1
        L296:
            r13 = 6
            goto L2b1
        L298:
            r13 = 5
            goto L2b1
        L29a:
            r13 = 4
            goto L2b1
        L29c:
            r13 = 2
            goto L2b1
        L29e:
            r13 = 1
            goto L2b1
        L2a0:
            r13 = 42
            goto L2b1
        L2a3:
            r13 = 39
            goto L2b1
        L2a6:
            r13 = 29
            goto L2b1
        L2a9:
            r13 = 23
            goto L2b1
        L2ac:
            r13 = 20
            goto L2b1
        L2af:
            r13 = 17
        L2b1:
            if (r13 == r7) goto L6
            android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.NumberFormatException -> L2c3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.NumberFormatException -> L2c3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L2c3
            r1.<init>(r2, r3)     // Catch: java.lang.NumberFormatException -> L2c3
            r2 = r1
            goto L5a6
        L2c3:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L2d2:
            java.lang.String r5 = r0.zzj
            com.google.android.gms.internal.ads.zzo r0 = r0.zzA
            int r8 = r1.length
            if (r8 >= r15) goto L2e8
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L2e8:
            r8 = r1[r11]     // Catch: java.lang.NumberFormatException -> L3b6
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L3b6
            r9 = r1[r2]     // Catch: java.lang.NumberFormatException -> L3b6
            java.lang.String r3 = r9.substring(r3, r2)     // Catch: java.lang.NumberFormatException -> L3b6
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L3b6
            r1 = r1[r13]     // Catch: java.lang.NumberFormatException -> L3b6
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L3b6
            if (r8 == 0) goto L316
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown AV1 profile: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L316:
            if (r1 == r12) goto L344
            r5 = 10
            if (r1 == r5) goto L332
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unknown AV1 bit depth: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L332:
            if (r0 == 0) goto L342
            byte[] r1 = r0.zze
            if (r1 != 0) goto L33f
            int r0 = r0.zzd
            r1 = 7
            if (r0 == r1) goto L33f
            if (r0 != r6) goto L342
        L33f:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L345
        L342:
            r0 = 2
            goto L345
        L344:
            r0 = 1
        L345:
            switch(r3) {
                case 0: goto L38e;
                case 1: goto L38c;
                case 2: goto L38a;
                case 3: goto L387;
                case 4: goto L384;
                case 5: goto L381;
                case 6: goto L37e;
                case 7: goto L37b;
                case 8: goto L378;
                case 9: goto L375;
                case 10: goto L372;
                case 11: goto L36f;
                case 12: goto L36c;
                case 13: goto L369;
                case 14: goto L366;
                case 15: goto L362;
                case 16: goto L35f;
                case 17: goto L35c;
                case 18: goto L359;
                case 19: goto L356;
                case 20: goto L353;
                case 21: goto L350;
                case 22: goto L34d;
                case 23: goto L34a;
                default: goto L348;
            }
        L348:
            r1 = -1
            goto L38f
        L34a:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L38f
        L34d:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L38f
        L350:
            r1 = 2097152(0x200000, float:2.938736E-39)
            goto L38f
        L353:
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L38f
        L356:
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L38f
        L359:
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L38f
        L35c:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L38f
        L35f:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L38f
        L362:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L38f
        L366:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L38f
        L369:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L38f
        L36c:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L38f
        L36f:
            r1 = 2048(0x800, float:2.87E-42)
            goto L38f
        L372:
            r1 = 1024(0x400, float:1.435E-42)
            goto L38f
        L375:
            r1 = 512(0x200, float:7.175E-43)
            goto L38f
        L378:
            r1 = 256(0x100, float:3.59E-43)
            goto L38f
        L37b:
            r1 = 128(0x80, float:1.794E-43)
            goto L38f
        L37e:
            r1 = 64
            goto L38f
        L381:
            r1 = 32
            goto L38f
        L384:
            r1 = 16
            goto L38f
        L387:
            r1 = 8
            goto L38f
        L38a:
            r1 = 4
            goto L38f
        L38c:
            r1 = 2
            goto L38f
        L38e:
            r1 = 1
        L38f:
            if (r1 != r7) goto L3a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown AV1 level: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L3a7:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r0, r1)
            goto L5a6
        L3b6:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L3c5:
            java.lang.String r2 = r0.zzj
            com.google.android.gms.internal.ads.zzo r0 = r0.zzA
            android.util.Pair r0 = zzi(r2, r1, r0)
            return r0
        L3ce:
            java.lang.String r0 = r0.zzj
            int r3 = r1.length
            if (r3 >= r13) goto L3e2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L3e2:
            r3 = r1[r11]     // Catch: java.lang.NumberFormatException -> L48c
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L48c
            r1 = r1[r2]     // Catch: java.lang.NumberFormatException -> L48c
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L48c
            if (r3 == 0) goto L3ff
            if (r3 == r11) goto L3fd
            if (r3 == r2) goto L3fb
            if (r3 == r13) goto L3f8
            r1 = -1
            goto L400
        L3f8:
            r1 = 8
            goto L400
        L3fb:
            r1 = 4
            goto L400
        L3fd:
            r1 = 2
            goto L400
        L3ff:
            r1 = 1
        L400:
            if (r1 != r7) goto L418
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown VP9 profile: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L418:
            r3 = 10
            if (r0 == r3) goto L463
            r3 = 11
            if (r0 == r3) goto L464
            if (r0 == r8) goto L461
            r2 = 21
            if (r0 == r2) goto L45e
            r2 = 30
            if (r0 == r2) goto L45b
            r2 = 31
            if (r0 == r2) goto L458
            r2 = 40
            if (r0 == r2) goto L455
            r2 = 41
            if (r0 == r2) goto L452
            r2 = 50
            if (r0 == r2) goto L44f
            r2 = 51
            if (r0 == r2) goto L44c
            switch(r0) {
                case 60: goto L449;
                case 61: goto L446;
                case 62: goto L443;
                default: goto L441;
            }
        L441:
            r2 = -1
            goto L464
        L443:
            r2 = 8192(0x2000, float:1.14794E-41)
            goto L464
        L446:
            r2 = 4096(0x1000, float:5.74E-42)
            goto L464
        L449:
            r2 = 2048(0x800, float:2.87E-42)
            goto L464
        L44c:
            r2 = 512(0x200, float:7.175E-43)
            goto L464
        L44f:
            r2 = 256(0x100, float:3.59E-43)
            goto L464
        L452:
            r2 = 128(0x80, float:1.794E-43)
            goto L464
        L455:
            r2 = 64
            goto L464
        L458:
            r2 = 32
            goto L464
        L45b:
            r2 = 16
            goto L464
        L45e:
            r2 = 8
            goto L464
        L461:
            r2 = 4
            goto L464
        L463:
            r2 = 1
        L464:
            if (r2 != r7) goto L47c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown VP9 level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L47c:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r2)
        L489:
            r2 = r0
            goto L5a6
        L48c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L49b:
            java.lang.String r0 = r0.zzj
            int r5 = r1.length
            java.lang.String r8 = "Ignoring malformed AVC codec string: "
            if (r5 >= r2) goto L4af
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r8.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L4af:
            r9 = r1[r11]     // Catch: java.lang.NumberFormatException -> L599
            int r9 = r9.length()     // Catch: java.lang.NumberFormatException -> L599
            if (r9 != r6) goto L4cc
            r5 = r1[r11]     // Catch: java.lang.NumberFormatException -> L599
            java.lang.String r3 = r5.substring(r3, r2)     // Catch: java.lang.NumberFormatException -> L599
            int r3 = java.lang.Integer.parseInt(r3, r14)     // Catch: java.lang.NumberFormatException -> L599
            r1 = r1[r11]     // Catch: java.lang.NumberFormatException -> L599
            java.lang.String r1 = r1.substring(r15)     // Catch: java.lang.NumberFormatException -> L599
            int r0 = java.lang.Integer.parseInt(r1, r14)     // Catch: java.lang.NumberFormatException -> L599
            goto L4da
        L4cc:
            if (r5 < r13) goto L585
            r3 = r1[r11]     // Catch: java.lang.NumberFormatException -> L599
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L599
            r1 = r1[r2]     // Catch: java.lang.NumberFormatException -> L599
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L599
        L4da:
            r1 = 66
            if (r3 == r1) goto L506
            r1 = 77
            if (r3 == r1) goto L507
            r1 = 88
            if (r3 == r1) goto L504
            r1 = 100
            if (r3 == r1) goto L501
            r1 = 110(0x6e, float:1.54E-43)
            if (r3 == r1) goto L4fe
            r1 = 122(0x7a, float:1.71E-43)
            if (r3 == r1) goto L4fb
            r1 = 244(0xf4, float:3.42E-43)
            if (r3 == r1) goto L4f8
            r2 = -1
            goto L507
        L4f8:
            r2 = 64
            goto L507
        L4fb:
            r2 = 32
            goto L507
        L4fe:
            r2 = 16
            goto L507
        L501:
            r2 = 8
            goto L507
        L504:
            r2 = 4
            goto L507
        L506:
            r2 = 1
        L507:
            if (r2 != r7) goto L51f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown AVC profile: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L51f:
            switch(r0) {
                case 10: goto L55d;
                case 11: goto L55b;
                case 12: goto L558;
                case 13: goto L555;
                default: goto L522;
            }
        L522:
            switch(r0) {
                case 20: goto L552;
                case 21: goto L54f;
                case 22: goto L54c;
                default: goto L525;
            }
        L525:
            switch(r0) {
                case 30: goto L549;
                case 31: goto L546;
                case 32: goto L543;
                default: goto L528;
            }
        L528:
            switch(r0) {
                case 40: goto L540;
                case 41: goto L53d;
                case 42: goto L53a;
                default: goto L52b;
            }
        L52b:
            switch(r0) {
                case 50: goto L537;
                case 51: goto L533;
                case 52: goto L530;
                default: goto L52e;
            }
        L52e:
            r1 = -1
            goto L55e
        L530:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L55e
        L533:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L55e
        L537:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L55e
        L53a:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L55e
        L53d:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L55e
        L540:
            r1 = 2048(0x800, float:2.87E-42)
            goto L55e
        L543:
            r1 = 1024(0x400, float:1.435E-42)
            goto L55e
        L546:
            r1 = 512(0x200, float:7.175E-43)
            goto L55e
        L549:
            r1 = 256(0x100, float:3.59E-43)
            goto L55e
        L54c:
            r1 = 128(0x80, float:1.794E-43)
            goto L55e
        L54f:
            r1 = 64
            goto L55e
        L552:
            r1 = 32
            goto L55e
        L555:
            r1 = 16
            goto L55e
        L558:
            r1 = 8
            goto L55e
        L55b:
            r1 = 4
            goto L55e
        L55d:
            r1 = 1
        L55e:
            if (r1 != r7) goto L576
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown AVC level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L576:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r2, r1)
            goto L489
        L585:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L599
            r1.<init>()     // Catch: java.lang.NumberFormatException -> L599
            r1.append(r8)     // Catch: java.lang.NumberFormatException -> L599
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L599
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L599
            com.google.android.gms.internal.ads.zzea.zzf(r4, r1)     // Catch: java.lang.NumberFormatException -> L599
            goto L6
        L599:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r8.concat(r0)
            com.google.android.gms.internal.ads.zzea.zzf(r4, r0)
            goto L6
        L5a6:
            return r2
    }

    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzaf r4) {
            java.util.List r0 = r4.zzq
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfs.zzg(r0)
            if (r0 != 0) goto La
            r4 = 0
            return r4
        La:
            java.lang.String r1 = r0.trim()
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            r2 = -1
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3, r2)
            com.google.android.gms.internal.ads.zzo r4 = r4.zzA
            android.util.Pair r4 = zzi(r0, r1, r4)
            return r4
    }

    public static com.google.android.gms.internal.ads.zzsw zzc() throws com.google.android.gms.internal.ads.zztm {
            java.lang.String r0 = "audio/raw"
            r1 = 0
            java.util.List r0 = zzf(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Lf
            r0 = 0
            return r0
        Lf:
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzsw r0 = (com.google.android.gms.internal.ads.zzsw) r0
            return r0
    }

    public static java.lang.String zzd(com.google.android.gms.internal.ads.zzaf r2) {
            java.lang.String r0 = r2.zzn
            java.lang.String r1 = "audio/eac3-joc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r2 = "audio/eac3"
            return r2
        Ld:
            java.lang.String r0 = r2.zzn
            java.lang.String r1 = "video/dolby-vision"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3d
            android.util.Pair r0 = zza(r2)
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r0.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 16
            if (r0 == r1) goto L49
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L2e
            goto L49
        L2e:
            r1 = 512(0x200, float:7.175E-43)
            if (r0 != r1) goto L35
            java.lang.String r2 = "video/avc"
            return r2
        L35:
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 == r1) goto L3a
            goto L3d
        L3a:
            java.lang.String r2 = "video/av01"
            return r2
        L3d:
            java.lang.String r2 = r2.zzn
            java.lang.String r0 = "video/mv-hevc"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L49
            r2 = 0
            return r2
        L49:
            java.lang.String r2 = "video/hevc"
            return r2
    }

    public static java.util.List zze(com.google.android.gms.internal.ads.zztg r0, com.google.android.gms.internal.ads.zzaf r1, boolean r2, boolean r3) throws com.google.android.gms.internal.ads.zztm {
            java.lang.String r1 = zzd(r1)
            if (r1 != 0) goto Lb
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzn()
            return r0
        Lb:
            java.util.List r0 = r0.zza(r1, r2, r3)
            return r0
    }

    public static synchronized java.util.List zzf(java.lang.String r13, boolean r14, boolean r15) throws com.google.android.gms.internal.ads.zztm {
            java.lang.Class<com.google.android.gms.internal.ads.zzts> r0 = com.google.android.gms.internal.ads.zzts.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zztk r1 = new com.google.android.gms.internal.ads.zztk     // Catch: java.lang.Throwable -> Lda
            r1.<init>(r13, r14, r15)     // Catch: java.lang.Throwable -> Lda
            java.util.HashMap r2 = com.google.android.gms.internal.ads.zzts.zzc     // Catch: java.lang.Throwable -> Lda
            java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> Lda
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Lda
            if (r3 == 0) goto L14
            monitor-exit(r0)
            return r3
        L14:
            com.google.android.gms.internal.ads.zztq r3 = new com.google.android.gms.internal.ads.zztq     // Catch: java.lang.Throwable -> Lda
            r3.<init>(r14, r15)     // Catch: java.lang.Throwable -> Lda
            java.util.ArrayList r15 = zzj(r1, r3)     // Catch: java.lang.Throwable -> Lda
            r3 = 0
            if (r14 == 0) goto L62
            boolean r14 = r15.isEmpty()     // Catch: java.lang.Throwable -> Lda
            if (r14 == 0) goto L62
            int r14 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> Lda
            r4 = 23
            if (r14 > r4) goto L62
            com.google.android.gms.internal.ads.zztp r14 = new com.google.android.gms.internal.ads.zztp     // Catch: java.lang.Throwable -> Lda
            r15 = 0
            r14.<init>(r15)     // Catch: java.lang.Throwable -> Lda
            java.util.ArrayList r15 = zzj(r1, r14)     // Catch: java.lang.Throwable -> Lda
            boolean r14 = r15.isEmpty()     // Catch: java.lang.Throwable -> Lda
            if (r14 != 0) goto L62
            java.lang.Object r14 = r15.get(r3)     // Catch: java.lang.Throwable -> Lda
            com.google.android.gms.internal.ads.zzsw r14 = (com.google.android.gms.internal.ads.zzsw) r14     // Catch: java.lang.Throwable -> Lda
            java.lang.String r14 = r14.zza     // Catch: java.lang.Throwable -> Lda
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lda
            r4.<init>()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r5 = "MediaCodecList API didn't list secure decoder for: "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lda
            r4.append(r13)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r5 = ". Assuming: "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lda
            r4.append(r14)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r14 = r4.toString()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r4 = "MediaCodecUtil"
            com.google.android.gms.internal.ads.zzea.zzf(r4, r14)     // Catch: java.lang.Throwable -> Lda
        L62:
            java.lang.String r14 = "audio/raw"
            boolean r13 = r14.equals(r13)     // Catch: java.lang.Throwable -> Lda
            r14 = 1
            if (r13 == 0) goto Lac
            int r13 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> Lda
            r4 = 26
            if (r13 >= r4) goto La4
            java.lang.String r13 = com.google.android.gms.internal.ads.zzeu.zzb     // Catch: java.lang.Throwable -> Lda
            java.lang.String r4 = "R9"
            boolean r13 = r13.equals(r4)     // Catch: java.lang.Throwable -> Lda
            if (r13 == 0) goto La4
            int r13 = r15.size()     // Catch: java.lang.Throwable -> Lda
            if (r13 != r14) goto La4
            java.lang.Object r13 = r15.get(r3)     // Catch: java.lang.Throwable -> Lda
            com.google.android.gms.internal.ads.zzsw r13 = (com.google.android.gms.internal.ads.zzsw) r13     // Catch: java.lang.Throwable -> Lda
            java.lang.String r13 = r13.zza     // Catch: java.lang.Throwable -> Lda
            java.lang.String r4 = "OMX.MTK.AUDIO.DECODER.RAW"
            boolean r13 = r13.equals(r4)     // Catch: java.lang.Throwable -> Lda
            if (r13 == 0) goto La4
            java.lang.String r4 = "OMX.google.raw.decoder"
            java.lang.String r5 = "audio/raw"
            java.lang.String r6 = "audio/raw"
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            com.google.android.gms.internal.ads.zzsw r13 = com.google.android.gms.internal.ads.zzsw.zzc(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lda
            r15.add(r13)     // Catch: java.lang.Throwable -> Lda
        La4:
            com.google.android.gms.internal.ads.zzti r13 = new com.google.android.gms.internal.ads.zzti     // Catch: java.lang.Throwable -> Lda
            r13.<init>()     // Catch: java.lang.Throwable -> Lda
            zzk(r15, r13)     // Catch: java.lang.Throwable -> Lda
        Lac:
            int r13 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> Lda
            r4 = 32
            if (r13 >= r4) goto Ld1
            int r13 = r15.size()     // Catch: java.lang.Throwable -> Lda
            if (r13 <= r14) goto Ld1
            java.lang.Object r13 = r15.get(r3)     // Catch: java.lang.Throwable -> Lda
            com.google.android.gms.internal.ads.zzsw r13 = (com.google.android.gms.internal.ads.zzsw) r13     // Catch: java.lang.Throwable -> Lda
            java.lang.String r13 = r13.zza     // Catch: java.lang.Throwable -> Lda
            java.lang.String r14 = "OMX.qti.audio.decoder.flac"
            boolean r13 = r14.equals(r13)     // Catch: java.lang.Throwable -> Lda
            if (r13 == 0) goto Ld1
            java.lang.Object r13 = r15.remove(r3)     // Catch: java.lang.Throwable -> Lda
            com.google.android.gms.internal.ads.zzsw r13 = (com.google.android.gms.internal.ads.zzsw) r13     // Catch: java.lang.Throwable -> Lda
            r15.add(r13)     // Catch: java.lang.Throwable -> Lda
        Ld1:
            com.google.android.gms.internal.ads.zzgax r13 = com.google.android.gms.internal.ads.zzgax.zzl(r15)     // Catch: java.lang.Throwable -> Lda
            r2.put(r1, r13)     // Catch: java.lang.Throwable -> Lda
            monitor-exit(r0)
            return r13
        Lda:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
    }

    public static java.util.List zzg(com.google.android.gms.internal.ads.zztg r1, com.google.android.gms.internal.ads.zzaf r2, boolean r3, boolean r4) throws com.google.android.gms.internal.ads.zztm {
            java.lang.String r0 = r2.zzn
            java.util.List r0 = r1.zza(r0, r3, r4)
            java.util.List r1 = zze(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzgau r2 = new com.google.android.gms.internal.ads.zzgau
            r2.<init>()
            r2.zzh(r0)
            r2.zzh(r1)
            com.google.android.gms.internal.ads.zzgax r1 = r2.zzi()
            return r1
    }

    public static java.util.List zzh(java.util.List r1, com.google.android.gms.internal.ads.zzaf r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zztj r1 = new com.google.android.gms.internal.ads.zztj
            r1.<init>(r2)
            zzk(r0, r1)
            return r0
    }

    private static android.util.Pair zzi(java.lang.String r10, java.lang.String[] r11, com.google.android.gms.internal.ads.zzo r12) {
            int r0 = r11.length
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            r2 = 4
            java.lang.String r3 = "MediaCodecUtil"
            r4 = 0
            if (r0 >= r2) goto L15
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r1.concat(r10)
            com.google.android.gms.internal.ads.zzea.zzf(r3, r10)
            return r4
        L15:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzts.zzb
            r5 = 1
            r6 = r11[r5]
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r6 = r0.matches()
            if (r6 != 0) goto L30
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r1.concat(r10)
            com.google.android.gms.internal.ads.zzea.zzf(r3, r10)
            return r4
        L30:
            java.lang.String r10 = r0.group(r5)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r10)
            r1 = 4096(0x1000, float:5.74E-42)
            r6 = 6
            r7 = 2
            if (r0 == 0) goto L42
            r10 = 1
            goto L5e
        L42:
            java.lang.String r0 = "2"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L55
            if (r12 == 0) goto L53
            int r10 = r12.zzd
            if (r10 != r6) goto L53
            r10 = 4096(0x1000, float:5.74E-42)
            goto L5e
        L53:
            r10 = 2
            goto L5e
        L55:
            java.lang.String r12 = "6"
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L26c
            r10 = 6
        L5e:
            r12 = 3
            r11 = r11[r12]
            if (r11 != 0) goto L66
        L63:
            r12 = r4
            goto L252
        L66:
            int r0 = r11.hashCode()
            r8 = 8
            r9 = 16
            switch(r0) {
                case 70821: goto L18d;
                case 70914: goto L182;
                case 70917: goto L177;
                case 71007: goto L16c;
                case 71010: goto L161;
                case 74665: goto L157;
                case 74758: goto L14d;
                case 74761: goto L143;
                case 74851: goto L139;
                case 74854: goto L12f;
                case 2193639: goto L123;
                case 2193642: goto L117;
                case 2193732: goto L10b;
                case 2193735: goto Lff;
                case 2193738: goto Lf3;
                case 2193825: goto Le7;
                case 2193828: goto Ldb;
                case 2193831: goto Lcf;
                case 2312803: goto Lc4;
                case 2312806: goto Lba;
                case 2312896: goto Laf;
                case 2312899: goto La3;
                case 2312902: goto L97;
                case 2312989: goto L8b;
                case 2312992: goto L7f;
                case 2312995: goto L73;
                default: goto L71;
            }
        L71:
            goto L198
        L73:
            java.lang.String r12 = "L186"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 12
            goto L199
        L7f:
            java.lang.String r12 = "L183"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 11
            goto L199
        L8b:
            java.lang.String r12 = "L180"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 10
            goto L199
        L97:
            java.lang.String r12 = "L156"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 9
            goto L199
        La3:
            java.lang.String r12 = "L153"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 8
            goto L199
        Laf:
            java.lang.String r12 = "L150"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 7
            goto L199
        Lba:
            java.lang.String r12 = "L123"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            goto L199
        Lc4:
            java.lang.String r12 = "L120"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 5
            goto L199
        Lcf:
            java.lang.String r12 = "H186"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 25
            goto L199
        Ldb:
            java.lang.String r12 = "H183"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 24
            goto L199
        Le7:
            java.lang.String r12 = "H180"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 23
            goto L199
        Lf3:
            java.lang.String r12 = "H156"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 22
            goto L199
        Lff:
            java.lang.String r12 = "H153"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 21
            goto L199
        L10b:
            java.lang.String r12 = "H150"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 20
            goto L199
        L117:
            java.lang.String r12 = "H123"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 19
            goto L199
        L123:
            java.lang.String r12 = "H120"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 18
            goto L199
        L12f:
            java.lang.String r12 = "L93"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 4
            goto L199
        L139:
            java.lang.String r0 = "L90"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L198
            r6 = 3
            goto L199
        L143:
            java.lang.String r12 = "L63"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 2
            goto L199
        L14d:
            java.lang.String r12 = "L60"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 1
            goto L199
        L157:
            java.lang.String r12 = "L30"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 0
            goto L199
        L161:
            java.lang.String r12 = "H93"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 17
            goto L199
        L16c:
            java.lang.String r12 = "H90"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 16
            goto L199
        L177:
            java.lang.String r12 = "H63"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 15
            goto L199
        L182:
            java.lang.String r12 = "H60"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 14
            goto L199
        L18d:
            java.lang.String r12 = "H30"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L198
            r6 = 13
            goto L199
        L198:
            r6 = -1
        L199:
            switch(r6) {
                case 0: goto L24e;
                case 1: goto L249;
                case 2: goto L244;
                case 3: goto L23d;
                case 4: goto L236;
                case 5: goto L22f;
                case 6: goto L22a;
                case 7: goto L223;
                case 8: goto L21c;
                case 9: goto L215;
                case 10: goto L20e;
                case 11: goto L207;
                case 12: goto L200;
                case 13: goto L1fb;
                case 14: goto L1f6;
                case 15: goto L1ef;
                case 16: goto L1e7;
                case 17: goto L1df;
                case 18: goto L1d7;
                case 19: goto L1cf;
                case 20: goto L1c6;
                case 21: goto L1be;
                case 22: goto L1b6;
                case 23: goto L1ae;
                case 24: goto L1a6;
                case 25: goto L19e;
                default: goto L19c;
            }
        L19c:
            goto L63
        L19e:
            r12 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L1a6:
            r12 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L1ae:
            r12 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L1b6:
            r12 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L1be:
            r12 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L1c6:
            r12 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L1cf:
            r12 = 8192(0x2000, float:1.14794E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L1d7:
            r12 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L1df:
            r12 = 512(0x200, float:7.175E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L1e7:
            r12 = 128(0x80, float:1.794E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L1ef:
            r12 = 32
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L1f6:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            goto L252
        L1fb:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            goto L252
        L200:
            r12 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L207:
            r12 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L20e:
            r12 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L215:
            r12 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L21c:
            r12 = 65536(0x10000, float:9.18355E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L223:
            r12 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L22a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            goto L252
        L22f:
            r12 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L236:
            r12 = 256(0x100, float:3.59E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L23d:
            r12 = 64
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L252
        L244:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            goto L252
        L249:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            goto L252
        L24e:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
        L252:
            if (r12 != 0) goto L262
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = "Unknown HEVC level string: "
            java.lang.String r10 = r11.concat(r10)
            com.google.android.gms.internal.ads.zzea.zzf(r3, r10)
            return r4
        L262:
            android.util.Pair r11 = new android.util.Pair
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.<init>(r10, r12)
            return r11
        L26c:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "Unknown HEVC profile string: "
            java.lang.String r10 = r11.concat(r10)
            com.google.android.gms.internal.ads.zzea.zzf(r3, r10)
            return r4
    }

    private static java.util.ArrayList zzj(com.google.android.gms.internal.ads.zztk r23, com.google.android.gms.internal.ads.zztn r24) throws com.google.android.gms.internal.ads.zztm {
            r1 = r23
            r2 = r24
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L279
            r6.<init>()     // Catch: java.lang.Exception -> L279
            java.lang.String r15 = r1.zza     // Catch: java.lang.Exception -> L279
            int r14 = r24.zza()     // Catch: java.lang.Exception -> L279
            boolean r16 = r24.zze()     // Catch: java.lang.Exception -> L279
            r17 = 0
            r13 = 0
        L1a:
            if (r13 >= r14) goto L278
            android.media.MediaCodecInfo r0 = r2.zzb(r13)     // Catch: java.lang.Exception -> L279
            int r7 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Exception -> L279
            r8 = 29
            if (r7 < r8) goto L33
            boolean r9 = r0.isAlias()     // Catch: java.lang.Exception -> L279
            if (r9 == 0) goto L33
        L2c:
            r18 = r13
            r20 = r14
            r2 = r15
            goto L26d
        L33:
            java.lang.String r12 = r0.getName()     // Catch: java.lang.Exception -> L279
            boolean r9 = r0.isEncoder()     // Catch: java.lang.Exception -> L279
            if (r9 != 0) goto L2c
            java.lang.String r9 = ".secure"
            if (r16 != 0) goto L47
            boolean r10 = r12.endsWith(r9)     // Catch: java.lang.Exception -> L279
            if (r10 != 0) goto L2c
        L47:
            r10 = 24
            if (r7 >= r10) goto La7
            java.lang.String r10 = "OMX.SEC.aac.dec"
            boolean r10 = r10.equals(r12)     // Catch: java.lang.Exception -> L279
            if (r10 != 0) goto L5b
            java.lang.String r10 = "OMX.Exynos.AAC.Decoder"
            boolean r10 = r10.equals(r12)     // Catch: java.lang.Exception -> L279
            if (r10 == 0) goto La7
        L5b:
            java.lang.String r10 = "samsung"
            java.lang.String r11 = com.google.android.gms.internal.ads.zzeu.zzc     // Catch: java.lang.Exception -> L279
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Exception -> L279
            if (r10 == 0) goto La7
            java.lang.String r10 = com.google.android.gms.internal.ads.zzeu.zzb     // Catch: java.lang.Exception -> L279
            java.lang.String r11 = "zeroflte"
            boolean r11 = r10.startsWith(r11)     // Catch: java.lang.Exception -> L279
            if (r11 != 0) goto L2c
            java.lang.String r11 = "zerolte"
            boolean r11 = r10.startsWith(r11)     // Catch: java.lang.Exception -> L279
            if (r11 != 0) goto L2c
            java.lang.String r11 = "zenlte"
            boolean r11 = r10.startsWith(r11)     // Catch: java.lang.Exception -> L279
            if (r11 != 0) goto L2c
            java.lang.String r11 = "SC-05G"
            boolean r11 = r11.equals(r10)     // Catch: java.lang.Exception -> L279
            if (r11 != 0) goto L2c
            java.lang.String r11 = "marinelteatt"
            boolean r11 = r11.equals(r10)     // Catch: java.lang.Exception -> L279
            if (r11 != 0) goto L2c
            java.lang.String r11 = "404SC"
            boolean r11 = r11.equals(r10)     // Catch: java.lang.Exception -> L279
            if (r11 != 0) goto L2c
            java.lang.String r11 = "SC-04G"
            boolean r11 = r11.equals(r10)     // Catch: java.lang.Exception -> L279
            if (r11 != 0) goto L2c
            java.lang.String r11 = "SCV31"
            boolean r10 = r11.equals(r10)     // Catch: java.lang.Exception -> L279
            if (r10 != 0) goto L2c
        La7:
            r11 = 23
            if (r7 > r11) goto Lbb
            java.lang.String r7 = "audio/eac3-joc"
            boolean r7 = r7.equals(r15)     // Catch: java.lang.Exception -> L279
            if (r7 == 0) goto Lbb
            java.lang.String r7 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r7 = r7.equals(r12)     // Catch: java.lang.Exception -> L279
            if (r7 != 0) goto L2c
        Lbb:
            java.lang.String[] r7 = r0.getSupportedTypes()     // Catch: java.lang.Exception -> L279
            int r10 = r7.length     // Catch: java.lang.Exception -> L279
            r11 = 0
        Lc1:
            if (r11 >= r10) goto Ld0
            r5 = r7[r11]     // Catch: java.lang.Exception -> L279
            boolean r19 = r5.equalsIgnoreCase(r15)     // Catch: java.lang.Exception -> L279
            if (r19 == 0) goto Lcd
            goto L143
        Lcd:
            int r11 = r11 + 1
            goto Lc1
        Ld0:
            java.lang.String r5 = "video/dolby-vision"
            boolean r5 = r15.equals(r5)     // Catch: java.lang.Exception -> L279
            if (r5 == 0) goto Lf6
            java.lang.String r5 = "OMX.MS.HEVCDV.Decoder"
            boolean r5 = r5.equals(r12)     // Catch: java.lang.Exception -> L279
            if (r5 == 0) goto Le3
            java.lang.String r5 = "video/hevcdv"
            goto L143
        Le3:
            java.lang.String r5 = "OMX.RTK.video.decoder"
            boolean r5 = r5.equals(r12)     // Catch: java.lang.Exception -> L279
            if (r5 != 0) goto Lf3
            java.lang.String r5 = "OMX.realtek.video.decoder.tunneled"
            boolean r5 = r5.equals(r12)     // Catch: java.lang.Exception -> L279
            if (r5 == 0) goto L109
        Lf3:
            java.lang.String r5 = "video/dv_hevc"
            goto L143
        Lf6:
            java.lang.String r5 = "video/mv-hevc"
            boolean r5 = r15.equals(r5)     // Catch: java.lang.Exception -> L279
            if (r5 == 0) goto L10b
            java.lang.String r5 = "c2.qti.mvhevc.decoder"
            boolean r5 = r5.equals(r12)     // Catch: java.lang.Exception -> L279
            if (r5 == 0) goto L109
            java.lang.String r5 = "video/x-mvhevc"
            goto L143
        L109:
            r5 = 0
            goto L143
        L10b:
            java.lang.String r5 = "audio/alac"
            boolean r5 = r15.equals(r5)     // Catch: java.lang.Exception -> L279
            if (r5 == 0) goto L11e
            java.lang.String r5 = "OMX.lge.alac.decoder"
            boolean r5 = r5.equals(r12)     // Catch: java.lang.Exception -> L279
            if (r5 == 0) goto L11e
            java.lang.String r5 = "audio/x-lg-alac"
            goto L143
        L11e:
            java.lang.String r5 = "audio/flac"
            boolean r5 = r15.equals(r5)     // Catch: java.lang.Exception -> L279
            if (r5 == 0) goto L131
            java.lang.String r5 = "OMX.lge.flac.decoder"
            boolean r5 = r5.equals(r12)     // Catch: java.lang.Exception -> L279
            if (r5 == 0) goto L131
            java.lang.String r5 = "audio/x-lg-flac"
            goto L143
        L131:
            java.lang.String r5 = "audio/ac3"
            boolean r5 = r15.equals(r5)     // Catch: java.lang.Exception -> L279
            if (r5 == 0) goto L109
            java.lang.String r5 = "OMX.lge.ac3.decoder"
            boolean r5 = r5.equals(r12)     // Catch: java.lang.Exception -> L279
            if (r5 == 0) goto L109
            java.lang.String r5 = "audio/lg-ac3"
        L143:
            if (r5 == 0) goto L2c
            android.media.MediaCodecInfo$CodecCapabilities r10 = r0.getCapabilitiesForType(r5)     // Catch: java.lang.Exception -> L21c
            boolean r7 = r2.zzd(r4, r5, r10)     // Catch: java.lang.Exception -> L21c
            boolean r11 = r2.zzc(r4, r5, r10)     // Catch: java.lang.Exception -> L21c
            boolean r8 = r1.zzc     // Catch: java.lang.Exception -> L21c
            if (r8 != 0) goto L158
            if (r11 != 0) goto L2c
            goto L15c
        L158:
            if (r7 != 0) goto L15c
            goto L2c
        L15c:
            boolean r7 = r2.zzd(r3, r5, r10)     // Catch: java.lang.Exception -> L21c
            boolean r8 = r2.zzc(r3, r5, r10)     // Catch: java.lang.Exception -> L21c
            boolean r11 = r1.zzb     // Catch: java.lang.Exception -> L21c
            r20 = 1
            if (r11 != 0) goto L16d
            if (r8 != 0) goto L2c
            goto L170
        L16d:
            if (r7 == 0) goto L2c
            r7 = 1
        L170:
            int r8 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Exception -> L21c
            r11 = 29
            if (r8 < r11) goto L17b
            boolean r11 = r0.isHardwareAccelerated()     // Catch: java.lang.Exception -> L21c
            goto L184
        L17b:
            boolean r11 = zzl(r0, r15)     // Catch: java.lang.Exception -> L21c
            if (r11 != 0) goto L183
            r11 = 1
            goto L184
        L183:
            r11 = 0
        L184:
            boolean r21 = zzl(r0, r15)     // Catch: java.lang.Exception -> L21c
            r2 = 29
            if (r8 < r2) goto L191
            boolean r0 = r0.isVendor()     // Catch: java.lang.Exception -> L21c
            goto L1b4
        L191:
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L21c
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfxi.zza(r0)     // Catch: java.lang.Exception -> L21c
            java.lang.String r2 = "omx.google."
            boolean r2 = r0.startsWith(r2)     // Catch: java.lang.Exception -> L21c
            if (r2 != 0) goto L1b3
            java.lang.String r2 = "c2.android."
            boolean r2 = r0.startsWith(r2)     // Catch: java.lang.Exception -> L21c
            if (r2 != 0) goto L1b3
            java.lang.String r2 = "c2.google."
            boolean r0 = r0.startsWith(r2)     // Catch: java.lang.Exception -> L21c
            if (r0 != 0) goto L1b3
            r0 = 1
            goto L1b4
        L1b3:
            r0 = 0
        L1b4:
            if (r16 == 0) goto L1ba
            boolean r2 = r1.zzb     // Catch: java.lang.Exception -> L21c
            if (r2 == r7) goto L1c0
        L1ba:
            if (r16 != 0) goto L1e8
            boolean r2 = r1.zzb     // Catch: java.lang.Exception -> L1e0
            if (r2 != 0) goto L1e8
        L1c0:
            r2 = 0
            r19 = 0
            r7 = r12
            r8 = r15
            r9 = r5
            r22 = r12
            r12 = r21
            r18 = r13
            r13 = r0
            r20 = r14
            r14 = r2
            r2 = r15
            r15 = r19
            com.google.android.gms.internal.ads.zzsw r0 = com.google.android.gms.internal.ads.zzsw.zzc(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L1dc
            r6.add(r0)     // Catch: java.lang.Exception -> L1dc
            goto L26d
        L1dc:
            r0 = move-exception
            r1 = r22
            goto L223
        L1e0:
            r0 = move-exception
            r18 = r13
            r20 = r14
            r2 = r15
            r1 = r12
            goto L223
        L1e8:
            r22 = r12
            r18 = r13
            r20 = r14
            r2 = r15
            if (r16 != 0) goto L26d
            if (r7 == 0) goto L26d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1dc
            r7.<init>()     // Catch: java.lang.Exception -> L1dc
            r15 = r22
            r7.append(r15)     // Catch: java.lang.Exception -> L219
            r7.append(r9)     // Catch: java.lang.Exception -> L219
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L219
            r14 = 0
            r19 = 1
            r8 = r2
            r9 = r5
            r12 = r21
            r13 = r0
            r1 = r15
            r15 = r19
            com.google.android.gms.internal.ads.zzsw r0 = com.google.android.gms.internal.ads.zzsw.zzc(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L217
            r6.add(r0)     // Catch: java.lang.Exception -> L217
            goto L278
        L217:
            r0 = move-exception
            goto L223
        L219:
            r0 = move-exception
            r1 = r15
            goto L223
        L21c:
            r0 = move-exception
            r1 = r12
            r18 = r13
            r20 = r14
            r2 = r15
        L223:
            int r7 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Exception -> L279
            java.lang.String r8 = "MediaCodecUtil"
            r9 = 23
            if (r7 > r9) goto L24b
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Exception -> L279
            if (r7 != 0) goto L24b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L279
            r0.<init>()     // Catch: java.lang.Exception -> L279
            java.lang.String r5 = "Skipping codec "
            r0.append(r5)     // Catch: java.lang.Exception -> L279
            r0.append(r1)     // Catch: java.lang.Exception -> L279
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch: java.lang.Exception -> L279
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L279
            com.google.android.gms.internal.ads.zzea.zzc(r8, r0)     // Catch: java.lang.Exception -> L279
            goto L26d
        L24b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L279
            r2.<init>()     // Catch: java.lang.Exception -> L279
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch: java.lang.Exception -> L279
            r2.append(r1)     // Catch: java.lang.Exception -> L279
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch: java.lang.Exception -> L279
            r2.append(r5)     // Catch: java.lang.Exception -> L279
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch: java.lang.Exception -> L279
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L279
            com.google.android.gms.internal.ads.zzea.zzc(r8, r1)     // Catch: java.lang.Exception -> L279
            throw r0     // Catch: java.lang.Exception -> L279
        L26d:
            int r13 = r18 + 1
            r1 = r23
            r15 = r2
            r14 = r20
            r2 = r24
            goto L1a
        L278:
            return r6
        L279:
            r0 = move-exception
            com.google.android.gms.internal.ads.zztm r1 = new com.google.android.gms.internal.ads.zztm
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
    }

    private static void zzk(java.util.List r1, com.google.android.gms.internal.ads.zztr r2) {
            com.google.android.gms.internal.ads.zzth r0 = new com.google.android.gms.internal.ads.zzth
            r0.<init>(r2)
            java.util.Collections.sort(r1, r0)
            return
    }

    private static boolean zzl(android.media.MediaCodecInfo r2, java.lang.String r3) {
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r2 = r2.isSoftwareOnly()
            return r2
        Lb:
            boolean r3 = com.google.android.gms.internal.ads.zzbn.zzg(r3)
            r0 = 1
            if (r3 == 0) goto L13
            return r0
        L13:
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = com.google.android.gms.internal.ads.zzfxi.zza(r2)
            java.lang.String r3 = "arc."
            boolean r3 = r2.startsWith(r3)
            r1 = 0
            if (r3 == 0) goto L25
            return r1
        L25:
            java.lang.String r3 = "omx.google."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L70
            java.lang.String r3 = "omx.ffmpeg."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L70
            java.lang.String r3 = "omx.sec."
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L45
            java.lang.String r3 = ".sw."
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L70
        L45:
            java.lang.String r3 = "omx.qcom.video.decoder.hevcswvdec"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L70
            java.lang.String r3 = "c2.android."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L70
            java.lang.String r3 = "c2.google."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L70
            java.lang.String r3 = "omx."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L6f
            java.lang.String r3 = "c2."
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto L6e
            goto L70
        L6e:
            return r1
        L6f:
            r0 = 0
        L70:
            return r0
    }
}
