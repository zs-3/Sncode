package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzau {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzaw zza;
    private final java.lang.String zzb;
    private long zzc;

    public zzau(com.google.android.gms.measurement.internal.zzaw r1, java.lang.String r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzb = r2
            r1 = -1
            r0.zzc = r1
            return
    }

    public zzau(com.google.android.gms.measurement.internal.zzaw r3, java.lang.String r4, long r5) {
            r2 = this;
            r2.zza = r3
            r2.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            r2.zzb = r4
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = java.lang.String.valueOf(r5)
            r5 = 1
            r0[r5] = r4
            java.lang.String r4 = "select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1"
            r5 = -1
            long r3 = com.google.android.gms.measurement.internal.zzaw.zzc(r3, r4, r0, r5)
            r2.zzc = r3
            return
    }

    public final java.util.List zza() {
            r22 = this;
            r1 = r22
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 2
            java.lang.String[] r8 = new java.lang.String[r3]
            java.lang.String r0 = r1.zzb
            r13 = 0
            r8[r13] = r0
            long r4 = r1.zzc
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r14 = 1
            r8[r14] = r0
            java.lang.String r7 = "app_id = ? and rowid > ?"
            java.lang.String r12 = "1000"
            r15 = 0
            com.google.android.gms.measurement.internal.zzaw r0 = r1.zza     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            android.database.sqlite.SQLiteDatabase r4 = r0.zzj()     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            java.lang.String r5 = "raw_events"
            java.lang.String r16 = "rowid"
            java.lang.String r17 = "name"
            java.lang.String r18 = "timestamp"
            java.lang.String r19 = "metadata_fingerprint"
            java.lang.String r20 = "data"
            java.lang.String r21 = "realtime"
            java.lang.String[] r6 = new java.lang.String[]{r16, r17, r18, r19, r20, r21}     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            java.lang.String r11 = "rowid"
            r9 = 0
            r10 = 0
            android.database.Cursor r15 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            boolean r0 = r15.moveToFirst()     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            if (r0 == 0) goto Lb3
        L43:
            long r5 = r15.getLong(r13)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            r0 = 3
            long r7 = r15.getLong(r0)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            r0 = 5
            long r9 = r15.getLong(r0)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            r11 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L59
            r9 = 1
            goto L5a
        L59:
            r9 = 0
        L5a:
            r0 = 4
            byte[] r0 = r15.getBlob(r0)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            long r10 = r1.zzc     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 <= 0) goto L67
            r1.zzc = r5     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
        L67:
            com.google.android.gms.internal.measurement.zzhl r4 = com.google.android.gms.internal.measurement.zzhm.zze()     // Catch: java.io.IOException -> L94 java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            com.google.android.gms.internal.measurement.zzng r0 = com.google.android.gms.measurement.internal.zzqa.zzp(r4, r0)     // Catch: java.io.IOException -> L94 java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            com.google.android.gms.internal.measurement.zzhl r0 = (com.google.android.gms.internal.measurement.zzhl) r0     // Catch: java.io.IOException -> L94 java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            java.lang.String r4 = r15.getString(r14)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            if (r4 != 0) goto L79
            java.lang.String r4 = ""
        L79:
            r0.zzi(r4)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            long r10 = r15.getLong(r3)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            r0.zzm(r10)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            com.google.android.gms.measurement.internal.zzat r11 = new com.google.android.gms.measurement.internal.zzat     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            r10 = r0
            com.google.android.gms.internal.measurement.zzhm r10 = (com.google.android.gms.internal.measurement.zzhm) r10     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            r4 = r11
            r4.<init>(r5, r7, r9, r10)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            r2.add(r11)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            goto Lac
        L94:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzaw r4 = r1.zza     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            java.lang.String r5 = "Data loss. Failed to merge raw event. appId"
            java.lang.String r6 = r1.zzb     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            r4.zzc(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
        Lac:
            boolean r0 = r15.moveToNext()     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            if (r0 != 0) goto L43
            goto Ld2
        Lb3:
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lb8 android.database.sqlite.SQLiteException -> Lba
            goto Ld2
        Lb8:
            r0 = move-exception
            goto Ld8
        Lba:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzaw r3 = r1.zza     // Catch: java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.zzio r3 = r3.zzu     // Catch: java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = "Data loss. Error querying raw events batch. appId"
            java.lang.String r5 = r1.zzb     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)     // Catch: java.lang.Throwable -> Lb8
            r3.zzc(r4, r5, r0)     // Catch: java.lang.Throwable -> Lb8
        Ld2:
            if (r15 == 0) goto Ld7
            r15.close()
        Ld7:
            return r2
        Ld8:
            if (r15 == 0) goto Ldd
            r15.close()
        Ldd:
            throw r0
    }
}
