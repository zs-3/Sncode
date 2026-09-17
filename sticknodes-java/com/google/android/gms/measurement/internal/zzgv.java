package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzgv extends com.google.android.gms.measurement.internal.zzg {
    private static final java.lang.String[] zza = null;
    private final com.google.android.gms.measurement.internal.zzgt zzb;
    private boolean zzc;

    static {
            java.lang.String r0 = "app_version"
            java.lang.String r1 = "ALTER TABLE messages ADD COLUMN app_version TEXT;"
            java.lang.String r2 = "app_version_int"
            java.lang.String r3 = "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.google.android.gms.measurement.internal.zzgv.zza = r0
            return
    }

    zzgv(com.google.android.gms.measurement.internal.zzio r3) {
            r2 = this;
            r2.<init>(r3)
            com.google.android.gms.measurement.internal.zzgt r3 = new com.google.android.gms.measurement.internal.zzgt
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            android.content.Context r0 = r0.zzaT()
            com.google.android.gms.measurement.internal.zzio r1 = r2.zzu
            r1.zzf()
            java.lang.String r1 = "google_app_measurement_local.db"
            r3.<init>(r2, r0, r1)
            r2.zzb = r3
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzr() {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzgv.zza
            return r0
    }

    private final boolean zzs(int r18, byte[] r19) {
            r17 = this;
            r1 = r17
            r17.zzg()
            boolean r0 = r1.zzc
            r2 = 0
            if (r0 == 0) goto Lb
            goto L6a
        Lb:
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r3.zzf()
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzbl
            r5 = 0
            boolean r0 = r0.zzx(r5, r4)
            if (r0 == 0) goto L25
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzh()
            com.google.android.gms.measurement.internal.zzr r0 = r0.zzk(r5)
            goto L26
        L25:
            r0 = r5
        L26:
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            java.lang.String r8 = "type"
            r6.put(r8, r7)
            java.lang.String r7 = "entry"
            r8 = r19
            r6.put(r7, r8)
            com.google.android.gms.measurement.internal.zzam r7 = r3.zzf()
            boolean r4 = r7.zzx(r5, r4)
            if (r4 == 0) goto L59
            if (r0 == 0) goto L59
            java.lang.String r4 = r0.zzc
            java.lang.String r7 = "app_version"
            r6.put(r7, r4)
            long r7 = r0.zzj
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.String r4 = "app_version_int"
            r6.put(r4, r0)
        L59:
            r3.zzf()
            r4 = 5
            r7 = 0
            r8 = 5
        L5f:
            if (r7 >= r4) goto L17e
            r9 = 1
            android.database.sqlite.SQLiteDatabase r10 = r17.zzh()     // Catch: java.lang.Throwable -> L109 android.database.sqlite.SQLiteException -> L10f android.database.sqlite.SQLiteDatabaseLockedException -> L138 android.database.sqlite.SQLiteFullException -> L14c
            if (r10 != 0) goto L6b
            r1.zzc = r9     // Catch: java.lang.Throwable -> Lf9 android.database.sqlite.SQLiteException -> Lfe android.database.sqlite.SQLiteDatabaseLockedException -> L102 android.database.sqlite.SQLiteFullException -> L105
        L6a:
            return r2
        L6b:
            r10.beginTransaction()     // Catch: java.lang.Throwable -> Lf9 android.database.sqlite.SQLiteException -> Lfe android.database.sqlite.SQLiteDatabaseLockedException -> L102 android.database.sqlite.SQLiteFullException -> L105
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r11 = r10.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> Lf9 android.database.sqlite.SQLiteException -> Lfe android.database.sqlite.SQLiteDatabaseLockedException -> L102 android.database.sqlite.SQLiteFullException -> L105
            r12 = 0
            if (r11 == 0) goto L8e
            boolean r0 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L83 android.database.sqlite.SQLiteDatabaseLockedException -> L87 android.database.sqlite.SQLiteFullException -> L8a java.lang.Throwable -> L171
            if (r0 == 0) goto L8e
            long r12 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L83 android.database.sqlite.SQLiteDatabaseLockedException -> L87 android.database.sqlite.SQLiteFullException -> L8a java.lang.Throwable -> L171
            goto L8e
        L83:
            r0 = move-exception
            r2 = r5
            goto L113
        L87:
            r2 = r5
            goto L13b
        L8a:
            r0 = move-exception
            r2 = r5
            goto L150
        L8e:
            java.lang.String r0 = "messages"
            r14 = 100000(0x186a0, double:4.94066E-319)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 < 0) goto Le0
            com.google.android.gms.measurement.internal.zzhe r16 = r3.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L83 android.database.sqlite.SQLiteDatabaseLockedException -> L87 android.database.sqlite.SQLiteFullException -> L8a java.lang.Throwable -> L171
            com.google.android.gms.measurement.internal.zzhc r4 = r16.zze()     // Catch: android.database.sqlite.SQLiteException -> L83 android.database.sqlite.SQLiteDatabaseLockedException -> L87 android.database.sqlite.SQLiteFullException -> L8a java.lang.Throwable -> L171
            java.lang.String r5 = "Data loss, local db full"
            r4.zza(r5)     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            long r14 = r14 - r12
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            r12 = 1
            long r14 = r14 + r12
            java.lang.String r12 = java.lang.Long.toString(r14)     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            r5[r2] = r12     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            int r4 = r10.delete(r0, r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            long r4 = (long) r4     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            int r12 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r12 == 0) goto Le0
            com.google.android.gms.measurement.internal.zzhe r12 = r3.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            com.google.android.gms.measurement.internal.zzhc r12 = r12.zze()     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            java.lang.String r13 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            long r14 = r14 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r14)     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            r12.zzd(r13, r2, r9, r4)     // Catch: android.database.sqlite.SQLiteException -> Ld6 android.database.sqlite.SQLiteDatabaseLockedException -> Ld9 android.database.sqlite.SQLiteFullException -> Ldc java.lang.Throwable -> L171
            goto Le0
        Ld6:
            r0 = move-exception
            r2 = 0
            goto L113
        Ld9:
            r2 = 0
            goto L13b
        Ldc:
            r0 = move-exception
            r2 = 0
            goto L150
        Le0:
            r2 = 0
            r10.insertOrThrow(r0, r2, r6)     // Catch: android.database.sqlite.SQLiteException -> Lf4 android.database.sqlite.SQLiteFullException -> Lf6 android.database.sqlite.SQLiteDatabaseLockedException -> L13b java.lang.Throwable -> L171
            r10.setTransactionSuccessful()     // Catch: android.database.sqlite.SQLiteException -> Lf4 android.database.sqlite.SQLiteFullException -> Lf6 android.database.sqlite.SQLiteDatabaseLockedException -> L13b java.lang.Throwable -> L171
            r10.endTransaction()     // Catch: android.database.sqlite.SQLiteException -> Lf4 android.database.sqlite.SQLiteFullException -> Lf6 android.database.sqlite.SQLiteDatabaseLockedException -> L13b java.lang.Throwable -> L171
            if (r11 == 0) goto Lef
            r11.close()
        Lef:
            r10.close()
            r2 = 1
            return r2
        Lf4:
            r0 = move-exception
            goto L113
        Lf6:
            r0 = move-exception
            goto L150
        Lf9:
            r0 = move-exception
            r2 = r5
            r5 = r2
            goto L173
        Lfe:
            r0 = move-exception
            r2 = r5
            r11 = r2
            goto L113
        L102:
            r2 = r5
            r11 = r2
            goto L13b
        L105:
            r0 = move-exception
            r2 = r5
            r11 = r2
            goto L150
        L109:
            r0 = move-exception
            r2 = r5
            r5 = r2
            r10 = r5
            goto L173
        L10f:
            r0 = move-exception
            r2 = r5
            r10 = r2
            r11 = r10
        L113:
            if (r10 == 0) goto L11e
            boolean r4 = r10.inTransaction()     // Catch: java.lang.Throwable -> L171
            if (r4 == 0) goto L11e
            r10.endTransaction()     // Catch: java.lang.Throwable -> L171
        L11e:
            com.google.android.gms.measurement.internal.zzio r4 = r1.zzu     // Catch: java.lang.Throwable -> L171
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()     // Catch: java.lang.Throwable -> L171
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()     // Catch: java.lang.Throwable -> L171
            java.lang.String r5 = "Error writing entry to local database"
            r4.zzb(r5, r0)     // Catch: java.lang.Throwable -> L171
            r4 = 1
            r1.zzc = r4     // Catch: java.lang.Throwable -> L171
            if (r11 == 0) goto L135
            r11.close()
        L135:
            if (r10 == 0) goto L16a
            goto L148
        L138:
            r2 = r5
            r10 = r2
            r11 = r10
        L13b:
            long r4 = (long) r8
            android.os.SystemClock.sleep(r4)     // Catch: java.lang.Throwable -> L171
            int r8 = r8 + 20
            if (r11 == 0) goto L146
            r11.close()
        L146:
            if (r10 == 0) goto L16a
        L148:
            r10.close()
            goto L16a
        L14c:
            r0 = move-exception
            r2 = r5
            r10 = r2
            r11 = r10
        L150:
            com.google.android.gms.measurement.internal.zzio r4 = r1.zzu     // Catch: java.lang.Throwable -> L171
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()     // Catch: java.lang.Throwable -> L171
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()     // Catch: java.lang.Throwable -> L171
            java.lang.String r5 = "Error writing entry; local database full"
            r4.zzb(r5, r0)     // Catch: java.lang.Throwable -> L171
            r4 = 1
            r1.zzc = r4     // Catch: java.lang.Throwable -> L171
            if (r11 == 0) goto L167
            r11.close()
        L167:
            if (r10 == 0) goto L16a
            goto L148
        L16a:
            int r7 = r7 + 1
            r5 = r2
            r2 = 0
            r4 = 5
            goto L5f
        L171:
            r0 = move-exception
            r5 = r11
        L173:
            if (r5 == 0) goto L178
            r5.close()
        L178:
            if (r10 == 0) goto L17d
            r10.close()
        L17d:
            throw r0
        L17e:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.zza(r2)
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
            r1 = this;
            r0 = 0
            return r0
    }

    final android.database.sqlite.SQLiteDatabase zzh() throws android.database.sqlite.SQLiteException {
            r2 = this;
            boolean r0 = r2.zzc
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.google.android.gms.measurement.internal.zzgt r0 = r2.zzb
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()
            if (r0 != 0) goto L12
            r0 = 1
            r2.zzc = r0
            return r1
        L12:
            return r0
    }

    public final java.util.List zzi(int r28) {
            r27 = this;
            r1 = r27
            java.lang.String r2 = "entry"
            java.lang.String r3 = "type"
            java.lang.String r4 = "Error reading entries from local database"
            java.lang.String r5 = "rowid"
            r27.zzg()
            boolean r0 = r1.zzc
            r6 = 0
            if (r0 == 0) goto L13
            return r6
        L13:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r0 = r27.zzl()
            if (r0 == 0) goto L348
            r8 = 5
            r9 = 0
            r10 = 0
            r11 = 5
        L22:
            if (r10 >= r8) goto L337
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r27.zzh()     // Catch: java.lang.Throwable -> L2c5 android.database.sqlite.SQLiteException -> L2c9 android.database.sqlite.SQLiteDatabaseLockedException -> L2f3 android.database.sqlite.SQLiteFullException -> L307
            if (r15 != 0) goto L2e
            r1.zzc = r12     // Catch: java.lang.Throwable -> L2af android.database.sqlite.SQLiteException -> L2b5 android.database.sqlite.SQLiteDatabaseLockedException -> L2ba android.database.sqlite.SQLiteFullException -> L2bf
            return r6
        L2e:
            r15.beginTransaction()     // Catch: java.lang.Throwable -> L2af android.database.sqlite.SQLiteException -> L2b5 android.database.sqlite.SQLiteDatabaseLockedException -> L2ba android.database.sqlite.SQLiteFullException -> L2bf
            java.lang.String r0 = "3"
            java.lang.String r14 = "messages"
            java.lang.String[] r16 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r17 = "type=?"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L2a0
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid desc"
            java.lang.String r21 = "1"
            r13 = r15
            r28 = r15
            r15 = r16
            r16 = r17
            r17 = r0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L29c
            boolean r0 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L298
            r22 = -1
            if (r0 == 0) goto L64
            long r14 = r13.getLong(r9)     // Catch: java.lang.Throwable -> L298
            r13.close()     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
            goto L69
        L64:
            r13.close()     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
            r14 = r22
        L69:
            int r0 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r0 == 0) goto L7c
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
            r13[r9] = r14     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
            r16 = r0
            r17 = r13
            goto L80
        L7c:
            r16 = r6
            r17 = r16
        L80:
            java.lang.String[] r0 = new java.lang.String[]{r5, r3, r2}     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
            com.google.android.gms.measurement.internal.zzio r15 = r1.zzu     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
            com.google.android.gms.measurement.internal.zzam r13 = r15.zzf()     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
            com.google.android.gms.measurement.internal.zzgg r14 = com.google.android.gms.measurement.internal.zzgi.zzbl     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
            boolean r13 = r13.zzx(r6, r14)     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
            if (r13 == 0) goto L9a
            java.lang.String r0 = "app_version"
            java.lang.String r13 = "app_version_int"
            java.lang.String[] r0 = new java.lang.String[]{r5, r3, r2, r0, r13}     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
        L9a:
            java.lang.String r14 = "messages"
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid asc"
            r13 = 100
            java.lang.String r21 = java.lang.Integer.toString(r13)     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
            r13 = r28
            r24 = r15
            r15 = r0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L289 android.database.sqlite.SQLiteException -> L28d android.database.sqlite.SQLiteDatabaseLockedException -> L291 android.database.sqlite.SQLiteFullException -> L294
        Lb1:
            boolean r0 = r13.moveToNext()     // Catch: java.lang.Throwable -> L260 android.database.sqlite.SQLiteException -> L26a android.database.sqlite.SQLiteDatabaseLockedException -> L274 android.database.sqlite.SQLiteFullException -> L27e
            if (r0 == 0) goto L214
            long r22 = r13.getLong(r9)     // Catch: java.lang.Throwable -> L205 android.database.sqlite.SQLiteException -> L209 android.database.sqlite.SQLiteDatabaseLockedException -> L20d android.database.sqlite.SQLiteFullException -> L210
            int r0 = r13.getInt(r12)     // Catch: java.lang.Throwable -> L205 android.database.sqlite.SQLiteException -> L209 android.database.sqlite.SQLiteDatabaseLockedException -> L20d android.database.sqlite.SQLiteFullException -> L210
            r14 = 2
            byte[] r15 = r13.getBlob(r14)     // Catch: java.lang.Throwable -> L205 android.database.sqlite.SQLiteException -> L209 android.database.sqlite.SQLiteDatabaseLockedException -> L20d android.database.sqlite.SQLiteFullException -> L210
            com.google.android.gms.measurement.internal.zzam r8 = r24.zzf()     // Catch: java.lang.Throwable -> L205 android.database.sqlite.SQLiteException -> L209 android.database.sqlite.SQLiteDatabaseLockedException -> L20d android.database.sqlite.SQLiteFullException -> L210
            com.google.android.gms.measurement.internal.zzgg r14 = com.google.android.gms.measurement.internal.zzgi.zzbl     // Catch: java.lang.Throwable -> L205 android.database.sqlite.SQLiteException -> L209 android.database.sqlite.SQLiteDatabaseLockedException -> L20d android.database.sqlite.SQLiteFullException -> L210
            boolean r8 = r8.zzx(r6, r14)     // Catch: java.lang.Throwable -> L205 android.database.sqlite.SQLiteException -> L209 android.database.sqlite.SQLiteDatabaseLockedException -> L20d android.database.sqlite.SQLiteFullException -> L210
            r14 = 4
            r6 = 3
            if (r8 == 0) goto Ldb
            java.lang.String r8 = r13.getString(r6)     // Catch: java.lang.Throwable -> L260 android.database.sqlite.SQLiteException -> L26a android.database.sqlite.SQLiteDatabaseLockedException -> L274 android.database.sqlite.SQLiteFullException -> L27e
            long r19 = r13.getLong(r14)     // Catch: java.lang.Throwable -> L260 android.database.sqlite.SQLiteException -> L26a android.database.sqlite.SQLiteDatabaseLockedException -> L274 android.database.sqlite.SQLiteFullException -> L27e
            goto Lde
        Ldb:
            r19 = 0
            r8 = 0
        Lde:
            r25 = r19
            r20 = r13
            r12 = r25
            if (r0 != 0) goto L122
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            int r0 = r15.length     // Catch: java.lang.Throwable -> L108 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L10a
            r6.unmarshall(r15, r9, r0)     // Catch: java.lang.Throwable -> L108 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L10a
            r6.setDataPosition(r9)     // Catch: java.lang.Throwable -> L108 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L10a
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbh> r0 = com.google.android.gms.measurement.internal.zzbh.CREATOR     // Catch: java.lang.Throwable -> L108 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L10a
            java.lang.Object r0 = r0.createFromParcel(r6)     // Catch: java.lang.Throwable -> L108 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L10a
            com.google.android.gms.measurement.internal.zzbh r0 = (com.google.android.gms.measurement.internal.zzbh) r0     // Catch: java.lang.Throwable -> L108 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L10a
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            if (r0 == 0) goto L1fe
            com.google.android.gms.measurement.internal.zzgu r6 = new com.google.android.gms.measurement.internal.zzgu     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r6.<init>(r0, r8, r12)     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r7.add(r6)     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            goto L1fe
        L108:
            r0 = move-exception
            goto L11e
        L10a:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L108
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L108
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L108
            java.lang.String r8 = "Failed to load event from local database"
            r0.zza(r8)     // Catch: java.lang.Throwable -> L108
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            goto L1fe
        L11e:
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            throw r0     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
        L122:
            r6 = 1
            if (r0 != r6) goto L161
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            int r0 = r15.length     // Catch: java.lang.Throwable -> L13c com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L13e
            r6.unmarshall(r15, r9, r0)     // Catch: java.lang.Throwable -> L13c com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L13e
            r6.setDataPosition(r9)     // Catch: java.lang.Throwable -> L13c com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L13e
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzqb> r0 = com.google.android.gms.measurement.internal.zzqb.CREATOR     // Catch: java.lang.Throwable -> L13c com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L13e
            java.lang.Object r0 = r0.createFromParcel(r6)     // Catch: java.lang.Throwable -> L13c com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L13e
            com.google.android.gms.measurement.internal.zzqb r0 = (com.google.android.gms.measurement.internal.zzqb) r0     // Catch: java.lang.Throwable -> L13c com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L13e
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            goto L151
        L13c:
            r0 = move-exception
            goto L15d
        L13e:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L13c
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L13c
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L13c
            java.lang.String r14 = "Failed to load user property from local database"
            r0.zza(r14)     // Catch: java.lang.Throwable -> L13c
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r0 = 0
        L151:
            if (r0 == 0) goto L1fe
            com.google.android.gms.measurement.internal.zzgu r6 = new com.google.android.gms.measurement.internal.zzgu     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r6.<init>(r0, r8, r12)     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r7.add(r6)     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            goto L1fe
        L15d:
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            throw r0     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
        L161:
            r6 = 2
            if (r0 != r6) goto L19f
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            int r0 = r15.length     // Catch: java.lang.Throwable -> L17b com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L17d
            r6.unmarshall(r15, r9, r0)     // Catch: java.lang.Throwable -> L17b com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L17d
            r6.setDataPosition(r9)     // Catch: java.lang.Throwable -> L17b com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L17d
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzai> r0 = com.google.android.gms.measurement.internal.zzai.CREATOR     // Catch: java.lang.Throwable -> L17b com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L17d
            java.lang.Object r0 = r0.createFromParcel(r6)     // Catch: java.lang.Throwable -> L17b com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L17d
            com.google.android.gms.measurement.internal.zzai r0 = (com.google.android.gms.measurement.internal.zzai) r0     // Catch: java.lang.Throwable -> L17b com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L17d
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            goto L190
        L17b:
            r0 = move-exception
            goto L19b
        L17d:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L17b
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L17b
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L17b
            java.lang.String r14 = "Failed to load conditional user property from local database"
            r0.zza(r14)     // Catch: java.lang.Throwable -> L17b
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r0 = 0
        L190:
            if (r0 == 0) goto L1fe
            com.google.android.gms.measurement.internal.zzgu r6 = new com.google.android.gms.measurement.internal.zzgu     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r6.<init>(r0, r8, r12)     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r7.add(r6)     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            goto L1fe
        L19b:
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            throw r0     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
        L19f:
            if (r0 != r14) goto L1dc
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            int r0 = r15.length     // Catch: java.lang.Throwable -> L1b8 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L1ba
            r6.unmarshall(r15, r9, r0)     // Catch: java.lang.Throwable -> L1b8 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L1ba
            r6.setDataPosition(r9)     // Catch: java.lang.Throwable -> L1b8 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L1ba
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbf> r0 = com.google.android.gms.measurement.internal.zzbf.CREATOR     // Catch: java.lang.Throwable -> L1b8 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L1ba
            java.lang.Object r0 = r0.createFromParcel(r6)     // Catch: java.lang.Throwable -> L1b8 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L1ba
            com.google.android.gms.measurement.internal.zzbf r0 = (com.google.android.gms.measurement.internal.zzbf) r0     // Catch: java.lang.Throwable -> L1b8 com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException -> L1ba
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            goto L1cd
        L1b8:
            r0 = move-exception
            goto L1d8
        L1ba:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L1b8
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L1b8
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L1b8
            java.lang.String r14 = "Failed to load default event parameters from local database"
            r0.zza(r14)     // Catch: java.lang.Throwable -> L1b8
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r0 = 0
        L1cd:
            if (r0 == 0) goto L1fe
            com.google.android.gms.measurement.internal.zzgu r6 = new com.google.android.gms.measurement.internal.zzgu     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r6.<init>(r0, r8, r12)     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r7.add(r6)     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            goto L1fe
        L1d8:
            r6.recycle()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            throw r0     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
        L1dc:
            r6 = 3
            if (r0 != r6) goto L1ef
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            java.lang.String r6 = "Skipping app launch break"
            r0.zza(r6)     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            goto L1fe
        L1ef:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            java.lang.String r6 = "Unknown record type in local database"
            r0.zza(r6)     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
        L1fe:
            r13 = r20
            r6 = 0
            r8 = 5
            r12 = 1
            goto Lb1
        L205:
            r0 = move-exception
            r20 = r13
            goto L252
        L209:
            r0 = move-exception
            r20 = r13
            goto L256
        L20d:
            r20 = r13
            goto L259
        L210:
            r0 = move-exception
            r20 = r13
            goto L25d
        L214:
            r20 = r13
            java.lang.String r0 = "messages"
            java.lang.String r6 = "rowid <= ?"
            r8 = 1
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            java.lang.String r8 = java.lang.Long.toString(r22)     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r12[r9] = r8     // Catch: java.lang.Throwable -> L251 android.database.sqlite.SQLiteException -> L255 android.database.sqlite.SQLiteDatabaseLockedException -> L259 android.database.sqlite.SQLiteFullException -> L25c
            r8 = r28
            int r0 = r8.delete(r0, r6, r12)     // Catch: java.lang.Throwable -> L24b android.database.sqlite.SQLiteException -> L24d android.database.sqlite.SQLiteFullException -> L24f android.database.sqlite.SQLiteDatabaseLockedException -> L278
            int r6 = r7.size()     // Catch: java.lang.Throwable -> L24b android.database.sqlite.SQLiteException -> L24d android.database.sqlite.SQLiteFullException -> L24f android.database.sqlite.SQLiteDatabaseLockedException -> L278
            if (r0 >= r6) goto L23e
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L24b android.database.sqlite.SQLiteException -> L24d android.database.sqlite.SQLiteFullException -> L24f android.database.sqlite.SQLiteDatabaseLockedException -> L278
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L24b android.database.sqlite.SQLiteException -> L24d android.database.sqlite.SQLiteFullException -> L24f android.database.sqlite.SQLiteDatabaseLockedException -> L278
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L24b android.database.sqlite.SQLiteException -> L24d android.database.sqlite.SQLiteFullException -> L24f android.database.sqlite.SQLiteDatabaseLockedException -> L278
            java.lang.String r6 = "Fewer entries removed from local database than expected"
            r0.zza(r6)     // Catch: java.lang.Throwable -> L24b android.database.sqlite.SQLiteException -> L24d android.database.sqlite.SQLiteFullException -> L24f android.database.sqlite.SQLiteDatabaseLockedException -> L278
        L23e:
            r8.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L24b android.database.sqlite.SQLiteException -> L24d android.database.sqlite.SQLiteFullException -> L24f android.database.sqlite.SQLiteDatabaseLockedException -> L278
            r8.endTransaction()     // Catch: java.lang.Throwable -> L24b android.database.sqlite.SQLiteException -> L24d android.database.sqlite.SQLiteFullException -> L24f android.database.sqlite.SQLiteDatabaseLockedException -> L278
            r20.close()
            r8.close()
            return r7
        L24b:
            r0 = move-exception
            goto L265
        L24d:
            r0 = move-exception
            goto L26f
        L24f:
            r0 = move-exception
            goto L283
        L251:
            r0 = move-exception
        L252:
            r8 = r28
            goto L265
        L255:
            r0 = move-exception
        L256:
            r8 = r28
            goto L26f
        L259:
            r8 = r28
            goto L278
        L25c:
            r0 = move-exception
        L25d:
            r8 = r28
            goto L283
        L260:
            r0 = move-exception
            r8 = r28
            r20 = r13
        L265:
            r15 = r8
            r6 = r20
            goto L32c
        L26a:
            r0 = move-exception
            r8 = r28
            r20 = r13
        L26f:
            r15 = r8
            r13 = r20
            goto L2cc
        L274:
            r8 = r28
            r20 = r13
        L278:
            r15 = r8
            r6 = r10
            r13 = r20
            goto L2f6
        L27e:
            r0 = move-exception
            r8 = r28
            r20 = r13
        L283:
            r15 = r8
            r6 = r10
            r13 = r20
            goto L30b
        L289:
            r0 = move-exception
            r8 = r28
            goto L2b1
        L28d:
            r0 = move-exception
            r8 = r28
            goto L2b7
        L291:
            r8 = r28
            goto L2bb
        L294:
            r0 = move-exception
            r8 = r28
            goto L2c1
        L298:
            r0 = move-exception
            r8 = r28
            goto L2a3
        L29c:
            r0 = move-exception
            r8 = r28
            goto L2a2
        L2a0:
            r0 = move-exception
            r8 = r15
        L2a2:
            r13 = 0
        L2a3:
            if (r13 == 0) goto L2a8
            r13.close()     // Catch: java.lang.Throwable -> L2a9 android.database.sqlite.SQLiteException -> L2ab android.database.sqlite.SQLiteFullException -> L2ad android.database.sqlite.SQLiteDatabaseLockedException -> L2bb
        L2a8:
            throw r0     // Catch: java.lang.Throwable -> L2a9 android.database.sqlite.SQLiteException -> L2ab android.database.sqlite.SQLiteFullException -> L2ad android.database.sqlite.SQLiteDatabaseLockedException -> L2bb
        L2a9:
            r0 = move-exception
            goto L2b1
        L2ab:
            r0 = move-exception
            goto L2b7
        L2ad:
            r0 = move-exception
            goto L2c1
        L2af:
            r0 = move-exception
            r8 = r15
        L2b1:
            r15 = r8
            r6 = 0
            goto L32c
        L2b5:
            r0 = move-exception
            r8 = r15
        L2b7:
            r15 = r8
            r13 = 0
            goto L2cc
        L2ba:
            r8 = r15
        L2bb:
            r15 = r8
            r6 = r10
            r13 = 0
            goto L2f6
        L2bf:
            r0 = move-exception
            r8 = r15
        L2c1:
            r15 = r8
            r6 = r10
            r13 = 0
            goto L30b
        L2c5:
            r0 = move-exception
            r6 = 0
            r15 = 0
            goto L32c
        L2c9:
            r0 = move-exception
            r13 = 0
            r15 = 0
        L2cc:
            if (r15 == 0) goto L2d7
            boolean r6 = r15.inTransaction()     // Catch: java.lang.Throwable -> L32a
            if (r6 == 0) goto L2d7
            r15.endTransaction()     // Catch: java.lang.Throwable -> L32a
        L2d7:
            com.google.android.gms.measurement.internal.zzio r6 = r1.zzu     // Catch: java.lang.Throwable -> L32a
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()     // Catch: java.lang.Throwable -> L32a
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()     // Catch: java.lang.Throwable -> L32a
            r6.zzb(r4, r0)     // Catch: java.lang.Throwable -> L32a
            r6 = 1
            r1.zzc = r6     // Catch: java.lang.Throwable -> L32a
            if (r13 == 0) goto L2ec
            r13.close()
        L2ec:
            if (r15 == 0) goto L2f1
            r15.close()
        L2f1:
            r6 = r10
            goto L323
        L2f3:
            r6 = r10
            r13 = 0
            r15 = 0
        L2f6:
            long r9 = (long) r11
            android.os.SystemClock.sleep(r9)     // Catch: java.lang.Throwable -> L32a
            int r11 = r11 + 20
            if (r13 == 0) goto L301
            r13.close()
        L301:
            if (r15 == 0) goto L323
        L303:
            r15.close()
            goto L323
        L307:
            r0 = move-exception
            r6 = r10
            r13 = 0
            r15 = 0
        L30b:
            com.google.android.gms.measurement.internal.zzio r8 = r1.zzu     // Catch: java.lang.Throwable -> L32a
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()     // Catch: java.lang.Throwable -> L32a
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()     // Catch: java.lang.Throwable -> L32a
            r8.zzb(r4, r0)     // Catch: java.lang.Throwable -> L32a
            r8 = 1
            r1.zzc = r8     // Catch: java.lang.Throwable -> L32a
            if (r13 == 0) goto L320
            r13.close()
        L320:
            if (r15 == 0) goto L323
            goto L303
        L323:
            int r10 = r6 + 1
            r6 = 0
            r8 = 5
            r9 = 0
            goto L22
        L32a:
            r0 = move-exception
            r6 = r13
        L32c:
            if (r6 == 0) goto L331
            r6.close()
        L331:
            if (r15 == 0) goto L336
            r15.close()
        L336:
            throw r0
        L337:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.zza(r2)
            r2 = 0
            return r2
        L348:
            return r7
    }

    public final void zzj() {
            r3 = this;
            r3.zzg()
            android.database.sqlite.SQLiteDatabase r0 = r3.zzh()     // Catch: android.database.sqlite.SQLiteException -> L26
            if (r0 == 0) goto L25
            java.lang.String r1 = "messages"
            r2 = 0
            int r0 = r0.delete(r1, r2, r2)     // Catch: android.database.sqlite.SQLiteException -> L26
            if (r0 <= 0) goto L25
            com.google.android.gms.measurement.internal.zzio r1 = r3.zzu     // Catch: android.database.sqlite.SQLiteException -> L26
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L26
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()     // Catch: android.database.sqlite.SQLiteException -> L26
            java.lang.String r2 = "Reset local analytics data. records"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: android.database.sqlite.SQLiteException -> L26
            r1.zzb(r2, r0)     // Catch: android.database.sqlite.SQLiteException -> L26
        L25:
            return
        L26:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Error resetting local analytics data. error"
            r1.zzb(r2, r0)
            return
    }

    public final boolean zzk() {
            r2 = this;
            r0 = 0
            byte[] r0 = new byte[r0]
            r1 = 3
            boolean r0 = r2.zzs(r1, r0)
            return r0
    }

    final boolean zzl() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            android.content.Context r1 = r0.zzaT()
            r0.zzf()
            java.lang.String r0 = "google_app_measurement_local.db"
            java.io.File r0 = r1.getDatabasePath(r0)
            boolean r0 = r0.exists()
            return r0
    }

    public final boolean zzm() {
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r11.zzg()
            boolean r1 = r11.zzc
            r2 = 0
            if (r1 == 0) goto Lc
            goto L99
        Lc:
            boolean r1 = r11.zzl()
            if (r1 == 0) goto L99
            r1 = 5
            r3 = 0
            r4 = 5
        L15:
            if (r3 >= r1) goto L8a
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r11.zzh()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteFullException -> L44 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            if (r5 != 0) goto L23
            r11.zzc = r6     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteFullException -> L44 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            goto L99
        L23:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteFullException -> L44 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteFullException -> L44 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteFullException -> L44 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r9[r2] = r10     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteFullException -> L44 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteFullException -> L44 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteFullException -> L44 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.endTransaction()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42 android.database.sqlite.SQLiteFullException -> L44 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.close()
            return r6
        L40:
            r0 = move-exception
            goto L84
        L42:
            r7 = move-exception
            goto L46
        L44:
            r7 = move-exception
            goto L6f
        L46:
            if (r5 == 0) goto L51
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L40
            if (r8 == 0) goto L51
            r5.endTransaction()     // Catch: java.lang.Throwable -> L40
        L51:
            com.google.android.gms.measurement.internal.zzio r8 = r11.zzu     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()     // Catch: java.lang.Throwable -> L40
            r8.zzb(r0, r7)     // Catch: java.lang.Throwable -> L40
            r11.zzc = r6     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L81
            goto L6b
        L63:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L40
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L40
            int r4 = r4 + 20
            if (r5 == 0) goto L81
        L6b:
            r5.close()
            goto L81
        L6f:
            com.google.android.gms.measurement.internal.zzio r8 = r11.zzu     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()     // Catch: java.lang.Throwable -> L40
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()     // Catch: java.lang.Throwable -> L40
            r8.zzb(r0, r7)     // Catch: java.lang.Throwable -> L40
            r11.zzc = r6     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L81
            goto L6b
        L81:
            int r3 = r3 + 1
            goto L15
        L84:
            if (r5 == 0) goto L89
            r5.close()
        L89:
            throw r0
        L8a:
            com.google.android.gms.measurement.internal.zzio r0 = r11.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.zza(r1)
        L99:
            return r2
    }

    public final boolean zzn(com.google.android.gms.measurement.internal.zzai r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzqf r1 = r0.zzw()
            byte[] r4 = r1.zzay(r4)
            int r1 = r4.length
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r1 <= r2) goto L1e
            com.google.android.gms.measurement.internal.zzhe r4 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzh()
            java.lang.String r0 = "Conditional user property too long for local database. Sending directly to service"
            r4.zza(r0)
            r4 = 0
            return r4
        L1e:
            r0 = 2
            boolean r4 = r3.zzs(r0, r4)
            return r4
    }

    public final boolean zzo(com.google.android.gms.measurement.internal.zzbf r5) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzqf r1 = r0.zzw()
            byte[] r5 = r1.zzay(r5)
            r1 = 0
            if (r5 != 0) goto L1b
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzh()
            java.lang.String r0 = "Null default event parameters; not writing to database"
            r5.zza(r0)
            return r1
        L1b:
            int r2 = r5.length
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r2 <= r3) goto L2e
            com.google.android.gms.measurement.internal.zzhe r5 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzh()
            java.lang.String r0 = "Default event parameters too long for local database. Sending directly to service"
            r5.zza(r0)
            return r1
        L2e:
            r0 = 4
            boolean r5 = r4.zzs(r0, r5)
            return r5
    }

    public final boolean zzp(com.google.android.gms.measurement.internal.zzbh r4) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            com.google.android.gms.measurement.internal.zzbi.zza(r4, r0, r1)
            byte[] r4 = r0.marshall()
            r0.recycle()
            int r0 = r4.length
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r0 <= r2) goto L24
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzh()
            java.lang.String r0 = "Event is too long for local database. Sending event directly to service"
            r4.zza(r0)
            return r1
        L24:
            boolean r4 = r3.zzs(r1, r4)
            return r4
    }

    public final boolean zzq(com.google.android.gms.measurement.internal.zzqb r4) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            com.google.android.gms.measurement.internal.zzqc.zza(r4, r0, r1)
            byte[] r4 = r0.marshall()
            r0.recycle()
            int r0 = r4.length
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r0 <= r2) goto L24
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzh()
            java.lang.String r0 = "User property too long for local database. Sending directly to service"
            r4.zza(r0)
            return r1
        L24:
            r0 = 1
            boolean r4 = r3.zzs(r0, r4)
            return r4
    }
}
