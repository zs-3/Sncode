package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzmu implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zze;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzf;

    zzmu(com.google.android.gms.measurement.internal.zzny r1, java.lang.String r2, java.lang.String r3, com.google.android.gms.measurement.internal.zzr r4, boolean r5, com.google.android.gms.internal.measurement.zzcy r6) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.zzny r1 = r7.zzf     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            com.google.android.gms.measurement.internal.zzgl r2 = com.google.android.gms.measurement.internal.zzny.zzi(r1)     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            if (r2 != 0) goto L2a
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            java.lang.String r3 = "Failed to get user properties; not connected to service"
            java.lang.String r4 = r7.zza     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            java.lang.String r5 = r7.zzb     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            r2.zzc(r3, r4, r5)     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            com.google.android.gms.measurement.internal.zzqf r1 = r1.zzw()
            com.google.android.gms.internal.measurement.zzcy r2 = r7.zze
            r1.zzV(r2, r0)
            return
        L2a:
            com.google.android.gms.measurement.internal.zzr r3 = r7.zzc     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            java.lang.String r4 = r7.zza     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            java.lang.String r5 = r7.zzb     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            boolean r6 = r7.zzd     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            java.util.List r2 = r2.zzk(r4, r5, r6, r3)     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            int r3 = com.google.android.gms.measurement.internal.zzqf.zza     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            r3.<init>()     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            if (r2 != 0) goto L43
            goto L79
        L43:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
        L47:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            if (r4 == 0) goto L79
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            com.google.android.gms.measurement.internal.zzqb r4 = (com.google.android.gms.measurement.internal.zzqb) r4     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            java.lang.String r5 = r4.zze     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            if (r5 == 0) goto L5d
            java.lang.String r4 = r4.zzb     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            r3.putString(r4, r5)     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            goto L47
        L5d:
            java.lang.Long r5 = r4.zzd     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            if (r5 == 0) goto L6b
            java.lang.String r4 = r4.zzb     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            r3.putLong(r4, r5)     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            goto L47
        L6b:
            java.lang.Double r5 = r4.zzg     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            if (r5 == 0) goto L47
            java.lang.String r4 = r4.zzb     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            double r5 = r5.doubleValue()     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            r3.putDouble(r4, r5)     // Catch: java.lang.Throwable -> L8a android.os.RemoteException -> L8c
            goto L47
        L79:
            com.google.android.gms.measurement.internal.zzny.zzy(r1)     // Catch: android.os.RemoteException -> L88 java.lang.Throwable -> Lb0
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.internal.measurement.zzcy r1 = r7.zze
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            r0.zzV(r1, r3)
            return
        L88:
            r0 = move-exception
            goto L8f
        L8a:
            r1 = move-exception
            goto Lb3
        L8c:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L8f:
            com.google.android.gms.measurement.internal.zzny r1 = r7.zzf     // Catch: java.lang.Throwable -> Lb0
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> Lb0
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Throwable -> Lb0
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r2 = "Failed to get user properties; remote exception"
            java.lang.String r4 = r7.zza     // Catch: java.lang.Throwable -> Lb0
            r1.zzc(r2, r4, r0)     // Catch: java.lang.Throwable -> Lb0
            com.google.android.gms.measurement.internal.zzny r0 = r7.zzf
            com.google.android.gms.internal.measurement.zzcy r1 = r7.zze
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            r0.zzV(r1, r3)
            return
        Lb0:
            r0 = move-exception
            r1 = r0
            r0 = r3
        Lb3:
            com.google.android.gms.measurement.internal.zzny r2 = r7.zzf
            com.google.android.gms.internal.measurement.zzcy r3 = r7.zze
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzqf r2 = r2.zzw()
            r2.zzV(r3, r0)
            throw r1
    }
}
