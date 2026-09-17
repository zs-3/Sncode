package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeyh implements com.google.android.gms.internal.ads.zzexh {
    private final android.content.Context zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final java.util.concurrent.Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final com.google.android.gms.internal.ads.zzbzu zzg;

    zzeyh(com.google.android.gms.internal.ads.zzbzu r1, android.content.Context r2, java.util.concurrent.ScheduledExecutorService r3, java.util.concurrent.Executor r4, int r5, boolean r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.zzg = r1
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r7
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 40
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r5 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaY
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L57
            com.google.android.gms.internal.ads.zzbzu r0 = r5.zzg
            android.content.Context r1 = r5.zza
            int r2 = r5.zzd
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza(r1, r2)
            com.google.android.gms.internal.ads.zzgff r0 = com.google.android.gms.internal.ads.zzgff.zzu(r0)
            com.google.android.gms.internal.ads.zzeyf r1 = new com.google.android.gms.internal.ads.zzeyf
            r1.<init>(r5)
            java.util.concurrent.Executor r2 = r5.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzaZ
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.ScheduledExecutorService r3 = r5.zzb
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r1, r4, r3)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            com.google.android.gms.internal.ads.zzeyg r1 = new com.google.android.gms.internal.ads.zzeyg
            r1.<init>(r5)
            java.util.concurrent.Executor r2 = r5.zzc
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zze(r0, r3, r1, r2)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            return r0
        L57:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Did not ad Ad ID into query param."
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeyi zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
            r7 = this;
            com.google.android.gms.internal.ads.zzfur r0 = new com.google.android.gms.internal.ads.zzfur
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzdc
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.zze
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzdd
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzfuu r1 = com.google.android.gms.internal.ads.zzfuu.zzj(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzdi     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.zza(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zzfur r0 = r1.zzi(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r2 = "AdIdInfoSignalSource.getPaidV1"
            r1.zzw(r0, r2)
            com.google.android.gms.internal.ads.zzfur r0 = new com.google.android.gms.internal.ads.zzfur
            r0.<init>()
        L6f:
            com.google.android.gms.internal.ads.zzeyi r1 = new com.google.android.gms.internal.ads.zzeyi
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeyi zzd(java.lang.Throwable r4) {
            r3 = this;
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            android.content.Context r4 = r3.zza
            android.content.ContentResolver r4 = r4.getContentResolver()
            r0 = 0
            if (r4 != 0) goto Le
            r4 = r0
            goto L14
        Le:
            java.lang.String r1 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r1)
        L14:
            com.google.android.gms.internal.ads.zzeyi r1 = new com.google.android.gms.internal.ads.zzeyi
            com.google.android.gms.internal.ads.zzfur r2 = new com.google.android.gms.internal.ads.zzfur
            r2.<init>()
            r1.<init>(r0, r4, r2)
            return r1
    }
}
