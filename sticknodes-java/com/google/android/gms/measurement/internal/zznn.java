package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zznn implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zze;

    zznn(com.google.android.gms.measurement.internal.zzny r1, java.util.concurrent.atomic.AtomicReference r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.google.android.gms.measurement.internal.zzr r6) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r6
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r7.zza
            monitor-enter(r0)
            r1 = 0
            com.google.android.gms.measurement.internal.zzny r2 = r7.zze     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            com.google.android.gms.measurement.internal.zzgl r3 = com.google.android.gms.measurement.internal.zzny.zzi(r2)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            if (r3 != 0) goto L2b
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            java.lang.String r3 = "(legacy) Failed to get conditional properties; not connected to service"
            java.lang.String r4 = r7.zzb     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            java.lang.String r5 = r7.zzc     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            r2.zzd(r3, r1, r4, r5)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            r0.set(r2)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            r0.notify()     // Catch: java.lang.Throwable -> L80
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            return
        L2b:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            if (r4 == 0) goto L42
            com.google.android.gms.measurement.internal.zzr r4 = r7.zzd     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            java.lang.String r5 = r7.zzb     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            java.lang.String r6 = r7.zzc     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            java.util.List r3 = r3.zzi(r5, r6, r4)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            r0.set(r3)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            goto L4d
        L42:
            java.lang.String r4 = r7.zzb     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            java.lang.String r5 = r7.zzc     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            java.util.List r3 = r3.zzj(r1, r4, r5)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            r0.set(r3)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
        L4d:
            com.google.android.gms.measurement.internal.zzny.zzy(r2)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
            java.util.concurrent.atomic.AtomicReference r1 = r7.zza     // Catch: java.lang.Throwable -> L80
        L52:
            r1.notify()     // Catch: java.lang.Throwable -> L80
            goto L78
        L56:
            r1 = move-exception
            goto L7a
        L58:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzny r3 = r7.zze     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = "(legacy) Failed to get conditional properties; remote exception"
            java.lang.String r5 = r7.zzb     // Catch: java.lang.Throwable -> L56
            r3.zzd(r4, r1, r5, r2)     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.atomic.AtomicReference r1 = r7.zza     // Catch: java.lang.Throwable -> L56
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L56
            r1.set(r2)     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.atomic.AtomicReference r1 = r7.zza     // Catch: java.lang.Throwable -> L80
            goto L52
        L78:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            return
        L7a:
            java.util.concurrent.atomic.AtomicReference r2 = r7.zza     // Catch: java.lang.Throwable -> L80
            r2.notify()     // Catch: java.lang.Throwable -> L80
            throw r1     // Catch: java.lang.Throwable -> L80
        L80:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            throw r1
    }
}
