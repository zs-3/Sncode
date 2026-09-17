package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzevw implements com.google.android.gms.internal.ads.zzexh {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final com.google.android.gms.internal.ads.zzfhc zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;

    zzevw(android.content.Context r1, com.google.android.gms.internal.ads.zzgfz r2, com.google.android.gms.internal.ads.zzfhc r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 53
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzevv r0 = new com.google.android.gms.internal.ads.zzevv
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzevx zzc() throws java.lang.Exception {
            r8 = this;
            android.content.Context r0 = r8.zza     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzfhc r1 = r8.zzc     // Catch: java.io.IOException -> L122
            boolean r7 = r1.zzb()     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzfur r1 = new com.google.android.gms.internal.ads.zzfur     // Catch: java.io.IOException -> L122
            r1.<init>()     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzfur r2 = new com.google.android.gms.internal.ads.zzfur     // Catch: java.io.IOException -> L122
            r2.<init>()     // Catch: java.io.IOException -> L122
            r3 = 1
            if (r7 == 0) goto L2e
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzcZ     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L122
            java.lang.Object r4 = r5.zza(r4)     // Catch: java.io.IOException -> L122
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> L122
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> L122
            if (r4 != 0) goto L2e
            com.google.android.gms.internal.ads.zzevx r0 = new com.google.android.gms.internal.ads.zzevx     // Catch: java.io.IOException -> L122
            r0.<init>(r3)     // Catch: java.io.IOException -> L122
            goto L121
        L2e:
            if (r7 != 0) goto L42
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzcV     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L122
            java.lang.Object r4 = r5.zza(r4)     // Catch: java.io.IOException -> L122
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> L122
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> L122
            if (r4 != 0) goto L56
        L42:
            if (r7 == 0) goto L7a
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzcX     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L122
            java.lang.Object r4 = r5.zza(r4)     // Catch: java.io.IOException -> L122
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> L122
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> L122
            if (r4 == 0) goto L7a
        L56:
            com.google.android.gms.internal.ads.zzfuu r1 = com.google.android.gms.internal.ads.zzfuu.zzj(r0)     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzdi     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L122
            java.lang.Object r4 = r5.zza(r4)     // Catch: java.io.IOException -> L122
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.io.IOException -> L122
            long r4 = r4.longValue()     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzcad r6 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.io.IOException -> L122
            com.google.android.gms.ads.internal.util.zzg r6 = r6.zzi()     // Catch: java.io.IOException -> L122
            boolean r6 = r6.zzS()     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzfur r1 = r1.zzh(r4, r6)     // Catch: java.io.IOException -> L122
        L7a:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzdf     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L122
            java.lang.Object r4 = r5.zza(r4)     // Catch: java.io.IOException -> L122
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> L122
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> L122
            if (r4 == 0) goto La9
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r8.zzd     // Catch: java.io.IOException -> L122
            int r4 = r4.clientJarVersion     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzde     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L122
            java.lang.Object r5 = r6.zza(r5)     // Catch: java.io.IOException -> L122
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.io.IOException -> L122
            int r5 = r5.intValue()     // Catch: java.io.IOException -> L122
            if (r4 >= r5) goto La9
            com.google.android.gms.internal.ads.zzfuv r4 = com.google.android.gms.internal.ads.zzfuv.zzi(r0)     // Catch: java.io.IOException -> L122
            r4.zzj()     // Catch: java.io.IOException -> L122
        La9:
            if (r7 != 0) goto Lbd
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzcW     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L122
            java.lang.Object r4 = r5.zza(r4)     // Catch: java.io.IOException -> L122
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> L122
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> L122
            if (r4 != 0) goto Ld1
        Lbd:
            if (r7 == 0) goto L117
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzcY     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L122
            java.lang.Object r4 = r5.zza(r4)     // Catch: java.io.IOException -> L122
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.io.IOException -> L122
            boolean r4 = r4.booleanValue()     // Catch: java.io.IOException -> L122
            if (r4 == 0) goto L117
        Ld1:
            com.google.android.gms.internal.ads.zzfuv r0 = com.google.android.gms.internal.ads.zzfuv.zzi(r0)     // Catch: java.io.IOException -> L122
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r8.zzd     // Catch: java.io.IOException -> L122
            int r4 = r4.clientJarVersion     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzde     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L122
            java.lang.Object r5 = r6.zza(r5)     // Catch: java.io.IOException -> L122
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.io.IOException -> L122
            int r5 = r5.intValue()     // Catch: java.io.IOException -> L122
            if (r4 < r5) goto L10f
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzdj     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.io.IOException -> L122
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.io.IOException -> L122
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.io.IOException -> L122
            long r2 = r2.longValue()     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzcad r4 = com.google.android.gms.ads.internal.zzu.zzo()     // Catch: java.io.IOException -> L122
            com.google.android.gms.ads.internal.util.zzg r4 = r4.zzi()     // Catch: java.io.IOException -> L122
            boolean r4 = r4.zzS()     // Catch: java.io.IOException -> L122
            com.google.android.gms.internal.ads.zzfur r2 = r0.zzh(r2, r4)     // Catch: java.io.IOException -> L122
            boolean r3 = r0.zzo()     // Catch: java.io.IOException -> L122
        L10f:
            boolean r0 = r0.zzp()     // Catch: java.io.IOException -> L122
            r6 = r0
            r4 = r2
            r5 = r3
            goto L11a
        L117:
            r4 = r2
            r5 = 1
            r6 = 1
        L11a:
            com.google.android.gms.internal.ads.zzevx r0 = new com.google.android.gms.internal.ads.zzevx     // Catch: java.io.IOException -> L122
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L122
        L121:
            return r0
        L122:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "PerAppIdSignal"
            r1.zzw(r0, r2)
            com.google.android.gms.internal.ads.zzfhc r0 = r8.zzc
            com.google.android.gms.internal.ads.zzevx r1 = new com.google.android.gms.internal.ads.zzevx
            boolean r0 = r0.zzb()
            r1.<init>(r0)
            return r1
    }
}
