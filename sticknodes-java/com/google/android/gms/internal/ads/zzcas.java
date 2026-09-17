package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzcas implements com.google.common.util.concurrent.ListenableFuture {
    private final com.google.android.gms.internal.ads.zzggh zza;

    public zzcas() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzggh r0 = com.google.android.gms.internal.ads.zzggh.zze()
            r1.zza = r0
            return
    }

    private static final boolean zza(boolean r3) {
            if (r3 != 0) goto L12
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Provided SettableFuture with multiple values."
            r1.<init>(r2)
            java.lang.String r2 = "SettableFuture"
            r0.zzv(r1, r2)
        L12:
            return r3
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzggh r0 = r1.zza
            r0.addListener(r2, r3)
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzggh r0 = r1.zza
            boolean r2 = r0.cancel(r2)
            return r2
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            r1 = this;
            com.google.android.gms.internal.ads.zzggh r0 = r1.zza
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r2, java.util.concurrent.TimeUnit r4) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            r1 = this;
            com.google.android.gms.internal.ads.zzggh r0 = r1.zza
            java.lang.Object r2 = r0.get(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r1 = this;
            com.google.android.gms.internal.ads.zzggh r0 = r1.zza
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r1 = this;
            com.google.android.gms.internal.ads.zzggh r0 = r1.zza
            boolean r0 = r0.isDone()
            return r0
    }

    public final boolean zzc(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzggh r0 = r1.zza
            boolean r2 = r0.zzc(r2)
            zza(r2)
            return r2
    }

    public final boolean zzd(java.lang.Throwable r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzggh r0 = r1.zza
            boolean r2 = r0.zzd(r2)
            zza(r2)
            return r2
    }
}
