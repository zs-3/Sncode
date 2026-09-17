package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdpn implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgh zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgk zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcop zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdpt zzd;

    zzdpn(com.google.android.gms.internal.ads.zzdpt r1, com.google.android.gms.internal.ads.zzfgh r2, com.google.android.gms.internal.ads.zzfgk r3, com.google.android.gms.internal.ads.zzcop r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzcfo r4 = (com.google.android.gms.internal.ads.zzcfo) r4
            com.google.android.gms.internal.ads.zzfgh r0 = r3.zza
            com.google.android.gms.internal.ads.zzfgk r1 = r3.zzb
            r4.zzW(r0, r1)
            com.google.android.gms.internal.ads.zzchg r4 = r4.zzN()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjK
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3f
            if (r4 == 0) goto L3f
            com.google.android.gms.internal.ads.zzcop r0 = r3.zzc
            com.google.android.gms.internal.ads.zzdpt r1 = r3.zzd
            com.google.android.gms.internal.ads.zzeey r2 = com.google.android.gms.internal.ads.zzdpt.zzd(r1)
            com.google.android.gms.internal.ads.zzfng r1 = com.google.android.gms.internal.ads.zzdpt.zze(r1)
            r4.zzI(r0, r2, r1)
            com.google.android.gms.internal.ads.zzcop r0 = r3.zzc
            com.google.android.gms.internal.ads.zzdpt r1 = r3.zzd
            com.google.android.gms.internal.ads.zzeey r2 = com.google.android.gms.internal.ads.zzdpt.zzd(r1)
            com.google.android.gms.internal.ads.zzdud r1 = com.google.android.gms.internal.ads.zzdpt.zzc(r1)
            r4.zzK(r0, r2, r1)
        L3f:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmA
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L58
            if (r4 == 0) goto L58
            com.google.android.gms.internal.ads.zzfgh r0 = r3.zza
            r4.zzL(r0)
        L58:
            return
    }
}
