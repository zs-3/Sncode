package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzut extends com.google.android.gms.internal.ads.zzxa {
    private final boolean zzb;
    private final com.google.android.gms.internal.ads.zzcb zzc;
    private final com.google.android.gms.internal.ads.zzca zzd;
    private com.google.android.gms.internal.ads.zzur zze;
    private com.google.android.gms.internal.ads.zzuq zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzut(com.google.android.gms.internal.ads.zzva r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto La
            r1.zzv()
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            r0.zzb = r2
            com.google.android.gms.internal.ads.zzcb r2 = new com.google.android.gms.internal.ads.zzcb
            r2.<init>()
            r0.zzc = r2
            com.google.android.gms.internal.ads.zzca r2 = new com.google.android.gms.internal.ads.zzca
            r2.<init>()
            r0.zzd = r2
            r1.zzM()
            com.google.android.gms.internal.ads.zzbc r1 = r1.zzJ()
            com.google.android.gms.internal.ads.zzur r1 = com.google.android.gms.internal.ads.zzur.zzq(r1)
            r0.zze = r1
            return
    }

    private final java.lang.Object zzK(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzur r0 = r1.zze
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzur.zzs(r0)
            if (r0 == 0) goto L16
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzur.zzc
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            com.google.android.gms.internal.ads.zzur r2 = r1.zze
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzur.zzs(r2)
        L16:
            return r2
    }

    private final boolean zzL(long r7) {
            r6 = this;
            com.google.android.gms.internal.ads.zzuq r0 = r6.zzf
            com.google.android.gms.internal.ads.zzur r1 = r6.zze
            com.google.android.gms.internal.ads.zzuy r2 = r0.zza
            java.lang.Object r2 = r2.zza
            int r1 = r1.zza(r2)
            r2 = 0
            r3 = -1
            if (r1 != r3) goto L11
            return r2
        L11:
            com.google.android.gms.internal.ads.zzur r3 = r6.zze
            com.google.android.gms.internal.ads.zzca r4 = r6.zzd
            r3.zzd(r1, r4, r2)
            long r1 = r4.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L30
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L30
            r7 = 0
            r3 = -1
            long r1 = r1 + r3
            long r7 = java.lang.Math.max(r7, r1)
        L30:
            r0.zzs(r7)
            r7 = 1
            return r7
    }

    public final com.google.android.gms.internal.ads.zzcc zzC() {
            r1 = this;
            com.google.android.gms.internal.ads.zzur r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    protected final com.google.android.gms.internal.ads.zzuy zzD(com.google.android.gms.internal.ads.zzuy r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzur r0 = r2.zze
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzur.zzs(r0)
            java.lang.Object r1 = r3.zza
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzur r0 = r2.zze
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzur.zzs(r0)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzur.zzc
        L18:
            com.google.android.gms.internal.ads.zzuy r3 = r3.zza(r1)
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    protected final void zzE(com.google.android.gms.internal.ads.zzcc r15) {
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzur r0 = r14.zze
            com.google.android.gms.internal.ads.zzur r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzuq r15 = r14.zzf
            if (r15 == 0) goto L9e
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L9e
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzur r0 = r14.zze
            com.google.android.gms.internal.ads.zzur r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcb.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzur.zzc
            com.google.android.gms.internal.ads.zzur r15 = com.google.android.gms.internal.ads.zzur.zzr(r15, r0, r2)
        L33:
            r14.zze = r15
            goto L9e
        L36:
            com.google.android.gms.internal.ads.zzcb r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcb r0 = r14.zzc
            java.lang.Object r0 = r0.zzb
            com.google.android.gms.internal.ads.zzuq r5 = r14.zzf
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zzur r8 = r14.zze
            com.google.android.gms.internal.ads.zzca r9 = r14.zzd
            com.google.android.gms.internal.ads.zzuy r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zzur r5 = r14.zze
            com.google.android.gms.internal.ads.zzcb r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.zzcb r9 = r14.zzc
            com.google.android.gms.internal.ads.zzca r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.zzur r0 = r14.zze
            com.google.android.gms.internal.ads.zzur r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.zzur r15 = com.google.android.gms.internal.ads.zzur.zzr(r15, r0, r3)
        L86:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzuq r15 = r14.zzf
            if (r15 == 0) goto L9e
            boolean r0 = r14.zzL(r4)
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.zzuy r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zzuy r1 = r15.zza(r0)
        L9e:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zzur r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzuq r15 = r14.zzf
            java.util.Objects.requireNonNull(r15)
            r15.zzr(r1)
        Lb2:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzF() {
            r2 = this;
            boolean r0 = r2.zzb
            if (r0 != 0) goto Ld
            r0 = 1
            r2.zzg = r0
            r0 = 0
            com.google.android.gms.internal.ads.zzva r1 = r2.zza
            r2.zzB(r0, r1)
        Ld:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzva
    public final void zzG(com.google.android.gms.internal.ads.zzuw r2) {
            r1 = this;
            r0 = r2
            com.google.android.gms.internal.ads.zzuq r0 = (com.google.android.gms.internal.ads.zzuq) r0
            r0.zzt()
            com.google.android.gms.internal.ads.zzuq r0 = r1.zzf
            if (r2 != r0) goto Ld
            r2 = 0
            r1.zzf = r2
        Ld:
            return
    }

    public final com.google.android.gms.internal.ads.zzuq zzH(com.google.android.gms.internal.ads.zzuy r2, com.google.android.gms.internal.ads.zzza r3, long r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzuq r0 = new com.google.android.gms.internal.ads.zzuq
            r0.<init>(r2, r3, r4)
            com.google.android.gms.internal.ads.zzva r3 = r1.zza
            r0.zzu(r3)
            boolean r3 = r1.zzh
            if (r3 == 0) goto L1c
            java.lang.Object r3 = r2.zza
            java.lang.Object r3 = r1.zzK(r3)
            com.google.android.gms.internal.ads.zzuy r2 = r2.zza(r3)
            r0.zzr(r2)
            goto L2b
        L1c:
            r1.zzf = r0
            boolean r2 = r1.zzg
            if (r2 != 0) goto L2b
            r2 = 1
            r1.zzg = r2
            r2 = 0
            com.google.android.gms.internal.ads.zzva r3 = r1.zza
            r1.zzB(r2, r3)
        L2b:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzxa, com.google.android.gms.internal.ads.zzva
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzuw zzI(com.google.android.gms.internal.ads.zzuy r1, com.google.android.gms.internal.ads.zzza r2, long r3) {
            r0 = this;
            com.google.android.gms.internal.ads.zzuq r1 = r0.zzH(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zztx
    public final void zzq() {
            r1 = this;
            r0 = 0
            r1.zzh = r0
            r1.zzg = r0
            super.zzq()
            return
    }

    @Override // com.google.android.gms.internal.ads.zztx, com.google.android.gms.internal.ads.zzva
    public final void zzt(com.google.android.gms.internal.ads.zzbc r4) {
            r3 = this;
            boolean r0 = r3.zzi
            if (r0 == 0) goto L16
            com.google.android.gms.internal.ads.zzur r0 = r3.zze
            com.google.android.gms.internal.ads.zzww r1 = new com.google.android.gms.internal.ads.zzww
            com.google.android.gms.internal.ads.zzur r2 = r3.zze
            com.google.android.gms.internal.ads.zzcc r2 = r2.zzb
            r1.<init>(r2, r4)
            com.google.android.gms.internal.ads.zzur r0 = r0.zzp(r1)
            r3.zze = r0
            goto L1c
        L16:
            com.google.android.gms.internal.ads.zzur r0 = com.google.android.gms.internal.ads.zzur.zzq(r4)
            r3.zze = r0
        L1c:
            com.google.android.gms.internal.ads.zzva r0 = r3.zza
            r0.zzt(r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzva
    public final void zzz() {
            r0 = this;
            return
    }
}
