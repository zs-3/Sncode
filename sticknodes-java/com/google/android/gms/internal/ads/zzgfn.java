package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgfn {
    private final boolean zza;
    private final com.google.android.gms.internal.ads.zzgax zzb;

    /* synthetic */ zzgfn(boolean r1, com.google.android.gms.internal.ads.zzgax r2, com.google.android.gms.internal.ads.zzgfm r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(java.util.concurrent.Callable r4, java.util.concurrent.Executor r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzgfb r0 = new com.google.android.gms.internal.ads.zzgfb
            com.google.android.gms.internal.ads.zzgax r1 = r3.zzb
            boolean r2 = r3.zza
            r0.<init>(r1, r2, r5, r4)
            return r0
    }
}
