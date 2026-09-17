package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzav extends com.google.android.gms.internal.measurement.zzca {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzaw zza;

    zzav(com.google.android.gms.measurement.internal.zzaw r2, android.content.Context r3, java.lang.String r4) {
            r1 = this;
            r1.zza = r2
            java.lang.String r2 = "google_app_measurement.db"
            r4 = 0
            r0 = 1
            r1.<init>(r3, r2, r4, r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
            r4 = this;
            com.google.android.gms.measurement.internal.zzaw r0 = r4.zza
            com.google.android.gms.measurement.internal.zzou r1 = com.google.android.gms.measurement.internal.zzaw.zzv(r0)
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            r0.zzf()
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            boolean r0 = r1.zzc(r2)
            if (r0 == 0) goto L70
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L19
            return r0
        L19:
            com.google.android.gms.measurement.internal.zzaw r0 = r4.zza
            com.google.android.gms.measurement.internal.zzou r1 = com.google.android.gms.measurement.internal.zzaw.zzv(r0)
            r1.zzb()
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r3 = "Opening the database failed, dropping and recreating it"
            r2.zza(r3)
            r1.zzf()
            android.content.Context r2 = r1.zzaT()
            java.lang.String r3 = "google_app_measurement.db"
            java.io.File r2 = r2.getDatabasePath(r3)
            boolean r2 = r2.delete()
            if (r2 != 0) goto L51
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Failed to delete corrupted db file"
            r1.zzb(r2, r3)
        L51:
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L5d
            com.google.android.gms.measurement.internal.zzou r0 = com.google.android.gms.measurement.internal.zzaw.zzv(r0)     // Catch: android.database.sqlite.SQLiteException -> L5d
            r0.zza()     // Catch: android.database.sqlite.SQLiteException -> L5d
            return r1
        L5d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzaw r1 = r4.zza
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r2 = "Failed to open freshly created database"
            r1.zzb(r2, r0)
            throw r0
        L70:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            java.lang.String r1 = "Database open failed"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzaw r0 = r1.zza
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
    public final void onOpen(android.database.sqlite.SQLiteDatabase r14) {
            r13 = this;
            com.google.android.gms.measurement.internal.zzaw r0 = r13.zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            java.lang.String[] r6 = com.google.android.gms.measurement.internal.zzaw.zzam()
            java.lang.String r3 = "events"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;"
            java.lang.String r5 = "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp"
            r2 = r14
            com.google.android.gms.measurement.internal.zzax.zza(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.zzhe r7 = r0.zzaW()
            java.lang.String r9 = "events_snapshot"
            java.lang.String r10 = "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;"
            java.lang.String r11 = "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count"
            r12 = 0
            r8 = r14
            com.google.android.gms.measurement.internal.zzax.zza(r7, r8, r9, r10, r11, r12)
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            java.lang.String r3 = "conditional_properties"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;"
            java.lang.String r5 = "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event"
            r6 = 0
            com.google.android.gms.measurement.internal.zzax.zza(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.zzhe r7 = r0.zzaW()
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.zzaw.zzas()
            java.lang.String r9 = "user_attributes"
            java.lang.String r10 = "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;"
            java.lang.String r11 = "app_id,name,set_timestamp,value"
            com.google.android.gms.measurement.internal.zzax.zza(r7, r8, r9, r10, r11, r12)
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            java.lang.String[] r6 = com.google.android.gms.measurement.internal.zzaw.zzak()
            java.lang.String r3 = "apps"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;"
            java.lang.String r5 = "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp"
            com.google.android.gms.measurement.internal.zzax.zza(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.zzhe r7 = r0.zzaW()
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.zzaw.zzap()
            java.lang.String r9 = "queue"
            java.lang.String r10 = "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);"
            java.lang.String r11 = "app_id,bundle_end_timestamp,data"
            com.google.android.gms.measurement.internal.zzax.zza(r7, r8, r9, r10, r11, r12)
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            java.lang.String r3 = "raw_events_metadata"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));"
            java.lang.String r5 = "app_id,metadata_fingerprint,metadata"
            r6 = 0
            com.google.android.gms.measurement.internal.zzax.zza(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.zzhe r7 = r0.zzaW()
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.zzaw.zzaq()
            java.lang.String r9 = "raw_events"
            java.lang.String r10 = "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);"
            java.lang.String r11 = "app_id,name,timestamp,metadata_fingerprint,data"
            com.google.android.gms.measurement.internal.zzax.zza(r7, r8, r9, r10, r11, r12)
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            java.lang.String[] r6 = com.google.android.gms.measurement.internal.zzaw.zzan()
            java.lang.String r3 = "event_filters"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));"
            java.lang.String r5 = "app_id,audience_id,filter_id,event_name,data"
            com.google.android.gms.measurement.internal.zzax.zza(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.zzhe r7 = r0.zzaW()
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.zzaw.zzao()
            java.lang.String r9 = "property_filters"
            java.lang.String r10 = "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));"
            java.lang.String r11 = "app_id,audience_id,filter_id,property_name,data"
            com.google.android.gms.measurement.internal.zzax.zza(r7, r8, r9, r10, r11, r12)
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            java.lang.String r3 = "audience_filter_values"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));"
            java.lang.String r5 = "app_id,audience_id,current_results"
            r6 = 0
            com.google.android.gms.measurement.internal.zzax.zza(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.zzhe r7 = r0.zzaW()
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.zzaw.zzaj()
            java.lang.String r9 = "app2"
            java.lang.String r10 = "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));"
            java.lang.String r11 = "app_id,first_open_count"
            com.google.android.gms.measurement.internal.zzax.zza(r7, r8, r9, r10, r11, r12)
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            java.lang.String r3 = "main_event_params"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));"
            java.lang.String r5 = "app_id,event_id,children_to_process,main_event"
            com.google.android.gms.measurement.internal.zzax.zza(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.zzhe r7 = r0.zzaW()
            java.lang.String r9 = "default_event_params"
            java.lang.String r10 = "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));"
            java.lang.String r11 = "app_id,parameters"
            r12 = 0
            com.google.android.gms.measurement.internal.zzax.zza(r7, r8, r9, r10, r11, r12)
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            java.lang.String[] r6 = com.google.android.gms.measurement.internal.zzaw.zzal()
            java.lang.String r3 = "consent_settings"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));"
            java.lang.String r5 = "app_id,consent_state"
            com.google.android.gms.measurement.internal.zzax.zza(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.internal.measurement.zzqr.zzb()
            com.google.android.gms.measurement.internal.zzhe r7 = r0.zzaW()
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.zzaw.zzar()
            java.lang.String r9 = "trigger_uris"
            java.lang.String r10 = "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);"
            java.lang.String r11 = "app_id,trigger_uri,source,timestamp_millis"
            com.google.android.gms.measurement.internal.zzax.zza(r7, r8, r9, r10, r11, r12)
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            java.lang.String[] r6 = com.google.android.gms.measurement.internal.zzaw.zza
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );"
            java.lang.String r5 = "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp"
            com.google.android.gms.measurement.internal.zzax.zza(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }
}
