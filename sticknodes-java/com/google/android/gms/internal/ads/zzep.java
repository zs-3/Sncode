package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzep implements com.google.android.gms.internal.ads.zzdt {
    private static final java.util.List zza = null;
    private final android.os.Handler zzb;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 50
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzep.zza = r0
            return
    }

    public zzep(android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzeo r3) {
            java.util.List r0 = com.google.android.gms.internal.ads.zzep.zza
            monitor-enter(r0)
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L10
            r2 = 50
            if (r1 >= r2) goto Le
            r0.add(r3)     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    private static com.google.android.gms.internal.ads.zzeo zzm() {
            java.util.List r0 = com.google.android.gms.internal.ads.zzep.zza
            monitor-enter(r0)
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L10
            com.google.android.gms.internal.ads.zzeo r1 = new com.google.android.gms.internal.ads.zzeo     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            goto L1c
        L10:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 + (-1)
            java.lang.Object r1 = r0.remove(r1)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzeo r1 = (com.google.android.gms.internal.ads.zzeo) r1     // Catch: java.lang.Throwable -> L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r1
        L1e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final android.os.Looper zza() {
            r1 = this;
            android.os.Handler r0 = r1.zzb
            android.os.Looper r0 = r0.getLooper()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final com.google.android.gms.internal.ads.zzds zzb(int r3) {
            r2 = this;
            android.os.Handler r0 = r2.zzb
            com.google.android.gms.internal.ads.zzeo r1 = zzm()
            android.os.Message r3 = r0.obtainMessage(r3)
            r1.zzb(r3, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final com.google.android.gms.internal.ads.zzds zzc(int r3, java.lang.Object r4) {
            r2 = this;
            android.os.Handler r0 = r2.zzb
            com.google.android.gms.internal.ads.zzeo r1 = zzm()
            android.os.Message r3 = r0.obtainMessage(r3, r4)
            r1.zzb(r3, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final com.google.android.gms.internal.ads.zzds zzd(int r3, int r4, int r5) {
            r2 = this;
            android.os.Handler r3 = r2.zzb
            com.google.android.gms.internal.ads.zzeo r0 = zzm()
            r1 = 1
            android.os.Message r3 = r3.obtainMessage(r1, r4, r5)
            r0.zzb(r3, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zze(java.lang.Object r2) {
            r1 = this;
            android.os.Handler r2 = r1.zzb
            r0 = 0
            r2.removeCallbacksAndMessages(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzf(int r2) {
            r1 = this;
            android.os.Handler r0 = r1.zzb
            r0.removeMessages(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzg(int r2) {
            r1 = this;
            android.os.Handler r2 = r1.zzb
            r0 = 1
            boolean r2 = r2.hasMessages(r0)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzh(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.zzb
            boolean r2 = r0.post(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzi(int r2) {
            r1 = this;
            android.os.Handler r0 = r1.zzb
            boolean r2 = r0.sendEmptyMessage(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzj(int r2, long r3) {
            r1 = this;
            android.os.Handler r2 = r1.zzb
            r0 = 2
            boolean r2 = r2.sendEmptyMessageAtTime(r0, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzk(com.google.android.gms.internal.ads.zzds r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeo r2 = (com.google.android.gms.internal.ads.zzeo) r2
            android.os.Handler r0 = r1.zzb
            boolean r2 = r2.zzc(r0)
            return r2
    }
}
