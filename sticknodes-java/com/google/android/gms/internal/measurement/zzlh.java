package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zzlh extends com.google.android.gms.internal.measurement.zzlk {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzlh(byte[] r4, int r5, int r6) {
            r3 = this;
            r5 = 0
            r3.<init>(r5)
            int r5 = r4.length
            int r0 = r5 - r6
            r0 = r0 | r6
            r1 = 0
            if (r0 < 0) goto L12
            r3.zzc = r4
            r3.zze = r1
            r3.zzd = r6
            return
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.util.Locale r0 = java.util.Locale.US
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r1] = r5
            r5 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r5] = r1
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r5] = r6
            java.lang.String r5 = "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"
            java.lang.String r5 = java.lang.String.format(r0, r5, r2)
            r4.<init>(r5)
            throw r4
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zza() {
            r2 = this;
            int r0 = r2.zzd
            int r1 = r2.zze
            int r0 = r0 - r1
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzb(byte r10) throws java.io.IOException {
            r9 = this;
            int r0 = r9.zze
            byte[] r1 = r9.zzc     // Catch: java.lang.IndexOutOfBoundsException -> Lf
            int r2 = r0 + 1
            r1[r0] = r10     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            r9.zze = r2
            return
        Lb:
            r10 = move-exception
            r7 = r10
            r0 = r2
            goto L11
        Lf:
            r10 = move-exception
            r7 = r10
        L11:
            int r10 = r9.zzd
            com.google.android.gms.internal.measurement.zzli r8 = new com.google.android.gms.internal.measurement.zzli
            long r2 = (long) r0
            long r4 = (long) r10
            r6 = 1
            r1 = r8
            r1.<init>(r2, r4, r6, r7)
            throw r8
    }

    public final void zzc(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            r9 = 0
            byte[] r0 = r7.zzc     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r1 = r7.zze     // Catch: java.lang.IndexOutOfBoundsException -> Le
            java.lang.System.arraycopy(r8, r9, r0, r1, r10)     // Catch: java.lang.IndexOutOfBoundsException -> Le
            int r8 = r7.zze
            int r8 = r8 + r10
            r7.zze = r8
            return
        Le:
            r8 = move-exception
            r6 = r8
            com.google.android.gms.internal.measurement.zzli r8 = new com.google.android.gms.internal.measurement.zzli
            int r9 = r7.zze
            int r0 = r7.zzd
            long r1 = (long) r9
            long r3 = (long) r0
            r0 = r8
            r5 = r10
            r0.<init>(r1, r3, r5, r6)
            throw r8
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzd(int r1, boolean r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzt(r1)
            r0.zzb(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zze(int r1, com.google.android.gms.internal.measurement.zzld r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zzt(r1)
            int r1 = r2.zzd()
            r0.zzt(r1)
            r2.zzg(r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzf(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 5
            r0.zzt(r1)
            r0.zzg(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzg(int r9) throws java.io.IOException {
            r8 = this;
            int r0 = r8.zze
            byte[] r1 = r8.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L21
            byte r2 = (byte) r9     // Catch: java.lang.IndexOutOfBoundsException -> L21
            r1[r0] = r2     // Catch: java.lang.IndexOutOfBoundsException -> L21
            int r2 = r0 + 1
            int r3 = r9 >> 8
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L21
            r1[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L21
            int r2 = r0 + 2
            int r3 = r9 >> 16
            byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L21
            r1[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L21
            int r2 = r0 + 3
            int r9 = r9 >> 24
            byte r9 = (byte) r9     // Catch: java.lang.IndexOutOfBoundsException -> L21
            r1[r2] = r9     // Catch: java.lang.IndexOutOfBoundsException -> L21
            int r0 = r0 + 4
            r8.zze = r0
            return
        L21:
            r9 = move-exception
            r7 = r9
            int r9 = r8.zzd
            long r2 = (long) r0
            com.google.android.gms.internal.measurement.zzli r0 = new com.google.android.gms.internal.measurement.zzli
            long r4 = (long) r9
            r6 = 4
            r1 = r0
            r1.<init>(r2, r4, r6, r7)
            throw r0
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzh(int r1, long r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 1
            r0.zzt(r1)
            r0.zzi(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzi(long r9) throws java.io.IOException {
            r8 = this;
            int r0 = r8.zze
            byte[] r1 = r8.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L51
            int r2 = (int) r9     // Catch: java.lang.IndexOutOfBoundsException -> L51
            byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> L51
            r1[r0] = r2     // Catch: java.lang.IndexOutOfBoundsException -> L51
            int r2 = r0 + 1
            r3 = 8
            long r4 = r9 >> r3
            int r5 = (int) r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            byte r4 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L51
            r1[r2] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            int r2 = r0 + 2
            r4 = 16
            long r4 = r9 >> r4
            int r5 = (int) r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            byte r4 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L51
            r1[r2] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            int r2 = r0 + 3
            r4 = 24
            long r4 = r9 >> r4
            int r5 = (int) r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            byte r4 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L51
            r1[r2] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            int r2 = r0 + 4
            r4 = 32
            long r4 = r9 >> r4
            int r5 = (int) r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            byte r4 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L51
            r1[r2] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            int r2 = r0 + 5
            r4 = 40
            long r4 = r9 >> r4
            int r5 = (int) r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            byte r4 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L51
            r1[r2] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            int r2 = r0 + 6
            r4 = 48
            long r4 = r9 >> r4
            int r5 = (int) r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            byte r4 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L51
            r1[r2] = r4     // Catch: java.lang.IndexOutOfBoundsException -> L51
            int r2 = r0 + 7
            r4 = 56
            long r9 = r9 >> r4
            int r10 = (int) r9     // Catch: java.lang.IndexOutOfBoundsException -> L51
            byte r9 = (byte) r10     // Catch: java.lang.IndexOutOfBoundsException -> L51
            r1[r2] = r9     // Catch: java.lang.IndexOutOfBoundsException -> L51
            int r0 = r0 + r3
            r8.zze = r0
            return
        L51:
            r9 = move-exception
            r7 = r9
            int r9 = r8.zzd
            long r2 = (long) r0
            com.google.android.gms.internal.measurement.zzli r10 = new com.google.android.gms.internal.measurement.zzli
            long r4 = (long) r9
            r6 = 8
            r1 = r10
            r1.<init>(r2, r4, r6, r7)
            throw r10
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzj(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzt(r1)
            r0.zzk(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzk(int r3) throws java.io.IOException {
            r2 = this;
            if (r3 < 0) goto L6
            r2.zzt(r3)
            return
        L6:
            long r0 = (long) r3
            r2.zzv(r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzl(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            r2 = 0
            r0.zzc(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    final void zzm(int r1, com.google.android.gms.internal.measurement.zznh r2, com.google.android.gms.internal.measurement.zzns r3) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zzt(r1)
            r1 = r2
            com.google.android.gms.internal.measurement.zzko r1 = (com.google.android.gms.internal.measurement.zzko) r1
            int r1 = r1.zzca(r3)
            r0.zzt(r1)
            com.google.android.gms.internal.measurement.zzll r1 = r0.zza
            r3.zzi(r2, r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzn(int r2, com.google.android.gms.internal.measurement.zznh r3) throws java.io.IOException {
            r1 = this;
            r0 = 11
            r1.zzt(r0)
            r0 = 2
            r1.zzs(r0, r2)
            r2 = 26
            r1.zzt(r2)
            int r2 = r3.zzcf()
            r1.zzt(r2)
            r3.zzcB(r1)
            r2 = 12
            r1.zzt(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzo(int r2, com.google.android.gms.internal.measurement.zzld r3) throws java.io.IOException {
            r1 = this;
            r0 = 11
            r1.zzt(r0)
            r0 = 2
            r1.zzs(r0, r2)
            r2 = 3
            r1.zze(r2, r3)
            r2 = 12
            r1.zzt(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzp(int r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | 2
            r0.zzt(r1)
            r0.zzq(r2)
            return
    }

    public final void zzq(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            int r0 = r5.zze
            int r1 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            int r1 = r1 * 3
            int r1 = com.google.android.gms.internal.measurement.zzlk.zzz(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            int r2 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzz(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            if (r2 != r1) goto L2e
            int r1 = r0 + r2
            r5.zze = r1     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            byte[] r3 = r5.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            int r4 = r5.zzd     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            int r4 = r4 - r1
            int r1 = com.google.android.gms.internal.measurement.zzoo.zzb(r6, r3, r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            r5.zze = r0     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            int r3 = r1 - r0
            int r3 = r3 - r2
            r5.zzt(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            r5.zze = r1     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            return
        L2e:
            int r1 = com.google.android.gms.internal.measurement.zzoo.zzc(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            r5.zzt(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            byte[] r1 = r5.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            int r2 = r5.zze     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            int r3 = r5.zzd     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            int r3 = r3 - r2
            int r1 = com.google.android.gms.internal.measurement.zzoo.zzb(r6, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            r5.zze = r1     // Catch: java.lang.IndexOutOfBoundsException -> L43 com.google.android.gms.internal.measurement.zzon -> L4a
            return
        L43:
            r6 = move-exception
            com.google.android.gms.internal.measurement.zzli r0 = new com.google.android.gms.internal.measurement.zzli
            r0.<init>(r6)
            throw r0
        L4a:
            r1 = move-exception
            r5.zze = r0
            r5.zzC(r6, r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzr(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r1 = r1 | r2
            r0.zzt(r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzs(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzt(r1)
            r0.zzt(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzt(int r10) throws java.io.IOException {
            r9 = this;
            int r0 = r9.zze
        L2:
            r1 = r10 & (-128(0xffffffffffffff80, float:NaN))
            if (r1 != 0) goto L10
            byte[] r1 = r9.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L21
            int r2 = r0 + 1
            byte r10 = (byte) r10
            r1[r0] = r10     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            r9.zze = r2
            return
        L10:
            byte[] r1 = r9.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L21
            int r2 = r0 + 1
            r3 = r10 | 128(0x80, float:1.794E-43)
            byte r3 = (byte) r3
            r1[r0] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L1d
            int r10 = r10 >>> 7
            r0 = r2
            goto L2
        L1d:
            r10 = move-exception
            r7 = r10
            r0 = r2
            goto L23
        L21:
            r10 = move-exception
            r7 = r10
        L23:
            int r10 = r9.zzd
            com.google.android.gms.internal.measurement.zzli r8 = new com.google.android.gms.internal.measurement.zzli
            long r2 = (long) r0
            long r4 = (long) r10
            r6 = 1
            r1 = r8
            r1.<init>(r2, r4, r6, r7)
            throw r8
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzu(int r1, long r2) throws java.io.IOException {
            r0 = this;
            int r1 = r1 << 3
            r0.zzt(r1)
            r0.zzv(r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzv(long r11) throws java.io.IOException {
            r10 = this;
            int r0 = r10.zze
            boolean r1 = com.google.android.gms.internal.measurement.zzlk.zzD()
            r2 = 7
            r3 = 0
            r5 = -128(0xffffffffffffff80, double:NaN)
            if (r1 == 0) goto L34
            int r1 = r10.zzd
            int r1 = r1 - r0
            r7 = 10
            if (r1 < r7) goto L34
        L14:
            long r7 = r11 & r5
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L25
            byte[] r1 = r10.zzc
            int r2 = r0 + 1
            long r3 = (long) r0
            int r12 = (int) r11
            byte r11 = (byte) r12
            com.google.android.gms.internal.measurement.zzol.zzn(r1, r3, r11)
            goto L42
        L25:
            byte[] r1 = r10.zzc
            int r7 = r0 + 1
            long r8 = (long) r0
            int r0 = (int) r11
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0
            com.google.android.gms.internal.measurement.zzol.zzn(r1, r8, r0)
            long r11 = r11 >>> r2
            r0 = r7
            goto L14
        L34:
            long r7 = r11 & r5
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L49
            byte[] r1 = r10.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L59
            int r2 = r0 + 1
            int r12 = (int) r11
            byte r11 = (byte) r12
            r1[r0] = r11     // Catch: java.lang.IndexOutOfBoundsException -> L45
        L42:
            r10.zze = r2
            return
        L45:
            r11 = move-exception
            r7 = r11
            r0 = r2
            goto L5b
        L49:
            byte[] r1 = r10.zzc     // Catch: java.lang.IndexOutOfBoundsException -> L59
            int r7 = r0 + 1
            int r8 = (int) r11
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r1[r0] = r8     // Catch: java.lang.IndexOutOfBoundsException -> L56
            long r11 = r11 >>> r2
            r0 = r7
            goto L34
        L56:
            r11 = move-exception
            r0 = r7
            goto L5a
        L59:
            r11 = move-exception
        L5a:
            r7 = r11
        L5b:
            int r11 = r10.zzd
            com.google.android.gms.internal.measurement.zzli r12 = new com.google.android.gms.internal.measurement.zzli
            long r2 = (long) r0
            long r4 = (long) r11
            r6 = 1
            r1 = r12
            r1.<init>(r2, r4, r6, r7)
            throw r12
    }
}
