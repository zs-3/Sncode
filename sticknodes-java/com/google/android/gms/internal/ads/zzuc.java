package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzuc implements com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzuv {
    public final com.google.android.gms.internal.ads.zzuw zza;
    long zzb;
    private com.google.android.gms.internal.ads.zzuv zzc;
    private com.google.android.gms.internal.ads.zzub[] zzd;
    private long zze;

    public zzuc(com.google.android.gms.internal.ads.zzuw r1, boolean r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r1 = 0
            com.google.android.gms.internal.ads.zzub[] r1 = new com.google.android.gms.internal.ads.zzub[r1]
            r0.zzd = r1
            r1 = 0
            r0.zze = r1
            r0.zzb = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zza(long r12, com.google.android.gms.internal.ads.zzlw r14) {
            r11 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 == 0) goto L41
            long r2 = r14.zzc
            long r2 = java.lang.Math.min(r2, r12)
            long r2 = java.lang.Math.max(r0, r2)
            long r4 = r14.zzd
            long r6 = r11.zzb
            r8 = -9223372036854775808
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L20
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L21
        L20:
            long r6 = r6 - r12
        L21:
            long r4 = java.lang.Math.min(r4, r6)
            long r0 = java.lang.Math.max(r0, r4)
            long r4 = r14.zzc
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L35
            long r4 = r14.zzd
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L3a
        L35:
            com.google.android.gms.internal.ads.zzlw r14 = new com.google.android.gms.internal.ads.zzlw
            r14.<init>(r2, r0)
        L3a:
            com.google.android.gms.internal.ads.zzuw r0 = r11.zza
            long r12 = r0.zza(r12, r14)
            return r12
        L41:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzb() {
            r7 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r7.zza
            long r0 = r0.zzb()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            long r4 = r7.zzb
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L17
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzc() {
            r7 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r7.zza
            long r0 = r0.zzc()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            long r4 = r7.zzb
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L17
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzd() {
            r9 = this;
            boolean r0 = r9.zzq()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L19
            long r3 = r9.zze
            r9.zze = r1
            long r5 = r9.zzd()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L18
            return r5
        L18:
            return r3
        L19:
            com.google.android.gms.internal.ads.zzuw r0 = r9.zza
            long r3 = r0.zzd()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
            return r1
        L24:
            r0 = 0
            r2 = 0
            r5 = 1
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 < 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            long r0 = r9.zzb
            r6 = -9223372036854775808
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L3e
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 > 0) goto L3f
        L3e:
            r2 = 1
        L3f:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zze(long r8) {
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zze = r0
            com.google.android.gms.internal.ads.zzub[] r0 = r7.zzd
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.zzc()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.zzuw r0 = r7.zza
            long r0 = r0.zze(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L35
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L36
            long r8 = r7.zzb
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L36
        L35:
            r2 = 1
        L36:
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzwo
    public final /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzwp r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzuw r1 = (com.google.android.gms.internal.ads.zzuw) r1
            com.google.android.gms.internal.ads.zzuv r1 = r0.zzc
            java.util.Objects.requireNonNull(r1)
            r1.zzf(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzg(com.google.android.gms.internal.ads.zzyl[] r15, boolean[] r16, com.google.android.gms.internal.ads.zzwn[] r17, boolean[] r18, long r19) {
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.zzub[] r3 = new com.google.android.gms.internal.ads.zzub[r2]
            r0.zzd = r3
            com.google.android.gms.internal.ads.zzwn[] r2 = new com.google.android.gms.internal.ads.zzwn[r2]
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.zzub[] r5 = r0.zzd
            r6 = r1[r4]
            com.google.android.gms.internal.ads.zzub r6 = (com.google.android.gms.internal.ads.zzub) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.zzwn r11 = r6.zza
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.zzuw r4 = r0.zza
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.zzg(r5, r6, r7, r8, r9)
            boolean r6 = r14.zzq()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zze = r12
            r6 = 1
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L5c
            long r7 = r0.zzb
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L5c
            goto L5d
        L5c:
            r6 = 0
        L5d:
            com.google.android.gms.internal.ads.zzdi.zzf(r6)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.android.gms.internal.ads.zzub[] r6 = r0.zzd
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.android.gms.internal.ads.zzub[] r7 = r0.zzd
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.android.gms.internal.ads.zzwn r8 = r8.zza
            if (r8 == r6) goto L7d
        L76:
            com.google.android.gms.internal.ads.zzub r8 = new com.google.android.gms.internal.ads.zzub
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.android.gms.internal.ads.zzub[] r6 = r0.zzd
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final void zzh(com.google.android.gms.internal.ads.zzuw r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzuv r1 = r0.zzc
            java.util.Objects.requireNonNull(r1)
            r1.zzh(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final com.google.android.gms.internal.ads.zzwy zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r1.zza
            com.google.android.gms.internal.ads.zzwy r0 = r0.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzj(long r2, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r4 = r1.zza
            r0 = 0
            r4.zzj(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzk() throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r1.zza
            r0.zzk()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzl(com.google.android.gms.internal.ads.zzuv r1, long r2) {
            r0 = this;
            r0.zzc = r1
            com.google.android.gms.internal.ads.zzuw r1 = r0.zza
            r1.zzl(r0, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final void zzm(long r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r1.zza
            r0.zzm(r2)
            return
    }

    public final void zzn(long r1, long r3) {
            r0 = this;
            r0.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzo(com.google.android.gms.internal.ads.zzks r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r1.zza
            boolean r2 = r0.zzo(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzp() {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r1.zza
            boolean r0 = r0.zzp()
            return r0
    }

    final boolean zzq() {
            r5 = this;
            long r0 = r5.zze
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }
}
