package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzdo extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzd;

    zzdo(com.google.android.gms.internal.measurement.zzff r1, java.lang.String r2, java.lang.String r3, com.google.android.gms.internal.measurement.zzcs r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r1
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r4.zzd
            com.google.android.gms.internal.measurement.zzcv r0 = com.google.android.gms.internal.measurement.zzff.zze(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.measurement.zzcv r0 = (com.google.android.gms.internal.measurement.zzcv) r0
            java.lang.String r1 = r4.zza
            java.lang.String r2 = r4.zzb
            com.google.android.gms.internal.measurement.zzcs r3 = r4.zzc
            r0.getConditionalUserProperties(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    protected final void zzb() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = r2.zzc
            r1 = 0
            r0.zze(r1)
            return
    }
}
