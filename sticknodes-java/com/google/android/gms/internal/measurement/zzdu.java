package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzdu extends com.google.android.gms.internal.measurement.zzeu {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ android.content.Context zzc;
    final /* synthetic */ android.os.Bundle zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzff zze;

    zzdu(com.google.android.gms.internal.measurement.zzff r1, java.lang.String r2, java.lang.String r3, android.content.Context r4, android.os.Bundle r5) {
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
    public final void zza() {
            r20 = this;
            r1 = r20
            java.lang.String r0 = "com.google.android.gms.measurement.dynamite"
            r2 = 0
            r3 = 1
            com.google.android.gms.internal.measurement.zzff r4 = r1.zze     // Catch: java.lang.Exception -> L75
            java.lang.String r5 = r1.zza     // Catch: java.lang.Exception -> L75
            java.lang.String r6 = r1.zzb     // Catch: java.lang.Exception -> L75
            boolean r7 = com.google.android.gms.internal.measurement.zzff.zzS(r4, r5, r6)     // Catch: java.lang.Exception -> L75
            r8 = 0
            if (r7 == 0) goto L1d
            java.lang.String r8 = com.google.android.gms.internal.measurement.zzff.zzj(r4)     // Catch: java.lang.Exception -> L75
            r16 = r5
            r17 = r6
            r15 = r8
            goto L22
        L1d:
            r15 = r8
            r16 = r15
            r17 = r16
        L22:
            android.content.Context r5 = r1.zzc     // Catch: java.lang.Exception -> L75
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch: java.lang.Exception -> L75
            com.google.android.gms.internal.measurement.zzcv r6 = r4.zzf(r5, r3)     // Catch: java.lang.Exception -> L75
            com.google.android.gms.internal.measurement.zzff.zzs(r4, r6)     // Catch: java.lang.Exception -> L75
            com.google.android.gms.internal.measurement.zzcv r6 = com.google.android.gms.internal.measurement.zzff.zze(r4)     // Catch: java.lang.Exception -> L75
            if (r6 != 0) goto L3e
            java.lang.String r0 = com.google.android.gms.internal.measurement.zzff.zzj(r4)     // Catch: java.lang.Exception -> L75
            java.lang.String r4 = "Failed to connect to measurement client."
            android.util.Log.w(r0, r4)     // Catch: java.lang.Exception -> L75
            return
        L3e:
            int r6 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r5, r0)     // Catch: java.lang.Exception -> L75
            int r0 = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(r5, r0)     // Catch: java.lang.Exception -> L75
            int r7 = java.lang.Math.max(r6, r0)     // Catch: java.lang.Exception -> L75
            if (r0 >= r6) goto L4e
            r14 = 1
            goto L4f
        L4e:
            r14 = 0
        L4f:
            com.google.android.gms.internal.measurement.zzdh r0 = new com.google.android.gms.internal.measurement.zzdh     // Catch: java.lang.Exception -> L75
            long r12 = (long) r7     // Catch: java.lang.Exception -> L75
            android.os.Bundle r6 = r1.zzd     // Catch: java.lang.Exception -> L75
            r10 = 119002(0x1d0da, double:5.8795E-319)
            java.lang.String r19 = com.google.android.gms.measurement.internal.zzig.zza(r5)     // Catch: java.lang.Exception -> L75
            r9 = r0
            r18 = r6
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L75
            com.google.android.gms.internal.measurement.zzcv r4 = com.google.android.gms.internal.measurement.zzff.zze(r4)     // Catch: java.lang.Exception -> L75
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Exception -> L75
            com.google.android.gms.internal.measurement.zzcv r4 = (com.google.android.gms.internal.measurement.zzcv) r4     // Catch: java.lang.Exception -> L75
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: java.lang.Exception -> L75
            long r6 = r1.zzh     // Catch: java.lang.Exception -> L75
            r4.initialize(r5, r0, r6)     // Catch: java.lang.Exception -> L75
            return
        L75:
            r0 = move-exception
            com.google.android.gms.internal.measurement.zzff r4 = r1.zze
            com.google.android.gms.internal.measurement.zzff.zzt(r4, r0, r3, r2)
            return
    }
}
