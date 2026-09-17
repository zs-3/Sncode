package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzaa extends com.google.android.gms.measurement.internal.zzab {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzae zza;
    private final com.google.android.gms.internal.measurement.zzfj zzh;

    zzaa(com.google.android.gms.measurement.internal.zzae r1, java.lang.String r2, int r3, com.google.android.gms.internal.measurement.zzfj r4) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2, r3)
            r0.zzh = r4
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final int zza() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzfj r0 = r1.zzh
            int r0 = r0.zzb()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzb() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzfj r0 = r1.zzh
            boolean r0 = r0.zzo()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    final boolean zzc() {
            r1 = this;
            r0 = 0
            return r0
    }

    final boolean zzd(java.lang.Long r17, java.lang.Long r18, com.google.android.gms.internal.measurement.zzhm r19, long r20, com.google.android.gms.measurement.internal.zzbd r22, boolean r23) {
            r16 = this;
            r0 = r16
            com.google.android.gms.internal.measurement.zzpq.zzb()
            com.google.android.gms.measurement.internal.zzae r1 = r0.zza
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzam r3 = r2.zzf()
            java.lang.String r4 = r0.zzb
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzaE
            boolean r3 = r3.zzx(r4, r5)
            com.google.android.gms.internal.measurement.zzfj r5 = r0.zzh
            boolean r6 = r5.zzn()
            if (r6 == 0) goto L22
            r6 = r22
            long r6 = r6.zze
            goto L24
        L22:
            r6 = r20
        L24:
            com.google.android.gms.measurement.internal.zzhe r8 = r2.zzaW()
            java.lang.String r8 = r8.zzr()
            r9 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r9)
            r9 = 0
            if (r8 == 0) goto L7a
            com.google.android.gms.measurement.internal.zzhe r8 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzj()
            int r10 = r0.zzc
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r11 = r5.zzp()
            if (r11 == 0) goto L51
            int r11 = r5.zzb()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L52
        L51:
            r11 = r9
        L52:
            com.google.android.gms.measurement.internal.zzgx r12 = r2.zzj()
            java.lang.String r13 = r5.zzg()
            java.lang.String r12 = r12.zzd(r13)
            java.lang.String r13 = "Evaluating filter. audience, filter, event"
            r8.zzd(r13, r10, r11, r12)
            com.google.android.gms.measurement.internal.zzhe r8 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzj()
            com.google.android.gms.measurement.internal.zzpv r1 = r1.zzg
            com.google.android.gms.measurement.internal.zzqa r1 = r1.zzA()
            java.lang.String r1 = r1.zzr(r5)
            java.lang.String r10 = "Filter definition"
            r8.zzb(r10, r1)
        L7a:
            boolean r1 = r5.zzp()
            r8 = 0
            if (r1 == 0) goto L3a0
            int r1 = r5.zzb()
            r10 = 256(0x100, float:3.59E-43)
            if (r1 <= r10) goto L8b
            goto L3a0
        L8b:
            boolean r1 = r5.zzk()
            boolean r4 = r5.zzm()
            boolean r10 = r5.zzn()
            r11 = 1
            if (r1 != 0) goto La1
            if (r4 != 0) goto La1
            if (r10 == 0) goto L9f
            goto La1
        L9f:
            r1 = 0
            goto La2
        La1:
            r1 = 1
        La2:
            if (r23 == 0) goto Lc8
            if (r1 != 0) goto Lc8
            com.google.android.gms.measurement.internal.zzhe r1 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            int r2 = r0.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r3 = r5.zzp()
            if (r3 == 0) goto Lc2
            int r3 = r5.zzb()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
        Lc2:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.zzc(r3, r2, r9)
            return r11
        Lc8:
            java.lang.String r4 = r19.zzh()
            boolean r10 = r5.zzo()
            if (r10 == 0) goto Le8
            com.google.android.gms.internal.measurement.zzfp r10 = r5.zzf()
            java.lang.Boolean r6 = com.google.android.gms.measurement.internal.zzab.zzh(r6, r10)
            if (r6 != 0) goto Lde
            goto L34b
        Lde:
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto Le8
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L34b
        Le8:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.List r7 = r5.zzh()
            java.util.Iterator r7 = r7.iterator()
        Lf5:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L12a
            java.lang.Object r10 = r7.next()
            com.google.android.gms.internal.measurement.zzfl r10 = (com.google.android.gms.internal.measurement.zzfl) r10
            java.lang.String r12 = r10.zze()
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L122
            com.google.android.gms.measurement.internal.zzhe r6 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r4 = r7.zzd(r4)
            java.lang.String r7 = "null or empty param name in filter. event"
            r6.zzb(r7, r4)
            goto L34b
        L122:
            java.lang.String r10 = r10.zze()
            r6.add(r10)
            goto Lf5
        L12a:
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>()
            java.util.List r10 = r19.zzi()
            java.util.Iterator r10 = r10.iterator()
        L137:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L1be
            java.lang.Object r12 = r10.next()
            com.google.android.gms.internal.measurement.zzhq r12 = (com.google.android.gms.internal.measurement.zzhq) r12
            java.lang.String r13 = r12.zzg()
            boolean r13 = r6.contains(r13)
            if (r13 == 0) goto L137
            boolean r13 = r12.zzw()
            if (r13 == 0) goto L16b
            java.lang.String r13 = r12.zzg()
            boolean r14 = r12.zzw()
            if (r14 == 0) goto L166
            long r14 = r12.zzd()
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            goto L167
        L166:
            r12 = r9
        L167:
            r7.put(r13, r12)
            goto L137
        L16b:
            boolean r13 = r12.zzu()
            if (r13 == 0) goto L189
            java.lang.String r13 = r12.zzg()
            boolean r14 = r12.zzu()
            if (r14 == 0) goto L184
            double r14 = r12.zza()
            java.lang.Double r12 = java.lang.Double.valueOf(r14)
            goto L185
        L184:
            r12 = r9
        L185:
            r7.put(r13, r12)
            goto L137
        L189:
            boolean r13 = r12.zzy()
            if (r13 == 0) goto L19b
            java.lang.String r13 = r12.zzg()
            java.lang.String r12 = r12.zzh()
            r7.put(r13, r12)
            goto L137
        L19b:
            com.google.android.gms.measurement.internal.zzhe r6 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r4 = r7.zzd(r4)
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r10 = r12.zzg()
            java.lang.String r7 = r7.zze(r10)
            java.lang.String r10 = "Unknown value for param. event, param"
            r6.zzc(r10, r4, r7)
            goto L34b
        L1be:
            java.util.List r6 = r5.zzh()
            java.util.Iterator r6 = r6.iterator()
        L1c6:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L349
            java.lang.Object r10 = r6.next()
            com.google.android.gms.internal.measurement.zzfl r10 = (com.google.android.gms.internal.measurement.zzfl) r10
            boolean r12 = r10.zzh()
            if (r12 == 0) goto L1e0
            boolean r12 = r10.zzg()
            if (r12 == 0) goto L1e0
            r12 = 1
            goto L1e1
        L1e0:
            r12 = 0
        L1e1:
            java.lang.String r13 = r10.zze()
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L202
            com.google.android.gms.measurement.internal.zzhe r6 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r4 = r7.zzd(r4)
            java.lang.String r7 = "Event has empty param name. event"
            r6.zzb(r7, r4)
            goto L34b
        L202:
            java.lang.Object r14 = r7.get(r13)
            boolean r15 = r14 instanceof java.lang.Long
            if (r15 == 0) goto L24b
            boolean r15 = r10.zzi()
            if (r15 != 0) goto L22f
            com.google.android.gms.measurement.internal.zzhe r6 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r4 = r7.zzd(r4)
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r7 = r7.zze(r13)
            java.lang.String r10 = "No number filter for long param. event, param"
            r6.zzc(r10, r4, r7)
            goto L34b
        L22f:
            java.lang.Long r14 = (java.lang.Long) r14
            long r13 = r14.longValue()
            com.google.android.gms.internal.measurement.zzfp r10 = r10.zzc()
            java.lang.Boolean r10 = com.google.android.gms.measurement.internal.zzab.zzh(r13, r10)
            if (r10 != 0) goto L241
            goto L34b
        L241:
            boolean r10 = r10.booleanValue()
            if (r10 != r12) goto L1c6
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L34b
        L24b:
            boolean r15 = r14 instanceof java.lang.Double
            if (r15 == 0) goto L290
            boolean r15 = r10.zzi()
            if (r15 != 0) goto L274
            com.google.android.gms.measurement.internal.zzhe r6 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r4 = r7.zzd(r4)
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r7 = r7.zze(r13)
            java.lang.String r10 = "No number filter for double param. event, param"
            r6.zzc(r10, r4, r7)
            goto L34b
        L274:
            java.lang.Double r14 = (java.lang.Double) r14
            double r13 = r14.doubleValue()
            com.google.android.gms.internal.measurement.zzfp r10 = r10.zzc()
            java.lang.Boolean r10 = com.google.android.gms.measurement.internal.zzab.zzg(r13, r10)
            if (r10 != 0) goto L286
            goto L34b
        L286:
            boolean r10 = r10.booleanValue()
            if (r10 != r12) goto L1c6
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L34b
        L290:
            boolean r15 = r14 instanceof java.lang.String
            if (r15 == 0) goto L309
            boolean r15 = r10.zzk()
            if (r15 == 0) goto L2a9
            java.lang.String r14 = (java.lang.String) r14
            com.google.android.gms.internal.measurement.zzfv r10 = r10.zzd()
            com.google.android.gms.measurement.internal.zzhe r13 = r2.zzaW()
            java.lang.Boolean r10 = com.google.android.gms.measurement.internal.zzab.zzf(r14, r10, r13)
            goto L2bf
        L2a9:
            boolean r15 = r10.zzi()
            if (r15 == 0) goto L2eb
            java.lang.String r14 = (java.lang.String) r14
            boolean r15 = com.google.android.gms.measurement.internal.zzqa.zzA(r14)
            if (r15 == 0) goto L2cd
            com.google.android.gms.internal.measurement.zzfp r10 = r10.zzc()
            java.lang.Boolean r10 = com.google.android.gms.measurement.internal.zzab.zzi(r14, r10)
        L2bf:
            if (r10 != 0) goto L2c3
            goto L34b
        L2c3:
            boolean r10 = r10.booleanValue()
            if (r10 != r12) goto L1c6
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L34b
        L2cd:
            com.google.android.gms.measurement.internal.zzhe r6 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r4 = r7.zzd(r4)
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r7 = r7.zze(r13)
            java.lang.String r10 = "Invalid param value for number filter. event, param"
            r6.zzc(r10, r4, r7)
            goto L34b
        L2eb:
            com.google.android.gms.measurement.internal.zzhe r6 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r4 = r7.zzd(r4)
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r7 = r7.zze(r13)
            java.lang.String r10 = "No filter for String param. event, param"
            r6.zzc(r10, r4, r7)
            goto L34b
        L309:
            if (r14 != 0) goto L32b
            com.google.android.gms.measurement.internal.zzhe r6 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r4 = r7.zzd(r4)
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r7 = r7.zze(r13)
            java.lang.String r9 = "Missing param for filter. event, param"
            r6.zzc(r9, r4, r7)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L34b
        L32b:
            com.google.android.gms.measurement.internal.zzhe r6 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r4 = r7.zzd(r4)
            com.google.android.gms.measurement.internal.zzgx r7 = r2.zzj()
            java.lang.String r7 = r7.zze(r13)
            java.lang.String r10 = "Unknown param type. event, param"
            r6.zzc(r10, r4, r7)
            goto L34b
        L349:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
        L34b:
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            if (r9 != 0) goto L358
            java.lang.String r4 = "null"
            goto L359
        L358:
            r4 = r9
        L359:
            java.lang.String r6 = "Event filter result"
            r2.zzb(r6, r4)
            if (r9 != 0) goto L361
            return r8
        L361:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.zzd = r2
            boolean r4 = r9.booleanValue()
            if (r4 != 0) goto L36c
            return r11
        L36c:
            r0.zze = r2
            if (r1 == 0) goto L39f
            boolean r1 = r19.zzu()
            if (r1 == 0) goto L39f
            long r1 = r19.zzd()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r2 = r5.zzm()
            if (r2 == 0) goto L392
            if (r3 == 0) goto L38f
            boolean r2 = r5.zzo()
            if (r2 != 0) goto L38d
            goto L38f
        L38d:
            r1 = r17
        L38f:
            r0.zzg = r1
            goto L39f
        L392:
            if (r3 == 0) goto L39d
            boolean r2 = r5.zzo()
            if (r2 != 0) goto L39b
            goto L39d
        L39b:
            r1 = r18
        L39d:
            r0.zzf = r1
        L39f:
            return r11
        L3a0:
            com.google.android.gms.measurement.internal.zzhe r1 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r4)
            boolean r3 = r5.zzp()
            if (r3 == 0) goto L3ba
            int r3 = r5.zzb()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
        L3ba:
            java.lang.String r3 = java.lang.String.valueOf(r9)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.zzc(r4, r2, r3)
            return r8
    }
}
