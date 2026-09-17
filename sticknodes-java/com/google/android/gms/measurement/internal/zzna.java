package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzna implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzc;

    zzna(com.google.android.gms.measurement.internal.zzny r1, java.util.concurrent.atomic.AtomicReference r2, com.google.android.gms.measurement.internal.zzr r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r5.zza
            monitor-enter(r0)
            com.google.android.gms.measurement.internal.zzny r1 = r5.zzc     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzht r3 = r2.zzm()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzjx r3 = r3.zzh()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzjw r4 = com.google.android.gms.measurement.internal.zzjw.zzb     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            boolean r3 = r3.zzr(r4)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            if (r3 != 0) goto L3f
            com.google.android.gms.measurement.internal.zzhe r3 = r2.zzaW()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzl()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            java.lang.String r4 = "Analytics storage consent denied; will not get app instance id"
            r3.zza(r4)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzlw r1 = r1.zzq()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            r3 = 0
            r1.zzac(r3)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzht r1 = r2.zzm()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzhr r1 = r1.zze     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            r1.zzb(r3)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            r0.set(r3)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            r0.notify()     // Catch: java.lang.Throwable -> La5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La5
            return
        L3f:
            com.google.android.gms.measurement.internal.zzgl r3 = com.google.android.gms.measurement.internal.zzny.zzi(r1)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            if (r3 != 0) goto L57
            com.google.android.gms.measurement.internal.zzhe r1 = r2.zzaW()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            java.lang.String r2 = "Failed to get app instance id"
            r1.zza(r2)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            r0.notify()     // Catch: java.lang.Throwable -> La5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La5
            return
        L57:
            com.google.android.gms.measurement.internal.zzr r4 = r5.zzb     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            java.lang.String r3 = r3.zzf(r4)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            r0.set(r3)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            java.lang.Object r3 = r0.get()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            if (r3 == 0) goto L7d
            com.google.android.gms.measurement.internal.zzio r4 = r1.zzu     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzlw r4 = r4.zzq()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            r4.zzac(r3)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzht r2 = r2.zzm()     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            com.google.android.gms.measurement.internal.zzhr r2 = r2.zze     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            r2.zzb(r3)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
        L7d:
            com.google.android.gms.measurement.internal.zzny.zzy(r1)     // Catch: java.lang.Throwable -> L86 android.os.RemoteException -> L88
            java.util.concurrent.atomic.AtomicReference r1 = r5.zza     // Catch: java.lang.Throwable -> La5
        L82:
            r1.notify()     // Catch: java.lang.Throwable -> La5
            goto L9d
        L86:
            r1 = move-exception
            goto L9f
        L88:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzny r2 = r5.zzc     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "Failed to get app instance id"
            r2.zzb(r3, r1)     // Catch: java.lang.Throwable -> L86
            java.util.concurrent.atomic.AtomicReference r1 = r5.zza     // Catch: java.lang.Throwable -> La5
            goto L82
        L9d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La5
            return
        L9f:
            java.util.concurrent.atomic.AtomicReference r2 = r5.zza     // Catch: java.lang.Throwable -> La5
            r2.notify()     // Catch: java.lang.Throwable -> La5
            throw r1     // Catch: java.lang.Throwable -> La5
        La5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La5
            throw r1
    }
}
