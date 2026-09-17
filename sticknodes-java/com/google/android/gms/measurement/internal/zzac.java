package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzac extends com.google.android.gms.measurement.internal.zzab {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzae zza;
    private final com.google.android.gms.internal.measurement.zzfr zzh;

    zzac(com.google.android.gms.measurement.internal.zzae r1, java.lang.String r2, int r3, com.google.android.gms.internal.measurement.zzfr r4) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2, r3)
            r0.zzh = r4
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final int zza() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzfr r0 = r1.zzh
            int r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzb() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzc() {
            r1 = this;
            r0 = 1
            return r0
    }

    final boolean zzd(java.lang.Long r14, java.lang.Long r15, com.google.android.gms.internal.measurement.zzio r16, boolean r17) {
            r13 = this;
            r0 = r13
            com.google.android.gms.internal.measurement.zzpq.zzb()
            com.google.android.gms.measurement.internal.zzae r1 = r0.zza
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzam r2 = r1.zzf()
            java.lang.String r3 = r0.zzb
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzaC
            boolean r2 = r2.zzx(r3, r4)
            com.google.android.gms.internal.measurement.zzfr r3 = r0.zzh
            boolean r4 = r3.zzg()
            boolean r5 = r3.zzh()
            boolean r6 = r3.zzi()
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L2d
            if (r5 != 0) goto L2d
            if (r6 == 0) goto L2b
            goto L2d
        L2b:
            r4 = 0
            goto L2e
        L2d:
            r4 = 1
        L2e:
            r5 = 0
            if (r17 == 0) goto L55
            if (r4 != 0) goto L55
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            int r2 = r0.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r4 = r3.zzj()
            if (r4 == 0) goto L4f
            int r3 = r3.zza()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L4f:
            java.lang.String r3 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.zzc(r3, r2, r5)
            return r8
        L55:
            com.google.android.gms.internal.measurement.zzfl r9 = r3.zzb()
            boolean r10 = r9.zzg()
            boolean r11 = r16.zzt()
            if (r11 == 0) goto L96
            boolean r11 = r9.zzi()
            if (r11 != 0) goto L84
            com.google.android.gms.measurement.internal.zzhe r9 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzk()
            com.google.android.gms.measurement.internal.zzgx r10 = r1.zzj()
            java.lang.String r11 = r16.zzg()
            java.lang.String r10 = r10.zzf(r11)
            java.lang.String r11 = "No number filter for long property. property"
            r9.zzb(r11, r10)
            goto L162
        L84:
            long r11 = r16.zzc()
            com.google.android.gms.internal.measurement.zzfp r5 = r9.zzc()
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.zzab.zzh(r11, r5)
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.zzab.zzj(r5, r10)
            goto L162
        L96:
            boolean r11 = r16.zzr()
            if (r11 == 0) goto Lcf
            boolean r11 = r9.zzi()
            if (r11 != 0) goto Lbd
            com.google.android.gms.measurement.internal.zzhe r9 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzk()
            com.google.android.gms.measurement.internal.zzgx r10 = r1.zzj()
            java.lang.String r11 = r16.zzg()
            java.lang.String r10 = r10.zzf(r11)
            java.lang.String r11 = "No number filter for double property. property"
            r9.zzb(r11, r10)
            goto L162
        Lbd:
            double r11 = r16.zza()
            com.google.android.gms.internal.measurement.zzfp r5 = r9.zzc()
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.zzab.zzg(r11, r5)
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.zzab.zzj(r5, r10)
            goto L162
        Lcf:
            boolean r11 = r16.zzv()
            if (r11 == 0) goto L149
            boolean r11 = r9.zzk()
            if (r11 != 0) goto L134
            boolean r11 = r9.zzi()
            if (r11 != 0) goto Lfb
            com.google.android.gms.measurement.internal.zzhe r9 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzk()
            com.google.android.gms.measurement.internal.zzgx r10 = r1.zzj()
            java.lang.String r11 = r16.zzg()
            java.lang.String r10 = r10.zzf(r11)
            java.lang.String r11 = "No string or number filter defined. property"
            r9.zzb(r11, r10)
            goto L162
        Lfb:
            java.lang.String r11 = r16.zzh()
            boolean r11 = com.google.android.gms.measurement.internal.zzqa.zzA(r11)
            if (r11 == 0) goto L116
            java.lang.String r5 = r16.zzh()
            com.google.android.gms.internal.measurement.zzfp r9 = r9.zzc()
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.zzab.zzi(r5, r9)
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.zzab.zzj(r5, r10)
            goto L162
        L116:
            com.google.android.gms.measurement.internal.zzhe r9 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzk()
            com.google.android.gms.measurement.internal.zzgx r10 = r1.zzj()
            java.lang.String r11 = r16.zzg()
            java.lang.String r10 = r10.zzf(r11)
            java.lang.String r11 = r16.zzh()
            java.lang.String r12 = "Invalid user property value for Numeric number filter. property, value"
            r9.zzc(r12, r10, r11)
            goto L162
        L134:
            java.lang.String r5 = r16.zzh()
            com.google.android.gms.internal.measurement.zzfv r9 = r9.zzd()
            com.google.android.gms.measurement.internal.zzhe r11 = r1.zzaW()
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.zzab.zzf(r5, r9, r11)
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.zzab.zzj(r5, r10)
            goto L162
        L149:
            com.google.android.gms.measurement.internal.zzhe r9 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzk()
            com.google.android.gms.measurement.internal.zzgx r10 = r1.zzj()
            java.lang.String r11 = r16.zzg()
            java.lang.String r10 = r10.zzf(r11)
            java.lang.String r11 = "User property has no value, property"
            r9.zzb(r11, r10)
        L162:
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            if (r5 != 0) goto L16f
            java.lang.String r9 = "null"
            goto L170
        L16f:
            r9 = r5
        L170:
            java.lang.String r10 = "Property filter result"
            r1.zzb(r10, r9)
            if (r5 != 0) goto L178
            return r7
        L178:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.zzd = r1
            if (r6 == 0) goto L186
            boolean r1 = r5.booleanValue()
            if (r1 == 0) goto L185
            goto L186
        L185:
            return r8
        L186:
            if (r17 == 0) goto L18e
            boolean r1 = r3.zzg()
            if (r1 == 0) goto L190
        L18e:
            r0.zze = r5
        L190:
            boolean r1 = r5.booleanValue()
            if (r1 == 0) goto L1cf
            if (r4 == 0) goto L1cf
            boolean r1 = r16.zzu()
            if (r1 == 0) goto L1cf
            long r4 = r16.zzd()
            if (r14 == 0) goto L1a8
            long r4 = r14.longValue()
        L1a8:
            if (r2 == 0) goto L1bc
            boolean r1 = r3.zzg()
            if (r1 == 0) goto L1bc
            boolean r1 = r3.zzh()
            if (r1 != 0) goto L1bc
            if (r15 == 0) goto L1bc
            long r4 = r15.longValue()
        L1bc:
            boolean r1 = r3.zzh()
            if (r1 == 0) goto L1c9
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.zzg = r1
            goto L1cf
        L1c9:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.zzf = r1
        L1cf:
            return r8
    }
}
