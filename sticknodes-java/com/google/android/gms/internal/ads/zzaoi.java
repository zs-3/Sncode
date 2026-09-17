package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaoi implements com.google.android.gms.internal.ads.zzaoa {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaoj zza;
    private final com.google.android.gms.internal.ads.zzej zzb;
    private final android.util.SparseArray zzc;
    private final android.util.SparseIntArray zzd;
    private final int zze;

    public zzaoi(com.google.android.gms.internal.ads.zzaoj r3, int r4) {
            r2 = this;
            r2.zza = r3
            r2.<init>()
            com.google.android.gms.internal.ads.zzej r3 = new com.google.android.gms.internal.ads.zzej
            r0 = 5
            byte[] r1 = new byte[r0]
            r3.<init>(r1, r0)
            r2.zzb = r3
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.zzc = r3
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            r2.zzd = r3
            r2.zze = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zza(com.google.android.gms.internal.ads.zzek r30) {
            r29 = this;
            r0 = r29
            r1 = r30
            int r2 = r30.zzm()
            r3 = 2
            if (r2 == r3) goto Ld
            goto L266
        Ld:
            com.google.android.gms.internal.ads.zzaoj r2 = r0.zza
            java.util.List r2 = com.google.android.gms.internal.ads.zzaoj.zzm(r2)
            r4 = 0
            java.lang.Object r2 = r2.get(r4)
            com.google.android.gms.internal.ads.zzer r2 = (com.google.android.gms.internal.ads.zzer) r2
            int r5 = r30.zzm()
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L266
            r5 = 1
            r1.zzM(r5)
            int r6 = r30.zzq()
            r7 = 3
            r1.zzM(r7)
            com.google.android.gms.internal.ads.zzej r8 = r0.zzb
            r1.zzG(r8, r3)
            com.google.android.gms.internal.ads.zzej r8 = r0.zzb
            r8.zzn(r7)
            com.google.android.gms.internal.ads.zzaoj r8 = r0.zza
            com.google.android.gms.internal.ads.zzej r9 = r0.zzb
            r10 = 13
            int r9 = r9.zzd(r10)
            com.google.android.gms.internal.ads.zzaoj.zzn(r8, r9)
            com.google.android.gms.internal.ads.zzej r8 = r0.zzb
            r1.zzG(r8, r3)
            com.google.android.gms.internal.ads.zzej r3 = r0.zzb
            r8 = 4
            r3.zzn(r8)
            com.google.android.gms.internal.ads.zzej r3 = r0.zzb
            r9 = 12
            int r3 = r3.zzd(r9)
            r1.zzM(r3)
            android.util.SparseArray r3 = r0.zzc
            r3.clear()
            android.util.SparseIntArray r3 = r0.zzd
            r3.clear()
            int r3 = r30.zzb()
        L69:
            if (r3 <= 0) goto L1eb
            com.google.android.gms.internal.ads.zzej r11 = r0.zzb
            r12 = 5
            r1.zzG(r11, r12)
            com.google.android.gms.internal.ads.zzej r11 = r0.zzb
            r13 = 8
            int r13 = r11.zzd(r13)
            r11.zzn(r7)
            com.google.android.gms.internal.ads.zzej r11 = r0.zzb
            int r11 = r11.zzd(r10)
            com.google.android.gms.internal.ads.zzej r14 = r0.zzb
            r14.zzn(r8)
            com.google.android.gms.internal.ads.zzej r14 = r0.zzb
            int r14 = r14.zzd(r9)
            int r15 = r30.zzd()
            int r9 = r15 + r14
            r16 = -1
            r17 = 0
            r20 = r17
            r22 = r20
            r19 = -1
            r21 = 0
        L9f:
            int r10 = r30.zzd()
            if (r10 >= r9) goto L1a1
            int r10 = r30.zzm()
            int r17 = r30.zzm()
            int r18 = r30.zzd()
            int r5 = r18 + r17
            if (r5 <= r9) goto Lb7
            goto L1a1
        Lb7:
            r4 = 89
            r18 = 172(0xac, float:2.41E-43)
            r23 = 135(0x87, float:1.89E-43)
            r24 = 129(0x81, float:1.81E-43)
            if (r10 != r12) goto Lf5
            long r25 = r30.zzu()
            r27 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r4 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r4 != 0) goto Lcd
            goto Lf9
        Lcd:
            r27 = 1161904947(0x45414333, double:5.74057318E-315)
            int r4 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r4 != 0) goto Ld5
            goto L103
        Ld5:
            r27 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r4 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r4 != 0) goto Le2
        Ldc:
            r26 = r2
            r19 = 172(0xac, float:2.41E-43)
            goto L191
        Le2:
            r27 = 1212503619(0x48455643, double:5.990563836E-315)
            int r4 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r4 != 0) goto Lf1
            r4 = 36
            r26 = r2
            r19 = 36
            goto L191
        Lf1:
            r26 = r2
            goto L191
        Lf5:
            r12 = 106(0x6a, float:1.49E-43)
            if (r10 != r12) goto Lff
        Lf9:
            r26 = r2
            r19 = 129(0x81, float:1.81E-43)
            goto L191
        Lff:
            r12 = 122(0x7a, float:1.71E-43)
            if (r10 != r12) goto L109
        L103:
            r26 = r2
            r19 = 135(0x87, float:1.89E-43)
            goto L191
        L109:
            r12 = 127(0x7f, float:1.78E-43)
            if (r10 != r12) goto L12d
            int r4 = r30.zzm()
            r10 = 21
            if (r4 != r10) goto L116
            goto Ldc
        L116:
            r10 = 14
            if (r4 != r10) goto L122
            r4 = 136(0x88, float:1.9E-43)
            r26 = r2
            r19 = 136(0x88, float:1.9E-43)
            goto L191
        L122:
            r10 = 33
            if (r4 != r10) goto Lf1
            r4 = 139(0x8b, float:1.95E-43)
            r26 = r2
            r19 = 139(0x8b, float:1.95E-43)
            goto L191
        L12d:
            r12 = 123(0x7b, float:1.72E-43)
            if (r10 != r12) goto L138
            r4 = 138(0x8a, float:1.93E-43)
            r26 = r2
            r19 = 138(0x8a, float:1.93E-43)
            goto L191
        L138:
            r12 = 10
            if (r10 != r12) goto L14f
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r4 = r1.zzB(r7, r4)
            java.lang.String r4 = r4.trim()
            int r21 = r30.zzm()
            r26 = r2
            r20 = r4
            goto L191
        L14f:
            if (r10 != r4) goto L187
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L156:
            int r12 = r30.zzd()
            if (r12 >= r5) goto L180
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r12 = r1.zzB(r7, r12)
            java.lang.String r12 = r12.trim()
            int r4 = r30.zzm()
            byte[] r7 = new byte[r8]
            r26 = r2
            r2 = 0
            r1.zzH(r7, r2, r8)
            com.google.android.gms.internal.ads.zzaok r2 = new com.google.android.gms.internal.ads.zzaok
            r2.<init>(r12, r4, r7)
            r10.add(r2)
            r2 = r26
            r4 = 89
            r7 = 3
            goto L156
        L180:
            r26 = r2
            r22 = r10
            r19 = 89
            goto L191
        L187:
            r26 = r2
            r2 = 111(0x6f, float:1.56E-43)
            if (r10 != r2) goto L191
            r2 = 257(0x101, float:3.6E-43)
            r19 = 257(0x101, float:3.6E-43)
        L191:
            int r2 = r30.zzd()
            int r5 = r5 - r2
            r1.zzM(r5)
            r2 = r26
            r4 = 0
            r5 = 1
            r7 = 3
            r12 = 5
            goto L9f
        L1a1:
            r26 = r2
            r1.zzL(r9)
            com.google.android.gms.internal.ads.zzaol r2 = new com.google.android.gms.internal.ads.zzaol
            byte[] r4 = r30.zzN()
            byte[] r23 = java.util.Arrays.copyOfRange(r4, r15, r9)
            r18 = r2
            r18.<init>(r19, r20, r21, r22, r23)
            r4 = 6
            if (r13 == r4) goto L1bb
            r4 = 5
            if (r13 != r4) goto L1bd
        L1bb:
            int r13 = r2.zza
        L1bd:
            int r14 = r14 + 5
            int r3 = r3 - r14
            com.google.android.gms.internal.ads.zzaoj r4 = r0.zza
            android.util.SparseBooleanArray r4 = com.google.android.gms.internal.ads.zzaoj.zzh(r4)
            boolean r4 = r4.get(r11)
            if (r4 != 0) goto L1e0
            com.google.android.gms.internal.ads.zzaoj r4 = r0.zza
            com.google.android.gms.internal.ads.zzaom r4 = com.google.android.gms.internal.ads.zzaoj.zzl(r4)
            com.google.android.gms.internal.ads.zzaoo r2 = r4.zzb(r13, r2)
            android.util.SparseIntArray r4 = r0.zzd
            r4.put(r11, r11)
            android.util.SparseArray r4 = r0.zzc
            r4.put(r11, r2)
        L1e0:
            r2 = r26
            r4 = 0
            r5 = 1
            r7 = 3
            r9 = 12
            r10 = 13
            goto L69
        L1eb:
            r26 = r2
            android.util.SparseIntArray r1 = r0.zzd
            int r1 = r1.size()
            r2 = 0
        L1f4:
            if (r2 >= r1) goto L240
            android.util.SparseIntArray r3 = r0.zzd
            com.google.android.gms.internal.ads.zzaoj r4 = r0.zza
            int r5 = r3.keyAt(r2)
            int r3 = r3.valueAt(r2)
            android.util.SparseBooleanArray r4 = com.google.android.gms.internal.ads.zzaoj.zzh(r4)
            r7 = 1
            r4.put(r5, r7)
            com.google.android.gms.internal.ads.zzaoj r4 = r0.zza
            android.util.SparseBooleanArray r4 = com.google.android.gms.internal.ads.zzaoj.zzj(r4)
            r4.put(r3, r7)
            android.util.SparseArray r4 = r0.zzc
            java.lang.Object r4 = r4.valueAt(r2)
            com.google.android.gms.internal.ads.zzaoo r4 = (com.google.android.gms.internal.ads.zzaoo) r4
            if (r4 == 0) goto L239
            com.google.android.gms.internal.ads.zzaoj r7 = r0.zza
            com.google.android.gms.internal.ads.zzade r7 = com.google.android.gms.internal.ads.zzaoj.zzk(r7)
            com.google.android.gms.internal.ads.zzaon r8 = new com.google.android.gms.internal.ads.zzaon
            r9 = 8192(0x2000, float:1.14794E-41)
            r8.<init>(r6, r5, r9)
            r5 = r26
            r4.zzb(r5, r7, r8)
            com.google.android.gms.internal.ads.zzaoj r7 = r0.zza
            android.util.SparseArray r7 = com.google.android.gms.internal.ads.zzaoj.zzg(r7)
            r7.put(r3, r4)
            goto L23b
        L239:
            r5 = r26
        L23b:
            int r2 = r2 + 1
            r26 = r5
            goto L1f4
        L240:
            com.google.android.gms.internal.ads.zzaoj r1 = r0.zza
            int r2 = r0.zze
            android.util.SparseArray r1 = com.google.android.gms.internal.ads.zzaoj.zzg(r1)
            r1.remove(r2)
            com.google.android.gms.internal.ads.zzaoj r1 = r0.zza
            r2 = 0
            com.google.android.gms.internal.ads.zzaoj.zzo(r1, r2)
            com.google.android.gms.internal.ads.zzaoj r1 = r0.zza
            int r2 = com.google.android.gms.internal.ads.zzaoj.zza(r1)
            if (r2 != 0) goto L266
            com.google.android.gms.internal.ads.zzade r1 = com.google.android.gms.internal.ads.zzaoj.zzk(r1)
            r1.zzD()
            com.google.android.gms.internal.ads.zzaoj r1 = r0.zza
            r2 = 1
            com.google.android.gms.internal.ads.zzaoj.zzp(r1, r2)
        L266:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zzb(com.google.android.gms.internal.ads.zzer r1, com.google.android.gms.internal.ads.zzade r2, com.google.android.gms.internal.ads.zzaon r3) {
            r0 = this;
            return
    }
}
