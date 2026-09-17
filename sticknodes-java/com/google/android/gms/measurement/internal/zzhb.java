package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzhb implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.Object zzc;
    final /* synthetic */ java.lang.Object zzd;
    final /* synthetic */ java.lang.Object zze;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhe zzf;

    zzhb(com.google.android.gms.measurement.internal.zzhe r1, int r2, java.lang.String r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            com.google.android.gms.measurement.internal.zzhe r0 = r10.zzf
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzht r1 = r1.zzm()
            boolean r2 = r1.zzy()
            if (r2 == 0) goto L9d
            char r2 = com.google.android.gms.measurement.internal.zzhe.zza(r0)
            if (r2 != 0) goto L31
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r3 = r2.zzf()
            boolean r3 = r3.zzD()
            if (r3 == 0) goto L29
            r2.zzaV()
            r2 = 67
            com.google.android.gms.measurement.internal.zzhe.zzt(r0, r2)
            goto L31
        L29:
            r2.zzaV()
            r2 = 99
            com.google.android.gms.measurement.internal.zzhe.zzt(r0, r2)
        L31:
            long r2 = com.google.android.gms.measurement.internal.zzhe.zzb(r0)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L4a
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r2 = r2.zzf()
            r2.zzj()
            r2 = 119002(0x1d0da, double:5.8795E-319)
            com.google.android.gms.measurement.internal.zzhe.zzs(r0, r2)
        L4a:
            int r2 = r10.zza
            java.lang.String r3 = "01VDIWEA?"
            char r2 = r3.charAt(r2)
            char r3 = com.google.android.gms.measurement.internal.zzhe.zza(r0)
            long r4 = com.google.android.gms.measurement.internal.zzhe.zzb(r0)
            java.lang.String r0 = r10.zzb
            r6 = 1
            java.lang.Object r7 = r10.zzc
            java.lang.Object r8 = r10.zzd
            java.lang.Object r9 = r10.zze
            java.lang.String r6 = com.google.android.gms.measurement.internal.zzhe.zzo(r6, r0, r7, r8, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "2"
            r7.append(r8)
            r7.append(r2)
            r7.append(r3)
            r7.append(r4)
            java.lang.String r2 = ":"
            r7.append(r2)
            r7.append(r6)
            java.lang.String r2 = r7.toString()
            int r3 = r2.length()
            r4 = 1024(0x400, float:1.435E-42)
            if (r3 <= r4) goto L93
            r2 = 0
            java.lang.String r2 = r0.substring(r2, r4)
        L93:
            com.google.android.gms.measurement.internal.zzhq r0 = r1.zzb
            if (r0 == 0) goto L9c
            r3 = 1
            r0.zzb(r2, r3)
        L9c:
            return
        L9d:
            r1 = 6
            java.lang.String r0 = r0.zzr()
            java.lang.String r2 = "Persisted config not initialized. Not logging error/warn"
            android.util.Log.println(r1, r0, r2)
            return
    }
}
