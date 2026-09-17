package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzax {
    static void zza(com.google.android.gms.measurement.internal.zzhe r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) throws android.database.sqlite.SQLiteException {
            if (r10 == 0) goto Le0
            r0 = 0
            r1 = 0
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r2 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L27 android.database.sqlite.SQLiteException -> L2a
            java.lang.String r5 = "name=?"
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L27 android.database.sqlite.SQLiteException -> L2a
            r6[r0] = r12     // Catch: java.lang.Throwable -> L27 android.database.sqlite.SQLiteException -> L2a
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L27 android.database.sqlite.SQLiteException -> L2a
            boolean r3 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L25 java.lang.Throwable -> Ld8
            r2.close()
            if (r3 != 0) goto L3e
            goto L3b
        L25:
            r3 = move-exception
            goto L2d
        L27:
            r10 = move-exception
            goto Lda
        L2a:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L2d:
            com.google.android.gms.measurement.internal.zzhc r4 = r10.zzk()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r5 = "Error querying for table"
            r4.zzc(r5, r12, r3)     // Catch: java.lang.Throwable -> Ld8
            if (r2 == 0) goto L3b
            r2.close()
        L3b:
            r11.execSQL(r13)
        L3e:
            java.util.HashSet r13 = new java.util.HashSet     // Catch: android.database.sqlite.SQLiteException -> Lcd
            r13.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lcd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> Lcd
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lcd
            java.lang.String r3 = "SELECT * FROM "
            r2.append(r3)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            r2.append(r12)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            java.lang.String r3 = " LIMIT 0"
            r2.append(r3)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            java.lang.String r2 = r2.toString()     // Catch: android.database.sqlite.SQLiteException -> Lcd
            android.database.Cursor r1 = r11.rawQuery(r2, r1)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            java.lang.String[] r2 = r1.getColumnNames()     // Catch: java.lang.Throwable -> Lc8
            java.util.Collections.addAll(r13, r2)     // Catch: java.lang.Throwable -> Lc8
            r1.close()     // Catch: android.database.sqlite.SQLiteException -> Lcd
            java.lang.String r1 = ","
            java.lang.String[] r14 = r14.split(r1)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            int r1 = r14.length     // Catch: android.database.sqlite.SQLiteException -> Lcd
            r2 = 0
        L6f:
            if (r2 >= r1) goto L9b
            r3 = r14[r2]     // Catch: android.database.sqlite.SQLiteException -> Lcd
            boolean r4 = r13.remove(r3)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            if (r4 == 0) goto L7c
            int r2 = r2 + 1
            goto L6f
        L7c:
            android.database.sqlite.SQLiteException r11 = new android.database.sqlite.SQLiteException     // Catch: android.database.sqlite.SQLiteException -> Lcd
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> Lcd
            r13.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lcd
            java.lang.String r14 = "Table "
            r13.append(r14)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            r13.append(r12)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            java.lang.String r14 = " is missing required column: "
            r13.append(r14)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            r13.append(r3)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            java.lang.String r13 = r13.toString()     // Catch: android.database.sqlite.SQLiteException -> Lcd
            r11.<init>(r13)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            throw r11     // Catch: android.database.sqlite.SQLiteException -> Lcd
        L9b:
            if (r15 == 0) goto Lb2
        L9d:
            int r14 = r15.length     // Catch: android.database.sqlite.SQLiteException -> Lcd
            if (r0 >= r14) goto Lb2
            r14 = r15[r0]     // Catch: android.database.sqlite.SQLiteException -> Lcd
            boolean r14 = r13.remove(r14)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            if (r14 != 0) goto Laf
            int r14 = r0 + 1
            r14 = r15[r14]     // Catch: android.database.sqlite.SQLiteException -> Lcd
            r11.execSQL(r14)     // Catch: android.database.sqlite.SQLiteException -> Lcd
        Laf:
            int r0 = r0 + 2
            goto L9d
        Lb2:
            boolean r11 = r13.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> Lcd
            if (r11 != 0) goto Lc7
            com.google.android.gms.measurement.internal.zzhc r11 = r10.zzk()     // Catch: android.database.sqlite.SQLiteException -> Lcd
            java.lang.String r14 = "Table has extra columns. table, columns"
            java.lang.String r15 = ", "
            java.lang.String r13 = android.text.TextUtils.join(r15, r13)     // Catch: android.database.sqlite.SQLiteException -> Lcd
            r11.zzc(r14, r12, r13)     // Catch: android.database.sqlite.SQLiteException -> Lcd
        Lc7:
            return
        Lc8:
            r11 = move-exception
            r1.close()     // Catch: android.database.sqlite.SQLiteException -> Lcd
            throw r11     // Catch: android.database.sqlite.SQLiteException -> Lcd
        Lcd:
            r11 = move-exception
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zze()
            java.lang.String r13 = "Failed to verify columns on table that was just created"
            r10.zzb(r13, r12)
            throw r11
        Ld8:
            r10 = move-exception
            r1 = r2
        Lda:
            if (r1 == 0) goto Ldf
            r1.close()
        Ldf:
            throw r10
        Le0:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Monitor must not be null"
            r10.<init>(r11)
            throw r10
    }

    static void zzb(com.google.android.gms.measurement.internal.zzhe r3, android.database.sqlite.SQLiteDatabase r4) {
            if (r3 == 0) goto L4f
            java.io.File r0 = new java.io.File
            com.google.android.gms.internal.measurement.zzbx.zza()
            java.lang.String r4 = r4.getPath()
            int r1 = com.google.android.gms.internal.measurement.zzcc.zzb
            r0.<init>(r4)
            r4 = 0
            boolean r1 = r0.setReadable(r4, r4)
            if (r1 != 0) goto L20
            com.google.android.gms.measurement.internal.zzhc r1 = r3.zzk()
            java.lang.String r2 = "Failed to turn off database read permission"
            r1.zza(r2)
        L20:
            boolean r4 = r0.setWritable(r4, r4)
            if (r4 != 0) goto L2f
            com.google.android.gms.measurement.internal.zzhc r4 = r3.zzk()
            java.lang.String r1 = "Failed to turn off database write permission"
            r4.zza(r1)
        L2f:
            r4 = 1
            boolean r1 = r0.setReadable(r4, r4)
            if (r1 != 0) goto L3f
            com.google.android.gms.measurement.internal.zzhc r1 = r3.zzk()
            java.lang.String r2 = "Failed to turn on database read permission for owner"
            r1.zza(r2)
        L3f:
            boolean r4 = r0.setWritable(r4, r4)
            if (r4 != 0) goto L4e
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()
            java.lang.String r4 = "Failed to turn on database write permission for owner"
            r3.zza(r4)
        L4e:
            return
        L4f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Monitor must not be null"
            r3.<init>(r4)
            throw r3
    }
}
