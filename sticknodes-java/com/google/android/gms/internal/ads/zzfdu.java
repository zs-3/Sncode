package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfdu {
    private final com.google.android.gms.internal.ads.zzfiq zza;
    private final com.google.android.gms.internal.ads.zzcxh zzb;
    private final java.util.concurrent.Executor zzc;
    private com.google.android.gms.internal.ads.zzfdt zzd;

    public zzfdu(com.google.android.gms.internal.ads.zzfiq r1, com.google.android.gms.internal.ads.zzcxh r2, java.util.concurrent.Executor r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfdt zza(com.google.android.gms.internal.ads.zzfdu r0) {
            com.google.android.gms.internal.ads.zzfdt r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfja zzb(com.google.android.gms.internal.ads.zzfdu r0) {
            com.google.android.gms.internal.ads.zzfja r0 = r0.zze()
            return r0
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzfdu r0, com.google.android.gms.internal.ads.zzfdt r1) {
            r0.zzd = r1
            return
    }

    @java.lang.Deprecated
    private final com.google.android.gms.internal.ads.zzfja zze() {
            r4 = this;
            com.google.android.gms.internal.ads.zzcxh r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfhc r0 = r0.zzg()
            com.google.android.gms.ads.internal.client.zzm r1 = r0.zzd
            java.lang.String r2 = r0.zzf
            com.google.android.gms.ads.internal.client.zzy r0 = r0.zzj
            com.google.android.gms.internal.ads.zzfiq r3 = r4.zza
            com.google.android.gms.internal.ads.zzfja r0 = r3.zzc(r1, r2, r0)
            return r0
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc() {
            r4 = this;
            com.google.android.gms.internal.ads.zzfdt r0 = r4.zzd
            if (r0 != 0) goto L5f
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbey.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L23
            com.google.android.gms.internal.ads.zzfdt r0 = new com.google.android.gms.internal.ads.zzfdt
            com.google.android.gms.internal.ads.zzfja r1 = r4.zze()
            r2 = 0
            r0.<init>(r2, r1, r2)
            r4.zzd = r0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            goto L53
        L23:
            com.google.android.gms.internal.ads.zzcxh r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfiq r1 = r4.zza
            com.google.android.gms.internal.ads.zzcum r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzfix r1 = r1.zza()
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zze(r1)
            com.google.android.gms.internal.ads.zzgff r0 = com.google.android.gms.internal.ads.zzgff.zzu(r0)
            com.google.android.gms.internal.ads.zzfdr r1 = new com.google.android.gms.internal.ads.zzfdr
            r1.<init>(r4)
            java.util.concurrent.Executor r2 = r4.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
            com.google.android.gms.internal.ads.zzfdq r1 = new com.google.android.gms.internal.ads.zzfdq
            r1.<init>(r4)
            java.util.concurrent.Executor r2 = r4.zzc
            java.lang.Class<com.google.android.gms.internal.ads.zzeag> r3 = com.google.android.gms.internal.ads.zzeag.class
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zze(r0, r3, r1, r2)
            com.google.android.gms.internal.ads.zzgff r0 = (com.google.android.gms.internal.ads.zzgff) r0
        L53:
            com.google.android.gms.internal.ads.zzfdp r1 = new com.google.android.gms.internal.ads.zzfdp
            r1.<init>()
            java.util.concurrent.Executor r2 = r4.zzc
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            return r0
        L5f:
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
    }
}
