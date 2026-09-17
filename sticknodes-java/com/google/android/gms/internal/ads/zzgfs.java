package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgfs implements com.google.common.util.concurrent.ListenableFuture {
    static final com.google.common.util.concurrent.ListenableFuture zza = null;
    private static final com.google.android.gms.internal.ads.zzgfy zzb = null;
    private final java.lang.Object zzc;

    static {
            com.google.android.gms.internal.ads.zzgfs r0 = new com.google.android.gms.internal.ads.zzgfs
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgfs.zza = r0
            com.google.android.gms.internal.ads.zzgfy r0 = new com.google.android.gms.internal.ads.zzgfy
            java.lang.Class<com.google.android.gms.internal.ads.zzgfs> r1 = com.google.android.gms.internal.ads.zzgfs.class
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgfs.zzb = r0
            return
    }

    zzgfs(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            return
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable r8, java.util.concurrent.Executor r9) {
            r7 = this;
            java.lang.String r0 = "Runnable was null."
            com.google.android.gms.internal.ads.zzfxz.zzc(r8, r0)
            java.lang.String r0 = "Executor was null."
            com.google.android.gms.internal.ads.zzfxz.zzc(r9, r0)
            r9.execute(r8)     // Catch: java.lang.Exception -> Le
            return
        Le:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzgfy r0 = com.google.android.gms.internal.ads.zzgfs.zzb
            java.util.logging.Logger r1 = r0.zza()
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "RuntimeException while executing runnable "
            r0.append(r3)
            r0.append(r8)
            java.lang.String r8 = " with executor "
            r0.append(r8)
            r0.append(r9)
            java.lang.String r5 = r0.toString()
            java.lang.String r3 = "com.google.common.util.concurrent.ImmediateFuture"
            java.lang.String r4 = "addListener"
            r1.logp(r2, r3, r4, r5, r6)
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
            r1 = this;
            java.lang.Object r0 = r1.zzc
            return r0
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r1, java.util.concurrent.TimeUnit r3) throws java.util.concurrent.ExecutionException {
            r0 = this;
            java.util.Objects.requireNonNull(r3)
            java.lang.Object r1 = r0.zzc
            return r1
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.zzc
            java.lang.String r1 = super.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "[status=SUCCESS, result=["
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "]]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
