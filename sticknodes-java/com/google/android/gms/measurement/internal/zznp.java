package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zznp implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzf;

    zznp(com.google.android.gms.measurement.internal.zzny r1, java.util.concurrent.atomic.AtomicReference r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.google.android.gms.measurement.internal.zzr r6, boolean r7) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r6
            r0.zze = r7
            r0.zzf = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r8.zza
            monitor-enter(r0)
            r1 = 0
            com.google.android.gms.measurement.internal.zzny r2 = r8.zzf     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            com.google.android.gms.measurement.internal.zzgl r3 = com.google.android.gms.measurement.internal.zzny.zzi(r2)     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            if (r3 != 0) goto L2b
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            java.lang.String r3 = "(legacy) Failed to get user properties; not connected to service"
            java.lang.String r4 = r8.zzb     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            java.lang.String r5 = r8.zzc     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            r2.zzd(r3, r1, r4, r5)     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            r0.set(r2)     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            r0.notify()     // Catch: java.lang.Throwable -> L84
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            return
        L2b:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            if (r4 == 0) goto L44
            com.google.android.gms.measurement.internal.zzr r4 = r8.zzd     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            java.lang.String r5 = r8.zzb     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            java.lang.String r6 = r8.zzc     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            boolean r7 = r8.zze     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            java.util.List r3 = r3.zzk(r5, r6, r7, r4)     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            r0.set(r3)     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            goto L51
        L44:
            java.lang.String r4 = r8.zzb     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            java.lang.String r5 = r8.zzc     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            boolean r6 = r8.zze     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            java.util.List r3 = r3.zzl(r1, r4, r5, r6)     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            r0.set(r3)     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
        L51:
            com.google.android.gms.measurement.internal.zzny.zzy(r2)     // Catch: java.lang.Throwable -> L5a android.os.RemoteException -> L5c
            java.util.concurrent.atomic.AtomicReference r1 = r8.zza     // Catch: java.lang.Throwable -> L84
        L56:
            r1.notify()     // Catch: java.lang.Throwable -> L84
            goto L7c
        L5a:
            r1 = move-exception
            goto L7e
        L5c:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzny r3 = r8.zzf     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L5a
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "(legacy) Failed to get user properties; remote exception"
            java.lang.String r5 = r8.zzb     // Catch: java.lang.Throwable -> L5a
            r3.zzd(r4, r1, r5, r2)     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.atomic.AtomicReference r1 = r8.zza     // Catch: java.lang.Throwable -> L5a
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L5a
            r1.set(r2)     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.atomic.AtomicReference r1 = r8.zza     // Catch: java.lang.Throwable -> L84
            goto L56
        L7c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            return
        L7e:
            java.util.concurrent.atomic.AtomicReference r2 = r8.zza     // Catch: java.lang.Throwable -> L84
            r2.notify()     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            throw r1
    }
}
