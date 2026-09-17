package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzals {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final com.google.android.gms.internal.ads.zzaly zzf;
    public final java.lang.String zzg;
    public final java.lang.String zzh;
    public final com.google.android.gms.internal.ads.zzals zzi;
    private final java.lang.String[] zzj;
    private final java.util.HashMap zzk;
    private final java.util.HashMap zzl;
    private java.util.List zzm;

    private zzals(java.lang.String r1, java.lang.String r2, long r3, long r5, com.google.android.gms.internal.ads.zzaly r7, java.lang.String[] r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzals r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzh = r10
            r0.zzf = r7
            r0.zzj = r8
            if (r2 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            r0.zzc = r1
            r0.zzd = r3
            r0.zze = r5
            java.util.Objects.requireNonNull(r9)
            r0.zzg = r9
            r0.zzi = r11
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzk = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzl = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzals zzb(java.lang.String r13, long r14, long r16, com.google.android.gms.internal.ads.zzaly r18, java.lang.String[] r19, java.lang.String r20, java.lang.String r21, com.google.android.gms.internal.ads.zzals r22) {
            com.google.android.gms.internal.ads.zzals r12 = new com.google.android.gms.internal.ads.zzals
            r2 = 0
            r0 = r12
            r1 = r13
            r3 = r14
            r5 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r12
    }

    public static com.google.android.gms.internal.ads.zzals zzc(java.lang.String r13) {
            com.google.android.gms.internal.ads.zzals r12 = new com.google.android.gms.internal.ads.zzals
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "\n"
            java.lang.String r13 = r13.replaceAll(r0, r1)
            java.lang.String r0 = " *\n *"
            java.lang.String r13 = r13.replaceAll(r0, r1)
            java.lang.String r0 = " "
            java.lang.String r13 = r13.replaceAll(r1, r0)
            java.lang.String r1 = "[ \t\\x0B\f\r]+"
            java.lang.String r2 = r13.replaceAll(r1, r0)
            r1 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 0
            java.lang.String r9 = ""
            r10 = 0
            r11 = 0
            r0 = r12
            r3 = r5
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            return r12
    }

    private static android.text.SpannableStringBuilder zzi(java.lang.String r2, java.util.Map r3) {
            boolean r0 = r3.containsKey(r2)
            if (r0 != 0) goto L16
            com.google.android.gms.internal.ads.zzcz r0 = new com.google.android.gms.internal.ads.zzcz
            r0.<init>()
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            r0.zzl(r1)
            r3.put(r2, r0)
        L16:
            java.lang.Object r2 = r3.get(r2)
            com.google.android.gms.internal.ads.zzcz r2 = (com.google.android.gms.internal.ads.zzcz) r2
            java.lang.CharSequence r2 = r2.zzq()
            java.util.Objects.requireNonNull(r2)
            android.text.SpannableStringBuilder r2 = (android.text.SpannableStringBuilder) r2
            return r2
    }

    private final void zzj(java.util.TreeSet r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = r6.zza
            java.lang.String r1 = "p"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "div"
            boolean r0 = r2.equals(r0)
            if (r8 != 0) goto L18
            if (r1 != 0) goto L18
            if (r0 == 0) goto L37
            java.lang.String r0 = r6.zzh
            if (r0 == 0) goto L37
        L18:
            long r2 = r6.zzd
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L2a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r7.add(r0)
        L2a:
            long r2 = r6.zze
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L37
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r7.add(r0)
        L37:
            java.util.List r0 = r6.zzm
            if (r0 == 0) goto L5a
            r0 = 0
            r2 = 0
        L3d:
            java.util.List r3 = r6.zzm
            int r3 = r3.size()
            if (r2 >= r3) goto L5a
            java.util.List r3 = r6.zzm
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzals r3 = (com.google.android.gms.internal.ads.zzals) r3
            r4 = 1
            if (r8 != 0) goto L54
            if (r1 == 0) goto L53
            goto L54
        L53:
            r4 = 0
        L54:
            r3.zzj(r7, r4)
            int r2 = r2 + 1
            goto L3d
        L5a:
            return
    }

    private final void zzk(long r4, java.lang.String r6, java.util.List r7) {
            r3 = this;
            java.lang.String r0 = r3.zzg
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lc
            java.lang.String r6 = r3.zzg
        Lc:
            boolean r0 = r3.zzg(r4)
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.String r0 = r3.zza
            java.lang.String r2 = "div"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2b
            java.lang.String r0 = r3.zzh
            if (r0 != 0) goto L22
            goto L2b
        L22:
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r6, r0)
            r7.add(r4)
            return
        L2b:
            int r0 = r3.zza()
            if (r1 >= r0) goto L3b
            com.google.android.gms.internal.ads.zzals r0 = r3.zzd(r1)
            r0.zzk(r4, r6, r7)
            int r1 = r1 + 1
            goto L2b
        L3b:
            return
    }

    private final void zzl(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.Map r23) {
            r17 = this;
            r0 = r17
            r8 = r20
            boolean r1 = r17.zzg(r18)
            if (r1 != 0) goto Lc
            goto L292
        Lc:
            java.lang.String r1 = r0.zzg
            java.lang.String r2 = ""
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1a
            java.lang.String r1 = r0.zzg
            r9 = r1
            goto L1c
        L1a:
            r9 = r22
        L1c:
            java.util.HashMap r1 = r0.zzl
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L273
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.util.HashMap r5 = r0.zzk
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L4d
            java.util.HashMap r5 = r0.zzk
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L4e
        L4d:
            r5 = 0
        L4e:
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r5 == r2) goto L26d
            r10 = r23
            java.lang.Object r4 = r10.get(r4)
            com.google.android.gms.internal.ads.zzcz r4 = (com.google.android.gms.internal.ads.zzcz) r4
            java.util.Objects.requireNonNull(r4)
            r11 = r21
            java.lang.Object r6 = r11.get(r9)
            com.google.android.gms.internal.ads.zzalw r6 = (com.google.android.gms.internal.ads.zzalw) r6
            java.util.Objects.requireNonNull(r6)
            int r6 = r6.zzj
            com.google.android.gms.internal.ads.zzaly r7 = r0.zzf
            java.lang.String[] r12 = r0.zzj
            com.google.android.gms.internal.ads.zzaly r7 = com.google.android.gms.internal.ads.zzalx.zza(r7, r12, r8)
            java.lang.CharSequence r12 = r4.zzq()
            android.text.SpannableStringBuilder r12 = (android.text.SpannableStringBuilder) r12
            if (r12 != 0) goto L8a
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            r4.zzl(r12)
        L8a:
            if (r7 == 0) goto L26
            com.google.android.gms.internal.ads.zzals r13 = r0.zzi
            int r14 = r7.zzh()
            r15 = -1
            r3 = 33
            if (r14 == r15) goto La3
            android.text.style.StyleSpan r14 = new android.text.style.StyleSpan
            int r15 = r7.zzh()
            r14.<init>(r15)
            r12.setSpan(r14, r5, r2, r3)
        La3:
            boolean r14 = r7.zzI()
            if (r14 == 0) goto Lb1
            android.text.style.StrikethroughSpan r14 = new android.text.style.StrikethroughSpan
            r14.<init>()
            r12.setSpan(r14, r5, r2, r3)
        Lb1:
            boolean r14 = r7.zzJ()
            if (r14 == 0) goto Lbf
            android.text.style.UnderlineSpan r14 = new android.text.style.UnderlineSpan
            r14.<init>()
            r12.setSpan(r14, r5, r2, r3)
        Lbf:
            boolean r14 = r7.zzH()
            if (r14 == 0) goto Ld1
            android.text.style.ForegroundColorSpan r14 = new android.text.style.ForegroundColorSpan
            int r15 = r7.zzd()
            r14.<init>(r15)
            com.google.android.gms.internal.ads.zzdg.zzb(r12, r14, r5, r2, r3)
        Ld1:
            boolean r14 = r7.zzG()
            if (r14 == 0) goto Le3
            android.text.style.BackgroundColorSpan r14 = new android.text.style.BackgroundColorSpan
            int r15 = r7.zzc()
            r14.<init>(r15)
            com.google.android.gms.internal.ads.zzdg.zzb(r12, r14, r5, r2, r3)
        Le3:
            java.lang.String r14 = r7.zzD()
            if (r14 == 0) goto Lf5
            android.text.style.TypefaceSpan r14 = new android.text.style.TypefaceSpan
            java.lang.String r15 = r7.zzD()
            r14.<init>(r15)
            com.google.android.gms.internal.ads.zzdg.zzb(r12, r14, r5, r2, r3)
        Lf5:
            com.google.android.gms.internal.ads.zzalr r14 = r7.zzk()
            r15 = 2
            if (r14 == 0) goto L129
            com.google.android.gms.internal.ads.zzalr r14 = r7.zzk()
            java.util.Objects.requireNonNull(r14)
            int r3 = r14.zza
            r16 = r1
            r1 = -1
            if (r3 != r1) goto L116
            if (r6 == r15) goto L112
            r1 = 1
            if (r6 != r1) goto L110
            goto L112
        L110:
            r1 = 1
            goto L113
        L112:
            r1 = 3
        L113:
            r3 = r1
            r1 = 1
            goto L118
        L116:
            int r1 = r14.zzb
        L118:
            int r6 = r14.zzc
            r14 = -2
            if (r6 != r14) goto L11e
            r6 = 1
        L11e:
            com.google.android.gms.internal.ads.zzdh r14 = new com.google.android.gms.internal.ads.zzdh
            r14.<init>(r3, r1, r6)
            r1 = 33
            com.google.android.gms.internal.ads.zzdg.zzb(r12, r14, r5, r2, r1)
            goto L12b
        L129:
            r16 = r1
        L12b:
            int r1 = r7.zzg()
            if (r1 == r15) goto L145
            r3 = 3
            if (r1 == r3) goto L139
            r3 = 4
            if (r1 == r3) goto L139
            goto L1e5
        L139:
            com.google.android.gms.internal.ads.zzalq r1 = new com.google.android.gms.internal.ads.zzalq
            r1.<init>()
            r3 = 33
            r12.setSpan(r1, r5, r2, r3)
            goto L1e5
        L145:
            if (r13 == 0) goto L15b
            com.google.android.gms.internal.ads.zzaly r3 = r13.zzf
            java.lang.String[] r6 = r13.zzj
            com.google.android.gms.internal.ads.zzaly r3 = com.google.android.gms.internal.ads.zzalx.zza(r3, r6, r8)
            if (r3 == 0) goto L158
            int r3 = r3.zzg()
            r6 = 1
            if (r3 == r6) goto L15c
        L158:
            com.google.android.gms.internal.ads.zzals r13 = r13.zzi
            goto L145
        L15b:
            r13 = 0
        L15c:
            if (r13 == 0) goto L1e5
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r3.push(r13)
        L166:
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L197
            java.lang.Object r6 = r3.pop()
            com.google.android.gms.internal.ads.zzals r6 = (com.google.android.gms.internal.ads.zzals) r6
            com.google.android.gms.internal.ads.zzaly r14 = r6.zzf
            java.lang.String[] r1 = r6.zzj
            com.google.android.gms.internal.ads.zzaly r1 = com.google.android.gms.internal.ads.zzalx.zza(r14, r1, r8)
            if (r1 == 0) goto L185
            int r1 = r1.zzg()
            r14 = 3
            if (r1 != r14) goto L185
            r1 = r6
            goto L198
        L185:
            int r1 = r6.zza()
            r14 = -1
            int r1 = r1 + r14
        L18b:
            if (r1 < 0) goto L166
            com.google.android.gms.internal.ads.zzals r14 = r6.zzd(r1)
            r3.push(r14)
            int r1 = r1 + (-1)
            goto L18b
        L197:
            r1 = 0
        L198:
            if (r1 == 0) goto L1e5
            int r3 = r1.zza()
            r6 = 1
            if (r3 != r6) goto L1de
            r3 = 0
            com.google.android.gms.internal.ads.zzals r6 = r1.zzd(r3)
            java.lang.String r6 = r6.zzb
            if (r6 == 0) goto L1de
            com.google.android.gms.internal.ads.zzals r3 = r1.zzd(r3)
            java.lang.String r3 = r3.zzb
            int r6 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzaly r6 = r1.zzf
            java.lang.String[] r1 = r1.zzj
            com.google.android.gms.internal.ads.zzaly r1 = com.google.android.gms.internal.ads.zzalx.zza(r6, r1, r8)
            if (r1 == 0) goto L1c1
            int r1 = r1.zzf()
            goto L1c2
        L1c1:
            r1 = -1
        L1c2:
            r6 = -1
            if (r1 != r6) goto L1d3
            com.google.android.gms.internal.ads.zzaly r6 = r13.zzf
            java.lang.String[] r13 = r13.zzj
            com.google.android.gms.internal.ads.zzaly r6 = com.google.android.gms.internal.ads.zzalx.zza(r6, r13, r8)
            if (r6 == 0) goto L1d3
            int r1 = r6.zzf()
        L1d3:
            com.google.android.gms.internal.ads.zzdf r6 = new com.google.android.gms.internal.ads.zzdf
            r6.<init>(r3, r1)
            r1 = 33
            r12.setSpan(r6, r5, r2, r1)
            goto L1e5
        L1de:
            java.lang.String r1 = "TtmlRenderUtil"
            java.lang.String r3 = "Skipping rubyText node without exactly one text child."
            com.google.android.gms.internal.ads.zzea.zze(r1, r3)
        L1e5:
            boolean r1 = r7.zzF()
            if (r1 == 0) goto L1f5
            com.google.android.gms.internal.ads.zzde r1 = new com.google.android.gms.internal.ads.zzde
            r1.<init>()
            r3 = 33
            com.google.android.gms.internal.ads.zzdg.zzb(r12, r1, r5, r2, r3)
        L1f5:
            int r1 = r7.zze()
            r3 = 1120403456(0x42c80000, float:100.0)
            r6 = 1
            if (r1 == r6) goto L21e
            if (r1 == r15) goto L20f
            r6 = 3
            if (r1 == r6) goto L204
            goto L22e
        L204:
            float r1 = r7.zza()
            float r1 = r1 / r3
            r6 = 33
            com.google.android.gms.internal.ads.zzdg.zza(r12, r1, r5, r2, r6)
            goto L22e
        L20f:
            r6 = 33
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r13 = r7.zza()
            r1.<init>(r13)
            com.google.android.gms.internal.ads.zzdg.zzb(r12, r1, r5, r2, r6)
            goto L22e
        L21e:
            r6 = 33
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            float r13 = r7.zza()
            int r13 = (int) r13
            r14 = 1
            r1.<init>(r13, r14)
            com.google.android.gms.internal.ads.zzdg.zzb(r12, r1, r5, r2, r6)
        L22e:
            java.lang.String r1 = r0.zza
            java.lang.String r2 = "p"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L269
            float r1 = r7.zzb()
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L24f
            float r1 = r7.zzb()
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r1 = r1 * r2
            float r1 = r1 / r3
            r4.zzj(r1)
        L24f:
            android.text.Layout$Alignment r1 = r7.zzj()
            if (r1 == 0) goto L25c
            android.text.Layout$Alignment r1 = r7.zzj()
            r4.zzm(r1)
        L25c:
            android.text.Layout$Alignment r1 = r7.zzi()
            if (r1 == 0) goto L269
            android.text.Layout$Alignment r1 = r7.zzi()
            r4.zzg(r1)
        L269:
            r1 = r16
            goto L26
        L26d:
            r11 = r21
            r10 = r23
            goto L26
        L273:
            r11 = r21
            r10 = r23
            r3 = 0
            r12 = 0
        L279:
            int r1 = r17.zza()
            if (r12 >= r1) goto L292
            com.google.android.gms.internal.ads.zzals r1 = r0.zzd(r12)
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r9
            r7 = r23
            r1.zzl(r2, r4, r5, r6, r7)
            int r12 = r12 + 1
            goto L279
        L292:
            return
    }

    private final void zzm(long r11, boolean r13, java.lang.String r14, java.util.Map r15) {
            r10 = this;
            java.util.HashMap r0 = r10.zzk
            r0.clear()
            java.util.HashMap r0 = r10.zzl
            r0.clear()
            java.lang.String r0 = r10.zza
            java.lang.String r1 = "metadata"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L16
            goto L104
        L16:
            java.lang.String r0 = r10.zzg
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
            java.lang.String r14 = r10.zzg
        L22:
            boolean r0 = r10.zzc
            if (r0 == 0) goto L35
            if (r13 == 0) goto L35
            android.text.SpannableStringBuilder r11 = zzi(r14, r15)
            java.lang.String r12 = r10.zzb
            java.util.Objects.requireNonNull(r12)
            r11.append(r12)
            return
        L35:
            java.lang.String r0 = r10.zza
            java.lang.String r1 = "br"
            boolean r0 = r1.equals(r0)
            r6 = 10
            if (r0 == 0) goto L4c
            if (r13 != 0) goto L44
            goto L4c
        L44:
            android.text.SpannableStringBuilder r11 = zzi(r14, r15)
            r11.append(r6)
            return
        L4c:
            boolean r0 = r10.zzg(r11)
            if (r0 == 0) goto L104
            java.util.Set r0 = r15.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L5a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.HashMap r2 = r10.zzk
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.ads.zzcz r1 = (com.google.android.gms.internal.ads.zzcz) r1
            java.lang.CharSequence r1 = r1.zzq()
            java.util.Objects.requireNonNull(r1)
            int r1 = r1.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r1)
            goto L5a
        L87:
            java.lang.String r0 = r10.zza
            java.lang.String r1 = "p"
            boolean r7 = r1.equals(r0)
            r8 = 0
            r9 = 0
        L91:
            int r0 = r10.zza()
            if (r9 >= r0) goto Lad
            com.google.android.gms.internal.ads.zzals r0 = r10.zzd(r9)
            r1 = 1
            if (r13 != 0) goto La3
            if (r7 == 0) goto La1
            goto La3
        La1:
            r3 = 0
            goto La4
        La3:
            r3 = 1
        La4:
            r1 = r11
            r4 = r14
            r5 = r15
            r0.zzm(r1, r3, r4, r5)
            int r9 = r9 + 1
            goto L91
        Lad:
            if (r7 == 0) goto Lcf
            android.text.SpannableStringBuilder r11 = zzi(r14, r15)
            int r12 = r11.length()
        Lb7:
            int r12 = r12 + (-1)
            if (r12 < 0) goto Lc4
            char r13 = r11.charAt(r12)
            r14 = 32
            if (r13 != r14) goto Lc4
            goto Lb7
        Lc4:
            if (r12 < 0) goto Lcf
            char r12 = r11.charAt(r12)
            if (r12 == r6) goto Lcf
            r11.append(r6)
        Lcf:
            java.util.Set r11 = r15.entrySet()
            java.util.Iterator r11 = r11.iterator()
        Ld7:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L104
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.util.HashMap r13 = r10.zzl
            java.lang.Object r14 = r12.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r12.getValue()
            com.google.android.gms.internal.ads.zzcz r12 = (com.google.android.gms.internal.ads.zzcz) r12
            java.lang.CharSequence r12 = r12.zzq()
            java.util.Objects.requireNonNull(r12)
            int r12 = r12.length()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.put(r14, r12)
            goto Ld7
        L104:
            return
    }

    public final int zza() {
            r1 = this;
            java.util.List r0 = r1.zzm
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzals zzd(int r2) {
            r1 = this;
            java.util.List r0 = r1.zzm
            if (r0 == 0) goto Lb
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzals r2 = (com.google.android.gms.internal.ads.zzals) r2
            return r2
        Lb:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public final java.util.List zze(long r10, java.util.Map r12, java.util.Map r13, java.util.Map r14) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r9.zzg
            r9.zzk(r10, r1, r0)
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            java.lang.String r6 = r9.zzg
            r5 = 0
            r2 = r9
            r3 = r10
            r7 = r1
            r2.zzm(r3, r5, r6, r7)
            java.lang.String r7 = r9.zzg
            r5 = r12
            r6 = r13
            r8 = r1
            r2.zzl(r3, r5, r6, r7, r8)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r11 = r0.size()
            r12 = 0
            r2 = 0
        L2b:
            if (r2 >= r11) goto L85
            java.lang.Object r3 = r0.get(r2)
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r4 = r3.second
            java.lang.Object r4 = r14.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L3e
            goto L82
        L3e:
            byte[] r4 = android.util.Base64.decode(r4, r12)
            int r5 = r4.length
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r4, r12, r5)
            java.lang.Object r3 = r3.first
            java.lang.Object r3 = r13.get(r3)
            com.google.android.gms.internal.ads.zzalw r3 = (com.google.android.gms.internal.ads.zzalw) r3
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzcz r5 = new com.google.android.gms.internal.ads.zzcz
            r5.<init>()
            r5.zzc(r4)
            float r4 = r3.zzb
            r5.zzh(r4)
            r5.zzi(r12)
            float r4 = r3.zzc
            r5.zze(r4, r12)
            int r4 = r3.zze
            r5.zzf(r4)
            float r4 = r3.zzf
            r5.zzk(r4)
            float r4 = r3.zzg
            r5.zzd(r4)
            int r3 = r3.zzj
            r5.zzo(r3)
            com.google.android.gms.internal.ads.zzdb r3 = r5.zzp()
            r10.add(r3)
        L82:
            int r2 = r2 + 1
            goto L2b
        L85:
            java.util.Set r11 = r1.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L8d:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L1b6
            java.lang.Object r14 = r11.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r0 = r14.getKey()
            java.lang.Object r0 = r13.get(r0)
            com.google.android.gms.internal.ads.zzalw r0 = (com.google.android.gms.internal.ads.zzalw) r0
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r14 = r14.getValue()
            com.google.android.gms.internal.ads.zzcz r14 = (com.google.android.gms.internal.ads.zzcz) r14
            java.lang.CharSequence r1 = r14.zzq()
            java.util.Objects.requireNonNull(r1)
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            int r2 = r1.length()
            java.lang.Class<com.google.android.gms.internal.ads.zzalq> r3 = com.google.android.gms.internal.ads.zzalq.class
            java.lang.Object[] r2 = r1.getSpans(r12, r2, r3)
            com.google.android.gms.internal.ads.zzalq[] r2 = (com.google.android.gms.internal.ads.zzalq[]) r2
            int r3 = r2.length
            r4 = 0
        Lc3:
            if (r4 >= r3) goto Ld7
            r5 = r2[r4]
            int r6 = r1.getSpanStart(r5)
            int r5 = r1.getSpanEnd(r5)
            java.lang.String r7 = ""
            r1.replace(r6, r5, r7)
            int r4 = r4 + 1
            goto Lc3
        Ld7:
            r2 = 0
        Ld8:
            int r3 = r1.length()
            r4 = 32
            if (r2 >= r3) goto L101
            int r3 = r2 + 1
            char r5 = r1.charAt(r2)
            if (r5 != r4) goto Lff
            r5 = r3
        Le9:
            int r6 = r1.length()
            if (r5 >= r6) goto Lf8
            char r6 = r1.charAt(r5)
            if (r6 != r4) goto Lf8
            int r5 = r5 + 1
            goto Le9
        Lf8:
            int r5 = r5 - r3
            if (r5 <= 0) goto Lff
            int r5 = r5 + r2
            r1.delete(r2, r5)
        Lff:
            r2 = r3
            goto Ld8
        L101:
            int r2 = r1.length()
            if (r2 <= 0) goto L111
            char r2 = r1.charAt(r12)
            if (r2 != r4) goto L111
            r2 = 1
            r1.delete(r12, r2)
        L111:
            r2 = 0
        L112:
            int r3 = r1.length()
            int r3 = r3 + (-1)
            r5 = 10
            if (r2 >= r3) goto L131
            int r3 = r2 + 1
            char r6 = r1.charAt(r2)
            if (r6 != r5) goto L12f
            char r5 = r1.charAt(r3)
            if (r5 != r4) goto L12f
            int r2 = r2 + 2
            r1.delete(r3, r2)
        L12f:
            r2 = r3
            goto L112
        L131:
            int r2 = r1.length()
            if (r2 <= 0) goto L150
            int r2 = r1.length()
            int r2 = r2 + (-1)
            char r2 = r1.charAt(r2)
            if (r2 != r4) goto L150
            int r2 = r1.length()
            int r2 = r2 + (-1)
            int r3 = r1.length()
            r1.delete(r2, r3)
        L150:
            r2 = 0
        L151:
            int r3 = r1.length()
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L16c
            int r3 = r2 + 1
            char r6 = r1.charAt(r2)
            if (r6 != r4) goto L16a
            char r6 = r1.charAt(r3)
            if (r6 != r5) goto L16a
            r1.delete(r2, r3)
        L16a:
            r2 = r3
            goto L151
        L16c:
            int r2 = r1.length()
            if (r2 <= 0) goto L18b
            int r2 = r1.length()
            int r2 = r2 + (-1)
            char r2 = r1.charAt(r2)
            if (r2 != r5) goto L18b
            int r2 = r1.length()
            int r2 = r2 + (-1)
            int r3 = r1.length()
            r1.delete(r2, r3)
        L18b:
            float r1 = r0.zzc
            int r2 = r0.zzd
            r14.zze(r1, r2)
            int r1 = r0.zze
            r14.zzf(r1)
            float r1 = r0.zzb
            r14.zzh(r1)
            float r1 = r0.zzf
            r14.zzk(r1)
            float r1 = r0.zzi
            int r2 = r0.zzh
            r14.zzn(r1, r2)
            int r0 = r0.zzj
            r14.zzo(r0)
            com.google.android.gms.internal.ads.zzdb r14 = r14.zzp()
            r10.add(r14)
            goto L8d
        L1b6:
            return r10
    }

    public final void zzf(com.google.android.gms.internal.ads.zzals r2) {
            r1 = this;
            java.util.List r0 = r1.zzm
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzm = r0
        Lb:
            java.util.List r0 = r1.zzm
            r0.add(r2)
            return
    }

    public final boolean zzg(long r11) {
            r10 = this;
            long r0 = r10.zzd
            r2 = 0
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L17
            long r0 = r10.zze
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L15
            r0 = r4
            goto L17
        L15:
            r2 = 1
            goto L34
        L17:
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 > 0) goto L21
            long r7 = r10.zze
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 == 0) goto L15
        L21:
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L2b
            long r0 = r10.zze
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 < 0) goto L15
        L2b:
            if (r6 > 0) goto L34
            long r0 = r10.zze
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 >= 0) goto L34
            goto L15
        L34:
            return r2
    }

    public final long[] zzh() {
            r6 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1 = 0
            r6.zzj(r0, r1)
            int r2 = r0.size()
            long[] r2 = new long[r2]
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r0.next()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r5 = r1 + 1
            r2[r1] = r3
            r1 = r5
            goto L13
        L29:
            return r2
    }
}
