package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzdq extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzdj zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzd;

    zzdq(com.google.android.gms.internal.measurement.zzff r1, com.google.android.gms.internal.measurement.zzdj r2, java.lang.String r3, java.lang.String r4) {
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
            r7 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r7.zzd
            com.google.android.gms.internal.measurement.zzcv r0 = com.google.android.gms.internal.measurement.zzff.zze(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r1 = r0
            com.google.android.gms.internal.measurement.zzcv r1 = (com.google.android.gms.internal.measurement.zzcv) r1
            com.google.android.gms.internal.measurement.zzdj r2 = r7.zza
            java.lang.String r3 = r7.zzb
            java.lang.String r4 = r7.zzc
            long r5 = r7.zzh
            r1.setCurrentScreenByScionActivityInfo(r2, r3, r4, r5)
            return
    }
}
