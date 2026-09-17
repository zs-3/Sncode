package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzei extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzc;

    zzei(com.google.android.gms.internal.measurement.zzff r1, android.os.Bundle r2, com.google.android.gms.internal.measurement.zzcs r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
            r5 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r5.zzc
            com.google.android.gms.internal.measurement.zzcv r0 = com.google.android.gms.internal.measurement.zzff.zze(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.measurement.zzcv r0 = (com.google.android.gms.internal.measurement.zzcv) r0
            android.os.Bundle r1 = r5.zza
            com.google.android.gms.internal.measurement.zzcs r2 = r5.zzb
            long r3 = r5.zzh
            r0.performAction(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    protected final void zzb() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = r2.zzb
            r1 = 0
            r0.zze(r1)
            return
    }
}
