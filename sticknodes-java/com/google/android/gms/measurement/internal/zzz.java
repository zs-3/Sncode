package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzz {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzae zza;
    private com.google.android.gms.internal.measurement.zzhm zzb;
    private java.lang.Long zzc;
    private long zzd;

    /* synthetic */ zzz(com.google.android.gms.measurement.internal.zzae r1, com.google.android.gms.measurement.internal.zzad r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    final com.google.android.gms.internal.measurement.zzhm zza(java.lang.String r19, com.google.android.gms.internal.measurement.zzhm r20) {
            r18 = this;
            r1 = r18
            r3 = r19
            r8 = r20
            java.lang.String r0 = r20.zzh()
            java.util.List r9 = r20.zzi()
            com.google.android.gms.measurement.internal.zzae r2 = r1.zza
            com.google.android.gms.measurement.internal.zzpv r4 = r2.zzg
            r4.zzA()
            java.lang.String r5 = "_eid"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzqa.zzH(r8, r5)
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L21e
            java.lang.String r7 = "_ep"
            boolean r7 = r0.equals(r7)
            r10 = 0
            if (r7 == 0) goto L1de
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            r4.zzA()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzqa.zzH(r8, r0)
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r7 = 0
            if (r0 == 0) goto L4f
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzh()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.zzb(r2, r6)
            return r7
        L4f:
            com.google.android.gms.internal.measurement.zzhm r0 = r1.zzb
            r2 = 1
            r13 = 0
            if (r0 == 0) goto L67
            java.lang.Long r0 = r1.zzc
            if (r0 == 0) goto L67
            long r14 = r6.longValue()
            java.lang.Long r0 = r1.zzc
            long r16 = r0.longValue()
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L11d
        L67:
            com.google.android.gms.measurement.internal.zzaw r4 = r4.zzj()
            r4.zzg()
            r4.zzav()
            android.database.sqlite.SQLiteDatabase r0 = r4.zzj()     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Ldf
            java.lang.String r14 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r15 = 2
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Ldf
            r15[r13] = r3     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Ldf
            java.lang.String r16 = r6.toString()     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Ldf
            r15[r2] = r16     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Ldf
            android.database.Cursor r14 = r0.rawQuery(r14, r15)     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Ldf
            boolean r0 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            if (r0 != 0) goto La0
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            java.lang.String r15 = "Main event not found"
            r0.zza(r15)     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            r14.close()
            r0 = r7
            goto Lf6
        La0:
            byte[] r0 = r14.getBlob(r13)     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            long r15 = r14.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            com.google.android.gms.internal.measurement.zzhl r7 = com.google.android.gms.internal.measurement.zzhm.zze()     // Catch: java.io.IOException -> Lc4 android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            com.google.android.gms.internal.measurement.zzng r0 = com.google.android.gms.measurement.internal.zzqa.zzp(r7, r0)     // Catch: java.io.IOException -> Lc4 android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            com.google.android.gms.internal.measurement.zzhl r0 = (com.google.android.gms.internal.measurement.zzhl) r0     // Catch: java.io.IOException -> Lc4 android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch: java.io.IOException -> Lc4 android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0     // Catch: java.io.IOException -> Lc4 android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            r14.close()
            goto Lf6
        Lc4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r7 = r4.zzu     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            com.google.android.gms.measurement.internal.zzhe r7 = r7.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zze()     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzhe.zzn(r19)     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            r7.zzd(r15, r13, r6, r0)     // Catch: android.database.sqlite.SQLiteException -> Ld9 java.lang.Throwable -> L1d6
            goto Lf2
        Ld9:
            r0 = move-exception
            goto Le1
        Ldb:
            r0 = move-exception
            r7 = 0
            goto L1d8
        Ldf:
            r0 = move-exception
            r14 = 0
        Le1:
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu     // Catch: java.lang.Throwable -> L1d6
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()     // Catch: java.lang.Throwable -> L1d6
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r7 = "Error selecting main event"
            r4.zzb(r7, r0)     // Catch: java.lang.Throwable -> L1d6
            if (r14 == 0) goto Lf5
        Lf2:
            r14.close()
        Lf5:
            r0 = 0
        Lf6:
            if (r0 == 0) goto L1c3
            java.lang.Object r4 = r0.first
            if (r4 != 0) goto Lfe
            goto L1c3
        Lfe:
            com.google.android.gms.internal.measurement.zzhm r4 = (com.google.android.gms.internal.measurement.zzhm) r4
            r1.zzb = r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r13 = r0.longValue()
            r1.zzd = r13
            com.google.android.gms.measurement.internal.zzae r0 = r1.zza
            com.google.android.gms.measurement.internal.zzpv r0 = r0.zzg
            r0.zzA()
            com.google.android.gms.internal.measurement.zzhm r0 = r1.zzb
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzqa.zzH(r0, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.zzc = r0
        L11d:
            long r4 = r1.zzd
            r13 = -1
            long r4 = r4 + r13
            r1.zzd = r4
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 > 0) goto L162
            com.google.android.gms.measurement.internal.zzae r0 = r1.zza
            com.google.android.gms.measurement.internal.zzpv r0 = r0.zzg
            com.google.android.gms.measurement.internal.zzaw r4 = r0.zzj()
            r4.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r5 = "Clearing complex main event info. appId"
            r0.zzb(r5, r3)
            android.database.sqlite.SQLiteDatabase r0 = r4.zzj()     // Catch: android.database.sqlite.SQLiteException -> L151
            java.lang.String r5 = "delete from main_event_params where app_id=?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: android.database.sqlite.SQLiteException -> L151
            r6 = 0
            r2[r6] = r3     // Catch: android.database.sqlite.SQLiteException -> L151
            r0.execSQL(r5, r2)     // Catch: android.database.sqlite.SQLiteException -> L151
            goto L175
        L151:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r3 = "Error clearing complex main event"
            r2.zzb(r3, r0)
            goto L175
        L162:
            com.google.android.gms.measurement.internal.zzae r0 = r1.zza
            com.google.android.gms.measurement.internal.zzpv r0 = r0.zzg
            com.google.android.gms.measurement.internal.zzaw r2 = r0.zzj()
            long r10 = r1.zzd
            com.google.android.gms.internal.measurement.zzhm r7 = r1.zzb
            r3 = r19
            r4 = r6
            r5 = r10
            r2.zzaf(r3, r4, r5, r7)
        L175:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.zzhm r2 = r1.zzb
            java.util.List r2 = r2.zzi()
            java.util.Iterator r2 = r2.iterator()
        L184:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1a5
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzhq r3 = (com.google.android.gms.internal.measurement.zzhq) r3
            com.google.android.gms.measurement.internal.zzae r4 = r1.zza
            com.google.android.gms.measurement.internal.zzpv r4 = r4.zzg
            r4.zzA()
            java.lang.String r4 = r3.zzg()
            com.google.android.gms.internal.measurement.zzhq r4 = com.google.android.gms.measurement.internal.zzqa.zzG(r8, r4)
            if (r4 != 0) goto L184
            r0.add(r3)
            goto L184
        L1a5:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L1b0
            r0.addAll(r9)
            r9 = r0
            goto L1c1
        L1b0:
            com.google.android.gms.measurement.internal.zzae r0 = r1.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzh()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.zzb(r2, r12)
        L1c1:
            r0 = r12
            goto L21e
        L1c3:
            com.google.android.gms.measurement.internal.zzae r0 = r1.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzh()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.zzc(r2, r12, r6)
            r2 = 0
            return r2
        L1d6:
            r0 = move-exception
            r7 = r14
        L1d8:
            if (r7 == 0) goto L1dd
            r7.close()
        L1dd:
            throw r0
        L1de:
            r1.zzc = r6
            r1.zzb = r8
            r4.zzA()
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            java.lang.String r7 = "_epc"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzqa.zzI(r8, r7, r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r12 = r5.longValue()
            r1.zzd = r12
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 > 0) goto L20b
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzh()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.zzb(r3, r0)
            goto L21e
        L20b:
            com.google.android.gms.measurement.internal.zzaw r2 = r4.zzj()
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.zzd
            r3 = r19
            r7 = r20
            r2.zzaf(r3, r4, r5, r7)
        L21e:
            com.google.android.gms.internal.measurement.zzlz r2 = r20.zzch()
            com.google.android.gms.internal.measurement.zzhl r2 = (com.google.android.gms.internal.measurement.zzhl) r2
            r2.zzi(r0)
            r2.zzg()
            r2.zzd(r9)
            com.google.android.gms.internal.measurement.zzmd r0 = r2.zzba()
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0
            return r0
    }
}
