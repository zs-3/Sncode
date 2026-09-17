package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdkj implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ android.view.View zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdkk zzb;

    zzdkj(com.google.android.gms.internal.ads.zzdkk r1, android.view.View r2) {
            r0 = this;
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
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdkk r0 = r2.zzb
            android.view.View r1 = r2.zza
            com.google.android.gms.internal.ads.zzegf r3 = (com.google.android.gms.internal.ads.zzegf) r3
            com.google.android.gms.internal.ads.zzdkk.zzt(r0, r1, r3)
            return
    }
}
