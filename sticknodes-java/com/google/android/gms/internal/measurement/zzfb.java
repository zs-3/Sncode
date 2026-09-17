package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzfb extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ android.app.Activity zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzb;

    zzfb(com.google.android.gms.internal.measurement.zzfe r1, android.app.Activity r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            com.google.android.gms.internal.measurement.zzff r1 = r1.zza
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.internal.measurement.zzfe r0 = r4.zzb
            com.google.android.gms.internal.measurement.zzff r0 = r0.zza
            com.google.android.gms.internal.measurement.zzcv r0 = com.google.android.gms.internal.measurement.zzff.zze(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.measurement.zzcv r0 = (com.google.android.gms.internal.measurement.zzcv) r0
            android.app.Activity r1 = r4.zza
            com.google.android.gms.internal.measurement.zzdj r1 = com.google.android.gms.internal.measurement.zzdj.zza(r1)
            long r2 = r4.zzi
            r0.onActivityStoppedByScionActivityInfo(r1, r2)
            return
    }
}
