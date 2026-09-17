package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zznq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzgl zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznx zzb;

    zznq(com.google.android.gms.measurement.internal.zznx r1, com.google.android.gms.measurement.internal.zzgl r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.measurement.internal.zznx r0 = r4.zzb
            monitor-enter(r0)
            r1 = 0
            com.google.android.gms.measurement.internal.zznx.zza(r0, r1)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzny r1 = r0.zza     // Catch: java.lang.Throwable -> L25
            boolean r2 = r1.zzaa()     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L23
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "Connected to service"
            r2.zza(r3)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.measurement.internal.zzgl r2 = r4.zza     // Catch: java.lang.Throwable -> L25
            r1.zzW(r2)     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
    }
}
