package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zznc implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzb;

    zznc(com.google.android.gms.measurement.internal.zzny r1, com.google.android.gms.measurement.internal.zzr r2, boolean r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            com.google.android.gms.measurement.internal.zzny r0 = r7.zzb
            com.google.android.gms.measurement.internal.zzgl r1 = com.google.android.gms.measurement.internal.zzny.zzi(r0)
            if (r1 != 0) goto L18
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Discarding data. Failed to send app launch"
            r0.zza(r1)
            return
        L18:
            com.google.android.gms.measurement.internal.zzr r2 = r7.zza     // Catch: android.os.RemoteException -> L49
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: android.os.RemoteException -> L49
            com.google.android.gms.measurement.internal.zzio r3 = r0.zzu     // Catch: android.os.RemoteException -> L49
            com.google.android.gms.measurement.internal.zzam r4 = r3.zzf()     // Catch: android.os.RemoteException -> L49
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzbl     // Catch: android.os.RemoteException -> L49
            r6 = 0
            boolean r4 = r4.zzx(r6, r5)     // Catch: android.os.RemoteException -> L49
            if (r4 == 0) goto L2f
            r0.zzP(r1, r6, r2)     // Catch: android.os.RemoteException -> L49
        L2f:
            r1.zzn(r2)     // Catch: android.os.RemoteException -> L49
            com.google.android.gms.measurement.internal.zzio r4 = r0.zzu     // Catch: android.os.RemoteException -> L49
            com.google.android.gms.measurement.internal.zzgv r4 = r4.zzi()     // Catch: android.os.RemoteException -> L49
            r4.zzm()     // Catch: android.os.RemoteException -> L49
            com.google.android.gms.measurement.internal.zzam r3 = r3.zzf()     // Catch: android.os.RemoteException -> L49
            r3.zzx(r6, r5)     // Catch: android.os.RemoteException -> L49
            r0.zzP(r1, r6, r2)     // Catch: android.os.RemoteException -> L49
            com.google.android.gms.measurement.internal.zzny.zzy(r0)     // Catch: android.os.RemoteException -> L49
            return
        L49:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzny r1 = r7.zzb
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Failed to send app launch to the service"
            r1.zzb(r2, r0)
            return
    }
}
