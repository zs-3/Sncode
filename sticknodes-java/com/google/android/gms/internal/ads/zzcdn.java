package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcdn extends com.google.android.gms.ads.internal.util.zzb {
    final com.google.android.gms.internal.ads.zzccj zza;
    final com.google.android.gms.internal.ads.zzcdv zzb;
    private final java.lang.String zzc;
    private final java.lang.String[] zzd;

    zzcdn(com.google.android.gms.internal.ads.zzccj r1, com.google.android.gms.internal.ads.zzcdv r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            com.google.android.gms.internal.ads.zzcdo r1 = com.google.android.gms.ads.internal.zzu.zzy()
            r1.zzb(r0)
            return
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzcdv r0 = r3.zzb     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r3.zzc     // Catch: java.lang.Throwable -> L14
            java.lang.String[] r2 = r3.zzd     // Catch: java.lang.Throwable -> L14
            r0.zzu(r1, r2)     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcdm r1 = new com.google.android.gms.internal.ads.zzcdm
            r1.<init>(r3)
            r0.post(r1)
            return
        L14:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzfun r1 = com.google.android.gms.ads.internal.util.zzt.zza
            com.google.android.gms.internal.ads.zzcdm r2 = new com.google.android.gms.internal.ads.zzcdm
            r2.<init>(r3)
            r1.post(r2)
            throw r0
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbZ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzcdv r0 = r2.zzb
            boolean r0 = r0 instanceof com.google.android.gms.internal.ads.zzcee
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zze
            com.google.android.gms.internal.ads.zzcdl r1 = new com.google.android.gms.internal.ads.zzcdl
            r1.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb(r1)
            return r0
        L24:
            com.google.common.util.concurrent.ListenableFuture r0 = super.zzb()
            return r0
    }

    final /* synthetic */ java.lang.Boolean zzd() throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzcdv r0 = r3.zzb
            java.lang.String r1 = r3.zzc
            java.lang.String[] r2 = r3.zzd
            boolean r0 = r0.zzw(r1, r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }
}
