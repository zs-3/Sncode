package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzae extends com.google.android.gms.measurement.internal.zzpg {
    private java.lang.String zza;
    private java.util.Set zzb;
    private java.util.Map zzc;
    private java.lang.Long zzd;
    private java.lang.Long zze;

    zzae(com.google.android.gms.measurement.internal.zzpv r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private final com.google.android.gms.measurement.internal.zzy zzd(java.lang.Integer r4) {
            r3 = this;
            java.util.Map r0 = r3.zzc
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L11
            java.util.Map r0 = r3.zzc
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.measurement.internal.zzy r4 = (com.google.android.gms.measurement.internal.zzy) r4
            return r4
        L11:
            com.google.android.gms.measurement.internal.zzy r0 = new com.google.android.gms.measurement.internal.zzy
            java.lang.String r1 = r3.zza
            r2 = 0
            r0.<init>(r3, r1, r2)
            java.util.Map r1 = r3.zzc
            r1.put(r4, r0)
            return r0
    }

    private final boolean zzf(int r2, int r3) {
            r1 = this;
            java.util.Map r0 = r1.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.measurement.internal.zzy r2 = (com.google.android.gms.measurement.internal.zzy) r2
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            java.util.BitSet r2 = com.google.android.gms.measurement.internal.zzy.zzb(r2)
            boolean r2 = r2.get(r3)
            return r2
    }

    final java.util.List zza(java.lang.String r31, java.util.List r32, java.util.List r33, java.lang.Long r34, java.lang.Long r35, boolean r36) {
            r30 = this;
            r10 = r30
            java.lang.String r11 = "current_results"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r31)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r32)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r33)
            r0 = r31
            r10.zza = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.zzb = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r10.zzc = r0
            r0 = r34
            r10.zzd = r0
            r0 = r35
            r10.zze = r0
            java.util.Iterator r0 = r32.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzhm r1 = (com.google.android.gms.internal.measurement.zzhm) r1
            java.lang.String r1 = r1.zzh()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2b
            r1 = 1
            goto L48
        L47:
            r1 = 0
        L48:
            com.google.android.gms.internal.measurement.zzpq.zzb()
            com.google.android.gms.measurement.internal.zzio r0 = r10.zzu
            com.google.android.gms.measurement.internal.zzam r2 = r0.zzf()
            java.lang.String r3 = r10.zza
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzaE
            boolean r14 = r2.zzx(r3, r4)
            com.google.android.gms.internal.measurement.zzpq.zzb()
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            java.lang.String r2 = r10.zza
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zzaD
            boolean r15 = r0.zzx(r2, r3)
            if (r1 == 0) goto Lad
            com.google.android.gms.measurement.internal.zzpv r0 = r10.zzg
            com.google.android.gms.measurement.internal.zzaw r2 = r0.zzj()
            java.lang.String r3 = r10.zza
            r2.zzav()
            r2.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "events"
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r7 = new java.lang.String[r13]     // Catch: android.database.sqlite.SQLiteException -> L99
            r7[r12] = r3     // Catch: android.database.sqlite.SQLiteException -> L99
            r4.update(r5, r0, r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L99
            goto Lad
        L99:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.zzc(r4, r3, r0)
        Lad:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r9 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r7 = "data"
            java.lang.String r6 = "audience_id"
            if (r15 == 0) goto L178
            if (r14 == 0) goto L178
            com.google.android.gms.measurement.internal.zzpv r0 = r10.zzg
            com.google.android.gms.measurement.internal.zzaw r2 = r0.zzj()
            java.lang.String r3 = r10.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r2.zzj()
            java.lang.String r17 = "event_filters"
            java.lang.String[] r18 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Throwable -> L155 android.database.sqlite.SQLiteException -> L158
            java.lang.String r19 = "app_id=?"
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch: java.lang.Throwable -> L155 android.database.sqlite.SQLiteException -> L158
            r0[r12] = r3     // Catch: java.lang.Throwable -> L155 android.database.sqlite.SQLiteException -> L158
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L155 android.database.sqlite.SQLiteException -> L158
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            if (r0 == 0) goto L149
        Lef:
            byte[] r0 = r5.getBlob(r13)     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            com.google.android.gms.internal.measurement.zzfi r13 = com.google.android.gms.internal.measurement.zzfj.zzc()     // Catch: java.io.IOException -> L129 java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            com.google.android.gms.internal.measurement.zzng r0 = com.google.android.gms.measurement.internal.zzqa.zzp(r13, r0)     // Catch: java.io.IOException -> L129 java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            com.google.android.gms.internal.measurement.zzfi r0 = (com.google.android.gms.internal.measurement.zzfi) r0     // Catch: java.io.IOException -> L129 java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch: java.io.IOException -> L129 java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            com.google.android.gms.internal.measurement.zzfj r0 = (com.google.android.gms.internal.measurement.zzfj) r0     // Catch: java.io.IOException -> L129 java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            boolean r13 = r0.zzo()     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            if (r13 != 0) goto L10a
            goto L13b
        L10a:
            int r13 = r5.getInt(r12)     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            java.lang.Object r16 = r4.get(r13)     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            java.util.List r16 = (java.util.List) r16     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            if (r16 != 0) goto L123
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            r12.<init>()     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            r4.put(r13, r12)     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            goto L125
        L123:
            r12 = r16
        L125:
            r12.add(r0)     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            goto L13b
        L129:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r12 = r2.zzu     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            com.google.android.gms.measurement.internal.zzhe r12 = r12.zzaW()     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            com.google.android.gms.measurement.internal.zzhc r12 = r12.zze()     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            r12.zzc(r9, r13, r0)     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
        L13b:
            boolean r0 = r5.moveToNext()     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
            if (r0 != 0) goto L146
            r5.close()
            r12 = r4
            goto L179
        L146:
            r12 = 0
            r13 = 1
            goto Lef
        L149:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L151 android.database.sqlite.SQLiteException -> L153
        L14d:
            r5.close()
            goto L178
        L151:
            r0 = move-exception
            goto L172
        L153:
            r0 = move-exception
            goto L15a
        L155:
            r0 = move-exception
            r5 = 0
            goto L172
        L158:
            r0 = move-exception
            r5 = 0
        L15a:
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> L151
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L151
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L151
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> L151
            r2.zzc(r8, r3, r0)     // Catch: java.lang.Throwable -> L151
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L151
            if (r5 == 0) goto L178
            goto L14d
        L172:
            if (r5 == 0) goto L177
            r5.close()
        L177:
            throw r0
        L178:
            r12 = r0
        L179:
            com.google.android.gms.measurement.internal.zzpv r0 = r10.zzg
            com.google.android.gms.measurement.internal.zzaw r2 = r0.zzj()
            java.lang.String r3 = r10.zza
            r2.zzav()
            r2.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            android.database.sqlite.SQLiteDatabase r16 = r2.zzj()
            java.lang.String r17 = "audience_filter_values"
            java.lang.String[] r18 = new java.lang.String[]{r6, r11}     // Catch: java.lang.Throwable -> L224 android.database.sqlite.SQLiteException -> L228
            java.lang.String r19 = "app_id=?"
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L224 android.database.sqlite.SQLiteException -> L228
            r4 = 0
            r0[r4] = r3     // Catch: java.lang.Throwable -> L224 android.database.sqlite.SQLiteException -> L228
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L224 android.database.sqlite.SQLiteException -> L228
            boolean r0 = r4.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            if (r0 != 0) goto L1bc
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            r4.close()
            r13 = r0
            r18 = r6
            r19 = r7
            goto L24b
        L1bc:
            androidx.collection.ArrayMap r5 = new androidx.collection.ArrayMap     // Catch: android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            r5.<init>()     // Catch: android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
        L1c1:
            r13 = 0
            int r16 = r4.getInt(r13)     // Catch: android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            r13 = 1
            byte[] r0 = r4.getBlob(r13)     // Catch: android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            com.google.android.gms.internal.measurement.zzib r13 = com.google.android.gms.internal.measurement.zzic.zze()     // Catch: java.io.IOException -> L1e9 android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            com.google.android.gms.internal.measurement.zzng r0 = com.google.android.gms.measurement.internal.zzqa.zzp(r13, r0)     // Catch: java.io.IOException -> L1e9 android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            com.google.android.gms.internal.measurement.zzib r0 = (com.google.android.gms.internal.measurement.zzib) r0     // Catch: java.io.IOException -> L1e9 android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch: java.io.IOException -> L1e9 android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            com.google.android.gms.internal.measurement.zzic r0 = (com.google.android.gms.internal.measurement.zzic) r0     // Catch: java.io.IOException -> L1e9 android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)     // Catch: android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            r5.put(r13, r0)     // Catch: android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            r17 = r5
            r18 = r6
            r19 = r7
            goto L207
        L1e9:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r13 = r2.zzu     // Catch: android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            com.google.android.gms.measurement.internal.zzhe r13 = r13.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zze()     // Catch: android.database.sqlite.SQLiteException -> L21e java.lang.Throwable -> La7f
            r17 = r5
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            r18 = r6
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: android.database.sqlite.SQLiteException -> L21c java.lang.Throwable -> La7f
            r19 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch: android.database.sqlite.SQLiteException -> L21a java.lang.Throwable -> La7f
            r13.zzd(r5, r6, r7, r0)     // Catch: android.database.sqlite.SQLiteException -> L21a java.lang.Throwable -> La7f
        L207:
            boolean r0 = r4.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L21a java.lang.Throwable -> La7f
            if (r0 != 0) goto L213
            r4.close()
            r13 = r17
            goto L24b
        L213:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L1c1
        L21a:
            r0 = move-exception
            goto L22e
        L21c:
            r0 = move-exception
            goto L221
        L21e:
            r0 = move-exception
            r18 = r6
        L221:
            r19 = r7
            goto L22e
        L224:
            r0 = move-exception
            r5 = 0
            goto La81
        L228:
            r0 = move-exception
            r18 = r6
            r19 = r7
            r4 = 0
        L22e:
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu     // Catch: java.lang.Throwable -> La7f
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> La7f
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> La7f
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> La7f
            r2.zzc(r5, r3, r0)     // Catch: java.lang.Throwable -> La7f
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> La7f
            if (r4 == 0) goto L24a
            r4.close()
        L24a:
            r13 = r0
        L24b:
            boolean r0 = r13.isEmpty()
            r7 = 2
            if (r0 == 0) goto L25a
            r12 = r8
            r13 = r9
        L254:
            r28 = r18
            r29 = r19
            goto L5a9
        L25a:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r13.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L404
            java.lang.String r1 = r10.zza
            com.google.android.gms.measurement.internal.zzpv r0 = r10.zzg
            com.google.android.gms.measurement.internal.zzaw r3 = r0.zzj()
            java.lang.String r4 = r10.zza
            r3.zzav()
            r3.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r3.zzj()
            java.lang.String r6 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r16 = r8
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: android.database.sqlite.SQLiteException -> L2d2 java.lang.Throwable -> L2d4
            r17 = 0
            r8[r17] = r4     // Catch: android.database.sqlite.SQLiteException -> L2d2 java.lang.Throwable -> L2d4
            r17 = 1
            r8[r17] = r4     // Catch: android.database.sqlite.SQLiteException -> L2d2 java.lang.Throwable -> L2d4
            android.database.Cursor r5 = r5.rawQuery(r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L2d2 java.lang.Throwable -> L2d4
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            if (r6 == 0) goto L2c8
        L299:
            r6 = 0
            int r8 = r5.getInt(r6)     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            java.lang.Object r8 = r0.get(r6)     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            if (r8 != 0) goto L2b2
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            r8.<init>()     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            r0.put(r6, r8)     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
        L2b2:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            r8.add(r6)     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            if (r6 != 0) goto L299
        L2c4:
            r5.close()
            goto L2f6
        L2c8:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L2cd android.database.sqlite.SQLiteException -> L2d0
            goto L2c4
        L2cd:
            r0 = move-exception
            goto L3fe
        L2d0:
            r0 = move-exception
            goto L2dc
        L2d2:
            r0 = move-exception
            goto L2db
        L2d4:
            r0 = move-exception
            r5 = 0
            goto L3fe
        L2d8:
            r0 = move-exception
            r16 = r8
        L2db:
            r5 = 0
        L2dc:
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu     // Catch: java.lang.Throwable -> L2cd
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L2cd
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L2cd
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r4)     // Catch: java.lang.Throwable -> L2cd
            r3.zzc(r6, r4, r0)     // Catch: java.lang.Throwable -> L2cd
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L2cd
            if (r5 == 0) goto L2f6
            goto L2c4
        L2f6:
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            boolean r3 = r13.isEmpty()
            if (r3 == 0) goto L309
            goto L3fc
        L309:
            java.util.Set r3 = r13.keySet()
            java.util.Iterator r3 = r3.iterator()
        L311:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3fc
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzic r6 = (com.google.android.gms.internal.measurement.zzic) r6
            java.lang.Object r8 = r0.get(r5)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L3ee
            boolean r17 = r8.isEmpty()
            if (r17 == 0) goto L33b
            goto L3ee
        L33b:
            com.google.android.gms.measurement.internal.zzpv r5 = r10.zzg
            com.google.android.gms.measurement.internal.zzqa r7 = r5.zzA()
            r20 = r0
            java.util.List r0 = r6.zzi()
            java.util.List r0 = r7.zzt(r0, r8)
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L3eb
            com.google.android.gms.internal.measurement.zzlz r7 = r6.zzch()
            com.google.android.gms.internal.measurement.zzib r7 = (com.google.android.gms.internal.measurement.zzib) r7
            r7.zzf()
            r7.zzb(r0)
            com.google.android.gms.measurement.internal.zzqa r0 = r5.zzA()
            java.util.List r5 = r6.zzk()
            java.util.List r0 = r0.zzt(r5, r8)
            r7.zzh()
            r7.zzd(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r5 = r6.zzh()
            java.util.Iterator r5 = r5.iterator()
        L37c:
            boolean r21 = r5.hasNext()
            if (r21 == 0) goto L3a4
            java.lang.Object r21 = r5.next()
            r22 = r3
            r3 = r21
            com.google.android.gms.internal.measurement.zzhk r3 = (com.google.android.gms.internal.measurement.zzhk) r3
            int r21 = r3.zza()
            r23 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            boolean r5 = r8.contains(r5)
            if (r5 != 0) goto L39f
            r0.add(r3)
        L39f:
            r3 = r22
            r5 = r23
            goto L37c
        L3a4:
            r22 = r3
            r7.zze()
            r7.zza(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r3 = r6.zzj()
            java.util.Iterator r3 = r3.iterator()
        L3b9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L3d7
            java.lang.Object r5 = r3.next()
            com.google.android.gms.internal.measurement.zzie r5 = (com.google.android.gms.internal.measurement.zzie) r5
            int r6 = r5.zzb()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r8.contains(r6)
            if (r6 != 0) goto L3b9
            r0.add(r5)
            goto L3b9
        L3d7:
            r7.zzg()
            r7.zzc(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.internal.measurement.zzmd r3 = r7.zzba()
            com.google.android.gms.internal.measurement.zzic r3 = (com.google.android.gms.internal.measurement.zzic) r3
            r1.put(r0, r3)
            goto L3f5
        L3eb:
            r0 = r20
            goto L3f9
        L3ee:
            r20 = r0
            r22 = r3
            r1.put(r5, r6)
        L3f5:
            r0 = r20
            r3 = r22
        L3f9:
            r7 = 2
            goto L311
        L3fc:
            r0 = r1
            goto L407
        L3fe:
            if (r5 == 0) goto L403
            r5.close()
        L403:
            throw r0
        L404:
            r16 = r8
            r0 = r13
        L407:
            java.util.Iterator r20 = r2.iterator()
        L40b:
            boolean r1 = r20.hasNext()
            if (r1 == 0) goto L5a4
            java.lang.Object r1 = r20.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r21 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzic r1 = (com.google.android.gms.internal.measurement.zzic) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>()
            if (r1 == 0) goto L473
            int r2 = r1.zza()
            if (r2 != 0) goto L43d
            goto L473
        L43d:
            java.util.List r2 = r1.zzh()
            java.util.Iterator r2 = r2.iterator()
        L445:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L473
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzhk r3 = (com.google.android.gms.internal.measurement.zzhk) r3
            boolean r4 = r3.zzh()
            if (r4 == 0) goto L445
            int r4 = r3.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r8 = r3.zzg()
            if (r8 == 0) goto L46e
            long r22 = r3.zzb()
            java.lang.Long r3 = java.lang.Long.valueOf(r22)
            goto L46f
        L46e:
            r3 = 0
        L46f:
            r7.put(r4, r3)
            goto L445
        L473:
            androidx.collection.ArrayMap r8 = new androidx.collection.ArrayMap
            r8.<init>()
            if (r1 == 0) goto L4bf
            int r2 = r1.zzc()
            if (r2 != 0) goto L481
            goto L4bf
        L481:
            java.util.List r2 = r1.zzj()
            java.util.Iterator r2 = r2.iterator()
        L489:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4bf
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzie r3 = (com.google.android.gms.internal.measurement.zzie) r3
            boolean r4 = r3.zzi()
            if (r4 == 0) goto L489
            int r4 = r3.zza()
            if (r4 <= 0) goto L489
            int r4 = r3.zzb()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r22 = r3.zza()
            r23 = r0
            int r0 = r22 + (-1)
            long r24 = r3.zzc(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r24)
            r8.put(r4, r0)
            r0 = r23
            goto L489
        L4bf:
            r23 = r0
            if (r1 == 0) goto L50e
            r0 = 0
        L4c4:
            int r2 = r1.zzd()
            int r2 = r2 * 64
            if (r0 >= r2) goto L50e
            java.util.List r2 = r1.zzk()
            boolean r2 = com.google.android.gms.measurement.internal.zzqa.zzy(r2, r0)
            if (r2 == 0) goto L500
            com.google.android.gms.measurement.internal.zzio r2 = r10.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r22 = r9
            java.lang.String r9 = "Filter already evaluated. audience ID, filter ID"
            r2.zzc(r9, r3, r4)
            r6.set(r0)
            java.util.List r2 = r1.zzi()
            boolean r2 = com.google.android.gms.measurement.internal.zzqa.zzy(r2, r0)
            if (r2 == 0) goto L502
            r5.set(r0)
            goto L509
        L500:
            r22 = r9
        L502:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L509:
            int r0 = r0 + 1
            r9 = r22
            goto L4c4
        L50e:
            r22 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            java.lang.Object r1 = r13.get(r0)
            r4 = r1
            com.google.android.gms.internal.measurement.zzic r4 = (com.google.android.gms.internal.measurement.zzic) r4
            if (r15 == 0) goto L57b
            if (r14 == 0) goto L57b
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L57b
            java.lang.Long r1 = r10.zze
            if (r1 == 0) goto L57b
            java.lang.Long r1 = r10.zzd
            if (r1 != 0) goto L530
            goto L57b
        L530:
            java.util.Iterator r0 = r0.iterator()
        L534:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57b
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzfj r1 = (com.google.android.gms.internal.measurement.zzfj) r1
            int r2 = r1.zzb()
            java.lang.Long r3 = r10.zze
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.zzm()
            if (r1 == 0) goto L55c
            java.lang.Long r1 = r10.zzd
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L55c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L56d
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L56d:
            boolean r2 = r8.containsKey(r1)
            if (r2 == 0) goto L534
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r8.put(r1, r2)
            goto L534
        L57b:
            com.google.android.gms.measurement.internal.zzy r0 = new com.google.android.gms.measurement.internal.zzy
            java.lang.String r3 = r10.zza
            r9 = 0
            r1 = r0
            r2 = r30
            r28 = r18
            r29 = r19
            r17 = r12
            r12 = r16
            r31 = r13
            r13 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map r1 = r10.zzc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            r1.put(r2, r0)
            r9 = r13
            r12 = r17
            r0 = r23
            r13 = r31
            goto L40b
        L5a4:
            r13 = r9
            r12 = r16
            goto L254
        L5a9:
            boolean r0 = r32.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L5b7
        L5b1:
            r24 = r11
            r11 = r28
            goto L797
        L5b7:
            com.google.android.gms.measurement.internal.zzz r2 = new com.google.android.gms.measurement.internal.zzz
            r3 = 0
            r2.<init>(r10, r3)
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap
            r4.<init>()
            java.util.Iterator r5 = r32.iterator()
        L5c6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5b1
            java.lang.Object r0 = r5.next()
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0
            java.lang.String r6 = r10.zza
            com.google.android.gms.internal.measurement.zzhm r6 = r2.zza(r6, r0)
            if (r6 == 0) goto L793
            com.google.android.gms.measurement.internal.zzpv r7 = r10.zzg
            com.google.android.gms.measurement.internal.zzaw r8 = r7.zzj()
            java.lang.String r9 = r10.zza
            java.lang.String r14 = r6.zzh()
            com.google.android.gms.measurement.internal.zzbd r8 = r8.zzr(r9, r0, r14)
            com.google.android.gms.measurement.internal.zzaw r0 = r7.zzj()
            r0.zzV(r8)
            if (r36 != 0) goto L793
            long r14 = r8.zzc
            java.lang.String r9 = r6.zzh()
            java.lang.Object r0 = r4.get(r9)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L6e7
            com.google.android.gms.measurement.internal.zzaw r7 = r7.zzj()
            java.lang.String r3 = r10.zza
            r7.zzav()
            r7.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            r31 = r2
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r7.zzj()
            java.lang.String r17 = "event_filters"
            r32 = r5
            r24 = r11
            r11 = r28
            r5 = r29
            java.lang.String[] r18 = new java.lang.String[]{r11, r5}     // Catch: android.database.sqlite.SQLiteException -> L6b2 java.lang.Throwable -> L6b8
            java.lang.String r19 = "app_id=? AND event_name=?"
            r29 = r5
            r5 = 2
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch: android.database.sqlite.SQLiteException -> L6b0 java.lang.Throwable -> L6b8
            r20 = 0
            r0[r20] = r3     // Catch: android.database.sqlite.SQLiteException -> L6b0 java.lang.Throwable -> L6b8
            r20 = 1
            r0[r20] = r9     // Catch: android.database.sqlite.SQLiteException -> L6b0 java.lang.Throwable -> L6b8
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch: android.database.sqlite.SQLiteException -> L6b0 java.lang.Throwable -> L6b8
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L6aa android.database.sqlite.SQLiteException -> L6ac
            if (r0 == 0) goto L6a0
            r16 = r14
        L64f:
            r14 = 1
            byte[] r0 = r5.getBlob(r14)     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            com.google.android.gms.internal.measurement.zzfi r14 = com.google.android.gms.internal.measurement.zzfj.zzc()     // Catch: java.io.IOException -> L681 android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            com.google.android.gms.internal.measurement.zzng r0 = com.google.android.gms.measurement.internal.zzqa.zzp(r14, r0)     // Catch: java.io.IOException -> L681 android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            com.google.android.gms.internal.measurement.zzfi r0 = (com.google.android.gms.internal.measurement.zzfi) r0     // Catch: java.io.IOException -> L681 android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch: java.io.IOException -> L681 android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            com.google.android.gms.internal.measurement.zzfj r0 = (com.google.android.gms.internal.measurement.zzfj) r0     // Catch: java.io.IOException -> L681 android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            r14 = 0
            int r15 = r5.getInt(r14)     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            java.lang.Object r15 = r2.get(r14)     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            java.util.List r15 = (java.util.List) r15     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            if (r15 != 0) goto L67d
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            r15.<init>()     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            r2.put(r14, r15)     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
        L67d:
            r15.add(r0)     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            goto L693
        L681:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r14 = r7.zzu     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            com.google.android.gms.measurement.internal.zzhe r14 = r14.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            com.google.android.gms.measurement.internal.zzhc r14 = r14.zze()     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            r14.zzc(r13, r15, r0)     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
        L693:
            boolean r0 = r5.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
            if (r0 != 0) goto L64f
            r5.close()
            r0 = r2
            goto L6dd
        L69e:
            r0 = move-exception
            goto L6c5
        L6a0:
            r16 = r14
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L69e java.lang.Throwable -> L6aa
        L6a6:
            r5.close()
            goto L6dd
        L6aa:
            r0 = move-exception
            goto L6e1
        L6ac:
            r0 = move-exception
            r16 = r14
            goto L6c5
        L6b0:
            r0 = move-exception
            goto L6b5
        L6b2:
            r0 = move-exception
            r29 = r5
        L6b5:
            r16 = r14
            goto L6c4
        L6b8:
            r0 = move-exception
            r5 = 0
            goto L6e1
        L6bb:
            r0 = move-exception
            r32 = r5
            r24 = r11
            r16 = r14
            r11 = r28
        L6c4:
            r5 = 0
        L6c5:
            com.google.android.gms.measurement.internal.zzio r2 = r7.zzu     // Catch: java.lang.Throwable -> L6aa
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L6aa
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L6aa
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> L6aa
            r2.zzc(r12, r3, r0)     // Catch: java.lang.Throwable -> L6aa
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L6aa
            if (r5 == 0) goto L6dd
            goto L6a6
        L6dd:
            r4.put(r9, r0)
            goto L6f1
        L6e1:
            if (r5 == 0) goto L6e6
            r5.close()
        L6e6:
            throw r0
        L6e7:
            r31 = r2
            r32 = r5
            r24 = r11
            r16 = r14
            r11 = r28
        L6f1:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L6f9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L788
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Set r5 = r10.zzb
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto L723
            com.google.android.gms.measurement.internal.zzio r3 = r10.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzj()
            r3.zzb(r1, r7)
            goto L6f9
        L723:
            java.lang.Object r5 = r0.get(r7)
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
            r7 = 1
        L72e:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L777
            java.lang.Object r7 = r5.next()
            com.google.android.gms.internal.measurement.zzfj r7 = (com.google.android.gms.internal.measurement.zzfj) r7
            com.google.android.gms.measurement.internal.zzaa r9 = new com.google.android.gms.measurement.internal.zzaa
            java.lang.String r14 = r10.zza
            r9.<init>(r10, r14, r3, r7)
            java.lang.Long r15 = r10.zzd
            java.lang.Long r14 = r10.zze
            int r7 = r7.zzb()
            boolean r21 = r10.zzf(r3, r7)
            r7 = r14
            r22 = r16
            r14 = r9
            r16 = r7
            r17 = r6
            r18 = r22
            r20 = r8
            boolean r7 = r14.zzd(r15, r16, r17, r18, r20, r21)
            if (r7 == 0) goto L76d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.measurement.internal.zzy r14 = r10.zzd(r14)
            r14.zzc(r9)
            r16 = r22
            goto L72e
        L76d:
            java.util.Set r5 = r10.zzb
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r5.add(r9)
            goto L779
        L777:
            r22 = r16
        L779:
            if (r7 != 0) goto L784
            java.util.Set r5 = r10.zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.add(r3)
        L784:
            r16 = r22
            goto L6f9
        L788:
            r2 = r31
            r5 = r32
            r28 = r11
            r11 = r24
            r3 = 0
            goto L5c6
        L793:
            r24 = r11
            goto L5c6
        L797:
            if (r36 != 0) goto La79
            boolean r0 = r33.isEmpty()
            if (r0 == 0) goto L7a1
            goto L9cf
        L7a1:
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            java.util.Iterator r3 = r33.iterator()
        L7aa:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9cf
            java.lang.Object r0 = r3.next()
            r4 = r0
            com.google.android.gms.internal.measurement.zzio r4 = (com.google.android.gms.internal.measurement.zzio) r4
            java.lang.String r5 = r4.zzg()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L899
            com.google.android.gms.measurement.internal.zzpv r0 = r10.zzg
            com.google.android.gms.measurement.internal.zzaw r6 = r0.zzj()
            java.lang.String r7 = r10.zza
            r6.zzav()
            r6.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            androidx.collection.ArrayMap r8 = new androidx.collection.ArrayMap
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r13 = r6.zzj()
            java.lang.String r14 = "property_filters"
            r9 = r29
            java.lang.String[] r15 = new java.lang.String[]{r11, r9}     // Catch: android.database.sqlite.SQLiteException -> L868 java.lang.Throwable -> L86c
            java.lang.String r16 = "app_id=? AND property_name=?"
            r31 = r3
            r3 = 2
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch: android.database.sqlite.SQLiteException -> L866 java.lang.Throwable -> L86c
            r3 = 0
            r0[r3] = r7     // Catch: android.database.sqlite.SQLiteException -> L866 java.lang.Throwable -> L86c
            r3 = 1
            r0[r3] = r5     // Catch: android.database.sqlite.SQLiteException -> L866 java.lang.Throwable -> L86c
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            android.database.Cursor r3 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch: android.database.sqlite.SQLiteException -> L866 java.lang.Throwable -> L86c
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            if (r0 == 0) goto L85c
        L807:
            r13 = 1
            byte[] r0 = r3.getBlob(r13)     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            com.google.android.gms.internal.measurement.zzfq r14 = com.google.android.gms.internal.measurement.zzfr.zzc()     // Catch: java.io.IOException -> L83c android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            com.google.android.gms.internal.measurement.zzng r0 = com.google.android.gms.measurement.internal.zzqa.zzp(r14, r0)     // Catch: java.io.IOException -> L83c android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            com.google.android.gms.internal.measurement.zzfq r0 = (com.google.android.gms.internal.measurement.zzfq) r0     // Catch: java.io.IOException -> L83c android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch: java.io.IOException -> L83c android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            com.google.android.gms.internal.measurement.zzfr r0 = (com.google.android.gms.internal.measurement.zzfr) r0     // Catch: java.io.IOException -> L83c android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            r14 = 0
            int r15 = r3.getInt(r14)     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            java.lang.Object r16 = r8.get(r15)     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            java.util.List r16 = (java.util.List) r16     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            if (r16 != 0) goto L836
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            r13.<init>()     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            r8.put(r15, r13)     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            goto L838
        L836:
            r13 = r16
        L838:
            r13.add(r0)     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            goto L851
        L83c:
            r0 = move-exception
            r14 = 0
            com.google.android.gms.measurement.internal.zzio r13 = r6.zzu     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            com.google.android.gms.measurement.internal.zzhe r13 = r13.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zze()     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            java.lang.String r15 = "Failed to merge filter"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            r13.zzc(r15, r14, r0)     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
        L851:
            boolean r0 = r3.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
            if (r0 != 0) goto L807
            r3.close()
            r0 = r8
            goto L88d
        L85c:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L864 java.lang.Throwable -> L891
        L860:
            r3.close()
            goto L88d
        L864:
            r0 = move-exception
            goto L875
        L866:
            r0 = move-exception
            goto L874
        L868:
            r0 = move-exception
            r31 = r3
            goto L874
        L86c:
            r0 = move-exception
            r5 = 0
            goto L893
        L86f:
            r0 = move-exception
            r31 = r3
            r9 = r29
        L874:
            r3 = 0
        L875:
            com.google.android.gms.measurement.internal.zzio r6 = r6.zzu     // Catch: java.lang.Throwable -> L891
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()     // Catch: java.lang.Throwable -> L891
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()     // Catch: java.lang.Throwable -> L891
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)     // Catch: java.lang.Throwable -> L891
            r6.zzc(r12, r7, r0)     // Catch: java.lang.Throwable -> L891
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L891
            if (r3 == 0) goto L88d
            goto L860
        L88d:
            r2.put(r5, r0)
            goto L89d
        L891:
            r0 = move-exception
            r5 = r3
        L893:
            if (r5 == 0) goto L898
            r5.close()
        L898:
            throw r0
        L899:
            r31 = r3
            r9 = r29
        L89d:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L8a5:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L9c9
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Set r6 = r10.zzb
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L8d0
            com.google.android.gms.measurement.internal.zzio r0 = r10.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            r0.zzb(r1, r7)
            goto L9c9
        L8d0:
            java.lang.Object r6 = r0.get(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L8db:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L9b4
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.measurement.zzfr r7 = (com.google.android.gms.internal.measurement.zzfr) r7
            com.google.android.gms.measurement.internal.zzio r8 = r10.zzu
            com.google.android.gms.measurement.internal.zzhe r13 = r8.zzaW()
            java.lang.String r13 = r13.zzr()
            r14 = 2
            boolean r13 = android.util.Log.isLoggable(r13, r14)
            if (r13 == 0) goto L945
            com.google.android.gms.measurement.internal.zzhe r13 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r13 = r13.zzj()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            boolean r16 = r7.zzj()
            if (r16 == 0) goto L917
            int r16 = r7.zza()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r32 = r0
            r14 = r16
            goto L91a
        L917:
            r32 = r0
            r14 = 0
        L91a:
            com.google.android.gms.measurement.internal.zzgx r0 = r8.zzj()
            r16 = r1
            java.lang.String r1 = r7.zze()
            java.lang.String r0 = r0.zzf(r1)
            java.lang.String r1 = "Evaluating filter. audience, filter, property"
            r13.zzd(r1, r15, r14, r0)
            com.google.android.gms.measurement.internal.zzhe r0 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            com.google.android.gms.measurement.internal.zzpv r1 = r10.zzg
            com.google.android.gms.measurement.internal.zzqa r1 = r1.zzA()
            java.lang.String r1 = r1.zzs(r7)
            java.lang.String r13 = "Filter definition"
            r0.zzb(r13, r1)
            goto L949
        L945:
            r32 = r0
            r16 = r1
        L949:
            boolean r0 = r7.zzj()
            if (r0 == 0) goto L98c
            int r0 = r7.zza()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto L958
            goto L98c
        L958:
            com.google.android.gms.measurement.internal.zzac r0 = new com.google.android.gms.measurement.internal.zzac
            java.lang.String r1 = r10.zza
            r0.<init>(r10, r1, r5, r7)
            java.lang.Long r1 = r10.zzd
            java.lang.Long r8 = r10.zze
            int r7 = r7.zza()
            boolean r7 = r10.zzf(r5, r7)
            boolean r7 = r0.zzd(r1, r8, r4, r7)
            if (r7 == 0) goto L982
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.measurement.internal.zzy r1 = r10.zzd(r1)
            r1.zzc(r0)
            r0 = r32
            r1 = r16
            goto L8db
        L982:
            java.util.Set r0 = r10.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.add(r1)
            goto L9b8
        L98c:
            com.google.android.gms.measurement.internal.zzhe r0 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()
            java.lang.String r1 = r10.zza
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)
            boolean r6 = r7.zzj()
            if (r6 == 0) goto L9a9
            int r6 = r7.zza()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L9aa
        L9a9:
            r6 = 0
        L9aa:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Invalid property filter ID. appId, id"
            r0.zzc(r7, r1, r6)
            goto L9ba
        L9b4:
            r32 = r0
            r16 = r1
        L9b8:
            if (r7 != 0) goto L9c3
        L9ba:
            java.util.Set r0 = r10.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.add(r1)
        L9c3:
            r0 = r32
            r1 = r16
            goto L8a5
        L9c9:
            r3 = r31
            r29 = r9
            goto L7aa
        L9cf:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = r10.zzc
            java.util.Set r0 = r0.keySet()
            java.util.Set r2 = r10.zzb
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L9e3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La78
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map r3 = r10.zzc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.zzy r3 = (com.google.android.gms.measurement.internal.zzy) r3
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.internal.measurement.zzhi r0 = r3.zza(r0)
            r1.add(r0)
            com.google.android.gms.measurement.internal.zzpv r3 = r10.zzg
            com.google.android.gms.measurement.internal.zzaw r3 = r3.zzj()
            java.lang.String r5 = r10.zza
            com.google.android.gms.internal.measurement.zzic r0 = r0.zzd()
            r3.zzav()
            r3.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            byte[] r0 = r0.zzcd()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r6.put(r11, r4)
            r4 = r24
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.zzj()     // Catch: android.database.sqlite.SQLiteException -> La5f
            java.lang.String r7 = "audience_filter_values"
            r8 = 5
            r9 = 0
            long r6 = r0.insertWithOnConflict(r7, r9, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> La5d
            r12 = -1
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto La74
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu     // Catch: android.database.sqlite.SQLiteException -> La5d
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> La5d
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: android.database.sqlite.SQLiteException -> La5d
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)     // Catch: android.database.sqlite.SQLiteException -> La5d
            r0.zzb(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> La5d
            goto La74
        La5d:
            r0 = move-exception
            goto La61
        La5f:
            r0 = move-exception
            r9 = 0
        La61:
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.zzc(r6, r5, r0)
        La74:
            r24 = r4
            goto L9e3
        La78:
            return r1
        La79:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        La7f:
            r0 = move-exception
            r5 = r4
        La81:
            if (r5 == 0) goto La86
            r5.close()
        La86:
            throw r0
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
            r1 = this;
            r0 = 0
            return r0
    }
}
