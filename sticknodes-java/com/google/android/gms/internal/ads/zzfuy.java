package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfuy {
    public static com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.tasks.Task r2, com.google.android.gms.tasks.CancellationTokenSource r3) {
            com.google.android.gms.internal.ads.zzfux r3 = new com.google.android.gms.internal.ads.zzfux
            r0 = 0
            r3.<init>(r2, r0)
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzggf.zzb()
            com.google.android.gms.internal.ads.zzfuw r1 = new com.google.android.gms.internal.ads.zzfuw
            r1.<init>(r3)
            r2.addOnCompleteListener(r0, r1)
            return r3
    }
}
