package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzbiu implements com.google.android.gms.internal.ads.zzbjw {
    public final /* synthetic */ com.google.android.gms.internal.ads.zzdga zza;
    public final /* synthetic */ com.google.android.gms.internal.ads.zzcop zzb;

    public /* synthetic */ zzbiu(com.google.android.gms.internal.ads.zzdga r1, com.google.android.gms.internal.ads.zzcop r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r4, java.util.Map r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzdga r0 = r3.zza
            com.google.android.gms.internal.ads.zzcfo r4 = (com.google.android.gms.internal.ads.zzcfo) r4
            com.google.android.gms.internal.ads.zzbjv.zzc(r5, r0)
            java.lang.String r0 = "u"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L17
            java.lang.String r4 = "URL missing from click GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return
        L17:
            com.google.android.gms.internal.ads.zzcop r0 = r3.zzb
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzbjv.zza(r4, r5)
            com.google.android.gms.internal.ads.zzgff r1 = com.google.android.gms.internal.ads.zzgff.zzu(r1)
            com.google.android.gms.internal.ads.zzbiw r2 = new com.google.android.gms.internal.ads.zzbiw
            r2.<init>(r0, r5)
            com.google.android.gms.internal.ads.zzgfz r5 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r2, r5)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            com.google.android.gms.internal.ads.zzbjk r1 = new com.google.android.gms.internal.ads.zzbjk
            r1.<init>(r4)
            com.google.android.gms.internal.ads.zzgfo.zzr(r0, r1, r5)
            return
    }
}
