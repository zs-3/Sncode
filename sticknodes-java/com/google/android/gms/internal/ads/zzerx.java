package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzerx implements com.google.android.gms.internal.ads.zzexh {
    private final java.util.concurrent.atomic.AtomicReference zza;
    private final com.google.android.gms.common.util.Clock zzb;
    private final com.google.android.gms.internal.ads.zzexh zzc;
    private final long zzd;

    public zzerx(com.google.android.gms.internal.ads.zzexh r2, long r3, com.google.android.gms.common.util.Clock r5) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.zza = r0
            r1.zzb = r5
            r1.zzc = r2
            r1.zzd = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzexh r0 = r1.zzc
            int r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r5.zza
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzerw r0 = (com.google.android.gms.internal.ads.zzerw) r0
            if (r0 == 0) goto L10
            boolean r1 = r0.zza()
            if (r1 == 0) goto L25
        L10:
            com.google.android.gms.internal.ads.zzexh r0 = r5.zzc
            long r1 = r5.zzd
            com.google.android.gms.common.util.Clock r3 = r5.zzb
            com.google.android.gms.internal.ads.zzerw r4 = new com.google.android.gms.internal.ads.zzerw
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb()
            r4.<init>(r0, r1, r3)
            java.util.concurrent.atomic.AtomicReference r0 = r5.zza
            r0.set(r4)
            r0 = r4
        L25:
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza
            return r0
    }
}
