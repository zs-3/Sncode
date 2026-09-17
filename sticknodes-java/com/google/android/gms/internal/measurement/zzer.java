package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzer extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzew zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzb;

    zzer(com.google.android.gms.internal.measurement.zzff r1, com.google.android.gms.internal.measurement.zzew r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r2.zzb
            com.google.android.gms.internal.measurement.zzcv r0 = com.google.android.gms.internal.measurement.zzff.zze(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.measurement.zzcv r0 = (com.google.android.gms.internal.measurement.zzcv) r0
            com.google.android.gms.internal.measurement.zzew r1 = r2.zza
            r0.registerOnMeasurementEventListener(r1)
            return
    }
}
