package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeeg implements com.google.android.gms.internal.ads.zzflh {
    private final com.google.android.gms.internal.ads.zzedu zza;
    private final com.google.android.gms.internal.ads.zzedy zzb;

    zzeeg(com.google.android.gms.internal.ads.zzedu r1, com.google.android.gms.internal.ads.zzedy r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzd(com.google.android.gms.internal.ads.zzfla r5, java.lang.String r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzfX
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L36
            com.google.android.gms.internal.ads.zzfla r6 = com.google.android.gms.internal.ads.zzfla.zzd
            if (r6 != r5) goto L36
            com.google.android.gms.internal.ads.zzedu r5 = r4.zza
            long r5 = r5.zzc()
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L36
            com.google.android.gms.internal.ads.zzedu r5 = r4.zza
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r6.elapsedRealtime()
            com.google.android.gms.internal.ads.zzedu r6 = r4.zza
            long r2 = r6.zzc()
            long r0 = r0 - r2
            r5.zzf(r0)
        L36:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdC(com.google.android.gms.internal.ads.zzfla r1, java.lang.String r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdD(com.google.android.gms.internal.ads.zzfla r3, java.lang.String r4, java.lang.Throwable r5) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzfX
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L36
            com.google.android.gms.internal.ads.zzfla r4 = com.google.android.gms.internal.ads.zzfla.zzd
            if (r4 != r3) goto L36
            com.google.android.gms.internal.ads.zzedu r3 = r2.zza
            long r3 = r3.zzc()
            r0 = 0
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L36
            com.google.android.gms.internal.ads.zzedu r3 = r2.zza
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r4.elapsedRealtime()
            com.google.android.gms.internal.ads.zzedu r0 = r2.zza
            long r0 = r0.zzc()
            long r4 = r4 - r0
            r3.zzf(r4)
        L36:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdE(com.google.android.gms.internal.ads.zzfla r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzfX
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L13
            goto L2e
        L13:
            com.google.android.gms.internal.ads.zzfla r4 = com.google.android.gms.internal.ads.zzfla.zzd
            if (r4 != r3) goto L25
            com.google.android.gms.internal.ads.zzedu r3 = r2.zza
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r4.elapsedRealtime()
            r3.zzg(r0)
            return
        L25:
            com.google.android.gms.internal.ads.zzfla r4 = com.google.android.gms.internal.ads.zzfla.zzA
            if (r4 == r3) goto L2f
            com.google.android.gms.internal.ads.zzfla r4 = com.google.android.gms.internal.ads.zzfla.zzc
            if (r4 != r3) goto L2e
            goto L2f
        L2e:
            return
        L2f:
            com.google.android.gms.internal.ads.zzedu r3 = r2.zza
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r4.elapsedRealtime()
            r3.zzh(r0)
            com.google.android.gms.internal.ads.zzedy r3 = r2.zzb
            com.google.android.gms.internal.ads.zzedu r4 = r2.zza
            long r0 = r4.zzd()
            com.google.android.gms.internal.ads.zzedx r4 = new com.google.android.gms.internal.ads.zzedx
            r4.<init>(r3, r0)
            com.google.android.gms.internal.ads.zzedq r3 = r3.zza
            r3.zza(r4)
            return
    }
}
