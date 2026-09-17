package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzama implements com.google.android.gms.internal.ads.zzakv {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final java.lang.String zze;
    private final float zzf;
    private final int zzg;

    public zzama(java.util.List r10) {
            r9 = this;
            r9.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r9.zza = r0
            int r0 = r10.size()
            r1 = 1062836634(0x3f59999a, float:0.85)
            java.lang.String r2 = "sans-serif"
            r3 = 1
            r4 = 0
            if (r0 != r3) goto Laa
            java.lang.Object r0 = r10.get(r4)
            byte[] r0 = (byte[]) r0
            int r0 = r0.length
            r5 = 48
            if (r0 == r5) goto L2d
            java.lang.Object r0 = r10.get(r4)
            byte[] r0 = (byte[]) r0
            int r0 = r0.length
            r5 = 53
            if (r0 != r5) goto Laa
        L2d:
            java.lang.Object r10 = r10.get(r4)
            byte[] r10 = (byte[]) r10
            r0 = 24
            r5 = r10[r0]
            r9.zzc = r5
            r5 = 26
            r5 = r10[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 27
            r6 = r10[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r7 = 28
            r7 = r10[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 29
            r8 = r10[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r0 = r5 << 24
            int r5 = r6 << 16
            r0 = r0 | r5
            int r5 = r7 << 8
            r0 = r0 | r5
            r0 = r0 | r8
            r9.zzd = r0
            r0 = 43
            int r5 = r10.length
            int r5 = r5 + (-43)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeu.zzB(r10, r0, r5)
            java.lang.String r5 = "Serif"
            boolean r0 = r5.equals(r0)
            if (r3 == r0) goto L6e
            goto L70
        L6e:
            java.lang.String r2 = "serif"
        L70:
            r9.zze = r2
            r0 = 25
            r0 = r10[r0]
            int r0 = r0 * 20
            r9.zzg = r0
            r2 = r10[r4]
            r2 = r2 & 32
            if (r2 == 0) goto L81
            goto L82
        L81:
            r3 = 0
        L82:
            r9.zzb = r3
            if (r3 == 0) goto La7
            r1 = 0
            r2 = 10
            r2 = r10[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r3 = 11
            r10 = r10[r3]
            r10 = r10 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            r10 = r10 | r2
            float r10 = (float) r10
            float r10 = r10 / r0
            r0 = 1064514355(0x3f733333, float:0.95)
            float r10 = java.lang.Math.min(r10, r0)
            float r10 = java.lang.Math.max(r1, r10)
            r9.zzf = r10
            return
        La7:
            r9.zzf = r1
            return
        Laa:
            r9.zzc = r4
            r10 = -1
            r9.zzd = r10
            r9.zze = r2
            r9.zzb = r4
            r9.zzf = r1
            r9.zzg = r10
            return
    }

    private static void zzb(android.text.SpannableStringBuilder r1, int r2, int r3, int r4, int r5, int r6) {
            if (r2 == r3) goto L13
            r3 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 24
            int r2 = r2 >>> 8
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r2 = r2 | r3
            r0.<init>(r2)
            r2 = r6 | 33
            r1.setSpan(r0, r4, r5, r2)
        L13:
            return
    }

    private static void zzc(android.text.SpannableStringBuilder r4, int r5, int r6, int r7, int r8, int r9) {
            if (r5 == r6) goto L47
            r6 = r9 | 33
            r9 = r5 & 1
            r0 = r5 & 2
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L21
            if (r0 == 0) goto L18
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r3 = 3
            r0.<init>(r3)
            r4.setSpan(r0, r7, r8, r6)
            goto L2e
        L18:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            r4.setSpan(r0, r7, r8, r6)
            goto L2d
        L21:
            if (r0 == 0) goto L2d
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r3 = 2
            r0.<init>(r3)
            r4.setSpan(r0, r7, r8, r6)
            goto L2e
        L2d:
            r2 = 0
        L2e:
            r5 = r5 & 4
            if (r5 != 0) goto L3f
            if (r9 != 0) goto L47
            if (r2 != 0) goto L47
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r1)
            r4.setSpan(r5, r7, r8, r6)
            return
        L3f:
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            r4.setSpan(r5, r7, r8, r6)
        L47:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] r20, int r21, int r22, com.google.android.gms.internal.ads.zzaku r23, com.google.android.gms.internal.ads.zzdn r24) {
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r24
            int r3 = r1 + r22
            com.google.android.gms.internal.ads.zzek r4 = r0.zza
            r5 = r20
            r4.zzJ(r5, r3)
            com.google.android.gms.internal.ads.zzek r3 = r0.zza
            r3.zzL(r1)
            com.google.android.gms.internal.ads.zzek r1 = r0.zza
            int r3 = r1.zzb()
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 < r4) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = 0
        L22:
            com.google.android.gms.internal.ads.zzdi.zzd(r3)
            int r3 = r1.zzq()
            if (r3 != 0) goto L2e
            java.lang.String r1 = ""
            goto L45
        L2e:
            int r7 = r1.zzd()
            java.nio.charset.Charset r8 = r1.zzC()
            int r9 = r1.zzd()
            int r9 = r9 - r7
            if (r8 == 0) goto L3e
            goto L40
        L3e:
            java.nio.charset.Charset r8 = com.google.android.gms.internal.ads.zzfxo.zzc
        L40:
            int r3 = r3 - r9
            java.lang.String r1 = r1.zzB(r3, r8)
        L45:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L5f
            com.google.android.gms.internal.ads.zzakn r1 = new com.google.android.gms.internal.ads.zzakn
            com.google.android.gms.internal.ads.zzgax r8 = com.google.android.gms.internal.ads.zzgax.zzn()
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r1
            r9 = r11
            r7.<init>(r8, r9, r11)
            r2.zza(r1)
            return
        L5f:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r1)
            int r14 = r0.zzc
            r15 = 0
            r16 = 0
            int r17 = r3.length()
            r18 = 16711680(0xff0000, float:2.3418052E-38)
            r13 = r3
            zzc(r13, r14, r15, r16, r17, r18)
            int r14 = r0.zzd
            r15 = -1
            int r17 = r3.length()
            zzb(r13, r14, r15, r16, r17, r18)
            java.lang.String r1 = r0.zze
            int r7 = r3.length()
            java.lang.String r8 = "sans-serif"
            if (r1 == r8) goto L92
            android.text.style.TypefaceSpan r8 = new android.text.style.TypefaceSpan
            r8.<init>(r1)
            r1 = 16711713(0xff0021, float:2.3418098E-38)
            r3.setSpan(r8, r6, r7, r1)
        L92:
            float r1 = r0.zzf
        L94:
            com.google.android.gms.internal.ads.zzek r7 = r0.zza
            int r8 = r7.zzb()
            r9 = 8
            if (r8 < r9) goto L19d
            int r8 = r7.zzd()
            int r7 = r7.zzg()
            com.google.android.gms.internal.ads.zzek r9 = r0.zza
            int r9 = r9.zzg()
            r10 = 1937013100(0x7374796c, float:1.936925E31)
            if (r9 != r10) goto L162
            com.google.android.gms.internal.ads.zzek r9 = r0.zza
            int r9 = r9.zzb()
            if (r9 < r4) goto Lbb
            r9 = 1
            goto Lbc
        Lbb:
            r9 = 0
        Lbc:
            com.google.android.gms.internal.ads.zzdi.zzd(r9)
            com.google.android.gms.internal.ads.zzek r9 = r0.zza
            int r9 = r9.zzq()
            r10 = 0
        Lc6:
            if (r10 >= r9) goto L193
            com.google.android.gms.internal.ads.zzek r11 = r0.zza
            int r12 = r11.zzb()
            r13 = 12
            if (r12 < r13) goto Ld4
            r12 = 1
            goto Ld5
        Ld4:
            r12 = 0
        Ld5:
            com.google.android.gms.internal.ads.zzdi.zzd(r12)
            int r12 = r11.zzq()
            int r13 = r11.zzq()
            r11.zzM(r4)
            int r14 = r11.zzm()
            r11.zzM(r5)
            int r11 = r11.zzg()
            int r15 = r3.length()
            java.lang.String r5 = "Tx3gParser"
            java.lang.String r6 = ")."
            if (r13 <= r15) goto L122
            int r15 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r23 = r9
            java.lang.String r9 = "Truncating styl end ("
            r4.append(r9)
            r4.append(r13)
            java.lang.String r9 = ") to cueText.length() ("
            r4.append(r9)
            r4.append(r15)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r5, r4)
            int r4 = r3.length()
            goto L125
        L122:
            r23 = r9
            r4 = r13
        L125:
            if (r12 < r4) goto L147
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Ignoring styl with start ("
            r9.append(r11)
            r9.append(r12)
            java.lang.String r11 = ") >= end ("
            r9.append(r11)
            r9.append(r4)
            r9.append(r6)
            java.lang.String r4 = r9.toString()
            com.google.android.gms.internal.ads.zzea.zzf(r5, r4)
            goto L159
        L147:
            int r15 = r0.zzc
            r18 = 0
            r13 = r3
            r16 = r12
            r17 = r4
            zzc(r13, r14, r15, r16, r17, r18)
            int r15 = r0.zzd
            r14 = r11
            zzb(r13, r14, r15, r16, r17, r18)
        L159:
            int r10 = r10 + 1
            r9 = r23
            r4 = 2
            r5 = 1
            r6 = 0
            goto Lc6
        L162:
            r4 = 1952608120(0x74626f78, float:7.176025E31)
            if (r9 != r4) goto L192
            boolean r4 = r0.zzb
            if (r4 == 0) goto L192
            com.google.android.gms.internal.ads.zzek r1 = r0.zza
            int r1 = r1.zzb()
            r4 = 2
            if (r1 < r4) goto L176
            r1 = 1
            goto L177
        L176:
            r1 = 0
        L177:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
            r1 = 0
            com.google.android.gms.internal.ads.zzek r5 = r0.zza
            int r5 = r5.zzq()
            float r5 = (float) r5
            int r6 = r0.zzg
            float r6 = (float) r6
            float r5 = r5 / r6
            r6 = 1064514355(0x3f733333, float:0.95)
            float r5 = java.lang.Math.min(r5, r6)
            float r1 = java.lang.Math.max(r1, r5)
            goto L193
        L192:
            r4 = 2
        L193:
            com.google.android.gms.internal.ads.zzek r5 = r0.zza
            int r8 = r8 + r7
            r5.zzL(r8)
            r5 = 1
            r6 = 0
            goto L94
        L19d:
            com.google.android.gms.internal.ads.zzcz r4 = new com.google.android.gms.internal.ads.zzcz
            r4.<init>()
            r4.zzl(r3)
            r3 = 0
            r4.zze(r1, r3)
            r4.zzf(r3)
            com.google.android.gms.internal.ads.zzdb r1 = r4.zzp()
            com.google.android.gms.internal.ads.zzakn r9 = new com.google.android.gms.internal.ads.zzakn
            com.google.android.gms.internal.ads.zzgax r4 = com.google.android.gms.internal.ads.zzgax.zzo(r1)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r9
            r5 = r7
            r3.<init>(r4, r5, r7)
            r2.zza(r9)
            return
    }
}
