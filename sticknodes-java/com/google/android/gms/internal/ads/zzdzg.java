package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdzg implements com.google.android.gms.internal.ads.zzeaf {
    private static final java.util.regex.Pattern zza = null;
    private final com.google.android.gms.internal.ads.zzdyj zzb;
    private final com.google.android.gms.internal.ads.zzgfz zzc;
    private final com.google.android.gms.internal.ads.zzfhc zzd;
    private final java.util.concurrent.ScheduledExecutorService zze;
    private final com.google.android.gms.internal.ads.zzedu zzf;
    private final com.google.android.gms.internal.ads.zzfma zzg;
    private final android.content.Context zzh;

    static {
            java.lang.String r0 = "Received error HTTP response code: (.*)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzdzg.zza = r0
            return
    }

    zzdzg(android.content.Context r1, com.google.android.gms.internal.ads.zzfhc r2, com.google.android.gms.internal.ads.zzdyj r3, com.google.android.gms.internal.ads.zzgfz r4, java.util.concurrent.ScheduledExecutorService r5, com.google.android.gms.internal.ads.zzedu r6, com.google.android.gms.internal.ads.zzfma r7) {
            r0 = this;
            r0.<init>()
            r0.zzh = r1
            r0.zzd = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzedu zza(com.google.android.gms.internal.ads.zzdzg r0) {
            com.google.android.gms.internal.ads.zzedu r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.regex.Pattern zzd() {
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzdzg.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzeaf
    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbwa r6) {
            r5 = this;
            android.content.Context r0 = r5.zzh
            com.google.android.gms.internal.ads.zzdyj r1 = r5.zzb
            com.google.common.util.concurrent.ListenableFuture r6 = r1.zzc(r6)
            r1 = 11
            com.google.android.gms.internal.ads.zzflp r0 = com.google.android.gms.internal.ads.zzflo.zza(r0, r1)
            com.google.android.gms.internal.ads.zzflz.zzd(r6, r0)
            com.google.android.gms.internal.ads.zzdzd r1 = new com.google.android.gms.internal.ads.zzdzd
            r1.<init>(r5)
            com.google.android.gms.internal.ads.zzgfz r2 = r5.zzc
            com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzgfo.zzn(r6, r1, r2)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzfp
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L54
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzfq
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.zze
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzgfo.zzo(r6, r1, r4, r3)
            com.google.android.gms.internal.ads.zzdze r1 = new com.google.android.gms.internal.ads.zzdze
            r1.<init>()
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            java.lang.Class<java.util.concurrent.TimeoutException> r3 = java.util.concurrent.TimeoutException.class
            com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzgfo.zzf(r6, r3, r1, r2)
        L54:
            com.google.android.gms.internal.ads.zzfma r1 = r5.zzg
            com.google.android.gms.internal.ads.zzflz.zza(r6, r1, r0)
            com.google.android.gms.internal.ads.zzdzf r0 = new com.google.android.gms.internal.ads.zzdzf
            r0.<init>(r5)
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzgfo.zzr(r6, r0, r1)
            return r6
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzeah r5) throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.internal.ads.zzfgt r0 = new com.google.android.gms.internal.ads.zzfgt
            com.google.android.gms.internal.ads.zzfgq r1 = new com.google.android.gms.internal.ads.zzfgq
            com.google.android.gms.internal.ads.zzfhc r2 = r4.zzd
            r1.<init>(r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.InputStream r3 = r5.zzb()
            r2.<init>(r3)
            com.google.android.gms.internal.ads.zzbwa r5 = r5.zza()
            com.google.android.gms.internal.ads.zzfgs r5 = com.google.android.gms.internal.ads.zzfgs.zza(r2, r5)
            r0.<init>(r1, r5)
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r5
    }
}
