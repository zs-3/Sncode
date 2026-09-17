package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzke {
    final android.content.Context zza;
    java.lang.String zzb;
    java.lang.String zzc;
    java.lang.String zzd;
    java.lang.Boolean zze;
    long zzf;
    com.google.android.gms.internal.measurement.zzdh zzg;
    boolean zzh;
    final java.lang.Long zzi;
    java.lang.String zzj;

    public zzke(android.content.Context r4, com.google.android.gms.internal.measurement.zzdh r5, java.lang.Long r6) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.zzh = r0
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            android.content.Context r4 = r4.getApplicationContext()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            r3.zza = r4
            r3.zzi = r6
            if (r5 == 0) goto L40
            r3.zzg = r5
            java.lang.String r4 = r5.zzf
            r3.zzb = r4
            java.lang.String r4 = r5.zze
            r3.zzc = r4
            java.lang.String r4 = r5.zzd
            r3.zzd = r4
            boolean r4 = r5.zzc
            r3.zzh = r4
            long r1 = r5.zzb
            r3.zzf = r1
            java.lang.String r4 = r5.zzh
            r3.zzj = r4
            android.os.Bundle r4 = r5.zzg
            if (r4 == 0) goto L40
            java.lang.String r5 = "dataCollectionDefaultEnabled"
            boolean r4 = r4.getBoolean(r5, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.zze = r4
        L40:
            return
    }
}
