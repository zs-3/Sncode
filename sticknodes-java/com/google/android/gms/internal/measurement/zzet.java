package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzet extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.Long zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ android.os.Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzg;

    zzet(com.google.android.gms.internal.measurement.zzff r1, java.lang.Long r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5, boolean r6, boolean r7) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r7
            r0.zzg = r1
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
            r10 = this;
            java.lang.Long r0 = r10.zza
            if (r0 != 0) goto L7
            long r0 = r10.zzh
            goto Lb
        L7:
            long r0 = r0.longValue()
        Lb:
            r8 = r0
            com.google.android.gms.internal.measurement.zzff r0 = r10.zzg
            com.google.android.gms.internal.measurement.zzcv r0 = com.google.android.gms.internal.measurement.zzff.zze(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r2 = r0
            com.google.android.gms.internal.measurement.zzcv r2 = (com.google.android.gms.internal.measurement.zzcv) r2
            java.lang.String r3 = r10.zzb
            java.lang.String r4 = r10.zzc
            android.os.Bundle r5 = r10.zzd
            boolean r6 = r10.zze
            boolean r7 = r10.zzf
            r2.logEvent(r3, r4, r5, r6, r7, r8)
            return
    }
}
