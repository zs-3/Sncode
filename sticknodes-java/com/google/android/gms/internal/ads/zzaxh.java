package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxh implements java.util.concurrent.Callable {
    private final com.google.android.gms.internal.ads.zzawo zza;
    private final com.google.android.gms.internal.ads.zzasm zzb;

    public zzaxh(com.google.android.gms.internal.ads.zzawo r1, com.google.android.gms.internal.ads.zzasm r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.internal.ads.zzawo r0 = r4.zza
            java.util.concurrent.Future r0 = r0.zzl()
            if (r0 == 0) goto L11
            com.google.android.gms.internal.ads.zzawo r0 = r4.zza
            java.util.concurrent.Future r0 = r0.zzl()
            r0.get()
        L11:
            com.google.android.gms.internal.ads.zzawo r0 = r4.zza
            com.google.android.gms.internal.ads.zzath r0 = r0.zzc()
            if (r0 == 0) goto L2e
            com.google.android.gms.internal.ads.zzasm r1 = r4.zzb     // Catch: java.lang.Throwable -> L2e
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzasm r2 = r4.zzb     // Catch: java.lang.Throwable -> L2b
            byte[] r0 = r0.zzaV()     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzhao r3 = com.google.android.gms.internal.ads.zzhao.zza()     // Catch: java.lang.Throwable -> L2b
            r2.zzaM(r0, r3)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2e java.lang.Throwable -> L2e
        L2e:
            r0 = 0
            return r0
    }
}
