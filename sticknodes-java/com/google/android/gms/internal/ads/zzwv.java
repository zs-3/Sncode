package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzwv implements com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzuv {
    private final com.google.android.gms.internal.ads.zzuw zza;
    private final long zzb;
    private com.google.android.gms.internal.ads.zzuv zzc;

    public zzwv(com.google.android.gms.internal.ads.zzuw r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zza(long r4, com.google.android.gms.internal.ads.zzlw r6) {
            r3 = this;
            long r0 = r3.zzb
            com.google.android.gms.internal.ads.zzuw r2 = r3.zza
            long r4 = r4 - r0
            long r4 = r2.zza(r4, r6)
            long r4 = r4 + r0
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r5.zza
            long r0 = r0.zzb()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            return r2
        Ld:
            long r2 = r5.zzb
            long r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final long zzc() {
            r5 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r5.zza
            long r0 = r0.zzc()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Ld
            return r2
        Ld:
            long r2 = r5.zzb
            long r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zzd() {
            r5 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r5.zza
            long r0 = r0.zzd()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            return r2
        L10:
            long r2 = r5.zzb
            long r0 = r0 + r2
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final long zze(long r4) {
            r3 = this;
            long r0 = r3.zzb
            com.google.android.gms.internal.ads.zzuw r2 = r3.zza
            long r4 = r4 - r0
            long r4 = r2.zze(r4)
            long r4 = r4 + r0
            return r4
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
    public final long zzg(com.google.android.gms.internal.ads.zzyl[] r13, boolean[] r14, com.google.android.gms.internal.ads.zzwn[] r15, boolean[] r16, long r17) {
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.google.android.gms.internal.ads.zzwn[] r2 = new com.google.android.gms.internal.ads.zzwn[r2]
            r10 = 0
            r3 = 0
        L7:
            int r4 = r1.length
            r11 = 0
            if (r3 >= r4) goto L1a
            r4 = r1[r3]
            com.google.android.gms.internal.ads.zzwu r4 = (com.google.android.gms.internal.ads.zzwu) r4
            if (r4 == 0) goto L15
            com.google.android.gms.internal.ads.zzwn r11 = r4.zzc()
        L15:
            r2[r3] = r11
            int r3 = r3 + 1
            goto L7
        L1a:
            com.google.android.gms.internal.ads.zzuw r3 = r0.zza
            long r4 = r0.zzb
            long r8 = r17 - r4
            r4 = r13
            r5 = r14
            r6 = r2
            r7 = r16
            long r3 = r3.zzg(r4, r5, r6, r7, r8)
        L29:
            int r5 = r1.length
            if (r10 >= r5) goto L4b
            r5 = r2[r10]
            if (r5 != 0) goto L33
            r1[r10] = r11
            goto L48
        L33:
            r6 = r1[r10]
            if (r6 == 0) goto L3f
            com.google.android.gms.internal.ads.zzwu r6 = (com.google.android.gms.internal.ads.zzwu) r6
            com.google.android.gms.internal.ads.zzwn r6 = r6.zzc()
            if (r6 == r5) goto L48
        L3f:
            long r6 = r0.zzb
            com.google.android.gms.internal.ads.zzwu r8 = new com.google.android.gms.internal.ads.zzwu
            r8.<init>(r5, r6)
            r1[r10] = r8
        L48:
            int r10 = r10 + 1
            goto L29
        L4b:
            long r1 = r0.zzb
            long r3 = r3 + r1
            return r3
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
    public final void zzj(long r3, boolean r5) {
            r2 = this;
            long r0 = r2.zzb
            com.google.android.gms.internal.ads.zzuw r5 = r2.zza
            long r3 = r3 - r0
            r0 = 0
            r5.zzj(r3, r0)
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
    public final void zzl(com.google.android.gms.internal.ads.zzuv r3, long r4) {
            r2 = this;
            r2.zzc = r3
            long r0 = r2.zzb
            long r4 = r4 - r0
            com.google.android.gms.internal.ads.zzuw r3 = r2.zza
            r3.zzl(r2, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final void zzm(long r4) {
            r3 = this;
            long r0 = r3.zzb
            com.google.android.gms.internal.ads.zzuw r2 = r3.zza
            long r4 = r4 - r0
            r2.zzm(r4)
            return
    }

    public final com.google.android.gms.internal.ads.zzuw zzn() {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzo(com.google.android.gms.internal.ads.zzks r5) {
            r4 = this;
            long r0 = r5.zza
            long r2 = r4.zzb
            com.google.android.gms.internal.ads.zzkq r5 = r5.zza()
            long r0 = r0 - r2
            r5.zze(r0)
            com.google.android.gms.internal.ads.zzks r5 = r5.zzg()
            com.google.android.gms.internal.ads.zzuw r0 = r4.zza
            boolean r5 = r0.zzo(r5)
            return r5
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzwp
    public final boolean zzp() {
            r1 = this;
            com.google.android.gms.internal.ads.zzuw r0 = r1.zza
            boolean r0 = r0.zzp()
            return r0
    }
}
