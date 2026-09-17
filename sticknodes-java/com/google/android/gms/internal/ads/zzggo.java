package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzggo extends com.google.android.gms.internal.ads.zzgfe implements java.util.concurrent.RunnableFuture {
    private volatile com.google.android.gms.internal.ads.zzgfx zza;

    zzggo(com.google.android.gms.internal.ads.zzgeu r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzggm r0 = new com.google.android.gms.internal.ads.zzggm
            r0.<init>(r1, r2)
            r1.zza = r0
            return
    }

    zzggo(java.util.concurrent.Callable r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzggn r0 = new com.google.android.gms.internal.ads.zzggn
            r0.<init>(r1, r2)
            r1.zza = r0
            return
    }

    static com.google.android.gms.internal.ads.zzggo zze(java.lang.Runnable r1, java.lang.Object r2) {
            com.google.android.gms.internal.ads.zzggo r0 = new com.google.android.gms.internal.ads.zzggo
            java.util.concurrent.Callable r1 = java.util.concurrent.Executors.callable(r1, r2)
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgfx r0 = r1.zza
            if (r0 == 0) goto L7
            r0.run()
        L7:
            r0 = 0
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    protected final java.lang.String zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgfx r0 = r3.zza
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "task=["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L1f:
            java.lang.String r0 = super.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    protected final void zzb() {
            r1 = this;
            boolean r0 = r1.zzt()
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.ads.zzgfx r0 = r1.zza
            if (r0 == 0) goto Ld
            r0.zzh()
        Ld:
            r0 = 0
            r1.zza = r0
            return
    }
}
