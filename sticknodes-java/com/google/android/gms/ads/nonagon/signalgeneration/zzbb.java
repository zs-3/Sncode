package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbb implements com.google.android.gms.internal.ads.zzgev {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzdzb zzb;

    public zzbb(java.util.concurrent.Executor r1, com.google.android.gms.internal.ads.zzdzb r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgev
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object r3) throws java.lang.Exception {
            r2 = this;
            com.google.android.gms.internal.ads.zzdzb r0 = r2.zzb
            com.google.android.gms.internal.ads.zzbwa r3 = (com.google.android.gms.internal.ads.zzbwa) r3
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzc(r3)
            com.google.android.gms.ads.nonagon.signalgeneration.zzba r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzba
            r1.<init>(r3)
            java.util.concurrent.Executor r3 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r0, r1, r3)
            return r3
    }
}
