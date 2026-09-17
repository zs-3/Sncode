package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzii implements com.google.android.gms.internal.ads.zzkt {
    private final com.google.android.gms.internal.ads.zzlz zza;
    private final com.google.android.gms.internal.ads.zzih zzb;
    private com.google.android.gms.internal.ads.zzlr zzc;
    private com.google.android.gms.internal.ads.zzkt zzd;
    private boolean zze;
    private boolean zzf;

    public zzii(com.google.android.gms.internal.ads.zzih r1, com.google.android.gms.internal.ads.zzdj r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            com.google.android.gms.internal.ads.zzlz r1 = new com.google.android.gms.internal.ads.zzlz
            r1.<init>(r2)
            r0.zza = r1
            r1 = 1
            r0.zze = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final long zza() {
            r2 = this;
            boolean r0 = r2.zze
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.ads.zzlz r0 = r2.zza
            long r0 = r0.zza()
            goto L14
        Lb:
            com.google.android.gms.internal.ads.zzkt r0 = r2.zzd
            java.util.Objects.requireNonNull(r0)
            long r0 = r0.zza()
        L14:
            return r0
    }

    public final long zzb(boolean r6) {
            r5 = this;
            com.google.android.gms.internal.ads.zzlr r0 = r5.zzc
            if (r0 == 0) goto L71
            boolean r0 = r0.zzW()
            if (r0 != 0) goto L71
            if (r6 == 0) goto L15
            com.google.android.gms.internal.ads.zzlr r0 = r5.zzc
            int r0 = r0.zzcV()
            r1 = 2
            if (r0 != r1) goto L71
        L15:
            com.google.android.gms.internal.ads.zzlr r0 = r5.zzc
            boolean r0 = r0.zzX()
            if (r0 != 0) goto L28
            if (r6 != 0) goto L71
            com.google.android.gms.internal.ads.zzlr r6 = r5.zzc
            boolean r6 = r6.zzQ()
            if (r6 == 0) goto L28
            goto L71
        L28:
            com.google.android.gms.internal.ads.zzkt r6 = r5.zzd
            java.util.Objects.requireNonNull(r6)
            long r0 = r6.zza()
            boolean r2 = r5.zze
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.zzlz r2 = r5.zza
            long r2 = r2.zza()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L45
            com.google.android.gms.internal.ads.zzlz r6 = r5.zza
            r6.zze()
            goto L7d
        L45:
            r2 = 0
            r5.zze = r2
            boolean r2 = r5.zzf
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.zzlz r2 = r5.zza
            r2.zzd()
        L51:
            com.google.android.gms.internal.ads.zzlz r2 = r5.zza
            r2.zzb(r0)
            com.google.android.gms.internal.ads.zzbq r6 = r6.zzc()
            com.google.android.gms.internal.ads.zzlz r0 = r5.zza
            com.google.android.gms.internal.ads.zzbq r0 = r0.zzc()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L7d
            com.google.android.gms.internal.ads.zzlz r0 = r5.zza
            r0.zzg(r6)
            com.google.android.gms.internal.ads.zzih r0 = r5.zzb
            r0.zza(r6)
            goto L7d
        L71:
            r6 = 1
            r5.zze = r6
            boolean r6 = r5.zzf
            if (r6 == 0) goto L7d
            com.google.android.gms.internal.ads.zzlz r6 = r5.zza
            r6.zzd()
        L7d:
            long r0 = r5.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final com.google.android.gms.internal.ads.zzbq zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzkt r0 = r1.zzd
            if (r0 == 0) goto L9
            com.google.android.gms.internal.ads.zzbq r0 = r0.zzc()
            goto Lf
        L9:
            com.google.android.gms.internal.ads.zzlz r0 = r1.zza
            com.google.android.gms.internal.ads.zzbq r0 = r0.zzc()
        Lf:
            return r0
    }

    public final void zzd(com.google.android.gms.internal.ads.zzlr r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzlr r0 = r1.zzc
            if (r2 != r0) goto Lc
            r2 = 0
            r1.zzd = r2
            r1.zzc = r2
            r2 = 1
            r1.zze = r2
        Lc:
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzlr r3) throws com.google.android.gms.internal.ads.zzij {
            r2 = this;
            com.google.android.gms.internal.ads.zzkt r0 = r3.zzl()
            if (r0 == 0) goto L28
            com.google.android.gms.internal.ads.zzkt r1 = r2.zzd
            if (r0 == r1) goto L28
            if (r1 != 0) goto L1a
            r2.zzd = r0
            r2.zzc = r3
            com.google.android.gms.internal.ads.zzlz r3 = r2.zza
            com.google.android.gms.internal.ads.zzbq r3 = r3.zzc()
            r0.zzg(r3)
            return
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Multiple renderer media clocks enabled."
            r3.<init>(r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            com.google.android.gms.internal.ads.zzij r3 = com.google.android.gms.internal.ads.zzij.zzd(r3, r0)
            throw r3
        L28:
            return
    }

    public final void zzf(long r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzlz r0 = r1.zza
            r0.zzb(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final void zzg(com.google.android.gms.internal.ads.zzbq r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzkt r0 = r1.zzd
            if (r0 == 0) goto Ld
            r0.zzg(r2)
            com.google.android.gms.internal.ads.zzkt r2 = r1.zzd
            com.google.android.gms.internal.ads.zzbq r2 = r2.zzc()
        Ld:
            com.google.android.gms.internal.ads.zzlz r0 = r1.zza
            r0.zzg(r2)
            return
    }

    public final void zzh() {
            r1 = this;
            r0 = 1
            r1.zzf = r0
            com.google.android.gms.internal.ads.zzlz r0 = r1.zza
            r0.zzd()
            return
    }

    public final void zzi() {
            r1 = this;
            r0 = 0
            r1.zzf = r0
            com.google.android.gms.internal.ads.zzlz r0 = r1.zza
            r0.zze()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final boolean zzj() {
            r1 = this;
            boolean r0 = r1.zze
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.internal.ads.zzkt r0 = r1.zzd
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.zzj()
            return r0
    }
}
