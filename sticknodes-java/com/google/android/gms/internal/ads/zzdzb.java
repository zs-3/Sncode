package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdzb {
    private final java.util.concurrent.ScheduledExecutorService zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;
    private final com.google.android.gms.internal.ads.zzgfz zzc;
    private final com.google.android.gms.internal.ads.zzdzt zzd;
    private final com.google.android.gms.internal.ads.zzhic zze;

    public zzdzb(java.util.concurrent.ScheduledExecutorService r1, com.google.android.gms.internal.ads.zzgfz r2, com.google.android.gms.internal.ads.zzgfz r3, com.google.android.gms.internal.ads.zzdzt r4, com.google.android.gms.internal.ads.zzhic r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeah zza(com.google.android.gms.internal.ads.zzbwa r4) throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzdzt r0 = r3.zzd
            com.google.common.util.concurrent.ListenableFuture r4 = r0.zza(r4)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfq
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Object r4 = r4.get(r0, r2)
            com.google.android.gms.internal.ads.zzeah r4 = (com.google.android.gms.internal.ads.zzeah) r4
            return r4
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbwa r3, int r4, java.lang.Throwable r5) throws java.lang.Exception {
            r2 = this;
            if (r3 == 0) goto Lc
            android.os.Bundle r5 = r3.zzm
            if (r5 == 0) goto Lc
            r0 = 1
            java.lang.String r1 = "ls"
            r5.putBoolean(r1, r0)
        Lc:
            com.google.android.gms.internal.ads.zzhic r5 = r2.zze
            java.lang.Object r5 = r5.zzb()
            com.google.android.gms.internal.ads.zzecp r5 = (com.google.android.gms.internal.ads.zzecp) r5
            com.google.common.util.concurrent.ListenableFuture r4 = r5.zzd(r3, r4)
            com.google.android.gms.internal.ads.zzdyy r5 = new com.google.android.gms.internal.ads.zzdyy
            r5.<init>(r3)
            com.google.android.gms.internal.ads.zzgfz r3 = r2.zzb
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r4, r5, r3)
            return r3
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzbwa r7) {
            r6 = this;
            java.lang.String r0 = r7.zzd
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzC(r0)
            if (r0 == 0) goto L16
            com.google.android.gms.internal.ads.zzeag r0 = new com.google.android.gms.internal.ads.zzeag
            r1 = 1
            r0.<init>(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzg(r0)
            goto L3a
        L16:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzhg
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            com.google.android.gms.internal.ads.zzgfz r0 = r6.zzc
            com.google.android.gms.internal.ads.zzdyz r1 = new com.google.android.gms.internal.ads.zzdyz
            r1.<init>(r6, r7)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb(r1)
            goto L3a
        L34:
            com.google.android.gms.internal.ads.zzdzt r0 = r6.zzd
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza(r7)
        L3a:
            int r1 = android.os.Binder.getCallingUid()
            com.google.android.gms.internal.ads.zzgff r0 = com.google.android.gms.internal.ads.zzgff.zzu(r0)
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzfq
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            java.util.concurrent.ScheduledExecutorService r4 = r6.zza
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzo(r0, r2, r5, r4)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            com.google.android.gms.internal.ads.zzdza r2 = new com.google.android.gms.internal.ads.zzdza
            r2.<init>(r6, r7, r1)
            com.google.android.gms.internal.ads.zzgfz r7 = r6.zzb
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r7 = com.google.android.gms.internal.ads.zzgfo.zzf(r0, r1, r2, r7)
            com.google.android.gms.internal.ads.zzgff r7 = (com.google.android.gms.internal.ads.zzgff) r7
            return r7
    }
}
