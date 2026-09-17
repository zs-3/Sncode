package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzjl implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbh zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjp zzc;

    zzjl(com.google.android.gms.measurement.internal.zzjp r1, com.google.android.gms.measurement.internal.zzbh r2, java.lang.String r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            r36 = this;
            r1 = r36
            java.lang.String r0 = "_r"
            com.google.android.gms.measurement.internal.zzjp r2 = r1.zzc
            com.google.android.gms.measurement.internal.zzpv r3 = com.google.android.gms.measurement.internal.zzjp.zzc(r2)
            r3.zzL()
            com.google.android.gms.measurement.internal.zzpv r2 = com.google.android.gms.measurement.internal.zzjp.zzc(r2)
            com.google.android.gms.measurement.internal.zzmc r2 = r2.zzv()
            r2.zzg()
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu
            com.google.android.gms.measurement.internal.zzio.zzP()
            com.google.android.gms.measurement.internal.zzbh r4 = r1.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.String r14 = r1.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            java.lang.String r5 = r4.zza
            java.lang.String r6 = "_iap"
            boolean r6 = r6.equals(r5)
            r15 = 0
            if (r6 != 0) goto L4b
            java.lang.String r6 = "_iapx"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L4b
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r2 = "Generating a payload for this event is not available. package_name, event_name"
            r0.zzc(r2, r14, r5)
            goto L534
        L4b:
            com.google.android.gms.measurement.internal.zzpv r5 = r2.zzg
            com.google.android.gms.internal.measurement.zzht r7 = com.google.android.gms.internal.measurement.zzhv.zzb()
            com.google.android.gms.measurement.internal.zzaw r6 = r5.zzj()
            r6.zzH()
            com.google.android.gms.measurement.internal.zzaw r6 = r5.zzj()     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzh r6 = r6.zzl(r14)     // Catch: java.lang.Throwable -> L537
            r12 = 0
            if (r6 != 0) goto L7d
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()     // Catch: java.lang.Throwable -> L537
            java.lang.String r3 = "Log and bundle not available. package_name"
            r0.zzb(r3, r14)     // Catch: java.lang.Throwable -> L537
            byte[] r15 = new byte[r12]     // Catch: java.lang.Throwable -> L537
        L74:
            com.google.android.gms.measurement.internal.zzaw r0 = r5.zzj()
        L78:
            r0.zzL()
            goto L534
        L7d:
            boolean r8 = r6.zzaJ()     // Catch: java.lang.Throwable -> L537
            if (r8 != 0) goto L95
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()     // Catch: java.lang.Throwable -> L537
            java.lang.String r3 = "Log and bundle disabled. package_name"
            r0.zzb(r3, r14)     // Catch: java.lang.Throwable -> L537
            byte[] r15 = new byte[r12]     // Catch: java.lang.Throwable -> L537
            goto L74
        L95:
            com.google.android.gms.internal.measurement.zzhw r13 = com.google.android.gms.internal.measurement.zzhx.zzz()     // Catch: java.lang.Throwable -> L537
            r10 = 1
            r13.zzar(r10)     // Catch: java.lang.Throwable -> L537
            java.lang.String r8 = "android"
            r13.zzan(r8)     // Catch: java.lang.Throwable -> L537
            java.lang.String r8 = r6.zzC()     // Catch: java.lang.Throwable -> L537
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L537
            if (r8 != 0) goto Lb3
            java.lang.String r8 = r6.zzC()     // Catch: java.lang.Throwable -> L537
            r13.zzI(r8)     // Catch: java.lang.Throwable -> L537
        Lb3:
            java.lang.String r8 = r6.zzE()     // Catch: java.lang.Throwable -> L537
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L537
            if (r8 != 0) goto Lca
            java.lang.String r8 = r6.zzE()     // Catch: java.lang.Throwable -> L537
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch: java.lang.Throwable -> L537
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L537
            r13.zzK(r8)     // Catch: java.lang.Throwable -> L537
        Lca:
            java.lang.String r8 = r6.zzF()     // Catch: java.lang.Throwable -> L537
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L537
            if (r8 != 0) goto Le1
            java.lang.String r8 = r6.zzF()     // Catch: java.lang.Throwable -> L537
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch: java.lang.Throwable -> L537
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L537
            r13.zzL(r8)     // Catch: java.lang.Throwable -> L537
        Le1:
            long r8 = r6.zze()     // Catch: java.lang.Throwable -> L537
            r16 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r11 == 0) goto Lf4
            long r8 = r6.zze()     // Catch: java.lang.Throwable -> L537
            int r9 = (int) r8     // Catch: java.lang.Throwable -> L537
            r13.zzM(r9)     // Catch: java.lang.Throwable -> L537
        Lf4:
            long r8 = r6.zzq()     // Catch: java.lang.Throwable -> L537
            r13.zzai(r8)     // Catch: java.lang.Throwable -> L537
            long r8 = r6.zzo()     // Catch: java.lang.Throwable -> L537
            r13.zzZ(r8)     // Catch: java.lang.Throwable -> L537
            java.lang.String r8 = r6.zzH()     // Catch: java.lang.Throwable -> L537
            java.lang.String r9 = r6.zzA()     // Catch: java.lang.Throwable -> L537
            boolean r11 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L537
            if (r11 != 0) goto L114
            r13.zzah(r8)     // Catch: java.lang.Throwable -> L537
            goto L11d
        L114:
            boolean r8 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L537
            if (r8 != 0) goto L11d
            r13.zzH(r9)     // Catch: java.lang.Throwable -> L537
        L11d:
            long r8 = r6.zzw()     // Catch: java.lang.Throwable -> L537
            r13.zzay(r8)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzpv r8 = r2.zzg     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzjx r8 = r8.zzu(r14)     // Catch: java.lang.Throwable -> L537
            long r10 = r6.zzn()     // Catch: java.lang.Throwable -> L537
            r13.zzW(r10)     // Catch: java.lang.Throwable -> L537
            boolean r3 = r3.zzJ()     // Catch: java.lang.Throwable -> L537
            if (r3 == 0) goto L158
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzam r3 = r3.zzf()     // Catch: java.lang.Throwable -> L537
            java.lang.String r9 = r13.zzaF()     // Catch: java.lang.Throwable -> L537
            boolean r3 = r3.zzy(r9)     // Catch: java.lang.Throwable -> L537
            if (r3 == 0) goto L158
            com.google.android.gms.measurement.internal.zzjw r3 = com.google.android.gms.measurement.internal.zzjw.zza     // Catch: java.lang.Throwable -> L537
            boolean r3 = r8.zzr(r3)     // Catch: java.lang.Throwable -> L537
            if (r3 == 0) goto L158
            boolean r3 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L537
            if (r3 != 0) goto L158
            r13.zzY(r15)     // Catch: java.lang.Throwable -> L537
        L158:
            java.lang.String r3 = r8.zzp()     // Catch: java.lang.Throwable -> L537
            r13.zzT(r3)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzjw r3 = com.google.android.gms.measurement.internal.zzjw.zza     // Catch: java.lang.Throwable -> L537
            boolean r3 = r8.zzr(r3)     // Catch: java.lang.Throwable -> L537
            if (r3 == 0) goto L1c6
            boolean r3 = r6.zzaI()     // Catch: java.lang.Throwable -> L537
            if (r3 == 0) goto L1c6
            com.google.android.gms.measurement.internal.zzoa r3 = r5.zzw()     // Catch: java.lang.Throwable -> L537
            java.lang.String r5 = r6.zzC()     // Catch: java.lang.Throwable -> L537
            android.util.Pair r3 = r3.zzd(r5, r8)     // Catch: java.lang.Throwable -> L537
            boolean r5 = r6.zzaI()     // Catch: java.lang.Throwable -> L537
            if (r5 == 0) goto L1c6
            java.lang.Object r5 = r3.first     // Catch: java.lang.Throwable -> L537
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L537
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L537
            if (r5 != 0) goto L1c6
            java.lang.Object r5 = r3.first     // Catch: java.lang.SecurityException -> L1a8 java.lang.Throwable -> L537
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.SecurityException -> L1a8 java.lang.Throwable -> L537
            long r9 = r4.zzd     // Catch: java.lang.SecurityException -> L1a8 java.lang.Throwable -> L537
            java.lang.String r9 = java.lang.Long.toString(r9)     // Catch: java.lang.SecurityException -> L1a8 java.lang.Throwable -> L537
            java.lang.String r5 = com.google.android.gms.measurement.internal.zzmc.zza(r5, r9)     // Catch: java.lang.SecurityException -> L1a8 java.lang.Throwable -> L537
            r13.zzas(r5)     // Catch: java.lang.SecurityException -> L1a8 java.lang.Throwable -> L537
            java.lang.Object r3 = r3.second     // Catch: java.lang.Throwable -> L537
            if (r3 == 0) goto L1c6
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L537
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L537
            r13.zzal(r3)     // Catch: java.lang.Throwable -> L537
            goto L1c6
        L1a8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzd()     // Catch: java.lang.Throwable -> L537
            java.lang.String r4 = "Resettable device id encryption failed"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L537
            r3.zzb(r4, r0)     // Catch: java.lang.Throwable -> L537
            byte[] r15 = new byte[r12]     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzpv r0 = r2.zzg
        L1c0:
            com.google.android.gms.measurement.internal.zzaw r0 = r0.zzj()
            goto L78
        L1c6:
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzbb r5 = r3.zzg()     // Catch: java.lang.Throwable -> L537
            r5.zzv()     // Catch: java.lang.Throwable -> L537
            java.lang.String r5 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L537
            r13.zzX(r5)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzbb r5 = r3.zzg()     // Catch: java.lang.Throwable -> L537
            r5.zzv()     // Catch: java.lang.Throwable -> L537
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L537
            r13.zzam(r5)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzbb r5 = r3.zzg()     // Catch: java.lang.Throwable -> L537
            long r9 = r5.zza()     // Catch: java.lang.Throwable -> L537
            int r5 = (int) r9     // Catch: java.lang.Throwable -> L537
            r13.zzaz(r5)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzbb r3 = r3.zzg()     // Catch: java.lang.Throwable -> L537
            java.lang.String r3 = r3.zzb()     // Catch: java.lang.Throwable -> L537
            r13.zzaD(r3)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzjw r3 = com.google.android.gms.measurement.internal.zzjw.zzb     // Catch: java.lang.SecurityException -> L518 java.lang.Throwable -> L537
            boolean r3 = r8.zzr(r3)     // Catch: java.lang.SecurityException -> L518 java.lang.Throwable -> L537
            if (r3 == 0) goto L21c
            java.lang.String r3 = r6.zzD()     // Catch: java.lang.SecurityException -> L518 java.lang.Throwable -> L537
            if (r3 == 0) goto L21c
            java.lang.String r3 = r6.zzD()     // Catch: java.lang.SecurityException -> L518 java.lang.Throwable -> L537
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.SecurityException -> L518 java.lang.Throwable -> L537
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.SecurityException -> L518 java.lang.Throwable -> L537
            long r8 = r4.zzd     // Catch: java.lang.SecurityException -> L518 java.lang.Throwable -> L537
            java.lang.String r5 = java.lang.Long.toString(r8)     // Catch: java.lang.SecurityException -> L518 java.lang.Throwable -> L537
            java.lang.String r3 = com.google.android.gms.measurement.internal.zzmc.zza(r3, r5)     // Catch: java.lang.SecurityException -> L518 java.lang.Throwable -> L537
            r13.zzJ(r3)     // Catch: java.lang.SecurityException -> L518 java.lang.Throwable -> L537
        L21c:
            java.lang.String r3 = r6.zzG()     // Catch: java.lang.Throwable -> L537
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L537
            if (r3 != 0) goto L233
            java.lang.String r3 = r6.zzG()     // Catch: java.lang.Throwable -> L537
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L537
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L537
            r13.zzag(r3)     // Catch: java.lang.Throwable -> L537
        L233:
            java.lang.String r3 = r6.zzC()     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzpv r5 = r2.zzg     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzaw r8 = r5.zzj()     // Catch: java.lang.Throwable -> L537
            java.util.List r8 = r8.zzE(r3)     // Catch: java.lang.Throwable -> L537
            java.util.Iterator r9 = r8.iterator()     // Catch: java.lang.Throwable -> L537
        L245:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L537
            if (r10 == 0) goto L25e
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzqd r10 = (com.google.android.gms.measurement.internal.zzqd) r10     // Catch: java.lang.Throwable -> L537
            java.lang.String r11 = "_lte"
            java.lang.String r12 = r10.zzc     // Catch: java.lang.Throwable -> L537
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> L537
            if (r11 == 0) goto L25c
            goto L25f
        L25c:
            r12 = 0
            goto L245
        L25e:
            r10 = r15
        L25f:
            r25 = 0
            if (r10 == 0) goto L267
            java.lang.Object r9 = r10.zze     // Catch: java.lang.Throwable -> L537
            if (r9 != 0) goto L28c
        L267:
            com.google.android.gms.measurement.internal.zzqd r9 = new com.google.android.gms.measurement.internal.zzqd     // Catch: java.lang.Throwable -> L537
            java.lang.String r19 = "auto"
            java.lang.String r20 = "_lte"
            com.google.android.gms.measurement.internal.zzio r10 = r2.zzu     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.common.util.Clock r10 = r10.zzaU()     // Catch: java.lang.Throwable -> L537
            long r21 = r10.currentTimeMillis()     // Catch: java.lang.Throwable -> L537
            java.lang.Long r23 = java.lang.Long.valueOf(r25)     // Catch: java.lang.Throwable -> L537
            r17 = r9
            r18 = r3
            r17.<init>(r18, r19, r20, r21, r23)     // Catch: java.lang.Throwable -> L537
            r8.add(r9)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzaw r3 = r5.zzj()     // Catch: java.lang.Throwable -> L537
            r3.zzai(r9)     // Catch: java.lang.Throwable -> L537
        L28c:
            int r3 = r8.size()     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.internal.measurement.zzio[] r3 = new com.google.android.gms.internal.measurement.zzio[r3]     // Catch: java.lang.Throwable -> L537
            r9 = 0
        L293:
            int r10 = r8.size()     // Catch: java.lang.Throwable -> L537
            if (r9 >= r10) goto L2cd
            com.google.android.gms.internal.measurement.zzin r10 = com.google.android.gms.internal.measurement.zzio.zze()     // Catch: java.lang.Throwable -> L537
            java.lang.Object r11 = r8.get(r9)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzqd r11 = (com.google.android.gms.measurement.internal.zzqd) r11     // Catch: java.lang.Throwable -> L537
            java.lang.String r11 = r11.zzc     // Catch: java.lang.Throwable -> L537
            r10.zzf(r11)     // Catch: java.lang.Throwable -> L537
            java.lang.Object r11 = r8.get(r9)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzqd r11 = (com.google.android.gms.measurement.internal.zzqd) r11     // Catch: java.lang.Throwable -> L537
            long r11 = r11.zzd     // Catch: java.lang.Throwable -> L537
            r10.zzg(r11)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzqa r11 = r5.zzA()     // Catch: java.lang.Throwable -> L537
            java.lang.Object r12 = r8.get(r9)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzqd r12 = (com.google.android.gms.measurement.internal.zzqd) r12     // Catch: java.lang.Throwable -> L537
            java.lang.Object r12 = r12.zze     // Catch: java.lang.Throwable -> L537
            r11.zzx(r10, r12)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.internal.measurement.zzmd r10 = r10.zzba()     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.internal.measurement.zzio r10 = (com.google.android.gms.internal.measurement.zzio) r10     // Catch: java.lang.Throwable -> L537
            r3[r9] = r10     // Catch: java.lang.Throwable -> L537
            int r9 = r9 + 1
            goto L293
        L2cd:
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch: java.lang.Throwable -> L537
            r13.zzm(r3)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzpv r3 = r2.zzg     // Catch: java.lang.Throwable -> L537
            r3.zzQ(r6, r13)     // Catch: java.lang.Throwable -> L537
            r3.zzaa(r6, r13)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzhf r8 = com.google.android.gms.measurement.internal.zzhf.zzb(r4)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzio r12 = r2.zzu     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzqf r9 = r12.zzw()     // Catch: java.lang.Throwable -> L537
            android.os.Bundle r10 = r8.zzd     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzaw r11 = r5.zzj()     // Catch: java.lang.Throwable -> L537
            android.os.Bundle r11 = r11.zzk(r14)     // Catch: java.lang.Throwable -> L537
            r9.zzO(r10, r11)     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzqf r9 = r12.zzw()     // Catch: java.lang.Throwable -> L537
            com.google.android.gms.measurement.internal.zzam r11 = r12.zzf()     // Catch: java.lang.Throwable -> L537
            int r11 = r11.zzf(r14)     // Catch: java.lang.Throwable -> L537
            r9.zzQ(r8, r11)     // Catch: java.lang.Throwable -> L537
            java.lang.String r8 = "_c"
            r22 = r2
            r1 = 1
            r10.putLong(r8, r1)     // Catch: java.lang.Throwable -> L514
            com.google.android.gms.measurement.internal.zzhe r8 = r12.zzaW()     // Catch: java.lang.Throwable -> L514
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzd()     // Catch: java.lang.Throwable -> L514
            java.lang.String r9 = "Marking in-app purchase as real-time"
            r8.zza(r9)     // Catch: java.lang.Throwable -> L514
            r10.putLong(r0, r1)     // Catch: java.lang.Throwable -> L514
            java.lang.String r8 = "_o"
            java.lang.String r11 = r4.zzc     // Catch: java.lang.Throwable -> L514
            r10.putString(r8, r11)     // Catch: java.lang.Throwable -> L514
            com.google.android.gms.measurement.internal.zzqf r8 = r12.zzw()     // Catch: java.lang.Throwable -> L514
            java.lang.String r9 = r13.zzaF()     // Catch: java.lang.Throwable -> L514
            java.lang.String r15 = r6.zzM()     // Catch: java.lang.Throwable -> L514
            boolean r8 = r8.zzak(r9, r15)     // Catch: java.lang.Throwable -> L514
            if (r8 == 0) goto L348
            com.google.android.gms.measurement.internal.zzqf r8 = r12.zzw()     // Catch: java.lang.Throwable -> L514
            java.lang.String r9 = "_dbg"
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L514
            r8.zzS(r10, r9, r1)     // Catch: java.lang.Throwable -> L514
            com.google.android.gms.measurement.internal.zzqf r2 = r12.zzw()     // Catch: java.lang.Throwable -> L514
            r2.zzS(r10, r0, r1)     // Catch: java.lang.Throwable -> L514
        L348:
            com.google.android.gms.measurement.internal.zzaw r0 = r5.zzj()     // Catch: java.lang.Throwable -> L514
            java.lang.String r1 = r4.zza     // Catch: java.lang.Throwable -> L514
            com.google.android.gms.measurement.internal.zzbd r0 = r0.zzs(r14, r1)     // Catch: java.lang.Throwable -> L514
            if (r0 != 0) goto L38c
            com.google.android.gms.measurement.internal.zzbd r0 = new com.google.android.gms.measurement.internal.zzbd     // Catch: java.lang.Throwable -> L514
            long r8 = r4.zzd     // Catch: java.lang.Throwable -> L514
            r17 = 0
            r27 = r8
            r8 = r17
            r2 = r10
            r29 = r11
            r15 = 1
            r10 = r17
            r16 = 0
            r24 = r12
            r30 = r13
            r12 = r16
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r31 = r5
            r5 = r0
            r32 = r6
            r6 = r14
            r33 = r7
            r7 = r1
            r35 = r3
            r34 = r14
            r3 = 1
            r23 = 0
            r14 = r27
            r5.<init>(r6, r7, r8, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L514
            r12 = r25
            goto L3a9
        L38c:
            r35 = r3
            r31 = r5
            r32 = r6
            r33 = r7
            r2 = r10
            r29 = r11
            r24 = r12
            r30 = r13
            r34 = r14
            r3 = 1
            r23 = 0
            long r5 = r0.zzf     // Catch: java.lang.Throwable -> L514
            long r7 = r4.zzd     // Catch: java.lang.Throwable -> L514
            com.google.android.gms.measurement.internal.zzbd r0 = r0.zzc(r7)     // Catch: java.lang.Throwable -> L514
            r12 = r5
        L3a9:
            com.google.android.gms.measurement.internal.zzaw r5 = r31.zzj()     // Catch: java.lang.Throwable -> L514
            r5.zzV(r0)     // Catch: java.lang.Throwable -> L514
            com.google.android.gms.measurement.internal.zzbc r15 = new com.google.android.gms.measurement.internal.zzbc     // Catch: java.lang.Throwable -> L514
            r14 = r22
            com.google.android.gms.measurement.internal.zzio r6 = r14.zzu     // Catch: java.lang.Throwable -> L511
            long r10 = r4.zzd     // Catch: java.lang.Throwable -> L511
            r5 = r15
            r7 = r29
            r8 = r34
            r9 = r1
            r4 = r14
            r14 = r2
            r5.<init>(r6, r7, r8, r9, r10, r12, r14)     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.internal.measurement.zzhl r2 = com.google.android.gms.internal.measurement.zzhm.zze()     // Catch: java.lang.Throwable -> L535
            long r5 = r15.zzd     // Catch: java.lang.Throwable -> L535
            r2.zzm(r5)     // Catch: java.lang.Throwable -> L535
            java.lang.String r5 = r15.zzb     // Catch: java.lang.Throwable -> L535
            r2.zzi(r5)     // Catch: java.lang.Throwable -> L535
            long r5 = r15.zze     // Catch: java.lang.Throwable -> L535
            r2.zzl(r5)     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzbf r5 = r15.zzf     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzbe r6 = new com.google.android.gms.measurement.internal.zzbe     // Catch: java.lang.Throwable -> L535
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L535
        L3dd:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L535
            if (r7 == 0) goto L3ff
            java.lang.String r7 = r6.zza()     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.internal.measurement.zzhp r8 = com.google.android.gms.internal.measurement.zzhq.zze()     // Catch: java.lang.Throwable -> L535
            r8.zzj(r7)     // Catch: java.lang.Throwable -> L535
            java.lang.Object r7 = r5.zzf(r7)     // Catch: java.lang.Throwable -> L535
            if (r7 == 0) goto L3dd
            com.google.android.gms.measurement.internal.zzqa r9 = r31.zzA()     // Catch: java.lang.Throwable -> L535
            r9.zzw(r8, r7)     // Catch: java.lang.Throwable -> L535
            r2.zze(r8)     // Catch: java.lang.Throwable -> L535
            goto L3dd
        L3ff:
            r5 = r30
            r5.zzn(r2)     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.internal.measurement.zzhy r6 = com.google.android.gms.internal.measurement.zzia.zza()     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.internal.measurement.zzhn r7 = com.google.android.gms.internal.measurement.zzho.zza()     // Catch: java.lang.Throwable -> L535
            long r8 = r0.zzc     // Catch: java.lang.Throwable -> L535
            r7.zza(r8)     // Catch: java.lang.Throwable -> L535
            r7.zzb(r1)     // Catch: java.lang.Throwable -> L535
            r6.zza(r7)     // Catch: java.lang.Throwable -> L535
            r5.zzao(r6)     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzae r10 = r31.zzh()     // Catch: java.lang.Throwable -> L535
            java.lang.String r11 = r32.zzC()     // Catch: java.lang.Throwable -> L535
            java.util.List r12 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L535
            java.util.List r13 = r5.zzaN()     // Catch: java.lang.Throwable -> L535
            long r0 = r2.zzc()     // Catch: java.lang.Throwable -> L535
            java.lang.Long r14 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L535
            long r0 = r2.zzc()     // Catch: java.lang.Throwable -> L535
            java.lang.Long r15 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L535
            r16 = 0
            java.util.List r0 = r10.zza(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L535
            r5.zzi(r0)     // Catch: java.lang.Throwable -> L535
            boolean r0 = r2.zzq()     // Catch: java.lang.Throwable -> L535
            if (r0 == 0) goto L457
            long r0 = r2.zzc()     // Catch: java.lang.Throwable -> L535
            r5.zzax(r0)     // Catch: java.lang.Throwable -> L535
            long r0 = r2.zzc()     // Catch: java.lang.Throwable -> L535
            r5.zzab(r0)     // Catch: java.lang.Throwable -> L535
        L457:
            long r0 = r32.zzs()     // Catch: java.lang.Throwable -> L535
            int r2 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r2 == 0) goto L462
            r5.zzap(r0)     // Catch: java.lang.Throwable -> L535
        L462:
            long r6 = r32.zzu()     // Catch: java.lang.Throwable -> L535
            int r8 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r8 == 0) goto L46e
            r5.zzaq(r6)     // Catch: java.lang.Throwable -> L535
            goto L473
        L46e:
            if (r2 == 0) goto L473
            r5.zzaq(r0)     // Catch: java.lang.Throwable -> L535
        L473:
            java.lang.String r0 = r32.zzL()     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.internal.measurement.zzrd.zzb()     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzam r1 = r24.zzf()     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaL     // Catch: java.lang.Throwable -> L535
            r6 = r34
            boolean r1 = r1.zzx(r6, r2)     // Catch: java.lang.Throwable -> L535
            if (r1 == 0) goto L48d
            if (r0 == 0) goto L48d
            r5.zzav(r0)     // Catch: java.lang.Throwable -> L535
        L48d:
            r32.zzP()     // Catch: java.lang.Throwable -> L535
            long r0 = r32.zzt()     // Catch: java.lang.Throwable -> L535
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L535
            r5.zzP(r1)     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzam r0 = r24.zzf()     // Catch: java.lang.Throwable -> L535
            r0.zzj()     // Catch: java.lang.Throwable -> L535
            r0 = 119002(0x1d0da, double:5.8795E-319)
            r5.zzaB(r0)     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.common.util.Clock r0 = r24.zzaU()     // Catch: java.lang.Throwable -> L535
            long r0 = r0.currentTimeMillis()     // Catch: java.lang.Throwable -> L535
            r5.zzaA(r0)     // Catch: java.lang.Throwable -> L535
            r5.zzau(r3)     // Catch: java.lang.Throwable -> L535
            java.lang.String r0 = r5.zzaF()     // Catch: java.lang.Throwable -> L535
            r1 = r35
            r1.zzN(r0, r5)     // Catch: java.lang.Throwable -> L535
            r0 = r33
            r0.zzc(r5)     // Catch: java.lang.Throwable -> L535
            long r1 = r5.zzf()     // Catch: java.lang.Throwable -> L535
            r3 = r32
            r3.zzau(r1)     // Catch: java.lang.Throwable -> L535
            long r1 = r5.zze()     // Catch: java.lang.Throwable -> L535
            r3.zzas(r1)     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzaw r1 = r31.zzj()     // Catch: java.lang.Throwable -> L535
            r2 = 0
            r1.zzT(r3, r2, r2)     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzaw r1 = r31.zzj()     // Catch: java.lang.Throwable -> L535
            r1.zzS()     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzaw r1 = r31.zzj()
            r1.zzL()
            com.google.android.gms.measurement.internal.zzqa r1 = r31.zzA()     // Catch: java.io.IOException -> L4fa
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch: java.io.IOException -> L4fa
            com.google.android.gms.internal.measurement.zzhv r0 = (com.google.android.gms.internal.measurement.zzhv) r0     // Catch: java.io.IOException -> L4fa
            byte[] r0 = r0.zzcd()     // Catch: java.io.IOException -> L4fa
            byte[] r15 = r1.zzB(r0)     // Catch: java.io.IOException -> L4fa
            goto L534
        L4fa:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)
            java.lang.String r3 = "Data loss. Failed to bundle and serialize. appId"
            r1.zzc(r3, r2, r0)
            r15 = r23
            goto L534
        L511:
            r0 = move-exception
            r4 = r14
            goto L539
        L514:
            r0 = move-exception
            r4 = r22
            goto L539
        L518:
            r0 = move-exception
            r4 = r2
            r2 = 0
            com.google.android.gms.measurement.internal.zzio r1 = r4.zzu     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()     // Catch: java.lang.Throwable -> L535
            java.lang.String r3 = "app instance id encryption failed"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L535
            r1.zzb(r3, r0)     // Catch: java.lang.Throwable -> L535
            byte[] r15 = new byte[r2]     // Catch: java.lang.Throwable -> L535
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zzg
            goto L1c0
        L534:
            return r15
        L535:
            r0 = move-exception
            goto L539
        L537:
            r0 = move-exception
            r4 = r2
        L539:
            com.google.android.gms.measurement.internal.zzpv r1 = r4.zzg
            com.google.android.gms.measurement.internal.zzaw r1 = r1.zzj()
            r1.zzL()
            throw r0
    }
}
