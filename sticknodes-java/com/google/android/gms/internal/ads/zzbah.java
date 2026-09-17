package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbah {
    private final com.google.android.gms.internal.ads.zzazw zza;
    private final int zzb;
    private final int zzc;

    public zzbah(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r1 = 64
            if (r2 > r1) goto Lb
            if (r2 >= 0) goto Ld
        Lb:
            r2 = 64
        Ld:
            if (r3 > 0) goto L13
            r1 = 1
            r0.zzc = r1
            goto L15
        L13:
            r0.zzc = r3
        L15:
            com.google.android.gms.internal.ads.zzbaf r1 = new com.google.android.gms.internal.ads.zzbaf
            r1.<init>(r2)
            r0.zza = r1
            return
    }

    public final java.lang.String zza(java.util.ArrayList r17, java.util.ArrayList r18) {
            r16 = this;
            r1 = r16
            r0 = r18
            com.google.android.gms.internal.ads.zzbag r2 = new com.google.android.gms.internal.ads.zzbag
            r2.<init>(r1)
            java.util.Collections.sort(r0, r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4 = 0
        L12:
            int r5 = r18.size()
            if (r4 >= r5) goto Lf5
            java.lang.Object r5 = r0.get(r4)
            com.google.android.gms.internal.ads.zzazv r5 = (com.google.android.gms.internal.ads.zzazv) r5
            int r5 = r5.zze()
            r6 = r17
            java.lang.Object r5 = r6.get(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.text.Normalizer$Form r7 = java.text.Normalizer.Form.NFKC
            java.lang.String r5 = java.text.Normalizer.normalize(r5, r7)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r7)
            java.lang.String r7 = "\n"
            java.lang.String[] r5 = r5.split(r7)
            int r7 = r5.length
            if (r7 != 0) goto L41
            goto Lf1
        L41:
            r7 = 0
        L42:
            int r8 = r5.length
            if (r7 >= r8) goto Lf1
            r8 = r5[r7]
            java.lang.String r9 = "'"
            boolean r9 = r8.contains(r9)
            r10 = 1
            if (r9 == 0) goto La6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            r11 = 1
            r12 = 0
        L57:
            int r13 = r11 + 2
            int r14 = r9.length()
            if (r13 > r14) goto L9a
            char r14 = r9.charAt(r11)
            r15 = 39
            if (r14 != r15) goto L98
            int r12 = r11 + (-1)
            char r12 = r9.charAt(r12)
            r14 = 32
            if (r12 == r14) goto L94
            int r12 = r11 + 1
            char r15 = r9.charAt(r12)
            r3 = 115(0x73, float:1.61E-43)
            if (r15 == r3) goto L83
            char r3 = r9.charAt(r12)
            r12 = 83
            if (r3 != r12) goto L94
        L83:
            int r3 = r9.length()
            if (r13 == r3) goto L8f
            char r3 = r9.charAt(r13)
            if (r3 != r14) goto L94
        L8f:
            r9.insert(r11, r14)
            r11 = r13
            goto L97
        L94:
            r9.setCharAt(r11, r14)
        L97:
            r12 = 1
        L98:
            int r11 = r11 + r10
            goto L57
        L9a:
            if (r12 == 0) goto La1
            java.lang.String r3 = r9.toString()
            goto La2
        La1:
            r3 = 0
        La2:
            if (r3 != 0) goto La5
            goto La6
        La5:
            r8 = r3
        La6:
            java.lang.String[] r3 = com.google.android.gms.internal.ads.zzbaa.zzb(r8, r10)
            int r8 = r3.length
            int r9 = r1.zzc
            if (r8 >= r9) goto Lb0
            goto Led
        Lb0:
            r8 = 0
        Lb1:
            int r9 = r3.length
            if (r8 >= r9) goto Le4
            java.lang.String r9 = ""
            r10 = 0
        Lb7:
            int r11 = r1.zzc
            if (r10 >= r11) goto Ld6
            int r11 = r8 + r10
            int r12 = r3.length
            if (r11 < r12) goto Lc1
            goto Le4
        Lc1:
            if (r10 <= 0) goto Lc9
            java.lang.String r12 = " "
            java.lang.String r9 = r9.concat(r12)
        Lc9:
            r11 = r3[r11]
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r9 = r9.concat(r11)
            int r10 = r10 + 1
            goto Lb7
        Ld6:
            r2.add(r9)
            int r9 = r2.size()
            int r10 = r1.zzb
            if (r9 >= r10) goto Lf5
            int r8 = r8 + 1
            goto Lb1
        Le4:
            int r3 = r2.size()
            int r8 = r1.zzb
            if (r3 < r8) goto Led
            goto Lf5
        Led:
            int r7 = r7 + 1
            goto L42
        Lf1:
            int r4 = r4 + 1
            goto L12
        Lf5:
            com.google.android.gms.internal.ads.zzazy r3 = new com.google.android.gms.internal.ads.zzazy
            r3.<init>()
            java.util.Iterator r0 = r2.iterator()
        Lfe:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L11c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzazw r4 = r1.zza     // Catch: java.io.IOException -> L116
            byte[] r2 = r4.zzb(r2)     // Catch: java.io.IOException -> L116
            android.util.Base64OutputStream r4 = r3.zzb     // Catch: java.io.IOException -> L116
            r4.write(r2)     // Catch: java.io.IOException -> L116
            goto Lfe
        L116:
            r0 = move-exception
            java.lang.String r2 = "Error while writing hash to byteStream"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
        L11c:
            java.lang.String r0 = r3.toString()
            return r0
    }
}
