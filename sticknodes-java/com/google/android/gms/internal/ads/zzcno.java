package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcno implements com.google.android.gms.internal.ads.zzcnf {
    private final com.google.android.gms.internal.ads.zzegi zza;

    zzcno(com.google.android.gms.internal.ads.zzegi r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(java.util.Map r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzjZ
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L13
            return
        L13:
            com.google.android.gms.internal.ads.zzegi r4 = r3.zza
            r0 = 1
            com.google.common.util.concurrent.ListenableFuture r4 = r4.zza(r0)
            com.google.android.gms.internal.ads.zzgff r4 = com.google.android.gms.internal.ads.zzgff.zzu(r4)
            com.google.android.gms.internal.ads.zzcnn r0 = new com.google.android.gms.internal.ads.zzcnn
            r0.<init>()
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zza
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzf(r4, r2, r0, r1)
            com.google.android.gms.internal.ads.zzgff r4 = (com.google.android.gms.internal.ads.zzgff) r4
            return
    }
}
