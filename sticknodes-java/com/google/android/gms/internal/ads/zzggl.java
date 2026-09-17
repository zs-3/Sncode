package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzggl extends com.google.android.gms.internal.ads.zzgfe {
    private com.google.common.util.concurrent.ListenableFuture zza;
    private java.util.concurrent.ScheduledFuture zzb;

    private zzggl(com.google.common.util.concurrent.ListenableFuture r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzggl r0) {
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza
            return r0
    }

    static com.google.common.util.concurrent.ListenableFuture zzf(com.google.common.util.concurrent.ListenableFuture r2, long r3, java.util.concurrent.TimeUnit r5, java.util.concurrent.ScheduledExecutorService r6) {
            com.google.android.gms.internal.ads.zzggl r0 = new com.google.android.gms.internal.ads.zzggl
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzggi r1 = new com.google.android.gms.internal.ads.zzggi
            r1.<init>(r0)
            java.util.concurrent.ScheduledFuture r3 = r6.schedule(r1, r3, r5)
            r0.zzb = r3
            com.google.android.gms.internal.ads.zzgfc r3 = com.google.android.gms.internal.ads.zzgfc.zza
            r2.addListener(r1, r3)
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture zzv(com.google.android.gms.internal.ads.zzggl r0) {
            java.util.concurrent.ScheduledFuture r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ void zzw(com.google.android.gms.internal.ads.zzggl r0, java.util.concurrent.ScheduledFuture r1) {
            r1 = 0
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    protected final java.lang.String zza() {
            r6 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r6.zza
            java.util.concurrent.ScheduledFuture r1 = r6.zzb
            if (r0 == 0) goto L48
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "inputFuture=["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            if (r1 == 0) goto L47
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r1.getDelay(r2)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ", remaining delay=["
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " ms]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L47:
            return r0
        L48:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    protected final void zzb() {
            r2 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r2.zza
            r2.zzr(r0)
            java.util.concurrent.ScheduledFuture r0 = r2.zzb
            if (r0 == 0) goto Ld
            r1 = 0
            r0.cancel(r1)
        Ld:
            r0 = 0
            r2.zza = r0
            r2.zzb = r0
            return
    }
}
