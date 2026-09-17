package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzfhk implements com.google.android.gms.internal.ads.zzbjw {
    public final /* synthetic */ com.google.android.gms.internal.ads.zzdga zza;
    public final /* synthetic */ com.google.android.gms.internal.ads.zzcop zzb;
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfng zzc;
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeey zzd;

    public /* synthetic */ zzfhk(com.google.android.gms.internal.ads.zzdga r1, com.google.android.gms.internal.ads.zzcop r2, com.google.android.gms.internal.ads.zzfng r3, com.google.android.gms.internal.ads.zzeey r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r5, java.util.Map r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzdga r0 = r4.zza
            com.google.android.gms.internal.ads.zzcfo r5 = (com.google.android.gms.internal.ads.zzcfo) r5
            com.google.android.gms.internal.ads.zzbjv.zzc(r6, r0)
            java.lang.String r0 = "u"
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L17
            java.lang.String r5 = "URL missing from click GMSG."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            return
        L17:
            com.google.android.gms.internal.ads.zzeey r0 = r4.zzd
            com.google.android.gms.internal.ads.zzfng r1 = r4.zzc
            com.google.android.gms.internal.ads.zzcop r2 = r4.zzb
            com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzbjv.zza(r5, r6)
            com.google.android.gms.internal.ads.zzfhm r3 = new com.google.android.gms.internal.ads.zzfhm
            r3.<init>(r5, r2, r1, r0)
            com.google.android.gms.internal.ads.zzgfz r5 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.internal.ads.zzgfo.zzr(r6, r3, r5)
            return
    }
}
