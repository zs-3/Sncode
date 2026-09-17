package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgfa extends com.google.android.gms.internal.ads.zzgfx {
    private final java.util.concurrent.Executor zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgfb zzb;

    zzgfa(com.google.android.gms.internal.ads.zzgfb r1, java.util.concurrent.Executor r2) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            java.util.Objects.requireNonNull(r2)
            r0.zza = r2
            return
    }

    abstract void zzc(java.lang.Object r1);

    @Override // com.google.android.gms.internal.ads.zzgfx
    final void zzd(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgfb r0 = r2.zzb
            r1 = 0
            com.google.android.gms.internal.ads.zzgfb.zzG(r0, r1)
            boolean r0 = r3 instanceof java.util.concurrent.ExecutionException
            if (r0 == 0) goto L16
            com.google.android.gms.internal.ads.zzgfb r0 = r2.zzb
            java.util.concurrent.ExecutionException r3 = (java.util.concurrent.ExecutionException) r3
            java.lang.Throwable r3 = r3.getCause()
            r0.zzd(r3)
            return
        L16:
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L21
            com.google.android.gms.internal.ads.zzgfb r3 = r2.zzb
            r0 = 0
            r3.cancel(r0)
            return
        L21:
            com.google.android.gms.internal.ads.zzgfb r0 = r2.zzb
            r0.zzd(r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    final void zze(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgfb r0 = r2.zzb
            r1 = 0
            com.google.android.gms.internal.ads.zzgfb.zzG(r0, r1)
            r2.zzc(r3)
            return
    }

    final void zzf() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.zza     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            r0.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            return
        L6:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgfb r1 = r2.zzb
            r1.zzd(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    final boolean zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgfb r0 = r1.zzb
            boolean r0 = r0.isDone()
            return r0
    }
}
