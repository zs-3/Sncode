package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzef extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcs zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zze;

    zzef(com.google.android.gms.internal.measurement.zzff r1, java.lang.String r2, java.lang.String r3, boolean r4, com.google.android.gms.internal.measurement.zzcs r5) {
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
            r5 = this;
            com.google.android.gms.internal.measurement.zzff r0 = r5.zze
            com.google.android.gms.internal.measurement.zzcv r0 = com.google.android.gms.internal.measurement.zzff.zze(r0)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.internal.measurement.zzcv r0 = (com.google.android.gms.internal.measurement.zzcv) r0
            java.lang.String r1 = r5.zza
            java.lang.String r2 = r5.zzb
            boolean r3 = r5.zzc
            com.google.android.gms.internal.measurement.zzcs r4 = r5.zzd
            r0.getUserProperties(r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    protected final void zzb() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzcs r0 = r2.zzd
            r1 = 0
            r0.zze(r1)
            return
    }
}
