package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzeh extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.Object zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zzc;

    zzeh(com.google.android.gms.internal.measurement.zzff r1, boolean r2, int r3, java.lang.String r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r0 = this;
            r0.zza = r4
            r0.zzb = r5
            r0.zzc = r1
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    final void zza() throws android.os.RemoteException {
            r7 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r7.zzc
            com.google.android.gms.internal.measurement.zzcv r0 = com.google.android.gms.internal.measurement.zzff.zze(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r1 = r0
            com.google.android.gms.internal.measurement.zzcv r1 = (com.google.android.gms.internal.measurement.zzcv) r1
            java.lang.Object r0 = r7.zzb
            java.lang.String r3 = r7.zza
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            r0 = 0
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            r2 = 5
            r1.logHealthData(r2, r3, r4, r5, r6)
            return
    }
}
