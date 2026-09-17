package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzjp extends com.google.android.gms.measurement.internal.zzgk {
    private final com.google.android.gms.measurement.internal.zzpv zza;
    private java.lang.Boolean zzb;
    private java.lang.String zzc;

    public zzjp(com.google.android.gms.measurement.internal.zzpv r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zza = r1
            r1 = 0
            r0.zzc = r1
            return
    }

    public static /* synthetic */ void zzE(com.google.android.gms.measurement.internal.zzjp r0, com.google.android.gms.measurement.internal.zzr r1) {
            com.google.android.gms.measurement.internal.zzpv r0 = r0.zza
            r0.zzL()
            r0.zzak(r1)
            return
    }

    public static /* synthetic */ void zzF(com.google.android.gms.measurement.internal.zzjp r0, com.google.android.gms.measurement.internal.zzr r1, com.google.android.gms.measurement.internal.zzag r2) {
            com.google.android.gms.measurement.internal.zzpv r0 = r0.zza
            r0.zzL()
            java.lang.String r1 = r1.zza
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.zzap(r1, r2)
            return
    }

    public static /* synthetic */ void zzG(com.google.android.gms.measurement.internal.zzjp r0, com.google.android.gms.measurement.internal.zzr r1) {
            com.google.android.gms.measurement.internal.zzpv r0 = r0.zza
            r0.zzL()
            r0.zzai(r1)
            return
    }

    public static /* synthetic */ void zzH(com.google.android.gms.measurement.internal.zzjp r1, com.google.android.gms.measurement.internal.zzr r2, android.os.Bundle r3, com.google.android.gms.measurement.internal.zzgo r4, java.lang.String r5) {
            com.google.android.gms.measurement.internal.zzpv r0 = r1.zza
            r0.zzL()
            java.util.List r2 = r0.zzF(r2, r3)
            r4.zze(r2)     // Catch: android.os.RemoteException -> Ld
            return
        Ld:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzpv r1 = r1.zza
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r3 = "Failed to return trigger URIs for app"
            r1.zzc(r3, r5, r2)
            return
    }

    public static /* synthetic */ void zzI(com.google.android.gms.measurement.internal.zzjp r16, android.os.Bundle r17, java.lang.String r18, com.google.android.gms.measurement.internal.zzr r19) {
            r1 = r16
            r12 = r17
            r13 = r18
            com.google.android.gms.measurement.internal.zzpv r0 = r1.zza
            com.google.android.gms.measurement.internal.zzam r2 = r0.zzi()
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zzbc
            r14 = 0
            boolean r2 = r2.zzx(r14, r3)
            com.google.android.gms.measurement.internal.zzam r3 = r0.zzi()
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzbe
            boolean r15 = r3.zzx(r14, r4)
            boolean r3 = r17.isEmpty()
            if (r3 == 0) goto L52
            if (r2 == 0) goto L52
            com.google.android.gms.measurement.internal.zzpv r0 = r1.zza
            com.google.android.gms.measurement.internal.zzaw r1 = r0.zzj()
            r1.zzg()
            r1.zzav()
            android.database.sqlite.SQLiteDatabase r0 = r1.zzj()     // Catch: android.database.sqlite.SQLiteException -> L41
            java.lang.String r2 = "delete from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: android.database.sqlite.SQLiteException -> L41
            r4 = 0
            r3[r4] = r13     // Catch: android.database.sqlite.SQLiteException -> L41
            r0.execSQL(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L41
            return
        L41:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Error clearing default event params"
            r1.zzb(r2, r0)
            return
        L52:
            com.google.android.gms.measurement.internal.zzaw r11 = r0.zzj()
            r11.zzg()
            r11.zzav()
            com.google.android.gms.measurement.internal.zzio r3 = r11.zzu
            com.google.android.gms.measurement.internal.zzbc r0 = new com.google.android.gms.measurement.internal.zzbc
            r7 = 0
            r9 = 0
            java.lang.String r4 = ""
            java.lang.String r6 = "dep"
            r2 = r0
            r5 = r18
            r14 = r11
            r11 = r17
            r2.<init>(r3, r4, r5, r6, r7, r9, r11)
            com.google.android.gms.measurement.internal.zzpv r2 = r14.zzg
            com.google.android.gms.measurement.internal.zzqa r2 = r2.zzA()
            com.google.android.gms.internal.measurement.zzhm r0 = r2.zzm(r0)
            byte[] r0 = r0.zzcd()
            com.google.android.gms.measurement.internal.zzio r2 = r14.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()
            int r4 = r0.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Saving default event parameters, appId, data size"
            r3.zzc(r5, r13, r4)
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r4 = "app_id"
            r3.put(r4, r13)
            java.lang.String r4 = "parameters"
            r3.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r14.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lc6
            java.lang.String r4 = "default_event_params"
            r5 = 5
            r6 = 0
            long r3 = r0.insertWithOnConflict(r4, r6, r3, r5)     // Catch: android.database.sqlite.SQLiteException -> Lc6
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto Lda
            com.google.android.gms.measurement.internal.zzhe r0 = r2.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Lc6
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: android.database.sqlite.SQLiteException -> Lc6
            java.lang.String r2 = "Failed to insert default event parameters (got -1). appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r18)     // Catch: android.database.sqlite.SQLiteException -> Lc6
            r0.zzb(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> Lc6
            goto Lda
        Lc6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r14.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r18)
            java.lang.String r4 = "Error storing default event parameters. appId"
            r2.zzc(r4, r3, r0)
        Lda:
            com.google.android.gms.measurement.internal.zzpv r0 = r1.zza
            com.google.android.gms.measurement.internal.zzaw r1 = r0.zzj()
            r2 = r19
            long r2 = r2.zzF
            boolean r1 = r1.zzag(r13, r2)
            if (r1 == 0) goto L101
            if (r15 == 0) goto Lf9
            com.google.android.gms.measurement.internal.zzaw r0 = r0.zzj()
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r2 = 0
            r0.zzG(r13, r1, r2, r12)
            return
        Lf9:
            r2 = 0
            com.google.android.gms.measurement.internal.zzaw r0 = r0.zzj()
            r0.zzG(r13, r2, r2, r12)
        L101:
            return
    }

    private final void zzM(com.google.android.gms.measurement.internal.zzr r2, boolean r3) {
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r3 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            r0 = 0
            r1.zzN(r3, r0)
            com.google.android.gms.measurement.internal.zzpv r3 = r1.zza
            com.google.android.gms.measurement.internal.zzqf r3 = r3.zzB()
            java.lang.String r0 = r2.zzb
            java.lang.String r2 = r2.zzp
            r3.zzac(r0, r2)
            return
    }

    private final void zzN(java.lang.String r5, boolean r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L90
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L4c
            java.lang.Boolean r6 = r4.zzb     // Catch: java.lang.SecurityException -> L7b
            if (r6 != 0) goto L44
            java.lang.String r6 = "com.google.android.gms"
            java.lang.String r2 = r4.zzc     // Catch: java.lang.SecurityException -> L7b
            boolean r6 = r6.equals(r2)     // Catch: java.lang.SecurityException -> L7b
            if (r6 != 0) goto L3d
            com.google.android.gms.measurement.internal.zzpv r6 = r4.zza     // Catch: java.lang.SecurityException -> L7b
            android.content.Context r2 = r6.zzaT()     // Catch: java.lang.SecurityException -> L7b
            int r3 = android.os.Binder.getCallingUid()     // Catch: java.lang.SecurityException -> L7b
            boolean r2 = com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(r2, r3)     // Catch: java.lang.SecurityException -> L7b
            if (r2 != 0) goto L3d
            android.content.Context r6 = r6.zzaT()     // Catch: java.lang.SecurityException -> L7b
            com.google.android.gms.common.GoogleSignatureVerifier r6 = com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r6)     // Catch: java.lang.SecurityException -> L7b
            int r2 = android.os.Binder.getCallingUid()     // Catch: java.lang.SecurityException -> L7b
            boolean r6 = r6.isUidGoogleSigned(r2)     // Catch: java.lang.SecurityException -> L7b
            if (r6 == 0) goto L3b
            goto L3d
        L3b:
            r6 = 0
            goto L3e
        L3d:
            r6 = 1
        L3e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.SecurityException -> L7b
            r4.zzb = r6     // Catch: java.lang.SecurityException -> L7b
        L44:
            java.lang.Boolean r6 = r4.zzb     // Catch: java.lang.SecurityException -> L7b
            boolean r6 = r6.booleanValue()     // Catch: java.lang.SecurityException -> L7b
            if (r6 != 0) goto L6a
        L4c:
            java.lang.String r6 = r4.zzc     // Catch: java.lang.SecurityException -> L7b
            if (r6 != 0) goto L62
            com.google.android.gms.measurement.internal.zzpv r6 = r4.zza     // Catch: java.lang.SecurityException -> L7b
            android.content.Context r6 = r6.zzaT()     // Catch: java.lang.SecurityException -> L7b
            int r2 = android.os.Binder.getCallingUid()     // Catch: java.lang.SecurityException -> L7b
            boolean r6 = com.google.android.gms.common.GooglePlayServicesUtilLight.uidHasPackageName(r6, r2, r5)     // Catch: java.lang.SecurityException -> L7b
            if (r6 == 0) goto L62
            r4.zzc = r5     // Catch: java.lang.SecurityException -> L7b
        L62:
            java.lang.String r6 = r4.zzc     // Catch: java.lang.SecurityException -> L7b
            boolean r6 = r5.equals(r6)     // Catch: java.lang.SecurityException -> L7b
            if (r6 == 0) goto L6b
        L6a:
            return
        L6b:
            java.lang.SecurityException r6 = new java.lang.SecurityException     // Catch: java.lang.SecurityException -> L7b
            java.lang.String r2 = "Unknown calling package name '%s'."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.SecurityException -> L7b
            r1[r0] = r5     // Catch: java.lang.SecurityException -> L7b
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch: java.lang.SecurityException -> L7b
            r6.<init>(r0)     // Catch: java.lang.SecurityException -> L7b
            throw r6     // Catch: java.lang.SecurityException -> L7b
        L7b:
            r6 = move-exception
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zza
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)
            java.lang.String r1 = "Measurement Service called with invalid calling package. appId"
            r0.zzb(r1, r5)
            throw r6
        L90:
            com.google.android.gms.measurement.internal.zzpv r5 = r4.zza
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()
            java.lang.String r6 = "Measurement Service called without app package"
            r5.zza(r6)
            java.lang.SecurityException r5 = new java.lang.SecurityException
            r5.<init>(r6)
            throw r5
    }

    private final void zzO(com.google.android.gms.measurement.internal.zzbh r2, com.google.android.gms.measurement.internal.zzr r3) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r1.zza
            r0.zzL()
            r0.zzS(r2, r3)
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzpv zzc(com.google.android.gms.measurement.internal.zzjp r0) {
            com.google.android.gms.measurement.internal.zzpv r0 = r0.zza
            return r0
    }

    public static /* synthetic */ void zzd(com.google.android.gms.measurement.internal.zzjp r10, java.lang.String r11, com.google.android.gms.measurement.internal.zzpc r12, com.google.android.gms.measurement.internal.zzgr r13) {
            com.google.android.gms.measurement.internal.zzpv r0 = r10.zza
            r0.zzL()
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaP
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            if (r1 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzpe r12 = new com.google.android.gms.measurement.internal.zzpe
            java.util.List r0 = java.util.Collections.emptyList()
            r12.<init>(r0)
            goto L154
        L1d:
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            r1.zzg()
            r0.zzM()
            com.google.android.gms.measurement.internal.zzaw r1 = r0.zzj()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzA
            java.lang.Object r2 = r2.zza(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.List r12 = r1.zzD(r11, r12, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r12.iterator()
        L44:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L14f
            java.lang.Object r2 = r12.next()
            com.google.android.gms.measurement.internal.zzpz r2 = (com.google.android.gms.measurement.internal.zzpz) r2
            java.lang.String r4 = r2.zzh()
            boolean r4 = r0.zzay(r11, r4)
            if (r4 != 0) goto L74
            com.google.android.gms.measurement.internal.zzhe r4 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzj()
            long r5 = r2.zzc()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = r2.zzh()
            java.lang.String r6 = "[sgtm] batch skipped due to destination in backoff. appId, rowId, url"
            r4.zzd(r6, r11, r5, r2)
            goto L44
        L74:
            int r4 = r2.zza()
            if (r4 > 0) goto L7b
            goto Lbf
        L7b:
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzy
            java.lang.Object r5 = r5.zza(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r4 <= r5) goto L8b
            goto L130
        L8b:
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzw
            java.lang.Object r5 = r5.zza(r3)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r7 = 1
            int r4 = r4 + (-1)
            long r7 = r7 << r4
            long r5 = r5 * r7
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzx
            java.lang.Object r4 = r4.zza(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            long r4 = java.lang.Math.min(r5, r7)
            com.google.android.gms.common.util.Clock r6 = r0.zzaU()
            long r6 = r6.currentTimeMillis()
            long r8 = r2.zzb()
            long r8 = r8 + r4
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L130
        Lbf:
            com.google.android.gms.measurement.internal.zzpa r2 = r2.zze()
            com.google.android.gms.internal.measurement.zzht r4 = com.google.android.gms.internal.measurement.zzhv.zzb()     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            byte[] r5 = r2.zzb     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            com.google.android.gms.internal.measurement.zzng r4 = com.google.android.gms.measurement.internal.zzqa.zzp(r4, r5)     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            com.google.android.gms.internal.measurement.zzht r4 = (com.google.android.gms.internal.measurement.zzht) r4     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            r5 = 0
        Ld0:
            int r6 = r4.zza()     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            if (r5 >= r6) goto Lf1
            com.google.android.gms.internal.measurement.zzhx r6 = r4.zzh(r5)     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            com.google.android.gms.internal.measurement.zzlz r6 = r6.zzch()     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            com.google.android.gms.internal.measurement.zzhw r6 = (com.google.android.gms.internal.measurement.zzhw) r6     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            com.google.android.gms.common.util.Clock r7 = r0.zzaU()     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            long r7 = r7.currentTimeMillis()     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            r6.zzaA(r7)     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            r4.zze(r5, r6)     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            int r5 = r5 + 1
            goto Ld0
        Lf1:
            com.google.android.gms.internal.measurement.zzmd r5 = r4.zzba()     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            com.google.android.gms.internal.measurement.zzhv r5 = (com.google.android.gms.internal.measurement.zzhv) r5     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            byte[] r5 = r5.zzcd()     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            r2.zzb = r5     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            java.lang.String r5 = r5.zzr()     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            r6 = 2
            boolean r5 = android.util.Log.isLoggable(r5, r6)     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            if (r5 == 0) goto L11c
            com.google.android.gms.measurement.internal.zzqa r5 = r0.zzA()     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            com.google.android.gms.internal.measurement.zzmd r4 = r4.zzba()     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            com.google.android.gms.internal.measurement.zzhv r4 = (com.google.android.gms.internal.measurement.zzhv) r4     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            java.lang.String r4 = r5.zzq(r4)     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
            r2.zzg = r4     // Catch: com.google.android.gms.internal.measurement.zzmm -> L121
        L11c:
            r1.add(r2)
            goto L44
        L121:
            com.google.android.gms.measurement.internal.zzhe r2 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()
            java.lang.String r4 = "Failed to parse queued batch. appId"
            r2.zzb(r4, r11)
            goto L44
        L130:
            com.google.android.gms.measurement.internal.zzhe r4 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzj()
            long r5 = r2.zzc()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r6 = r2.zzb()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis"
            r4.zzd(r6, r11, r5, r2)
            goto L44
        L14f:
            com.google.android.gms.measurement.internal.zzpe r12 = new com.google.android.gms.measurement.internal.zzpe
            r12.<init>(r1)
        L154:
            r13.zze(r12)     // Catch: android.os.RemoteException -> L171
            com.google.android.gms.measurement.internal.zzpv r13 = r10.zza     // Catch: android.os.RemoteException -> L171
            com.google.android.gms.measurement.internal.zzhe r13 = r13.zzaW()     // Catch: android.os.RemoteException -> L171
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zzj()     // Catch: android.os.RemoteException -> L171
            java.lang.String r0 = "[sgtm] Sending queued upload batches to client. appId, count"
            java.util.List r12 = r12.zza     // Catch: android.os.RemoteException -> L171
            int r12 = r12.size()     // Catch: android.os.RemoteException -> L171
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: android.os.RemoteException -> L171
            r13.zzc(r0, r11, r12)     // Catch: android.os.RemoteException -> L171
            return
        L171:
            r12 = move-exception
            com.google.android.gms.measurement.internal.zzpv r10 = r10.zza
            com.google.android.gms.measurement.internal.zzhe r10 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zze()
            java.lang.String r13 = "[sgtm] Failed to return upload batches for app"
            r10.zzc(r13, r11, r12)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzA(com.google.android.gms.measurement.internal.zzr r2) {
            r1 = this;
            java.lang.String r0 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            java.lang.String r0 = r2.zzu
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzir r0 = new com.google.android.gms.measurement.internal.zzir
            r0.<init>(r1, r2)
            r1.zzK(r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzB(com.google.android.gms.measurement.internal.zzqb r2, com.google.android.gms.measurement.internal.zzr r3) {
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r0 = 0
            r1.zzM(r3, r0)
            com.google.android.gms.measurement.internal.zzjm r0 = new com.google.android.gms.measurement.internal.zzjm
            r0.<init>(r1, r2, r3)
            r1.zzL(r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzC(com.google.android.gms.measurement.internal.zzr r4, com.google.android.gms.measurement.internal.zzag r5) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r3.zza
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzi()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzaP
            r2 = 0
            boolean r0 = r0.zzx(r2, r1)
            if (r0 != 0) goto L10
            return
        L10:
            r0 = 0
            r3.zzM(r4, r0)
            com.google.android.gms.measurement.internal.zzip r0 = new com.google.android.gms.measurement.internal.zzip
            r0.<init>(r3, r4, r5)
            r3.zzL(r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final byte[] zzD(com.google.android.gms.measurement.internal.zzbh r10, java.lang.String r11) {
            r9 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)
            r0 = 1
            r9.zzN(r11, r0)
            com.google.android.gms.measurement.internal.zzpv r0 = r9.zza
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzd()
            com.google.android.gms.measurement.internal.zzgx r2 = r0.zzo()
            java.lang.String r3 = r10.zza
            java.lang.String r2 = r2.zzd(r3)
            java.lang.String r4 = "Log and bundle. event"
            r1.zzb(r4, r2)
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r1 = r1.nanoTime()
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r4
            com.google.android.gms.measurement.internal.zzil r6 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzjl r7 = new com.google.android.gms.measurement.internal.zzjl
            r7.<init>(r9, r10, r11)
            java.util.concurrent.Future r6 = r6.zzh(r7)
            java.lang.Object r6 = r6.get()     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            byte[] r6 = (byte[]) r6     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            if (r6 != 0) goto L58
            com.google.android.gms.measurement.internal.zzhe r6 = r0.zzaW()     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            java.lang.String r7 = "Log and bundle returned null. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r11)     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            r6.zzb(r7, r8)     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            r6 = 0
            byte[] r6 = new byte[r6]     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
        L58:
            com.google.android.gms.common.util.Clock r7 = r0.zzaU()     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            long r7 = r7.nanoTime()     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            long r7 = r7 / r4
            com.google.android.gms.measurement.internal.zzhe r4 = r0.zzaW()     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzd()     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            java.lang.String r5 = "Log and bundle processed. event, size, time_ms"
            com.google.android.gms.measurement.internal.zzgx r0 = r0.zzo()     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            java.lang.String r0 = r0.zzd(r3)     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            int r3 = r6.length     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            long r7 = r7 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            r4.zzd(r5, r0, r3, r1)     // Catch: java.util.concurrent.ExecutionException -> L81 java.lang.InterruptedException -> L83
            return r6
        L81:
            r0 = move-exception
            goto L84
        L83:
            r0 = move-exception
        L84:
            com.google.android.gms.measurement.internal.zzpv r1 = r9.zza
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzhe.zzn(r11)
            com.google.android.gms.measurement.internal.zzgx r1 = r1.zzo()
            java.lang.String r10 = r10.zza
            java.lang.String r10 = r1.zzd(r10)
            java.lang.String r1 = "Failed to log and bundle. appId, event, error"
            r2.zzd(r1, r11, r10, r0)
            r10 = 0
            return r10
    }

    final void zzJ(com.google.android.gms.measurement.internal.zzbh r7, com.google.android.gms.measurement.internal.zzr r8) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzbn
            r1 = 0
            java.lang.Object r0 = r0.zza(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2e
            com.google.android.gms.measurement.internal.zzpv r0 = r6.zza
            com.google.android.gms.measurement.internal.zzif r2 = r0.zzr()
            java.lang.String r3 = r8.zza
            boolean r2 = r2.zzs(r3)
            if (r2 != 0) goto L21
            r6.zzO(r7, r8)
            return
        L21:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r2 = "EES config found for"
            r0.zzb(r2, r3)
        L2e:
            com.google.android.gms.measurement.internal.zzpv r0 = r6.zza
            com.google.android.gms.measurement.internal.zzif r2 = r0.zzr()
            java.lang.String r3 = r8.zza
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L3d
            goto L45
        L3d:
            androidx.collection.LruCache r1 = r2.zzd
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.measurement.zzc r1 = (com.google.android.gms.internal.measurement.zzc) r1
        L45:
            if (r1 == 0) goto L102
            com.google.android.gms.measurement.internal.zzqa r0 = r0.zzA()     // Catch: com.google.android.gms.internal.measurement.zzd -> Lda
            com.google.android.gms.measurement.internal.zzbf r2 = r7.zzb     // Catch: com.google.android.gms.internal.measurement.zzd -> Lda
            android.os.Bundle r2 = r2.zzc()     // Catch: com.google.android.gms.internal.measurement.zzd -> Lda
            r3 = 1
            java.util.Map r0 = r0.zzv(r2, r3)     // Catch: com.google.android.gms.internal.measurement.zzd -> Lda
            java.lang.String r2 = r7.zza     // Catch: com.google.android.gms.internal.measurement.zzd -> Lda
            java.lang.String r3 = com.google.android.gms.measurement.internal.zzjy.zza(r2)     // Catch: com.google.android.gms.internal.measurement.zzd -> Lda
            if (r3 == 0) goto L5f
            r2 = r3
        L5f:
            com.google.android.gms.internal.measurement.zzaa r3 = new com.google.android.gms.internal.measurement.zzaa     // Catch: com.google.android.gms.internal.measurement.zzd -> Lda
            long r4 = r7.zzd     // Catch: com.google.android.gms.internal.measurement.zzd -> Lda
            r3.<init>(r2, r4, r0)     // Catch: com.google.android.gms.internal.measurement.zzd -> Lda
            boolean r0 = r1.zze(r3)     // Catch: com.google.android.gms.internal.measurement.zzd -> Lda
            if (r0 != 0) goto L6e
            goto Led
        L6e:
            boolean r0 = r1.zzg()
            if (r0 == 0) goto L99
            com.google.android.gms.measurement.internal.zzpv r0 = r6.zza
            com.google.android.gms.measurement.internal.zzhe r2 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.String r7 = r7.zza
            java.lang.String r3 = "EES edited event"
            r2.zzb(r3, r7)
            com.google.android.gms.measurement.internal.zzqa r7 = r0.zzA()
            com.google.android.gms.internal.measurement.zzab r0 = r1.zza()
            com.google.android.gms.internal.measurement.zzaa r0 = r0.zzb()
            com.google.android.gms.measurement.internal.zzbh r7 = r7.zzj(r0)
            r6.zzO(r7, r8)
            goto L9c
        L99:
            r6.zzO(r7, r8)
        L9c:
            boolean r7 = r1.zzf()
            if (r7 == 0) goto Ld9
            com.google.android.gms.internal.measurement.zzab r7 = r1.zza()
            java.util.List r7 = r7.zzc()
            java.util.Iterator r7 = r7.iterator()
        Lae:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Ld9
            java.lang.Object r0 = r7.next()
            com.google.android.gms.internal.measurement.zzaa r0 = (com.google.android.gms.internal.measurement.zzaa) r0
            com.google.android.gms.measurement.internal.zzpv r1 = r6.zza
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.String r3 = r0.zze()
            java.lang.String r4 = "EES logging created event"
            r2.zzb(r4, r3)
            com.google.android.gms.measurement.internal.zzqa r1 = r1.zzA()
            com.google.android.gms.measurement.internal.zzbh r0 = r1.zzj(r0)
            r6.zzO(r0, r8)
            goto Lae
        Ld9:
            return
        Lda:
            com.google.android.gms.measurement.internal.zzpv r0 = r6.zza
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = r8.zzb
            java.lang.String r2 = r7.zza
            java.lang.String r3 = "EES error. appId, eventName"
            r0.zzc(r3, r1, r2)
        Led:
            com.google.android.gms.measurement.internal.zzpv r0 = r6.zza
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = r7.zza
            java.lang.String r2 = "EES was not applied to event"
            r0.zzb(r2, r1)
            r6.zzO(r7, r8)
            return
        L102:
            com.google.android.gms.measurement.internal.zzpv r0 = r6.zza
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = r8.zza
            java.lang.String r2 = "EES not loaded for"
            r0.zzb(r2, r1)
            r6.zzO(r7, r8)
            return
    }

    final void zzK(java.lang.Runnable r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.measurement.internal.zzpv r0 = r2.zza
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            boolean r1 = r1.zzu()
            if (r1 == 0) goto L13
            r3.run()
            return
        L13:
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            r0.zzr(r3)
            return
    }

    final void zzL(java.lang.Runnable r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.measurement.internal.zzpv r0 = r2.zza
            com.google.android.gms.measurement.internal.zzil r1 = r0.zzaX()
            boolean r1 = r1.zzu()
            if (r1 == 0) goto L13
            r3.run()
            return
        L13:
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            r0.zzq(r3)
            return
    }

    final com.google.android.gms.measurement.internal.zzbh zzb(com.google.android.gms.measurement.internal.zzbh r7, com.google.android.gms.measurement.internal.zzr r8) {
            r6 = this;
            java.lang.String r8 = r7.zza
            java.lang.String r0 = "_cmp"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L4b
            com.google.android.gms.measurement.internal.zzbf r2 = r7.zzb
            if (r2 == 0) goto L4b
            int r8 = r2.zza()
            if (r8 != 0) goto L15
            goto L4b
        L15:
            java.lang.String r8 = "_cis"
            java.lang.String r8 = r2.zzg(r8)
            java.lang.String r0 = "referrer broadcast"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "referrer API"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L4b
        L2b:
            com.google.android.gms.measurement.internal.zzpv r8 = r6.zza
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzi()
            java.lang.String r0 = r7.toString()
            java.lang.String r1 = "Event has been filtered "
            r8.zzb(r1, r0)
            com.google.android.gms.measurement.internal.zzbh r8 = new com.google.android.gms.measurement.internal.zzbh
            java.lang.String r3 = r7.zzc
            long r4 = r7.zzd
            java.lang.String r1 = "_cmpx"
            r0 = r8
            r0.<init>(r1, r2, r3, r4)
            return r8
        L4b:
            return r7
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final com.google.android.gms.measurement.internal.zzap zze(com.google.android.gms.measurement.internal.zzr r5) {
            r4 = this;
            r0 = 0
            r4.zzM(r5, r0)
            java.lang.String r0 = r5.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzji r1 = new com.google.android.gms.measurement.internal.zzji
            r1.<init>(r4, r5)
            java.util.concurrent.Future r0 = r0.zzh(r1)
            r1 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.ExecutionException -> L23 java.lang.InterruptedException -> L25 java.util.concurrent.TimeoutException -> L27
            java.lang.Object r0 = r0.get(r1, r3)     // Catch: java.util.concurrent.ExecutionException -> L23 java.lang.InterruptedException -> L25 java.util.concurrent.TimeoutException -> L27
            com.google.android.gms.measurement.internal.zzap r0 = (com.google.android.gms.measurement.internal.zzap) r0     // Catch: java.util.concurrent.ExecutionException -> L23 java.lang.InterruptedException -> L25 java.util.concurrent.TimeoutException -> L27
            return r0
        L23:
            r0 = move-exception
            goto L28
        L25:
            r0 = move-exception
            goto L28
        L27:
            r0 = move-exception
        L28:
            com.google.android.gms.measurement.internal.zzpv r1 = r4.zza
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r5 = r5.zza
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)
            java.lang.String r2 = "Failed to get consent. appId"
            r1.zzc(r2, r5, r0)
            com.google.android.gms.measurement.internal.zzap r5 = new com.google.android.gms.measurement.internal.zzap
            r0 = 0
            r5.<init>(r0)
            return r5
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.lang.String zzf(com.google.android.gms.measurement.internal.zzr r2) {
            r1 = this;
            r0 = 0
            r1.zzM(r2, r0)
            com.google.android.gms.measurement.internal.zzpv r0 = r1.zza
            java.lang.String r2 = r0.zzD(r2)
            return r2
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzg(com.google.android.gms.measurement.internal.zzr r5, android.os.Bundle r6) {
            r4 = this;
            r0 = 0
            r4.zzM(r5, r0)
            java.lang.String r0 = r5.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zza
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzbh
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            java.lang.String r2 = "Failed to get trigger URIs. appId"
            if (r1 == 0) goto L4f
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzjn r1 = new com.google.android.gms.measurement.internal.zzjn
            r1.<init>(r4, r5, r6)
            java.util.concurrent.Future r6 = r0.zzh(r1)
            r0 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.ExecutionException -> L32 java.lang.InterruptedException -> L34 java.util.concurrent.TimeoutException -> L36
            java.lang.Object r6 = r6.get(r0, r3)     // Catch: java.util.concurrent.ExecutionException -> L32 java.lang.InterruptedException -> L34 java.util.concurrent.TimeoutException -> L36
            java.util.List r6 = (java.util.List) r6     // Catch: java.util.concurrent.ExecutionException -> L32 java.lang.InterruptedException -> L34 java.util.concurrent.TimeoutException -> L36
            return r6
        L32:
            r6 = move-exception
            goto L37
        L34:
            r6 = move-exception
            goto L37
        L36:
            r6 = move-exception
        L37:
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zza
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r5 = r5.zza
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)
            r0.zzc(r2, r5, r6)
            java.util.List r5 = java.util.Collections.emptyList()
            return r5
        L4f:
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzjo r1 = new com.google.android.gms.measurement.internal.zzjo
            r1.<init>(r4, r5, r6)
            java.util.concurrent.Future r6 = r0.zzf(r1)
            java.lang.Object r6 = r6.get()     // Catch: java.util.concurrent.ExecutionException -> L65 java.lang.InterruptedException -> L67
            java.util.List r6 = (java.util.List) r6     // Catch: java.util.concurrent.ExecutionException -> L65 java.lang.InterruptedException -> L67
            return r6
        L65:
            r6 = move-exception
            goto L68
        L67:
            r6 = move-exception
        L68:
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zza
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r5 = r5.zza
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)
            r0.zzc(r2, r5, r6)
            java.util.List r5 = java.util.Collections.emptyList()
            return r5
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzh(com.google.android.gms.measurement.internal.zzr r5, boolean r6) {
            r4 = this;
            r0 = 0
            r4.zzM(r5, r0)
            java.lang.String r0 = r5.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzpv r1 = r4.zza
            com.google.android.gms.measurement.internal.zzil r1 = r1.zzaX()
            com.google.android.gms.measurement.internal.zziv r2 = new com.google.android.gms.measurement.internal.zziv
            r2.<init>(r4, r0)
            java.util.concurrent.Future r0 = r1.zzf(r2)
            java.lang.Object r0 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            java.util.List r0 = (java.util.List) r0     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            int r2 = r0.size()     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            r1.<init>(r2)     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
        L2b:
            boolean r2 = r0.hasNext()     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r0.next()     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            com.google.android.gms.measurement.internal.zzqd r2 = (com.google.android.gms.measurement.internal.zzqd) r2     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            if (r6 != 0) goto L41
            java.lang.String r3 = r2.zzc     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            boolean r3 = com.google.android.gms.measurement.internal.zzqf.zzap(r3)     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            if (r3 != 0) goto L2b
        L41:
            com.google.android.gms.measurement.internal.zzqb r3 = new com.google.android.gms.measurement.internal.zzqb     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            r3.<init>(r2)     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            r1.add(r3)     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            goto L2b
        L4a:
            return r1
        L4b:
            r6 = move-exception
            goto L4e
        L4d:
            r6 = move-exception
        L4e:
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zza
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r5 = r5.zza
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)
            java.lang.String r1 = "Failed to get user properties. appId"
            r0.zzc(r1, r5, r6)
            r5 = 0
            return r5
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzi(java.lang.String r3, java.lang.String r4, com.google.android.gms.measurement.internal.zzr r5) {
            r2 = this;
            r0 = 0
            r2.zzM(r5, r0)
            java.lang.String r5 = r5.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.measurement.internal.zzpv r0 = r2.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzjd r1 = new com.google.android.gms.measurement.internal.zzjd
            r1.<init>(r2, r5, r3, r4)
            java.util.concurrent.Future r3 = r0.zzf(r1)
            java.lang.Object r3 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> L1f java.lang.InterruptedException -> L21
            java.util.List r3 = (java.util.List) r3     // Catch: java.util.concurrent.ExecutionException -> L1f java.lang.InterruptedException -> L21
            return r3
        L1f:
            r3 = move-exception
            goto L22
        L21:
            r3 = move-exception
        L22:
            com.google.android.gms.measurement.internal.zzpv r4 = r2.zza
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            java.lang.String r5 = "Failed to get conditional user properties"
            r4.zzb(r5, r3)
            java.util.List r3 = java.util.Collections.emptyList()
            return r3
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzj(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = 1
            r2.zzN(r3, r0)
            com.google.android.gms.measurement.internal.zzpv r0 = r2.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzje r1 = new com.google.android.gms.measurement.internal.zzje
            r1.<init>(r2, r3, r4, r5)
            java.util.concurrent.Future r3 = r0.zzf(r1)
            java.lang.Object r3 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> L1a java.lang.InterruptedException -> L1c
            java.util.List r3 = (java.util.List) r3     // Catch: java.util.concurrent.ExecutionException -> L1a java.lang.InterruptedException -> L1c
            return r3
        L1a:
            r3 = move-exception
            goto L1d
        L1c:
            r3 = move-exception
        L1d:
            com.google.android.gms.measurement.internal.zzpv r4 = r2.zza
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            java.lang.String r5 = "Failed to get conditional user properties as"
            r4.zzb(r5, r3)
            java.util.List r3 = java.util.Collections.emptyList()
            return r3
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzk(java.lang.String r4, java.lang.String r5, boolean r6, com.google.android.gms.measurement.internal.zzr r7) {
            r3 = this;
            r0 = 0
            r3.zzM(r7, r0)
            java.lang.String r0 = r7.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzpv r1 = r3.zza
            com.google.android.gms.measurement.internal.zzil r1 = r1.zzaX()
            com.google.android.gms.measurement.internal.zzjb r2 = new com.google.android.gms.measurement.internal.zzjb
            r2.<init>(r3, r0, r4, r5)
            java.util.concurrent.Future r4 = r1.zzf(r2)
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            java.util.List r4 = (java.util.List) r4     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            int r0 = r4.size()     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            r5.<init>(r0)     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            java.util.Iterator r4 = r4.iterator()     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r4.next()     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            com.google.android.gms.measurement.internal.zzqd r0 = (com.google.android.gms.measurement.internal.zzqd) r0     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            if (r6 != 0) goto L41
            java.lang.String r1 = r0.zzc     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            boolean r1 = com.google.android.gms.measurement.internal.zzqf.zzap(r1)     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            if (r1 != 0) goto L2b
        L41:
            com.google.android.gms.measurement.internal.zzqb r1 = new com.google.android.gms.measurement.internal.zzqb     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            r1.<init>(r0)     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            r5.add(r1)     // Catch: java.util.concurrent.ExecutionException -> L4b java.lang.InterruptedException -> L4d
            goto L2b
        L4a:
            return r5
        L4b:
            r4 = move-exception
            goto L4e
        L4d:
            r4 = move-exception
        L4e:
            com.google.android.gms.measurement.internal.zzpv r5 = r3.zza
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()
            java.lang.String r6 = r7.zza
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)
            java.lang.String r7 = "Failed to query user properties. appId"
            r5.zzc(r7, r6, r4)
            java.util.List r4 = java.util.Collections.emptyList()
            return r4
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final java.util.List zzl(java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r2 = this;
            r0 = 1
            r2.zzN(r3, r0)
            com.google.android.gms.measurement.internal.zzpv r0 = r2.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzjc r1 = new com.google.android.gms.measurement.internal.zzjc
            r1.<init>(r2, r3, r4, r5)
            java.util.concurrent.Future r4 = r0.zzf(r1)
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            java.util.List r4 = (java.util.List) r4     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            int r0 = r4.size()     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            r5.<init>(r0)     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            java.util.Iterator r4 = r4.iterator()     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
        L26:
            boolean r0 = r4.hasNext()     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            if (r0 == 0) goto L45
            java.lang.Object r0 = r4.next()     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            com.google.android.gms.measurement.internal.zzqd r0 = (com.google.android.gms.measurement.internal.zzqd) r0     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            if (r6 != 0) goto L3c
            java.lang.String r1 = r0.zzc     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            boolean r1 = com.google.android.gms.measurement.internal.zzqf.zzap(r1)     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            if (r1 != 0) goto L26
        L3c:
            com.google.android.gms.measurement.internal.zzqb r1 = new com.google.android.gms.measurement.internal.zzqb     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            r1.<init>(r0)     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            r5.add(r1)     // Catch: java.util.concurrent.ExecutionException -> L46 java.lang.InterruptedException -> L48
            goto L26
        L45:
            return r5
        L46:
            r4 = move-exception
            goto L49
        L48:
            r4 = move-exception
        L49:
            com.google.android.gms.measurement.internal.zzpv r5 = r2.zza
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)
            java.lang.String r6 = "Failed to get user properties as. appId"
            r5.zzc(r6, r3, r4)
            java.util.List r3 = java.util.Collections.emptyList()
            return r3
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzm(com.google.android.gms.measurement.internal.zzr r2) {
            r1 = this;
            r0 = 0
            r1.zzM(r2, r0)
            com.google.android.gms.measurement.internal.zzix r0 = new com.google.android.gms.measurement.internal.zzix
            r0.<init>(r1, r2)
            r1.zzL(r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzn(com.google.android.gms.measurement.internal.zzr r2) {
            r1 = this;
            r0 = 0
            r1.zzM(r2, r0)
            com.google.android.gms.measurement.internal.zziw r0 = new com.google.android.gms.measurement.internal.zziw
            r0.<init>(r1, r2)
            r1.zzL(r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzo(com.google.android.gms.measurement.internal.zzr r5, com.google.android.gms.measurement.internal.zzpc r6, com.google.android.gms.measurement.internal.zzgr r7) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zza
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzi()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaP
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            if (r1 != 0) goto L3a
            com.google.android.gms.measurement.internal.zzpe r5 = new com.google.android.gms.measurement.internal.zzpe     // Catch: android.os.RemoteException -> L29
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: android.os.RemoteException -> L29
            r5.<init>(r6)     // Catch: android.os.RemoteException -> L29
            r7.zze(r5)     // Catch: android.os.RemoteException -> L29
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()     // Catch: android.os.RemoteException -> L29
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzj()     // Catch: android.os.RemoteException -> L29
            java.lang.String r6 = "[sgtm] Client upload is not enabled on the service side."
            r5.zza(r6)     // Catch: android.os.RemoteException -> L29
            return
        L29:
            r5 = move-exception
            com.google.android.gms.measurement.internal.zzpv r6 = r4.zza
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()
            java.lang.String r7 = "[sgtm] UploadBatchesCallback failed."
            r6.zzb(r7, r5)
            return
        L3a:
            r0 = 0
            r4.zzM(r5, r0)
            java.lang.String r5 = r5.zza
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.measurement.internal.zzpv r0 = r4.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzis r1 = new com.google.android.gms.measurement.internal.zzis
            r1.<init>(r4, r5, r6, r7)
            r0.zzq(r1)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzp(com.google.android.gms.measurement.internal.zzbh r2, com.google.android.gms.measurement.internal.zzr r3) {
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r0 = 0
            r1.zzM(r3, r0)
            com.google.android.gms.measurement.internal.zzjj r0 = new com.google.android.gms.measurement.internal.zzjj
            r0.<init>(r1, r2, r3)
            r1.zzL(r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzq(com.google.android.gms.measurement.internal.zzbh r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r3 = 1
            r0.zzN(r2, r3)
            com.google.android.gms.measurement.internal.zzjk r3 = new com.google.android.gms.measurement.internal.zzjk
            r3.<init>(r0, r1, r2)
            r0.zzL(r3)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzr(com.google.android.gms.measurement.internal.zzr r9, android.os.Bundle r10, com.google.android.gms.measurement.internal.zzgo r11) {
            r8 = this;
            r0 = 0
            r8.zzM(r9, r0)
            java.lang.String r0 = r9.zza
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.gms.measurement.internal.zzpv r0 = r8.zza
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zziq r7 = new com.google.android.gms.measurement.internal.zziq
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.zzq(r7)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzs(com.google.android.gms.measurement.internal.zzr r3) {
            r2 = this;
            java.lang.String r0 = r3.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            r1 = 0
            r2.zzN(r0, r1)
            com.google.android.gms.measurement.internal.zzjg r0 = new com.google.android.gms.measurement.internal.zzjg
            r0.<init>(r2, r3)
            r2.zzL(r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzt(com.google.android.gms.measurement.internal.zzai r2, com.google.android.gms.measurement.internal.zzr r3) {
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.measurement.internal.zzqb r0 = r2.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r0 = 0
            r1.zzM(r3, r0)
            com.google.android.gms.measurement.internal.zzai r0 = new com.google.android.gms.measurement.internal.zzai
            r0.<init>(r2)
            java.lang.String r2 = r3.zza
            r0.zza = r2
            com.google.android.gms.measurement.internal.zziz r2 = new com.google.android.gms.measurement.internal.zziz
            r2.<init>(r1, r0, r3)
            r1.zzL(r2)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzu(com.google.android.gms.measurement.internal.zzai r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.measurement.internal.zzqb r0 = r3.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = r3.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            java.lang.String r0 = r3.zza
            r1 = 1
            r2.zzN(r0, r1)
            com.google.android.gms.measurement.internal.zzai r0 = new com.google.android.gms.measurement.internal.zzai
            r0.<init>(r3)
            com.google.android.gms.measurement.internal.zzja r3 = new com.google.android.gms.measurement.internal.zzja
            r3.<init>(r2, r0)
            r2.zzL(r3)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzv(com.google.android.gms.measurement.internal.zzr r2) {
            r1 = this;
            java.lang.String r0 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            java.lang.String r0 = r2.zzu
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzjh r0 = new com.google.android.gms.measurement.internal.zzjh
            r0.<init>(r1, r2)
            r1.zzK(r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzw(long r9, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
            r8 = this;
            com.google.android.gms.measurement.internal.zziy r7 = new com.google.android.gms.measurement.internal.zziy
            r0 = r7
            r1 = r8
            r2 = r12
            r3 = r13
            r4 = r11
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r8.zzL(r7)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzx(android.os.Bundle r3, com.google.android.gms.measurement.internal.zzr r4) {
            r2 = this;
            r0 = 0
            r2.zzM(r4, r0)
            java.lang.String r0 = r4.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zziu r1 = new com.google.android.gms.measurement.internal.zziu
            r1.<init>(r2, r3, r0, r4)
            r2.zzL(r1)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzy(com.google.android.gms.measurement.internal.zzr r2) {
            r1 = this;
            java.lang.String r0 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            java.lang.String r0 = r2.zzu
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzit r0 = new com.google.android.gms.measurement.internal.zzit
            r0.<init>(r1, r2)
            r1.zzK(r0)
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final void zzz(com.google.android.gms.measurement.internal.zzr r2) {
            r1 = this;
            r0 = 0
            r1.zzM(r2, r0)
            com.google.android.gms.measurement.internal.zzjf r0 = new com.google.android.gms.measurement.internal.zzjf
            r0.<init>(r1, r2)
            r1.zzL(r0)
            return
    }
}
