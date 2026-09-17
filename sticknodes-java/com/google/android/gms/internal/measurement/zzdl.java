package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzdl extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zze;

    zzdl(com.google.android.gms.internal.measurement.zzff r1, java.lang.String r2, java.lang.String r3, java.lang.Object r4, boolean r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r1
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
            r8 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r8.zze
            com.google.android.gms.internal.measurement.zzcv r0 = com.google.android.gms.internal.measurement.zzff.zze(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r1 = r0
            com.google.android.gms.internal.measurement.zzcv r1 = (com.google.android.gms.internal.measurement.zzcv) r1
            java.lang.Object r0 = r8.zzc
            java.lang.String r2 = r8.zza
            java.lang.String r3 = r8.zzb
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            boolean r5 = r8.zzd
            long r6 = r8.zzh
            r1.setUserProperty(r2, r3, r4, r5, r6)
            return
    }
}
