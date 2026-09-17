package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfdc implements com.google.android.gms.internal.ads.zzfjk {
    private final com.google.android.gms.internal.ads.zzfdy zza;

    public zzfdc(com.google.android.gms.internal.ads.zzfdy r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfjk
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfjl r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfdd r4 = (com.google.android.gms.internal.ads.zzfdd) r4
            com.google.android.gms.internal.ads.zzfdz r0 = r4.zzb
            com.google.android.gms.internal.ads.zzfdx r4 = r4.zza
            com.google.android.gms.internal.ads.zzfdy r1 = r3.zza
            com.google.android.gms.internal.ads.zzfcz r1 = (com.google.android.gms.internal.ads.zzfcz) r1
            r2 = 0
            com.google.common.util.concurrent.ListenableFuture r4 = r1.zzb(r0, r4, r2)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzfjk
    public final void zzb(com.google.android.gms.internal.ads.zzfiz r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfdy r0 = r1.zza
            com.google.android.gms.internal.ads.zzfcz r0 = (com.google.android.gms.internal.ads.zzfcz) r0
            com.google.android.gms.internal.ads.zzcxh r0 = r0.zza()
            r2.zza = r0
            return
    }
}
