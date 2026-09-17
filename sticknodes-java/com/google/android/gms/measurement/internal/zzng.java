package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzng implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbf zzc;
    final /* synthetic */ android.os.Bundle zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zze;

    zzng(com.google.android.gms.measurement.internal.zzny r1, boolean r2, com.google.android.gms.measurement.internal.zzr r3, boolean r4, com.google.android.gms.measurement.internal.zzbf r5, android.os.Bundle r6) {
            r0 = this;
            r0.zza = r3
            r0.zzb = r4
            r0.zzc = r5
            r0.zzd = r6
            r0.zze = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            com.google.android.gms.measurement.internal.zzny r0 = r6.zze
            com.google.android.gms.measurement.internal.zzgl r1 = com.google.android.gms.measurement.internal.zzny.zzi(r0)
            java.lang.String r2 = "Failed to send default event parameters to service"
            if (r1 != 0) goto L18
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            r0.zza(r2)
            return
        L18:
            com.google.android.gms.measurement.internal.zzio r3 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r3 = r3.zzf()
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzbl
            r5 = 0
            boolean r3 = r3.zzx(r5, r4)
            if (r3 == 0) goto L39
            com.google.android.gms.measurement.internal.zzr r0 = r6.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzny r2 = r6.zze
            boolean r3 = r6.zzb
            if (r3 == 0) goto L33
            goto L35
        L33:
            com.google.android.gms.measurement.internal.zzbf r5 = r6.zzc
        L35:
            r2.zzP(r1, r5, r0)
            return
        L39:
            com.google.android.gms.measurement.internal.zzr r3 = r6.zza     // Catch: android.os.RemoteException -> L47
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: android.os.RemoteException -> L47
            android.os.Bundle r4 = r6.zzd     // Catch: android.os.RemoteException -> L47
            r1.zzx(r4, r3)     // Catch: android.os.RemoteException -> L47
            com.google.android.gms.measurement.internal.zzny.zzy(r0)     // Catch: android.os.RemoteException -> L47
            return
        L47:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzny r1 = r6.zze
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            r1.zzb(r2, r0)
            return
    }
}
