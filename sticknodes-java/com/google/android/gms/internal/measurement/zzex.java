package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzex extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ android.app.Activity zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzc;

    zzex(com.google.android.gms.internal.measurement.zzfe r1, android.os.Bundle r2, android.app.Activity r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            com.google.android.gms.internal.measurement.zzff r1 = r1.zza
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
            r5 = this;
            android.os.Bundle r0 = r5.zza
            if (r0 == 0) goto L1f
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "com.google.app_measurement.screen_service"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L20
            java.lang.Object r0 = r0.get(r2)
            boolean r3 = r0 instanceof android.os.Bundle
            if (r3 == 0) goto L20
            android.os.Bundle r0 = (android.os.Bundle) r0
            r1.putBundle(r2, r0)
            goto L20
        L1f:
            r1 = 0
        L20:
            com.google.android.gms.internal.measurement.zzfe r0 = r5.zzc
            com.google.android.gms.internal.measurement.zzff r0 = r0.zza
            com.google.android.gms.internal.measurement.zzcv r0 = com.google.android.gms.internal.measurement.zzff.zze(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.measurement.zzcv r0 = (com.google.android.gms.internal.measurement.zzcv) r0
            android.app.Activity r2 = r5.zzb
            long r3 = r5.zzi
            com.google.android.gms.internal.measurement.zzdj r2 = com.google.android.gms.internal.measurement.zzdj.zza(r2)
            r0.onActivityCreatedByScionActivityInfo(r2, r1, r3)
            return
    }
}
