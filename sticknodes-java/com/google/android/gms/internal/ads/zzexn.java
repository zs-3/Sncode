package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzexn implements com.google.android.gms.internal.ads.zzexh {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;

    zzexn(android.content.Context r1, com.google.android.gms.internal.ads.zzgfz r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 59
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbej.zzb
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzgfz r0 = r2.zzb
            com.google.android.gms.internal.ads.zzexm r1 = new com.google.android.gms.internal.ads.zzexm
            r1.<init>(r2)
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb(r1)
            return r0
        L1a:
            r0 = 0
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzexo zzc() throws java.lang.Exception {
            r3 = this;
            android.content.Context r0 = r3.zza
            com.google.android.gms.internal.ads.zzexo r1 = new com.google.android.gms.internal.ads.zzexo
            int r2 = com.google.android.gms.internal.ads.zzbcf.zzb(r0)
            int r0 = com.google.android.gms.internal.ads.zzbcf.zza(r0)
            r1.<init>(r2, r0)
            return r1
    }
}
