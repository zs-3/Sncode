package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcsk extends com.google.android.gms.internal.ads.zzcqr {
    private final com.google.android.gms.internal.ads.zzbht zzc;
    private final java.lang.Runnable zzd;
    private final java.util.concurrent.Executor zze;

    public zzcsk(com.google.android.gms.internal.ads.zzctd r1, com.google.android.gms.internal.ads.zzbht r2, java.lang.Runnable r3, java.util.concurrent.Executor r4) {
            r0 = this;
            r0.<init>(r1)
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            return
    }

    static /* synthetic */ void zzj(java.util.concurrent.atomic.AtomicReference r1) {
            r0 = 0
            java.lang.Object r1 = r1.getAndSet(r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto Lc
            r1.run()
        Lc:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final int zza() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final int zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final android.view.View zzd() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final com.google.android.gms.internal.ads.zzfgi zzf() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final com.google.android.gms.internal.ads.zzfgi zzg() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final void zzh() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcqr
    public final void zzi(android.view.ViewGroup r1, com.google.android.gms.ads.internal.client.zzs r2) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcte
    public final void zzk() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Runnable r1 = r2.zzd
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzcsi r1 = new com.google.android.gms.internal.ads.zzcsi
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzcsj r0 = new com.google.android.gms.internal.ads.zzcsj
            r0.<init>(r2, r1)
            java.util.concurrent.Executor r1 = r2.zze
            r1.execute(r0)
            return
    }

    final /* synthetic */ void zzl(java.lang.Runnable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbht r0 = r2.zzc     // Catch: android.os.RemoteException -> L15
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r3)     // Catch: android.os.RemoteException -> L15
            boolean r0 = r0.zze(r1)     // Catch: android.os.RemoteException -> L15
            if (r0 != 0) goto L14
            r0 = r3
            com.google.android.gms.internal.ads.zzcsi r0 = (com.google.android.gms.internal.ads.zzcsi) r0     // Catch: android.os.RemoteException -> L15
            java.util.concurrent.atomic.AtomicReference r0 = r0.zza     // Catch: android.os.RemoteException -> L15
            zzj(r0)     // Catch: android.os.RemoteException -> L15
        L14:
            return
        L15:
            com.google.android.gms.internal.ads.zzcsi r3 = (com.google.android.gms.internal.ads.zzcsi) r3
            java.util.concurrent.atomic.AtomicReference r3 = r3.zza
            zzj(r3)
            return
    }
}
