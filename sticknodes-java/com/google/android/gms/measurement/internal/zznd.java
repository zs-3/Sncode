package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zznd implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzb;

    zznd(com.google.android.gms.measurement.internal.zzny r1, com.google.android.gms.measurement.internal.zzr r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.measurement.internal.zzny r0 = r3.zzb
            com.google.android.gms.measurement.internal.zzgl r1 = com.google.android.gms.measurement.internal.zzny.zzi(r0)
            if (r1 != 0) goto L18
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()
            java.lang.String r1 = "Failed to send app backgrounded"
            r0.zza(r1)
            return
        L18:
            com.google.android.gms.measurement.internal.zzr r2 = r3.zza     // Catch: android.os.RemoteException -> L24
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: android.os.RemoteException -> L24
            r1.zzm(r2)     // Catch: android.os.RemoteException -> L24
            com.google.android.gms.measurement.internal.zzny.zzy(r0)     // Catch: android.os.RemoteException -> L24
            return
        L24:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzny r1 = r3.zzb
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Failed to send app backgrounded to the service"
            r1.zzb(r2, r0)
            return
    }
}
