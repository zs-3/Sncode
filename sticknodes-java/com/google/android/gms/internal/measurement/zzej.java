package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzej extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzc;

    zzej(com.google.android.gms.internal.measurement.zzff r1, java.lang.String r2, com.google.android.gms.internal.measurement.zzcs r3) {
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
            r3 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r3.zzc
            com.google.android.gms.internal.measurement.zzcv r0 = com.google.android.gms.internal.measurement.zzff.zze(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.measurement.zzcv r0 = (com.google.android.gms.internal.measurement.zzcv) r0
            java.lang.String r1 = r3.zza
            com.google.android.gms.internal.measurement.zzcs r2 = r3.zzb
            r0.getMaxUserProperties(r1, r2)
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
