package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeu {
    public static final int zza = 0;
    public static final java.lang.String zzb = null;
    public static final java.lang.String zzc = null;
    public static final java.lang.String zzd = null;
    public static final java.lang.String zze = null;
    public static final byte[] zzf = null;
    private static final java.util.regex.Pattern zzg = null;
    private static java.util.HashMap zzh;
    private static final java.lang.String[] zzi = null;
    private static final java.lang.String[] zzj = null;
    private static final int[] zzk = null;
    private static final int[] zzl = null;
    private static final int[] zzm = null;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            com.google.android.gms.internal.ads.zzeu.zza = r0
            java.lang.String r1 = android.os.Build.DEVICE
            com.google.android.gms.internal.ads.zzeu.zzb = r1
            java.lang.String r2 = android.os.Build.MANUFACTURER
            com.google.android.gms.internal.ads.zzeu.zzc = r2
            java.lang.String r3 = android.os.Build.MODEL
            com.google.android.gms.internal.ads.zzeu.zzd = r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = ", "
            r4.append(r1)
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.google.android.gms.internal.ads.zzeu.zze = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.android.gms.internal.ads.zzeu.zzf = r0
            java.lang.String r0 = "(?:.*\\.)?isml?(?:/(manifest(.*))?)?"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.gms.internal.ads.zzeu.zzg = r0
            java.lang.String r1 = "alb"
            java.lang.String r2 = "sq"
            java.lang.String r3 = "arm"
            java.lang.String r4 = "hy"
            java.lang.String r5 = "baq"
            java.lang.String r6 = "eu"
            java.lang.String r7 = "bur"
            java.lang.String r8 = "my"
            java.lang.String r9 = "tib"
            java.lang.String r10 = "bo"
            java.lang.String r11 = "chi"
            java.lang.String r12 = "zh"
            java.lang.String r13 = "cze"
            java.lang.String r14 = "cs"
            java.lang.String r15 = "dut"
            java.lang.String r16 = "nl"
            java.lang.String r17 = "ger"
            java.lang.String r18 = "de"
            java.lang.String r19 = "gre"
            java.lang.String r20 = "el"
            java.lang.String r21 = "fre"
            java.lang.String r22 = "fr"
            java.lang.String r23 = "geo"
            java.lang.String r24 = "ka"
            java.lang.String r25 = "ice"
            java.lang.String r26 = "is"
            java.lang.String r27 = "mac"
            java.lang.String r28 = "mk"
            java.lang.String r29 = "mao"
            java.lang.String r30 = "mi"
            java.lang.String r31 = "may"
            java.lang.String r32 = "ms"
            java.lang.String r33 = "per"
            java.lang.String r34 = "fa"
            java.lang.String r35 = "rum"
            java.lang.String r36 = "ro"
            java.lang.String r37 = "scc"
            java.lang.String r38 = "hbs-srp"
            java.lang.String r39 = "slo"
            java.lang.String r40 = "sk"
            java.lang.String r41 = "wel"
            java.lang.String r42 = "cy"
            java.lang.String r43 = "id"
            java.lang.String r44 = "ms-ind"
            java.lang.String r45 = "iw"
            java.lang.String r46 = "he"
            java.lang.String r47 = "heb"
            java.lang.String r48 = "he"
            java.lang.String r49 = "ji"
            java.lang.String r50 = "yi"
            java.lang.String r51 = "arb"
            java.lang.String r52 = "ar-arb"
            java.lang.String r53 = "in"
            java.lang.String r54 = "ms-ind"
            java.lang.String r55 = "ind"
            java.lang.String r56 = "ms-ind"
            java.lang.String r57 = "nb"
            java.lang.String r58 = "no-nob"
            java.lang.String r59 = "nob"
            java.lang.String r60 = "no-nob"
            java.lang.String r61 = "nn"
            java.lang.String r62 = "no-nno"
            java.lang.String r63 = "nno"
            java.lang.String r64 = "no-nno"
            java.lang.String r65 = "tw"
            java.lang.String r66 = "ak-twi"
            java.lang.String r67 = "twi"
            java.lang.String r68 = "ak-twi"
            java.lang.String r69 = "bs"
            java.lang.String r70 = "hbs-bos"
            java.lang.String r71 = "bos"
            java.lang.String r72 = "hbs-bos"
            java.lang.String r73 = "hr"
            java.lang.String r74 = "hbs-hrv"
            java.lang.String r75 = "hrv"
            java.lang.String r76 = "hbs-hrv"
            java.lang.String r77 = "sr"
            java.lang.String r78 = "hbs-srp"
            java.lang.String r79 = "srp"
            java.lang.String r80 = "hbs-srp"
            java.lang.String r81 = "cmn"
            java.lang.String r82 = "zh-cmn"
            java.lang.String r83 = "hak"
            java.lang.String r84 = "zh-hak"
            java.lang.String r85 = "nan"
            java.lang.String r86 = "zh-nan"
            java.lang.String r87 = "hsn"
            java.lang.String r88 = "zh-hsn"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88}
            com.google.android.gms.internal.ads.zzeu.zzi = r0
            java.lang.String r1 = "i-lux"
            java.lang.String r2 = "lb"
            java.lang.String r3 = "i-hak"
            java.lang.String r4 = "zh-hak"
            java.lang.String r5 = "i-navajo"
            java.lang.String r6 = "nv"
            java.lang.String r7 = "no-bok"
            java.lang.String r8 = "no-nob"
            java.lang.String r9 = "no-nyn"
            java.lang.String r10 = "no-nno"
            java.lang.String r11 = "zh-guoyu"
            java.lang.String r12 = "zh-cmn"
            java.lang.String r13 = "zh-hakka"
            java.lang.String r14 = "zh-hak"
            java.lang.String r15 = "zh-min-nan"
            java.lang.String r16 = "zh-nan"
            java.lang.String r17 = "zh-xiang"
            java.lang.String r18 = "zh-hsn"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            com.google.android.gms.internal.ads.zzeu.zzj = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r1 = {x013a: FILL_ARRAY_DATA , data: [0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108} // fill-array
            com.google.android.gms.internal.ads.zzeu.zzk = r1
            r1 = 16
            int[] r1 = new int[r1]
            r1 = {x033e: FILL_ARRAY_DATA , data: [0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935} // fill-array
            com.google.android.gms.internal.ads.zzeu.zzl = r1
            int[] r0 = new int[r0]
            r0 = {x0362: FILL_ARRAY_DATA , data: [0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243} // fill-array
            com.google.android.gms.internal.ads.zzeu.zzm = r0
            return
    }

    public static java.lang.String zzA(byte[] r2) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r2, r1)
            return r0
    }

    public static java.lang.String zzB(byte[] r2, int r3, int r4) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public static java.lang.String zzC(int r0) {
            switch(r0) {
                case -2: goto L1b;
                case -1: goto L18;
                case 0: goto L15;
                case 1: goto L12;
                case 2: goto Lf;
                case 3: goto Lc;
                case 4: goto L9;
                case 5: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "camera motion"
            return r0
        L6:
            java.lang.String r0 = "metadata"
            return r0
        L9:
            java.lang.String r0 = "image"
            return r0
        Lc:
            java.lang.String r0 = "text"
            return r0
        Lf:
            java.lang.String r0 = "video"
            return r0
        L12:
            java.lang.String r0 = "audio"
            return r0
        L15:
            java.lang.String r0 = "default"
            return r0
        L18:
            java.lang.String r0 = "unknown"
            return r0
        L1b:
            java.lang.String r0 = "none"
            return r0
    }

    public static java.lang.String zzD(java.lang.String r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            r0 = 95
            r1 = 45
            java.lang.String r0 = r3.replace(r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1b
            java.lang.String r1 = "und"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1b
            r3 = r0
        L1b:
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfxi.zza(r3)
            java.lang.String r0 = "-"
            r1 = 2
            java.lang.String[] r0 = r3.split(r0, r1)
            r1 = 0
            r0 = r0[r1]
            java.util.HashMap r2 = com.google.android.gms.internal.ads.zzeu.zzh
            if (r2 != 0) goto L33
            java.util.HashMap r2 = zzR()
            com.google.android.gms.internal.ads.zzeu.zzh = r2
        L33:
            java.util.HashMap r2 = com.google.android.gms.internal.ads.zzeu.zzh
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L4e
            int r0 = r0.length()
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r2.concat(r3)
            r0 = r2
        L4e:
            java.lang.String r2 = "no"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L68
            java.lang.String r2 = "i"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L68
            java.lang.String r2 = "zh"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L67
            goto L68
        L67:
            return r3
        L68:
            java.lang.String[] r0 = com.google.android.gms.internal.ads.zzeu.zzj
            int r2 = r0.length
            r2 = 18
            if (r1 >= r2) goto L95
            r2 = r0[r1]
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L92
            int r2 = r1 + 1
            r2 = r0[r2]
            r0 = r0[r1]
            int r0 = r0.length()
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r0.concat(r3)
            goto L95
        L92:
            int r1 = r1 + 2
            goto L68
        L95:
            return r3
    }

    public static void zzE(long[] r16, long r17, long r19) {
            r0 = r16
            r8 = r19
            r1 = 0
            r10 = 0
            r12 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            java.math.RoundingMode r14 = java.math.RoundingMode.FLOOR
            if (r2 < 0) goto L2a
            long r3 = r8 % r12
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L2a
            java.math.RoundingMode r2 = java.math.RoundingMode.UNNECESSARY
            long r2 = com.google.android.gms.internal.ads.zzgdp.zzb(r8, r12, r2)
        L1c:
            int r4 = r0.length
            if (r1 >= r4) goto L8c
            r4 = r0[r1]
            long r4 = com.google.android.gms.internal.ads.zzgdp.zzb(r4, r2, r14)
            r0[r1] = r4
            int r1 = r1 + 1
            goto L1c
        L2a:
            if (r2 >= 0) goto L46
            long r2 = r12 % r8
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 != 0) goto L46
            java.math.RoundingMode r2 = java.math.RoundingMode.UNNECESSARY
            long r2 = com.google.android.gms.internal.ads.zzgdp.zzb(r12, r8, r2)
        L38:
            int r4 = r0.length
            if (r1 >= r4) goto L8c
            r4 = r0[r1]
            long r4 = com.google.android.gms.internal.ads.zzgdp.zzd(r4, r2)
            r0[r1] = r4
            int r1 = r1 + 1
            goto L38
        L46:
            r15 = 0
        L47:
            int r1 = r0.length
            if (r15 >= r1) goto L8c
            r1 = r0[r15]
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 != 0) goto L51
            goto L89
        L51:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 < 0) goto L68
            long r4 = r8 % r1
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 != 0) goto L68
            java.math.RoundingMode r3 = java.math.RoundingMode.UNNECESSARY
            long r1 = com.google.android.gms.internal.ads.zzgdp.zzb(r8, r1, r3)
            long r1 = com.google.android.gms.internal.ads.zzgdp.zzb(r12, r1, r14)
            r0[r15] = r1
            goto L89
        L68:
            if (r3 >= 0) goto L7d
            long r3 = r1 % r8
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L7d
            java.math.RoundingMode r3 = java.math.RoundingMode.UNNECESSARY
            long r1 = com.google.android.gms.internal.ads.zzgdp.zzb(r1, r8, r3)
            long r1 = com.google.android.gms.internal.ads.zzgdp.zzd(r12, r1)
            r0[r15] = r1
            goto L89
        L7d:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            r5 = r19
            r7 = r14
            long r1 = zzP(r1, r3, r5, r7)
            r0[r15] = r1
        L89:
            int r15 = r15 + 1
            goto L47
        L8c:
            return
    }

    public static boolean zzF(android.util.SparseArray r0, int r1) {
            int r0 = r0.indexOfKey(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean zzG(com.google.android.gms.internal.ads.zzek r3, com.google.android.gms.internal.ads.zzek r4, java.util.zip.Inflater r5) {
            int r0 = r3.zzb()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.zzc()
            int r2 = r3.zzb()
            if (r0 >= r2) goto L1a
            int r0 = r3.zzb()
            int r0 = r0 + r0
            r4.zzF(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.zzN()
            int r2 = r3.zzd()
            int r3 = r3.zzb()
            r5.setInput(r0, r2, r3)
            r3 = 0
        L31:
            byte[] r0 = r4.zzN()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L4a
            r4.zzK(r3)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            r1 = 1
            goto L6b
        L4a:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 != 0) goto L6b
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r0 == 0) goto L57
            goto L6b
        L57:
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            if (r3 != r0) goto L31
            int r0 = r4.zzc()     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            int r0 = r0 + r0
            r4.zzF(r0)     // Catch: java.lang.Throwable -> L66 java.util.zip.DataFormatException -> L6b
            goto L31
        L66:
            r3 = move-exception
            r5.reset()
            throw r3
        L6b:
            r5.reset()
            return r1
    }

    public static boolean zzH(android.content.Context r2) {
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 23
            if (r0 < r1) goto L14
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public static boolean zzI(int r1) {
            r0 = 3
            if (r1 == r0) goto L20
            r0 = 2
            if (r1 == r0) goto L20
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r1 == r0) goto L20
            r0 = 21
            if (r1 == r0) goto L20
            r0 = 1342177280(0x50000000, float:8.5899346E9)
            if (r1 == r0) goto L20
            r0 = 22
            if (r1 == r0) goto L20
            r0 = 1610612736(0x60000000, float:3.6893488E19)
            if (r1 == r0) goto L20
            r0 = 4
            if (r1 != r0) goto L1e
            goto L20
        L1e:
            r1 = 0
            return r1
        L20:
            r1 = 1
            return r1
    }

    public static boolean zzJ(android.content.Context r4) {
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 0
            r2 = 29
            r3 = 1
            if (r0 < r2) goto L36
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            int r4 = r4.targetSdkVersion
            if (r4 < r2) goto L36
            r4 = 30
            if (r0 != r4) goto L26
            java.lang.String r4 = com.google.android.gms.internal.ads.zzeu.zzd
            java.lang.String r2 = "moto g(20)"
            boolean r2 = com.google.android.gms.internal.ads.zzfxi.zzc(r4, r2)
            if (r2 != 0) goto L36
            java.lang.String r2 = "rmx3231"
            boolean r4 = com.google.android.gms.internal.ads.zzfxi.zzc(r4, r2)
            if (r4 != 0) goto L36
        L26:
            r4 = 34
            if (r0 != r4) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzeu.zzd
            java.lang.String r0 = "sm-x200"
            boolean r4 = com.google.android.gms.internal.ads.zzfxi.zzc(r4, r0)
            if (r4 == 0) goto L35
            goto L36
        L35:
            return r1
        L36:
            r1 = 1
        L37:
            return r1
    }

    public static boolean zzK(int r1) {
            r0 = 10
            if (r1 == r0) goto Lb
            r0 = 13
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            return r1
        Lb:
            r1 = 1
            return r1
    }

    public static boolean zzL(android.content.Context r1) {
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r0 = "uimode"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.UiModeManager r1 = (android.app.UiModeManager) r1
            if (r1 == 0) goto L17
            int r1 = r1.getCurrentModeType()
            r0 = 4
            if (r1 != r0) goto L17
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
    }

    public static boolean zzM(android.os.Handler r2, java.lang.Runnable r3) {
            android.os.Looper r0 = r2.getLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L10
            r2 = 0
            return r2
        L10:
            android.os.Looper r0 = r2.getLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L1f
            r3.run()
            r2 = 1
            return r2
        L1f:
            boolean r2 = r2.post(r3)
            return r2
    }

    public static java.lang.Object[] zzN(java.lang.Object[] r1, int r2) {
            int r0 = r1.length
            if (r2 > r0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            return r1
    }

    private static int zzO(int r2, int r3) {
            int[] r0 = com.google.android.gms.internal.ads.zzeu.zzl
            int r1 = r3 >> 12
            r2 = r2 ^ r1
            r2 = r0[r2]
            int r3 = r3 << 4
            char r3 = (char) r3
            r2 = r2 ^ r3
            char r2 = (char) r2
            return r2
    }

    private static long zzP(long r8, long r10, long r12, java.math.RoundingMode r14) {
            long r0 = com.google.android.gms.internal.ads.zzgdp.zzd(r8, r10)
            r2 = -9223372036854775808
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L19
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L14
            goto L19
        L14:
            long r8 = com.google.android.gms.internal.ads.zzgdp.zzb(r0, r12, r14)
            return r8
        L19:
            long r0 = java.lang.Math.abs(r10)
            long r6 = java.lang.Math.abs(r12)
            long r0 = com.google.android.gms.internal.ads.zzgdp.zzc(r0, r6)
            java.math.RoundingMode r6 = java.math.RoundingMode.UNNECESSARY
            long r10 = com.google.android.gms.internal.ads.zzgdp.zzb(r10, r0, r6)
            java.math.RoundingMode r6 = java.math.RoundingMode.UNNECESSARY
            long r12 = com.google.android.gms.internal.ads.zzgdp.zzb(r12, r0, r6)
            long r0 = java.lang.Math.abs(r8)
            long r6 = java.lang.Math.abs(r12)
            long r0 = com.google.android.gms.internal.ads.zzgdp.zzc(r0, r6)
            java.math.RoundingMode r6 = java.math.RoundingMode.UNNECESSARY
            long r8 = com.google.android.gms.internal.ads.zzgdp.zzb(r8, r0, r6)
            java.math.RoundingMode r6 = java.math.RoundingMode.UNNECESSARY
            long r12 = com.google.android.gms.internal.ads.zzgdp.zzb(r12, r0, r6)
            long r0 = com.google.android.gms.internal.ads.zzgdp.zzd(r8, r10)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L5b
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L56
            goto L5b
        L56:
            long r8 = com.google.android.gms.internal.ads.zzgdp.zzb(r0, r12, r14)
            return r8
        L5b:
            double r10 = (double) r10
            double r12 = (double) r12
            double r8 = (double) r8
            double r10 = r10 / r12
            double r8 = r8 * r10
            r10 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L68
            return r4
        L68:
            r10 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L6f
            return r2
        L6f:
            long r8 = com.google.android.gms.internal.ads.zzgdk.zzb(r8, r14)
            return r8
    }

    private static java.lang.String zzQ(java.lang.String r6) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1f
            r2[r5] = r6     // Catch: java.lang.Exception -> L1f
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L1f
            return r0
        L1f:
            r0 = move-exception
            java.lang.String r1 = "Failed to read system property "
            java.lang.String r6 = r1.concat(r6)
            java.lang.String r1 = "Util"
            com.google.android.gms.internal.ads.zzea.zzd(r1, r6, r0)
            r6 = 0
            return r6
    }

    private static java.util.HashMap zzR() {
            java.lang.String[] r0 = java.util.Locale.getISOLanguages()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.length
            java.lang.String[] r3 = com.google.android.gms.internal.ads.zzeu.zzi
            int r3 = r3.length
            int r3 = r2 + 88
            r1.<init>(r3)
            r3 = 0
            r4 = 0
        L11:
            if (r4 >= r2) goto L2a
            r5 = r0[r4]
            java.util.Locale r6 = new java.util.Locale     // Catch: java.util.MissingResourceException -> L27
            r6.<init>(r5)     // Catch: java.util.MissingResourceException -> L27
            java.lang.String r6 = r6.getISO3Language()     // Catch: java.util.MissingResourceException -> L27
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.util.MissingResourceException -> L27
            if (r7 != 0) goto L27
            r1.put(r6, r5)     // Catch: java.util.MissingResourceException -> L27
        L27:
            int r4 = r4 + 1
            goto L11
        L2a:
            java.lang.String[] r0 = com.google.android.gms.internal.ads.zzeu.zzi
            int r2 = r0.length
            r2 = 88
            if (r3 >= r2) goto L3d
            r2 = r0[r3]
            int r4 = r3 + 1
            r0 = r0[r4]
            r1.put(r2, r0)
            int r3 = r3 + 2
            goto L2a
        L3d:
            return r1
    }

    public static int zza(long[] r3, long r4, boolean r6, boolean r7) {
            int r7 = java.util.Arrays.binarySearch(r3, r4)
            if (r7 >= 0) goto L8
            int r3 = ~r7
            goto L16
        L8:
            int r7 = r7 + 1
            int r0 = r3.length
            if (r7 >= r0) goto L13
            r0 = r3[r7]
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L8
        L13:
            if (r6 != 0) goto L17
            r3 = r7
        L16:
            return r3
        L17:
            int r7 = r7 + (-1)
            return r7
    }

    public static int zzb(int[] r2, int r3, boolean r4, boolean r5) {
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r2 = -r0
            goto L18
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L12
            r1 = r2[r0]
            if (r1 == r3) goto La
        L12:
            if (r4 == 0) goto L17
            int r2 = r0 + 1
            goto L18
        L17:
            r2 = r0
        L18:
            if (r5 == 0) goto L1f
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L1f:
            return r2
    }

    public static int zzc(long[] r3, long r4, boolean r6, boolean r7) {
            int r6 = java.util.Arrays.binarySearch(r3, r4)
            if (r6 >= 0) goto La
            int r6 = r6 + 2
            int r3 = -r6
            goto L16
        La:
            int r6 = r6 + (-1)
            if (r6 < 0) goto L14
            r0 = r3[r6]
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto La
        L14:
            int r3 = r6 + 1
        L16:
            if (r7 == 0) goto L1d
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L1d:
            return r3
    }

    public static int zzd(byte[] r2, int r3, int r4, int r5) {
            r3 = 0
            r5 = 65535(0xffff, float:9.1834E-41)
        L4:
            if (r3 >= r4) goto L19
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 >> 4
            int r5 = zzO(r1, r5)
            r0 = r0 & 15
            int r5 = zzO(r0, r5)
            int r3 = r3 + 1
            goto L4
        L19:
            return r5
    }

    public static int zze(byte[] r3, int r4, int r5, int r6) {
        L0:
            if (r4 >= r5) goto L13
            int r0 = r6 << 8
            int r6 = r6 >>> 24
            int[] r1 = com.google.android.gms.internal.ads.zzeu.zzk
            r2 = r3[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6 = r6 ^ r2
            r6 = r1[r6]
            r6 = r6 ^ r0
            int r4 = r4 + 1
            goto L0
        L13:
            return r6
    }

    public static int zzf(byte[] r2, int r3, int r4, int r5) {
            r5 = 0
        L1:
            if (r3 >= r4) goto Lf
            int[] r0 = com.google.android.gms.internal.ads.zzeu.zzm
            r1 = r2[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r1
            r5 = r0[r5]
            int r3 = r3 + 1
            goto L1
        Lf:
            return r5
    }

    public static int zzg(int r2) {
            r0 = 20
            r1 = 30
            if (r2 == r0) goto L2a
            r0 = 22
            if (r2 == r0) goto L27
            if (r2 == r1) goto L24
            switch(r2) {
                case 2: goto L22;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1f;
                case 6: goto L1f;
                case 7: goto L1c;
                case 8: goto L1c;
                case 9: goto L19;
                case 10: goto L19;
                case 11: goto L19;
                case 12: goto L19;
                default: goto Lf;
            }
        Lf:
            switch(r2) {
                case 14: goto L16;
                case 15: goto L19;
                case 16: goto L19;
                case 17: goto L19;
                case 18: goto L19;
                default: goto L12;
            }
        L12:
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
        L16:
            r2 = 25
            return r2
        L19:
            r2 = 28
            return r2
        L1c:
            r2 = 23
            return r2
        L1f:
            r2 = 21
            return r2
        L22:
            r2 = 3
            return r2
        L24:
            r2 = 34
            return r2
        L27:
            r2 = 31
            return r2
        L2a:
            return r1
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    public static int zzh(int r2) {
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
    }

    public static int zzi(java.nio.ByteBuffer r1, int r2) {
            int r2 = r1.getInt(r2)
            java.nio.ByteOrder r1 = r1.order()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r0) goto Ld
            return r2
        Ld:
            int r1 = java.lang.Integer.reverseBytes(r2)
            return r1
    }

    public static int zzj(int r4) {
            r0 = 2
            if (r4 == r0) goto L28
            r1 = 3
            if (r4 == r1) goto L26
            r2 = 4
            if (r4 == r2) goto L25
            r3 = 21
            if (r4 == r3) goto L24
            r3 = 22
            if (r4 == r3) goto L25
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            if (r4 == r3) goto L28
            r0 = 1342177280(0x50000000, float:8.5899346E9)
            if (r4 == r0) goto L24
            r0 = 1610612736(0x60000000, float:3.6893488E19)
            if (r4 != r0) goto L1e
            goto L25
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L24:
            return r1
        L25:
            return r2
        L26:
            r4 = 1
            return r4
        L28:
            return r0
    }

    public static int zzk(int r1) {
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 4
            if (r1 == r0) goto L23
            r0 = 10
            if (r1 == r0) goto L20
            r0 = 7
            if (r1 == r0) goto L23
            r0 = 8
            if (r1 == r0) goto L1d
            switch(r1) {
                case 15: goto L1d;
                case 16: goto L23;
                case 17: goto L20;
                case 18: goto L23;
                case 19: goto L20;
                case 20: goto L20;
                case 21: goto L20;
                case 22: goto L20;
                default: goto L14;
            }
        L14:
            switch(r1) {
                case 24: goto L1a;
                case 25: goto L1a;
                case 26: goto L1a;
                case 27: goto L1a;
                case 28: goto L1a;
                default: goto L17;
            }
        L17:
            r1 = 6006(0x1776, float:8.416E-42)
            return r1
        L1a:
            r1 = 6002(0x1772, float:8.41E-42)
            return r1
        L1d:
            r1 = 6003(0x1773, float:8.412E-42)
            return r1
        L20:
            r1 = 6004(0x1774, float:8.413E-42)
            return r1
        L23:
            r1 = 6005(0x1775, float:8.415E-42)
            return r1
    }

    public static int zzl(java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "_"
            r2 = -1
            java.lang.String[] r4 = r4.split(r1, r2)
            int r1 = r4.length
            r2 = 2
            if (r1 >= r2) goto L10
            return r0
        L10:
            int r2 = r1 + (-1)
            r2 = r4[r2]
            r3 = 3
            if (r1 < r3) goto L25
            int r1 = r1 + (-2)
            r4 = r4[r1]
            java.lang.String r1 = "neg"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            java.util.Objects.requireNonNull(r2)
            int r0 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L31
            if (r4 == 0) goto L31
            int r4 = -r0
            return r4
        L31:
            return r0
    }

    public static int zzm(int r1) {
            r0 = 8
            if (r1 == r0) goto L1a
            r0 = 16
            if (r1 == r0) goto L18
            r0 = 24
            if (r1 == r0) goto L15
            r0 = 32
            if (r1 == r0) goto L12
            r1 = 0
            return r1
        L12:
            r1 = 22
            return r1
        L15:
            r1 = 21
            return r1
        L18:
            r1 = 2
            return r1
        L1a:
            r1 = 3
            return r1
    }

    public static int zzn(android.net.Uri r7) {
            java.lang.String r0 = r7.getScheme()
            r1 = 3
            if (r0 == 0) goto L11
            java.lang.String r2 = "rtsp"
            boolean r0 = com.google.android.gms.internal.ads.zzfxi.zzc(r2, r0)
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r1
        L11:
            java.lang.String r0 = r7.getLastPathSegment()
            r2 = 4
            if (r0 != 0) goto L19
            return r2
        L19:
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 < 0) goto L71
            int r3 = r3 + r6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfxi.zza(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 104579: goto L53;
                case 108321: goto L49;
                case 3242057: goto L3f;
                case 3299913: goto L35;
                default: goto L34;
            }
        L34:
            goto L5d
        L35:
            java.lang.String r3 = "m3u8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = 1
            goto L5e
        L3f:
            java.lang.String r3 = "isml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = 3
            goto L5e
        L49:
            java.lang.String r3 = "mpd"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = 0
            goto L5e
        L53:
            java.lang.String r3 = "ism"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = 2
            goto L5e
        L5d:
            r0 = -1
        L5e:
            if (r0 == 0) goto L6c
            if (r0 == r6) goto L6a
            if (r0 == r5) goto L68
            if (r0 == r1) goto L68
            r0 = 4
            goto L6d
        L68:
            r0 = 1
            goto L6d
        L6a:
            r0 = 2
            goto L6d
        L6c:
            r0 = 0
        L6d:
            if (r0 != r2) goto L70
            goto L71
        L70:
            return r0
        L71:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzeu.zzg
            java.lang.String r7 = r7.getPath()
            java.util.Objects.requireNonNull(r7)
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            if (r0 == 0) goto L9d
            java.lang.String r7 = r7.group(r5)
            if (r7 == 0) goto L9c
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L93
            return r4
        L93:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L9c
            return r5
        L9c:
            return r6
        L9d:
            return r2
    }

    public static long zzo(long r7, int r9) {
            java.math.RoundingMode r6 = java.math.RoundingMode.CEILING
            long r2 = (long) r9
            r4 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r7
            long r7 = zzt(r0, r2, r4, r6)
            return r7
    }

    public static long zzp(long r2, float r4) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return r2
        L7:
            double r2 = (double) r2
            double r0 = (double) r4
            double r2 = r2 * r0
            long r2 = java.lang.Math.round(r2)
            return r2
    }

    public static long zzq(long r2, float r4) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return r2
        L7:
            double r2 = (double) r2
            double r0 = (double) r4
            double r2 = r2 / r0
            long r2 = java.lang.Math.round(r2)
            return r2
    }

    public static long zzr(long r3) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L14
            r0 = -9223372036854775808
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            goto L14
        L10:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
        L14:
            return r3
    }

    public static long zzs(long r7, int r9) {
            long r4 = (long) r9
            java.math.RoundingMode r6 = java.math.RoundingMode.FLOOR
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r7
            long r7 = zzt(r0, r2, r4, r6)
            return r7
    }

    public static long zzt(long r6, long r8, long r10, java.math.RoundingMode r12) {
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L63
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto Lb
            goto L63
        Lb:
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 < 0) goto L21
            long r3 = r10 % r8
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L16
            goto L21
        L16:
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY
            long r8 = com.google.android.gms.internal.ads.zzgdp.zzb(r10, r8, r0)
            long r6 = com.google.android.gms.internal.ads.zzgdp.zzb(r6, r8, r12)
            return r6
        L21:
            if (r2 >= 0) goto L35
            long r2 = r8 % r10
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L2a
            goto L35
        L2a:
            java.math.RoundingMode r12 = java.math.RoundingMode.UNNECESSARY
            long r8 = com.google.android.gms.internal.ads.zzgdp.zzb(r8, r10, r12)
            long r6 = com.google.android.gms.internal.ads.zzgdp.zzd(r6, r8)
            return r6
        L35:
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 < 0) goto L4b
            long r3 = r10 % r6
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L40
            goto L4b
        L40:
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY
            long r6 = com.google.android.gms.internal.ads.zzgdp.zzb(r10, r6, r0)
            long r6 = com.google.android.gms.internal.ads.zzgdp.zzb(r8, r6, r12)
            return r6
        L4b:
            if (r2 >= 0) goto L5e
            long r2 = r6 % r10
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L5e
            java.math.RoundingMode r12 = java.math.RoundingMode.UNNECESSARY
            long r6 = com.google.android.gms.internal.ads.zzgdp.zzb(r6, r10, r12)
            long r6 = com.google.android.gms.internal.ads.zzgdp.zzd(r8, r6)
            return r6
        L5e:
            long r6 = zzP(r6, r8, r10, r12)
            return r6
        L63:
            return r0
    }

    public static long zzu(long r3) {
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L13
            r0 = -9223372036854775808
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            goto L13
        L10:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
        L13:
            return r3
    }

    public static android.graphics.Point zzv(android.content.Context r6) {
            java.lang.String r0 = "display"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            r1 = 0
            if (r0 == 0) goto L10
            android.view.Display r0 = r0.getDisplay(r1)
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L22
            java.lang.String r0 = "window"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            java.util.Objects.requireNonNull(r0)
            android.view.Display r0 = r0.getDefaultDisplay()
        L22:
            int r2 = r0.getDisplayId()
            if (r2 != 0) goto La6
            boolean r2 = zzL(r6)
            if (r2 == 0) goto La6
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            r3 = 28
            if (r2 >= r3) goto L3b
            java.lang.String r2 = "sys.display-size"
            java.lang.String r2 = zzQ(r2)
            goto L41
        L3b:
            java.lang.String r2 = "vendor.display-size"
            java.lang.String r2 = zzQ(r2)
        L41:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L7c
            java.lang.String r3 = r2.trim()     // Catch: java.lang.NumberFormatException -> L6d
            java.lang.String r4 = "x"
            r5 = -1
            java.lang.String[] r3 = r3.split(r4, r5)     // Catch: java.lang.NumberFormatException -> L6d
            int r4 = r3.length     // Catch: java.lang.NumberFormatException -> L6d
            r5 = 2
            if (r4 != r5) goto L6d
            r1 = r3[r1]     // Catch: java.lang.NumberFormatException -> L6d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L6d
            r4 = 1
            r3 = r3[r4]     // Catch: java.lang.NumberFormatException -> L6d
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L6d
            if (r1 <= 0) goto L6d
            if (r3 <= 0) goto L6d
            android.graphics.Point r4 = new android.graphics.Point     // Catch: java.lang.NumberFormatException -> L6d
            r4.<init>(r1, r3)     // Catch: java.lang.NumberFormatException -> L6d
            goto Lc5
        L6d:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "Invalid display size: "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "Util"
            com.google.android.gms.internal.ads.zzea.zzc(r2, r1)
        L7c:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeu.zzc
            java.lang.String r2 = "Sony"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto La6
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeu.zzd
            java.lang.String r2 = "BRAVIA"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto La6
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.String r1 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r6 = r6.hasSystemFeature(r1)
            if (r6 == 0) goto La6
            android.graphics.Point r4 = new android.graphics.Point
            r6 = 3840(0xf00, float:5.381E-42)
            r0 = 2160(0x870, float:3.027E-42)
            r4.<init>(r6, r0)
            goto Lc5
        La6:
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            int r6 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 23
            if (r6 < r1) goto Lc2
            android.view.Display$Mode r6 = r0.getMode()
            int r0 = r6.getPhysicalWidth()
            r4.x = r0
            int r6 = r6.getPhysicalHeight()
            r4.y = r6
            goto Lc5
        Lc2:
            r0.getRealSize(r4)
        Lc5:
            return r4
    }

    public static android.media.AudioFormat zzw(int r1, int r2, int r3) {
            android.media.AudioFormat$Builder r0 = new android.media.AudioFormat$Builder
            r0.<init>()
            android.media.AudioFormat$Builder r1 = r0.setSampleRate(r1)
            android.media.AudioFormat$Builder r1 = r1.setChannelMask(r2)
            android.media.AudioFormat$Builder r1 = r1.setEncoding(r3)
            android.media.AudioFormat r1 = r1.build()
            return r1
    }

    public static android.os.Handler zzx(android.os.Handler.Callback r2) {
            android.os.Looper r2 = android.os.Looper.myLooper()
            com.google.android.gms.internal.ads.zzdi.zzb(r2)
            android.os.Handler r0 = new android.os.Handler
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static android.os.Looper zzy() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L7
            return r0
        L7:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            return r0
    }

    public static com.google.android.gms.internal.ads.zzaf zzz(int r2, int r3, int r4) {
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r1 = "audio/raw"
            r0.zzZ(r1)
            r0.zzz(r3)
            r0.zzaa(r4)
            r0.zzT(r2)
            com.google.android.gms.internal.ads.zzaf r2 = r0.zzaf()
            return r2
    }
}
