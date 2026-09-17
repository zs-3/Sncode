package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zznf implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzb;

    zznf(com.google.android.gms.measurement.internal.zzny r1, com.google.android.gms.measurement.internal.zzmh r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            com.google.android.gms.measurement.internal.zzny r0 = r8.zzb
            com.google.android.gms.measurement.internal.zzgl r1 = com.google.android.gms.measurement.internal.zzny.zzi(r0)
            if (r1 != 0) goto L18
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Failed to send current screen to service"
            r0.zza(r1)
            return
        L18:
            com.google.android.gms.measurement.internal.zzmh r2 = r8.zza     // Catch: android.os.RemoteException -> L4d
            if (r2 != 0) goto L32
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu     // Catch: android.os.RemoteException -> L4d
            android.content.Context r2 = r2.zzaT()     // Catch: android.os.RemoteException -> L4d
            r3 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = r2.getPackageName()     // Catch: android.os.RemoteException -> L4d
            r2 = r3
            r4 = r5
            r5 = r6
            r6 = r7
            r1.zzw(r2, r4, r5, r6)     // Catch: android.os.RemoteException -> L4d
            goto L49
        L32:
            long r3 = r2.zzc     // Catch: android.os.RemoteException -> L4d
            java.lang.String r5 = r2.zza     // Catch: android.os.RemoteException -> L4d
            java.lang.String r6 = r2.zzb     // Catch: android.os.RemoteException -> L4d
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu     // Catch: android.os.RemoteException -> L4d
            android.content.Context r2 = r2.zzaT()     // Catch: android.os.RemoteException -> L4d
            java.lang.String r7 = r2.getPackageName()     // Catch: android.os.RemoteException -> L4d
            r2 = r3
            r4 = r5
            r5 = r6
            r6 = r7
            r1.zzw(r2, r4, r5, r6)     // Catch: android.os.RemoteException -> L4d
        L49:
            com.google.android.gms.measurement.internal.zzny.zzy(r0)     // Catch: android.os.RemoteException -> L4d
            return
        L4d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzny r1 = r8.zzb
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Failed to send current screen to the service"
            r1.zzb(r2, r0)
            return
    }
}
