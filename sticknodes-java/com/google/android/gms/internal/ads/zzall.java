package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzall implements com.google.android.gms.internal.ads.zzakv {
    private static final java.util.regex.Pattern zza = null;
    private final boolean zzb;
    private final com.google.android.gms.internal.ads.zzalk zzc;
    private final com.google.android.gms.internal.ads.zzek zzd;
    private java.util.Map zze;
    private float zzf;
    private float zzg;

    static {
            java.lang.String r0 = "(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzall.zza = r0
            return
    }

    public zzall() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public zzall(java.util.List r4) {
            r3 = this;
            r3.<init>()
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3.zzf = r0
            r3.zzg = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r3.zzd = r0
            r0 = 0
            if (r4 == 0) goto L4a
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L4a
            r1 = 1
            r3.zzb = r1
            java.lang.Object r0 = r4.get(r0)
            byte[] r0 = (byte[]) r0
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeu.zzA(r0)
            java.lang.String r2 = "Format:"
            boolean r2 = r0.startsWith(r2)
            com.google.android.gms.internal.ads.zzdi.zzd(r2)
            com.google.android.gms.internal.ads.zzalk r0 = com.google.android.gms.internal.ads.zzalk.zza(r0)
            java.util.Objects.requireNonNull(r0)
            r3.zzc = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            java.lang.Object r4 = r4.get(r1)
            byte[] r4 = (byte[]) r4
            r0.<init>(r4)
            java.nio.charset.Charset r4 = com.google.android.gms.internal.ads.zzfxo.zzc
            r3.zze(r0, r4)
            return
        L4a:
            r3.zzb = r0
            r4 = 0
            r3.zzc = r4
            return
    }

    private static float zzb(int r1) {
            if (r1 == 0) goto L13
            r0 = 1
            if (r1 == r0) goto L10
            r0 = 2
            if (r1 == r0) goto Lc
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            return r1
        Lc:
            r1 = 1064514355(0x3f733333, float:0.95)
            return r1
        L10:
            r1 = 1056964608(0x3f000000, float:0.5)
            return r1
        L13:
            r1 = 1028443341(0x3d4ccccd, float:0.05)
            return r1
    }

    private static int zzc(long r4, java.util.List r6, java.util.List r7) {
            int r0 = r6.size()
        L4:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L28
            java.lang.Object r1 = r6.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L17
            return r0
        L17:
            java.lang.Object r1 = r6.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 >= 0) goto L4
            int r0 = r0 + 1
            goto L29
        L28:
            r0 = 0
        L29:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r6.add(r0, r4)
            if (r0 != 0) goto L38
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L46
        L38:
            int r4 = r0 + (-1)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Object r4 = r7.get(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            r5.<init>(r4)
            r4 = r5
        L46:
            r7.add(r0, r4)
            return r0
    }

    private static long zzd(java.lang.String r10) {
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzall.zza
            java.lang.String r10 = r10.trim()
            java.util.regex.Matcher r10 = r0.matcher(r10)
            boolean r0 = r10.matches()
            if (r0 != 0) goto L16
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
        L16:
            r0 = 1
            java.lang.String r0 = r10.group(r0)
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            long r0 = java.lang.Long.parseLong(r0)
            r2 = 3600000000(0xd693a400, double:1.778636325E-314)
            long r0 = r0 * r2
            r2 = 2
            java.lang.String r2 = r10.group(r2)
            long r2 = java.lang.Long.parseLong(r2)
            r4 = 60000000(0x3938700, double:2.96439388E-316)
            long r2 = r2 * r4
            r4 = 3
            java.lang.String r4 = r10.group(r4)
            long r4 = java.lang.Long.parseLong(r4)
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            r6 = 4
            java.lang.String r10 = r10.group(r6)
            long r6 = java.lang.Long.parseLong(r10)
            r8 = 10000(0x2710, double:4.9407E-320)
            long r6 = r6 * r8
            long r0 = r0 + r2
            long r0 = r0 + r4
            long r0 = r0 + r6
            return r0
    }

    private final void zze(com.google.android.gms.internal.ads.zzek r7, java.nio.charset.Charset r8) {
            r6 = this;
        L0:
            java.lang.String r0 = r7.zzz(r8)
            if (r0 == 0) goto Ldf
            java.lang.String r1 = "[Script Info]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            r2 = 91
            if (r1 == 0) goto L75
        L10:
            java.lang.String r0 = r7.zzz(r8)
            if (r0 == 0) goto L0
            int r1 = r7.zzb()
            if (r1 == 0) goto L22
            char r1 = r7.zza(r8)
            if (r1 == r2) goto L0
        L22:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L10
            r1 = 0
            r3 = r0[r1]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfxi.zza(r3)
            int r4 = r3.hashCode()
            r5 = 1
            switch(r4) {
                case 1879649548: goto L4a;
                case 1879649549: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L53
        L40:
            java.lang.String r1 = "playresy"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L53
            r1 = 1
            goto L54
        L4a:
            java.lang.String r4 = "playresx"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L53
            goto L54
        L53:
            r1 = -1
        L54:
            if (r1 == 0) goto L68
            if (r1 == r5) goto L59
            goto L10
        L59:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L66
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L66
            r6.zzg = r0     // Catch: java.lang.NumberFormatException -> L66
            goto L10
        L66:
            goto L10
        L68:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L66
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L66
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L66
            r6.zzf = r0     // Catch: java.lang.NumberFormatException -> L66
            goto L10
        L75:
            java.lang.String r1 = "[V4+ Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r3 = "SsaParser"
            if (r1 == 0) goto Lc8
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L85:
            java.lang.String r4 = r7.zzz(r8)
            if (r4 == 0) goto Lc4
            int r5 = r7.zzb()
            if (r5 == 0) goto L97
            char r5 = r7.zza(r8)
            if (r5 == r2) goto Lc4
        L97:
            java.lang.String r5 = "Format:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto La4
            com.google.android.gms.internal.ads.zzalm r1 = com.google.android.gms.internal.ads.zzalm.zza(r4)
            goto L85
        La4:
            java.lang.String r5 = "Style:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L85
            if (r1 != 0) goto Lb8
            java.lang.String r5 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.internal.ads.zzea.zzf(r3, r4)
            goto L85
        Lb8:
            com.google.android.gms.internal.ads.zzalo r4 = com.google.android.gms.internal.ads.zzalo.zzb(r4, r1)
            if (r4 == 0) goto L85
            java.lang.String r5 = r4.zza
            r0.put(r5, r4)
            goto L85
        Lc4:
            r6.zze = r0
            goto L0
        Lc8:
            java.lang.String r1 = "[V4 Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto Ld7
            java.lang.String r0 = "[V4 Styles] are not supported"
            com.google.android.gms.internal.ads.zzea.zze(r3, r0)
            goto L0
        Ld7:
            java.lang.String r1 = "[Events]"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L0
        Ldf:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] r24, int r25, int r26, com.google.android.gms.internal.ads.zzaku r27, com.google.android.gms.internal.ads.zzdn r28) {
            r23 = this;
            r0 = r23
            r1 = r25
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1 + r26
            com.google.android.gms.internal.ads.zzek r5 = r0.zzd
            r6 = r24
            r5.zzJ(r6, r4)
            com.google.android.gms.internal.ads.zzek r4 = r0.zzd
            r4.zzL(r1)
            com.google.android.gms.internal.ads.zzek r1 = r0.zzd
            java.nio.charset.Charset r1 = r1.zzC()
            if (r1 != 0) goto L26
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.zzfxo.zzc
        L26:
            boolean r4 = r0.zzb
            if (r4 != 0) goto L2f
            com.google.android.gms.internal.ads.zzek r4 = r0.zzd
            r0.zze(r4, r1)
        L2f:
            com.google.android.gms.internal.ads.zzek r4 = r0.zzd
            boolean r5 = r0.zzb
            if (r5 == 0) goto L38
            com.google.android.gms.internal.ads.zzalk r5 = r0.zzc
            goto L39
        L38:
            r5 = 0
        L39:
            java.lang.String r7 = r4.zzz(r1)
            r8 = -1
            if (r7 == 0) goto L28f
            java.lang.String r11 = "Format:"
            boolean r11 = r7.startsWith(r11)
            if (r11 == 0) goto L4d
            com.google.android.gms.internal.ads.zzalk r5 = com.google.android.gms.internal.ads.zzalk.zza(r7)
            goto L39
        L4d:
            java.lang.String r11 = "Dialogue:"
            boolean r12 = r7.startsWith(r11)
            if (r12 == 0) goto L27f
            java.lang.String r12 = "SsaParser"
            if (r5 != 0) goto L64
            java.lang.String r8 = "Skipping dialogue line before complete format: "
            java.lang.String r7 = r8.concat(r7)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r7)
            goto L27f
        L64:
            boolean r11 = r7.startsWith(r11)
            com.google.android.gms.internal.ads.zzdi.zzd(r11)
            r11 = 9
            java.lang.String r11 = r7.substring(r11)
            int r13 = r5.zze
            java.lang.String r14 = ","
            java.lang.String[] r11 = r11.split(r14, r13)
            int r13 = r11.length
            int r14 = r5.zze
            if (r13 == r14) goto L89
            java.lang.String r8 = "Skipping dialogue line with fewer columns than format: "
            java.lang.String r7 = r8.concat(r7)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r7)
            goto L27f
        L89:
            int r13 = r5.zza
            r13 = r11[r13]
            long r13 = zzd(r13)
            java.lang.String r15 = "Skipping invalid timing: "
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r18 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r18 != 0) goto La5
            java.lang.String r7 = r15.concat(r7)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r7)
            goto L27f
        La5:
            int r6 = r5.zzb
            r6 = r11[r6]
            long r9 = zzd(r6)
            int r6 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r6 != 0) goto Lba
            java.lang.String r6 = r15.concat(r7)
            com.google.android.gms.internal.ads.zzea.zzf(r12, r6)
            goto L27f
        Lba:
            java.util.Map r6 = r0.zze
            if (r6 == 0) goto Lcf
            int r7 = r5.zzc
            if (r7 == r8) goto Lcf
            r7 = r11[r7]
            java.lang.String r7 = r7.trim()
            java.lang.Object r6 = r6.get(r7)
            com.google.android.gms.internal.ads.zzalo r6 = (com.google.android.gms.internal.ads.zzalo) r6
            goto Ld0
        Lcf:
            r6 = 0
        Ld0:
            int r7 = r5.zzd
            r7 = r11[r7]
            com.google.android.gms.internal.ads.zzaln r11 = com.google.android.gms.internal.ads.zzaln.zza(r7)
            java.lang.String r7 = com.google.android.gms.internal.ads.zzaln.zzb(r7)
            java.lang.String r15 = "\\N"
            java.lang.String r8 = "\n"
            java.lang.String r7 = r7.replace(r15, r8)
            java.lang.String r15 = "\\n"
            java.lang.String r7 = r7.replace(r15, r8)
            java.lang.String r8 = "\\h"
            java.lang.String r15 = " "
            java.lang.String r7 = r7.replace(r8, r15)
            float r8 = r0.zzf
            float r15 = r0.zzg
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r7)
            com.google.android.gms.internal.ads.zzcz r7 = new com.google.android.gms.internal.ads.zzcz
            r7.<init>()
            r7.zzl(r0)
            r16 = r1
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r6 == 0) goto L1b7
            java.lang.Integer r1 = r6.zzc
            r19 = r4
            if (r1 == 0) goto L128
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            int r1 = r1.intValue()
            r4.<init>(r1)
            int r1 = r0.length()
            r20 = r5
            r21 = r9
            r5 = 33
            r9 = 0
            r0.setSpan(r4, r9, r1, r5)
            goto L12c
        L128:
            r20 = r5
            r21 = r9
        L12c:
            int r1 = r6.zzj
            r4 = 3
            if (r1 != r4) goto L148
            java.lang.Integer r1 = r6.zzd
            if (r1 == 0) goto L148
            android.text.style.BackgroundColorSpan r5 = new android.text.style.BackgroundColorSpan
            int r1 = r1.intValue()
            r5.<init>(r1)
            int r1 = r0.length()
            r9 = 33
            r10 = 0
            r0.setSpan(r5, r10, r1, r9)
        L148:
            float r1 = r6.zze
            int r5 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r5 == 0) goto L157
            int r5 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r5 == 0) goto L157
            float r1 = r1 / r15
            r5 = 1
            r7.zzn(r1, r5)
        L157:
            boolean r1 = r6.zzf
            if (r1 == 0) goto L180
            boolean r1 = r6.zzg
            if (r1 == 0) goto L16f
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r4)
            int r4 = r0.length()
            r5 = 33
            r9 = 0
            r0.setSpan(r1, r9, r4, r5)
            goto L195
        L16f:
            r5 = 33
            r9 = 0
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r4 = 1
            r1.<init>(r4)
            int r4 = r0.length()
            r0.setSpan(r1, r9, r4, r5)
            goto L195
        L180:
            r5 = 33
            r9 = 0
            boolean r1 = r6.zzg
            if (r1 == 0) goto L195
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r4 = 2
            r1.<init>(r4)
            int r10 = r0.length()
            r0.setSpan(r1, r9, r10, r5)
            goto L196
        L195:
            r4 = 2
        L196:
            boolean r1 = r6.zzh
            if (r1 == 0) goto L1a6
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            int r10 = r0.length()
            r0.setSpan(r1, r9, r10, r5)
        L1a6:
            boolean r1 = r6.zzi
            if (r1 == 0) goto L1be
            android.text.style.StrikethroughSpan r1 = new android.text.style.StrikethroughSpan
            r1.<init>()
            int r10 = r0.length()
            r0.setSpan(r1, r9, r10, r5)
            goto L1be
        L1b7:
            r19 = r4
            r20 = r5
            r21 = r9
            r4 = 2
        L1be:
            int r0 = r11.zza
            r1 = -1
            if (r0 == r1) goto L1c4
            goto L1ca
        L1c4:
            if (r6 == 0) goto L1c9
            int r0 = r6.zzb
            goto L1ca
        L1c9:
            r0 = -1
        L1ca:
            java.lang.String r1 = "Unknown alignment: "
            switch(r0) {
                case -1: goto L1eb;
                case 0: goto L1cf;
                case 1: goto L1e8;
                case 2: goto L1e5;
                case 3: goto L1e2;
                case 4: goto L1e8;
                case 5: goto L1e5;
                case 6: goto L1e2;
                case 7: goto L1e8;
                case 8: goto L1e5;
                case 9: goto L1e2;
                default: goto L1cf;
            }
        L1cf:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r5)
            goto L1eb
        L1e2:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L1ec
        L1e5:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L1ec
        L1e8:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L1ec
        L1eb:
            r5 = 0
        L1ec:
            r7.zzm(r5)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case -1: goto L20d;
                case 0: goto L1f4;
                case 1: goto L20b;
                case 2: goto L209;
                case 3: goto L207;
                case 4: goto L20b;
                case 5: goto L209;
                case 6: goto L207;
                case 7: goto L20b;
                case 8: goto L209;
                case 9: goto L207;
                default: goto L1f4;
            }
        L1f4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r5)
            goto L20d
        L207:
            r5 = 2
            goto L20f
        L209:
            r5 = 1
            goto L20f
        L20b:
            r5 = 0
            goto L20f
        L20d:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L20f:
            r7.zzi(r5)
            switch(r0) {
                case -1: goto L22d;
                case 0: goto L215;
                case 1: goto L22c;
                case 2: goto L22c;
                case 3: goto L22c;
                case 4: goto L22a;
                case 5: goto L22a;
                case 6: goto L22a;
                case 7: goto L228;
                case 8: goto L228;
                case 9: goto L228;
                default: goto L215;
            }
        L215:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r12, r0)
            goto L22d
        L228:
            r9 = 0
            goto L22d
        L22a:
            r9 = 1
            goto L22d
        L22c:
            r9 = 2
        L22d:
            r7.zzf(r9)
            android.graphics.PointF r0 = r11.zzb
            if (r0 == 0) goto L24c
            int r1 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r1 == 0) goto L24c
            int r1 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r1 == 0) goto L24c
            float r0 = r0.x
            float r0 = r0 / r8
            r7.zzh(r0)
            android.graphics.PointF r0 = r11.zzb
            float r0 = r0.y
            float r0 = r0 / r15
            r9 = 0
            r7.zze(r0, r9)
            goto L263
        L24c:
            r9 = 0
            int r0 = r7.zzb()
            float r0 = zzb(r0)
            r7.zzh(r0)
            int r0 = r7.zza()
            float r0 = zzb(r0)
            r7.zze(r0, r9)
        L263:
            com.google.android.gms.internal.ads.zzdb r0 = r7.zzp()
            int r1 = zzc(r13, r3, r2)
            r4 = r21
            int r4 = zzc(r4, r3, r2)
        L271:
            if (r1 >= r4) goto L285
            java.lang.Object r5 = r2.get(r1)
            java.util.List r5 = (java.util.List) r5
            r5.add(r0)
            int r1 = r1 + 1
            goto L271
        L27f:
            r16 = r1
            r19 = r4
            r20 = r5
        L285:
            r0 = r23
            r1 = r16
            r4 = r19
            r5 = r20
            goto L39
        L28f:
            r9 = 0
            r0 = 0
        L291:
            int r1 = r2.size()
            if (r0 >= r1) goto L2ea
            java.lang.Object r1 = r2.get(r0)
            r11 = r1
            java.util.List r11 = (java.util.List) r11
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L2ac
            if (r0 == 0) goto L2ab
            r5 = r28
            r1 = 1
            r4 = -1
            goto L2e2
        L2ab:
            r0 = 0
        L2ac:
            int r1 = r2.size()
            r4 = -1
            int r1 = r1 + r4
            if (r0 == r1) goto L2e4
            java.lang.Object r1 = r3.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r12 = r1.longValue()
            int r1 = r0 + 1
            java.lang.Object r1 = r3.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            java.lang.Object r1 = r3.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            long r14 = r5 - r7
            com.google.android.gms.internal.ads.zzakn r1 = new com.google.android.gms.internal.ads.zzakn
            r10 = r1
            r10.<init>(r11, r12, r14)
            r5 = r28
            r5.zza(r1)
            r1 = 1
        L2e2:
            int r0 = r0 + r1
            goto L291
        L2e4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2ea:
            return
    }
}
