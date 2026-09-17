package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzoc {
    private final com.google.android.gms.internal.ads.zzca zza;
    private com.google.android.gms.internal.ads.zzgax zzb;
    private com.google.android.gms.internal.ads.zzgba zzc;
    private com.google.android.gms.internal.ads.zzuy zzd;
    private com.google.android.gms.internal.ads.zzuy zze;
    private com.google.android.gms.internal.ads.zzuy zzf;

    public zzoc(com.google.android.gms.internal.ads.zzca r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            com.google.android.gms.internal.ads.zzgax r1 = com.google.android.gms.internal.ads.zzgax.zzn()
            r0.zzb = r1
            com.google.android.gms.internal.ads.zzgba r1 = com.google.android.gms.internal.ads.zzgba.zzd()
            r0.zzc = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgax zzf(com.google.android.gms.internal.ads.zzoc r0) {
            com.google.android.gms.internal.ads.zzgax r0 = r0.zzb
            return r0
    }

    private static com.google.android.gms.internal.ads.zzuy zzj(com.google.android.gms.internal.ads.zzbw r10, com.google.android.gms.internal.ads.zzgax r11, com.google.android.gms.internal.ads.zzuy r12, com.google.android.gms.internal.ads.zzca r13) {
            com.google.android.gms.internal.ads.zzcc r0 = r10.zzn()
            int r1 = r10.zze()
            boolean r2 = r0.zzo()
            r3 = 0
            if (r2 == 0) goto L11
            r2 = r3
            goto L15
        L11:
            java.lang.Object r2 = r0.zzf(r1)
        L15:
            boolean r4 = r10.zzw()
            r5 = 0
            r6 = -1
            if (r4 != 0) goto L35
            boolean r4 = r0.zzo()
            if (r4 == 0) goto L24
            goto L35
        L24:
            com.google.android.gms.internal.ads.zzca r13 = r0.zzd(r1, r13, r5)
            long r0 = r10.zzk()
            long r0 = com.google.android.gms.internal.ads.zzeu.zzr(r0)
            int r13 = r13.zzc(r0)
            goto L36
        L35:
            r13 = -1
        L36:
            r0 = 0
        L37:
            int r1 = r11.size()
            if (r0 >= r1) goto L5c
            java.lang.Object r1 = r11.get(r0)
            com.google.android.gms.internal.ads.zzuy r1 = (com.google.android.gms.internal.ads.zzuy) r1
            boolean r6 = r10.zzw()
            int r7 = r10.zzb()
            int r8 = r10.zzc()
            r4 = r1
            r5 = r2
            r9 = r13
            boolean r4 = zzm(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L59
            return r1
        L59:
            int r0 = r0 + 1
            goto L37
        L5c:
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L7a
            if (r12 == 0) goto L7a
            boolean r6 = r10.zzw()
            int r7 = r10.zzb()
            int r8 = r10.zzc()
            r4 = r12
            r5 = r2
            r9 = r13
            boolean r10 = zzm(r4, r5, r6, r7, r8, r9)
            if (r10 == 0) goto L7a
            return r12
        L7a:
            return r3
    }

    private final void zzk(com.google.android.gms.internal.ads.zzgaz r3, com.google.android.gms.internal.ads.zzuy r4, com.google.android.gms.internal.ads.zzcc r5) {
            r2 = this;
            if (r4 != 0) goto L3
            goto L1d
        L3:
            java.lang.Object r0 = r4.zza
            int r0 = r5.zza(r0)
            r1 = -1
            if (r0 == r1) goto L10
            r3.zza(r4, r5)
            return
        L10:
            com.google.android.gms.internal.ads.zzgba r5 = r2.zzc
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.internal.ads.zzcc r5 = (com.google.android.gms.internal.ads.zzcc) r5
            if (r5 == 0) goto L1d
            r3.zza(r4, r5)
        L1d:
            return
    }

    private final void zzl(com.google.android.gms.internal.ads.zzcc r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzgaz r0 = new com.google.android.gms.internal.ads.zzgaz
            r0.<init>()
            com.google.android.gms.internal.ads.zzgax r1 = r3.zzb
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3b
            com.google.android.gms.internal.ads.zzuy r1 = r3.zze
            r3.zzk(r0, r1, r4)
            com.google.android.gms.internal.ads.zzuy r1 = r3.zzf
            com.google.android.gms.internal.ads.zzuy r2 = r3.zze
            boolean r1 = com.google.android.gms.internal.ads.zzfxw.zza(r1, r2)
            if (r1 != 0) goto L21
            com.google.android.gms.internal.ads.zzuy r1 = r3.zzf
            r3.zzk(r0, r1, r4)
        L21:
            com.google.android.gms.internal.ads.zzuy r1 = r3.zzd
            com.google.android.gms.internal.ads.zzuy r2 = r3.zze
            boolean r1 = com.google.android.gms.internal.ads.zzfxw.zza(r1, r2)
            if (r1 != 0) goto L61
            com.google.android.gms.internal.ads.zzuy r1 = r3.zzd
            com.google.android.gms.internal.ads.zzuy r2 = r3.zzf
            boolean r1 = com.google.android.gms.internal.ads.zzfxw.zza(r1, r2)
            if (r1 != 0) goto L61
            com.google.android.gms.internal.ads.zzuy r1 = r3.zzd
            r3.zzk(r0, r1, r4)
            goto L61
        L3b:
            r1 = 0
        L3c:
            com.google.android.gms.internal.ads.zzgax r2 = r3.zzb
            int r2 = r2.size()
            if (r1 >= r2) goto L52
            com.google.android.gms.internal.ads.zzgax r2 = r3.zzb
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzuy r2 = (com.google.android.gms.internal.ads.zzuy) r2
            r3.zzk(r0, r2, r4)
            int r1 = r1 + 1
            goto L3c
        L52:
            com.google.android.gms.internal.ads.zzgax r1 = r3.zzb
            com.google.android.gms.internal.ads.zzuy r2 = r3.zzd
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L61
            com.google.android.gms.internal.ads.zzuy r1 = r3.zzd
            r3.zzk(r0, r1, r4)
        L61:
            com.google.android.gms.internal.ads.zzgba r4 = r0.zzc()
            r3.zzc = r4
            return
    }

    private static boolean zzm(com.google.android.gms.internal.ads.zzuy r1, java.lang.Object r2, boolean r3, int r4, int r5, int r6) {
            java.lang.Object r0 = r1.zza
            boolean r2 = r0.equals(r2)
            r0 = 0
            if (r2 != 0) goto La
            return r0
        La:
            r2 = 1
            if (r3 == 0) goto L17
            int r3 = r1.zzb
            if (r3 != r4) goto L22
            int r1 = r1.zzc
            if (r1 != r5) goto L16
            goto L20
        L16:
            return r0
        L17:
            int r3 = r1.zzb
            r4 = -1
            if (r3 != r4) goto L22
            int r1 = r1.zze
            if (r1 != r6) goto L22
        L20:
            r0 = 1
        L22:
            return r0
    }

    public final com.google.android.gms.internal.ads.zzcc zza(com.google.android.gms.internal.ads.zzuy r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgba r0 = r1.zzc
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzcc r2 = (com.google.android.gms.internal.ads.zzcc) r2
            return r2
    }

    public final com.google.android.gms.internal.ads.zzuy zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzuy r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.internal.ads.zzuy zzc() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r3.zzb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            com.google.android.gms.internal.ads.zzgax r0 = r3.zzb
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L27
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L21
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            goto L36
        L21:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L27:
            java.util.Iterator r0 = r0.iterator()
        L2b:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L2b
            r0 = r1
        L36:
            com.google.android.gms.internal.ads.zzuy r0 = (com.google.android.gms.internal.ads.zzuy) r0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzuy zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzuy r0 = r1.zze
            return r0
    }

    public final com.google.android.gms.internal.ads.zzuy zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzuy r0 = r1.zzf
            return r0
    }

    public final void zzg(com.google.android.gms.internal.ads.zzbw r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r3.zzb
            com.google.android.gms.internal.ads.zzuy r1 = r3.zze
            com.google.android.gms.internal.ads.zzca r2 = r3.zza
            com.google.android.gms.internal.ads.zzuy r4 = zzj(r4, r0, r1, r2)
            r3.zzd = r4
            return
    }

    public final void zzh(java.util.List r2, com.google.android.gms.internal.ads.zzuy r3, com.google.android.gms.internal.ads.zzbw r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzl(r2)
            r1.zzb = r0
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1a
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.internal.ads.zzuy r2 = (com.google.android.gms.internal.ads.zzuy) r2
            r1.zze = r2
            java.util.Objects.requireNonNull(r3)
            r1.zzf = r3
        L1a:
            com.google.android.gms.internal.ads.zzuy r2 = r1.zzd
            if (r2 != 0) goto L2a
            com.google.android.gms.internal.ads.zzgax r2 = r1.zzb
            com.google.android.gms.internal.ads.zzuy r3 = r1.zze
            com.google.android.gms.internal.ads.zzca r0 = r1.zza
            com.google.android.gms.internal.ads.zzuy r2 = zzj(r4, r2, r3, r0)
            r1.zzd = r2
        L2a:
            com.google.android.gms.internal.ads.zzcc r2 = r4.zzn()
            r1.zzl(r2)
            return
    }

    public final void zzi(com.google.android.gms.internal.ads.zzbw r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r3.zzb
            com.google.android.gms.internal.ads.zzuy r1 = r3.zze
            com.google.android.gms.internal.ads.zzca r2 = r3.zza
            com.google.android.gms.internal.ads.zzuy r0 = zzj(r4, r0, r1, r2)
            r3.zzd = r0
            com.google.android.gms.internal.ads.zzcc r4 = r4.zzn()
            r3.zzl(r4)
            return
    }
}
