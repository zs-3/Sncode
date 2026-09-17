package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgco extends com.google.android.gms.internal.ads.zzgba {
    static final com.google.android.gms.internal.ads.zzgba zza = null;
    final transient java.lang.Object[] zzb;
    private final transient java.lang.Object zzc;
    private final transient int zzd;

    static {
            com.google.android.gms.internal.ads.zzgco r0 = new com.google.android.gms.internal.ads.zzgco
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r0.<init>(r3, r2, r1)
            com.google.android.gms.internal.ads.zzgco.zza = r0
            return
    }

    private zzgco(java.lang.Object r1, java.lang.Object[] r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzb = r2
            r0.zzd = r3
            return
    }

    static com.google.android.gms.internal.ads.zzgco zzj(int r16, java.lang.Object[] r17, com.google.android.gms.internal.ads.zzgaz r18) {
            r0 = r16
            r1 = r17
            r2 = r18
            if (r0 != 0) goto Ld
            com.google.android.gms.internal.ads.zzgba r0 = com.google.android.gms.internal.ads.zzgco.zza
            com.google.android.gms.internal.ads.zzgco r0 = (com.google.android.gms.internal.ads.zzgco) r0
            return r0
        Ld:
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L25
            r0 = r1[r4]
            java.util.Objects.requireNonNull(r0)
            r2 = r1[r5]
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzfzu.zzb(r0, r2)
            com.google.android.gms.internal.ads.zzgco r0 = new com.google.android.gms.internal.ads.zzgco
            r0.<init>(r3, r1, r5)
            return r0
        L25:
            int r6 = r1.length
            int r6 = r6 >> r5
            java.lang.String r7 = "index"
            com.google.android.gms.internal.ads.zzfxz.zzb(r0, r6, r7)
            int r6 = com.google.android.gms.internal.ads.zzgbc.zzh(r16)
            if (r0 != r5) goto L44
            r0 = r1[r4]
            java.util.Objects.requireNonNull(r0)
            r6 = r1[r5]
            java.util.Objects.requireNonNull(r6)
            com.google.android.gms.internal.ads.zzfzu.zzb(r0, r6)
            r0 = 1
        L40:
            r5 = 2
            r7 = 1
            goto L190
        L44:
            int r8 = r6 + (-1)
            r9 = 128(0x80, float:1.794E-43)
            r10 = 3
            r11 = -1
            if (r6 > r9) goto Lb8
            byte[] r6 = new byte[r6]
            java.util.Arrays.fill(r6, r11)
            r9 = 0
            r11 = 0
        L53:
            if (r9 >= r0) goto La4
            int r12 = r11 + r11
            int r13 = r9 + r9
            r14 = r1[r13]
            java.util.Objects.requireNonNull(r14)
            r13 = r13 ^ r5
            r13 = r1[r13]
            java.util.Objects.requireNonNull(r13)
            com.google.android.gms.internal.ads.zzfzu.zzb(r14, r13)
            int r15 = r14.hashCode()
            int r15 = com.google.android.gms.internal.ads.zzgap.zza(r15)
        L6f:
            r15 = r15 & r8
            r7 = r6[r15]
            r5 = 255(0xff, float:3.57E-43)
            r7 = r7 & r5
            if (r7 != r5) goto L85
            byte r5 = (byte) r12
            r6[r15] = r5
            if (r11 >= r9) goto L82
            r1[r12] = r14
            r5 = r12 ^ 1
            r1[r5] = r13
        L82:
            int r11 = r11 + 1
            goto L9c
        L85:
            r5 = r1[r7]
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto La0
            r3 = r7 ^ 1
            com.google.android.gms.internal.ads.zzgay r5 = new com.google.android.gms.internal.ads.zzgay
            r7 = r1[r3]
            java.util.Objects.requireNonNull(r7)
            r5.<init>(r14, r13, r7)
            r1[r3] = r13
            r3 = r5
        L9c:
            int r9 = r9 + 1
            r5 = 1
            goto L53
        La0:
            int r15 = r15 + 1
            r5 = 1
            goto L6f
        La4:
            if (r11 != r0) goto La8
            r3 = r6
            goto L40
        La8:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r4] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r7 = 1
            r5[r7] = r6
            r6 = 2
            r5[r6] = r3
        Lb6:
            r3 = r5
            goto L40
        Lb8:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r6 > r5) goto L127
            short[] r5 = new short[r6]
            java.util.Arrays.fill(r5, r11)
            r6 = 0
            r7 = 0
        Lc4:
            if (r6 >= r0) goto L115
            int r9 = r7 + r7
            int r11 = r6 + r6
            r12 = r1[r11]
            java.util.Objects.requireNonNull(r12)
            r13 = 1
            r11 = r11 ^ r13
            r11 = r1[r11]
            java.util.Objects.requireNonNull(r11)
            com.google.android.gms.internal.ads.zzfzu.zzb(r12, r11)
            int r13 = r12.hashCode()
            int r13 = com.google.android.gms.internal.ads.zzgap.zza(r13)
        Le1:
            r13 = r13 & r8
            short r14 = r5[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto Lf8
            short r14 = (short) r9
            r5[r13] = r14
            if (r7 >= r6) goto Lf5
            r1[r9] = r12
            r9 = r9 ^ 1
            r1[r9] = r11
        Lf5:
            int r7 = r7 + 1
            goto L10f
        Lf8:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L112
            r3 = r14 ^ 1
            com.google.android.gms.internal.ads.zzgay r9 = new com.google.android.gms.internal.ads.zzgay
            r13 = r1[r3]
            java.util.Objects.requireNonNull(r13)
            r9.<init>(r12, r11, r13)
            r1[r3] = r11
            r3 = r9
        L10f:
            int r6 = r6 + 1
            goto Lc4
        L112:
            int r13 = r13 + 1
            goto Le1
        L115:
            if (r7 != r0) goto L118
            goto L17f
        L118:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r7 = 1
            r6[r7] = r5
            r5 = 2
            r6[r5] = r3
            goto L18f
        L127:
            r7 = 1
            int[] r5 = new int[r6]
            java.util.Arrays.fill(r5, r11)
            r6 = 0
            r9 = 0
        L12f:
            if (r6 >= r0) goto L17d
            int r12 = r9 + r9
            int r13 = r6 + r6
            r14 = r1[r13]
            java.util.Objects.requireNonNull(r14)
            r13 = r13 ^ r7
            r7 = r1[r13]
            java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.ads.zzfzu.zzb(r14, r7)
            int r13 = r14.hashCode()
            int r13 = com.google.android.gms.internal.ads.zzgap.zza(r13)
        L14b:
            r13 = r13 & r8
            r15 = r5[r13]
            if (r15 != r11) goto L15d
            r5[r13] = r12
            if (r9 >= r6) goto L15a
            r1[r12] = r14
            r12 = r12 ^ 1
            r1[r12] = r7
        L15a:
            int r9 = r9 + 1
            goto L174
        L15d:
            r11 = r1[r15]
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L179
            r3 = r15 ^ 1
            com.google.android.gms.internal.ads.zzgay r11 = new com.google.android.gms.internal.ads.zzgay
            r12 = r1[r3]
            java.util.Objects.requireNonNull(r12)
            r11.<init>(r14, r7, r12)
            r1[r3] = r7
            r3 = r11
        L174:
            int r6 = r6 + 1
            r7 = 1
            r11 = -1
            goto L12f
        L179:
            int r13 = r13 + 1
            r11 = -1
            goto L14b
        L17d:
            if (r9 != r0) goto L181
        L17f:
            goto Lb6
        L181:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r7 = 1
            r6[r7] = r5
            r5 = 2
            r6[r5] = r3
        L18f:
            r3 = r6
        L190:
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L1b7
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r5]
            com.google.android.gms.internal.ads.zzgay r0 = (com.google.android.gms.internal.ads.zzgay) r0
            if (r2 == 0) goto L1b2
            r2.zzc = r0
            r0 = r3[r4]
            r2 = r3[r7]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r2 + r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r3 = r0
            r0 = r2
            goto L1b7
        L1b2:
            java.lang.IllegalArgumentException r0 = r0.zza()
            throw r0
        L1b7:
            com.google.android.gms.internal.ads.zzgco r2 = new com.google.android.gms.internal.ads.zzgco
            r2.<init>(r3, r1, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgba, java.util.Map
    public final java.lang.Object get(java.lang.Object r10) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzgap.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzgap.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.ads.zzgap.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
    }

    @Override // java.util.Map
    public final int size() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    final com.google.android.gms.internal.ads.zzgas zza() {
            r4 = this;
            int r0 = r4.zzd
            com.google.android.gms.internal.ads.zzgcn r1 = new com.google.android.gms.internal.ads.zzgcn
            java.lang.Object[] r2 = r4.zzb
            r3 = 1
            r1.<init>(r2, r3, r0)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    final com.google.android.gms.internal.ads.zzgbc zzf() {
            r4 = this;
            int r0 = r4.zzd
            java.lang.Object[] r1 = r4.zzb
            com.google.android.gms.internal.ads.zzgcl r2 = new com.google.android.gms.internal.ads.zzgcl
            r3 = 0
            r2.<init>(r4, r1, r3, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    final com.google.android.gms.internal.ads.zzgbc zzg() {
            r4 = this;
            int r0 = r4.zzd
            com.google.android.gms.internal.ads.zzgcn r1 = new com.google.android.gms.internal.ads.zzgcn
            java.lang.Object[] r2 = r4.zzb
            r3 = 0
            r1.<init>(r2, r3, r0)
            com.google.android.gms.internal.ads.zzgcm r0 = new com.google.android.gms.internal.ads.zzgcm
            r0.<init>(r4, r1)
            return r0
    }
}
