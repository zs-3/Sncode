package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdki implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdkk zzb;

    zzdki(com.google.android.gms.internal.ads.zzdkk r1, java.lang.String r2, boolean r3) {
            r0 = this;
            java.lang.String r2 = "Google"
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfe
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1b
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "omid native display exp"
            r0.zzv(r3, r1)
        L1b:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r3.zzb
            com.google.android.gms.internal.ads.zzcfo r4 = (com.google.android.gms.internal.ads.zzcfo) r4
            com.google.android.gms.internal.ads.zzdkp r0 = com.google.android.gms.internal.ads.zzdkk.zzd(r0)
            r0.zzT(r4)
            com.google.android.gms.internal.ads.zzdkk r4 = r3.zzb
            com.google.android.gms.internal.ads.zzdkp r0 = com.google.android.gms.internal.ads.zzdkk.zzd(r4)
            com.google.android.gms.internal.ads.zzcas r0 = r0.zzp()
            java.lang.String r1 = r3.zza
            r2 = 1
            com.google.android.gms.internal.ads.zzegf r4 = r4.zzf(r1, r2)
            if (r4 == 0) goto L25
            if (r0 != 0) goto L21
            goto L25
        L21:
            r0.zzc(r4)
            return
        L25:
            if (r0 == 0) goto L2b
            r4 = 0
            r0.cancel(r4)
        L2b:
            return
    }
}
