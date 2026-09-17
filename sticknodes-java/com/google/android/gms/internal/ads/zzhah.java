package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhah extends com.google.android.gms.internal.ads.zzhae {
    private final java.io.OutputStream zzg;

    zzhah(java.io.OutputStream r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            java.lang.String r2 = "out"
            java.util.Objects.requireNonNull(r1, r2)
            r0.zzg = r1
            return
    }

    private final void zzI() throws java.io.IOException {
            r4 = this;
            int r0 = r4.zzc
            java.io.OutputStream r1 = r4.zzg
            byte[] r2 = r4.zza
            r3 = 0
            r1.write(r2, r3, r0)
            r4.zzc = r3
            return
    }

    private final void zzJ(int r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzb
            int r1 = r2.zzc
            int r0 = r0 - r1
            if (r0 >= r3) goto La
            r2.zzI()
        La:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzK() throws java.io.IOException {
            r1 = this;
            int r0 = r1.zzc
            if (r0 <= 0) goto L7
            r1.zzI()
        L7:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzL(byte r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.zzc
            int r1 = r2.zzb
            if (r0 != r1) goto L9
            r2.zzI()
        L9:
            r2.zzc(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzM(int r2, boolean r3) throws java.io.IOException {
            r1 = this;
            r0 = 11
            r1.zzJ(r0)
            int r2 = r2 << 3
            r1.zzf(r2)
            r1.zzc(r3)
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
            r0.zzr(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzh(int r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 14
            r1.zzJ(r0)
            int r2 = r2 << 3
            r2 = r2 | 5
            r1.zzf(r2)
            r1.zzd(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzi(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 4
            r1.zzJ(r0)
            r1.zzd(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzj(int r2, long r3) throws java.io.IOException {
            r1 = this;
            r0 = 18
            r1.zzJ(r0)
            int r2 = r2 << 3
            r2 = r2 | 1
            r1.zzf(r2)
            r1.zze(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzk(long r2) throws java.io.IOException {
            r1 = this;
            r0 = 8
            r1.zzJ(r0)
            r1.zze(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzl(int r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 20
            r1.zzJ(r0)
            int r2 = r2 << 3
            r1.zzf(r2)
            if (r3 < 0) goto L10
            r1.zzf(r3)
            return
        L10:
            long r2 = (long) r3
            r1.zzg(r2)
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
            r0.zzx(r2)
            return
    }

    public final void zzr(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            int r0 = r3.zzb
            int r1 = r3.zzc
            int r0 = r0 - r1
            if (r0 < r6) goto L17
            byte[] r0 = r3.zza
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            int r4 = r3.zzc
            int r4 = r4 + r6
            r3.zzc = r4
            int r4 = r3.zzd
            int r4 = r4 + r6
            r3.zzd = r4
            return
        L17:
            byte[] r2 = r3.zza
            java.lang.System.arraycopy(r4, r5, r2, r1, r0)
            int r5 = r5 + r0
            int r1 = r3.zzb
            r3.zzc = r1
            int r1 = r3.zzd
            int r1 = r1 + r0
            r3.zzd = r1
            r3.zzI()
            int r1 = r3.zzb
            int r6 = r6 - r0
            if (r6 > r1) goto L37
            byte[] r0 = r3.zza
            r1 = 0
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            r3.zzc = r6
            goto L3c
        L37:
            java.io.OutputStream r0 = r3.zzg
            r0.write(r4, r5, r6)
        L3c:
            int r4 = r3.zzd
            int r4 = r4 + r6
            r3.zzd = r4
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
    public final void zzt(int r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 20
            r1.zzJ(r0)
            int r2 = r2 << 3
            r1.zzf(r2)
            r1.zzf(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzu(int r2) throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.zzJ(r0)
            r1.zzf(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzv(int r2, long r3) throws java.io.IOException {
            r1 = this;
            r0 = 20
            r1.zzJ(r0)
            int r2 = r2 << 3
            r1.zzf(r2)
            r1.zzg(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final void zzw(long r2) throws java.io.IOException {
            r1 = this;
            r0 = 10
            r1.zzJ(r0)
            r1.zzg(r2)
            return
    }

    public final void zzx(java.lang.String r6) throws java.io.IOException {
            r5 = this;
            int r0 = r6.length()     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            int r0 = r0 * 3
            int r1 = com.google.android.gms.internal.ads.zzhaj.zzD(r0)     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            int r2 = r1 + r0
            int r3 = r5.zzb     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            if (r2 <= r3) goto L1e
            byte[] r1 = new byte[r0]     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            r2 = 0
            int r0 = com.google.android.gms.internal.ads.zzhek.zzd(r6, r1, r2, r0)     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            r5.zzu(r0)     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            r5.zzr(r1, r2, r0)     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            return
        L1e:
            int r0 = r5.zzc     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            int r3 = r3 - r0
            if (r2 <= r3) goto L26
            r5.zzI()     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
        L26:
            int r0 = r6.length()     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzD(r0)     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            int r2 = r5.zzc     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            if (r0 != r1) goto L4a
            int r1 = r2 + r0
            r5.zzc = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            byte[] r3 = r5.zza     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            int r4 = r5.zzb     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            int r4 = r4 - r1
            int r1 = com.google.android.gms.internal.ads.zzhek.zzd(r6, r3, r1, r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            r5.zzc = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            int r3 = r1 - r2
            int r3 = r3 - r0
            r5.zzf(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            r5.zzc = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            goto L5b
        L4a:
            int r3 = com.google.android.gms.internal.ads.zzhek.zze(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            r5.zzf(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            byte[] r0 = r5.zza     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            int r1 = r5.zzc     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            int r0 = com.google.android.gms.internal.ads.zzhek.zzd(r6, r0, r1, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            r5.zzc = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
        L5b:
            int r0 = r5.zzd     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            int r0 = r0 + r3
            r5.zzd = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 com.google.android.gms.internal.ads.zzhej -> L68
            return
        L61:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzhag r1 = new com.google.android.gms.internal.ads.zzhag     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            r1.<init>(r0)     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            throw r1     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
        L68:
            r0 = move-exception
            int r1 = r5.zzd     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            int r3 = r5.zzc     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            int r3 = r3 - r2
            int r1 = r1 - r3
            r5.zzd = r1     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            r5.zzc = r2     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
            throw r0     // Catch: com.google.android.gms.internal.ads.zzhej -> L74
        L74:
            r0 = move-exception
            r5.zzG(r6, r0)
            return
    }
}
