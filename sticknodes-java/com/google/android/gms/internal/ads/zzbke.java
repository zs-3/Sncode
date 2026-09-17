package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbke implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ java.util.Map zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbki zzd;

    zzbke(com.google.android.gms.internal.ads.zzbki r1, java.util.Map r2, com.google.android.gms.ads.internal.client.zza r3, java.lang.String r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "OpenGmsgHandler.attributionReportingManager"
            r0.zzw(r3, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r5) {
            r4 = this;
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjH
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1b
            java.util.Map r0 = r4.zza
            java.lang.String r1 = "u"
            r0.put(r1, r5)
        L1b:
            com.google.android.gms.internal.ads.zzbki r0 = r4.zzd
            com.google.android.gms.ads.internal.client.zza r1 = r4.zzb
            java.util.Map r2 = r4.zza
            java.lang.String r3 = r4.zzc
            com.google.android.gms.internal.ads.zzbki.zze(r0, r5, r1, r2, r3)
            return
    }
}
