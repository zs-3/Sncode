package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaml {
    public static final java.util.regex.Pattern zza = null;
    private static final java.util.regex.Pattern zzb = null;
    private static final java.util.Map zzc = null;
    private static final java.util.Map zzd = null;

    static {
            java.lang.String r0 = "^(\\S+)\\s+-->\\s+(\\S+)(.*)?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzaml.zza = r0
            java.lang.String r0 = "(\\S+?):(\\S+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzaml.zzb = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 255(0xff, float:3.57E-43)
            int r2 = android.graphics.Color.rgb(r1, r1, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "white"
            r0.put(r3, r2)
            r2 = 0
            int r3 = android.graphics.Color.rgb(r2, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "lime"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r1, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "cyan"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "red"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "yellow"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "magenta"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "blue"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r2, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "black"
            r0.put(r4, r3)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.google.android.gms.internal.ads.zzaml.zzc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = android.graphics.Color.rgb(r1, r1, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_white"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_lime"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r2, r1, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_cyan"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_red"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r1, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_yellow"
            r0.put(r4, r3)
            int r3 = android.graphics.Color.rgb(r1, r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "bg_magenta"
            r0.put(r4, r3)
            int r1 = android.graphics.Color.rgb(r2, r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "bg_blue"
            r0.put(r3, r1)
            int r1 = android.graphics.Color.rgb(r2, r2, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "bg_black"
            r0.put(r2, r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.google.android.gms.internal.ads.zzaml.zzd = r0
            return
    }

    static android.text.SpannedString zza(java.lang.String r17, java.lang.String r18, java.util.List r19) {
            r0 = r17
            r1 = r18
            r2 = r19
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
        L17:
            int r8 = r18.length()
            if (r7 < r8) goto L3d
        L1d:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L2d
            java.lang.Object r1 = r4.pop()
            com.google.android.gms.internal.ads.zzami r1 = (com.google.android.gms.internal.ads.zzami) r1
            zzg(r0, r1, r5, r3, r2)
            goto L1d
        L2d:
            com.google.android.gms.internal.ads.zzami r1 = com.google.android.gms.internal.ads.zzami.zzb()
            java.util.List r4 = java.util.Collections.emptyList()
            zzg(r0, r1, r4, r3, r2)
            android.text.SpannedString r0 = android.text.SpannedString.valueOf(r3)
            return r0
        L3d:
            int r8 = r7 + 1
            char r9 = r1.charAt(r7)
            r10 = 62
            r11 = 60
            r12 = 38
            r14 = 2
            r15 = -1
            r13 = 1
            if (r9 == r12) goto L170
            if (r9 == r11) goto L55
            r3.append(r9)
            goto L20e
        L55:
            int r9 = r18.length()
            if (r8 < r9) goto L5d
            goto L20e
        L5d:
            char r9 = r1.charAt(r8)
            int r8 = r1.indexOf(r10, r8)
            if (r8 != r15) goto L6c
            int r8 = r18.length()
            goto L6e
        L6c:
            int r8 = r8 + 1
        L6e:
            int r10 = r8 + (-2)
            char r11 = r1.charAt(r10)
            r12 = 47
            if (r11 != r12) goto L7a
            r11 = 1
            goto L7b
        L7a:
            r11 = 0
        L7b:
            if (r9 != r12) goto L80
            r16 = 2
            goto L82
        L80:
            r16 = 1
        L82:
            int r7 = r7 + r16
            if (r11 == 0) goto L87
            goto L89
        L87:
            int r10 = r8 + (-1)
        L89:
            java.lang.String r7 = r1.substring(r7, r10)
            java.lang.String r10 = r7.trim()
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L99
            goto L20e
        L99:
            java.lang.String r10 = r7.trim()
            boolean r16 = r10.isEmpty()
            r16 = r16 ^ 1
            com.google.android.gms.internal.ads.zzdi.zzd(r16)
            int r16 = com.google.android.gms.internal.ads.zzeu.zza
            java.lang.String r13 = "[ \\.]"
            java.lang.String[] r10 = r10.split(r13, r14)
            r10 = r10[r6]
            int r13 = r10.hashCode()
            r6 = 98
            if (r13 == r6) goto L11d
            r6 = 99
            if (r13 == r6) goto L113
            r6 = 105(0x69, float:1.47E-43)
            if (r13 == r6) goto L109
            r6 = 3650(0xe42, float:5.115E-42)
            if (r13 == r6) goto Lff
            r6 = 3314158(0x3291ee, float:4.644125E-39)
            if (r13 == r6) goto Lf5
            r6 = 3511770(0x3595da, float:4.921038E-39)
            if (r13 == r6) goto Leb
            r6 = 117(0x75, float:1.64E-43)
            if (r13 == r6) goto Le1
            r6 = 118(0x76, float:1.65E-43)
            if (r13 == r6) goto Ld7
            goto L127
        Ld7:
            java.lang.String r6 = "v"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L127
            r13 = 7
            goto L128
        Le1:
            java.lang.String r6 = "u"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L127
            r13 = 6
            goto L128
        Leb:
            java.lang.String r6 = "ruby"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L127
            r13 = 4
            goto L128
        Lf5:
            java.lang.String r6 = "lang"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L127
            r13 = 3
            goto L128
        Lff:
            java.lang.String r6 = "rt"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L127
            r13 = 5
            goto L128
        L109:
            java.lang.String r6 = "i"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L127
            r13 = 2
            goto L128
        L113:
            java.lang.String r6 = "c"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L127
            r13 = 1
            goto L128
        L11d:
            java.lang.String r6 = "b"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L127
            r13 = 0
            goto L128
        L127:
            r13 = -1
        L128:
            switch(r13) {
                case 0: goto L12d;
                case 1: goto L12d;
                case 2: goto L12d;
                case 3: goto L12d;
                case 4: goto L12d;
                case 5: goto L12d;
                case 6: goto L12d;
                case 7: goto L12d;
                default: goto L12b;
            }
        L12b:
            goto L20e
        L12d:
            if (r9 != r12) goto L161
        L12f:
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L137
            goto L20e
        L137:
            java.lang.Object r6 = r4.pop()
            com.google.android.gms.internal.ads.zzami r6 = (com.google.android.gms.internal.ads.zzami) r6
            zzg(r0, r6, r5, r3, r2)
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L154
            com.google.android.gms.internal.ads.zzamh r7 = new com.google.android.gms.internal.ads.zzamh
            int r9 = r3.length()
            r11 = 0
            r7.<init>(r6, r9, r11)
            r5.add(r7)
            goto L157
        L154:
            r5.clear()
        L157:
            java.lang.String r6 = r6.zza
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L12f
            goto L20e
        L161:
            if (r11 != 0) goto L20e
            int r6 = r3.length()
            com.google.android.gms.internal.ads.zzami r6 = com.google.android.gms.internal.ads.zzami.zza(r7, r6)
            r4.push(r6)
            goto L20e
        L170:
            r6 = 59
            int r6 = r1.indexOf(r6, r8)
            r7 = 32
            int r13 = r1.indexOf(r7, r8)
            if (r6 != r15) goto L180
            r6 = r13
            goto L186
        L180:
            if (r13 == r15) goto L186
            int r6 = java.lang.Math.min(r6, r13)
        L186:
            if (r6 == r15) goto L20b
            java.lang.String r8 = r1.substring(r8, r6)
            int r9 = r8.hashCode()
            r15 = 3309(0xced, float:4.637E-42)
            if (r9 == r15) goto L1c1
            r15 = 3464(0xd88, float:4.854E-42)
            if (r9 == r15) goto L1b7
            r15 = 96708(0x179c4, float:1.35517E-40)
            if (r9 == r15) goto L1ad
            r15 = 3374865(0x337f11, float:4.729193E-39)
            if (r9 == r15) goto L1a3
            goto L1cb
        L1a3:
            java.lang.String r9 = "nbsp"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L1cb
            r15 = 2
            goto L1cc
        L1ad:
            java.lang.String r9 = "amp"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L1cb
            r15 = 3
            goto L1cc
        L1b7:
            java.lang.String r9 = "lt"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L1cb
            r15 = 0
            goto L1cc
        L1c1:
            java.lang.String r9 = "gt"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L1cb
            r15 = 1
            goto L1cc
        L1cb:
            r15 = -1
        L1cc:
            if (r15 == 0) goto L1fe
            r9 = 1
            if (r15 == r9) goto L1fa
            if (r15 == r14) goto L1f6
            r9 = 3
            if (r15 == r9) goto L1f2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "ignoring unsupported entity: '&"
            r7.append(r9)
            r7.append(r8)
            java.lang.String r8 = ";'"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "WebvttCueParser"
            com.google.android.gms.internal.ads.zzea.zzf(r8, r7)
            goto L201
        L1f2:
            r3.append(r12)
            goto L201
        L1f6:
            r3.append(r7)
            goto L201
        L1fa:
            r3.append(r10)
            goto L201
        L1fe:
            r3.append(r11)
        L201:
            if (r6 != r13) goto L208
            java.lang.String r7 = " "
            r3.append(r7)
        L208:
            int r7 = r6 + 1
            goto L20f
        L20b:
            r3.append(r9)
        L20e:
            r7 = r8
        L20f:
            r6 = 0
            goto L17
    }

    static com.google.android.gms.internal.ads.zzcz zzb(java.lang.String r1) {
            com.google.android.gms.internal.ads.zzamk r0 = new com.google.android.gms.internal.ads.zzamk
            r0.<init>()
            zzh(r1, r0)
            com.google.android.gms.internal.ads.zzcz r1 = r0.zza()
            return r1
    }

    public static com.google.android.gms.internal.ads.zzame zzc(com.google.android.gms.internal.ads.zzek r5, java.util.List r6) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r5.zzz(r0)
            r1 = 0
            if (r0 != 0) goto La
            goto L31
        La:
            java.util.regex.Pattern r2 = com.google.android.gms.internal.ads.zzaml.zza
            java.util.regex.Matcher r3 = r2.matcher(r0)
            boolean r4 = r3.matches()
            if (r4 != 0) goto L32
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r3 = r5.zzz(r3)
            if (r3 == 0) goto L31
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L31
            java.lang.String r0 = r0.trim()
            com.google.android.gms.internal.ads.zzame r5 = zze(r0, r2, r5, r6)
            return r5
        L31:
            return r1
        L32:
            com.google.android.gms.internal.ads.zzame r5 = zze(r1, r3, r5, r6)
            return r5
    }

    private static int zzd(java.util.List r2, java.lang.String r3, com.google.android.gms.internal.ads.zzami r4) {
            java.util.List r2 = zzf(r2, r3, r4)
            r3 = 0
        L5:
            int r4 = r2.size()
            r0 = -1
            if (r3 >= r4) goto L22
            java.lang.Object r4 = r2.get(r3)
            com.google.android.gms.internal.ads.zzamj r4 = (com.google.android.gms.internal.ads.zzamj) r4
            com.google.android.gms.internal.ads.zzamd r4 = r4.zzb
            int r1 = r4.zze()
            if (r1 == r0) goto L1f
            int r2 = r4.zze()
            return r2
        L1f:
            int r3 = r3 + 1
            goto L5
        L22:
            return r0
    }

    private static com.google.android.gms.internal.ads.zzame zze(java.lang.String r7, java.util.regex.Matcher r8, com.google.android.gms.internal.ads.zzek r9, java.util.List r10) {
            com.google.android.gms.internal.ads.zzamk r0 = new com.google.android.gms.internal.ads.zzamk
            r0.<init>()
            r1 = 1
            java.lang.String r1 = r8.group(r1)     // Catch: java.lang.NumberFormatException -> L73
            java.util.Objects.requireNonNull(r1)
            long r1 = com.google.android.gms.internal.ads.zzamn.zzb(r1)     // Catch: java.lang.NumberFormatException -> L73
            r0.zza = r1     // Catch: java.lang.NumberFormatException -> L73
            r1 = 2
            java.lang.String r1 = r8.group(r1)     // Catch: java.lang.NumberFormatException -> L73
            java.util.Objects.requireNonNull(r1)
            long r1 = com.google.android.gms.internal.ads.zzamn.zzb(r1)     // Catch: java.lang.NumberFormatException -> L73
            r0.zzb = r1     // Catch: java.lang.NumberFormatException -> L73
            r1 = 3
            java.lang.String r8 = r8.group(r1)
            java.util.Objects.requireNonNull(r8)
            zzh(r8, r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = r9.zzz(r1)
        L37:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L56
            int r2 = r8.length()
            if (r2 <= 0) goto L48
            java.lang.String r2 = "\n"
            r8.append(r2)
        L48:
            java.lang.String r1 = r1.trim()
            r8.append(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = r9.zzz(r1)
            goto L37
        L56:
            java.lang.String r8 = r8.toString()
            android.text.SpannedString r7 = zza(r7, r8, r10)
            r0.zzc = r7
            com.google.android.gms.internal.ads.zzame r7 = new com.google.android.gms.internal.ads.zzame
            com.google.android.gms.internal.ads.zzcz r8 = r0.zza()
            com.google.android.gms.internal.ads.zzdb r2 = r8.zzp()
            long r3 = r0.zza
            long r5 = r0.zzb
            r1 = r7
            r1.<init>(r2, r3, r5)
            return r7
        L73:
            java.lang.String r7 = r8.group()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Skipping cue with bad header: "
            java.lang.String r7 = r8.concat(r7)
            java.lang.String r8 = "WebvttCueParser"
            com.google.android.gms.internal.ads.zzea.zzf(r8, r7)
            r7 = 0
            return r7
    }

    private static java.util.List zzf(java.util.List r6, java.lang.String r7, com.google.android.gms.internal.ads.zzami r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r6.size()
            if (r1 >= r2) goto L29
            java.lang.Object r2 = r6.get(r1)
            com.google.android.gms.internal.ads.zzamd r2 = (com.google.android.gms.internal.ads.zzamd) r2
            java.lang.String r3 = r8.zza
            java.util.Set r4 = r8.zzd
            java.lang.String r5 = r8.zzc
            int r3 = r2.zzf(r7, r3, r4, r5)
            if (r3 <= 0) goto L26
            com.google.android.gms.internal.ads.zzamj r4 = new com.google.android.gms.internal.ads.zzamj
            r4.<init>(r3, r2)
            r0.add(r4)
        L26:
            int r1 = r1 + 1
            goto L6
        L29:
            java.util.Collections.sort(r0)
            return r0
    }

    private static void zzg(java.lang.String r18, com.google.android.gms.internal.ads.zzami r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r22
            int r4 = r1.zzb
            int r5 = r21.length()
            java.lang.String r6 = r1.zza
            int r7 = r6.hashCode()
            r9 = 2
            r11 = -1
            if (r7 == 0) goto L7d
            r13 = 105(0x69, float:1.47E-43)
            if (r7 == r13) goto L73
            r13 = 3314158(0x3291ee, float:4.644125E-39)
            if (r7 == r13) goto L69
            r13 = 3511770(0x3595da, float:4.921038E-39)
            if (r7 == r13) goto L5f
            r13 = 98
            if (r7 == r13) goto L55
            r13 = 99
            if (r7 == r13) goto L4b
            r13 = 117(0x75, float:1.64E-43)
            if (r7 == r13) goto L41
            r13 = 118(0x76, float:1.65E-43)
            if (r7 == r13) goto L37
            goto L87
        L37:
            java.lang.String r7 = "v"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L87
            r6 = 6
            goto L88
        L41:
            java.lang.String r7 = "u"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L87
            r6 = 3
            goto L88
        L4b:
            java.lang.String r7 = "c"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L87
            r6 = 4
            goto L88
        L55:
            java.lang.String r7 = "b"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L87
            r6 = 0
            goto L88
        L5f:
            java.lang.String r7 = "ruby"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L87
            r6 = 2
            goto L88
        L69:
            java.lang.String r7 = "lang"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L87
            r6 = 5
            goto L88
        L73:
            java.lang.String r7 = "i"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L87
            r6 = 1
            goto L88
        L7d:
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L87
            r6 = 7
            goto L88
        L87:
            r6 = -1
        L88:
            r7 = 33
            switch(r6) {
                case 0: goto L164;
                case 1: goto L15b;
                case 2: goto Le1;
                case 3: goto Ld7;
                case 4: goto L8f;
                case 5: goto L16d;
                case 6: goto L16d;
                case 7: goto L16d;
                default: goto L8d;
            }
        L8d:
            goto L22b
        L8f:
            java.util.Set r6 = r1.zzd
            java.util.Iterator r6 = r6.iterator()
        L95:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L16d
            java.lang.Object r13 = r6.next()
            java.lang.String r13 = (java.lang.String) r13
            java.util.Map r14 = com.google.android.gms.internal.ads.zzaml.zzc
            boolean r15 = r14.containsKey(r13)
            if (r15 == 0) goto Lbc
            java.lang.Object r13 = r14.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            android.text.style.ForegroundColorSpan r14 = new android.text.style.ForegroundColorSpan
            r14.<init>(r13)
            r2.setSpan(r14, r4, r5, r7)
            goto L95
        Lbc:
            java.util.Map r14 = com.google.android.gms.internal.ads.zzaml.zzd
            boolean r15 = r14.containsKey(r13)
            if (r15 == 0) goto L95
            java.lang.Object r13 = r14.get(r13)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            android.text.style.BackgroundColorSpan r14 = new android.text.style.BackgroundColorSpan
            r14.<init>(r13)
            r2.setSpan(r14, r4, r5, r7)
            goto L95
        Ld7:
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r2.setSpan(r6, r4, r5, r7)
            goto L16d
        Le1:
            int r6 = zzd(r3, r0, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r20.size()
            r13.<init>(r14)
            r14 = r20
            r13.addAll(r14)
            java.util.Comparator r14 = com.google.android.gms.internal.ads.zzamh.zzd()
            java.util.Collections.sort(r13, r14)
            int r14 = r1.zzb
            r15 = 0
            r16 = 0
        Lff:
            int r10 = r13.size()
            if (r15 >= r10) goto L16d
            java.lang.Object r10 = r13.get(r15)
            com.google.android.gms.internal.ads.zzamh r10 = (com.google.android.gms.internal.ads.zzamh) r10
            com.google.android.gms.internal.ads.zzami r10 = com.google.android.gms.internal.ads.zzamh.zzc(r10)
            java.lang.String r10 = r10.zza
            java.lang.String r8 = "rt"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L157
            java.lang.Object r8 = r13.get(r15)
            com.google.android.gms.internal.ads.zzamh r8 = (com.google.android.gms.internal.ads.zzamh) r8
            com.google.android.gms.internal.ads.zzami r10 = com.google.android.gms.internal.ads.zzamh.zzc(r8)
            int r10 = zzd(r3, r0, r10)
            if (r10 == r11) goto L12a
            goto L12f
        L12a:
            if (r6 == r11) goto L12e
            r10 = r6
            goto L12f
        L12e:
            r10 = 1
        L12f:
            com.google.android.gms.internal.ads.zzami r11 = com.google.android.gms.internal.ads.zzamh.zzc(r8)
            int r11 = r11.zzb
            int r11 = r11 - r16
            int r8 = com.google.android.gms.internal.ads.zzamh.zza(r8)
            int r8 = r8 - r16
            java.lang.CharSequence r17 = r2.subSequence(r11, r8)
            r2.delete(r11, r8)
            com.google.android.gms.internal.ads.zzdf r8 = new com.google.android.gms.internal.ads.zzdf
            java.lang.String r12 = r17.toString()
            r8.<init>(r12, r10)
            r2.setSpan(r8, r14, r11, r7)
            int r8 = r17.length()
            int r16 = r16 + r8
            r14 = r11
        L157:
            int r15 = r15 + 1
            r11 = -1
            goto Lff
        L15b:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r9)
            r2.setSpan(r6, r4, r5, r7)
            goto L16d
        L164:
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r8 = 1
            r6.<init>(r8)
            r2.setSpan(r6, r4, r5, r7)
        L16d:
            java.util.List r0 = zzf(r3, r0, r1)
            r10 = 0
        L172:
            int r1 = r0.size()
            if (r10 >= r1) goto L22b
            java.lang.Object r1 = r0.get(r10)
            com.google.android.gms.internal.ads.zzamj r1 = (com.google.android.gms.internal.ads.zzamj) r1
            com.google.android.gms.internal.ads.zzamd r1 = r1.zzb
            if (r1 != 0) goto L187
            r6 = -1
            r8 = 3
            r12 = 1
            goto L227
        L187:
            int r3 = r1.zzg()
            r6 = -1
            if (r3 == r6) goto L19a
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            int r8 = r1.zzg()
            r3.<init>(r8)
            com.google.android.gms.internal.ads.zzdg.zzb(r2, r3, r4, r5, r7)
        L19a:
            boolean r3 = r1.zzz()
            if (r3 == 0) goto L1a8
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            r2.setSpan(r3, r4, r5, r7)
        L1a8:
            boolean r3 = r1.zzy()
            if (r3 == 0) goto L1ba
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            int r8 = r1.zzc()
            r3.<init>(r8)
            com.google.android.gms.internal.ads.zzdg.zzb(r2, r3, r4, r5, r7)
        L1ba:
            boolean r3 = r1.zzx()
            if (r3 == 0) goto L1cc
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r8 = r1.zzb()
            r3.<init>(r8)
            com.google.android.gms.internal.ads.zzdg.zzb(r2, r3, r4, r5, r7)
        L1cc:
            java.lang.String r3 = r1.zzr()
            if (r3 == 0) goto L1de
            android.text.style.TypefaceSpan r3 = new android.text.style.TypefaceSpan
            java.lang.String r8 = r1.zzr()
            r3.<init>(r8)
            com.google.android.gms.internal.ads.zzdg.zzb(r2, r3, r4, r5, r7)
        L1de:
            int r3 = r1.zzd()
            r8 = 1
            if (r3 == r8) goto L20a
            if (r3 == r9) goto L1fc
            r8 = 3
            if (r3 == r8) goto L1ec
        L1ea:
            r12 = 1
            goto L219
        L1ec:
            android.text.style.RelativeSizeSpan r3 = new android.text.style.RelativeSizeSpan
            float r11 = r1.zza()
            r12 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 / r12
            r3.<init>(r11)
            com.google.android.gms.internal.ads.zzdg.zzb(r2, r3, r4, r5, r7)
            goto L1ea
        L1fc:
            r8 = 3
            android.text.style.RelativeSizeSpan r3 = new android.text.style.RelativeSizeSpan
            float r11 = r1.zza()
            r3.<init>(r11)
            com.google.android.gms.internal.ads.zzdg.zzb(r2, r3, r4, r5, r7)
            goto L1ea
        L20a:
            r8 = 3
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r11 = r1.zza()
            int r11 = (int) r11
            r12 = 1
            r3.<init>(r11, r12)
            com.google.android.gms.internal.ads.zzdg.zzb(r2, r3, r4, r5, r7)
        L219:
            boolean r1 = r1.zzw()
            if (r1 == 0) goto L227
            com.google.android.gms.internal.ads.zzde r1 = new com.google.android.gms.internal.ads.zzde
            r1.<init>()
            r2.setSpan(r1, r4, r5, r7)
        L227:
            int r10 = r10 + 1
            goto L172
        L22b:
            return
    }

    private static void zzh(java.lang.String r16, com.google.android.gms.internal.ads.zzamk r17) {
            r0 = r17
            java.lang.String r1 = "WebvttCueParser"
            java.util.regex.Pattern r2 = com.google.android.gms.internal.ads.zzaml.zzb
            r3 = r16
            java.util.regex.Matcher r2 = r2.matcher(r3)
        Lc:
            boolean r3 = r2.find()
            if (r3 == 0) goto L1ff
            r3 = 1
            java.lang.String r4 = r2.group(r3)
            java.util.Objects.requireNonNull(r4)
            r5 = 2
            java.lang.String r6 = r2.group(r5)
            java.util.Objects.requireNonNull(r6)
            java.lang.String r7 = "line"
            boolean r7 = r7.equals(r4)     // Catch: java.lang.NumberFormatException -> L1ec
            java.lang.String r8 = "Invalid anchor value: "
            r9 = 44
            java.lang.String r11 = "start"
            java.lang.String r12 = "end"
            java.lang.String r13 = "middle"
            java.lang.String r14 = "center"
            r15 = -1
            if (r7 != 0) goto L17e
            java.lang.String r7 = "align"
            boolean r7 = r7.equals(r4)     // Catch: java.lang.NumberFormatException -> L1ec
            r10 = 4
            if (r7 != 0) goto L122
            java.lang.String r7 = "position"
            boolean r7 = r7.equals(r4)     // Catch: java.lang.NumberFormatException -> L1ec
            if (r7 != 0) goto Lb1
            java.lang.String r7 = "size"
            boolean r7 = r7.equals(r4)     // Catch: java.lang.NumberFormatException -> L1ec
            if (r7 == 0) goto L57
            float r3 = com.google.android.gms.internal.ads.zzamn.zza(r6)     // Catch: java.lang.NumberFormatException -> L1ec
            r0.zzj = r3     // Catch: java.lang.NumberFormatException -> L1ec
            goto Lc
        L57:
            java.lang.String r7 = "vertical"
            boolean r7 = r7.equals(r4)     // Catch: java.lang.NumberFormatException -> L1ec
            if (r7 != 0) goto L7c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L1ec
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L1ec
            java.lang.String r5 = "Unknown cue setting "
            r3.append(r5)     // Catch: java.lang.NumberFormatException -> L1ec
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L1ec
            java.lang.String r4 = ":"
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L1ec
            r3.append(r6)     // Catch: java.lang.NumberFormatException -> L1ec
            java.lang.String r3 = r3.toString()     // Catch: java.lang.NumberFormatException -> L1ec
            com.google.android.gms.internal.ads.zzea.zzf(r1, r3)     // Catch: java.lang.NumberFormatException -> L1ec
            goto Lc
        L7c:
            int r4 = r6.hashCode()     // Catch: java.lang.NumberFormatException -> L1ec
            r7 = 3462(0xd86, float:4.851E-42)
            if (r4 == r7) goto L93
            r7 = 3642(0xe3a, float:5.104E-42)
            if (r4 == r7) goto L89
            goto L9c
        L89:
            java.lang.String r4 = "rl"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L9c
            r15 = 0
            goto L9c
        L93:
            java.lang.String r4 = "lr"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L9c
            r15 = 1
        L9c:
            if (r15 == 0) goto Lad
            if (r15 == r3) goto Lac
            java.lang.String r3 = "Invalid 'vertical' value: "
            java.lang.String r3 = r3.concat(r6)     // Catch: java.lang.NumberFormatException -> L1ec
            com.google.android.gms.internal.ads.zzea.zzf(r1, r3)     // Catch: java.lang.NumberFormatException -> L1ec
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto Lad
        Lac:
            r3 = 2
        Lad:
            r0.zzk = r3     // Catch: java.lang.NumberFormatException -> L1ec
            goto Lc
        Lb1:
            int r4 = r6.indexOf(r9)     // Catch: java.lang.NumberFormatException -> L1ec
            if (r4 == r15) goto L11a
            int r7 = r4 + 1
            java.lang.String r7 = r6.substring(r7)     // Catch: java.lang.NumberFormatException -> L1ec
            int r9 = r7.hashCode()     // Catch: java.lang.NumberFormatException -> L1ec
            switch(r9) {
                case -1842484672: goto Lef;
                case -1364013995: goto Le7;
                case -1276788989: goto Ldd;
                case -1074341483: goto Ld5;
                case 100571: goto Lcd;
                case 109757538: goto Lc5;
                default: goto Lc4;
            }
        Lc4:
            goto Lf8
        Lc5:
            boolean r9 = r7.equals(r11)
            if (r9 == 0) goto Lf8
            r15 = 1
            goto Lf8
        Lcd:
            boolean r9 = r7.equals(r12)
            if (r9 == 0) goto Lf8
            r15 = 5
            goto Lf8
        Ld5:
            boolean r9 = r7.equals(r13)
            if (r9 == 0) goto Lf8
            r15 = 3
            goto Lf8
        Ldd:
            java.lang.String r9 = "line-right"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto Lf8
            r15 = 4
            goto Lf8
        Le7:
            boolean r9 = r7.equals(r14)
            if (r9 == 0) goto Lf8
            r15 = 2
            goto Lf8
        Lef:
            java.lang.String r9 = "line-left"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto Lf8
            r15 = 0
        Lf8:
            if (r15 == 0) goto L112
            if (r15 == r3) goto L112
            if (r15 == r5) goto L113
            r9 = 3
            if (r15 == r9) goto L113
            if (r15 == r10) goto L110
            r3 = 5
            if (r15 == r3) goto L110
            java.lang.String r3 = r8.concat(r7)     // Catch: java.lang.NumberFormatException -> L1ec
            com.google.android.gms.internal.ads.zzea.zzf(r1, r3)     // Catch: java.lang.NumberFormatException -> L1ec
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L113
        L110:
            r3 = 2
            goto L113
        L112:
            r3 = 0
        L113:
            r0.zzi = r3     // Catch: java.lang.NumberFormatException -> L1ec
            r3 = 0
            java.lang.String r6 = r6.substring(r3, r4)     // Catch: java.lang.NumberFormatException -> L1ec
        L11a:
            float r3 = com.google.android.gms.internal.ads.zzamn.zza(r6)     // Catch: java.lang.NumberFormatException -> L1ec
            r0.zzh = r3     // Catch: java.lang.NumberFormatException -> L1ec
            goto Lc
        L122:
            int r4 = r6.hashCode()     // Catch: java.lang.NumberFormatException -> L1ec
            switch(r4) {
                case -1364013995: goto L156;
                case -1074341483: goto L14e;
                case 100571: goto L146;
                case 3317767: goto L13c;
                case 108511772: goto L132;
                case 109757538: goto L12a;
                default: goto L129;
            }
        L129:
            goto L15d
        L12a:
            boolean r4 = r6.equals(r11)
            if (r4 == 0) goto L15d
            r15 = 0
            goto L15d
        L132:
            java.lang.String r4 = "right"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L15d
            r15 = 5
            goto L15d
        L13c:
            java.lang.String r4 = "left"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L15d
            r15 = 1
            goto L15d
        L146:
            boolean r4 = r6.equals(r12)
            if (r4 == 0) goto L15d
            r15 = 4
            goto L15d
        L14e:
            boolean r4 = r6.equals(r13)
            if (r4 == 0) goto L15d
            r15 = 3
            goto L15d
        L156:
            boolean r4 = r6.equals(r14)
            if (r4 == 0) goto L15d
            r15 = 2
        L15d:
            if (r15 == 0) goto L17a
            if (r15 == r3) goto L179
            if (r15 == r5) goto L177
            r3 = 3
            if (r15 == r3) goto L177
            if (r15 == r10) goto L175
            r3 = 5
            if (r15 == r3) goto L17a
            java.lang.String r3 = "Invalid alignment value: "
            java.lang.String r3 = r3.concat(r6)     // Catch: java.lang.NumberFormatException -> L1ec
            com.google.android.gms.internal.ads.zzea.zzf(r1, r3)     // Catch: java.lang.NumberFormatException -> L1ec
            goto L177
        L175:
            r3 = 3
            goto L17a
        L177:
            r3 = 2
            goto L17a
        L179:
            r3 = 4
        L17a:
            r0.zzd = r3     // Catch: java.lang.NumberFormatException -> L1ec
            goto Lc
        L17e:
            int r4 = r6.indexOf(r9)     // Catch: java.lang.NumberFormatException -> L1ec
            if (r4 == r15) goto L1ce
            int r7 = r4 + 1
            java.lang.String r7 = r6.substring(r7)     // Catch: java.lang.NumberFormatException -> L1ec
            int r9 = r7.hashCode()     // Catch: java.lang.NumberFormatException -> L1ec
            switch(r9) {
                case -1364013995: goto L1aa;
                case -1074341483: goto L1a2;
                case 100571: goto L19a;
                case 109757538: goto L192;
                default: goto L191;
            }
        L191:
            goto L1b1
        L192:
            boolean r9 = r7.equals(r11)
            if (r9 == 0) goto L1b1
            r15 = 0
            goto L1b1
        L19a:
            boolean r9 = r7.equals(r12)
            if (r9 == 0) goto L1b1
            r15 = 3
            goto L1b1
        L1a2:
            boolean r9 = r7.equals(r13)
            if (r9 == 0) goto L1b1
            r15 = 2
            goto L1b1
        L1aa:
            boolean r9 = r7.equals(r14)
            if (r9 == 0) goto L1b1
            r15 = 1
        L1b1:
            if (r15 == 0) goto L1c6
            if (r15 == r3) goto L1c4
            if (r15 == r5) goto L1c4
            r9 = 3
            if (r15 == r9) goto L1c7
            java.lang.String r5 = r8.concat(r7)     // Catch: java.lang.NumberFormatException -> L1ec
            com.google.android.gms.internal.ads.zzea.zzf(r1, r5)     // Catch: java.lang.NumberFormatException -> L1ec
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1c7
        L1c4:
            r5 = 1
            goto L1c7
        L1c6:
            r5 = 0
        L1c7:
            r0.zzg = r5     // Catch: java.lang.NumberFormatException -> L1ec
            r5 = 0
            java.lang.String r6 = r6.substring(r5, r4)     // Catch: java.lang.NumberFormatException -> L1ec
        L1ce:
            java.lang.String r4 = "%"
            boolean r4 = r6.endsWith(r4)     // Catch: java.lang.NumberFormatException -> L1ec
            if (r4 == 0) goto L1e1
            float r3 = com.google.android.gms.internal.ads.zzamn.zza(r6)     // Catch: java.lang.NumberFormatException -> L1ec
            r0.zze = r3     // Catch: java.lang.NumberFormatException -> L1ec
            r3 = 0
            r0.zzf = r3     // Catch: java.lang.NumberFormatException -> L1ec
            goto Lc
        L1e1:
            int r4 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L1ec
            float r4 = (float) r4     // Catch: java.lang.NumberFormatException -> L1ec
            r0.zze = r4     // Catch: java.lang.NumberFormatException -> L1ec
            r0.zzf = r3     // Catch: java.lang.NumberFormatException -> L1ec
            goto Lc
        L1ec:
            java.lang.String r3 = r2.group()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Skipping bad cue setting: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r1, r3)
            goto Lc
        L1ff:
            return
    }
}
