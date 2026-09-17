package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhei extends com.google.android.gms.internal.ads.zzheh {
    zzhei() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    final int zza(int r12, byte[] r13, int r14, int r15) {
            r11 = this;
            r0 = -19
            r1 = -62
            r2 = -16
            r3 = 0
            r4 = -96
            r5 = -32
            r6 = -65
            r7 = -1
            if (r12 == 0) goto L84
            if (r14 < r15) goto L13
            return r12
        L13:
            byte r8 = (byte) r12
            if (r8 >= r5) goto L22
            if (r8 < r1) goto L21
            int r12 = r14 + 1
            r14 = r13[r14]
            if (r14 > r6) goto L21
        L1e:
            r14 = r12
            goto L84
        L21:
            return r7
        L22:
            int r9 = r12 >> 8
            int r9 = ~r9
            if (r8 >= r2) goto L4b
            byte r12 = (byte) r9
            if (r12 != 0) goto L39
            int r12 = r14 + 1
            r14 = r13[r14]
            if (r12 >= r15) goto L34
            r10 = r14
            r14 = r12
            r12 = r10
            goto L39
        L34:
            int r12 = com.google.android.gms.internal.ads.zzhek.zza(r8, r14)
            return r12
        L39:
            if (r12 > r6) goto L4a
            if (r8 != r5) goto L3f
            if (r12 < r4) goto L4a
        L3f:
            if (r8 != r0) goto L43
            if (r12 >= r4) goto L4a
        L43:
            int r12 = r14 + 1
            r14 = r13[r14]
            if (r14 > r6) goto L4a
            goto L1e
        L4a:
            return r7
        L4b:
            byte r9 = (byte) r9
            if (r9 != 0) goto L5c
            int r12 = r14 + 1
            r9 = r13[r14]
            if (r12 >= r15) goto L57
            r14 = r12
            r12 = 0
            goto L5e
        L57:
            int r12 = com.google.android.gms.internal.ads.zzhek.zza(r8, r9)
            return r12
        L5c:
            int r12 = r12 >> 16
        L5e:
            if (r12 != 0) goto L6f
            int r12 = r14 + 1
            r14 = r13[r14]
            if (r12 >= r15) goto L6a
            r10 = r14
            r14 = r12
            r12 = r10
            goto L6f
        L6a:
            int r12 = com.google.android.gms.internal.ads.zzhek.zzb(r8, r9, r14)
            return r12
        L6f:
            if (r9 > r6) goto L83
            int r8 = r8 << 28
            int r9 = r9 + 112
            int r8 = r8 + r9
            int r8 = r8 >> 30
            if (r8 != 0) goto L83
            if (r12 > r6) goto L83
            int r12 = r14 + 1
            r14 = r13[r14]
            if (r14 > r6) goto L83
            goto L1e
        L83:
            return r7
        L84:
            if (r14 >= r15) goto L8d
            r12 = r13[r14]
            if (r12 < 0) goto L8d
            int r14 = r14 + 1
            goto L84
        L8d:
            if (r14 < r15) goto L91
            goto Lef
        L91:
            if (r14 < r15) goto L94
            goto Lef
        L94:
            int r12 = r14 + 1
            r14 = r13[r14]
            if (r14 >= 0) goto Lf0
            if (r14 >= r5) goto Laa
            if (r12 < r15) goto La0
            r3 = r14
            goto Lef
        La0:
            if (r14 < r1) goto La8
            int r14 = r12 + 1
            r12 = r13[r12]
            if (r12 <= r6) goto L91
        La8:
            r3 = -1
            goto Lef
        Laa:
            if (r14 >= r2) goto Lca
            int r8 = r15 + (-1)
            if (r12 < r8) goto Lb5
            int r3 = com.google.android.gms.internal.ads.zzhek.zzc(r13, r12, r15)
            goto Lef
        Lb5:
            int r8 = r12 + 1
            r12 = r13[r12]
            if (r12 > r6) goto La8
            if (r14 != r5) goto Lbf
            if (r12 < r4) goto La8
        Lbf:
            if (r14 != r0) goto Lc3
            if (r12 >= r4) goto La8
        Lc3:
            int r14 = r8 + 1
            r12 = r13[r8]
            if (r12 <= r6) goto L91
            goto La8
        Lca:
            int r8 = r15 + (-2)
            if (r12 < r8) goto Ld3
            int r3 = com.google.android.gms.internal.ads.zzhek.zzc(r13, r12, r15)
            goto Lef
        Ld3:
            int r8 = r12 + 1
            r12 = r13[r12]
            if (r12 > r6) goto La8
            int r14 = r14 << 28
            int r12 = r12 + 112
            int r14 = r14 + r12
            int r12 = r14 >> 30
            if (r12 != 0) goto La8
            int r12 = r8 + 1
            r14 = r13[r8]
            if (r14 > r6) goto La8
            int r14 = r12 + 1
            r12 = r13[r12]
            if (r12 <= r6) goto L91
            goto La8
        Lef:
            return r3
        Lf0:
            r14 = r12
            goto L91
    }

    @Override // com.google.android.gms.internal.ads.zzheh
    final java.lang.String zzb(byte[] r11, int r12, int r13) throws com.google.android.gms.internal.ads.zzhbt {
            r10 = this;
            int r0 = r11.length
            int r1 = r0 - r12
            r2 = r12 | r13
            int r1 = r1 - r13
            r1 = r1 | r2
            r2 = 0
            if (r1 < 0) goto Lac
            int r0 = r12 + r13
            char[] r13 = new char[r13]
            r1 = 0
        Lf:
            if (r12 >= r0) goto L22
            r3 = r11[r12]
            boolean r4 = com.google.android.gms.internal.ads.zzheg.zzd(r3)
            if (r4 == 0) goto L22
            int r12 = r12 + 1
            int r4 = r1 + 1
            char r3 = (char) r3
            r13[r1] = r3
            r1 = r4
            goto Lf
        L22:
            if (r12 >= r0) goto La6
            int r3 = r12 + 1
            r12 = r11[r12]
            boolean r4 = com.google.android.gms.internal.ads.zzheg.zzd(r12)
            if (r4 == 0) goto L47
            int r4 = r1 + 1
            char r12 = (char) r12
            r13[r1] = r12
            r12 = r3
        L34:
            r1 = r4
            if (r12 >= r0) goto L22
            r3 = r11[r12]
            boolean r4 = com.google.android.gms.internal.ads.zzheg.zzd(r3)
            if (r4 == 0) goto L22
            int r12 = r12 + 1
            int r4 = r1 + 1
            char r3 = (char) r3
            r13[r1] = r3
            goto L34
        L47:
            boolean r4 = com.google.android.gms.internal.ads.zzheg.zzf(r12)
            java.lang.String r5 = "Protocol message had invalid UTF-8."
            if (r4 == 0) goto L63
            if (r3 >= r0) goto L5d
            int r4 = r1 + 1
            int r5 = r3 + 1
            r3 = r11[r3]
            com.google.android.gms.internal.ads.zzheg.zzc(r12, r3, r13, r1)
            r1 = r4
            r12 = r5
            goto L22
        L5d:
            com.google.android.gms.internal.ads.zzhbt r11 = new com.google.android.gms.internal.ads.zzhbt
            r11.<init>(r5)
            throw r11
        L63:
            boolean r4 = com.google.android.gms.internal.ads.zzheg.zze(r12)
            if (r4 == 0) goto L83
            int r4 = r0 + (-1)
            if (r3 >= r4) goto L7d
            int r4 = r1 + 1
            int r5 = r3 + 1
            r3 = r11[r3]
            int r6 = r5 + 1
            r5 = r11[r5]
            com.google.android.gms.internal.ads.zzheg.zzb(r12, r3, r5, r13, r1)
            r1 = r4
            r12 = r6
            goto L22
        L7d:
            com.google.android.gms.internal.ads.zzhbt r11 = new com.google.android.gms.internal.ads.zzhbt
            r11.<init>(r5)
            throw r11
        L83:
            int r4 = r0 + (-2)
            if (r3 >= r4) goto La0
            int r4 = r3 + 1
            r5 = r11[r3]
            int r3 = r4 + 1
            r6 = r11[r4]
            int r9 = r3 + 1
            r7 = r11[r3]
            r3 = r12
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r13
            r8 = r1
            com.google.android.gms.internal.ads.zzheg.zza(r3, r4, r5, r6, r7, r8)
            int r1 = r1 + 2
            r12 = r9
            goto L22
        La0:
            com.google.android.gms.internal.ads.zzhbt r11 = new com.google.android.gms.internal.ads.zzhbt
            r11.<init>(r5)
            throw r11
        La6:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r13, r2, r1)
            return r11
        Lac:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r2] = r0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0 = 1
            r1[r0] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r13 = 2
            r1[r13] = r12
            java.lang.String r12 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r12 = java.lang.String.format(r12, r1)
            r11.<init>(r12)
            throw r11
    }
}
