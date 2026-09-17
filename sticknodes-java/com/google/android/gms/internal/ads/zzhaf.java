package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhaf extends com.google.android.gms.internal.ads.zzhaj {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzhaf(byte[] r3, int r4, int r5) {
            r2 = this;
            r4 = 0
            r2.<init>(r4)
            int r4 = r3.length
            int r0 = r4 - r5
            r0 = r0 | r5
            r1 = 0
            if (r0 < 0) goto L12
            r2.zza = r3
            r2.zzc = r1
            r2.zzb = r5
            return
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r1] = r4
            r4 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            java.lang.String r4 = "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            r3.<init>(r4)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzK() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzL(byte r5) throws java.io.IOException {
            r4 = this;
            byte[] r0 = r4.zza     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r1 = r4.zzc     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r4.zzc = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            return
        Lb:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzhag r0 = new com.google.android.gms.internal.ads.zzhag
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zzc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            int r2 = r4.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r5)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzM(int r1, boolean r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzu(r1)
            r0.zzL(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzN(int r1, com.google.android.gms.internal.ads.zzgzs r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zzu(r1)
            int r1 = r2.zzd()
            r0.zzu(r1)
            r2.zzo(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj, com.google.android.gms.internal.ads.zzgzj
    public final void zza(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            r0.zze(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final int zzb() {
            r2 = this;
            int r0 = r2.zzb
            int r1 = r2.zzc
            int r0 = r0 - r1
            return r0
    }

    public final void zze(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.zza     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            int r1 = r3.zzc     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            int r4 = r3.zzc     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            int r4 = r4 + r6
            r3.zzc = r4     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            return
        Ld:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzhag r5 = new com.google.android.gms.internal.ads.zzhag
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            int r2 = r3.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 1
            int r2 = r3.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0[r1] = r6
            java.lang.String r6 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r6 = java.lang.String.format(r6, r0)
            r5.<init>(r6, r4)
            throw r5
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzh(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 5
            r0.zzu(r1)
            r0.zzi(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzi(int r5) throws java.io.IOException {
            r4 = this;
            byte[] r0 = r4.zza     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r4.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 1
            r4.zzc = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r3 = r5 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r2 + 1
            r4.zzc = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r3 = r5 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r2 = r1 + 1
            r4.zzc = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r3 = r5 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r1 = r2 + 1
            r4.zzc = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            int r5 = r5 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L2f
            return
        L2f:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzhag r0 = new com.google.android.gms.internal.ads.zzhag
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zzc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            int r2 = r4.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r5)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzj(int r1, long r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 1
            r0.zzu(r1)
            r0.zzk(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzk(long r6) throws java.io.IOException {
            r5 = this;
            byte[] r0 = r5.zza     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r5.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.zzc = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r3 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.zzc = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 8
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.zzc = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 16
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.zzc = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 24
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.zzc = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 32
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.zzc = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 40
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r2 = r1 + 1
            r5.zzc = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = 48
            long r3 = r6 >> r3
            int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r3 = r4 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
            int r1 = r2 + 1
            r5.zzc = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r1 = 56
            long r6 = r6 >> r1
            int r7 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r6 = r7 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            r0[r2] = r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
            return
        L70:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzhag r7 = new com.google.android.gms.internal.ads.zzhag
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            int r2 = r5.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            int r1 = r5.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>(r0, r6)
            throw r7
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzl(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzu(r1)
            r0.zzm(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzm(int r3) throws java.io.IOException {
            r2 = this;
            if (r3 < 0) goto L6
            r2.zzu(r3)
            return
        L6:
            long r0 = (long) r3
            r2.zzw(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    final void zzn(int r1, com.google.android.gms.internal.ads.zzhcp r2, com.google.android.gms.internal.ads.zzhdk r3) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zzu(r1)
            r1 = r2
            com.google.android.gms.internal.ads.zzgzb r1 = (com.google.android.gms.internal.ads.zzgzb) r1
            int r1 = r1.zzaM(r3)
            r0.zzu(r1)
            com.google.android.gms.internal.ads.zzhak r1 = r0.zze
            r3.zzj(r2, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzo(int r2, com.google.android.gms.internal.ads.zzhcp r3) throws java.io.IOException {
            r1 = this;
            r0 = 11
            r1.zzu(r0)
            r0 = 2
            r1.zzt(r0, r2)
            r2 = 26
            r1.zzu(r2)
            int r2 = r3.zzaY()
            r1.zzu(r2)
            r3.zzda(r1)
            r2 = 12
            r1.zzu(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzp(int r2, com.google.android.gms.internal.ads.zzgzs r3) throws java.io.IOException {
            r1 = this;
            r0 = 11
            r1.zzu(r0)
            r0 = 2
            r1.zzt(r0, r2)
            r2 = 3
            r1.zzN(r2, r3)
            r2 = 12
            r1.zzu(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzq(int r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zzu(r1)
            r0.zzr(r2)
            return
    }

    public final void zzr(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            int r0 = r5.zzc
            int r1 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            int r1 = r1 * 3
            int r1 = com.google.android.gms.internal.ads.zzhaj.zzD(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            int r2 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            int r2 = com.google.android.gms.internal.ads.zzhaj.zzD(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            if (r2 != r1) goto L2e
            int r1 = r0 + r2
            r5.zzc = r1     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            byte[] r3 = r5.zza     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            int r4 = r5.zzb     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            int r4 = r4 - r1
            int r1 = com.google.android.gms.internal.ads.zzhek.zzd(r6, r3, r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            r5.zzc = r0     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            int r3 = r1 - r0
            int r3 = r3 - r2
            r5.zzu(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            r5.zzc = r1     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            return
        L2e:
            int r1 = com.google.android.gms.internal.ads.zzhek.zze(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            r5.zzu(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            byte[] r1 = r5.zza     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            int r2 = r5.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            int r3 = r5.zzb     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            int r3 = r3 - r2
            int r1 = com.google.android.gms.internal.ads.zzhek.zzd(r6, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            r5.zzc = r1     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.ads.zzhej -> L4a
            return
        L43:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzhag r0 = new com.google.android.gms.internal.ads.zzhag
            r0.<init>(r6)
            throw r0
        L4a:
            r1 = move-exception
            r5.zzc = r0
            r5.zzG(r6, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzs(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | r2
            r0.zzu(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzt(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzu(r1)
            r0.zzu(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzu(int r5) throws java.io.IOException {
            r4 = this;
        L0:
            r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L10
            byte[] r0 = r4.zza     // Catch: java.lang.IndexOutOfBoundsException -> L22
            int r1 = r4.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L22
            int r2 = r1 + 1
            r4.zzc = r2     // Catch: java.lang.IndexOutOfBoundsException -> L22
            byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L22
            r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L22
            return
        L10:
            byte[] r0 = r4.zza     // Catch: java.lang.IndexOutOfBoundsException -> L22
            int r1 = r4.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L22
            int r2 = r1 + 1
            r4.zzc = r2     // Catch: java.lang.IndexOutOfBoundsException -> L22
            r2 = r5 | 128(0x80, float:1.794E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> L22
            r0[r1] = r2     // Catch: java.lang.IndexOutOfBoundsException -> L22
            int r5 = r5 >>> 7
            goto L0
        L22:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzhag r0 = new com.google.android.gms.internal.ads.zzhag
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zzc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            int r2 = r4.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r5)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzv(int r1, long r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzu(r1)
            r0.zzw(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzw(long r10) throws java.io.IOException {
            r9 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzhaj.zzH()
            r1 = 7
            r2 = 0
            r4 = -128(0xffffffffffffff80, double:NaN)
            if (r0 == 0) goto L3c
            int r0 = r9.zzb
            int r6 = r9.zzc
            int r0 = r0 - r6
            r6 = 10
            if (r0 < r6) goto L3c
        L14:
            long r6 = r10 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            int r6 = (int) r10
            if (r0 != 0) goto L29
            byte[] r10 = r9.zza
            int r11 = r9.zzc
            int r0 = r11 + 1
            r9.zzc = r0
            long r0 = (long) r11
            byte r11 = (byte) r6
            com.google.android.gms.internal.ads.zzhef.zzq(r10, r0, r11)
            return
        L29:
            byte[] r0 = r9.zza
            int r7 = r9.zzc
            int r8 = r7 + 1
            r9.zzc = r8
            long r7 = (long) r7
            r6 = r6 | 128(0x80, float:1.794E-43)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            com.google.android.gms.internal.ads.zzhef.zzq(r0, r7, r6)
            long r10 = r10 >>> r1
            goto L14
        L3c:
            long r6 = r10 & r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L4f
            byte[] r0 = r9.zza     // Catch: java.lang.IndexOutOfBoundsException -> L61
            int r1 = r9.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L61
            int r2 = r1 + 1
            r9.zzc = r2     // Catch: java.lang.IndexOutOfBoundsException -> L61
            int r11 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
            byte r10 = (byte) r11     // Catch: java.lang.IndexOutOfBoundsException -> L61
            r0[r1] = r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
            return
        L4f:
            byte[] r0 = r9.zza     // Catch: java.lang.IndexOutOfBoundsException -> L61
            int r6 = r9.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L61
            int r7 = r6 + 1
            r9.zzc = r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
            int r7 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
            r7 = r7 | 128(0x80, float:1.794E-43)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
            r0[r6] = r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
            long r10 = r10 >>> r1
            goto L3c
        L61:
            r10 = move-exception
            com.google.android.gms.internal.ads.zzhag r11 = new com.google.android.gms.internal.ads.zzhag
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            int r2 = r9.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            int r1 = r9.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r11.<init>(r0, r10)
            throw r11
    }
}
