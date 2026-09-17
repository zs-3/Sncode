package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgae extends com.google.android.gms.internal.ads.zzfzr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgag zza;
    private final java.lang.Object zzb;
    private int zzc;

    zzgae(com.google.android.gms.internal.ads.zzgag r1, int r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgag.zzg(r1, r2)
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    private final void zza() {
            r3 = this;
            int r0 = r3.zzc
            r1 = -1
            if (r0 == r1) goto L1f
            com.google.android.gms.internal.ads.zzgag r1 = r3.zza
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.lang.Object r0 = r3.zzb
            com.google.android.gms.internal.ads.zzgag r1 = r3.zza
            int r2 = r3.zzc
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgag.zzg(r1, r2)
            boolean r0 = com.google.android.gms.internal.ads.zzfxw.zza(r0, r1)
            if (r0 != 0) goto L1e
            goto L1f
        L1e:
            return
        L1f:
            com.google.android.gms.internal.ads.zzgag r0 = r3.zza
            java.lang.Object r1 = r3.zzb
            int r0 = com.google.android.gms.internal.ads.zzgag.zzd(r0, r1)
            r3.zzc = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.Map.Entry
    public final java.lang.Object getValue() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r2.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r2.zzb
            java.lang.Object r0 = r0.get(r1)
            return r0
        Lf:
            r2.zza()
            int r0 = r2.zzc
            r1 = -1
            if (r0 != r1) goto L19
            r0 = 0
            return r0
        L19:
            com.google.android.gms.internal.ads.zzgag r1 = r2.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgag.zzj(r1, r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzgag r0 = r3.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r3.zzb
            java.lang.Object r4 = r0.put(r1, r4)
            return r4
        Lf:
            r3.zza()
            int r0 = r3.zzc
            r1 = -1
            if (r0 != r1) goto L20
            com.google.android.gms.internal.ads.zzgag r0 = r3.zza
            java.lang.Object r1 = r3.zzb
            r0.put(r1, r4)
            r4 = 0
            return r4
        L20:
            com.google.android.gms.internal.ads.zzgag r1 = r3.zza
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgag.zzj(r1, r0)
            int r2 = r3.zzc
            com.google.android.gms.internal.ads.zzgag.zzn(r1, r2, r4)
            return r0
    }
}
