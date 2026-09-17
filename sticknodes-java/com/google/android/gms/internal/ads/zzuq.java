package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzuq implements com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzuv {
    public final com.google.android.gms.internal.ads.zzuy zza;
    private final long zzb;
    private com.google.android.gms.internal.ads.zzva zzc;
    private com.google.android.gms.internal.ads.zzuw zzd;
    private com.google.android.gms.internal.ads.zzuv zze;
    private long zzf;
    private final com.google.android.gms.internal.ads.zzza zzg;

    public zzuq(com.google.android.gms.internal.ads.zzuy r1, com.google.android.gms.internal.ads.zzza r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzg = r2
            r0.zzb = r3
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.zzf = r1
            return
    }

    private final long zzv(long r6) {
            r5 = this;
            long r0 = r5.zzf
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lc
            return r0
        Lc:
            return r6
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zza(long r3, com.google.android.gms.internal.ads.zzlw r5) {
            r2 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r2.zzd
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            long r3 = r0.zza(r3, r5)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r2.zzd
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            long r0 = r0.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r2.zzd
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            long r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r2.zzd
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            long r0 = r0.zzd()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zze(long r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r2.zzd
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            long r3 = r0.zze(r3)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzwo
    public final /* bridge */ /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzwp r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r2 = (com.google.android.gms.internal.ads.zzuw) r2
            com.google.android.gms.internal.ads.zzuv r2 = r1.zze
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r2.zzf(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzg(com.google.android.gms.internal.ads.zzyl[] r16, boolean[] r17, com.google.android.gms.internal.ads.zzwn[] r18, boolean[] r19, long r20) {
            r15 = this;
            r0 = r15
            long r1 = r0.zzf
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L14
            long r5 = r0.zzb
            int r7 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r7 != 0) goto L14
            r13 = r1
            goto L16
        L14:
            r13 = r20
        L16:
            r0.zzf = r3
            com.google.android.gms.internal.ads.zzuw r8 = r0.zzd
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            long r1 = r8.zzg(r9, r10, r11, r12, r13)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final void zzh(com.google.android.gms.internal.ads.zzuw r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzuv r2 = r1.zze
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r2.zzh(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final com.google.android.gms.internal.ads.zzwy zzi() {
            r2 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r2.zzd
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            com.google.android.gms.internal.ads.zzwy r0 = r0.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzj(long r2, boolean r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r4 = r1.zzd
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r0 = 0
            r4.zzj(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzk() throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r1.zzd     // Catch: java.io.IOException -> L10
            if (r0 == 0) goto L8
            r0.zzk()     // Catch: java.io.IOException -> L10
            return
        L8:
            com.google.android.gms.internal.ads.zzva r0 = r1.zzc     // Catch: java.io.IOException -> L10
            if (r0 == 0) goto Lf
            r0.zzz()     // Catch: java.io.IOException -> L10
        Lf:
            return
        L10:
            r0 = move-exception
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zzl(com.google.android.gms.internal.ads.zzuv r1, long r2) {
            r0 = this;
            r0.zze = r1
            com.google.android.gms.internal.ads.zzuw r1 = r0.zzd
            if (r1 == 0) goto Lf
            long r2 = r0.zzb
            long r2 = r0.zzv(r2)
            r1.zzl(r0, r2)
        Lf:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final void zzm(long r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r2.zzd
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r0.zzm(r3)
            return
    }

    public final long zzn() {
            r2 = this;
            long r0 = r2.zzf
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzo(com.google.android.gms.internal.ads.zzks r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r1.zzd
            if (r0 == 0) goto Lc
            boolean r2 = r0.zzo(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzp() {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r1.zzd
            if (r0 == 0) goto Lc
            boolean r0 = r0.zzp()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final long zzq() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    public final void zzr(com.google.android.gms.internal.ads.zzuy r5) {
            r4 = this;
            long r0 = r4.zzb
            long r0 = r4.zzv(r0)
            com.google.android.gms.internal.ads.zzva r2 = r4.zzc
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzza r3 = r4.zzg
            com.google.android.gms.internal.ads.zzuw r5 = r2.zzI(r5, r3, r0)
            r4.zzd = r5
            com.google.android.gms.internal.ads.zzuv r2 = r4.zze
            if (r2 == 0) goto L1a
            r5.zzl(r4, r0)
        L1a:
            return
    }

    public final void zzs(long r1) {
            r0 = this;
            r0.zzf = r1
            return
    }

    public final void zzt() {
            r2 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r2.zzd
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzva r1 = r2.zzc
            java.util.Objects.requireNonNull(r1)
            r1.zzG(r0)
        Lc:
            return
    }

    public final void zzu(com.google.android.gms.internal.ads.zzva r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzva r0 = r1.zzc
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r1.zzc = r2
            return
    }
}
