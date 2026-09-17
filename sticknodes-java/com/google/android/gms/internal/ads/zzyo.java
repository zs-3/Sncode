package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzyo extends com.google.android.gms.internal.ads.zzyr {
    public zzyo() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract android.util.Pair zzd(com.google.android.gms.internal.ads.zzyn r1, int[][][] r2, int[] r3, com.google.android.gms.internal.ads.zzuy r4, com.google.android.gms.internal.ads.zzcc r5) throws com.google.android.gms.internal.ads.zzij;

    @Override // com.google.android.gms.internal.ads.zzyr
    public final com.google.android.gms.internal.ads.zzys zzo(com.google.android.gms.internal.ads.zzlu[] r17, com.google.android.gms.internal.ads.zzwy r18, com.google.android.gms.internal.ads.zzuy r19, com.google.android.gms.internal.ads.zzcc r20) throws com.google.android.gms.internal.ads.zzij {
            r16 = this;
            r0 = r18
            r1 = 3
            int[] r2 = new int[r1]
            com.google.android.gms.internal.ads.zzcd[][] r3 = new com.google.android.gms.internal.ads.zzcd[r1][]
            int[][][] r11 = new int[r1][][]
            r4 = 0
        La:
            if (r4 >= r1) goto L19
            int r5 = r0.zzb
            com.google.android.gms.internal.ads.zzcd[] r6 = new com.google.android.gms.internal.ads.zzcd[r5]
            r3[r4] = r6
            int[][] r5 = new int[r5][]
            r11[r4] = r5
            int r4 = r4 + 1
            goto La
        L19:
            r1 = 2
            int[] r13 = new int[r1]
            r4 = 0
        L1d:
            if (r4 >= r1) goto L2a
            r5 = r17[r4]
            int r5 = r5.zze()
            r13[r4] = r5
            int r4 = r4 + 1
            goto L1d
        L2a:
            r4 = 0
        L2b:
            int r5 = r0.zzb
            if (r4 >= r5) goto La3
            com.google.android.gms.internal.ads.zzcd r5 = r0.zzb(r4)
            int r6 = r5.zzc
            r7 = 0
            r8 = 2
            r9 = 0
            r10 = 1
        L39:
            if (r7 >= r1) goto L71
            r15 = r17[r7]
            r12 = 0
            r14 = 0
        L3f:
            int r1 = r5.zza
            if (r12 >= r1) goto L54
            com.google.android.gms.internal.ads.zzaf r1 = r5.zzb(r12)
            int r1 = r15.zzY(r1)
            r1 = r1 & 7
            int r14 = java.lang.Math.max(r14, r1)
            int r12 = r12 + 1
            goto L3f
        L54:
            r1 = r2[r7]
            if (r1 != 0) goto L5a
            r1 = 1
            goto L5b
        L5a:
            r1 = 0
        L5b:
            if (r14 > r9) goto L6a
            if (r14 != r9) goto L6d
            r12 = 5
            if (r6 != r12) goto L6d
            if (r10 != 0) goto L6d
            if (r1 == 0) goto L6d
            r8 = r7
            r9 = r14
            r10 = 1
            goto L6d
        L6a:
            r10 = r1
            r8 = r7
            r9 = r14
        L6d:
            int r7 = r7 + 1
            r1 = 2
            goto L39
        L71:
            if (r8 != r1) goto L78
            int r1 = r5.zza
            int[] r1 = new int[r1]
            goto L91
        L78:
            r1 = r17[r8]
            int r6 = r5.zza
            int[] r6 = new int[r6]
            r7 = 0
        L7f:
            int r9 = r5.zza
            if (r7 >= r9) goto L90
            com.google.android.gms.internal.ads.zzaf r9 = r5.zzb(r7)
            int r9 = r1.zzY(r9)
            r6[r7] = r9
            int r7 = r7 + 1
            goto L7f
        L90:
            r1 = r6
        L91:
            r6 = r2[r8]
            r7 = r3[r8]
            r7[r6] = r5
            r5 = r11[r8]
            r5[r6] = r1
            r1 = 1
            int r6 = r6 + r1
            r2[r8] = r6
            int r4 = r4 + 1
            r1 = 2
            goto L2b
        La3:
            r1 = 1
            r4 = 2
            com.google.android.gms.internal.ads.zzwy[] r7 = new com.google.android.gms.internal.ads.zzwy[r4]
            java.lang.String[] r5 = new java.lang.String[r4]
            int[] r6 = new int[r4]
            r0 = 0
        Lac:
            if (r0 >= r4) goto Ldd
            r4 = r2[r0]
            com.google.android.gms.internal.ads.zzwy r8 = new com.google.android.gms.internal.ads.zzwy
            r9 = r3[r0]
            java.lang.Object[] r9 = com.google.android.gms.internal.ads.zzeu.zzN(r9, r4)
            com.google.android.gms.internal.ads.zzcd[] r9 = (com.google.android.gms.internal.ads.zzcd[]) r9
            r8.<init>(r9)
            r7[r0] = r8
            r8 = r11[r0]
            java.lang.Object[] r4 = com.google.android.gms.internal.ads.zzeu.zzN(r8, r4)
            int[][] r4 = (int[][]) r4
            r11[r0] = r4
            r4 = r17[r0]
            java.lang.String r4 = r4.zzU()
            r5[r0] = r4
            r4 = r17[r0]
            int r4 = r4.zzb()
            r6[r0] = r4
            int r0 = r0 + 1
            r4 = 2
            goto Lac
        Ldd:
            r0 = 2
            r2 = r2[r0]
            com.google.android.gms.internal.ads.zzwy r10 = new com.google.android.gms.internal.ads.zzwy
            r3 = r3[r0]
            java.lang.Object[] r0 = com.google.android.gms.internal.ads.zzeu.zzN(r3, r2)
            com.google.android.gms.internal.ads.zzcd[] r0 = (com.google.android.gms.internal.ads.zzcd[]) r0
            r10.<init>(r0)
            com.google.android.gms.internal.ads.zzyn r0 = new com.google.android.gms.internal.ads.zzyn
            r4 = r0
            r8 = r13
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r4 = r16
            r5 = r0
            r6 = r11
            r7 = r13
            r8 = r19
            r9 = r20
            android.util.Pair r2 = r4.zzd(r5, r6, r7, r8, r9)
            java.lang.Object r3 = r2.second
            com.google.android.gms.internal.ads.zzyp[] r3 = (com.google.android.gms.internal.ads.zzyp[]) r3
            int r4 = r3.length
            java.util.List[] r4 = new java.util.List[r4]
            r5 = 0
        L10a:
            int r6 = r3.length
            if (r5 >= r6) goto L11f
            r6 = r3[r5]
            if (r6 == 0) goto L116
            com.google.android.gms.internal.ads.zzgax r6 = com.google.android.gms.internal.ads.zzgax.zzo(r6)
            goto L11a
        L116:
            com.google.android.gms.internal.ads.zzgax r6 = com.google.android.gms.internal.ads.zzgax.zzn()
        L11a:
            r4[r5] = r6
            int r5 = r5 + 1
            goto L10a
        L11f:
            com.google.android.gms.internal.ads.zzgau r3 = new com.google.android.gms.internal.ads.zzgau
            r3.<init>()
            r5 = 0
        L125:
            r6 = 2
            if (r5 >= r6) goto L191
            com.google.android.gms.internal.ads.zzwy r7 = r0.zzd(r5)
            r8 = r4[r5]
            r9 = 0
        L12f:
            int r10 = r7.zzb
            if (r9 >= r10) goto L18d
            com.google.android.gms.internal.ads.zzcd r10 = r7.zzb(r9)
            r11 = 0
            int r12 = r0.zza(r5, r9, r11)
            if (r12 == 0) goto L140
            r11 = 1
            goto L141
        L140:
            r11 = 0
        L141:
            int r12 = r10.zza
            int[] r13 = new int[r12]
            boolean[] r12 = new boolean[r12]
            r14 = 0
        L148:
            int r15 = r10.zza
            if (r14 >= r15) goto L180
            int r15 = r0.zzb(r5, r9, r14)
            r15 = r15 & 7
            r13[r14] = r15
            r15 = 0
        L155:
            int r1 = r8.size()
            if (r15 >= r1) goto L178
            java.lang.Object r1 = r8.get(r15)
            com.google.android.gms.internal.ads.zzyp r1 = (com.google.android.gms.internal.ads.zzyp) r1
            com.google.android.gms.internal.ads.zzcd r6 = r1.zze()
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L174
            int r1 = r1.zzb(r14)
            r6 = -1
            if (r1 == r6) goto L174
            r1 = 1
            goto L179
        L174:
            int r15 = r15 + 1
            r6 = 2
            goto L155
        L178:
            r1 = 0
        L179:
            r12[r14] = r1
            int r14 = r14 + 1
            r1 = 1
            r6 = 2
            goto L148
        L180:
            com.google.android.gms.internal.ads.zzcj r1 = new com.google.android.gms.internal.ads.zzcj
            r1.<init>(r10, r11, r13, r12)
            r3.zzf(r1)
            int r9 = r9 + 1
            r1 = 1
            r6 = 2
            goto L12f
        L18d:
            int r5 = r5 + 1
            r1 = 1
            goto L125
        L191:
            com.google.android.gms.internal.ads.zzwy r1 = r0.zze()
            r11 = 0
        L196:
            int r4 = r1.zzb
            if (r11 >= r4) goto L1b5
            com.google.android.gms.internal.ads.zzcd r4 = r1.zzb(r11)
            int r5 = r4.zza
            int[] r5 = new int[r5]
            r6 = 0
            java.util.Arrays.fill(r5, r6)
            int r7 = r4.zza
            boolean[] r7 = new boolean[r7]
            com.google.android.gms.internal.ads.zzcj r8 = new com.google.android.gms.internal.ads.zzcj
            r8.<init>(r4, r6, r5, r7)
            r3.zzf(r8)
            int r11 = r11 + 1
            goto L196
        L1b5:
            com.google.android.gms.internal.ads.zzck r1 = new com.google.android.gms.internal.ads.zzck
            com.google.android.gms.internal.ads.zzgax r3 = r3.zzi()
            r1.<init>(r3)
            com.google.android.gms.internal.ads.zzys r3 = new com.google.android.gms.internal.ads.zzys
            java.lang.Object r4 = r2.first
            com.google.android.gms.internal.ads.zzlv[] r4 = (com.google.android.gms.internal.ads.zzlv[]) r4
            java.lang.Object r2 = r2.second
            com.google.android.gms.internal.ads.zzyl[] r2 = (com.google.android.gms.internal.ads.zzyl[]) r2
            r3.<init>(r4, r2, r1, r0)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzp(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzyn r1 = (com.google.android.gms.internal.ads.zzyn) r1
            return
    }
}
