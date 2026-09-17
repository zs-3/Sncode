package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfhm implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfo zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcop zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfng zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzeey zzd;

    zzfhm(com.google.android.gms.internal.ads.zzcfo r1, com.google.android.gms.internal.ads.zzcop r2, com.google.android.gms.internal.ads.zzfng r3, com.google.android.gms.internal.ads.zzeey r4) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r8) {
            r7 = this;
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.internal.ads.zzcfo r8 = r7.zza
            com.google.android.gms.internal.ads.zzfgh r8 = r8.zzD()
            boolean r8 = r8.zzai
            if (r8 != 0) goto L3c
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzjG
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r0.zza(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L35
            com.google.android.gms.internal.ads.zzcop r8 = r7.zzb
            if (r8 == 0) goto L35
            boolean r8 = com.google.android.gms.internal.ads.zzcop.zzj(r4)
            if (r8 == 0) goto L35
            com.google.android.gms.internal.ads.zzcop r8 = r7.zzb
            com.google.android.gms.internal.ads.zzfng r0 = r7.zzc
            java.util.Random r1 = com.google.android.gms.ads.internal.client.zzbc.zze()
            r8.zzi(r4, r0, r1)
            return
        L35:
            com.google.android.gms.internal.ads.zzfng r8 = r7.zzc
            r0 = 0
            r8.zzc(r4, r0)
            return
        L3c:
            com.google.android.gms.internal.ads.zzefa r8 = new com.google.android.gms.internal.ads.zzefa
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r1 = r0.currentTimeMillis()
            com.google.android.gms.internal.ads.zzcfo r0 = r7.zza
            com.google.android.gms.internal.ads.zzfgk r0 = r0.zzR()
            java.lang.String r3 = r0.zzb
            com.google.android.gms.internal.ads.zzcfo r0 = r7.zza
            com.google.android.gms.internal.ads.zzcad r5 = com.google.android.gms.ads.internal.zzu.zzo()
            android.content.Context r0 = r0.getContext()
            boolean r0 = r5.zzA(r0)
            r5 = 2
            if (r0 != 0) goto L88
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfZ
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r6.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7b
            com.google.android.gms.internal.ads.zzcfo r0 = r7.zza
            com.google.android.gms.internal.ads.zzfgh r0 = r0.zzD()
            boolean r0 = r0.zzS
            if (r0 != 0) goto L88
        L7b:
            com.google.android.gms.internal.ads.zzcfo r0 = r7.zza
            com.google.android.gms.internal.ads.zzfgh r0 = r0.zzD()
            com.google.android.gms.internal.ads.zzbts r0 = r0.zzad
            if (r0 == 0) goto L86
            goto L88
        L86:
            r0 = 1
            r5 = 1
        L88:
            r0 = r8
            r0.<init>(r1, r3, r4, r5)
            com.google.android.gms.internal.ads.zzeey r0 = r7.zzd
            r0.zzd(r8)
            return
    }
}
