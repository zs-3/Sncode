package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzalv implements com.google.android.gms.internal.ads.zzakv {
    static final java.util.regex.Pattern zza = null;
    static final java.util.regex.Pattern zzb = null;
    private static final java.util.regex.Pattern zzc = null;
    private static final java.util.regex.Pattern zzd = null;
    private static final java.util.regex.Pattern zze = null;
    private static final java.util.regex.Pattern zzf = null;
    private static final java.util.regex.Pattern zzg = null;
    private static final com.google.android.gms.internal.ads.zzalt zzh = null;
    private final org.xmlpull.v1.XmlPullParserFactory zzi;

    static {
            java.lang.String r0 = "^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzalv.zzc = r0
            java.lang.String r0 = "^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzalv.zzd = r0
            java.lang.String r0 = "^(([0-9]*.)?[0-9]+)(px|em|%)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzalv.zze = r0
            java.lang.String r0 = "^([-+]?\\d+\\.?\\d*?)%$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzalv.zza = r0
            java.lang.String r0 = "^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzalv.zzb = r0
            java.lang.String r0 = "^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzalv.zzf = r0
            java.lang.String r0 = "^(\\d+) (\\d+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzalv.zzg = r0
            com.google.android.gms.internal.ads.zzalt r0 = new com.google.android.gms.internal.ads.zzalt
            r1 = 1106247680(0x41f00000, float:30.0)
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.ads.zzalv.zzh = r0
            return
    }

    public zzalv() {
            r3 = this;
            r3.<init>()
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: org.xmlpull.v1.XmlPullParserException -> Le
            r3.zzi = r0     // Catch: org.xmlpull.v1.XmlPullParserException -> Le
            r1 = 1
            r0.setNamespaceAware(r1)     // Catch: org.xmlpull.v1.XmlPullParserException -> Le
            return
        Le:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't create XmlPullParserFactory instance"
            r1.<init>(r2, r0)
            throw r1
    }

    private static long zzc(java.lang.String r13, com.google.android.gms.internal.ads.zzalt r14) throws com.google.android.gms.internal.ads.zzakr {
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzalv.zzc
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L7f
            java.lang.String r13 = r0.group(r8)
            java.util.Objects.requireNonNull(r13)
            long r8 = java.lang.Long.parseLong(r13)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            java.lang.String r13 = r0.group(r7)
            java.util.Objects.requireNonNull(r13)
            double r7 = (double) r8
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            java.lang.String r13 = r0.group(r6)
            java.util.Objects.requireNonNull(r13)
            double r9 = (double) r9
            double r7 = r7 + r9
            long r9 = java.lang.Long.parseLong(r13)
            double r9 = (double) r9
            java.lang.String r13 = r0.group(r5)
            r5 = 0
            if (r13 == 0) goto L50
            double r11 = java.lang.Double.parseDouble(r13)
            goto L51
        L50:
            r11 = r5
        L51:
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r4)
            if (r13 == 0) goto L62
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.zza
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L63
        L62:
            r9 = r5
        L63:
            double r7 = r7 + r11
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L79
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.zzb
            double r4 = (double) r13
            float r13 = r14.zza
            double r13 = (double) r13
            double r0 = r0 / r4
            double r5 = r0 / r13
        L79:
            double r7 = r7 + r9
            double r7 = r7 + r5
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L7f:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzalv.zzd
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L11e
            java.lang.String r13 = r0.group(r8)
            java.util.Objects.requireNonNull(r13)
            double r9 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r7)
            java.util.Objects.requireNonNull(r13)
            int r0 = r13.hashCode()
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto Leb
            r1 = 104(0x68, float:1.46E-43)
            if (r0 == r1) goto Le1
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 == r1) goto Ld7
            r1 = 3494(0xda6, float:4.896E-42)
            if (r0 == r1) goto Lcd
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto Lc4
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto Lba
            goto Lf5
        Lba:
            java.lang.String r0 = "t"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto Lf5
            r7 = 5
            goto Lf6
        Lc4:
            java.lang.String r0 = "s"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto Lf5
            goto Lf6
        Lcd:
            java.lang.String r0 = "ms"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto Lf5
            r7 = 3
            goto Lf6
        Ld7:
            java.lang.String r0 = "m"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto Lf5
            r7 = 1
            goto Lf6
        Le1:
            java.lang.String r0 = "h"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto Lf5
            r7 = 0
            goto Lf6
        Leb:
            java.lang.String r0 = "f"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto Lf5
            r7 = 4
            goto Lf6
        Lf5:
            r7 = -1
        Lf6:
            if (r7 == 0) goto L113
            if (r7 == r8) goto L110
            if (r7 == r6) goto L109
            if (r7 == r5) goto L105
            if (r7 == r4) goto L101
            goto L11a
        L101:
            int r13 = r14.zzc
            double r13 = (double) r13
            goto L10e
        L105:
            float r13 = r14.zza
            double r13 = (double) r13
            goto L10e
        L109:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L10e:
            double r9 = r9 / r13
            goto L11a
        L110:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L118
        L113:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L118:
            double r9 = r9 * r13
        L11a:
            double r9 = r9 * r2
            long r13 = (long) r9
            return r13
        L11e:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            com.google.android.gms.internal.ads.zzakr r14 = new com.google.android.gms.internal.ads.zzakr
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r13 = r0.concat(r13)
            r14.<init>(r13)
            throw r14
    }

    private static android.text.Layout.Alignment zzd(java.lang.String r5) {
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfxi.zza(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 1
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 2
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 3
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 4
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
    }

    private static com.google.android.gms.internal.ads.zzaly zze(com.google.android.gms.internal.ads.zzaly r0) {
            if (r0 != 0) goto L7
            com.google.android.gms.internal.ads.zzaly r0 = new com.google.android.gms.internal.ads.zzaly
            r0.<init>()
        L7:
            return r0
    }

    private static com.google.android.gms.internal.ads.zzaly zzf(org.xmlpull.v1.XmlPullParser r14, com.google.android.gms.internal.ads.zzaly r15) {
            int r0 = r14.getAttributeCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L3e4
            java.lang.String r3 = r14.getAttributeValue(r2)
            java.lang.String r4 = r14.getAttributeName(r2)
            int r5 = r4.hashCode()
            r6 = 5
            r7 = 4
            r8 = -1
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r5) {
                case -1550943582: goto Lb7;
                case -1224696685: goto Lad;
                case -1065511464: goto La3;
                case -879295043: goto L98;
                case -734428249: goto L8e;
                case 3355: goto L84;
                case 3511770: goto L79;
                case 94842723: goto L6f;
                case 109403361: goto L64;
                case 110138194: goto L59;
                case 365601008: goto L4e;
                case 921125321: goto L42;
                case 1115953443: goto L36;
                case 1287124693: goto L2b;
                case 1754920356: goto L1f;
                default: goto L1d;
            }
        L1d:
            goto Lc1
        L1f:
            java.lang.String r5 = "multiRowAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 8
            goto Lc2
        L2b:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 1
            goto Lc2
        L36:
            java.lang.String r5 = "rubyPosition"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 11
            goto Lc2
        L42:
            java.lang.String r5 = "textEmphasis"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 13
            goto Lc2
        L4e:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 4
            goto Lc2
        L59:
            java.lang.String r5 = "textCombine"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 9
            goto Lc2
        L64:
            java.lang.String r5 = "shear"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 14
            goto Lc2
        L6f:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 2
            goto Lc2
        L79:
            java.lang.String r5 = "ruby"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 10
            goto Lc2
        L84:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 0
            goto Lc2
        L8e:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 5
            goto Lc2
        L98:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 12
            goto Lc2
        La3:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 7
            goto Lc2
        Lad:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 3
            goto Lc2
        Lb7:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lc1
            r4 = 6
            goto Lc2
        Lc1:
            r4 = -1
        Lc2:
            java.lang.String r5 = "TtmlParser"
            switch(r4) {
                case 0: goto L3cd;
                case 1: goto L3b3;
                case 2: goto L399;
                case 3: goto L391;
                case 4: goto L2b0;
                case 5: goto L2a1;
                case 6: goto L292;
                case 7: goto L285;
                case 8: goto L278;
                case 9: goto L23a;
                case 10: goto L1c1;
                case 11: goto L183;
                case 12: goto L122;
                case 13: goto L115;
                case 14: goto Lc9;
                default: goto Lc7;
            }
        Lc7:
            goto L3e0
        Lc9:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            java.util.regex.Pattern r4 = com.google.android.gms.internal.ads.zzalv.zza
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r6 = r4.matches()
            r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r6 != 0) goto Lea
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Invalid value for shear: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r5, r3)
            goto L110
        Lea:
            java.lang.String r4 = r4.group(r11)     // Catch: java.lang.NumberFormatException -> L102
            java.util.Objects.requireNonNull(r4)
            r6 = 1120403456(0x42c80000, float:100.0)
            r8 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L102
            float r4 = java.lang.Math.max(r8, r4)     // Catch: java.lang.NumberFormatException -> L102
            float r7 = java.lang.Math.min(r6, r4)     // Catch: java.lang.NumberFormatException -> L102
            goto L110
        L102:
            r4 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "Failed to parse shear: "
            java.lang.String r3 = r6.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzg(r5, r3, r4)
        L110:
            r15.zzy(r7)
            goto L3e0
        L115:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            com.google.android.gms.internal.ads.zzalr r3 = com.google.android.gms.internal.ads.zzalr.zza(r3)
            r15.zzB(r3)
            goto L3e0
        L122:
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfxi.zza(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L14c;
                case -1026963764: goto L142;
                case 913457136: goto L138;
                case 1679736913: goto L12e;
                default: goto L12d;
            }
        L12d:
            goto L155
        L12e:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L155
            r8 = 0
            goto L155
        L138:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L155
            r8 = 1
            goto L155
        L142:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L155
            r8 = 2
            goto L155
        L14c:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L155
            r8 = 3
        L155:
            if (r8 == 0) goto L17a
            if (r8 == r11) goto L171
            if (r8 == r10) goto L168
            if (r8 == r9) goto L15f
            goto L3e0
        L15f:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzC(r1)
            goto L3e0
        L168:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzC(r11)
            goto L3e0
        L171:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzu(r1)
            goto L3e0
        L17a:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzu(r11)
            goto L3e0
        L183:
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfxi.zza(r3)
            int r4 = r3.hashCode()
            r5 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r4 == r5) goto L1a0
            r5 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r4 == r5) goto L196
            goto L1a9
        L196:
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1a9
            r8 = 1
            goto L1a9
        L1a0:
            java.lang.String r4 = "before"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1a9
            r8 = 0
        L1a9:
            if (r8 == 0) goto L1b8
            if (r8 == r11) goto L1af
            goto L3e0
        L1af:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzw(r10)
            goto L3e0
        L1b8:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzw(r11)
            goto L3e0
        L1c1:
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfxi.zza(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -618561360: goto L1ff;
                case -410956671: goto L1f5;
                case -250518009: goto L1eb;
                case -136074796: goto L1e1;
                case 3016401: goto L1d7;
                case 3556653: goto L1cd;
                default: goto L1cc;
            }
        L1cc:
            goto L208
        L1cd:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L208
            r8 = 3
            goto L208
        L1d7:
            java.lang.String r4 = "base"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L208
            r8 = 1
            goto L208
        L1e1:
            java.lang.String r4 = "textContainer"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L208
            r8 = 4
            goto L208
        L1eb:
            java.lang.String r4 = "delimiter"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L208
            r8 = 5
            goto L208
        L1f5:
            java.lang.String r4 = "container"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L208
            r8 = 0
            goto L208
        L1ff:
            java.lang.String r4 = "baseContainer"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L208
            r8 = 2
        L208:
            if (r8 == 0) goto L231
            if (r8 == r11) goto L228
            if (r8 == r10) goto L228
            if (r8 == r9) goto L21f
            if (r8 == r7) goto L21f
            if (r8 == r6) goto L216
            goto L3e0
        L216:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzx(r7)
            goto L3e0
        L21f:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzx(r9)
            goto L3e0
        L228:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzx(r10)
            goto L3e0
        L231:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzx(r11)
            goto L3e0
        L23a:
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfxi.zza(r3)
            int r4 = r3.hashCode()
            r5 = 96673(0x179a1, float:1.35468E-40)
            if (r4 == r5) goto L257
            r5 = 3387192(0x33af38, float:4.746467E-39)
            if (r4 == r5) goto L24d
            goto L260
        L24d:
            java.lang.String r4 = "none"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L260
            r8 = 0
            goto L260
        L257:
            java.lang.String r4 = "all"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L260
            r8 = 1
        L260:
            if (r8 == 0) goto L26f
            if (r8 == r11) goto L266
            goto L3e0
        L266:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzA(r11)
            goto L3e0
        L26f:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzA(r1)
            goto L3e0
        L278:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            android.text.Layout$Alignment r3 = zzd(r3)
            r15.zzv(r3)
            goto L3e0
        L285:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            android.text.Layout$Alignment r3 = zzd(r3)
            r15.zzz(r3)
            goto L3e0
        L292:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r15.zzt(r3)
            goto L3e0
        L2a1:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r15.zzn(r3)
            goto L3e0
        L2b0:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.String r4 = "\\s+"
            int r6 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.String[] r4 = r3.split(r4, r8)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            int r6 = r4.length     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            if (r6 != r11) goto L2c6
            java.util.regex.Pattern r4 = com.google.android.gms.internal.ads.zzalv.zze     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.util.regex.Matcher r4 = r4.matcher(r3)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            goto L2d5
        L2c6:
            if (r6 != r10) goto L367
            java.util.regex.Pattern r6 = com.google.android.gms.internal.ads.zzalv.zze     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r4 = r4[r11]     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.util.regex.Matcher r4 = r6.matcher(r4)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.String r6 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."
            com.google.android.gms.internal.ads.zzea.zzf(r5, r6)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
        L2d5:
            boolean r6 = r4.matches()     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.String r7 = "'."
            if (r6 == 0) goto L34d
            java.lang.String r6 = r4.group(r9)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.util.Objects.requireNonNull(r6)
            int r12 = r6.hashCode()     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r13 = 37
            if (r12 == r13) goto L309
            r13 = 3240(0xca8, float:4.54E-42)
            if (r12 == r13) goto L2ff
            r13 = 3592(0xe08, float:5.033E-42)
            if (r12 == r13) goto L2f5
            goto L312
        L2f5:
            java.lang.String r12 = "px"
            boolean r12 = r6.equals(r12)
            if (r12 == 0) goto L312
            r8 = 0
            goto L312
        L2ff:
            java.lang.String r12 = "em"
            boolean r12 = r6.equals(r12)
            if (r12 == 0) goto L312
            r8 = 1
            goto L312
        L309:
            java.lang.String r12 = "%"
            boolean r12 = r6.equals(r12)
            if (r12 == 0) goto L312
            r8 = 2
        L312:
            if (r8 == 0) goto L33a
            if (r8 == r11) goto L336
            if (r8 != r10) goto L31c
            r15.zzr(r9)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            goto L33d
        L31c:
            com.google.android.gms.internal.ads.zzakr r4 = new com.google.android.gms.internal.ads.zzakr     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r8.<init>()     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.String r9 = "Invalid unit for fontSize: '"
            r8.append(r9)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r8.append(r6)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r8.append(r7)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.String r6 = r8.toString()     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            throw r4     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
        L336:
            r15.zzr(r10)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            goto L33d
        L33a:
            r15.zzr(r11)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
        L33d:
            java.lang.String r4 = r4.group(r11)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.util.Objects.requireNonNull(r4)
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r15.zzq(r4)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            goto L3e0
        L34d:
            com.google.android.gms.internal.ads.zzakr r4 = new com.google.android.gms.internal.ads.zzakr     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r6.<init>()     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.String r8 = "Invalid expression for fontSize: '"
            r6.append(r8)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r6.append(r3)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r6.append(r7)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.String r6 = r6.toString()     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            throw r4     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
        L367:
            com.google.android.gms.internal.ads.zzakr r4 = new com.google.android.gms.internal.ads.zzakr     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r7.<init>()     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.String r8 = "Invalid number of entries for fontSize: "
            r7.append(r8)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r7.append(r6)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.String r6 = "."
            r7.append(r6)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            java.lang.String r6 = r7.toString()     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
            throw r4     // Catch: com.google.android.gms.internal.ads.zzakr -> L383
        L383:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed parsing fontSize value: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r5, r3)
            goto L3e0
        L391:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzp(r3)
            goto L3e0
        L399:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            int r4 = com.google.android.gms.internal.ads.zzdl.zzb(r3)     // Catch: java.lang.IllegalArgumentException -> L3a5
            r15.zzo(r4)     // Catch: java.lang.IllegalArgumentException -> L3a5
            goto L3e0
        L3a5:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed parsing color value: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r5, r3)
            goto L3e0
        L3b3:
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            int r4 = com.google.android.gms.internal.ads.zzdl.zzb(r3)     // Catch: java.lang.IllegalArgumentException -> L3bf
            r15.zzm(r4)     // Catch: java.lang.IllegalArgumentException -> L3bf
            goto L3e0
        L3bf:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed parsing background value: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r5, r3)
            goto L3e0
        L3cd:
            java.lang.String r4 = r14.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L3e0
            com.google.android.gms.internal.ads.zzaly r15 = zze(r15)
            r15.zzs(r3)
        L3e0:
            int r2 = r2 + 1
            goto L6
        L3e4:
            return r15
    }

    private static java.lang.String[] zzg(java.lang.String r2) {
            java.lang.String r2 = r2.trim()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Le
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            goto L17
        Le:
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r0 = -1
            java.lang.String r1 = "\\s+"
            java.lang.String[] r2 = r2.split(r1, r0)
        L17:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] r1, int r2, int r3, com.google.android.gms.internal.ads.zzaku r4, com.google.android.gms.internal.ads.zzdn r5) {
            r0 = this;
            com.google.android.gms.internal.ads.zzakq r1 = r0.zzb(r1, r2, r3)
            com.google.android.gms.internal.ads.zzakp.zza(r1, r4, r5)
            return
    }

    public final com.google.android.gms.internal.ads.zzakq zzb(byte[] r42, int r43, int r44) {
            r41 = this;
            java.lang.String r1 = ""
            java.lang.String r2 = "http://www.w3.org/ns/ttml#parameter"
            r3 = r41
            org.xmlpull.v1.XmlPullParserFactory r4 = r3.zzi     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            org.xmlpull.v1.XmlPullParser r4 = r4.newPullParser()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r5.<init>()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r6.<init>()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.HashMap r7 = new java.util.HashMap     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r7.<init>()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzalw r15 = new com.google.android.gms.internal.ads.zzalw     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.String r9 = ""
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r15
            r10 = r17
            r11 = r17
            r12 = r18
            r13 = r18
            r14 = r17
            r19 = r15
            r15 = r17
            r16 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r8 = r19
            r6.put(r1, r8)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r9 = r42
            r10 = r43
            r11 = r44
            r8.<init>(r9, r10, r11)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r9 = 0
            r4.setInput(r8, r9)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.ArrayDeque r8 = new java.util.ArrayDeque     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r8.<init>()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r10 = r4.getEventType()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzalt r11 = com.google.android.gms.internal.ads.zzalv.zzh     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r14 = r9
            r16 = r14
            r15 = 0
            r17 = 15
        L5d:
            r12 = 1
            if (r10 == r12) goto L6b6
            java.lang.Object r18 = r8.peek()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r9 = r18
            com.google.android.gms.internal.ads.zzals r9 = (com.google.android.gms.internal.ads.zzals) r9     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r12 = 2
            if (r15 != 0) goto L688
            java.lang.String r13 = r4.getName()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r20 = r1
            java.lang.String r1 = "tt"
            if (r10 != r12) goto L644
            boolean r10 = r1.equals(r13)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r21 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r12 = "TtmlParser"
            if (r10 == 0) goto L1c3
            java.lang.String r10 = "frameRate"
            java.lang.String r10 = r4.getAttributeValue(r2, r10)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r10 == 0) goto L8c
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L8e
        L8c:
            r10 = 30
        L8e:
            java.lang.String r11 = "frameRateMultiplier"
            java.lang.String r11 = r4.getAttributeValue(r2, r11)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.String r3 = " "
            if (r11 == 0) goto Lc2
            int r16 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r23 = r14
            r14 = -1
            java.lang.String[] r11 = r11.split(r3, r14)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r14 = r11.length     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r24 = r15
            r15 = 2
            if (r14 != r15) goto La9
            r14 = 1
            goto Laa
        La9:
            r14 = 0
        Laa:
            java.lang.String r15 = "frameRateMultiplier doesn't have 2 parts"
            com.google.android.gms.internal.ads.zzdi.zze(r14, r15)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r14 = 0
            r15 = r11[r14]     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r15 = java.lang.Integer.parseInt(r15)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r15 = (float) r15     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r16 = 1
            r11 = r11[r16]     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r11 = (float) r11     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r15 = r15 / r11
            goto Lc9
        Lc2:
            r23 = r14
            r24 = r15
            r14 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
        Lc9:
            com.google.android.gms.internal.ads.zzalt r11 = com.google.android.gms.internal.ads.zzalv.zzh     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r14 = r11.zzb     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r16 = r14
            java.lang.String r14 = "subFrameRate"
            java.lang.String r14 = r4.getAttributeValue(r2, r14)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r14 == 0) goto Ldc
            int r14 = java.lang.Integer.parseInt(r14)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto Lde
        Ldc:
            r14 = r16
        Lde:
            int r11 = r11.zzc     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r16 = r11
            java.lang.String r11 = "tickRate"
            java.lang.String r11 = r4.getAttributeValue(r2, r11)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r11 == 0) goto Lf1
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r25 = r8
            goto Lf5
        Lf1:
            r25 = r8
            r11 = r16
        Lf5:
            com.google.android.gms.internal.ads.zzalt r8 = new com.google.android.gms.internal.ads.zzalt     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r10 = (float) r10     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r10 = r10 * r15
            r8.<init>(r10, r14, r11)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.String r10 = "cellResolution"
            java.lang.String r10 = r4.getAttributeValue(r2, r10)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r10 != 0) goto L10d
        L105:
            r26 = r2
            r16 = r8
        L109:
            r15 = 15
            goto L178
        L10d:
            java.util.regex.Pattern r11 = com.google.android.gms.internal.ads.zzalv.zzg     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.regex.Matcher r11 = r11.matcher(r10)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            boolean r14 = r11.matches()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r14 != 0) goto L123
            java.lang.String r3 = "Ignoring malformed cell resolution: "
            java.lang.String r3 = r3.concat(r10)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r3)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L105
        L123:
            r14 = 1
            java.lang.String r15 = r11.group(r14)     // Catch: java.lang.NumberFormatException -> L16a java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r15)
            int r14 = java.lang.Integer.parseInt(r15)     // Catch: java.lang.NumberFormatException -> L16a java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r15 = 2
            java.lang.String r11 = r11.group(r15)     // Catch: java.lang.NumberFormatException -> L16a java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r11)
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> L16a java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r14 == 0) goto L149
            if (r11 == 0) goto L144
            r26 = r2
            r15 = r11
            r11 = 1
            goto L14d
        L144:
            r26 = r2
            r11 = 0
            r15 = 0
            goto L14d
        L149:
            r26 = r2
            r15 = r11
            r11 = 0
        L14d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L16c java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r2.<init>()     // Catch: java.lang.NumberFormatException -> L16c java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r16 = r8
            java.lang.String r8 = "Invalid cell resolution "
            r2.append(r8)     // Catch: java.lang.NumberFormatException -> L16e java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r2.append(r14)     // Catch: java.lang.NumberFormatException -> L16e java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> L16e java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r2.append(r15)     // Catch: java.lang.NumberFormatException -> L16e java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.NumberFormatException -> L16e java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzdi.zze(r11, r2)     // Catch: java.lang.NumberFormatException -> L16e java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L178
        L16a:
            r26 = r2
        L16c:
            r16 = r8
        L16e:
            java.lang.String r2 = "Ignoring malformed cell resolution: "
            java.lang.String r2 = r2.concat(r10)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L109
        L178:
            java.lang.String r2 = "extent"
            java.lang.String r2 = com.google.android.gms.internal.ads.zzev.zza(r4, r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r2 != 0) goto L182
        L180:
            r10 = 0
            goto L1c0
        L182:
            java.util.regex.Pattern r3 = com.google.android.gms.internal.ads.zzalv.zzf     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.regex.Matcher r3 = r3.matcher(r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            boolean r8 = r3.matches()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r8 != 0) goto L198
            java.lang.String r3 = "Ignoring non-pixel tts extent: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L180
        L198:
            r8 = 1
            java.lang.String r10 = r3.group(r8)     // Catch: java.lang.NumberFormatException -> L1b6 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r10)
            int r8 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NumberFormatException -> L1b6 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r10 = 2
            java.lang.String r3 = r3.group(r10)     // Catch: java.lang.NumberFormatException -> L1b6 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r3)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L1b6 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzalu r10 = new com.google.android.gms.internal.ads.zzalu     // Catch: java.lang.NumberFormatException -> L1b6 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r10.<init>(r8, r3)     // Catch: java.lang.NumberFormatException -> L1b6 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L1c0
        L1b6:
            java.lang.String r3 = "Ignoring malformed tts extent: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L180
        L1c0:
            r11 = r16
            goto L1cf
        L1c3:
            r26 = r2
            r25 = r8
            r23 = r14
            r24 = r15
            r10 = r16
            r15 = r17
        L1cf:
            boolean r1 = r13.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.String r2 = "metadata"
            java.lang.String r3 = "region"
            java.lang.String r8 = "head"
            java.lang.String r14 = "style"
            if (r1 != 0) goto L269
            boolean r1 = r13.equals(r8)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            java.lang.String r1 = "body"
            boolean r1 = r13.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            java.lang.String r1 = "div"
            boolean r1 = r13.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            java.lang.String r1 = "p"
            boolean r1 = r13.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            java.lang.String r1 = "span"
            boolean r1 = r13.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            java.lang.String r1 = "br"
            boolean r1 = r13.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            boolean r1 = r13.equals(r14)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            java.lang.String r1 = "styling"
            boolean r1 = r13.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            java.lang.String r1 = "layout"
            boolean r1 = r13.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            boolean r1 = r13.equals(r3)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            boolean r1 = r13.equals(r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            java.lang.String r1 = "image"
            boolean r1 = r13.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            java.lang.String r1 = "data"
            boolean r1 = r13.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 != 0) goto L269
            java.lang.String r1 = "information"
            boolean r1 = r13.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L246
            goto L269
        L246:
            java.lang.String r1 = r4.getName()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r2.<init>()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.String r3 = "Ignoring unsupported tag: "
            r2.append(r3)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r2.append(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.String r1 = r2.toString()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zze(r12, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r2 = r5
            r16 = r10
            r17 = r15
            r14 = r23
            r3 = r25
            goto L641
        L269:
            boolean r1 = r8.equals(r13)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L4f1
        L26f:
            r4.next()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            boolean r1 = com.google.android.gms.internal.ads.zzev.zzc(r4, r14)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L2af
            java.lang.String r1 = com.google.android.gms.internal.ads.zzev.zza(r4, r14)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzaly r9 = new com.google.android.gms.internal.ads.zzaly     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r9.<init>()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzaly r9 = zzf(r4, r9)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L2a3
            java.lang.String[] r1 = zzg(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r13 = r1.length     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r16 = r11
            r11 = 0
        L28f:
            if (r11 >= r13) goto L2a5
            r17 = r13
            r13 = r1[r11]     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.Object r13 = r5.get(r13)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzaly r13 = (com.google.android.gms.internal.ads.zzaly) r13     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r9.zzl(r13)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r11 = r11 + 1
            r13 = r17
            goto L28f
        L2a3:
            r16 = r11
        L2a5:
            java.lang.String r1 = r9.zzE()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L2dd
            r5.put(r1, r9)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L2dd
        L2af:
            r16 = r11
            boolean r1 = com.google.android.gms.internal.ads.zzev.zzc(r4, r3)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.String r9 = "id"
            if (r1 != 0) goto L2e3
            boolean r1 = com.google.android.gms.internal.ads.zzev.zzc(r4, r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L2dd
        L2bf:
            r4.next()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.String r1 = "image"
            boolean r1 = com.google.android.gms.internal.ads.zzev.zzc(r4, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L2d7
            java.lang.String r1 = com.google.android.gms.internal.ads.zzev.zza(r4, r9)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L2d7
            java.lang.String r11 = r4.nextText()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r7.put(r1, r11)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
        L2d7:
            boolean r1 = com.google.android.gms.internal.ads.zzev.zzb(r4, r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L2bf
        L2dd:
            r17 = r2
            r38 = r5
            goto L4dd
        L2e3:
            java.lang.String r28 = com.google.android.gms.internal.ads.zzev.zza(r4, r9)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r28 != 0) goto L2f0
            r17 = r2
            r38 = r5
        L2ed:
            r1 = 0
            goto L4d6
        L2f0:
            java.lang.String r1 = "origin"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzev.zza(r4, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L4cb
            java.util.regex.Pattern r9 = com.google.android.gms.internal.ads.zzalv.zzb     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.regex.Matcher r11 = r9.matcher(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.regex.Pattern r13 = com.google.android.gms.internal.ads.zzalv.zzf     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r17 = r2
            java.util.regex.Matcher r2 = r13.matcher(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            boolean r18 = r11.matches()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r22 = 1120403456(0x42c80000, float:100.0)
            if (r18 == 0) goto L339
            r38 = r5
            r5 = 1
            java.lang.String r2 = r11.group(r5)     // Catch: java.lang.NumberFormatException -> L32f java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r2)
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L32f java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r2 = r2 / r22
            r5 = 2
            java.lang.String r11 = r11.group(r5)     // Catch: java.lang.NumberFormatException -> L32f java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r11)
            float r5 = java.lang.Float.parseFloat(r11)     // Catch: java.lang.NumberFormatException -> L32f java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r5 = r5 / r22
            r29 = r2
            goto L372
        L32f:
            java.lang.String r2 = "Ignoring region with malformed origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L2ed
        L339:
            r38 = r5
            boolean r5 = r2.matches()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r5 == 0) goto L4c0
            if (r10 != 0) goto L34d
            java.lang.String r2 = "Ignoring region with missing tts:extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L2ed
        L34d:
            r5 = 1
            java.lang.String r11 = r2.group(r5)     // Catch: java.lang.NumberFormatException -> L4b5 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r11)
            int r5 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> L4b5 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r11 = 2
            java.lang.String r2 = r2.group(r11)     // Catch: java.lang.NumberFormatException -> L4b5 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r2)
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L4b5 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r5 = (float) r5     // Catch: java.lang.NumberFormatException -> L4b5 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r11 = r10.zza     // Catch: java.lang.NumberFormatException -> L4b5 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r11 = (float) r11     // Catch: java.lang.NumberFormatException -> L4b5 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r5 = r5 / r11
            float r2 = (float) r2     // Catch: java.lang.NumberFormatException -> L4b5 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r11 = r10.zzb     // Catch: java.lang.NumberFormatException -> L4b5 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r11 = (float) r11
            float r2 = r2 / r11
            r29 = r5
            r5 = r2
        L372:
            java.lang.String r2 = "extent"
            java.lang.String r2 = com.google.android.gms.internal.ads.zzev.zza(r4, r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r2 == 0) goto L4ae
            java.util.regex.Matcher r9 = r9.matcher(r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.regex.Matcher r2 = r13.matcher(r2)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            boolean r11 = r9.matches()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r11 == 0) goto L3b4
            r11 = 1
            java.lang.String r2 = r9.group(r11)     // Catch: java.lang.NumberFormatException -> L3a9 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r2)
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L3a9 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r2 = r2 / r22
            r11 = 2
            java.lang.String r9 = r9.group(r11)     // Catch: java.lang.NumberFormatException -> L3a9 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r9)
            float r1 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L3a9 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r1 = r1 / r22
            r34 = r1
            r33 = r2
            goto L3ed
        L3a9:
            java.lang.String r2 = "Ignoring region with malformed extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L2ed
        L3b4:
            boolean r9 = r2.matches()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r9 == 0) goto L4a3
            if (r10 != 0) goto L3c7
            java.lang.String r2 = "Ignoring region with missing tts:extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L2ed
        L3c7:
            r9 = 1
            java.lang.String r11 = r2.group(r9)     // Catch: java.lang.NumberFormatException -> L498 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r11)
            int r9 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> L498 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r11 = 2
            java.lang.String r2 = r2.group(r11)     // Catch: java.lang.NumberFormatException -> L498 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r2)
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L498 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r9 = (float) r9     // Catch: java.lang.NumberFormatException -> L498 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r11 = r10.zza     // Catch: java.lang.NumberFormatException -> L498 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r11 = (float) r11     // Catch: java.lang.NumberFormatException -> L498 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r9 = r9 / r11
            float r2 = (float) r2     // Catch: java.lang.NumberFormatException -> L498 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r1 = r10.zzb     // Catch: java.lang.NumberFormatException -> L498 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            float r1 = (float) r1
            float r2 = r2 / r1
            r34 = r2
            r33 = r9
        L3ed:
            java.lang.String r1 = "displayAlign"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzev.zza(r4, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L434
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfxi.zza(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r2 = r1.hashCode()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r9 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r2 == r9) goto L412
            r9 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r9) goto L408
            goto L41c
        L408:
            java.lang.String r2 = "after"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L41c
            r1 = 1
            goto L41d
        L412:
            java.lang.String r2 = "center"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L41c
            r1 = 0
            goto L41d
        L41c:
            r1 = -1
        L41d:
            if (r1 == 0) goto L42a
            r2 = 1
            if (r1 == r2) goto L423
            goto L434
        L423:
            float r5 = r5 + r34
            r30 = r5
            r32 = 2
            goto L438
        L42a:
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r34 / r1
            float r5 = r5 + r1
            r30 = r5
            r32 = 1
            goto L438
        L434:
            r30 = r5
            r32 = 0
        L438:
            float r1 = (float) r15
            float r36 = r21 / r1
            java.lang.String r1 = "writingMode"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzev.zza(r4, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L488
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfxi.zza(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r2 = r1.hashCode()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r5 = 3694(0xe6e, float:5.176E-42)
            if (r2 == r5) goto L46e
            r5 = 3553396(0x363874, float:4.979368E-39)
            if (r2 == r5) goto L464
            r5 = 3553576(0x363928, float:4.97962E-39)
            if (r2 == r5) goto L45a
            goto L478
        L45a:
            java.lang.String r2 = "tbrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L478
            r1 = 2
            goto L479
        L464:
            java.lang.String r2 = "tblr"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L478
            r1 = 1
            goto L479
        L46e:
            java.lang.String r2 = "tb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L478
            r1 = 0
            goto L479
        L478:
            r1 = -1
        L479:
            if (r1 == 0) goto L485
            r2 = 1
            if (r1 == r2) goto L485
            r2 = 2
            if (r1 == r2) goto L482
            goto L488
        L482:
            r37 = 1
            goto L48c
        L485:
            r37 = 2
            goto L48c
        L488:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r37 = -2147483648(0xffffffff80000000, float:-0.0)
        L48c:
            com.google.android.gms.internal.ads.zzalw r1 = new com.google.android.gms.internal.ads.zzalw     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r31 = 0
            r35 = 1
            r27 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L4d6
        L498:
            java.lang.String r2 = "Ignoring region with malformed extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L2ed
        L4a3:
            java.lang.String r2 = "Ignoring region with unsupported extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L2ed
        L4ae:
            java.lang.String r1 = "Ignoring region without an extent"
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L2ed
        L4b5:
            java.lang.String r2 = "Ignoring region with malformed origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L2ed
        L4c0:
            java.lang.String r2 = "Ignoring region with unsupported origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L2ed
        L4cb:
            r17 = r2
            r38 = r5
            java.lang.String r1 = "Ignoring region without an origin"
            com.google.android.gms.internal.ads.zzea.zzf(r12, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L2ed
        L4d6:
            if (r1 == 0) goto L4dd
            java.lang.String r2 = r1.zza     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r6.put(r2, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
        L4dd:
            boolean r1 = com.google.android.gms.internal.ads.zzev.zzb(r4, r8)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L4e9
            r8 = r16
            r3 = r25
            goto L619
        L4e9:
            r11 = r16
            r2 = r17
            r5 = r38
            goto L26f
        L4f1:
            r38 = r5
            r16 = r11
            int r1 = r4.getAttributeCount()     // Catch: com.google.android.gms.internal.ads.zzakr -> L62c java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r2 = 0
            com.google.android.gms.internal.ads.zzaly r32 = zzf(r4, r2)     // Catch: com.google.android.gms.internal.ads.zzakr -> L62c java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = r2
            r35 = r33
            r34 = r20
            r29 = r27
            r36 = r29
            r39 = r36
            r5 = 0
        L510:
            if (r5 >= r1) goto L5c2
            java.lang.String r8 = r4.getAttributeName(r5)     // Catch: com.google.android.gms.internal.ads.zzakr -> L5b9 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.String r11 = r4.getAttributeValue(r5)     // Catch: com.google.android.gms.internal.ads.zzakr -> L5b9 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r13 = r8.hashCode()     // Catch: com.google.android.gms.internal.ads.zzakr -> L5b9 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r2 = 5
            switch(r13) {
                case -934795532: goto L553;
                case 99841: goto L549;
                case 100571: goto L53f;
                case 93616297: goto L535;
                case 109780401: goto L52d;
                case 1292595405: goto L523;
                default: goto L522;
            }
        L522:
            goto L55b
        L523:
            java.lang.String r13 = "backgroundImage"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L55b
            r8 = 5
            goto L55c
        L52d:
            boolean r8 = r8.equals(r14)
            if (r8 == 0) goto L55b
            r8 = 3
            goto L55c
        L535:
            java.lang.String r13 = "begin"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L55b
            r8 = 0
            goto L55c
        L53f:
            java.lang.String r13 = "end"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L55b
            r8 = 1
            goto L55c
        L549:
            java.lang.String r13 = "dur"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L55b
            r8 = 2
            goto L55c
        L553:
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L55b
            r8 = 4
            goto L55c
        L55b:
            r8 = -1
        L55c:
            if (r8 == 0) goto L5ab
            r13 = 1
            if (r8 == r13) goto L5a3
            r13 = 2
            if (r8 == r13) goto L59b
            r13 = 3
            if (r8 == r13) goto L589
            r13 = 4
            if (r8 == r13) goto L57f
            if (r8 == r2) goto L56e
        L56c:
            r2 = 1
            goto L593
        L56e:
            java.lang.String r2 = "#"
            boolean r2 = r11.startsWith(r2)     // Catch: com.google.android.gms.internal.ads.zzakr -> L57c java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r2 == 0) goto L56c
            r2 = 1
            java.lang.String r35 = r11.substring(r2)     // Catch: com.google.android.gms.internal.ads.zzakr -> L596 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L593
        L57c:
            r0 = move-exception
            r2 = 1
            goto L597
        L57f:
            r2 = 1
            boolean r8 = r6.containsKey(r11)     // Catch: com.google.android.gms.internal.ads.zzakr -> L596 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r8 == 0) goto L593
            r34 = r11
            goto L593
        L589:
            r2 = 1
            java.lang.String[] r8 = zzg(r11)     // Catch: com.google.android.gms.internal.ads.zzakr -> L596 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r11 = r8.length     // Catch: com.google.android.gms.internal.ads.zzakr -> L596 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r11 <= 0) goto L593
            r33 = r8
        L593:
            r8 = r16
            goto L5b2
        L596:
            r0 = move-exception
        L597:
            r1 = r0
            r8 = r16
            goto L5be
        L59b:
            r8 = r16
            r2 = 1
            long r39 = zzc(r11, r8)     // Catch: com.google.android.gms.internal.ads.zzakr -> L5e3 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L5b2
        L5a3:
            r8 = r16
            r2 = 1
            long r29 = zzc(r11, r8)     // Catch: com.google.android.gms.internal.ads.zzakr -> L5e3 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L5b2
        L5ab:
            r8 = r16
            r2 = 1
            long r36 = zzc(r11, r8)     // Catch: com.google.android.gms.internal.ads.zzakr -> L5e3 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
        L5b2:
            int r5 = r5 + 1
            r16 = r8
            r2 = 0
            goto L510
        L5b9:
            r0 = move-exception
            r8 = r16
            r2 = 1
        L5bd:
            r1 = r0
        L5be:
            r3 = r25
            goto L633
        L5c2:
            r8 = r16
            r2 = 1
            if (r9 == 0) goto L5e5
            long r13 = r9.zzd     // Catch: com.google.android.gms.internal.ads.zzakr -> L5e3 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r1 = (r13 > r27 ? 1 : (r13 == r27 ? 0 : -1))
            if (r1 == 0) goto L5e1
            int r1 = (r36 > r27 ? 1 : (r36 == r27 ? 0 : -1))
            if (r1 == 0) goto L5d4
            long r36 = r36 + r13
            goto L5d6
        L5d4:
            r36 = r27
        L5d6:
            int r1 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r1 == 0) goto L5dd
            long r29 = r29 + r13
            goto L5e1
        L5dd:
            r1 = r9
            r29 = r27
            goto L5e6
        L5e1:
            r1 = r9
            goto L5e6
        L5e3:
            r0 = move-exception
            goto L5bd
        L5e5:
            r1 = 0
        L5e6:
            int r3 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r3 != 0) goto L601
            int r3 = (r39 > r27 ? 1 : (r39 == r27 ? 0 : -1))
            if (r3 == 0) goto L5f3
            long r39 = r36 + r39
            r30 = r39
            goto L603
        L5f3:
            if (r1 == 0) goto L5fe
            long r13 = r1.zze     // Catch: com.google.android.gms.internal.ads.zzakr -> L5e3 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r3 = (r13 > r27 ? 1 : (r13 == r27 ? 0 : -1))
            if (r3 == 0) goto L5fe
            r30 = r13
            goto L603
        L5fe:
            r30 = r27
            goto L603
        L601:
            r30 = r29
        L603:
            java.lang.String r27 = r4.getName()     // Catch: com.google.android.gms.internal.ads.zzakr -> L628 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r28 = r36
            r36 = r1
            com.google.android.gms.internal.ads.zzals r1 = com.google.android.gms.internal.ads.zzals.zzb(r27, r28, r30, r32, r33, r34, r35, r36)     // Catch: com.google.android.gms.internal.ads.zzakr -> L628 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r3 = r25
            r3.push(r1)     // Catch: com.google.android.gms.internal.ads.zzakr -> L626 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r9 == 0) goto L619
            r9.zzf(r1)     // Catch: com.google.android.gms.internal.ads.zzakr -> L626 java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
        L619:
            r11 = r8
            r16 = r10
            r17 = r15
            r14 = r23
            r15 = r24
            r2 = r38
            goto L6a4
        L626:
            r0 = move-exception
            goto L632
        L628:
            r0 = move-exception
            r3 = r25
            goto L632
        L62c:
            r0 = move-exception
            r8 = r16
            r3 = r25
            r2 = 1
        L632:
            r1 = r0
        L633:
            java.lang.String r5 = "Suppressing parser error"
            com.google.android.gms.internal.ads.zzea.zzg(r12, r5, r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r11 = r8
            r16 = r10
            r17 = r15
            r14 = r23
            r2 = r38
        L641:
            r15 = 1
            goto L6a4
        L644:
            r26 = r2
            r38 = r5
            r3 = r8
            r23 = r14
            r24 = r15
            r2 = 4
            if (r10 != r2) goto L65f
            java.util.Objects.requireNonNull(r9)
            java.lang.String r1 = r4.getText()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzals r1 = com.google.android.gms.internal.ads.zzals.zzc(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r9.zzf(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L685
        L65f:
            r2 = 3
            if (r10 != r2) goto L685
            java.lang.String r2 = r4.getName()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            boolean r1 = r2.equals(r1)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            if (r1 == 0) goto L67d
            com.google.android.gms.internal.ads.zzalz r14 = new com.google.android.gms.internal.ads.zzalz     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.lang.Object r1 = r3.peek()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            com.google.android.gms.internal.ads.zzals r1 = (com.google.android.gms.internal.ads.zzals) r1     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            java.util.Objects.requireNonNull(r1)
            r2 = r38
            r14.<init>(r1, r2, r6, r7)     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L681
        L67d:
            r2 = r38
            r14 = r23
        L681:
            r3.pop()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            goto L6a2
        L685:
            r2 = r38
            goto L6a0
        L688:
            r20 = r1
            r26 = r2
            r2 = r5
            r3 = r8
            r23 = r14
            r24 = r15
            r1 = 2
            if (r10 != r1) goto L69a
            int r15 = r24 + 1
        L697:
            r14 = r23
            goto L6a4
        L69a:
            r1 = 3
            if (r10 != r1) goto L6a0
            int r15 = r24 + (-1)
            goto L697
        L6a0:
            r14 = r23
        L6a2:
            r15 = r24
        L6a4:
            r4.next()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            int r10 = r4.getEventType()     // Catch: java.io.IOException -> L6bc org.xmlpull.v1.XmlPullParserException -> L6c6
            r5 = r2
            r8 = r3
            r1 = r20
            r2 = r26
            r9 = 0
            r3 = r41
            goto L5d
        L6b6:
            r23 = r14
            java.util.Objects.requireNonNull(r23)
            return r23
        L6bc:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unexpected error when reading input."
            r2.<init>(r3, r1)
            throw r2
        L6c6:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unable to decode source"
            r2.<init>(r3, r1)
            throw r2
    }
}
