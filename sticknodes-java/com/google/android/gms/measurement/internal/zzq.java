package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.4.0 */
/* loaded from: classes2.dex */
final class zzq implements com.google.android.gms.measurement.internal.zzkc {
    public final com.google.android.gms.internal.measurement.zzde zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.AppMeasurementDynamiteService zzb;

    zzq(com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1, com.google.android.gms.internal.measurement.zzde r2) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzkc
    public final void onEvent(java.lang.String r7, java.lang.String r8, android.os.Bundle r9, long r10) {
            r6 = this;
            com.google.android.gms.internal.measurement.zzde r0 = r6.zza     // Catch: android.os.RemoteException -> La
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.zzf(r1, r2, r3, r4)     // Catch: android.os.RemoteException -> La
            return
        La:
            r7 = move-exception
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r8 = r6.zzb
            com.google.android.gms.measurement.internal.zzio r8 = r8.zza
            if (r8 == 0) goto L1e
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzk()
            java.lang.String r9 = "Event listener threw exception"
            r8.zzb(r9, r7)
        L1e:
            return
    }
}
