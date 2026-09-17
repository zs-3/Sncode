package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzmw extends com.google.android.gms.measurement.internal.zzgn {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;

    zzmw(com.google.android.gms.measurement.internal.zzny r1, java.util.concurrent.atomic.AtomicReference r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final void zze(java.util.List r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zza
            monitor-enter(r0)
            r0.set(r2)     // Catch: java.lang.Throwable -> Lb
            r0.notifyAll()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
