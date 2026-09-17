package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzmx extends com.google.android.gms.measurement.internal.zzgq {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzb;

    zzmx(com.google.android.gms.measurement.internal.zzny r1, java.util.concurrent.atomic.AtomicReference r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final void zze(com.google.android.gms.measurement.internal.zzpe r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r4.zza
            monitor-enter(r0)
            com.google.android.gms.measurement.internal.zzny r1 = r4.zzb     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "[sgtm] Got upload batches from service. count"
            java.util.List r3 = r5.zza     // Catch: java.lang.Throwable -> L26
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L26
            r1.zzb(r2, r3)     // Catch: java.lang.Throwable -> L26
            r0.set(r5)     // Catch: java.lang.Throwable -> L26
            r0.notifyAll()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r5
    }
}
