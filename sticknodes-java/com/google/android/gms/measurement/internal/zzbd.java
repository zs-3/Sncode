package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzbd {
    final java.lang.String zza;
    final java.lang.String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final java.lang.Long zzh;
    final java.lang.Long zzi;
    final java.lang.Long zzj;
    final java.lang.Boolean zzk;

    zzbd(java.lang.String r15, java.lang.String r16, long r17, long r19, long r21, long r23, long r25, java.lang.Long r27, java.lang.Long r28, java.lang.Long r29, java.lang.Boolean r30) {
            r14 = this;
            r0 = r14
            r1 = r17
            r3 = r19
            r5 = r21
            r7 = r25
            r14.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r16)
            r9 = 1
            r10 = 0
            r11 = 0
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 < 0) goto L1c
            r13 = 1
            goto L1d
        L1c:
            r13 = 0
        L1d:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r13)
            int r13 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r13 < 0) goto L26
            r13 = 1
            goto L27
        L26:
            r13 = 0
        L27:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r13)
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 < 0) goto L30
            r13 = 1
            goto L31
        L30:
            r13 = 0
        L31:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r13)
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 < 0) goto L39
            goto L3a
        L39:
            r9 = 0
        L3a:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r9)
            r9 = r15
            r0.zza = r9
            r9 = r16
            r0.zzb = r9
            r0.zzc = r1
            r0.zzd = r3
            r0.zze = r5
            r1 = r23
            r0.zzf = r1
            r0.zzg = r7
            r1 = r27
            r0.zzh = r1
            r1 = r28
            r0.zzi = r1
            r1 = r29
            r0.zzj = r1
            r1 = r30
            r0.zzk = r1
            return
    }

    final com.google.android.gms.measurement.internal.zzbd zza(java.lang.Long r20, java.lang.Long r21, java.lang.Boolean r22) {
            r19 = this;
            r0 = r19
            if (r22 == 0) goto L7
            r22.booleanValue()
        L7:
            java.lang.String r2 = r0.zza
            java.lang.String r3 = r0.zzb
            long r4 = r0.zzc
            long r6 = r0.zzd
            long r8 = r0.zze
            long r10 = r0.zzf
            long r12 = r0.zzg
            java.lang.Long r14 = r0.zzh
            com.google.android.gms.measurement.internal.zzbd r18 = new com.google.android.gms.measurement.internal.zzbd
            r1 = r18
            r15 = r20
            r16 = r21
            r17 = r22
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)
            return r18
    }

    final com.google.android.gms.measurement.internal.zzbd zzb(long r20, long r22) {
            r19 = this;
            r0 = r19
            r12 = r20
            com.google.android.gms.measurement.internal.zzbd r18 = new com.google.android.gms.measurement.internal.zzbd
            r1 = r18
            java.lang.Long r14 = java.lang.Long.valueOf(r22)
            java.lang.Long r15 = r0.zzi
            java.lang.Long r2 = r0.zzj
            r16 = r2
            java.lang.Boolean r2 = r0.zzk
            r17 = r2
            java.lang.String r2 = r0.zza
            java.lang.String r3 = r0.zzb
            long r4 = r0.zzc
            long r6 = r0.zzd
            long r8 = r0.zze
            long r10 = r0.zzf
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)
            return r18
    }

    final com.google.android.gms.measurement.internal.zzbd zzc(long r20) {
            r19 = this;
            r0 = r19
            r10 = r20
            long r12 = r0.zzg
            java.lang.Long r14 = r0.zzh
            java.lang.Long r15 = r0.zzi
            java.lang.Long r1 = r0.zzj
            r16 = r1
            java.lang.Boolean r1 = r0.zzk
            r17 = r1
            com.google.android.gms.measurement.internal.zzbd r18 = new com.google.android.gms.measurement.internal.zzbd
            r1 = r18
            java.lang.String r2 = r0.zza
            java.lang.String r3 = r0.zzb
            long r4 = r0.zzc
            long r6 = r0.zzd
            long r8 = r0.zze
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)
            return r18
    }
}
