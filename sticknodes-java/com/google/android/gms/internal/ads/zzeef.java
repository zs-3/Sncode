package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeef {
    public static int zza(android.database.sqlite.SQLiteDatabase r2, int r3) {
            r0 = 0
            r1 = 2
            if (r3 != r1) goto L5
            return r0
        L5:
            android.database.Cursor r2 = zzg(r2, r3)
            int r3 = r2.getCount()
            if (r3 <= 0) goto L1c
            r2.moveToNext()
            java.lang.String r3 = "value"
            int r3 = r2.getColumnIndexOrThrow(r3)
            int r0 = r2.getInt(r3)
        L1c:
            r2.close()
            return r0
    }

    public static long zzb(android.database.sqlite.SQLiteDatabase r2, int r3) {
            r3 = 2
            android.database.Cursor r2 = zzg(r2, r3)
            int r3 = r2.getCount()
            if (r3 <= 0) goto L19
            r2.moveToNext()
            java.lang.String r3 = "value"
            int r3 = r2.getColumnIndexOrThrow(r3)
            long r0 = r2.getLong(r3)
            goto L1b
        L19:
            r0 = 0
        L1b:
            r2.close()
            return r0
    }

    public static void zzc(android.database.sqlite.SQLiteDatabase r3, long r4, byte[] r6) {
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r2 = "timestamp"
            r0.put(r2, r1)
            java.lang.String r1 = "serialized_proto_data"
            r0.put(r1, r6)
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r5 = 0
            r6[r5] = r4
            java.lang.String r4 = "offline_signal_contents"
            java.lang.String r5 = "timestamp = ?"
            int r5 = r3.update(r4, r0, r5, r6)
            if (r5 != 0) goto L2b
            r5 = 0
            r3.insert(r4, r5, r0)
        L2b:
            return
    }

    public static void zzd(android.database.sqlite.SQLiteDatabase r3) {
            java.lang.String r0 = "failed_requests"
            r1 = 0
            zzh(r3, r0, r1)
            java.lang.String r0 = "total_requests"
            zzh(r3, r0, r1)
            java.lang.String r0 = "completed_requests"
            zzh(r3, r0, r1)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "statistic_name"
            java.lang.String r2 = "last_successful_request_time"
            r0.put(r1, r2)
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "value"
            r0.put(r2, r1)
            java.lang.String r1 = "offline_signal_statistics"
            r2 = 0
            r3.insert(r1, r2, r0)
            return
    }

    public static void zze(android.database.sqlite.SQLiteDatabase r2) {
            java.lang.String r0 = "offline_signal_contents"
            r1 = 0
            r2.delete(r0, r1, r1)
            java.lang.String r0 = "failed_requests"
            r1 = 0
            zzi(r2, r0, r1)
            java.lang.String r0 = "total_requests"
            zzi(r2, r0, r1)
            java.lang.String r0 = "completed_requests"
            zzi(r2, r0, r1)
            return
    }

    public static void zzf(android.database.sqlite.SQLiteDatabase r4, boolean r5, boolean r6) {
            java.lang.String r0 = "UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'"
            r1 = 0
            r2 = 1
            if (r6 != 0) goto L14
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = "total_requests"
            r5[r1] = r6
            java.lang.String r5 = java.lang.String.format(r0, r5)
            r4.execSQL(r5)
            return
        L14:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r3 = "completed_requests"
            r6[r1] = r3
            java.lang.String r6 = java.lang.String.format(r0, r6)
            r4.execSQL(r6)
            if (r5 != 0) goto L30
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = "failed_requests"
            r5[r1] = r6
            java.lang.String r5 = java.lang.String.format(r0, r5)
            r4.execSQL(r5)
        L30:
            return
    }

    private static android.database.Cursor zzg(android.database.sqlite.SQLiteDatabase r9, int r10) {
            java.lang.String r0 = "value"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            r1 = 0
            if (r10 == 0) goto L20
            if (r10 == r0) goto L1b
            r0 = 2
            if (r10 == r0) goto L16
            java.lang.String r10 = "completed_requests"
            r5[r1] = r10
            goto L24
        L16:
            java.lang.String r10 = "last_successful_request_time"
            r5[r1] = r10
            goto L24
        L1b:
            java.lang.String r10 = "total_requests"
            r5[r1] = r10
            goto L24
        L20:
            java.lang.String r10 = "failed_requests"
            r5[r1] = r10
        L24:
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r2 = "offline_signal_statistics"
            java.lang.String r4 = "statistic_name = ?"
            r1 = r9
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    private static void zzh(android.database.sqlite.SQLiteDatabase r1, java.lang.String r2, int r3) {
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r0 = "statistic_name"
            r3.put(r0, r2)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "value"
            r3.put(r0, r2)
            java.lang.String r2 = "offline_signal_statistics"
            r0 = 0
            r1.insert(r2, r0, r3)
            return
    }

    private static void zzi(android.database.sqlite.SQLiteDatabase r3, java.lang.String r4, int r5) {
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "value"
            r5.put(r2, r1)
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r1[r0] = r4
            java.lang.String r4 = "offline_signal_statistics"
            java.lang.String r0 = "statistic_name = ?"
            r3.update(r4, r5, r0, r1)
            return
    }
}
