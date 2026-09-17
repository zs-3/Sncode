package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzalp implements com.google.android.gms.internal.ads.zzakv {
    private static final java.util.regex.Pattern zza = null;
    private static final java.util.regex.Pattern zzb = null;
    private final java.lang.StringBuilder zzc;
    private final java.util.ArrayList zzd;
    private final com.google.android.gms.internal.ads.zzek zze;

    static {
            java.lang.String r0 = "\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzalp.zza = r0
            java.lang.String r0 = "\\{\\\\.*?\\}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzalp.zzb = r0
            return
    }

    public zzalp() {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.zzc = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzd = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r1.zze = r0
            return
    }

    public static float zzb(int r1) {
            if (r1 == 0) goto L15
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 != r0) goto Lc
            r1 = 1064011039(0x3f6b851f, float:0.92)
            return r1
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L12:
            r1 = 1056964608(0x3f000000, float:0.5)
            return r1
        L15:
            r1 = 1034147594(0x3da3d70a, float:0.08)
            return r1
    }

    private static long zzc(java.util.regex.Matcher r6, int r7) {
            int r0 = r7 + 1
            java.lang.String r0 = r6.group(r0)
            if (r0 == 0) goto L12
            long r0 = java.lang.Long.parseLong(r0)
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            long r0 = r0 * r2
            goto L14
        L12:
            r0 = 0
        L14:
            int r2 = r7 + 2
            java.lang.String r2 = r6.group(r2)
            java.util.Objects.requireNonNull(r2)
            long r2 = java.lang.Long.parseLong(r2)
            r4 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r4
            long r0 = r0 + r2
            int r2 = r7 + 3
            java.lang.String r2 = r6.group(r2)
            java.util.Objects.requireNonNull(r2)
            long r2 = java.lang.Long.parseLong(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            long r0 = r0 + r2
            int r7 = r7 + 4
            java.lang.String r6 = r6.group(r7)
            if (r6 == 0) goto L46
            long r6 = java.lang.Long.parseLong(r6)
            long r0 = r0 + r6
        L46:
            long r0 = r0 * r4
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] r17, int r18, int r19, com.google.android.gms.internal.ads.zzaku r20, com.google.android.gms.internal.ads.zzdn r21) {
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = "SubripParser"
            int r3 = r1 + r19
            com.google.android.gms.internal.ads.zzek r4 = r0.zze
            r5 = r17
            r4.zzJ(r5, r3)
            com.google.android.gms.internal.ads.zzek r3 = r0.zze
            r3.zzL(r1)
            com.google.android.gms.internal.ads.zzek r1 = r0.zze
            java.nio.charset.Charset r1 = r1.zzC()
            if (r1 != 0) goto L1e
            java.nio.charset.Charset r1 = com.google.android.gms.internal.ads.zzfxo.zzc
        L1e:
            com.google.android.gms.internal.ads.zzek r3 = r0.zze
            java.lang.String r3 = r3.zzz(r1)
            if (r3 == 0) goto L1ff
            int r4 = r3.length()
            if (r4 == 0) goto L1f9
            java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L1ed
            com.google.android.gms.internal.ads.zzek r3 = r0.zze
            java.lang.String r3 = r3.zzz(r1)
            if (r3 != 0) goto L3d
            java.lang.String r1 = "Unexpected end"
            com.google.android.gms.internal.ads.zzea.zzf(r2, r1)
            return
        L3d:
            java.util.regex.Pattern r4 = com.google.android.gms.internal.ads.zzalp.zza
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r5 = r4.matches()
            if (r5 == 0) goto L1e1
            r3 = 1
            long r7 = zzc(r4, r3)
            r5 = 6
            long r4 = zzc(r4, r5)
            java.lang.StringBuilder r6 = r0.zzc
            r9 = 0
            r6.setLength(r9)
            java.util.ArrayList r6 = r0.zzd
            r6.clear()
            com.google.android.gms.internal.ads.zzek r6 = r0.zze
            java.lang.String r6 = r6.zzz(r1)
        L64:
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 != 0) goto Lbe
            java.lang.StringBuilder r10 = r0.zzc
            int r10 = r10.length()
            if (r10 <= 0) goto L79
            java.lang.StringBuilder r10 = r0.zzc
            java.lang.String r11 = "<br>"
            r10.append(r11)
        L79:
            java.lang.StringBuilder r10 = r0.zzc
            java.util.ArrayList r11 = r0.zzd
            java.lang.String r6 = r6.trim()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            java.util.regex.Pattern r13 = com.google.android.gms.internal.ads.zzalp.zzb
            java.util.regex.Matcher r6 = r13.matcher(r6)
            r13 = 0
        L8d:
            boolean r14 = r6.find()
            if (r14 == 0) goto Lae
            java.lang.String r14 = r6.group()
            r11.add(r14)
            int r15 = r6.start()
            int r15 = r15 - r13
            int r14 = r14.length()
            int r9 = r15 + r14
            java.lang.String r3 = ""
            r12.replace(r15, r9, r3)
            int r13 = r13 + r14
            r3 = 1
            r9 = 0
            goto L8d
        Lae:
            java.lang.String r3 = r12.toString()
            r10.append(r3)
            com.google.android.gms.internal.ads.zzek r3 = r0.zze
            java.lang.String r6 = r3.zzz(r1)
            r3 = 1
            r9 = 0
            goto L64
        Lbe:
            java.lang.StringBuilder r3 = r0.zzc
            java.lang.String r3 = r3.toString()
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)
            r6 = 0
        Lc9:
            java.util.ArrayList r9 = r0.zzd
            int r9 = r9.size()
            if (r6 >= r9) goto Le5
            java.util.ArrayList r9 = r0.zzd
            java.lang.Object r9 = r9.get(r6)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "\\{\\\\an[1-9]\\}"
            boolean r10 = r9.matches(r10)
            if (r10 == 0) goto Le2
            goto Le6
        Le2:
            int r6 = r6 + 1
            goto Lc9
        Le5:
            r9 = 0
        Le6:
            com.google.android.gms.internal.ads.zzakn r11 = new com.google.android.gms.internal.ads.zzakn
            com.google.android.gms.internal.ads.zzcz r6 = new com.google.android.gms.internal.ads.zzcz
            r6.<init>()
            r6.zzl(r3)
            if (r9 != 0) goto Lf8
            com.google.android.gms.internal.ads.zzdb r3 = r6.zzp()
            goto L1d1
        Lf8:
            int r3 = r9.hashCode()
            java.lang.String r10 = "{\\an9}"
            java.lang.String r12 = "{\\an7}"
            java.lang.String r13 = "{\\an3}"
            java.lang.String r14 = "{\\an1}"
            r15 = 2
            switch(r3) {
                case -685620710: goto L135;
                case -685620648: goto L12d;
                case -685620617: goto L123;
                case -685620555: goto L119;
                case -685620524: goto L111;
                case -685620462: goto L109;
                default: goto L108;
            }
        L108:
            goto L13d
        L109:
            boolean r3 = r9.equals(r10)
            if (r3 == 0) goto L13d
            r3 = 5
            goto L13e
        L111:
            boolean r3 = r9.equals(r12)
            if (r3 == 0) goto L13d
            r3 = 2
            goto L13e
        L119:
            java.lang.String r3 = "{\\an6}"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L13d
            r3 = 4
            goto L13e
        L123:
            java.lang.String r3 = "{\\an4}"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L13d
            r3 = 1
            goto L13e
        L12d:
            boolean r3 = r9.equals(r13)
            if (r3 == 0) goto L13d
            r3 = 3
            goto L13e
        L135:
            boolean r3 = r9.equals(r14)
            if (r3 == 0) goto L13d
            r3 = 0
            goto L13e
        L13d:
            r3 = -1
        L13e:
            if (r3 == 0) goto L157
            r0 = 1
            if (r3 == r0) goto L157
            if (r3 == r15) goto L157
            r15 = 3
            if (r3 == r15) goto L152
            r15 = 4
            if (r3 == r15) goto L152
            r15 = 5
            if (r3 == r15) goto L152
            r6.zzi(r0)
            goto L15b
        L152:
            r0 = 2
            r6.zzi(r0)
            goto L15b
        L157:
            r0 = 0
            r6.zzi(r0)
        L15b:
            int r0 = r9.hashCode()
            switch(r0) {
                case -685620710: goto L18f;
                case -685620679: goto L185;
                case -685620648: goto L17d;
                case -685620524: goto L175;
                case -685620493: goto L16b;
                case -685620462: goto L163;
                default: goto L162;
            }
        L162:
            goto L197
        L163:
            boolean r0 = r9.equals(r10)
            if (r0 == 0) goto L197
            r0 = 5
            goto L198
        L16b:
            java.lang.String r0 = "{\\an8}"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L197
            r0 = 4
            goto L198
        L175:
            boolean r0 = r9.equals(r12)
            if (r0 == 0) goto L197
            r0 = 3
            goto L198
        L17d:
            boolean r0 = r9.equals(r13)
            if (r0 == 0) goto L197
            r0 = 2
            goto L198
        L185:
            java.lang.String r0 = "{\\an2}"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L197
            r0 = 1
            goto L198
        L18f:
            boolean r0 = r9.equals(r14)
            if (r0 == 0) goto L197
            r0 = 0
            goto L198
        L197:
            r0 = -1
        L198:
            if (r0 == 0) goto L1b2
            r3 = 1
            if (r0 == r3) goto L1b2
            r9 = 2
            if (r0 == r9) goto L1b2
            r9 = 3
            if (r0 == r9) goto L1ad
            r9 = 4
            if (r0 == r9) goto L1ad
            r9 = 5
            if (r0 == r9) goto L1ad
            r6.zzf(r3)
            goto L1b6
        L1ad:
            r0 = 0
            r6.zzf(r0)
            goto L1b6
        L1b2:
            r0 = 2
            r6.zzf(r0)
        L1b6:
            int r0 = r6.zzb()
            float r0 = zzb(r0)
            r6.zzh(r0)
            int r0 = r6.zza()
            float r0 = zzb(r0)
            r3 = 0
            r6.zze(r0, r3)
            com.google.android.gms.internal.ads.zzdb r3 = r6.zzp()
        L1d1:
            long r9 = r4 - r7
            com.google.android.gms.internal.ads.zzgax r6 = com.google.android.gms.internal.ads.zzgax.zzo(r3)
            r5 = r11
            r5.<init>(r6, r7, r9)
            r0 = r21
            r0.zza(r11)
            goto L1fb
        L1e1:
            r0 = r21
            java.lang.String r4 = "Skipping invalid timing: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r2, r3)
            goto L1fb
        L1ed:
            r0 = r21
            java.lang.String r4 = "Skipping invalid index: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r2, r3)
            goto L1fb
        L1f9:
            r0 = r21
        L1fb:
            r0 = r16
            goto L1e
        L1ff:
            return
    }
}
