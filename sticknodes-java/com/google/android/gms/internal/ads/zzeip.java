package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeip implements com.google.android.gms.internal.ads.zzdik {
    private final com.google.android.gms.internal.ads.zzfgh zza;
    private final com.google.android.gms.internal.ads.zzbrk zzb;
    private final com.google.android.gms.ads.AdFormat zzc;
    private com.google.android.gms.internal.ads.zzcys zzd;

    zzeip(com.google.android.gms.internal.ads.zzfgh r2, com.google.android.gms.internal.ads.zzbrk r3, com.google.android.gms.ads.AdFormat r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzd = r0
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zza(boolean r2, android.content.Context r3, com.google.android.gms.internal.ads.zzcyn r4) throws com.google.android.gms.internal.ads.zzdij {
            r1 = this;
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.BANNER     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.ads.AdFormat r2 = r1.zzc     // Catch: java.lang.Throwable -> L5e
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L5e
            r4 = 1
            r0 = 2
            if (r2 == r4) goto L27
            if (r2 == r0) goto L1c
            r4 = 5
            if (r2 != r4) goto L56
            com.google.android.gms.internal.ads.zzbrk r2 = r1.zzb     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: java.lang.Throwable -> L5e
            boolean r2 = r2.zzr(r3)     // Catch: java.lang.Throwable -> L5e
            goto L31
        L1c:
            com.google.android.gms.internal.ads.zzbrk r2 = r1.zzb     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: java.lang.Throwable -> L5e
            boolean r2 = r2.zzt(r3)     // Catch: java.lang.Throwable -> L5e
            goto L31
        L27:
            com.google.android.gms.internal.ads.zzbrk r2 = r1.zzb     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: java.lang.Throwable -> L5e
            boolean r2 = r2.zzs(r3)     // Catch: java.lang.Throwable -> L5e
        L31:
            if (r2 == 0) goto L56
            com.google.android.gms.internal.ads.zzcys r2 = r1.zzd
            if (r2 != 0) goto L38
            goto L55
        L38:
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzbz
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L55
            com.google.android.gms.internal.ads.zzfgh r2 = r1.zza
            int r2 = r2.zzY
            if (r2 != r0) goto L55
            com.google.android.gms.internal.ads.zzcys r2 = r1.zzd
            r2.zza()
        L55:
            return
        L56:
            com.google.android.gms.internal.ads.zzdij r2 = new com.google.android.gms.internal.ads.zzdij
            java.lang.String r3 = "Adapter failed to show."
            r2.<init>(r3)
            throw r2
        L5e:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzdij r3 = new com.google.android.gms.internal.ads.zzdij
            r3.<init>(r2)
            throw r3
    }

    public final void zzb(com.google.android.gms.internal.ads.zzcys r1) {
            r0 = this;
            r0.zzd = r1
            return
    }
}
