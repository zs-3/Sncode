package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzgt extends com.google.android.gms.internal.measurement.zzca {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzgv zza;

    zzgt(com.google.android.gms.measurement.internal.zzgv r2, android.content.Context r3, java.lang.String r4) {
            r1 = this;
            r1.zza = r2
            java.lang.String r2 = "google_app_measurement_local.db"
            r4 = 0
            r0 = 1
            r1.<init>(r3, r2, r4, r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() throws android.database.sqlite.SQLiteException {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L5 android.database.sqlite.SQLiteDatabaseLockedException -> L4f
            return r0
        L5:
            com.google.android.gms.measurement.internal.zzgv r0 = r3.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Opening the local database failed, dropping and recreating it"
            r1.zza(r2)
            r0.zzf()
            android.content.Context r1 = r0.zzaT()
            java.lang.String r2 = "google_app_measurement_local.db"
            java.io.File r1 = r1.getDatabasePath(r2)
            boolean r1 = r1.delete()
            if (r1 != 0) goto L36
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Failed to delete corrupted local db file"
            r0.zzb(r1, r2)
        L36:
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L3b
            return r0
        L3b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzgv r1 = r3.zza
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Failed to open local database. Events will bypass local storage"
            r1.zzb(r2, r0)
            r0 = 0
            return r0
        L4f:
            r0 = move-exception
            throw r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzgv r0 = r1.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzax.zzb(r0, r2)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase r8) {
            r7 = this;
            com.google.android.gms.measurement.internal.zzgv r0 = r7.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            java.lang.String[] r6 = com.google.android.gms.measurement.internal.zzgv.zzr()
            java.lang.String r3 = "messages"
            java.lang.String r4 = "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)"
            java.lang.String r5 = "type,entry"
            r2 = r8
            com.google.android.gms.measurement.internal.zzax.zza(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }
}
