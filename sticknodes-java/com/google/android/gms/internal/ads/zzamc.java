package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzamc {
    private static final java.util.regex.Pattern zza = null;
    private static final java.util.regex.Pattern zzb = null;
    private final com.google.android.gms.internal.ads.zzek zzc;
    private final java.lang.StringBuilder zzd;

    static {
            java.lang.String r0 = "\\[voice=\"([^\"]*)\"\\]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzamc.zza = r0
            java.lang.String r0 = "^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzamc.zzb = r0
            return
    }

    public zzamc() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r1.zzc = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.zzd = r0
            return
    }

    static java.lang.String zza(com.google.android.gms.internal.ads.zzek r1, java.lang.StringBuilder r2) {
            zzc(r1)
            int r0 = r1.zzb()
            if (r0 != 0) goto Lb
            r1 = 0
            return r1
        Lb:
            java.lang.String r2 = zzd(r1, r2)
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L18
            return r2
        L18:
            int r1 = r1.zzm()
            char r1 = (char) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }

    static void zzc(com.google.android.gms.internal.ads.zzek r8) {
            r0 = 0
            r1 = 1
        L2:
            r2 = 1
        L3:
            int r3 = r8.zzb()
            if (r3 <= 0) goto L6d
            if (r2 == 0) goto L6d
            int r2 = r8.zzd()
            byte[] r3 = r8.zzN()
            r2 = r3[r2]
            char r2 = (char) r2
            r3 = 9
            if (r2 == r3) goto L69
            r3 = 10
            if (r2 == r3) goto L69
            r3 = 12
            if (r2 == r3) goto L69
            r3 = 13
            if (r2 == r3) goto L69
            r3 = 32
            if (r2 == r3) goto L69
            int r2 = r8.zzd()
            int r3 = r8.zze()
            byte[] r4 = r8.zzN()
            int r5 = r2 + 2
            if (r5 > r3) goto L67
            int r5 = r2 + 1
            r2 = r4[r2]
            r6 = 47
            if (r2 != r6) goto L67
            int r2 = r5 + 1
            r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L67
        L4a:
            int r5 = r2 + 1
            if (r5 >= r3) goto L5e
            r2 = r4[r2]
            char r2 = (char) r2
            if (r2 != r7) goto L5c
            r2 = r4[r5]
            char r2 = (char) r2
            if (r2 != r6) goto L5c
            int r3 = r5 + 1
            r2 = r3
            goto L4a
        L5c:
            r2 = r5
            goto L4a
        L5e:
            int r2 = r8.zzd()
            int r3 = r3 - r2
            r8.zzM(r3)
            goto L2
        L67:
            r2 = 0
            goto L3
        L69:
            r8.zzM(r1)
            goto L2
        L6d:
            return
    }

    private static java.lang.String zzd(com.google.android.gms.internal.ads.zzek r5, java.lang.StringBuilder r6) {
            r0 = 0
            r6.setLength(r0)
            int r1 = r5.zzd()
            int r2 = r5.zze()
        Lc:
            r3 = 0
        Ld:
            if (r1 >= r2) goto L49
            if (r3 != 0) goto L49
            byte[] r3 = r5.zzN()
            r3 = r3[r1]
            char r3 = (char) r3
            r4 = 65
            if (r3 < r4) goto L20
            r4 = 90
            if (r3 <= r4) goto L43
        L20:
            r4 = 97
            if (r3 < r4) goto L28
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 <= r4) goto L43
        L28:
            r4 = 48
            if (r3 < r4) goto L30
            r4 = 57
            if (r3 <= r4) goto L43
        L30:
            r4 = 35
            if (r3 == r4) goto L43
            r4 = 45
            if (r3 == r4) goto L43
            r4 = 46
            if (r3 == r4) goto L43
            r4 = 95
            if (r3 != r4) goto L41
            goto L43
        L41:
            r3 = 1
            goto Ld
        L43:
            r6.append(r3)
            int r1 = r1 + 1
            goto Lc
        L49:
            int r0 = r5.zzd()
            int r1 = r1 - r0
            r5.zzM(r1)
            java.lang.String r5 = r6.toString()
            return r5
    }

    public final java.util.List zzb(com.google.android.gms.internal.ads.zzek r18) {
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = r0.zzd
            r2 = 0
            r1.setLength(r2)
            int r1 = r18.zzd()
        Lc:
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r4 = r18
            java.lang.String r3 = r4.zzz(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto Lc
            com.google.android.gms.internal.ads.zzek r3 = r0.zzc
            byte[] r5 = r18.zzN()
            int r4 = r18.zzd()
            r3.zzJ(r5, r4)
            com.google.android.gms.internal.ads.zzek r3 = r0.zzc
            r3.zzL(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L31:
            com.google.android.gms.internal.ads.zzek r3 = r0.zzc
            java.lang.StringBuilder r4 = r0.zzd
            zzc(r3)
            int r5 = r3.zzb()
            java.lang.String r6 = "{"
            r7 = 5
            java.lang.String r8 = ""
            r10 = 1
            if (r5 >= r7) goto L47
        L44:
            r5 = 0
            goto Lb3
        L47:
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r5 = r3.zzB(r7, r5)
            java.lang.String r7 = "::cue"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L56
            goto L44
        L56:
            int r5 = r3.zzd()
            java.lang.String r7 = zza(r3, r4)
            if (r7 != 0) goto L61
            goto L44
        L61:
            boolean r11 = r6.equals(r7)
            if (r11 == 0) goto L6c
            r3.zzL(r5)
            r5 = r8
            goto Lb3
        L6c:
            java.lang.String r5 = "("
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto La5
            int r5 = r3.zzd()
            int r7 = r3.zze()
            r11 = 0
        L7d:
            if (r5 >= r7) goto L93
            if (r11 != 0) goto L93
            byte[] r11 = r3.zzN()
            int r12 = r5 + 1
            r5 = r11[r5]
            char r5 = (char) r5
            r11 = 41
            if (r5 != r11) goto L90
            r11 = 1
            goto L91
        L90:
            r11 = 0
        L91:
            r5 = r12
            goto L7d
        L93:
            int r5 = r5 + (-1)
            int r7 = r3.zzd()
            int r5 = r5 - r7
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r5 = r3.zzB(r5, r7)
            java.lang.String r5 = r5.trim()
            goto La6
        La5:
            r5 = 0
        La6:
            java.lang.String r3 = zza(r3, r4)
            java.lang.String r4 = ")"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto Lb3
            goto L44
        Lb3:
            if (r5 == 0) goto L31b
            com.google.android.gms.internal.ads.zzek r3 = r0.zzc
            java.lang.StringBuilder r4 = r0.zzd
            java.lang.String r3 = zza(r3, r4)
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto Lc5
            goto L31b
        Lc5:
            com.google.android.gms.internal.ads.zzamd r3 = new com.google.android.gms.internal.ads.zzamd
            r3.<init>()
            boolean r4 = r8.equals(r5)
            r6 = -1
            if (r4 == 0) goto Ld4
        Ld1:
            r4 = 0
            r5 = 0
            goto L12d
        Ld4:
            r4 = 91
            int r4 = r5.indexOf(r4)
            if (r4 == r6) goto Lfa
            java.util.regex.Pattern r7 = com.google.android.gms.internal.ads.zzamc.zza
            java.lang.String r11 = r5.substring(r4)
            java.util.regex.Matcher r7 = r7.matcher(r11)
            boolean r11 = r7.matches()
            if (r11 == 0) goto Lf6
            java.lang.String r7 = r7.group(r10)
            java.util.Objects.requireNonNull(r7)
            r3.zzv(r7)
        Lf6:
            java.lang.String r5 = r5.substring(r2, r4)
        Lfa:
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            java.lang.String r4 = "\\."
            java.lang.String[] r4 = r5.split(r4, r6)
            r5 = r4[r2]
            r7 = 35
            int r7 = r5.indexOf(r7)
            if (r7 == r6) goto L11d
            java.lang.String r11 = r5.substring(r2, r7)
            r3.zzu(r11)
            int r7 = r7 + 1
            java.lang.String r5 = r5.substring(r7)
            r3.zzt(r5)
            goto L120
        L11d:
            r3.zzu(r5)
        L120:
            int r5 = r4.length
            if (r5 <= r10) goto Ld1
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r4, r10, r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.zzs(r4)
            goto Ld1
        L12d:
            java.lang.String r7 = "}"
            if (r4 != 0) goto L30f
            com.google.android.gms.internal.ads.zzek r4 = r0.zzc
            java.lang.StringBuilder r5 = r0.zzd
            int r11 = r4.zzd()
            java.lang.String r5 = zza(r4, r5)
            if (r5 == 0) goto L148
            boolean r4 = r7.equals(r5)
            if (r4 == 0) goto L146
            goto L148
        L146:
            r4 = 0
            goto L149
        L148:
            r4 = 1
        L149:
            if (r4 != 0) goto L30b
            com.google.android.gms.internal.ads.zzek r12 = r0.zzc
            r12.zzL(r11)
            com.google.android.gms.internal.ads.zzek r11 = r0.zzc
            java.lang.StringBuilder r12 = r0.zzd
            zzc(r11)
            java.lang.String r13 = zzd(r11, r12)
            boolean r14 = r8.equals(r13)
            if (r14 == 0) goto L163
            goto L30b
        L163:
            java.lang.String r14 = zza(r11, r12)
            java.lang.String r15 = ":"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L171
            goto L30b
        L171:
            zzc(r11)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r15 = 0
        L17a:
            java.lang.String r2 = ";"
            if (r15 != 0) goto L1a2
            int r6 = r11.zzd()
            java.lang.String r9 = zza(r11, r12)
            if (r9 != 0) goto L18a
            r6 = 0
            goto L1a6
        L18a:
            boolean r16 = r7.equals(r9)
            if (r16 != 0) goto L19c
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L197
            goto L19c
        L197:
            r14.append(r9)
            r6 = -1
            goto L17a
        L19c:
            r11.zzL(r6)
            r6 = -1
            r15 = 1
            goto L17a
        L1a2:
            java.lang.String r6 = r14.toString()
        L1a6:
            if (r6 == 0) goto L30b
            boolean r9 = r8.equals(r6)
            if (r9 == 0) goto L1b0
            goto L30b
        L1b0:
            int r9 = r11.zzd()
            java.lang.String r12 = zza(r11, r12)
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L1bf
            goto L1c8
        L1bf:
            boolean r2 = r7.equals(r12)
            if (r2 == 0) goto L30b
            r11.zzL(r9)
        L1c8:
            java.lang.String r2 = "color"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L1d9
            int r2 = com.google.android.gms.internal.ads.zzdl.zza(r6)
            r3.zzk(r2)
            goto L30b
        L1d9:
            java.lang.String r2 = "background-color"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L1ea
            int r2 = com.google.android.gms.internal.ads.zzdl.zza(r6)
            r3.zzh(r2)
            goto L30b
        L1ea:
            java.lang.String r2 = "ruby-position"
            boolean r2 = r2.equals(r13)
            r7 = 2
            if (r2 == 0) goto L20d
            java.lang.String r2 = "over"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L200
            r3.zzp(r10)
            goto L30b
        L200:
            java.lang.String r2 = "under"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L30b
            r3.zzp(r7)
            goto L30b
        L20d:
            java.lang.String r2 = "text-combine-upright"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L22e
            java.lang.String r2 = "all"
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L228
            java.lang.String r2 = "digits"
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L226
            goto L228
        L226:
            r2 = 0
            goto L229
        L228:
            r2 = 1
        L229:
            r3.zzj(r2)
            goto L30b
        L22e:
            java.lang.String r2 = "text-decoration"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L243
            java.lang.String r2 = "underline"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L30b
            r3.zzq(r10)
            goto L30b
        L243:
            java.lang.String r2 = "font-family"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L250
            r3.zzl(r6)
            goto L30b
        L250:
            java.lang.String r2 = "font-weight"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L265
            java.lang.String r2 = "bold"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L30b
            r3.zzi(r10)
            goto L30b
        L265:
            java.lang.String r2 = "font-style"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L27a
            java.lang.String r2 = "italic"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L30b
            r3.zzo(r10)
            goto L30b
        L27a:
            java.lang.String r2 = "font-size"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L30b
            java.util.regex.Pattern r2 = com.google.android.gms.internal.ads.zzamc.zzb
            java.lang.String r9 = com.google.android.gms.internal.ads.zzfxi.zza(r6)
            java.util.regex.Matcher r2 = r2.matcher(r9)
            boolean r9 = r2.matches()
            if (r9 != 0) goto L2ae
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "Invalid font-size: '"
            r2.append(r7)
            r2.append(r6)
            java.lang.String r6 = "'."
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "WebvttCssParser"
            com.google.android.gms.internal.ads.zzea.zzf(r6, r2)
            goto L30b
        L2ae:
            java.lang.String r6 = r2.group(r7)
            java.util.Objects.requireNonNull(r6)
            int r9 = r6.hashCode()
            r11 = 37
            if (r9 == r11) goto L2da
            r11 = 3240(0xca8, float:4.54E-42)
            if (r9 == r11) goto L2d0
            r11 = 3592(0xe08, float:5.033E-42)
            if (r9 == r11) goto L2c6
            goto L2e4
        L2c6:
            java.lang.String r9 = "px"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L2e4
            r6 = 0
            goto L2e5
        L2d0:
            java.lang.String r9 = "em"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L2e4
            r6 = 1
            goto L2e5
        L2da:
            java.lang.String r9 = "%"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L2e4
            r6 = 2
            goto L2e5
        L2e4:
            r6 = -1
        L2e5:
            if (r6 == 0) goto L2fa
            if (r6 == r10) goto L2f6
            if (r6 != r7) goto L2f0
            r6 = 3
            r3.zzn(r6)
            goto L2fd
        L2f0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L2f6:
            r3.zzn(r7)
            goto L2fd
        L2fa:
            r3.zzn(r10)
        L2fd:
            java.lang.String r2 = r2.group(r10)
            java.util.Objects.requireNonNull(r2)
            float r2 = java.lang.Float.parseFloat(r2)
            r3.zzm(r2)
        L30b:
            r2 = 0
            r6 = -1
            goto L12d
        L30f:
            boolean r2 = r7.equals(r5)
            if (r2 == 0) goto L318
            r1.add(r3)
        L318:
            r2 = 0
            goto L31
        L31b:
            return r1
    }
}
