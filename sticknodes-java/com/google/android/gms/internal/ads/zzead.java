package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzead implements com.google.android.gms.internal.ads.zzeaf {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final com.google.android.gms.internal.ads.zzdaw zzc;

    public zzead(java.util.Map r1, com.google.android.gms.internal.ads.zzgfz r2, com.google.android.gms.internal.ads.zzdaw r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdaw zza(com.google.android.gms.internal.ads.zzead r0) {
            com.google.android.gms.internal.ads.zzdaw r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzeaf
    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbwa r8) {
            r7 = this;
            com.google.android.gms.internal.ads.zzdaw r0 = r7.zzc
            r0.zzdn(r8)
            com.google.android.gms.internal.ads.zzdye r0 = new com.google.android.gms.internal.ads.zzdye
            r1 = 3
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzhP
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ","
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r3 = 0
        L23:
            if (r3 >= r2) goto L45
            r4 = r1[r3]
            java.util.Map r5 = r7.zza
            java.lang.String r4 = r4.trim()
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.internal.ads.zzhja r4 = (com.google.android.gms.internal.ads.zzhja) r4
            if (r4 == 0) goto L42
            com.google.android.gms.internal.ads.zzeab r5 = new com.google.android.gms.internal.ads.zzeab
            r5.<init>(r4, r8)
            com.google.android.gms.internal.ads.zzgfz r4 = r7.zzb
            java.lang.Class<com.google.android.gms.internal.ads.zzdye> r6 = com.google.android.gms.internal.ads.zzdye.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzf(r0, r6, r5, r4)
        L42:
            int r3 = r3 + 1
            goto L23
        L45:
            com.google.android.gms.internal.ads.zzeac r8 = new com.google.android.gms.internal.ads.zzeac
            r8.<init>(r7)
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r8, r1)
            return r0
    }
}
