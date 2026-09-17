package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfdk implements com.google.android.gms.internal.ads.zzfdy {
    private final com.google.android.gms.internal.ads.zzfiq zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzgfk zzc;

    public zzfdk(com.google.android.gms.internal.ads.zzfiq r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzfdi r0 = new com.google.android.gms.internal.ads.zzfdi
            r0.<init>(r1)
            r1.zzc = r0
            r1.zza = r2
            r1.zzb = r3
            return
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcxh r5, com.google.android.gms.internal.ads.zzfdt r6) throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.internal.ads.zzfiq r0 = r4.zza
            com.google.android.gms.internal.ads.zzfja r1 = r6.zzb
            com.google.android.gms.internal.ads.zzbwa r6 = r6.zza
            com.google.android.gms.internal.ads.zzfiz r0 = r0.zzb(r1)
            if (r0 == 0) goto L1d
            if (r6 == 0) goto L1d
            com.google.android.gms.internal.ads.zzcum r5 = r5.zzb()
            com.google.common.util.concurrent.ListenableFuture r5 = r5.zzh(r6)
            com.google.android.gms.internal.ads.zzgfk r2 = r4.zzc
            java.util.concurrent.Executor r3 = r4.zzb
            com.google.android.gms.internal.ads.zzgfo.zzr(r5, r2, r3)
        L1d:
            com.google.android.gms.internal.ads.zzfdj r5 = new com.google.android.gms.internal.ads.zzfdj
            r5.<init>(r1, r6, r0)
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzh(r5)
            return r5
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfdz r2, com.google.android.gms.internal.ads.zzfdx r3, com.google.android.gms.internal.ads.zzcxh r4) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfdu r2 = new com.google.android.gms.internal.ads.zzfdu
            com.google.android.gms.internal.ads.zzfiq r3 = r1.zza
            java.util.concurrent.Executor r0 = r1.zzb
            r2.<init>(r3, r4, r0)
            com.google.common.util.concurrent.ListenableFuture r2 = r2.zzc()
            com.google.android.gms.internal.ads.zzgff r2 = com.google.android.gms.internal.ads.zzgff.zzu(r2)
            com.google.android.gms.internal.ads.zzfdg r3 = new com.google.android.gms.internal.ads.zzfdg
            r3.<init>(r1, r4)
            java.util.concurrent.Executor r4 = r1.zzb
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzn(r2, r3, r4)
            com.google.android.gms.internal.ads.zzgff r2 = (com.google.android.gms.internal.ads.zzgff) r2
            com.google.android.gms.internal.ads.zzfdh r3 = new com.google.android.gms.internal.ads.zzfdh
            r3.<init>(r1)
            java.util.concurrent.Executor r4 = r1.zzb
            java.lang.Class<java.lang.Exception> r0 = java.lang.Exception.class
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zze(r2, r0, r3, r4)
            com.google.android.gms.internal.ads.zzgff r2 = (com.google.android.gms.internal.ads.zzgff) r2
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfdz r1, com.google.android.gms.internal.ads.zzfdx r2, java.lang.Object r3) {
            r0 = this;
            r3 = 0
            com.google.common.util.concurrent.ListenableFuture r1 = r0.zzb(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfdy
    public final /* bridge */ /* synthetic */ java.lang.Object zzd() {
            r1 = this;
            r0 = 0
            return r0
    }
}
