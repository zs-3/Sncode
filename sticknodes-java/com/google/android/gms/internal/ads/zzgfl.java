package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgfl implements java.lang.Runnable {
    final java.util.concurrent.Future zza;
    final com.google.android.gms.internal.ads.zzgfk zzb;

    zzgfl(java.util.concurrent.Future r1, com.google.android.gms.internal.ads.zzgfk r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            java.util.concurrent.Future r0 = r2.zza
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzggr
            if (r1 == 0) goto L15
            com.google.android.gms.internal.ads.zzggr r0 = (com.google.android.gms.internal.ads.zzggr) r0
            java.lang.Throwable r0 = com.google.android.gms.internal.ads.zzggs.zza(r0)
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            com.google.android.gms.internal.ads.zzgfk r1 = r2.zzb
            r1.zza(r0)
            return
        L15:
            java.util.concurrent.Future r0 = r2.zza     // Catch: java.lang.Throwable -> L21 java.util.concurrent.ExecutionException -> L28
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgfo.zzp(r0)     // Catch: java.lang.Throwable -> L21 java.util.concurrent.ExecutionException -> L28
            com.google.android.gms.internal.ads.zzgfk r1 = r2.zzb
            r1.zzb(r0)
            return
        L21:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgfk r1 = r2.zzb
            r1.zza(r0)
            return
        L28:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgfk r1 = r2.zzb
            java.lang.Throwable r0 = r0.getCause()
            r1.zza(r0)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfxu r0 = com.google.android.gms.internal.ads.zzfxv.zza(r2)
            com.google.android.gms.internal.ads.zzgfk r1 = r2.zzb
            r0.zza(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
