package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzb {
    private final java.lang.Runnable zza;
    private volatile java.lang.Thread zzb;

    public zzb() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.ads.internal.util.zza r0 = new com.google.android.gms.ads.internal.util.zza
            r0.<init>(r1)
            r1.zza = r0
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.ads.internal.util.zzb r0, java.lang.Thread r1) {
            r0.zzb = r1
            return
    }

    public abstract void zza();

    public com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            java.lang.Runnable r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza(r1)
            return r0
    }
}
