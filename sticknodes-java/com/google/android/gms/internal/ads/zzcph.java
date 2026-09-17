package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcph {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzbow zzb;
    private final java.util.concurrent.Executor zzc;
    private com.google.android.gms.internal.ads.zzcpm zzd;
    private final com.google.android.gms.internal.ads.zzbjw zze;
    private final com.google.android.gms.internal.ads.zzbjw zzf;

    public zzcph(java.lang.String r2, com.google.android.gms.internal.ads.zzbow r3, java.util.concurrent.Executor r4) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzcpe r0 = new com.google.android.gms.internal.ads.zzcpe
            r0.<init>(r1)
            r1.zze = r0
            com.google.android.gms.internal.ads.zzcpg r0 = new com.google.android.gms.internal.ads.zzcpg
            r0.<init>(r1)
            r1.zzf = r0
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzcpm zza(com.google.android.gms.internal.ads.zzcph r0) {
            com.google.android.gms.internal.ads.zzcpm r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.Executor zzb(com.google.android.gms.internal.ads.zzcph r0) {
            java.util.concurrent.Executor r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzg(com.google.android.gms.internal.ads.zzcph r1, java.util.Map r2) {
            if (r2 != 0) goto L3
            goto L1b
        L3:
            java.lang.String r0 = "hashCode"
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1b
            java.lang.String r1 = r1.zza
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1b
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public final void zzc(com.google.android.gms.internal.ads.zzcpm r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbow r0 = r3.zzb
            com.google.android.gms.internal.ads.zzbjw r1 = r3.zze
            java.lang.String r2 = "/updateActiveView"
            r0.zzb(r2, r1)
            com.google.android.gms.internal.ads.zzbow r0 = r3.zzb
            com.google.android.gms.internal.ads.zzbjw r1 = r3.zzf
            java.lang.String r2 = "/untrackActiveViewUnit"
            r0.zzb(r2, r1)
            r3.zzd = r4
            return
    }

    public final void zzd(com.google.android.gms.internal.ads.zzcfo r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbjw r0 = r2.zze
            java.lang.String r1 = "/updateActiveView"
            r3.zzag(r1, r0)
            com.google.android.gms.internal.ads.zzbjw r0 = r2.zzf
            java.lang.String r1 = "/untrackActiveViewUnit"
            r3.zzag(r1, r0)
            return
    }

    public final void zze() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbow r0 = r3.zzb
            com.google.android.gms.internal.ads.zzbjw r1 = r3.zze
            java.lang.String r2 = "/updateActiveView"
            r0.zzc(r2, r1)
            com.google.android.gms.internal.ads.zzbow r0 = r3.zzb
            com.google.android.gms.internal.ads.zzbjw r1 = r3.zzf
            java.lang.String r2 = "/untrackActiveViewUnit"
            r0.zzc(r2, r1)
            return
    }

    public final void zzf(com.google.android.gms.internal.ads.zzcfo r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbjw r0 = r2.zze
            java.lang.String r1 = "/updateActiveView"
            r3.zzaz(r1, r0)
            com.google.android.gms.internal.ads.zzbjw r0 = r2.zzf
            java.lang.String r1 = "/untrackActiveViewUnit"
            r3.zzaz(r1, r0)
            return
    }
}
