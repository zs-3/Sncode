package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgga implements java.util.concurrent.Executor {
    final /* synthetic */ java.util.concurrent.Executor zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgec zzb;

    zzgga(java.util.concurrent.Executor r1, com.google.android.gms.internal.ads.zzgec r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.zza     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            r0.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            return
        L6:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzgec r0 = r1.zzb
            r0.zzd(r2)
            return
    }
}
