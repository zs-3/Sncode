package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zznh implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbh zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzd;

    zznh(com.google.android.gms.measurement.internal.zzny r1, com.google.android.gms.measurement.internal.zzbh r2, java.lang.String r3, com.google.android.gms.internal.measurement.zzcy r4) {
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
            r0 = 0
            com.google.android.gms.measurement.internal.zzny r1 = r5.zzd     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L30
            com.google.android.gms.measurement.internal.zzgl r2 = com.google.android.gms.measurement.internal.zzny.zzi(r1)     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L30
            if (r2 != 0) goto L22
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L30
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L30
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L30
            java.lang.String r3 = "Discarding data. Failed to send event to service to bundle"
            r2.zza(r3)     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L30
            com.google.android.gms.measurement.internal.zzqf r1 = r1.zzw()
            com.google.android.gms.internal.measurement.zzcy r2 = r5.zzc
        L1e:
            r1.zzW(r2, r0)
            return
        L22:
            com.google.android.gms.measurement.internal.zzbh r3 = r5.zza     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L30
            java.lang.String r4 = r5.zzb     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L30
            byte[] r0 = r2.zzD(r3, r4)     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L30
            com.google.android.gms.measurement.internal.zzny.zzy(r1)     // Catch: java.lang.Throwable -> L2e android.os.RemoteException -> L30
            goto L42
        L2e:
            r1 = move-exception
            goto L4d
        L30:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzny r2 = r5.zzd     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "Failed to send event to the service to bundle"
            r2.zzb(r3, r1)     // Catch: java.lang.Throwable -> L2e
        L42:
            com.google.android.gms.measurement.internal.zzny r1 = r5.zzd
            com.google.android.gms.internal.measurement.zzcy r2 = r5.zzc
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzqf r1 = r1.zzw()
            goto L1e
        L4d:
            com.google.android.gms.measurement.internal.zzny r2 = r5.zzd
            com.google.android.gms.internal.measurement.zzcy r3 = r5.zzc
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzqf r2 = r2.zzw()
            r2.zzW(r3, r0)
            throw r1
    }
}
