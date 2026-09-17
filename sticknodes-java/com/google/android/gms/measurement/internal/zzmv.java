package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzmv implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzd;

    zzmv(com.google.android.gms.measurement.internal.zzny r1, java.util.concurrent.atomic.AtomicReference r2, com.google.android.gms.measurement.internal.zzr r3, boolean r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r5.zza
            monitor-enter(r0)
            com.google.android.gms.measurement.internal.zzny r1 = r5.zzd     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            com.google.android.gms.measurement.internal.zzgl r2 = com.google.android.gms.measurement.internal.zzny.zzi(r1)     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            if (r2 != 0) goto L1f
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            java.lang.String r2 = "Failed to get all user properties; not connected to service"
            r1.zza(r2)     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            r0.notify()     // Catch: java.lang.Throwable -> L55
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            return
        L1f:
            com.google.android.gms.measurement.internal.zzr r3 = r5.zzb     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            boolean r4 = r5.zzc     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            java.util.List r2 = r2.zzh(r3, r4)     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            r0.set(r2)     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            com.google.android.gms.measurement.internal.zzny.zzy(r1)     // Catch: java.lang.Throwable -> L36 android.os.RemoteException -> L38
            java.util.concurrent.atomic.AtomicReference r1 = r5.zza     // Catch: java.lang.Throwable -> L55
        L32:
            r1.notify()     // Catch: java.lang.Throwable -> L55
            goto L4d
        L36:
            r1 = move-exception
            goto L4f
        L38:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzny r2 = r5.zzd     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "Failed to get all user properties; remote exception"
            r2.zzb(r3, r1)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.atomic.AtomicReference r1 = r5.zza     // Catch: java.lang.Throwable -> L55
            goto L32
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            return
        L4f:
            java.util.concurrent.atomic.AtomicReference r2 = r5.zza     // Catch: java.lang.Throwable -> L55
            r2.notify()     // Catch: java.lang.Throwable -> L55
            throw r1     // Catch: java.lang.Throwable -> L55
        L55:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            throw r1
    }
}
