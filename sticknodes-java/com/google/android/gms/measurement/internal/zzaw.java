package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzaw extends com.google.android.gms.measurement.internal.zzpg {
    static final java.lang.String[] zza = null;
    private static final java.lang.String[] zzb = null;
    private static final java.lang.String[] zzc = null;
    private static final java.lang.String[] zzd = null;
    private static final java.lang.String[] zze = null;
    private static final java.lang.String[] zzf = null;
    private static final java.lang.String[] zzh = null;
    private static final java.lang.String[] zzi = null;
    private static final java.lang.String[] zzj = null;
    private static final java.lang.String[] zzk = null;
    private static final java.lang.String[] zzl = null;
    private final com.google.android.gms.measurement.internal.zzav zzm;
    private final com.google.android.gms.measurement.internal.zzou zzn;

    static {
            java.lang.String r0 = "last_bundled_timestamp"
            java.lang.String r1 = "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;"
            java.lang.String r2 = "last_bundled_day"
            java.lang.String r3 = "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;"
            java.lang.String r4 = "last_sampled_complex_event_id"
            java.lang.String r5 = "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;"
            java.lang.String r6 = "last_sampling_rate"
            java.lang.String r7 = "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;"
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"
            java.lang.String r10 = "current_session_count"
            java.lang.String r11 = "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            com.google.android.gms.measurement.internal.zzaw.zzb = r0
            java.lang.String r0 = "associated_row_id"
            java.lang.String r1 = "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;"
            java.lang.String r2 = "last_upload_timestamp"
            java.lang.String r3 = "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.google.android.gms.measurement.internal.zzaw.zza = r0
            java.lang.String r0 = "origin"
            java.lang.String r1 = "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.measurement.internal.zzaw.zzc = r0
            java.lang.String r1 = "app_version"
            java.lang.String r2 = "ALTER TABLE apps ADD COLUMN app_version TEXT;"
            java.lang.String r3 = "app_store"
            java.lang.String r4 = "ALTER TABLE apps ADD COLUMN app_store TEXT;"
            java.lang.String r5 = "gmp_version"
            java.lang.String r6 = "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;"
            java.lang.String r7 = "dev_cert_hash"
            java.lang.String r8 = "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;"
            java.lang.String r9 = "measurement_enabled"
            java.lang.String r10 = "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;"
            java.lang.String r11 = "last_bundle_start_timestamp"
            java.lang.String r12 = "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;"
            java.lang.String r13 = "day"
            java.lang.String r14 = "ALTER TABLE apps ADD COLUMN day INTEGER;"
            java.lang.String r15 = "daily_public_events_count"
            java.lang.String r16 = "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;"
            java.lang.String r17 = "daily_events_count"
            java.lang.String r18 = "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;"
            java.lang.String r21 = "remote_config"
            java.lang.String r22 = "ALTER TABLE apps ADD COLUMN remote_config BLOB;"
            java.lang.String r23 = "config_fetched_time"
            java.lang.String r24 = "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;"
            java.lang.String r25 = "failed_config_fetch_time"
            java.lang.String r26 = "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;"
            java.lang.String r27 = "app_version_int"
            java.lang.String r28 = "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;"
            java.lang.String r29 = "firebase_instance_id"
            java.lang.String r30 = "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;"
            java.lang.String r31 = "daily_error_events_count"
            java.lang.String r32 = "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;"
            java.lang.String r33 = "daily_realtime_events_count"
            java.lang.String r34 = "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;"
            java.lang.String r35 = "health_monitor_sample"
            java.lang.String r36 = "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;"
            java.lang.String r37 = "android_id"
            java.lang.String r38 = "ALTER TABLE apps ADD COLUMN android_id INTEGER;"
            java.lang.String r39 = "adid_reporting_enabled"
            java.lang.String r40 = "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;"
            java.lang.String r41 = "ssaid_reporting_enabled"
            java.lang.String r42 = "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"
            java.lang.String r43 = "admob_app_id"
            java.lang.String r44 = "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;"
            java.lang.String r45 = "linked_admob_app_id"
            java.lang.String r46 = "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"
            java.lang.String r47 = "dynamite_version"
            java.lang.String r48 = "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;"
            java.lang.String r49 = "safelisted_events"
            java.lang.String r50 = "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;"
            java.lang.String r51 = "ga_app_id"
            java.lang.String r52 = "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"
            java.lang.String r53 = "config_last_modified_time"
            java.lang.String r54 = "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"
            java.lang.String r55 = "e_tag"
            java.lang.String r56 = "ALTER TABLE apps ADD COLUMN e_tag TEXT;"
            java.lang.String r57 = "session_stitching_token"
            java.lang.String r58 = "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"
            java.lang.String r59 = "sgtm_upload_enabled"
            java.lang.String r60 = "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;"
            java.lang.String r61 = "target_os_version"
            java.lang.String r62 = "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"
            java.lang.String r63 = "session_stitching_token_hash"
            java.lang.String r64 = "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"
            java.lang.String r65 = "ad_services_version"
            java.lang.String r66 = "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;"
            java.lang.String r67 = "unmatched_first_open_without_ad_id"
            java.lang.String r68 = "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;"
            java.lang.String r69 = "npa_metadata_value"
            java.lang.String r70 = "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;"
            java.lang.String r71 = "attribution_eligibility_status"
            java.lang.String r72 = "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"
            java.lang.String r73 = "sgtm_preview_key"
            java.lang.String r74 = "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;"
            java.lang.String r75 = "dma_consent_state"
            java.lang.String r76 = "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;"
            java.lang.String r77 = "daily_realtime_dcu_count"
            java.lang.String r78 = "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;"
            java.lang.String r79 = "bundle_delivery_index"
            java.lang.String r80 = "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;"
            java.lang.String r81 = "serialized_npa_metadata"
            java.lang.String r82 = "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;"
            java.lang.String r83 = "unmatched_pfo"
            java.lang.String r84 = "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;"
            java.lang.String r85 = "unmatched_uwa"
            java.lang.String r86 = "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;"
            java.lang.String r87 = "ad_campaign_info"
            java.lang.String r88 = "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;"
            java.lang.String r89 = "daily_registered_triggers_count"
            java.lang.String r90 = "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"
            java.lang.String r91 = "client_upload_eligibility"
            java.lang.String r92 = "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92}
            com.google.android.gms.measurement.internal.zzaw.zzd = r0
            java.lang.String r0 = "realtime"
            java.lang.String r1 = "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.measurement.internal.zzaw.zze = r0
            java.lang.String r0 = "has_realtime"
            java.lang.String r1 = "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;"
            java.lang.String r2 = "retry_count"
            java.lang.String r3 = "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            com.google.android.gms.measurement.internal.zzaw.zzf = r0
            java.lang.String r0 = "session_scoped"
            java.lang.String r1 = "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1}
            com.google.android.gms.measurement.internal.zzaw.zzh = r1
            java.lang.String r1 = "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.measurement.internal.zzaw.zzi = r0
            java.lang.String r0 = "previous_install_count"
            java.lang.String r1 = "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.measurement.internal.zzaw.zzj = r0
            java.lang.String r1 = "consent_source"
            java.lang.String r2 = "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;"
            java.lang.String r3 = "dma_consent_settings"
            java.lang.String r4 = "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"
            java.lang.String r5 = "storage_consent_at_bundling"
            java.lang.String r6 = "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            com.google.android.gms.measurement.internal.zzaw.zzk = r0
            java.lang.String r0 = "idempotent"
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.measurement.internal.zzaw.zzl = r0
            return
    }

    zzaw(com.google.android.gms.measurement.internal.zzpv r3) {
            r2 = this;
            r2.<init>(r3)
            com.google.android.gms.measurement.internal.zzou r3 = new com.google.android.gms.measurement.internal.zzou
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            r3.<init>(r0)
            r2.zzn = r3
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu
            r3.zzf()
            com.google.android.gms.measurement.internal.zzav r3 = new com.google.android.gms.measurement.internal.zzav
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            android.content.Context r0 = r0.zzaT()
            java.lang.String r1 = "google_app_measurement.db"
            r3.<init>(r2, r0, r1)
            r2.zzm = r3
            return
    }

    private final com.google.android.gms.measurement.internal.zzbd zzaA(java.lang.String r28, java.lang.String r29, java.lang.String r30) {
            r27 = this;
            r1 = r27
            r15 = r30
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r29)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r30)
            r27.zzg()
            r27.zzav()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.zzj()     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            java.lang.String r5 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            r6[r10] = r29     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            r11 = 1
            r6[r11] = r15     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r28
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L11f android.database.sqlite.SQLiteException -> L121
            boolean r2 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r2 != 0) goto L5a
            goto L141
        L5a:
            long r5 = r13.getLong(r10)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            long r7 = r13.getLong(r11)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            long r16 = r13.getLong(r0)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r3 = 0
            if (r2 == 0) goto L72
            r20 = r3
            goto L76
        L72:
            long r20 = r13.getLong(r0)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
        L76:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r2 == 0) goto L80
            r0 = r19
            goto L88
        L80:
            long r22 = r13.getLong(r0)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
        L88:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r9 == 0) goto L92
            r18 = r19
            goto L9c
        L92:
            long r22 = r13.getLong(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r18 = r2
        L9c:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r9 == 0) goto La6
            r22 = r19
            goto Lb0
        La6:
            long r22 = r13.getLong(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r22 = r2
        Lb0:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r9 != 0) goto Lc9
            long r23 = r13.getLong(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto Lc2
            r10 = 1
        Lc2:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r23 = r2
            goto Lcb
        Lc9:
            r23 = r19
        Lcb:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            if (r9 == 0) goto Ld5
            r9 = r3
            goto Lda
        Ld5:
            long r2 = r13.getLong(r2)     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r9 = r2
        Lda:
            com.google.android.gms.measurement.internal.zzbd r24 = new com.google.android.gms.measurement.internal.zzbd     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L119
            r2 = r24
            r3 = r29
            r4 = r30
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            boolean r0 = r25.moveToNext()     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            if (r0 == 0) goto L10b
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r29)     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
            r0.zzb(r2, r3)     // Catch: java.lang.Throwable -> L10f android.database.sqlite.SQLiteException -> L111
        L10b:
            r25.close()
            return r24
        L10f:
            r0 = move-exception
            goto L116
        L111:
            r0 = move-exception
            goto L11c
        L113:
            r0 = move-exception
            r25 = r13
        L116:
            r19 = r25
            goto L14a
        L119:
            r0 = move-exception
            r25 = r13
        L11c:
            r13 = r25
            goto L124
        L11f:
            r0 = move-exception
            goto L14a
        L121:
            r0 = move-exception
            r13 = r19
        L124:
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> L147
            com.google.android.gms.measurement.internal.zzhe r3 = r2.zzaW()     // Catch: java.lang.Throwable -> L147
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L147
            java.lang.String r4 = "Error querying events. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r29)     // Catch: java.lang.Throwable -> L147
            com.google.android.gms.measurement.internal.zzgx r2 = r2.zzj()     // Catch: java.lang.Throwable -> L147
            r6 = r30
            java.lang.String r2 = r2.zzd(r6)     // Catch: java.lang.Throwable -> L147
            r3.zzd(r4, r5, r2, r0)     // Catch: java.lang.Throwable -> L147
        L141:
            if (r13 == 0) goto L146
            r13.close()
        L146:
            return r19
        L147:
            r0 = move-exception
            r19 = r13
        L14a:
            if (r19 == 0) goto L14f
            r19.close()
        L14f:
            throw r0
    }

    private final com.google.android.gms.measurement.internal.zzpz zzaB(java.lang.String r15, long r16, byte[] r18, java.lang.String r19, java.lang.String r20, int r21, int r22, long r23, long r25, long r27) {
            r14 = this;
            r1 = r14
            r0 = r20
            r2 = r22
            boolean r3 = android.text.TextUtils.isEmpty(r19)
            r4 = 0
            if (r3 == 0) goto L1c
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r2 = "Upload uri is null or empty. Destination is unknown. Dropping batch. "
            r0.zza(r2)
            return r4
        L1c:
            com.google.android.gms.internal.measurement.zzht r3 = com.google.android.gms.internal.measurement.zzhv.zzb()     // Catch: java.io.IOException -> Ldd
            r5 = r18
            com.google.android.gms.internal.measurement.zzng r3 = com.google.android.gms.measurement.internal.zzqa.zzp(r3, r5)     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.measurement.zzht r3 = (com.google.android.gms.internal.measurement.zzht) r3     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.measurement.internal.zzmf r5 = com.google.android.gms.measurement.internal.zzmf.zzb(r21)     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.measurement.internal.zzmf r6 = com.google.android.gms.measurement.internal.zzmf.zzb     // Catch: java.io.IOException -> Ldd
            if (r5 == r6) goto L68
            com.google.android.gms.measurement.internal.zzmf r6 = com.google.android.gms.measurement.internal.zzmf.zze     // Catch: java.io.IOException -> Ldd
            if (r5 == r6) goto L68
            if (r2 <= 0) goto L68
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.io.IOException -> Ldd
            r6.<init>()     // Catch: java.io.IOException -> Ldd
            java.util.List r7 = r3.zzj()     // Catch: java.io.IOException -> Ldd
            java.util.Iterator r7 = r7.iterator()     // Catch: java.io.IOException -> Ldd
        L43:
            boolean r8 = r7.hasNext()     // Catch: java.io.IOException -> Ldd
            if (r8 == 0) goto L62
            java.lang.Object r8 = r7.next()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.measurement.zzhx r8 = (com.google.android.gms.internal.measurement.zzhx) r8     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.measurement.zzlz r8 = r8.zzch()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.measurement.zzhw r8 = (com.google.android.gms.internal.measurement.zzhw) r8     // Catch: java.io.IOException -> Ldd
            r8.zzat(r2)     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.measurement.zzmd r8 = r8.zzba()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.measurement.zzhx r8 = (com.google.android.gms.internal.measurement.zzhx) r8     // Catch: java.io.IOException -> Ldd
            r6.add(r8)     // Catch: java.io.IOException -> Ldd
            goto L43
        L62:
            r3.zzd()     // Catch: java.io.IOException -> Ldd
            r3.zzb(r6)     // Catch: java.io.IOException -> Ldd
        L68:
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.io.IOException -> Ldd
            r6.<init>()     // Catch: java.io.IOException -> Ldd
            if (r0 == 0) goto La8
            java.lang.String r7 = "\r\n"
            java.lang.String[] r0 = r0.split(r7)     // Catch: java.io.IOException -> Ldd
            int r7 = r0.length     // Catch: java.io.IOException -> Ldd
            r8 = 0
            r9 = 0
        L78:
            if (r9 >= r7) goto La8
            r10 = r0[r9]     // Catch: java.io.IOException -> Ldd
            boolean r11 = r10.isEmpty()     // Catch: java.io.IOException -> Ldd
            if (r11 == 0) goto L83
            goto La8
        L83:
            java.lang.String r11 = "="
            r12 = 2
            java.lang.String[] r11 = r10.split(r11, r12)     // Catch: java.io.IOException -> Ldd
            int r13 = r11.length     // Catch: java.io.IOException -> Ldd
            if (r13 == r12) goto L9d
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.io.IOException -> Ldd
            java.lang.String r7 = "Invalid upload header: "
            r0.zzb(r7, r10)     // Catch: java.io.IOException -> Ldd
            goto La8
        L9d:
            r10 = r11[r8]     // Catch: java.io.IOException -> Ldd
            r12 = 1
            r11 = r11[r12]     // Catch: java.io.IOException -> Ldd
            r6.put(r10, r11)     // Catch: java.io.IOException -> Ldd
            int r9 = r9 + 1
            goto L78
        La8:
            com.google.android.gms.measurement.internal.zzpx r0 = new com.google.android.gms.measurement.internal.zzpx     // Catch: java.io.IOException -> Ldd
            r0.<init>()     // Catch: java.io.IOException -> Ldd
            r7 = r16
            r0.zzf(r7)     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.measurement.zzmd r3 = r3.zzba()     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.internal.measurement.zzhv r3 = (com.google.android.gms.internal.measurement.zzhv) r3     // Catch: java.io.IOException -> Ldd
            r0.zzd(r3)     // Catch: java.io.IOException -> Ldd
            r3 = r19
            r0.zzi(r3)     // Catch: java.io.IOException -> Ldd
            r0.zzg(r6)     // Catch: java.io.IOException -> Ldd
            r0.zzh(r5)     // Catch: java.io.IOException -> Ldd
            r5 = r23
            r0.zzb(r5)     // Catch: java.io.IOException -> Ldd
            r5 = r25
            r0.zza(r5)     // Catch: java.io.IOException -> Ldd
            r5 = r27
            r0.zzc(r5)     // Catch: java.io.IOException -> Ldd
            r0.zze(r2)     // Catch: java.io.IOException -> Ldd
            com.google.android.gms.measurement.internal.zzpz r0 = r0.zzj()     // Catch: java.io.IOException -> Ldd
            return r0
        Ldd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r3 = "Failed to queued MeasurementBatch from upload_queue. appId"
            r5 = r15
            r2.zzc(r3, r15, r0)
            return r4
    }

    private final java.lang.String zzaC() {
            r11 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r11.zzu
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r1 = r1.currentTimeMillis()
            java.util.Locale r3 = java.util.Locale.US
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.google.android.gms.measurement.internal.zzmf r6 = com.google.android.gms.measurement.internal.zzmf.zzb
            int r7 = r6.zza()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 0
            r5[r8] = r7
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r5[r2] = r1
            r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r7 = com.google.android.gms.measurement.internal.zzgi.zzR
            r9 = 0
            java.lang.Object r7 = r7.zza(r9)
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r9 = 2
            r5[r9] = r7
            java.lang.String r7 = "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)"
            java.lang.String r5 = java.lang.String.format(r3, r7, r5)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r6 = r6.zza()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r8] = r6
            r4[r2] = r1
            r0.zzf()
            long r0 = com.google.android.gms.measurement.internal.zzam.zzI()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4[r9] = r0
            java.lang.String r0 = "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)"
            java.lang.String r0 = java.lang.String.format(r3, r0, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " OR "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    private final java.lang.String zzaD(java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r5 = r2.zzj()
            r0 = 0
            android.database.Cursor r0 = r5.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            boolean r4 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r4 == 0) goto L18
            r4 = 0
            java.lang.String r3 = r0.getString(r4)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r0.close()
            return r3
        L18:
            r0.close()
            java.lang.String r3 = ""
            return r3
        L1e:
            r3 = move-exception
            goto L31
        L20:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzio r5 = r2.zzu     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "Database error"
            r5.zzc(r1, r3, r4)     // Catch: java.lang.Throwable -> L1e
            throw r4     // Catch: java.lang.Throwable -> L1e
        L31:
            if (r0 == 0) goto L36
            r0.close()
        L36:
            throw r3
    }

    private final void zzaE(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            r4.zzg()
            r4.zzav()
            android.database.sqlite.SQLiteDatabase r0 = r4.zzj()     // Catch: android.database.sqlite.SQLiteException -> L19
            java.lang.String r1 = "app_id=?"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: android.database.sqlite.SQLiteException -> L19
            r3 = 0
            r2[r3] = r6     // Catch: android.database.sqlite.SQLiteException -> L19
            r0.delete(r5, r1, r2)     // Catch: android.database.sqlite.SQLiteException -> L19
            return
        L19:
            r5 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)
            java.lang.String r1 = "Error deleting snapshot. appId"
            r0.zzc(r1, r6, r5)
            return
    }

    private final void zzaF(java.lang.String r7, com.google.android.gms.measurement.internal.zzbd r8) {
            r6 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            r6.zzg()
            r6.zzav()
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = r8.zza
            java.lang.String r2 = "app_id"
            r0.put(r2, r1)
            java.lang.String r2 = r8.zzb
            java.lang.String r3 = "name"
            r0.put(r3, r2)
            long r2 = r8.zzc
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "lifetime_count"
            r0.put(r3, r2)
            long r2 = r8.zzd
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "current_bundle_count"
            r0.put(r3, r2)
            long r2 = r8.zzf
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "last_fire_timestamp"
            r0.put(r3, r2)
            long r2 = r8.zzg
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "last_bundled_timestamp"
            r0.put(r3, r2)
            java.lang.Long r2 = r8.zzh
            java.lang.String r3 = "last_bundled_day"
            r0.put(r3, r2)
            java.lang.Long r2 = r8.zzi
            java.lang.String r3 = "last_sampled_complex_event_id"
            r0.put(r3, r2)
            java.lang.Long r2 = r8.zzj
            java.lang.String r3 = "last_sampling_rate"
            r0.put(r3, r2)
            long r2 = r8.zze
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "current_session_count"
            r0.put(r3, r2)
            java.lang.Boolean r2 = r8.zzk
            r3 = 0
            if (r2 == 0) goto L7a
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L7a
            r4 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L7b
        L7a:
            r2 = r3
        L7b:
            java.lang.String r4 = "last_exempt_from_sampling"
            r0.put(r4, r2)
            android.database.sqlite.SQLiteDatabase r2 = r6.zzj()     // Catch: android.database.sqlite.SQLiteException -> La3
            r4 = 5
            long r2 = r2.insertWithOnConflict(r7, r3, r0, r4)     // Catch: android.database.sqlite.SQLiteException -> La3
            r4 = -1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto La2
            com.google.android.gms.measurement.internal.zzio r7 = r6.zzu     // Catch: android.database.sqlite.SQLiteException -> La3
            com.google.android.gms.measurement.internal.zzhe r7 = r7.zzaW()     // Catch: android.database.sqlite.SQLiteException -> La3
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zze()     // Catch: android.database.sqlite.SQLiteException -> La3
            java.lang.String r0 = "Failed to insert/update event aggregates (got -1). appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r1)     // Catch: android.database.sqlite.SQLiteException -> La3
            r7.zzb(r0, r1)     // Catch: android.database.sqlite.SQLiteException -> La3
        La2:
            return
        La3:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r8 = r8.zza
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)
            java.lang.String r1 = "Error storing event aggregates. appId"
            r0.zzc(r1, r8, r7)
            return
    }

    private final void zzaG(java.lang.String r7, java.lang.String r8, android.content.ContentValues r9) {
            r6 = this;
            java.lang.String r7 = "app_id"
            java.lang.String r8 = "consent_settings"
            android.database.sqlite.SQLiteDatabase r0 = r6.zzj()     // Catch: android.database.sqlite.SQLiteException -> L68
            java.lang.String r1 = r9.getAsString(r7)     // Catch: android.database.sqlite.SQLiteException -> L68
            if (r1 != 0) goto L22
            com.google.android.gms.measurement.internal.zzio r9 = r6.zzu     // Catch: android.database.sqlite.SQLiteException -> L68
            com.google.android.gms.measurement.internal.zzhe r9 = r9.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L68
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zzf()     // Catch: android.database.sqlite.SQLiteException -> L68
            java.lang.String r0 = "Value of the primary key is not set."
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)     // Catch: android.database.sqlite.SQLiteException -> L68
            r9.zzb(r0, r1)     // Catch: android.database.sqlite.SQLiteException -> L68
            return
        L22:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L68
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> L68
            r2.append(r7)     // Catch: android.database.sqlite.SQLiteException -> L68
            java.lang.String r3 = " = ?"
            r2.append(r3)     // Catch: android.database.sqlite.SQLiteException -> L68
            java.lang.String r2 = r2.toString()     // Catch: android.database.sqlite.SQLiteException -> L68
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: android.database.sqlite.SQLiteException -> L68
            r4 = 0
            r3[r4] = r1     // Catch: android.database.sqlite.SQLiteException -> L68
            int r1 = r0.update(r8, r9, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L68
            long r1 = (long) r1     // Catch: android.database.sqlite.SQLiteException -> L68
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L67
            r1 = 0
            r2 = 5
            long r0 = r0.insertWithOnConflict(r8, r1, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L68
            r2 = -1
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L67
            com.google.android.gms.measurement.internal.zzio r9 = r6.zzu     // Catch: android.database.sqlite.SQLiteException -> L68
            com.google.android.gms.measurement.internal.zzhe r9 = r9.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L68
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()     // Catch: android.database.sqlite.SQLiteException -> L68
            java.lang.String r0 = "Failed to insert/update table (got -1). key"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)     // Catch: android.database.sqlite.SQLiteException -> L68
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)     // Catch: android.database.sqlite.SQLiteException -> L68
            r9.zzc(r0, r1, r2)     // Catch: android.database.sqlite.SQLiteException -> L68
        L67:
            return
        L68:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)
            java.lang.String r1 = "Error storing into table. key"
            r0.zzd(r1, r8, r7, r9)
            return
    }

    private static final java.lang.String zzaH(java.util.List r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = ", "
            java.lang.String r3 = android.text.TextUtils.join(r2, r3)
            r0[r1] = r3
            java.lang.String r3 = " AND (upload_type IN (%s))"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzaj() {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzaw.zzj
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzak() {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzaw.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzal() {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzaw.zzk
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzam() {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzaw.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzan() {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzaw.zzh
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzao() {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzaw.zzi
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzap() {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzaw.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzaq() {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzaw.zze
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzar() {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzaw.zzl
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzas() {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzaw.zzc
            return r0
    }

    static final void zzau(android.content.ContentValues r1, java.lang.String r2, java.lang.Object r3) {
            java.lang.String r2 = "value"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L12
            java.lang.String r3 = (java.lang.String) r3
            r1.put(r2, r3)
            return
        L12:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L1c
            java.lang.Long r3 = (java.lang.Long) r3
            r1.put(r2, r3)
            return
        L1c:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L26
            java.lang.Double r3 = (java.lang.Double) r3
            r1.put(r2, r3)
            return
        L26:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid value type"
            r1.<init>(r2)
            throw r1
    }

    private final long zzay(java.lang.String r4, java.lang.String[] r5) {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.zzj()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r4, r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            if (r5 == 0) goto L18
            r5 = 0
            long r4 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            r1.close()
            return r4
        L18:
            android.database.sqlite.SQLiteException r5 = new android.database.sqlite.SQLiteException     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            java.lang.String r0 = "Database returned empty set"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            throw r5     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
        L20:
            r4 = move-exception
            goto L33
        L22:
            r5 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = "Database error"
            r0.zzc(r2, r4, r5)     // Catch: java.lang.Throwable -> L20
            throw r5     // Catch: java.lang.Throwable -> L20
        L33:
            if (r1 == 0) goto L38
            r1.close()
        L38:
            throw r4
    }

    private final long zzaz(java.lang.String r3, java.lang.String[] r4, long r5) {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.zzj()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            if (r4 == 0) goto L14
            r4 = 0
            long r5 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
        L14:
            r1.close()
            return r5
        L18:
            r3 = move-exception
            goto L2b
        L1a:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzio r5 = r2.zzu     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "Database error"
            r5.zzc(r6, r3, r4)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L2b:
            if (r1 == 0) goto L30
            r1.close()
        L30:
            throw r3
    }

    static /* bridge */ /* synthetic */ long zzc(com.google.android.gms.measurement.internal.zzaw r0, java.lang.String r1, java.lang.String[] r2, long r3) {
            java.lang.String r1 = "select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1"
            r3 = -1
            long r0 = r0.zzaz(r1, r2, r3)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzou zzv(com.google.android.gms.measurement.internal.zzaw r0) {
            com.google.android.gms.measurement.internal.zzou r0 = r0.zzn
            return r0
    }

    public final java.lang.String zzA() {
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.zzj()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L1c android.database.sqlite.SQLiteException -> L1e
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1a java.lang.Throwable -> L36
            if (r2 == 0) goto L30
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1a java.lang.Throwable -> L36
            r0.close()
            return r1
        L1a:
            r2 = move-exception
            goto L21
        L1c:
            r0 = move-exception
            goto L3a
        L1e:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L21:
            com.google.android.gms.measurement.internal.zzio r3 = r6.zzu     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L36
        L30:
            if (r0 == 0) goto L35
            r0.close()
        L35:
            return r1
        L36:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3a:
            if (r1 == 0) goto L3f
            r1.close()
        L3f:
            throw r0
    }

    public final java.util.List zzB(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            r2.zzg()
            r2.zzav()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            r0.add(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "app_id=?"
            r3.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L27
            r0.add(r4)
            java.lang.String r4 = " and origin=?"
            r3.append(r4)
        L27:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L3f
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)
            r0.add(r4)
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)
        L3f:
            int r4 = r0.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r4 = r0.toArray(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.String r3 = r3.toString()
            java.util.List r3 = r2.zzC(r3, r4)
            return r3
    }

    public final java.util.List zzC(java.lang.String r29, java.lang.String[] r30) {
            r28 = this;
            r1 = r28
            r28.zzg()
            r28.zzav()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r28.zzj()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            java.lang.String r3 = "conditional_properties"
            java.lang.String r12 = "app_id"
            java.lang.String r13 = "origin"
            java.lang.String r14 = "name"
            java.lang.String r15 = "value"
            java.lang.String r16 = "active"
            java.lang.String r17 = "trigger_event_name"
            java.lang.String r18 = "trigger_timeout"
            java.lang.String r19 = "timed_out_event"
            java.lang.String r20 = "creation_timestamp"
            java.lang.String r21 = "triggered_event"
            java.lang.String r22 = "triggered_timestamp"
            java.lang.String r23 = "time_to_live"
            java.lang.String r24 = "expired_event"
            java.lang.String[] r4 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            java.lang.String r9 = "rowid"
            com.google.android.gms.measurement.internal.zzio r12 = r1.zzu     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r12.zzf()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r7 = 0
            r8 = 0
            r5 = r29
            r6 = r30
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            if (r2 == 0) goto L110
        L4b:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r12.zzf()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto L6c
            com.google.android.gms.measurement.internal.zzhe r2 = r12.zzaW()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            java.lang.String r4 = "Read more than the max allowed conditional properties, ignoring extra"
            r12.zzf()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r2.zzb(r4, r3)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            goto L110
        L6c:
            r2 = 0
            java.lang.String r14 = r11.getString(r2)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r3 = 1
            java.lang.String r15 = r11.getString(r3)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r4 = 2
            java.lang.String r5 = r11.getString(r4)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r4 = 3
            java.lang.Object r8 = r1.zzz(r11, r4)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r4 = 4
            int r4 = r11.getInt(r4)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            if (r4 == 0) goto L8a
            r19 = 1
            goto L8c
        L8a:
            r19 = 0
        L8c:
            r2 = 5
            java.lang.String r20 = r11.getString(r2)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r2 = 6
            long r22 = r11.getLong(r2)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            com.google.android.gms.measurement.internal.zzpv r2 = r1.zzg     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            com.google.android.gms.measurement.internal.zzqa r3 = r2.zzA()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r4 = 7
            byte[] r4 = r11.getBlob(r4)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbh> r6 = com.google.android.gms.measurement.internal.zzbh.CREATOR     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            android.os.Parcelable r3 = r3.zzi(r4, r6)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r21 = r3
            com.google.android.gms.measurement.internal.zzbh r21 = (com.google.android.gms.measurement.internal.zzbh) r21     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r3 = 8
            long r17 = r11.getLong(r3)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            com.google.android.gms.measurement.internal.zzqa r3 = r2.zzA()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r4 = 9
            byte[] r4 = r11.getBlob(r4)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            android.os.Parcelable r3 = r3.zzi(r4, r6)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r24 = r3
            com.google.android.gms.measurement.internal.zzbh r24 = (com.google.android.gms.measurement.internal.zzbh) r24     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r3 = 10
            long r9 = r11.getLong(r3)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r3 = 11
            long r25 = r11.getLong(r3)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            com.google.android.gms.measurement.internal.zzqa r2 = r2.zzA()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r3 = 12
            byte[] r3 = r11.getBlob(r3)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            android.os.Parcelable r2 = r2.zzi(r3, r6)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r27 = r2
            com.google.android.gms.measurement.internal.zzbh r27 = (com.google.android.gms.measurement.internal.zzbh) r27     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            com.google.android.gms.measurement.internal.zzqb r16 = new com.google.android.gms.measurement.internal.zzqb     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r4 = r16
            r6 = r9
            r9 = r15
            r4.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            com.google.android.gms.measurement.internal.zzai r2 = new com.google.android.gms.measurement.internal.zzai     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r27)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            r0.add(r2)     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            boolean r2 = r11.moveToNext()     // Catch: java.lang.Throwable -> Lfa android.database.sqlite.SQLiteException -> Lfc
            if (r2 != 0) goto L4b
            goto L110
        Lfa:
            r0 = move-exception
            goto L116
        Lfc:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> Lfa
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> Lfa
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r3 = "Error querying conditional user property value"
            r2.zzb(r3, r0)     // Catch: java.lang.Throwable -> Lfa
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lfa
        L110:
            if (r11 == 0) goto L115
            r11.close()
        L115:
            return r0
        L116:
            if (r11 == 0) goto L11b
            r11.close()
        L11b:
            throw r0
    }

    public final java.util.List zzD(java.lang.String r27, com.google.android.gms.measurement.internal.zzpc r28, int r29) {
            r26 = this;
            r14 = r26
            r15 = r27
            com.google.android.gms.measurement.internal.zzio r0 = r14.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzaP
            r2 = 0
            boolean r0 = r0.zzx(r2, r1)
            if (r0 != 0) goto L18
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L18:
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r27)
            r26.zzg()
            r26.zzav()
            android.database.sqlite.SQLiteDatabase r3 = r26.zzj()     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            java.lang.String r4 = "upload_queue"
            java.lang.String r16 = "rowId"
            java.lang.String r17 = "app_id"
            java.lang.String r18 = "measurement_batch"
            java.lang.String r19 = "upload_uri"
            java.lang.String r20 = "upload_headers"
            java.lang.String r21 = "upload_type"
            java.lang.String r22 = "retry_count"
            java.lang.String r23 = "creation_timestamp"
            java.lang.String r24 = "associated_row_id"
            java.lang.String r25 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            r0 = r28
            java.util.List r0 = r0.zza     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            java.lang.String r0 = zzaH(r0)     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            java.lang.String r1 = r26.zzaC()     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            r6.<init>()     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            java.lang.String r7 = "app_id=?"
            r6.append(r7)     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            r6.append(r0)     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            java.lang.String r0 = " AND NOT "
            r6.append(r0)     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            r6.append(r1)     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            r0 = 0
            r7[r0] = r15     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            java.lang.String r10 = "creation_timestamp ASC"
            if (r29 <= 0) goto L74
            java.lang.String r1 = java.lang.String.valueOf(r29)     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            r11 = r1
            goto L75
        L74:
            r11 = r2
        L75:
            r8 = 0
            r9 = 0
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Leb android.database.sqlite.SQLiteException -> Lef
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
            r13.<init>()     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
        L80:
            boolean r1 = r12.moveToNext()     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
            if (r1 == 0) goto Ld5
            long r3 = r12.getLong(r0)     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
            r1 = 2
            byte[] r5 = r12.getBlob(r1)     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
            r1 = 3
            java.lang.String r6 = r12.getString(r1)     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
            r1 = 4
            java.lang.String r7 = r12.getString(r1)     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
            r1 = 5
            int r8 = r12.getInt(r1)     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
            r1 = 6
            int r9 = r12.getInt(r1)     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
            r1 = 7
            long r10 = r12.getLong(r1)     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
            r1 = 8
            long r16 = r12.getLong(r1)     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
            r1 = 9
            long r18 = r12.getLong(r1)     // Catch: java.lang.Throwable -> Ldb android.database.sqlite.SQLiteException -> Le3
            r1 = r26
            r2 = r27
            r20 = r12
            r0 = r13
            r12 = r16
            r14 = r18
            com.google.android.gms.measurement.internal.zzpz r1 = r1.zzaB(r2, r3, r5, r6, r7, r8, r9, r10, r12, r14)     // Catch: java.lang.Throwable -> Ld1 android.database.sqlite.SQLiteException -> Ld3
            if (r1 == 0) goto Lc8
            r0.add(r1)     // Catch: java.lang.Throwable -> Ld1 android.database.sqlite.SQLiteException -> Ld3
        Lc8:
            r14 = r26
            r15 = r27
            r13 = r0
            r12 = r20
            r0 = 0
            goto L80
        Ld1:
            r0 = move-exception
            goto Lde
        Ld3:
            r0 = move-exception
            goto Le6
        Ld5:
            r20 = r12
            r0 = r13
            r1 = r26
            goto L108
        Ldb:
            r0 = move-exception
            r20 = r12
        Lde:
            r1 = r26
            r2 = r20
            goto L10f
        Le3:
            r0 = move-exception
            r20 = r12
        Le6:
            r1 = r26
            r2 = r20
            goto Lf2
        Leb:
            r0 = move-exception
            r1 = r26
            goto L10f
        Lef:
            r0 = move-exception
            r1 = r26
        Lf2:
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu     // Catch: java.lang.Throwable -> L10e
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L10e
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r27
            r3.zzc(r4, r5, r0)     // Catch: java.lang.Throwable -> L10e
            java.util.List r13 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L10e
            r12 = r2
        L108:
            if (r12 == 0) goto L10d
            r12.close()
        L10d:
            return r13
        L10e:
            r0 = move-exception
        L10f:
            if (r2 == 0) goto L114
            r2.close()
        L114:
            throw r0
    }

    public final java.util.List zzE(java.lang.String r15) {
            r14 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)
            r14.zzg()
            r14.zzav()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r9 = "1000"
            r10 = 0
            android.database.sqlite.SQLiteDatabase r1 = r14.zzj()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "name"
            java.lang.String r4 = "origin"
            java.lang.String r5 = "set_timestamp"
            java.lang.String r6 = "value"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r4 = "app_id=?"
            r11 = 1
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            r12 = 0
            r5[r12] = r15     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r8 = "rowid"
            com.google.android.gms.measurement.internal.zzio r13 = r14.zzu     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            r13.zzf()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            if (r1 == 0) goto L94
        L3e:
            java.lang.String r5 = r10.getString(r12)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r1 = r10.getString(r11)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            if (r1 != 0) goto L4a
            java.lang.String r1 = ""
        L4a:
            r4 = r1
            r1 = 2
            long r6 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            r1 = 3
            java.lang.Object r8 = r14.zzz(r10, r1)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            if (r8 != 0) goto L69
            com.google.android.gms.measurement.internal.zzhe r1 = r13.zzaW()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            java.lang.String r2 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r15)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            r1.zzb(r2, r3)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            goto L73
        L69:
            com.google.android.gms.measurement.internal.zzqd r1 = new com.google.android.gms.measurement.internal.zzqd     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            r2 = r1
            r3 = r15
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            r0.add(r1)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
        L73:
            boolean r1 = r10.moveToNext()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7c
            if (r1 != 0) goto L3e
            goto L94
        L7a:
            r15 = move-exception
            goto L9a
        L7c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r14.zzu     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "Error querying user properties. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzhe.zzn(r15)     // Catch: java.lang.Throwable -> L7a
            r1.zzc(r2, r15, r0)     // Catch: java.lang.Throwable -> L7a
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L7a
        L94:
            if (r10 == 0) goto L99
            r10.close()
        L99:
            return r0
        L9a:
            if (r10 == 0) goto L9f
            r10.close()
        L9f:
            throw r15
    }

    public final java.util.List zzF(java.lang.String r19, java.lang.String r20, java.lang.String r21) {
            r18 = this;
            r1 = r18
            r0 = r21
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r19)
            r18.zzg()
            r18.zzav()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r11 = "1001"
            r12 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf8 android.database.sqlite.SQLiteException -> Lfc
            r13 = 3
            r3.<init>(r13)     // Catch: java.lang.Throwable -> Lf8 android.database.sqlite.SQLiteException -> Lfc
            r14 = r19
            r3.add(r14)     // Catch: java.lang.Throwable -> Lf8 android.database.sqlite.SQLiteException -> Lfa
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf8 android.database.sqlite.SQLiteException -> Lfa
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lf8 android.database.sqlite.SQLiteException -> Lfa
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch: java.lang.Throwable -> Lf8 android.database.sqlite.SQLiteException -> Lfa
            if (r5 != 0) goto L38
            r15 = r20
            r3.add(r15)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.String r5 = " and origin=?"
            r4.append(r5)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            goto L3a
        L38:
            r15 = r20
        L3a:
            boolean r5 = android.text.TextUtils.isEmpty(r21)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            if (r5 != 0) goto L59
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r5.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r5.append(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.String r6 = "*"
            r5.append(r6)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.String r5 = r5.toString()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r3.add(r5)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.String r5 = " and name glob ?"
            r4.append(r5)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
        L59:
            int r5 = r3.size()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r7 = r3
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            android.database.sqlite.SQLiteDatabase r3 = r18.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.String r5 = "user_attributes"
            java.lang.String r6 = "name"
            java.lang.String r8 = "set_timestamp"
            java.lang.String r9 = "value"
            java.lang.String r10 = "origin"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r9, r10}     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.String r8 = r4.toString()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.String r10 = "rowid"
            com.google.android.gms.measurement.internal.zzio r9 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r9.zzf()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r16 = 0
            r17 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r16
            r16 = r9
            r9 = r17
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            boolean r3 = r12.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            if (r3 != 0) goto L9c
            goto L118
        L9c:
            int r3 = r2.size()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r16.zzf()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto Lbc
            com.google.android.gms.measurement.internal.zzhe r0 = r16.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            r16.zzf()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r0.zzb(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            goto L118
        Lbc:
            r3 = 0
            java.lang.String r7 = r12.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r3 = 1
            long r8 = r12.getLong(r3)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r3 = 2
            java.lang.Object r10 = r1.zzz(r12, r3)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.String r15 = r12.getString(r13)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            if (r10 != 0) goto Le3
            com.google.android.gms.measurement.internal.zzhe r3 = r16.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r19)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r3.zzd(r4, r5, r15, r0)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            goto Lef
        Le3:
            com.google.android.gms.measurement.internal.zzqd r3 = new com.google.android.gms.measurement.internal.zzqd     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r4 = r3
            r5 = r19
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            r2.add(r3)     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
        Lef:
            boolean r3 = r12.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> Lf6 java.lang.Throwable -> Lf8
            if (r3 != 0) goto L9c
            goto L118
        Lf6:
            r0 = move-exception
            goto L101
        Lf8:
            r0 = move-exception
            goto L11e
        Lfa:
            r0 = move-exception
            goto Lff
        Lfc:
            r0 = move-exception
            r14 = r19
        Lff:
            r15 = r20
        L101:
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> Lf8
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> Lf8
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r19)     // Catch: java.lang.Throwable -> Lf8
            r2.zzd(r3, r4, r15, r0)     // Catch: java.lang.Throwable -> Lf8
            java.util.List r2 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lf8
        L118:
            if (r12 == 0) goto L11d
            r12.close()
        L11d:
            return r2
        L11e:
            if (r12 == 0) goto L123
            r12.close()
        L123:
            throw r0
    }

    public final void zzG(java.lang.String r27, java.lang.Long r28, java.lang.String r29, android.os.Bundle r30) {
            r26 = this;
            r1 = r26
            r12 = r27
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r30)
            r26.zzg()
            r26.zzav()
            com.google.android.gms.measurement.internal.zzio r13 = r1.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r13.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzbe
            r14 = 0
            boolean r0 = r0.zzx(r14, r2)
            if (r0 == 0) goto L28
            if (r28 == 0) goto L28
            com.google.android.gms.measurement.internal.zzau r0 = new com.google.android.gms.measurement.internal.zzau
            long r2 = r28.longValue()
            r0.<init>(r1, r12, r2)
            goto L2d
        L28:
            com.google.android.gms.measurement.internal.zzau r0 = new com.google.android.gms.measurement.internal.zzau
            r0.<init>(r1, r12)
        L2d:
            r15 = r0
            java.util.List r0 = r15.zza()
        L32:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L2c4
            java.util.Iterator r16 = r0.iterator()
        L3c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L2bd
            java.lang.Object r0 = r16.next()
            r11 = r0
            com.google.android.gms.measurement.internal.zzat r11 = (com.google.android.gms.measurement.internal.zzat) r11
            boolean r0 = android.text.TextUtils.isEmpty(r29)
            r9 = 1
            r10 = 0
            if (r0 != 0) goto L12d
            long r2 = r11.zzb
            android.database.sqlite.SQLiteDatabase r17 = r26.zzj()     // Catch: java.lang.Throwable -> Le6 android.database.sqlite.SQLiteException -> Le8
            java.lang.String r18 = "raw_events_metadata"
            java.lang.String r0 = "metadata"
            java.lang.String[] r19 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> Le6 android.database.sqlite.SQLiteException -> Le8
            java.lang.String r20 = "app_id = ? and metadata_fingerprint = ?"
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Le6 android.database.sqlite.SQLiteException -> Le8
            r0[r10] = r12     // Catch: java.lang.Throwable -> Le6 android.database.sqlite.SQLiteException -> Le8
            java.lang.String r2 = java.lang.Long.toString(r2)     // Catch: java.lang.Throwable -> Le6 android.database.sqlite.SQLiteException -> Le8
            r0[r9] = r2     // Catch: java.lang.Throwable -> Le6 android.database.sqlite.SQLiteException -> Le8
            r22 = 0
            r23 = 0
            java.lang.String r24 = "rowid"
            java.lang.String r25 = "2"
            r21 = r0
            android.database.Cursor r2 = r17.query(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> Le6 android.database.sqlite.SQLiteException -> Le8
            boolean r0 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            if (r0 != 0) goto L97
            com.google.android.gms.measurement.internal.zzhe r0 = r13.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            java.lang.String r3 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r27)     // Catch: android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            r0.zzb(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
        L91:
            r2.close()
            r3 = r14
            goto L101
        L97:
            byte[] r0 = r2.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            com.google.android.gms.internal.measurement.zzhw r3 = com.google.android.gms.internal.measurement.zzhx.zzz()     // Catch: java.io.IOException -> Lce android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            com.google.android.gms.internal.measurement.zzng r0 = com.google.android.gms.measurement.internal.zzqa.zzp(r3, r0)     // Catch: java.io.IOException -> Lce android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            com.google.android.gms.internal.measurement.zzhw r0 = (com.google.android.gms.internal.measurement.zzhw) r0     // Catch: java.io.IOException -> Lce android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch: java.io.IOException -> Lce android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            r3 = r0
            com.google.android.gms.internal.measurement.zzhx r3 = (com.google.android.gms.internal.measurement.zzhx) r3     // Catch: java.io.IOException -> Lce android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            boolean r0 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> Lcc java.lang.Throwable -> L125
            if (r0 == 0) goto Lc5
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> Lcc java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Lcc java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: android.database.sqlite.SQLiteException -> Lcc java.lang.Throwable -> L125
            java.lang.String r4 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r27)     // Catch: android.database.sqlite.SQLiteException -> Lcc java.lang.Throwable -> L125
            r0.zzb(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lcc java.lang.Throwable -> L125
        Lc5:
            r2.close()     // Catch: android.database.sqlite.SQLiteException -> Lcc java.lang.Throwable -> L125
        Lc8:
            r2.close()
            goto L101
        Lcc:
            r0 = move-exception
            goto Leb
        Lce:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r27)     // Catch: android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            r3.zzc(r4, r5, r0)     // Catch: android.database.sqlite.SQLiteException -> Le3 java.lang.Throwable -> L125
            goto L91
        Le3:
            r0 = move-exception
            r3 = r14
            goto Leb
        Le6:
            r0 = move-exception
            goto L127
        Le8:
            r0 = move-exception
            r2 = r14
            r3 = r2
        Leb:
            com.google.android.gms.measurement.internal.zzio r4 = r1.zzu     // Catch: java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()     // Catch: java.lang.Throwable -> L125
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()     // Catch: java.lang.Throwable -> L125
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r27)     // Catch: java.lang.Throwable -> L125
            r4.zzc(r5, r6, r0)     // Catch: java.lang.Throwable -> L125
            if (r2 == 0) goto L101
            goto Lc8
        L101:
            if (r3 == 0) goto L12d
            java.util.List r0 = r3.zzY()
            java.util.Iterator r0 = r0.iterator()
        L10b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L12d
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.zzio r2 = (com.google.android.gms.internal.measurement.zzio) r2
            java.lang.String r2 = r2.zzg()
            r7 = r29
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L10b
            goto L3c
        L125:
            r0 = move-exception
            r14 = r2
        L127:
            if (r14 == 0) goto L12c
            r14.close()
        L12c:
            throw r0
        L12d:
            r7 = r29
            com.google.android.gms.measurement.internal.zzpv r0 = r1.zzg
            com.google.android.gms.measurement.internal.zzqa r2 = r0.zzA()
            com.google.android.gms.internal.measurement.zzhm r3 = r11.zzd
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.util.List r5 = r3.zzi()
            java.util.Iterator r5 = r5.iterator()
        L144:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1c4
            java.lang.Object r6 = r5.next()
            com.google.android.gms.internal.measurement.zzhq r6 = (com.google.android.gms.internal.measurement.zzhq) r6
            boolean r8 = r6.zzu()
            if (r8 == 0) goto L164
            java.lang.String r8 = r6.zzg()
            double r9 = r6.zza()
            r4.putDouble(r8, r9)
        L161:
            r9 = 1
            r10 = 0
            goto L144
        L164:
            boolean r8 = r6.zzv()
            if (r8 == 0) goto L176
            java.lang.String r8 = r6.zzg()
            float r6 = r6.zzb()
            r4.putFloat(r8, r6)
            goto L161
        L176:
            boolean r8 = r6.zzw()
            if (r8 == 0) goto L188
            java.lang.String r8 = r6.zzg()
            long r9 = r6.zzd()
            r4.putLong(r8, r9)
            goto L161
        L188:
            boolean r8 = r6.zzy()
            if (r8 == 0) goto L19a
            java.lang.String r8 = r6.zzg()
            java.lang.String r6 = r6.zzh()
            r4.putString(r8, r6)
            goto L161
        L19a:
            java.util.List r8 = r6.zzi()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L1b4
            java.lang.String r8 = r6.zzg()
            java.util.List r6 = r6.zzi()
            android.os.Bundle[] r6 = com.google.android.gms.measurement.internal.zzqa.zzC(r6)
            r4.putParcelableArray(r8, r6)
            goto L161
        L1b4:
            com.google.android.gms.measurement.internal.zzio r8 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()
            java.lang.String r9 = "Unexpected parameter type for parameter"
            r8.zzb(r9, r6)
            goto L161
        L1c4:
            java.lang.String r2 = "_o"
            java.lang.String r5 = r4.getString(r2)
            r4.remove(r2)
            com.google.android.gms.measurement.internal.zzhf r2 = new com.google.android.gms.measurement.internal.zzhf
            java.lang.String r18 = r3.zzh()
            if (r5 != 0) goto L1d7
            java.lang.String r5 = ""
        L1d7:
            r19 = r5
            long r21 = r3.zzd()
            r17 = r2
            r20 = r4
            r17.<init>(r18, r19, r20, r21)
            com.google.android.gms.measurement.internal.zzio r9 = r1.zzu
            android.os.Bundle r10 = r2.zzd
            com.google.android.gms.measurement.internal.zzqf r4 = r9.zzw()
            r8 = r30
            r4.zzO(r10, r8)
            com.google.android.gms.measurement.internal.zzio r4 = r1.zzu
            java.lang.String r5 = r2.zzb
            com.google.android.gms.measurement.internal.zzbc r6 = new com.google.android.gms.measurement.internal.zzbc
            java.lang.String r17 = r3.zzh()
            long r18 = r3.zzd()
            long r20 = r3.zzc()
            r2 = r6
            r3 = r4
            r4 = r5
            r5 = r27
            r22 = r6
            r6 = r17
            r7 = r18
            r17 = r9
            r18 = r10
            r14 = 1
            r23 = 0
            r9 = r20
            r14 = r11
            r11 = r18
            r2.<init>(r3, r4, r5, r6, r7, r9, r11)
            long r2 = r14.zza
            long r4 = r14.zzb
            boolean r6 = r14.zzc
            r26.zzg()
            r26.zzav()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r22)
            r7 = r22
            java.lang.String r8 = r7.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            com.google.android.gms.measurement.internal.zzqa r0 = r0.zzA()
            com.google.android.gms.internal.measurement.zzhm r0 = r0.zzm(r7)
            byte[] r0 = r0.zzcd()
            android.content.ContentValues r9 = new android.content.ContentValues
            r9.<init>()
            java.lang.String r10 = "app_id"
            r9.put(r10, r8)
            java.lang.String r10 = r7.zzb
            java.lang.String r11 = "name"
            r9.put(r11, r10)
            long r10 = r7.zzd
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "timestamp"
            r9.put(r11, r10)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "metadata_fingerprint"
            r9.put(r5, r4)
            java.lang.String r4 = "data"
            r9.put(r4, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.String r4 = "realtime"
            r9.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r26.zzj()     // Catch: android.database.sqlite.SQLiteException -> L2a4
            java.lang.String r4 = "raw_events"
            java.lang.String r5 = "rowid = ?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: android.database.sqlite.SQLiteException -> L2a4
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L2a4
            r6[r23] = r2     // Catch: android.database.sqlite.SQLiteException -> L2a4
            int r0 = r0.update(r4, r9, r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L2a4
            long r2 = (long) r0     // Catch: android.database.sqlite.SQLiteException -> L2a4
            r4 = 1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L2ba
            com.google.android.gms.measurement.internal.zzhe r0 = r17.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L2a4
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: android.database.sqlite.SQLiteException -> L2a4
            java.lang.String r4 = "Failed to update raw event. appId, updatedRows"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)     // Catch: android.database.sqlite.SQLiteException -> L2a4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L2a4
            r0.zzc(r4, r5, r2)     // Catch: android.database.sqlite.SQLiteException -> L2a4
            goto L2ba
        L2a4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.String r3 = r7.zza
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)
            java.lang.String r4 = "Error updating raw event. appId"
            r2.zzc(r4, r3, r0)
        L2ba:
            r14 = 0
            goto L3c
        L2bd:
            java.util.List r0 = r15.zza()
            r14 = 0
            goto L32
        L2c4:
            return
    }

    public final void zzH() {
            r1 = this;
            r1.zzav()
            android.database.sqlite.SQLiteDatabase r0 = r1.zzj()
            r0.beginTransaction()
            return
    }

    public final void zzI(java.lang.String r13) {
            r12 = this;
            java.lang.String r0 = "events_snapshot"
            r12.zzaE(r0, r13)
            java.lang.String r1 = "name"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.zzj()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            java.lang.String r4 = "events"
            r11 = 0
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            java.lang.Object[] r1 = r1.toArray(r5)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            r5 = r1
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            java.lang.String r6 = "app_id=?"
            r1 = 1
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            r7[r11] = r13     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            if (r1 == 0) goto L5e
        L30:
            java.lang.String r1 = r2.getString(r11)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            if (r1 == 0) goto L41
            java.lang.String r3 = "events"
            com.google.android.gms.measurement.internal.zzbd r1 = r12.zzaA(r3, r13, r1)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            if (r1 == 0) goto L41
            r12.zzaF(r0, r1)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
        L41:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteException -> L4a
            if (r1 != 0) goto L30
            goto L5e
        L48:
            r13 = move-exception
            goto L64
        L4a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r12.zzu     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "Error creating snapshot. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzhe.zzn(r13)     // Catch: java.lang.Throwable -> L48
            r1.zzc(r3, r13, r0)     // Catch: java.lang.Throwable -> L48
        L5e:
            if (r2 == 0) goto L63
            r2.close()
        L63:
            return
        L64:
            if (r2 == 0) goto L69
            r2.close()
        L69:
            throw r13
    }

    public final void zzJ(java.util.List r5) {
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            r4.zzg()
            r4.zzav()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "rowid in ("
            r0.<init>(r1)
            r1 = 0
        L11:
            int r2 = r5.size()
            if (r1 >= r2) goto L2e
            if (r1 == 0) goto L1e
            java.lang.String r2 = ","
            r0.append(r2)
        L1e:
            java.lang.Object r2 = r5.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.append(r2)
            int r1 = r1 + 1
            goto L11
        L2e:
            java.lang.String r1 = ")"
            r0.append(r1)
            android.database.sqlite.SQLiteDatabase r1 = r4.zzj()
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.lang.String r3 = "raw_events"
            int r0 = r1.delete(r3, r0, r2)
            int r1 = r5.size()
            if (r0 == r1) goto L63
            com.google.android.gms.measurement.internal.zzio r1 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "Deleted fewer rows from raw events table than expected"
            r1.zzc(r2, r0, r5)
        L63:
            return
    }

    public final void zzK(java.lang.Long r6) {
            r5 = this;
            r5.zzg()
            r5.zzav()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaM
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            if (r1 != 0) goto L19
            goto L3e
        L19:
            android.database.sqlite.SQLiteDatabase r1 = r5.zzj()
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]
            r4 = 0
            java.lang.String r6 = r6.toString()
            r3[r4] = r6
            java.lang.String r6 = "upload_queue"
            java.lang.String r4 = "rowid=?"
            int r6 = r1.delete(r6, r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L3f
            if (r6 == r2) goto L3e
            com.google.android.gms.measurement.internal.zzhe r6 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L3f
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzk()     // Catch: android.database.sqlite.SQLiteException -> L3f
            java.lang.String r0 = "Deleted fewer rows from upload_queue than expected"
            r6.zza(r0)     // Catch: android.database.sqlite.SQLiteException -> L3f
        L3e:
            return
        L3f:
            r6 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Failed to delete a MeasurementBatch in a upload_queue table"
            r0.zzb(r1, r6)
            throw r6
    }

    public final void zzL() {
            r1 = this;
            r1.zzav()
            android.database.sqlite.SQLiteDatabase r0 = r1.zzj()
            r0.endTransaction()
            return
    }

    final void zzM(java.util.List r6) {
            r5 = this;
            r5.zzg()
            r5.zzav()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            int r0 = r6.size()
            com.google.android.gms.common.internal.Preconditions.checkNotZero(r0)
            boolean r0 = r5.zzae()
            if (r0 != 0) goto L17
            return
        L17:
            java.lang.String r0 = ","
            java.lang.String r6 = android.text.TextUtils.join(r0, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ")"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT COUNT(1) FROM queue WHERE rowid IN "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " AND retry_count =  2147483647 LIMIT 1"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            long r0 = r5.zzay(r0, r1)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L63
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()
            java.lang.String r1 = "The number of upload retries exceeds the limit. Will remain unchanged."
            r0.zza(r1)
        L63:
            android.database.sqlite.SQLiteDatabase r0 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L81
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L81
            java.lang.String r2 = "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN "
            r1.append(r2)     // Catch: android.database.sqlite.SQLiteException -> L81
            r1.append(r6)     // Catch: android.database.sqlite.SQLiteException -> L81
            java.lang.String r6 = " AND (retry_count IS NULL OR retry_count < 2147483647)"
            r1.append(r6)     // Catch: android.database.sqlite.SQLiteException -> L81
            java.lang.String r6 = r1.toString()     // Catch: android.database.sqlite.SQLiteException -> L81
            r0.execSQL(r6)     // Catch: android.database.sqlite.SQLiteException -> L81
            return
        L81:
            r6 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Error incrementing retry count. error"
            r0.zzb(r1, r6)
            return
    }

    final void zzN(java.lang.Long r8) {
            r7 = this;
            r7.zzg()
            r7.zzav()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaM
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            if (r1 != 0) goto L1a
            goto Lab
        L1a:
            boolean r1 = r7.zzae()
            if (r1 == 0) goto Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT COUNT(1) FROM upload_queue WHERE rowid = "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " AND retry_count =  2147483647 LIMIT 1"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            long r1 = r7.zzay(r1, r3)
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4d
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.String r2 = "The number of upload retries exceeds the limit. Will remain unchanged."
            r1.zza(r2)
        L4d:
            android.database.sqlite.SQLiteDatabase r1 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L9b
            com.google.android.gms.measurement.internal.zzam r2 = r0.zzf()     // Catch: android.database.sqlite.SQLiteException -> L9b
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzaP     // Catch: android.database.sqlite.SQLiteException -> L9b
            boolean r2 = r2.zzx(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L9b
            if (r2 == 0) goto L77
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()     // Catch: android.database.sqlite.SQLiteException -> L9b
            long r2 = r0.currentTimeMillis()     // Catch: android.database.sqlite.SQLiteException -> L9b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L9b
            r0.<init>()     // Catch: android.database.sqlite.SQLiteException -> L9b
            java.lang.String r4 = " SET retry_count = retry_count + 1, last_upload_timestamp = "
            r0.append(r4)     // Catch: android.database.sqlite.SQLiteException -> L9b
            r0.append(r2)     // Catch: android.database.sqlite.SQLiteException -> L9b
            java.lang.String r0 = r0.toString()     // Catch: android.database.sqlite.SQLiteException -> L9b
            goto L79
        L77:
            java.lang.String r0 = " SET retry_count = retry_count + 1 "
        L79:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L9b
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> L9b
            java.lang.String r3 = "UPDATE upload_queue"
            r2.append(r3)     // Catch: android.database.sqlite.SQLiteException -> L9b
            r2.append(r0)     // Catch: android.database.sqlite.SQLiteException -> L9b
            java.lang.String r0 = " WHERE rowid = "
            r2.append(r0)     // Catch: android.database.sqlite.SQLiteException -> L9b
            r2.append(r8)     // Catch: android.database.sqlite.SQLiteException -> L9b
            java.lang.String r8 = " AND retry_count < 2147483647"
            r2.append(r8)     // Catch: android.database.sqlite.SQLiteException -> L9b
            java.lang.String r8 = r2.toString()     // Catch: android.database.sqlite.SQLiteException -> L9b
            r1.execSQL(r8)     // Catch: android.database.sqlite.SQLiteException -> L9b
            return
        L9b:
            r8 = move-exception
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()
            java.lang.String r1 = "Error incrementing retry count. error"
            r0.zzb(r1, r8)
        Lab:
            return
    }

    final void zzO() {
            r9 = this;
            r9.zzg()
            r9.zzav()
            boolean r0 = r9.zzae()
            if (r0 != 0) goto Le
            goto L89
        Le:
            com.google.android.gms.measurement.internal.zzpv r0 = r9.zzg
            com.google.android.gms.measurement.internal.zzoa r1 = r0.zzw()
            com.google.android.gms.measurement.internal.zzhp r1 = r1.zza
            long r1 = r1.zza()
            com.google.android.gms.measurement.internal.zzio r3 = r9.zzu
            com.google.android.gms.common.util.Clock r4 = r3.zzaU()
            long r4 = r4.elapsedRealtime()
            long r1 = r4 - r1
            long r1 = java.lang.Math.abs(r1)
            r3.zzf()
            long r6 = com.google.android.gms.measurement.internal.zzam.zzJ()
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L89
            com.google.android.gms.measurement.internal.zzoa r0 = r0.zzw()
            com.google.android.gms.measurement.internal.zzhp r0 = r0.zza
            r0.zzb(r4)
            r9.zzg()
            r9.zzav()
            boolean r0 = r9.zzae()
            if (r0 == 0) goto L89
            android.database.sqlite.SQLiteDatabase r0 = r9.zzj()
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            com.google.android.gms.common.util.Clock r4 = r3.zzaU()
            long r4 = r4.currentTimeMillis()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1[r2] = r4
            r3.zzf()
            r2 = 1
            long r4 = com.google.android.gms.measurement.internal.zzam.zzI()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1[r2] = r4
            java.lang.String r2 = "queue"
            java.lang.String r4 = "abs(bundle_end_timestamp - ?) > cast(? as integer)"
            int r0 = r0.delete(r2, r4, r1)
            if (r0 <= 0) goto L89
            com.google.android.gms.measurement.internal.zzhe r1 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "Deleted stale rows. rowsDeleted"
            r1.zzb(r2, r0)
        L89:
            return
    }

    public final void zzP(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            r5.zzg()
            r5.zzav()
            android.database.sqlite.SQLiteDatabase r0 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L21
            java.lang.String r1 = "user_attributes"
            java.lang.String r2 = "app_id=? and name=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: android.database.sqlite.SQLiteException -> L21
            r4 = 0
            r3[r4] = r6     // Catch: android.database.sqlite.SQLiteException -> L21
            r4 = 1
            r3[r4] = r7     // Catch: android.database.sqlite.SQLiteException -> L21
            r0.delete(r1, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L21
            return
        L21:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)
            com.google.android.gms.measurement.internal.zzgx r1 = r1.zzj()
            java.lang.String r7 = r1.zzf(r7)
            java.lang.String r1 = "Error deleting user property. appId"
            r2.zzd(r1, r6, r7, r0)
            return
    }

    public final void zzQ(java.lang.String r20) {
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "events_snapshot"
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r4 = "name"
            java.lang.String r5 = "lifetime_count"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.<init>(r4)
            java.lang.String r4 = "events"
            java.lang.String r5 = "_f"
            com.google.android.gms.measurement.internal.zzbd r6 = r1.zzaA(r4, r2, r5)
            java.lang.String r7 = "_v"
            com.google.android.gms.measurement.internal.zzbd r8 = r1.zzaA(r4, r2, r7)
            r1.zzaE(r4, r2)
            r9 = 0
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.zzj()     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            java.lang.String r12 = "events_snapshot"
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            java.lang.Object[] r0 = r0.toArray(r13)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r13 = r0
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            java.lang.String r14 = "app_id=?"
            r0 = 1
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r15[r10] = r2     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r9 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            boolean r11 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L91 android.database.sqlite.SQLiteException -> L94
            if (r11 != 0) goto L5a
            r9.close()
            if (r6 == 0) goto L56
            goto Lb3
        L56:
            if (r8 == 0) goto Lbe
            goto Lbb
        L5a:
            r11 = 0
            r12 = 0
        L5c:
            java.lang.String r13 = r9.getString(r10)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            long r14 = r9.getLong(r0)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            r16 = 1
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 < 0) goto L79
            boolean r14 = r5.equals(r13)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            if (r14 == 0) goto L72
            r11 = 1
            goto L79
        L72:
            boolean r14 = r7.equals(r13)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            if (r14 == 0) goto L79
            r12 = 1
        L79:
            if (r13 == 0) goto L84
            com.google.android.gms.measurement.internal.zzbd r13 = r1.zzaA(r3, r2, r13)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            if (r13 == 0) goto L84
            r1.zzaF(r4, r13)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
        L84:
            boolean r13 = r9.moveToNext()     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            if (r13 != 0) goto L5c
            goto Laa
        L8b:
            r0 = move-exception
            r10 = r11
            goto Lc3
        L8e:
            r0 = move-exception
            r10 = r11
            goto L96
        L91:
            r0 = move-exception
            r12 = 0
            goto Lc3
        L94:
            r0 = move-exception
            r12 = 0
        L96:
            com.google.android.gms.measurement.internal.zzio r5 = r1.zzu     // Catch: java.lang.Throwable -> Lc2
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> Lc2
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r7 = "Error querying snapshot. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzhe.zzn(r20)     // Catch: java.lang.Throwable -> Lc2
            r5.zzc(r7, r11, r0)     // Catch: java.lang.Throwable -> Lc2
            r11 = r10
        Laa:
            if (r9 == 0) goto Laf
            r9.close()
        Laf:
            if (r11 != 0) goto Lb7
            if (r6 == 0) goto Lb7
        Lb3:
            r1.zzaF(r4, r6)
            goto Lbe
        Lb7:
            if (r12 != 0) goto Lbe
            if (r8 == 0) goto Lbe
        Lbb:
            r1.zzaF(r4, r8)
        Lbe:
            r1.zzaE(r3, r2)
            return
        Lc2:
            r0 = move-exception
        Lc3:
            if (r9 == 0) goto Lc8
            r9.close()
        Lc8:
            if (r10 != 0) goto Ld1
            if (r6 != 0) goto Lcd
            goto Ld1
        Lcd:
            r1.zzaF(r4, r6)
            goto Ld8
        Ld1:
            if (r12 != 0) goto Ld8
            if (r8 == 0) goto Ld8
            r1.zzaF(r4, r8)
        Ld8:
            r1.zzaE(r3, r2)
            throw r0
    }

    final void zzR(java.lang.String r24, java.util.List r25) {
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r25)
            r8 = 0
        L12:
            int r9 = r25.size()
            if (r8 >= r9) goto Ldc
            java.lang.Object r9 = r3.get(r8)
            com.google.android.gms.internal.measurement.zzfh r9 = (com.google.android.gms.internal.measurement.zzfh) r9
            com.google.android.gms.internal.measurement.zzlz r9 = r9.zzch()
            com.google.android.gms.internal.measurement.zzfg r9 = (com.google.android.gms.internal.measurement.zzfg) r9
            int r11 = r9.zza()
            if (r11 == 0) goto L9d
            r11 = 0
        L2b:
            int r12 = r9.zza()
            if (r11 >= r12) goto L9d
            com.google.android.gms.internal.measurement.zzfj r12 = r9.zze(r11)
            com.google.android.gms.internal.measurement.zzlz r12 = r12.zzch()
            com.google.android.gms.internal.measurement.zzfi r12 = (com.google.android.gms.internal.measurement.zzfi) r12
            com.google.android.gms.internal.measurement.zzlz r13 = r12.zzaX()
            com.google.android.gms.internal.measurement.zzfi r13 = (com.google.android.gms.internal.measurement.zzfi) r13
            java.lang.String r14 = r12.zze()
            java.lang.String r14 = com.google.android.gms.measurement.internal.zzjy.zzb(r14)
            if (r14 == 0) goto L50
            r13.zzb(r14)
            r14 = 1
            goto L51
        L50:
            r14 = 0
        L51:
            r15 = 0
        L52:
            int r7 = r12.zza()
            if (r15 >= r7) goto L88
            com.google.android.gms.internal.measurement.zzfl r7 = r12.zzd(r15)
            java.lang.String r10 = r7.zze()
            r16 = r12
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.zzjz.zza
            r17 = r4
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.zzjz.zzb
            java.lang.String r4 = com.google.android.gms.measurement.internal.zzmg.zzb(r10, r12, r4)
            if (r4 == 0) goto L81
            com.google.android.gms.internal.measurement.zzlz r7 = r7.zzch()
            com.google.android.gms.internal.measurement.zzfk r7 = (com.google.android.gms.internal.measurement.zzfk) r7
            r7.zza(r4)
            com.google.android.gms.internal.measurement.zzmd r4 = r7.zzba()
            com.google.android.gms.internal.measurement.zzfl r4 = (com.google.android.gms.internal.measurement.zzfl) r4
            r13.zzc(r15, r4)
            r14 = 1
        L81:
            int r15 = r15 + 1
            r12 = r16
            r4 = r17
            goto L52
        L88:
            r17 = r4
            if (r14 == 0) goto L98
            r9.zzc(r11, r13)
            com.google.android.gms.internal.measurement.zzmd r4 = r9.zzba()
            com.google.android.gms.internal.measurement.zzfh r4 = (com.google.android.gms.internal.measurement.zzfh) r4
            r3.set(r8, r4)
        L98:
            int r11 = r11 + 1
            r4 = r17
            goto L2b
        L9d:
            r17 = r4
            int r4 = r9.zzb()
            if (r4 == 0) goto Ld6
            r4 = 0
        La6:
            int r7 = r9.zzb()
            if (r4 >= r7) goto Ld6
            com.google.android.gms.internal.measurement.zzfr r7 = r9.zzf(r4)
            java.lang.String r10 = r7.zze()
            java.lang.String[] r11 = com.google.android.gms.measurement.internal.zzka.zza
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.zzka.zzb
            java.lang.String r10 = com.google.android.gms.measurement.internal.zzmg.zzb(r10, r11, r12)
            if (r10 == 0) goto Ld3
            com.google.android.gms.internal.measurement.zzlz r7 = r7.zzch()
            com.google.android.gms.internal.measurement.zzfq r7 = (com.google.android.gms.internal.measurement.zzfq) r7
            r7.zza(r10)
            r9.zzd(r4, r7)
            com.google.android.gms.internal.measurement.zzmd r7 = r9.zzba()
            com.google.android.gms.internal.measurement.zzfh r7 = (com.google.android.gms.internal.measurement.zzfh) r7
            r3.set(r8, r7)
        Ld3:
            int r4 = r4 + 1
            goto La6
        Ld6:
            int r8 = r8 + 1
            r4 = r17
            goto L12
        Ldc:
            r17 = r4
            r23.zzav()
            r23.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r25)
            android.database.sqlite.SQLiteDatabase r4 = r23.zzj()
            r4.beginTransaction()
            r23.zzav()     // Catch: java.lang.Throwable -> L495
            r23.zzg()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch: java.lang.Throwable -> L495
            android.database.sqlite.SQLiteDatabase r7 = r23.zzj()     // Catch: java.lang.Throwable -> L495
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L495
            r10 = 0
            r9[r10] = r2     // Catch: java.lang.Throwable -> L495
            r7.delete(r6, r0, r9)     // Catch: java.lang.Throwable -> L495
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L495
            r9[r10] = r2     // Catch: java.lang.Throwable -> L495
            r7.delete(r5, r0, r9)     // Catch: java.lang.Throwable -> L495
            java.util.Iterator r7 = r25.iterator()     // Catch: java.lang.Throwable -> L495
        L112:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L495
            if (r0 == 0) goto L3b2
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.internal.measurement.zzfh r0 = (com.google.android.gms.internal.measurement.zzfh) r0     // Catch: java.lang.Throwable -> L495
            r23.zzav()     // Catch: java.lang.Throwable -> L495
            r23.zzg()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L495
            boolean r10 = r0.zzk()     // Catch: java.lang.Throwable -> L495
            if (r10 != 0) goto L144
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: java.lang.Throwable -> L495
            java.lang.String r8 = "Audience with no ID. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzhe.zzn(r24)     // Catch: java.lang.Throwable -> L495
            r0.zzb(r8, r9)     // Catch: java.lang.Throwable -> L495
            goto L112
        L144:
            int r10 = r0.zza()     // Catch: java.lang.Throwable -> L495
            java.util.List r11 = r0.zzg()     // Catch: java.lang.Throwable -> L495
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L495
        L150:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L495
            if (r12 == 0) goto L17a
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.internal.measurement.zzfj r12 = (com.google.android.gms.internal.measurement.zzfj) r12     // Catch: java.lang.Throwable -> L495
            boolean r12 = r12.zzp()     // Catch: java.lang.Throwable -> L495
            if (r12 != 0) goto L150
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: java.lang.Throwable -> L495
            java.lang.String r8 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzhe.zzn(r24)     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L495
            r0.zzc(r8, r9, r10)     // Catch: java.lang.Throwable -> L495
            goto L112
        L17a:
            java.util.List r11 = r0.zzh()     // Catch: java.lang.Throwable -> L495
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L495
        L182:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L495
            if (r12 == 0) goto L1ad
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.internal.measurement.zzfr r12 = (com.google.android.gms.internal.measurement.zzfr) r12     // Catch: java.lang.Throwable -> L495
            boolean r12 = r12.zzj()     // Catch: java.lang.Throwable -> L495
            if (r12 != 0) goto L182
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: java.lang.Throwable -> L495
            java.lang.String r8 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzhe.zzn(r24)     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L495
            r0.zzc(r8, r9, r10)     // Catch: java.lang.Throwable -> L495
            goto L112
        L1ad:
            java.util.List r11 = r0.zzg()     // Catch: java.lang.Throwable -> L495
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L495
        L1b5:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L495
            java.lang.String r8 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r9 = "audience_id"
            java.lang.String r15 = "app_id"
            if (r12 == 0) goto L299
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.internal.measurement.zzfj r12 = (com.google.android.gms.internal.measurement.zzfj) r12     // Catch: java.lang.Throwable -> L495
            r23.zzav()     // Catch: java.lang.Throwable -> L495
            r23.zzg()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)     // Catch: java.lang.Throwable -> L495
            java.lang.String r21 = r12.zzg()     // Catch: java.lang.Throwable -> L495
            boolean r21 = r21.isEmpty()     // Catch: java.lang.Throwable -> L495
            if (r21 == 0) goto L213
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: java.lang.Throwable -> L495
            java.lang.String r8 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzhe.zzn(r24)     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L495
            boolean r13 = r12.zzp()     // Catch: java.lang.Throwable -> L495
            if (r13 == 0) goto L206
            int r12 = r12.zzb()     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L495
            r20 = r12
            goto L208
        L206:
            r20 = 0
        L208:
            java.lang.String r12 = java.lang.String.valueOf(r20)     // Catch: java.lang.Throwable -> L495
            r0.zzd(r8, r9, r11, r12)     // Catch: java.lang.Throwable -> L495
            r21 = r7
            goto L375
        L213:
            byte[] r3 = r12.zzcd()     // Catch: java.lang.Throwable -> L495
            r21 = r7
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L495
            r7.<init>()     // Catch: java.lang.Throwable -> L495
            r7.put(r15, r2)     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L495
            r7.put(r9, r15)     // Catch: java.lang.Throwable -> L495
            boolean r9 = r12.zzp()     // Catch: java.lang.Throwable -> L495
            if (r9 == 0) goto L237
            int r9 = r12.zzb()     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L495
            goto L238
        L237:
            r9 = 0
        L238:
            r7.put(r14, r9)     // Catch: java.lang.Throwable -> L495
            java.lang.String r9 = "event_name"
            java.lang.String r14 = r12.zzg()     // Catch: java.lang.Throwable -> L495
            r7.put(r9, r14)     // Catch: java.lang.Throwable -> L495
            boolean r9 = r12.zzq()     // Catch: java.lang.Throwable -> L495
            if (r9 == 0) goto L253
            boolean r9 = r12.zzn()     // Catch: java.lang.Throwable -> L495
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L495
            goto L254
        L253:
            r9 = 0
        L254:
            r7.put(r13, r9)     // Catch: java.lang.Throwable -> L495
            r7.put(r8, r3)     // Catch: java.lang.Throwable -> L495
            android.database.sqlite.SQLiteDatabase r3 = r23.zzj()     // Catch: android.database.sqlite.SQLiteException -> L283 java.lang.Throwable -> L495
            r8 = 5
            r9 = 0
            long r7 = r3.insertWithOnConflict(r5, r9, r7, r8)     // Catch: android.database.sqlite.SQLiteException -> L283 java.lang.Throwable -> L495
            r12 = -1
            int r3 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r3 != 0) goto L27d
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> L283 java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L283 java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: android.database.sqlite.SQLiteException -> L283 java.lang.Throwable -> L495
            java.lang.String r7 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r24)     // Catch: android.database.sqlite.SQLiteException -> L283 java.lang.Throwable -> L495
            r3.zzb(r7, r8)     // Catch: android.database.sqlite.SQLiteException -> L283 java.lang.Throwable -> L495
        L27d:
            r3 = r25
            r7 = r21
            goto L1b5
        L283:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L495
            java.lang.String r7 = "Error storing event filter. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r24)     // Catch: java.lang.Throwable -> L495
            r3.zzc(r7, r8, r0)     // Catch: java.lang.Throwable -> L495
            goto L375
        L299:
            r21 = r7
            java.util.List r0 = r0.zzh()     // Catch: java.lang.Throwable -> L495
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L495
        L2a3:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L495
            if (r3 == 0) goto L3ac
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.internal.measurement.zzfr r3 = (com.google.android.gms.internal.measurement.zzfr) r3     // Catch: java.lang.Throwable -> L495
            r23.zzav()     // Catch: java.lang.Throwable -> L495
            r23.zzg()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L495
            java.lang.String r7 = r3.zze()     // Catch: java.lang.Throwable -> L495
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L495
            if (r7 == 0) goto L2f2
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: java.lang.Throwable -> L495
            java.lang.String r7 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r24)     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L495
            boolean r11 = r3.zzj()     // Catch: java.lang.Throwable -> L495
            if (r11 == 0) goto L2e8
            int r3 = r3.zza()     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L495
            goto L2e9
        L2e8:
            r3 = 0
        L2e9:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L495
            r0.zzd(r7, r8, r9, r3)     // Catch: java.lang.Throwable -> L495
            goto L375
        L2f2:
            byte[] r7 = r3.zzcd()     // Catch: java.lang.Throwable -> L495
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L495
            r11.<init>()     // Catch: java.lang.Throwable -> L495
            r11.put(r15, r2)     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L495
            r11.put(r9, r12)     // Catch: java.lang.Throwable -> L495
            boolean r12 = r3.zzj()     // Catch: java.lang.Throwable -> L495
            if (r12 == 0) goto L314
            int r12 = r3.zza()     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L495
            goto L315
        L314:
            r12 = 0
        L315:
            r11.put(r14, r12)     // Catch: java.lang.Throwable -> L495
            java.lang.String r12 = "property_name"
            r22 = r0
            java.lang.String r0 = r3.zze()     // Catch: java.lang.Throwable -> L495
            r11.put(r12, r0)     // Catch: java.lang.Throwable -> L495
            boolean r0 = r3.zzk()     // Catch: java.lang.Throwable -> L495
            if (r0 == 0) goto L332
            boolean r0 = r3.zzi()     // Catch: java.lang.Throwable -> L495
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L495
            goto L333
        L332:
            r0 = 0
        L333:
            r11.put(r13, r0)     // Catch: java.lang.Throwable -> L495
            r11.put(r8, r7)     // Catch: java.lang.Throwable -> L495
            android.database.sqlite.SQLiteDatabase r0 = r23.zzj()     // Catch: android.database.sqlite.SQLiteException -> L361 java.lang.Throwable -> L495
            r3 = 0
            r7 = 5
            long r11 = r0.insertWithOnConflict(r6, r3, r11, r7)     // Catch: android.database.sqlite.SQLiteException -> L361 java.lang.Throwable -> L495
            r18 = -1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L35d
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> L361 java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L361 java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: android.database.sqlite.SQLiteException -> L361 java.lang.Throwable -> L495
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r24)     // Catch: android.database.sqlite.SQLiteException -> L361 java.lang.Throwable -> L495
            r0.zzb(r3, r7)     // Catch: android.database.sqlite.SQLiteException -> L361 java.lang.Throwable -> L495
            goto L375
        L35d:
            r0 = r22
            goto L2a3
        L361:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L495
            java.lang.String r7 = "Error storing property filter. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r24)     // Catch: java.lang.Throwable -> L495
            r3.zzc(r7, r8, r0)     // Catch: java.lang.Throwable -> L495
        L375:
            r23.zzav()     // Catch: java.lang.Throwable -> L495
            r23.zzg()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch: java.lang.Throwable -> L495
            android.database.sqlite.SQLiteDatabase r0 = r23.zzj()     // Catch: java.lang.Throwable -> L495
            r3 = 2
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L495
            r3 = 0
            r7[r3] = r2     // Catch: java.lang.Throwable -> L495
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L495
            r8 = 1
            r7[r8] = r3     // Catch: java.lang.Throwable -> L495
            r3 = r17
            r0.delete(r6, r3, r7)     // Catch: java.lang.Throwable -> L495
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L495
            r8 = 0
            r7[r8] = r2     // Catch: java.lang.Throwable -> L495
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L495
            r9 = 1
            r7[r9] = r8     // Catch: java.lang.Throwable -> L495
            r0.delete(r5, r3, r7)     // Catch: java.lang.Throwable -> L495
            r17 = r3
            r7 = r21
            r3 = r25
            goto L112
        L3ac:
            r3 = r25
            r7 = r21
            goto L112
        L3b2:
            r3 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L495
            r0.<init>()     // Catch: java.lang.Throwable -> L495
            java.util.Iterator r5 = r25.iterator()     // Catch: java.lang.Throwable -> L495
        L3bc:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L495
            if (r6 == 0) goto L3dc
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.internal.measurement.zzfh r6 = (com.google.android.gms.internal.measurement.zzfh) r6     // Catch: java.lang.Throwable -> L495
            boolean r7 = r6.zzk()     // Catch: java.lang.Throwable -> L495
            if (r7 == 0) goto L3d7
            int r6 = r6.zza()     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L495
            goto L3d8
        L3d7:
            r9 = r3
        L3d8:
            r0.add(r9)     // Catch: java.lang.Throwable -> L495
            goto L3bc
        L3dc:
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24)     // Catch: java.lang.Throwable -> L495
            r23.zzav()     // Catch: java.lang.Throwable -> L495
            r23.zzg()     // Catch: java.lang.Throwable -> L495
            android.database.sqlite.SQLiteDatabase r3 = r23.zzj()     // Catch: java.lang.Throwable -> L495
            java.lang.String r5 = "select count(1) from audience_filter_values where app_id=?"
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch: android.database.sqlite.SQLiteException -> L47a java.lang.Throwable -> L495
            r6 = 0
            r7[r6] = r2     // Catch: android.database.sqlite.SQLiteException -> L47a java.lang.Throwable -> L495
            long r5 = r1.zzay(r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L47a java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzio r7 = r1.zzu     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzam r7 = r7.zzf()     // Catch: java.lang.Throwable -> L495
            r8 = 2000(0x7d0, float:2.803E-42)
            com.google.android.gms.measurement.internal.zzgg r9 = com.google.android.gms.measurement.internal.zzgi.zzT     // Catch: java.lang.Throwable -> L495
            int r7 = r7.zzh(r2, r9)     // Catch: java.lang.Throwable -> L495
            int r7 = java.lang.Math.min(r8, r7)     // Catch: java.lang.Throwable -> L495
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)     // Catch: java.lang.Throwable -> L495
            long r8 = (long) r7     // Catch: java.lang.Throwable -> L495
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 > 0) goto L413
            goto L48e
        L413:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L495
            r5.<init>()     // Catch: java.lang.Throwable -> L495
            r10 = 0
        L419:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L495
            if (r10 >= r6) goto L435
            java.lang.Object r6 = r0.get(r10)     // Catch: java.lang.Throwable -> L495
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L495
            if (r6 == 0) goto L48e
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L495
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch: java.lang.Throwable -> L495
            r5.add(r6)     // Catch: java.lang.Throwable -> L495
            int r10 = r10 + 1
            goto L419
        L435:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)     // Catch: java.lang.Throwable -> L495
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L495
            r5.<init>()     // Catch: java.lang.Throwable -> L495
            java.lang.String r6 = "("
            r5.append(r6)     // Catch: java.lang.Throwable -> L495
            r5.append(r0)     // Catch: java.lang.Throwable -> L495
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch: java.lang.Throwable -> L495
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L495
            java.lang.String r5 = "audience_filter_values"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L495
            r6.<init>()     // Catch: java.lang.Throwable -> L495
            java.lang.String r8 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r6.append(r8)     // Catch: java.lang.Throwable -> L495
            r6.append(r0)     // Catch: java.lang.Throwable -> L495
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r6.append(r0)     // Catch: java.lang.Throwable -> L495
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L495
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L495
            r8 = 0
            r6[r8] = r2     // Catch: java.lang.Throwable -> L495
            java.lang.String r2 = java.lang.Integer.toString(r7)     // Catch: java.lang.Throwable -> L495
            r7 = 1
            r6[r7] = r2     // Catch: java.lang.Throwable -> L495
            r3.delete(r5, r0, r6)     // Catch: java.lang.Throwable -> L495
            goto L48e
        L47a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L495
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L495
            java.lang.String r5 = "Database error querying filters. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r24)     // Catch: java.lang.Throwable -> L495
            r3.zzc(r5, r2, r0)     // Catch: java.lang.Throwable -> L495
        L48e:
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L495
            r4.endTransaction()
            return
        L495:
            r0 = move-exception
            r4.endTransaction()
            throw r0
    }

    public final void zzS() {
            r1 = this;
            r1.zzav()
            android.database.sqlite.SQLiteDatabase r0 = r1.zzj()
            r0.setTransactionSuccessful()
            return
    }

    public final void zzT(com.google.android.gms.measurement.internal.zzh r9, boolean r10, boolean r11) {
            r8 = this;
            java.lang.String r11 = "apps"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            r8.zzg()
            r8.zzav()
            java.lang.String r0 = r9.zzC()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "app_id"
            r1.put(r2, r0)
            java.lang.String r2 = "app_instance_id"
            r3 = 0
            if (r10 == 0) goto L25
            r1.put(r2, r3)
            goto L3a
        L25:
            com.google.android.gms.measurement.internal.zzpv r10 = r8.zzg
            com.google.android.gms.measurement.internal.zzjx r10 = r10.zzu(r0)
            com.google.android.gms.measurement.internal.zzjw r4 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r10 = r10.zzr(r4)
            if (r10 == 0) goto L3a
            java.lang.String r10 = r9.zzD()
            r1.put(r2, r10)
        L3a:
            java.lang.String r10 = r9.zzH()
            java.lang.String r2 = "gmp_app_id"
            r1.put(r2, r10)
            com.google.android.gms.measurement.internal.zzpv r10 = r8.zzg
            com.google.android.gms.measurement.internal.zzjx r2 = r10.zzu(r0)
            com.google.android.gms.measurement.internal.zzjw r4 = com.google.android.gms.measurement.internal.zzjw.zza
            boolean r2 = r2.zzr(r4)
            if (r2 == 0) goto L5a
            java.lang.String r2 = r9.zzJ()
            java.lang.String r4 = "resettable_device_id_hash"
            r1.put(r4, r2)
        L5a:
            long r4 = r9.zzt()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "last_bundle_index"
            r1.put(r4, r2)
            long r4 = r9.zzu()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "last_bundle_start_timestamp"
            r1.put(r4, r2)
            long r4 = r9.zzs()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "last_bundle_end_timestamp"
            r1.put(r4, r2)
            java.lang.String r2 = r9.zzF()
            java.lang.String r4 = "app_version"
            r1.put(r4, r2)
            java.lang.String r2 = r9.zzE()
            java.lang.String r4 = "app_store"
            r1.put(r4, r2)
            long r4 = r9.zzq()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "gmp_version"
            r1.put(r4, r2)
            long r4 = r9.zzn()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "dev_cert_hash"
            r1.put(r4, r2)
            boolean r2 = r9.zzaJ()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r4 = "measurement_enabled"
            r1.put(r4, r2)
            long r4 = r9.zzm()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "day"
            r1.put(r4, r2)
            long r4 = r9.zzk()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "daily_public_events_count"
            r1.put(r4, r2)
            long r4 = r9.zzj()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "daily_events_count"
            r1.put(r4, r2)
            long r4 = r9.zzh()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "daily_conversions_count"
            r1.put(r4, r2)
            long r4 = r9.zzg()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "config_fetched_time"
            r1.put(r4, r2)
            long r4 = r9.zzp()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "failed_config_fetch_time"
            r1.put(r4, r2)
            long r4 = r9.zze()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "app_version_int"
            r1.put(r4, r2)
            java.lang.String r2 = r9.zzG()
            java.lang.String r4 = "firebase_instance_id"
            r1.put(r4, r2)
            long r4 = r9.zzi()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "daily_error_events_count"
            r1.put(r4, r2)
            long r4 = r9.zzl()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "daily_realtime_events_count"
            r1.put(r4, r2)
            java.lang.String r2 = r9.zzI()
            java.lang.String r4 = "health_monitor_sample"
            r1.put(r4, r2)
            r4 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r6 = "android_id"
            r1.put(r6, r2)
            boolean r2 = r9.zzaI()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r6 = "adid_reporting_enabled"
            r1.put(r6, r2)
            java.lang.String r2 = r9.zzA()
            java.lang.String r6 = "admob_app_id"
            r1.put(r6, r2)
            long r6 = r9.zzo()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "dynamite_version"
            r1.put(r6, r2)
            com.google.android.gms.measurement.internal.zzjx r10 = r10.zzu(r0)
            com.google.android.gms.measurement.internal.zzjw r2 = com.google.android.gms.measurement.internal.zzjw.zzb
            boolean r10 = r10.zzr(r2)
            if (r10 == 0) goto L184
            java.lang.String r10 = r9.zzL()
            java.lang.String r2 = "session_stitching_token"
            r1.put(r2, r10)
        L184:
            boolean r10 = r9.zzaL()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.String r2 = "sgtm_upload_enabled"
            r1.put(r2, r10)
            long r6 = r9.zzw()
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            java.lang.String r2 = "target_os_version"
            r1.put(r2, r10)
            long r6 = r9.zzv()
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            java.lang.String r2 = "session_stitching_token_hash"
            r1.put(r2, r10)
            com.google.android.gms.internal.measurement.zzqr.zzb()
            com.google.android.gms.measurement.internal.zzio r10 = r8.zzu
            com.google.android.gms.measurement.internal.zzam r2 = r10.zzf()
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzaV
            boolean r2 = r2.zzx(r0, r6)
            if (r2 == 0) goto L1d6
            int r2 = r9.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = "ad_services_version"
            r1.put(r6, r2)
            long r6 = r9.zzf()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "attribution_eligibility_status"
            r1.put(r6, r2)
        L1d6:
            boolean r2 = r9.zzaM()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r6 = "unmatched_first_open_without_ad_id"
            r1.put(r6, r2)
            java.lang.Boolean r2 = r9.zzx()
            java.lang.String r6 = "npa_metadata_value"
            r1.put(r6, r2)
            long r6 = r9.zzr()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "bundle_delivery_index"
            r1.put(r6, r2)
            java.lang.String r2 = r9.zzM()
            java.lang.String r6 = "sgtm_preview_key"
            r1.put(r6, r2)
            int r2 = r9.zzd()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = "dma_consent_state"
            r1.put(r6, r2)
            int r2 = r9.zzc()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = "daily_realtime_dcu_count"
            r1.put(r6, r2)
            java.lang.String r2 = r9.zzK()
            java.lang.String r6 = "serialized_npa_metadata"
            r1.put(r6, r2)
            com.google.android.gms.measurement.internal.zzam r2 = r10.zzf()
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzaP
            boolean r2 = r2.zzx(r0, r6)
            if (r2 == 0) goto L23e
            int r2 = r9.zzb()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = "client_upload_eligibility"
            r1.put(r6, r2)
        L23e:
            java.util.List r2 = r9.zzN()
            java.lang.String r6 = "safelisted_events"
            if (r2 == 0) goto L263
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L25a
            com.google.android.gms.measurement.internal.zzhe r2 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()
            java.lang.String r7 = "Safelisted events should not be an empty list. appId"
            r2.zzb(r7, r0)
            goto L263
        L25a:
            java.lang.String r7 = ","
            java.lang.String r2 = android.text.TextUtils.join(r7, r2)
            r1.put(r6, r2)
        L263:
            com.google.android.gms.internal.measurement.zzpn.zzb()
            com.google.android.gms.measurement.internal.zzam r2 = r10.zzf()
            com.google.android.gms.measurement.internal.zzgg r7 = com.google.android.gms.measurement.internal.zzgi.zzaJ
            boolean r2 = r2.zzx(r3, r7)
            if (r2 == 0) goto L27b
            boolean r2 = r1.containsKey(r6)
            if (r2 != 0) goto L27b
            r1.put(r6, r3)
        L27b:
            java.lang.Long r2 = r9.zzy()
            java.lang.String r6 = "unmatched_pfo"
            r1.put(r6, r2)
            java.lang.Long r2 = r9.zzz()
            java.lang.String r6 = "unmatched_uwa"
            r1.put(r6, r2)
            byte[] r9 = r9.zzaN()
            java.lang.String r2 = "ad_campaign_info"
            r1.put(r2, r9)
            android.database.sqlite.SQLiteDatabase r9 = r8.zzj()     // Catch: android.database.sqlite.SQLiteException -> L2c8
            java.lang.String r2 = "app_id = ?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: android.database.sqlite.SQLiteException -> L2c8
            r7 = 0
            r6[r7] = r0     // Catch: android.database.sqlite.SQLiteException -> L2c8
            int r2 = r9.update(r11, r1, r2, r6)     // Catch: android.database.sqlite.SQLiteException -> L2c8
            long r6 = (long) r2     // Catch: android.database.sqlite.SQLiteException -> L2c8
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 != 0) goto L2c7
            r2 = 5
            long r1 = r9.insertWithOnConflict(r11, r3, r1, r2)     // Catch: android.database.sqlite.SQLiteException -> L2c8
            r3 = -1
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 != 0) goto L2c7
            com.google.android.gms.measurement.internal.zzhe r9 = r10.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L2c8
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()     // Catch: android.database.sqlite.SQLiteException -> L2c8
            java.lang.String r10 = "Failed to insert/update app (got -1). appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzhe.zzn(r0)     // Catch: android.database.sqlite.SQLiteException -> L2c8
            r9.zzb(r10, r11)     // Catch: android.database.sqlite.SQLiteException -> L2c8
        L2c7:
            return
        L2c8:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzio r10 = r8.zzu
            com.google.android.gms.measurement.internal.zzhe r10 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zze()
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzhe.zzn(r0)
            java.lang.String r0 = "Error storing app. appId"
            r10.zzc(r0, r11, r9)
            return
    }

    public final void zzU(java.lang.String r3, com.google.android.gms.measurement.internal.zzba r4) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            r2.zzg()
            r2.zzav()
            com.google.android.gms.measurement.internal.zzjx r0 = r2.zzu(r3)
            com.google.android.gms.measurement.internal.zzjx r1 = com.google.android.gms.measurement.internal.zzjx.zza
            if (r0 != r1) goto L17
            r2.zzX(r3, r1)
        L17:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "app_id"
            r0.put(r1, r3)
            java.lang.String r3 = r4.zzj()
            java.lang.String r4 = "dma_consent_settings"
            r0.put(r4, r3)
            java.lang.String r3 = "consent_settings"
            r2.zzaG(r3, r1, r0)
            return
    }

    public final void zzV(com.google.android.gms.measurement.internal.zzbd r2) {
            r1 = this;
            java.lang.String r0 = "events"
            r1.zzaF(r0, r2)
            return
    }

    public final void zzW(java.lang.String r3, com.google.android.gms.measurement.internal.zzjx r4) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            r2.zzg()
            r2.zzav()
            com.google.android.gms.measurement.internal.zzjx r0 = r2.zzu(r3)
            r2.zzX(r3, r0)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "app_id"
            r0.put(r1, r3)
            java.lang.String r3 = r4.zzq()
            java.lang.String r4 = "storage_consent_at_bundling"
            r0.put(r4, r3)
            java.lang.String r3 = "consent_settings"
            r2.zzaG(r3, r1, r0)
            return
    }

    public final void zzX(java.lang.String r4, com.google.android.gms.measurement.internal.zzjx r5) {
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            r3.zzg()
            r3.zzav()
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r1 = "app_id"
            r0.put(r1, r4)
            java.lang.String r4 = r5.zzq()
            java.lang.String r2 = "consent_state"
            r0.put(r2, r4)
            int r4 = r5.zzb()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "consent_source"
            r0.put(r5, r4)
            java.lang.String r4 = "consent_settings"
            r3.zzaG(r4, r1, r0)
            return
    }

    public final boolean zzY(java.lang.String r9) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaM
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            r2 = 0
            if (r1 == 0) goto L7d
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzaP
            boolean r0 = r0.zzx(r3, r1)
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L66
            com.google.android.gms.measurement.internal.zzmf[] r0 = new com.google.android.gms.measurement.internal.zzmf[r1]
            com.google.android.gms.measurement.internal.zzmf r5 = com.google.android.gms.measurement.internal.zzmf.zzb
            r0[r2] = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            r0 = r0[r2]
            int r0 = r0.zza()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            java.lang.String r0 = zzaH(r5)
            java.lang.String r5 = r8.zzaC()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = " AND NOT "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            java.lang.String[] r5 = new java.lang.String[r1]
            r5[r2] = r9
            long r5 = r8.zzay(r0, r5)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 == 0) goto L65
            return r1
        L65:
            return r2
        L66:
            java.lang.String r0 = r8.zzaC()
            java.lang.String[] r5 = new java.lang.String[r1]
            r5[r2] = r9
            java.lang.String r9 = "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT "
            java.lang.String r9 = r9.concat(r0)
            long r5 = r8.zzay(r9, r5)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 == 0) goto L7d
            return r1
        L7d:
            return r2
    }

    public final boolean zzZ(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r7
            r7 = 1
            r0[r7] = r8
            java.lang.String r8 = "select count(1) from raw_events where app_id = ? and name = ?"
            long r2 = r6.zzay(r8, r0)
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L16
            return r7
        L16:
            return r1
    }

    public final int zza(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            r6.zzg()
            r6.zzav()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r6.zzj()     // Catch: android.database.sqlite.SQLiteException -> L22
            java.lang.String r2 = "conditional_properties"
            java.lang.String r3 = "app_id=? and name=?"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: android.database.sqlite.SQLiteException -> L22
            r4[r0] = r7     // Catch: android.database.sqlite.SQLiteException -> L22
            r5 = 1
            r4[r5] = r8     // Catch: android.database.sqlite.SQLiteException -> L22
            int r7 = r1.delete(r2, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L22
            return r7
        L22:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)
            com.google.android.gms.measurement.internal.zzgx r2 = r2.zzj()
            java.lang.String r8 = r2.zzf(r8)
            java.lang.String r2 = "Error deleting conditional property"
            r3.zzd(r2, r7, r8, r1)
            return r0
    }

    public final boolean zzaa() {
            r5 = this;
            java.lang.String r0 = "select count(1) > 0 from raw_events"
            r1 = 0
            long r0 = r5.zzay(r0, r1)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final boolean zzab() {
            r5 = this;
            java.lang.String r0 = "select count(1) > 0 from queue where has_realtime = 1"
            r1 = 0
            long r0 = r5.zzay(r0, r1)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final boolean zzac() {
            r5 = this;
            java.lang.String r0 = "select count(1) > 0 from raw_events where realtime = 1"
            r1 = 0
            long r0 = r5.zzay(r0, r1)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final boolean zzad(java.lang.String r11, com.google.android.gms.measurement.internal.zzov r12) {
            r10 = this;
            r10.zzg()
            r10.zzav()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            com.google.android.gms.measurement.internal.zzio r0 = r10.zzu
            com.google.android.gms.common.util.Clock r1 = r0.zzaU()
            long r1 = r1.currentTimeMillis()
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zzau
            r4 = 0
            java.lang.Object r5 = r3.zza(r4)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = r1 - r5
            long r7 = r12.zzb
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 < 0) goto L3a
            java.lang.Object r3 = r3.zza(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            long r5 = r5 + r1
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 <= 0) goto L53
        L3a:
            com.google.android.gms.measurement.internal.zzhe r3 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r11)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r6 = "Storing trigger URI outside of the max retention time span. appId, now, timestamp"
            r3.zzd(r6, r5, r1, r2)
        L53:
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Saving trigger URI"
            r1.zza(r2)
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "app_id"
            r1.put(r2, r11)
            java.lang.String r2 = r12.zza
            java.lang.String r3 = "trigger_uri"
            r1.put(r3, r2)
            int r12 = r12.zzc
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r2 = "source"
            r1.put(r2, r12)
            java.lang.Long r12 = java.lang.Long.valueOf(r7)
            java.lang.String r2 = "timestamp_millis"
            r1.put(r2, r12)
            r12 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.zzj()     // Catch: android.database.sqlite.SQLiteException -> Laa
            java.lang.String r3 = "trigger_uris"
            long r1 = r2.insert(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> Laa
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto La8
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Laa
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: android.database.sqlite.SQLiteException -> Laa
            java.lang.String r1 = "Failed to insert trigger URI (got -1). appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r11)     // Catch: android.database.sqlite.SQLiteException -> Laa
            r0.zzb(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> Laa
            return r12
        La8:
            r11 = 1
            return r11
        Laa:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r10.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzhe.zzn(r11)
            java.lang.String r2 = "Error storing trigger URI. appId"
            r1.zzc(r2, r11, r0)
            return r12
    }

    protected final boolean zzae() {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            android.content.Context r1 = r0.zzaT()
            r0.zzf()
            java.lang.String r0 = "google_app_measurement.db"
            java.io.File r0 = r1.getDatabasePath(r0)
            boolean r0 = r0.exists()
            return r0
    }

    public final boolean zzaf(java.lang.String r6, java.lang.Long r7, long r8, com.google.android.gms.internal.measurement.zzhm r10) {
            r5 = this;
            r5.zzg()
            r5.zzav()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu
            byte[] r10 = r10.zzcd()
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            com.google.android.gms.measurement.internal.zzgx r2 = r0.zzj()
            java.lang.String r2 = r2.zzd(r6)
            int r3 = r10.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "Saving complex main event, appId, data size"
            r1.zzc(r4, r2, r3)
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "app_id"
            r1.put(r2, r6)
            java.lang.String r2 = "event_id"
            r1.put(r2, r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "children_to_process"
            r1.put(r8, r7)
            java.lang.String r7 = "main_event"
            r1.put(r7, r10)
            r7 = 0
            android.database.sqlite.SQLiteDatabase r8 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L73
            java.lang.String r9 = "main_event_params"
            r10 = 0
            r2 = 5
            long r8 = r8.insertWithOnConflict(r9, r10, r1, r2)     // Catch: android.database.sqlite.SQLiteException -> L73
            r1 = -1
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 != 0) goto L71
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L73
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()     // Catch: android.database.sqlite.SQLiteException -> L73
            java.lang.String r9 = "Failed to insert complex main event (got -1). appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)     // Catch: android.database.sqlite.SQLiteException -> L73
            r8.zzb(r9, r10)     // Catch: android.database.sqlite.SQLiteException -> L73
            return r7
        L71:
            r6 = 1
            return r6
        L73:
            r8 = move-exception
            com.google.android.gms.measurement.internal.zzio r9 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r9 = r9.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)
            java.lang.String r10 = "Error storing complex main event. appId"
            r9.zzc(r10, r6, r8)
            return r7
    }

    final boolean zzag(java.lang.String r9, long r10) {
            r8 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r8.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzbe
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            r2 = 0
            if (r1 != 0) goto L21
            com.google.android.gms.common.util.Clock r0 = r0.zzaU()
            long r0 = r0.currentTimeMillis()
            r3 = 15000(0x3a98, double:7.411E-320)
            long r3 = r3 + r10
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L20
            goto L21
        L20:
            return r2
        L21:
            java.lang.String r0 = "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;"
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: android.database.sqlite.SQLiteException -> L50
            r3[r2] = r9     // Catch: android.database.sqlite.SQLiteException -> L50
            java.lang.String r4 = java.lang.String.valueOf(r10)     // Catch: android.database.sqlite.SQLiteException -> L50
            r5 = 1
            r3[r5] = r4     // Catch: android.database.sqlite.SQLiteException -> L50
            r6 = 0
            long r3 = r8.zzaz(r0, r3, r6)     // Catch: android.database.sqlite.SQLiteException -> L50
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L3a
            return r2
        L3a:
            java.lang.String r0 = "select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: android.database.sqlite.SQLiteException -> L50
            r1[r2] = r9     // Catch: android.database.sqlite.SQLiteException -> L50
            java.lang.String r9 = java.lang.String.valueOf(r10)     // Catch: android.database.sqlite.SQLiteException -> L50
            r1[r5] = r9     // Catch: android.database.sqlite.SQLiteException -> L50
            long r9 = r8.zzaz(r0, r1, r6)     // Catch: android.database.sqlite.SQLiteException -> L50
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 <= 0) goto L4f
            return r5
        L4f:
            return r2
        L50:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzio r10 = r8.zzu
            com.google.android.gms.measurement.internal.zzhe r10 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zze()
            java.lang.String r11 = "Error checking backfill conditions"
            r10.zzb(r11, r9)
            return r2
    }

    public final boolean zzah(com.google.android.gms.measurement.internal.zzai r9) {
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            r8.zzg()
            r8.zzav()
            java.lang.String r0 = r9.zza
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.measurement.internal.zzqb r1 = r9.zzc
            java.lang.String r1 = r1.zzb
            com.google.android.gms.measurement.internal.zzqd r1 = r8.zzy(r0, r1)
            r2 = 1
            if (r1 != 0) goto L31
            java.lang.String[] r1 = new java.lang.String[r2]
            r3 = 0
            r1[r3] = r0
            java.lang.String r4 = "SELECT COUNT(1) FROM conditional_properties WHERE app_id=?"
            long r4 = r8.zzay(r4, r1)
            com.google.android.gms.measurement.internal.zzio r1 = r8.zzu
            r1.zzf()
            r6 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L30
            goto L31
        L30:
            return r3
        L31:
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r3 = "app_id"
            r1.put(r3, r0)
            java.lang.String r3 = r9.zzb
            java.lang.String r4 = "origin"
            r1.put(r4, r3)
            com.google.android.gms.measurement.internal.zzqb r3 = r9.zzc
            java.lang.String r3 = r3.zzb
            java.lang.String r4 = "name"
            r1.put(r4, r3)
            com.google.android.gms.measurement.internal.zzqb r3 = r9.zzc
            java.lang.Object r3 = r3.zza()
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r4 = "value"
            zzau(r1, r4, r3)
            boolean r3 = r9.zze
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "active"
            r1.put(r4, r3)
            java.lang.String r3 = r9.zzf
            java.lang.String r4 = "trigger_event_name"
            r1.put(r4, r3)
            long r3 = r9.zzh
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "trigger_timeout"
            r1.put(r4, r3)
            com.google.android.gms.measurement.internal.zzio r3 = r8.zzu
            com.google.android.gms.measurement.internal.zzbh r4 = r9.zzg
            com.google.android.gms.measurement.internal.zzqf r5 = r3.zzw()
            byte[] r4 = r5.zzay(r4)
            java.lang.String r5 = "timed_out_event"
            r1.put(r5, r4)
            long r4 = r9.zzd
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "creation_timestamp"
            r1.put(r5, r4)
            com.google.android.gms.measurement.internal.zzqf r4 = r3.zzw()
            com.google.android.gms.measurement.internal.zzbh r5 = r9.zzi
            byte[] r4 = r4.zzay(r5)
            java.lang.String r5 = "triggered_event"
            r1.put(r5, r4)
            com.google.android.gms.measurement.internal.zzqb r4 = r9.zzc
            long r4 = r4.zzc
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "triggered_timestamp"
            r1.put(r5, r4)
            long r4 = r9.zzj
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "time_to_live"
            r1.put(r5, r4)
            com.google.android.gms.measurement.internal.zzbh r9 = r9.zzk
            com.google.android.gms.measurement.internal.zzqf r4 = r3.zzw()
            byte[] r9 = r4.zzay(r9)
            java.lang.String r4 = "expired_event"
            r1.put(r4, r9)
            android.database.sqlite.SQLiteDatabase r9 = r8.zzj()     // Catch: android.database.sqlite.SQLiteException -> Led
            java.lang.String r4 = "conditional_properties"
            r5 = 0
            r6 = 5
            long r4 = r9.insertWithOnConflict(r4, r5, r1, r6)     // Catch: android.database.sqlite.SQLiteException -> Led
            r6 = -1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L101
            com.google.android.gms.measurement.internal.zzhe r9 = r3.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Led
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()     // Catch: android.database.sqlite.SQLiteException -> Led
            java.lang.String r1 = "Failed to insert/update conditional user property (got -1)"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r0)     // Catch: android.database.sqlite.SQLiteException -> Led
            r9.zzb(r1, r3)     // Catch: android.database.sqlite.SQLiteException -> Led
            goto L101
        Led:
            r9 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r8.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzhe.zzn(r0)
            java.lang.String r3 = "Error storing conditional user property"
            r1.zzc(r3, r0, r9)
        L101:
            return r2
    }

    public final boolean zzai(com.google.android.gms.measurement.internal.zzqd r11) {
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            r10.zzg()
            r10.zzav()
            java.lang.String r0 = r11.zza
            java.lang.String r1 = r11.zzc
            com.google.android.gms.measurement.internal.zzqd r2 = r10.zzy(r0, r1)
            r3 = 1
            if (r2 != 0) goto L5f
            boolean r2 = com.google.android.gms.measurement.internal.zzqf.zzaq(r1)
            r4 = 0
            if (r2 == 0) goto L3c
            java.lang.String[] r2 = new java.lang.String[r3]
            r2[r4] = r0
            java.lang.String r5 = "select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'"
            long r5 = r10.zzay(r5, r2)
            com.google.android.gms.measurement.internal.zzio r2 = r10.zzu
            com.google.android.gms.measurement.internal.zzam r2 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgg r7 = com.google.android.gms.measurement.internal.zzgi.zzU
            r8 = 25
            r9 = 100
            int r2 = r2.zzi(r0, r7, r8, r9)
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L3b
            goto L5f
        L3b:
            return r4
        L3c:
            java.lang.String r2 = "_npa"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L5f
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r4] = r0
            java.lang.String r5 = r11.zzb
            r2[r3] = r5
            java.lang.String r5 = "select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'"
            long r5 = r10.zzay(r5, r2)
            com.google.android.gms.measurement.internal.zzio r2 = r10.zzu
            r2.zzf()
            r7 = 25
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L5f
            return r4
        L5f:
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r4 = "app_id"
            r2.put(r4, r0)
            java.lang.String r4 = r11.zzb
            java.lang.String r5 = "origin"
            r2.put(r5, r4)
            java.lang.String r4 = "name"
            r2.put(r4, r1)
            long r4 = r11.zzd
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "set_timestamp"
            r2.put(r4, r1)
            java.lang.Object r1 = r11.zze
            java.lang.String r4 = "value"
            zzau(r2, r4, r1)
            android.database.sqlite.SQLiteDatabase r1 = r10.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lad
            java.lang.String r4 = "user_attributes"
            r5 = 0
            r6 = 5
            long r1 = r1.insertWithOnConflict(r4, r5, r2, r6)     // Catch: android.database.sqlite.SQLiteException -> Lad
            r4 = -1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto Lc3
            com.google.android.gms.measurement.internal.zzio r1 = r10.zzu     // Catch: android.database.sqlite.SQLiteException -> Lad
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Lad
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: android.database.sqlite.SQLiteException -> Lad
            java.lang.String r2 = "Failed to insert/update user property (got -1). appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzhe.zzn(r0)     // Catch: android.database.sqlite.SQLiteException -> Lad
            r1.zzb(r2, r0)     // Catch: android.database.sqlite.SQLiteException -> Lad
            goto Lc3
        Lad:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r10.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            java.lang.String r11 = r11.zza
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzhe.zzn(r11)
            java.lang.String r2 = "Error storing user property. appId"
            r1.zzc(r2, r11, r0)
        Lc3:
            return r3
    }

    public final void zzat(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.zzpr r26) {
            r20 = this;
            r1 = r20
            r2 = r26
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r26)
            r20.zzg()
            r20.zzav()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.zzj()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            boolean r4 = android.text.TextUtils.isEmpty(r21)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L79
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L32
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r6[r11] = r7     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r6[r12] = r7     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            goto L3a
        L32:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r6[r11] = r7     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
        L3a:
            if (r4 == 0) goto L3e
            java.lang.String r5 = "rowid <= ? and "
        L3e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r4.<init>()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r4.append(r7)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r4.append(r5)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r5)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            android.database.Cursor r3 = r0.rawQuery(r4, r6)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            if (r4 != 0) goto L60
            goto L21d
        L60:
            java.lang.String r4 = r3.getString(r11)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r5 = r3.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L76
            r3.close()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L76
            r16 = r3
            r3 = r4
            r17 = r5
            goto Lbf
        L71:
            r0 = move-exception
            r14 = r3
            r3 = r4
            goto L209
        L76:
            r0 = move-exception
            goto L225
        L79:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L88
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r6[r11] = r21     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r6[r12] = r7     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            goto L8c
        L88:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r6[r11] = r21     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
        L8c:
            if (r4 == 0) goto L90
            java.lang.String r5 = " and rowid <= ?"
        L90:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r4.<init>()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            r4.append(r7)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r4.append(r5)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r5 = " order by rowid limit 1;"
            r4.append(r5)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            android.database.Cursor r3 = r0.rawQuery(r4, r6)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            if (r4 != 0) goto Lb2
            goto L21d
        Lb2:
            java.lang.String r5 = r3.getString(r11)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r3.close()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L205
            r16 = r3
            r17 = r5
            r3 = r21
        Lbf:
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L1fd android.database.sqlite.SQLiteException -> L201
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch: java.lang.Throwable -> L1fd android.database.sqlite.SQLiteException -> L201
            r8[r11] = r3     // Catch: java.lang.Throwable -> L1fd android.database.sqlite.SQLiteException -> L201
            r8[r12] = r17     // Catch: java.lang.Throwable -> L1fd android.database.sqlite.SQLiteException -> L201
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = 0
            r11 = r18
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1fd android.database.sqlite.SQLiteException -> L201
            boolean r4 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            if (r4 != 0) goto Lfb
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r0.zzb(r2, r4)     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r14 = r12
            goto L21c
        Lfb:
            byte[] r4 = r12.getBlob(r15)     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            com.google.android.gms.internal.measurement.zzhw r5 = com.google.android.gms.internal.measurement.zzhx.zzz()     // Catch: java.io.IOException -> L1df java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            com.google.android.gms.internal.measurement.zzng r4 = com.google.android.gms.measurement.internal.zzqa.zzp(r5, r4)     // Catch: java.io.IOException -> L1df java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            com.google.android.gms.internal.measurement.zzhw r4 = (com.google.android.gms.internal.measurement.zzhw) r4     // Catch: java.io.IOException -> L1df java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            com.google.android.gms.internal.measurement.zzmd r4 = r4.zzba()     // Catch: java.io.IOException -> L1df java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            com.google.android.gms.internal.measurement.zzhx r4 = (com.google.android.gms.internal.measurement.zzhx) r4     // Catch: java.io.IOException -> L1df java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            boolean r5 = r12.moveToNext()     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            if (r5 == 0) goto L128
            com.google.android.gms.measurement.internal.zzio r5 = r1.zzu     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzk()     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r5.zzb(r6, r7)     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
        L128:
            r12.close()     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r2.zza = r4     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r11 = 3
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L148
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r5[r15] = r3     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r13 = 1
            r5[r13] = r17     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r7 = 2
            r5[r7] = r6     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r7 = r4
            r8 = r5
            goto L154
        L148:
            r13 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r6[r15] = r3     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r6[r13] = r17     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r7 = r4
            r8 = r6
        L154:
            java.lang.String r5 = "raw_events"
            java.lang.String r4 = "rowid"
            java.lang.String r6 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r10 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r6, r9, r10}     // Catch: java.lang.Throwable -> L1f7 android.database.sqlite.SQLiteException -> L1fa
            r9 = 0
            r10 = 0
            java.lang.String r14 = "rowid"
            r16 = 0
            r4 = r0
            r13 = 3
            r11 = r14
            r14 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: android.database.sqlite.SQLiteException -> L1f5 java.lang.Throwable -> L223
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            if (r0 == 0) goto L1c4
        L178:
            long r5 = r4.getLong(r15)     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            byte[] r0 = r4.getBlob(r13)     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            com.google.android.gms.internal.measurement.zzhl r7 = com.google.android.gms.internal.measurement.zzhm.zze()     // Catch: java.io.IOException -> L1a7 java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            com.google.android.gms.internal.measurement.zzng r0 = com.google.android.gms.measurement.internal.zzqa.zzp(r7, r0)     // Catch: java.io.IOException -> L1a7 java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            com.google.android.gms.internal.measurement.zzhl r0 = (com.google.android.gms.internal.measurement.zzhl) r0     // Catch: java.io.IOException -> L1a7 java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            r7 = 1
            java.lang.String r8 = r4.getString(r7)     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            r0.zzi(r8)     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            r8 = 2
            long r9 = r4.getLong(r8)     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            r0.zzm(r9)     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            boolean r0 = r2.zza(r5, r0)     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            if (r0 != 0) goto L1bd
            goto L1d7
        L1a7:
            r0 = move-exception
            r7 = 1
            r8 = 2
            com.google.android.gms.measurement.internal.zzio r5 = r1.zzu     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            r5.zzc(r6, r9, r0)     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
        L1bd:
            boolean r0 = r4.moveToNext()     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            if (r0 != 0) goto L178
            goto L1d7
        L1c4:
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
            r0.zzb(r2, r5)     // Catch: java.lang.Throwable -> L1d9 android.database.sqlite.SQLiteException -> L1dc
        L1d7:
            r3 = r4
            goto L21d
        L1d9:
            r0 = move-exception
            r3 = r4
            goto L225
        L1dc:
            r0 = move-exception
            r14 = r4
            goto L209
        L1df:
            r0 = move-exception
            r14 = r12
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> L1f5 java.lang.Throwable -> L223
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L1f5 java.lang.Throwable -> L223
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: android.database.sqlite.SQLiteException -> L1f5 java.lang.Throwable -> L223
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: android.database.sqlite.SQLiteException -> L1f5 java.lang.Throwable -> L223
            r2.zzc(r4, r5, r0)     // Catch: android.database.sqlite.SQLiteException -> L1f5 java.lang.Throwable -> L223
            goto L21c
        L1f5:
            r0 = move-exception
            goto L209
        L1f7:
            r0 = move-exception
            r14 = r12
            goto L224
        L1fa:
            r0 = move-exception
            r14 = r12
            goto L209
        L1fd:
            r0 = move-exception
            r3 = r16
            goto L225
        L201:
            r0 = move-exception
            r14 = r16
            goto L209
        L205:
            r0 = move-exception
            r14 = r3
            r3 = r21
        L209:
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> L223
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L223
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L223
            java.lang.String r4 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)     // Catch: java.lang.Throwable -> L223
            r2.zzc(r4, r3, r0)     // Catch: java.lang.Throwable -> L223
        L21c:
            r3 = r14
        L21d:
            if (r3 == 0) goto L222
            r3.close()
        L222:
            return
        L223:
            r0 = move-exception
        L224:
            r3 = r14
        L225:
            if (r3 == 0) goto L22a
            r3.close()
        L22a:
            throw r0
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final long zzd(java.lang.String r18, com.google.android.gms.internal.measurement.zzhv r19, java.lang.String r20, java.util.Map r21, com.google.android.gms.measurement.internal.zzmf r22, java.lang.Long r23) {
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r23
            r17.zzg()
            r17.zzav()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r19)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r18)
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.measurement.internal.zzam r4 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzaM
            r6 = 0
            boolean r4 = r4.zzx(r6, r5)
            r7 = -1
            if (r4 == 0) goto L1bb
            r17.zzg()
            r17.zzav()
            boolean r4 = r17.zzae()
            java.lang.String r5 = "upload_queue"
            r9 = 0
            if (r4 != 0) goto L34
            goto Ldb
        L34:
            com.google.android.gms.measurement.internal.zzpv r4 = r1.zzg
            com.google.android.gms.measurement.internal.zzoa r10 = r4.zzw()
            com.google.android.gms.measurement.internal.zzhp r10 = r10.zzb
            long r10 = r10.zza()
            com.google.android.gms.common.util.Clock r12 = r0.zzaU()
            long r12 = r12.elapsedRealtime()
            long r10 = r12 - r10
            long r10 = java.lang.Math.abs(r10)
            r0.zzf()
            long r14 = com.google.android.gms.measurement.internal.zzam.zzJ()
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 <= 0) goto Ldb
            com.google.android.gms.measurement.internal.zzoa r4 = r4.zzw()
            com.google.android.gms.measurement.internal.zzhp r4 = r4.zzb
            r4.zzb(r12)
            r17.zzg()
            r17.zzav()
            boolean r4 = r17.zzae()
            if (r4 != 0) goto L6f
            goto L90
        L6f:
            android.database.sqlite.SQLiteDatabase r4 = r17.zzj()
            java.lang.String r10 = r17.zzaC()
            java.lang.String[] r11 = new java.lang.String[r9]
            int r4 = r4.delete(r5, r10, r11)
            if (r4 <= 0) goto L90
            com.google.android.gms.measurement.internal.zzhe r10 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzj()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r11 = "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted"
            r10.zzb(r11, r4)
        L90:
            com.google.android.gms.measurement.internal.zzam r4 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r10 = com.google.android.gms.measurement.internal.zzgi.zzaP
            boolean r4 = r4.zzx(r6, r10)
            if (r4 == 0) goto Ldb
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r18)
            r17.zzg()
            r17.zzav()
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()     // Catch: android.database.sqlite.SQLiteException -> Lc7
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzz     // Catch: android.database.sqlite.SQLiteException -> Lc7
            int r0 = r0.zzh(r2, r4)     // Catch: android.database.sqlite.SQLiteException -> Lc7
            if (r0 <= 0) goto Ldb
            android.database.sqlite.SQLiteDatabase r4 = r17.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lc7
            java.lang.String r10 = "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)"
            r11 = 2
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch: android.database.sqlite.SQLiteException -> Lc7
            r11[r9] = r2     // Catch: android.database.sqlite.SQLiteException -> Lc7
            r12 = 1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: android.database.sqlite.SQLiteException -> Lc7
            r11[r12] = r0     // Catch: android.database.sqlite.SQLiteException -> Lc7
            r4.delete(r5, r10, r11)     // Catch: android.database.sqlite.SQLiteException -> Lc7
            goto Ldb
        Lc7:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r4 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzhe.zzn(r18)
            java.lang.String r11 = "Error deleting over the limit queued batches. appId"
            r4.zzc(r11, r10, r0)
        Ldb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r4 = r21.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Le8:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L118
            java.lang.Object r10 = r4.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "="
            r12.append(r11)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r0.add(r10)
            goto Le8
        L118:
            byte[] r4 = r19.zzcd()
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            java.lang.String r11 = "app_id"
            r10.put(r11, r2)
            java.lang.String r11 = "measurement_batch"
            r10.put(r11, r4)
            java.lang.String r4 = "upload_uri"
            r11 = r20
            r10.put(r4, r11)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L156
        L141:
            java.lang.Object r11 = r0.next()
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r4.append(r11)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L156
            java.lang.String r11 = "\r\n"
            r4.append(r11)
            goto L141
        L156:
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "upload_headers"
            r10.put(r4, r0)
            int r0 = r22.zza()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "upload_type"
            r10.put(r4, r0)
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            com.google.android.gms.common.util.Clock r4 = r0.zzaU()
            long r11 = r4.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            java.lang.String r11 = "creation_timestamp"
            r10.put(r11, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.String r9 = "retry_count"
            r10.put(r9, r4)
            if (r3 == 0) goto L18f
            java.lang.String r4 = "associated_row_id"
            r10.put(r4, r3)
        L18f:
            android.database.sqlite.SQLiteDatabase r3 = r17.zzj()     // Catch: android.database.sqlite.SQLiteException -> L1ab
            long r3 = r3.insert(r5, r6, r10)     // Catch: android.database.sqlite.SQLiteException -> L1ab
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L1a9
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L1ab
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: android.database.sqlite.SQLiteException -> L1ab
            java.lang.String r3 = "Failed to insert MeasurementBatch (got -1) to upload_queue. appId"
            r0.zzb(r3, r2)     // Catch: android.database.sqlite.SQLiteException -> L1ab
            goto L1aa
        L1a9:
            r7 = r3
        L1aa:
            return r7
        L1ab:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.String r4 = "Error storing MeasurementBatch to upload_queue. appId"
            r3.zzc(r4, r2, r0)
        L1bb:
            return r7
    }

    protected final long zze(java.lang.String r18, java.lang.String r19) {
            r17 = this;
            r1 = r17
            r2 = r18
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r18)
            java.lang.String r3 = "first_open_count"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            r17.zzg()
            r17.zzav()
            android.database.sqlite.SQLiteDatabase r4 = r17.zzj()
            r4.beginTransaction()
            r5 = 0
            r7 = -1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r9 = "select "
            r0.append(r9)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r9 = " from app2 where app_id=?"
            r0.append(r9)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r11 = 0
            r10[r11] = r2     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            long r12 = r1.zzaz(r0, r10, r7)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r0 = "app2"
            java.lang.String r10 = "app_id"
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L78
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r12.<init>()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r12.put(r10, r2)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r12.put(r3, r13)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r14 = "previous_install_count"
            r12.put(r14, r13)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r13 = 0
            r14 = 5
            long r12 = r4.insertWithOnConflict(r0, r13, r12, r14)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L77
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r9 = "Failed to insert column (got -1). appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzhe.zzn(r18)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r0.zzc(r9, r10, r3)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            goto Lcc
        L77:
            r12 = r5
        L78:
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            r14.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            r14.put(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            r15 = 1
            long r15 = r15 + r12
            java.lang.Long r10 = java.lang.Long.valueOf(r15)     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            r14.put(r3, r10)     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            java.lang.String r10 = "app_id = ?"
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            r9[r11] = r2     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            int r0 = r4.update(r0, r14, r10, r9)     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            long r9 = (long) r0     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 != 0) goto Lad
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            java.lang.String r5 = "Failed to update column (got 0). appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r18)     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            r0.zzc(r5, r6, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            goto Lcc
        Lad:
            r4.setTransactionSuccessful()     // Catch: android.database.sqlite.SQLiteException -> Lb2 java.lang.Throwable -> Lb5
            r7 = r12
            goto Lcc
        Lb2:
            r0 = move-exception
            r5 = r12
            goto Lb8
        Lb5:
            r0 = move-exception
            goto Ld0
        Lb7:
            r0 = move-exception
        Lb8:
            com.google.android.gms.measurement.internal.zzio r7 = r1.zzu     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.measurement.internal.zzhe r7 = r7.zzaW()     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zze()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r8 = "Error inserting column. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r18)     // Catch: java.lang.Throwable -> Lb5
            r7.zzd(r8, r2, r3, r0)     // Catch: java.lang.Throwable -> Lb5
            r7 = r5
        Lcc:
            r4.endTransaction()
            return r7
        Ld0:
            r4.endTransaction()
            throw r0
    }

    public final long zzf() {
            r4 = this;
            java.lang.String r0 = "select max(bundle_end_timestamp) from queue"
            r1 = 0
            r2 = 0
            long r0 = r4.zzaz(r0, r1, r2)
            return r0
    }

    public final long zzh() {
            r4 = this;
            java.lang.String r0 = "select max(timestamp) from raw_events"
            r1 = 0
            r2 = 0
            long r0 = r4.zzaz(r0, r1, r2)
            return r0
    }

    public final long zzi(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r4 = "select count(1) from events where app_id=? and name not like '!_%' escape '!'"
            r1 = 0
            long r0 = r3.zzaz(r4, r0, r1)
            return r0
    }

    final android.database.sqlite.SQLiteDatabase zzj() {
            r3 = this;
            r3.zzg()
            com.google.android.gms.measurement.internal.zzav r0 = r3.zzm     // Catch: android.database.sqlite.SQLiteException -> La
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> La
            return r0
        La:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r1 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            java.lang.String r2 = "Error opening database"
            r1.zzb(r2, r0)
            throw r0
    }

    public final android.os.Bundle zzk(java.lang.String r6) {
            r5 = this;
            r5.zzg()
            r5.zzav()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.zzj()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            if (r2 != 0) goto L2d
            com.google.android.gms.measurement.internal.zzio r6 = r5.zzu     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            java.lang.String r2 = "Default event parameters not found"
            r6.zza(r2)     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            goto L7c
        L2d:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzhl r3 = com.google.android.gms.internal.measurement.zzhm.zze()     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzng r2 = com.google.android.gms.measurement.internal.zzqa.zzp(r3, r2)     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzhl r2 = (com.google.android.gms.internal.measurement.zzhl) r2     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzmd r2 = r2.zzba()     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzhm r2 = (com.google.android.gms.internal.measurement.zzhm) r2     // Catch: java.io.IOException -> L52 android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzpv r6 = r5.zzg     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            r6.zzA()     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            java.util.List r6 = r2.zzi()     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.zzqa.zzF(r6)     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            r1.close()
            return r6
        L52:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r5.zzu     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            r3.zzc(r4, r6, r2)     // Catch: android.database.sqlite.SQLiteException -> L67 java.lang.Throwable -> L82
            goto L7c
        L67:
            r6 = move-exception
            goto L6d
        L69:
            r6 = move-exception
            goto L84
        L6b:
            r6 = move-exception
            r1 = r0
        L6d:
            com.google.android.gms.measurement.internal.zzio r2 = r5.zzu     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zzb(r3, r6)     // Catch: java.lang.Throwable -> L82
        L7c:
            if (r1 == 0) goto L81
            r1.close()
        L81:
            return r0
        L82:
            r6 = move-exception
            r0 = r1
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r6
    }

    public final com.google.android.gms.measurement.internal.zzh zzl(java.lang.String r52) {
            r51 = this;
            r1 = r51
            r2 = r52
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r52)
            r51.zzg()
            r51.zzav()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r51.zzj()     // Catch: java.lang.Throwable -> L2f8 android.database.sqlite.SQLiteException -> L2fa
            java.lang.String r5 = "apps"
            java.lang.String r6 = "app_instance_id"
            java.lang.String r7 = "gmp_app_id"
            java.lang.String r8 = "resettable_device_id_hash"
            java.lang.String r9 = "last_bundle_index"
            java.lang.String r10 = "last_bundle_start_timestamp"
            java.lang.String r11 = "last_bundle_end_timestamp"
            java.lang.String r12 = "app_version"
            java.lang.String r13 = "app_store"
            java.lang.String r14 = "gmp_version"
            java.lang.String r15 = "dev_cert_hash"
            java.lang.String r16 = "measurement_enabled"
            java.lang.String r17 = "day"
            java.lang.String r18 = "daily_public_events_count"
            java.lang.String r19 = "daily_events_count"
            java.lang.String r20 = "daily_conversions_count"
            java.lang.String r21 = "config_fetched_time"
            java.lang.String r22 = "failed_config_fetch_time"
            java.lang.String r23 = "app_version_int"
            java.lang.String r24 = "firebase_instance_id"
            java.lang.String r25 = "daily_error_events_count"
            java.lang.String r26 = "daily_realtime_events_count"
            java.lang.String r27 = "health_monitor_sample"
            java.lang.String r28 = "android_id"
            java.lang.String r29 = "adid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String r34 = "session_stitching_token"
            java.lang.String r35 = "sgtm_upload_enabled"
            java.lang.String r36 = "target_os_version"
            java.lang.String r37 = "session_stitching_token_hash"
            java.lang.String r38 = "ad_services_version"
            java.lang.String r39 = "unmatched_first_open_without_ad_id"
            java.lang.String r40 = "npa_metadata_value"
            java.lang.String r41 = "attribution_eligibility_status"
            java.lang.String r42 = "sgtm_preview_key"
            java.lang.String r43 = "dma_consent_state"
            java.lang.String r44 = "daily_realtime_dcu_count"
            java.lang.String r45 = "bundle_delivery_index"
            java.lang.String r46 = "serialized_npa_metadata"
            java.lang.String r47 = "unmatched_pfo"
            java.lang.String r48 = "unmatched_uwa"
            java.lang.String r49 = "ad_campaign_info"
            java.lang.String r50 = "client_upload_eligibility"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50}     // Catch: java.lang.Throwable -> L2f8 android.database.sqlite.SQLiteException -> L2fa
            java.lang.String r7 = "app_id=?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L2f8 android.database.sqlite.SQLiteException -> L2fa
            r12 = 0
            r8[r12] = r2     // Catch: java.lang.Throwable -> L2f8 android.database.sqlite.SQLiteException -> L2fa
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2f8 android.database.sqlite.SQLiteException -> L2fa
            boolean r5 = r4.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r5 != 0) goto L89
            goto L30f
        L89:
            com.google.android.gms.measurement.internal.zzh r5 = new com.google.android.gms.measurement.internal.zzh     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzpv r6 = r1.zzg     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzio r7 = r6.zzt()     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.<init>(r7, r2)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzjx r7 = r6.zzu(r2)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzjw r8 = com.google.android.gms.measurement.internal.zzjw.zzb     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            boolean r7 = r7.zzr(r8)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 == 0) goto La7
            java.lang.String r7 = r4.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzV(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        La7:
            java.lang.String r7 = r4.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzao(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzjx r7 = r6.zzu(r2)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzjw r9 = com.google.android.gms.measurement.internal.zzjw.zza     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            boolean r7 = r7.zzr(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 == 0) goto Lc2
            r7 = 2
            java.lang.String r7 = r4.getString(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzax(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        Lc2:
            r7 = 3
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzat(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 4
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzau(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 5
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzas(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 6
            java.lang.String r7 = r4.getString(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzX(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 7
            java.lang.String r7 = r4.getString(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzW(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 8
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzap(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 9
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzaj(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 10
            boolean r9 = r4.isNull(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r9 != 0) goto L10d
            int r7 = r4.getInt(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 == 0) goto L10b
            goto L10d
        L10b:
            r7 = 0
            goto L10e
        L10d:
            r7 = 1
        L10e:
            r5.zzav(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 11
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzai(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 12
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzaf(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 13
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzae(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 14
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzac(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 15
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzab(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 16
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzam(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 17
            boolean r9 = r4.isNull(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r9 == 0) goto L153
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            goto L158
        L153:
            int r7 = r4.getInt(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            long r9 = (long) r7     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        L158:
            r5.zzY(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 18
            java.lang.String r7 = r4.getString(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzan(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 19
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzad(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 20
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzah(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 21
            java.lang.String r7 = r4.getString(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzaq(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 23
            boolean r9 = r4.isNull(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r9 != 0) goto L190
            int r7 = r4.getInt(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 == 0) goto L18e
            goto L190
        L18e:
            r7 = 0
            goto L191
        L190:
            r7 = 1
        L191:
            r5.zzU(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 24
            java.lang.String r7 = r4.getString(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzS(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 25
            boolean r9 = r4.isNull(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r9 == 0) goto L1a8
            r9 = 0
            goto L1ac
        L1a8:
            long r9 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        L1ac:
            r5.zzal(r9)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 26
            boolean r9 = r4.isNull(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r9 != 0) goto L1c9
            java.lang.String r7 = r4.getString(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            java.lang.String r9 = ","
            r10 = -1
            java.lang.String[] r7 = r7.split(r9, r10)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            java.util.List r7 = java.util.Arrays.asList(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzay(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        L1c9:
            com.google.android.gms.measurement.internal.zzjx r6 = r6.zzu(r2)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            boolean r6 = r6.zzr(r8)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r6 == 0) goto L1dc
            r6 = 28
            java.lang.String r6 = r4.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzaA(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        L1dc:
            r6 = 29
            boolean r7 = r4.isNull(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 != 0) goto L1ec
            int r6 = r4.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r6 == 0) goto L1ec
            r6 = 1
            goto L1ed
        L1ec:
            r6 = 0
        L1ed:
            r5.zzaD(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r6 = 39
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzar(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r6 = 36
            java.lang.String r6 = r4.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzaC(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r6 = 30
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzaE(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r6 = 31
            long r6 = r4.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzaB(r6)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzio r6 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzam r7 = r6.zzf()     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzgg r8 = com.google.android.gms.measurement.internal.zzgi.zzaV     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            boolean r7 = r7.zzx(r2, r8)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 == 0) goto L237
            r7 = 32
            int r7 = r4.getInt(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzT(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 35
            long r7 = r4.getLong(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzZ(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        L237:
            r7 = 33
            boolean r8 = r4.isNull(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r8 != 0) goto L247
            int r7 = r4.getInt(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 == 0) goto L247
            r7 = 1
            goto L248
        L247:
            r7 = 0
        L248:
            r5.zzaF(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r7 = 34
            boolean r8 = r4.isNull(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r8 == 0) goto L255
            r0 = r3
            goto L261
        L255:
            int r7 = r4.getInt(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 == 0) goto L25c
            goto L25d
        L25c:
            r0 = 0
        L25d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        L261:
            r5.zzaw(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r0 = 37
            int r0 = r4.getInt(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzak(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r0 = 38
            int r0 = r4.getInt(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzag(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r0 = 40
            boolean r7 = r4.isNull(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 == 0) goto L281
            java.lang.String r0 = ""
            goto L28b
        L281:
            java.lang.String r0 = r4.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            java.lang.String r0 = (java.lang.String) r0     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        L28b:
            r5.zzaz(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r0 = 41
            boolean r7 = r4.isNull(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 != 0) goto L2a1
            long r7 = r4.getLong(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzaG(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        L2a1:
            r0 = 42
            boolean r7 = r4.isNull(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 != 0) goto L2b4
            long r7 = r4.getLong(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzaH(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        L2b4:
            r0 = 43
            byte[] r0 = r4.getBlob(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzR(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzam r0 = r6.zzf()     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzgg r7 = com.google.android.gms.measurement.internal.zzgi.zzaP     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            boolean r0 = r0.zzx(r2, r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r0 == 0) goto L2d8
            r0 = 44
            boolean r7 = r4.isNull(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r7 != 0) goto L2d8
            int r0 = r4.getInt(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r5.zzaa(r0)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        L2d8:
            r5.zzO()     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            boolean r0 = r4.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            if (r0 == 0) goto L2f2
            com.google.android.gms.measurement.internal.zzhe r0 = r6.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zze()     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r52)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
            r0.zzb(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L2f6 java.lang.Throwable -> L315
        L2f2:
            r4.close()
            return r5
        L2f6:
            r0 = move-exception
            goto L2fc
        L2f8:
            r0 = move-exception
            goto L317
        L2fa:
            r0 = move-exception
            r4 = r3
        L2fc:
            com.google.android.gms.measurement.internal.zzio r5 = r1.zzu     // Catch: java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: java.lang.Throwable -> L315
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: java.lang.Throwable -> L315
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r52)     // Catch: java.lang.Throwable -> L315
            r5.zzc(r6, r2, r0)     // Catch: java.lang.Throwable -> L315
        L30f:
            if (r4 == 0) goto L314
            r4.close()
        L314:
            return r3
        L315:
            r0 = move-exception
            r3 = r4
        L317:
            if (r3 == 0) goto L31c
            r3.close()
        L31c:
            throw r0
    }

    public final com.google.android.gms.measurement.internal.zzai zzm(java.lang.String r31, java.lang.String r32) {
            r30 = this;
            r1 = r30
            r8 = r32
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r31)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r32)
            r30.zzg()
            r30.zzav()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.zzj()     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            java.lang.String r11 = "conditional_properties"
            java.lang.String r12 = "origin"
            java.lang.String r13 = "value"
            java.lang.String r14 = "active"
            java.lang.String r15 = "trigger_event_name"
            java.lang.String r16 = "trigger_timeout"
            java.lang.String r17 = "timed_out_event"
            java.lang.String r18 = "creation_timestamp"
            java.lang.String r19 = "triggered_event"
            java.lang.String r20 = "triggered_timestamp"
            java.lang.String r21 = "time_to_live"
            java.lang.String r22 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            r2 = 0
            r14[r2] = r31     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            r3 = 1
            r14[r3] = r8     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lf4 android.database.sqlite.SQLiteException -> Lf6
            boolean r4 = r10.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            if (r4 != 0) goto L4d
            goto L113
        L4d:
            java.lang.String r4 = r10.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            if (r4 != 0) goto L55
            java.lang.String r4 = ""
        L55:
            r17 = r4
            java.lang.Object r6 = r1.zzz(r10, r3)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            int r0 = r10.getInt(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            if (r0 == 0) goto L64
            r21 = 1
            goto L66
        L64:
            r21 = 0
        L66:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzpv r0 = r1.zzg     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzqa r2 = r0.zzA()     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r3 = 5
            byte[] r3 = r10.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbh> r4 = com.google.android.gms.measurement.internal.zzbh.CREATOR     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            android.os.Parcelable r2 = r2.zzi(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r23 = r2
            com.google.android.gms.measurement.internal.zzbh r23 = (com.google.android.gms.measurement.internal.zzbh) r23     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r2 = 6
            long r19 = r10.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzqa r2 = r0.zzA()     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r3 = 7
            byte[] r3 = r10.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            android.os.Parcelable r2 = r2.zzi(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r26 = r2
            com.google.android.gms.measurement.internal.zzbh r26 = (com.google.android.gms.measurement.internal.zzbh) r26     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r2 = 8
            long r11 = r10.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r2 = 9
            long r27 = r10.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzqa r0 = r0.zzA()     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            android.os.Parcelable r0 = r0.zzi(r2, r4)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r29 = r0
            com.google.android.gms.measurement.internal.zzbh r29 = (com.google.android.gms.measurement.internal.zzbh) r29     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzqb r18 = new com.google.android.gms.measurement.internal.zzqb     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r2 = r18
            r3 = r32
            r4 = r11
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzai r0 = new com.google.android.gms.measurement.internal.zzai     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            boolean r2 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            if (r2 == 0) goto Lee
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzhe r3 = r2.zzaW()     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            java.lang.String r4 = "Got multiple records for conditional property, expected one"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r31)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzgx r2 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            java.lang.String r2 = r2.zzf(r8)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
            r3.zzc(r4, r5, r2)     // Catch: android.database.sqlite.SQLiteException -> Lf2 java.lang.Throwable -> L119
        Lee:
            r10.close()
            return r0
        Lf2:
            r0 = move-exception
            goto Lf8
        Lf4:
            r0 = move-exception
            goto L11b
        Lf6:
            r0 = move-exception
            r10 = r9
        Lf8:
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzhe r3 = r2.zzaW()     // Catch: java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L119
            java.lang.String r4 = "Error querying conditional property"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r31)     // Catch: java.lang.Throwable -> L119
            com.google.android.gms.measurement.internal.zzgx r2 = r2.zzj()     // Catch: java.lang.Throwable -> L119
            java.lang.String r2 = r2.zzf(r8)     // Catch: java.lang.Throwable -> L119
            r3.zzd(r4, r5, r2, r0)     // Catch: java.lang.Throwable -> L119
        L113:
            if (r10 == 0) goto L118
            r10.close()
        L118:
            return r9
        L119:
            r0 = move-exception
            r9 = r10
        L11b:
            if (r9 == 0) goto L120
            r9.close()
        L120:
            throw r0
    }

    public final com.google.android.gms.measurement.internal.zzar zzn(java.lang.String r12) {
            r11 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            r11.zzg()
            r11.zzav()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.zzj()     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteException -> L66
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteException -> L66
            java.lang.String r4 = "app_id=?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteException -> L66
            r10 = 0
            r5[r10] = r12     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteException -> L66
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L64 android.database.sqlite.SQLiteException -> L66
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
            if (r2 != 0) goto L30
            goto L7c
        L30:
            byte[] r2 = r1.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
            java.lang.String r3 = r1.getString(r9)     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
            boolean r5 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
            if (r5 == 0) goto L56
            com.google.android.gms.measurement.internal.zzio r5 = r11.zzu     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r12)     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
            r5.zzb(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
        L56:
            if (r2 != 0) goto L59
            goto L7c
        L59:
            com.google.android.gms.measurement.internal.zzar r5 = new com.google.android.gms.measurement.internal.zzar     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
            r5.<init>(r2, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L62 java.lang.Throwable -> L82
            r1.close()
            return r5
        L62:
            r2 = move-exception
            goto L69
        L64:
            r12 = move-exception
            goto L84
        L66:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L69:
            com.google.android.gms.measurement.internal.zzio r3 = r11.zzu     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzhe.zzn(r12)     // Catch: java.lang.Throwable -> L82
            r3.zzc(r4, r12, r2)     // Catch: java.lang.Throwable -> L82
        L7c:
            if (r1 == 0) goto L81
            r1.close()
        L81:
            return r0
        L82:
            r12 = move-exception
            r0 = r1
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r12
    }

    public final com.google.android.gms.measurement.internal.zzas zzo(long r14, java.lang.String r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23) {
            r13 = this;
            r4 = 1
            r6 = 0
            r7 = 0
            r9 = 0
            r0 = r13
            r1 = r14
            r3 = r16
            r8 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            com.google.android.gms.measurement.internal.zzas r0 = r0.zzp(r1, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzas zzp(long r24, java.lang.String r26, long r27, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35) {
            r23 = this;
            r1 = r23
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r26)
            r23.zzg()
            r23.zzav()
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r3 = 0
            r2[r3] = r26
            com.google.android.gms.measurement.internal.zzas r4 = new com.google.android.gms.measurement.internal.zzas
            r4.<init>()
            r5 = 0
            android.database.sqlite.SQLiteDatabase r14 = r23.zzj()     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r7 = "apps"
            java.lang.String r15 = "day"
            java.lang.String r16 = "daily_events_count"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_conversions_count"
            java.lang.String r19 = "daily_error_events_count"
            java.lang.String r20 = "daily_realtime_events_count"
            java.lang.String r21 = "daily_realtime_dcu_count"
            java.lang.String r22 = "daily_registered_triggers_count"
            java.lang.String[] r8 = new java.lang.String[]{r15, r16, r17, r18, r19, r20, r21, r22}     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r9 = "app_id=?"
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r10[r3] = r26     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r14
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            if (r6 != 0) goto L5a
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r2 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r26)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0.zzb(r2, r3)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            goto L143
        L5a:
            long r6 = r5.getLong(r3)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            int r3 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            if (r3 != 0) goto L92
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r4.zzb = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0 = 2
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r4.zza = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0 = 3
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r4.zzc = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0 = 4
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r4.zzd = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0 = 5
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r4.zze = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0 = 6
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r4.zzf = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0 = 7
            long r6 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r4.zzg = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
        L92:
            if (r29 == 0) goto L9a
            long r6 = r4.zzb     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            long r6 = r6 + r27
            r4.zzb = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
        L9a:
            if (r30 == 0) goto La2
            long r6 = r4.zza     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            long r6 = r6 + r27
            r4.zza = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
        La2:
            if (r31 == 0) goto Laa
            long r6 = r4.zzc     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            long r6 = r6 + r27
            r4.zzc = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
        Laa:
            if (r32 == 0) goto Lb2
            long r6 = r4.zzd     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            long r6 = r6 + r27
            r4.zzd = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
        Lb2:
            if (r33 == 0) goto Lba
            long r6 = r4.zze     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            long r6 = r6 + r27
            r4.zze = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
        Lba:
            if (r34 == 0) goto Lc2
            long r6 = r4.zzf     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            long r6 = r6 + r27
            r4.zzf = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
        Lc2:
            if (r35 == 0) goto Lca
            long r6 = r4.zzg     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            long r6 = r6 + r27
            r4.zzg = r6     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
        Lca:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0.<init>()     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r3 = "day"
            java.lang.Long r6 = java.lang.Long.valueOf(r24)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r3 = "daily_public_events_count"
            long r6 = r4.zza     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r3 = "daily_events_count"
            long r6 = r4.zzb     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r3 = "daily_conversions_count"
            long r6 = r4.zzc     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r3 = "daily_error_events_count"
            long r6 = r4.zzd     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r3 = "daily_realtime_events_count"
            long r6 = r4.zze     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r3 = "daily_realtime_dcu_count"
            long r6 = r4.zzf     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r3 = "daily_registered_triggers_count"
            long r6 = r4.zzg     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            java.lang.String r3 = "apps"
            java.lang.String r6 = "app_id=?"
            r14.update(r3, r0, r6, r2)     // Catch: java.lang.Throwable -> L12d android.database.sqlite.SQLiteException -> L12f
            goto L143
        L12d:
            r0 = move-exception
            goto L149
        L12f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> L12d
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L12d
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L12d
            java.lang.String r3 = "Error updating daily counts. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzhe.zzn(r26)     // Catch: java.lang.Throwable -> L12d
            r2.zzc(r3, r6, r0)     // Catch: java.lang.Throwable -> L12d
        L143:
            if (r5 == 0) goto L148
            r5.close()
        L148:
            return r4
        L149:
            if (r5 == 0) goto L14e
            r5.close()
        L14e:
            throw r0
    }

    public final com.google.android.gms.measurement.internal.zzba zzq(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            r2.zzg()
            r2.zzav()
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "select dma_consent_settings from consent_settings where app_id=? limit 1;"
            java.lang.String r1 = ""
            java.lang.String r3 = r2.zzaD(r3, r0, r1)
            com.google.android.gms.measurement.internal.zzba r3 = com.google.android.gms.measurement.internal.zzba.zze(r3)
            return r3
    }

    final com.google.android.gms.measurement.internal.zzbd zzr(java.lang.String r24, com.google.android.gms.internal.measurement.zzhm r25, java.lang.String r26) {
            r23 = this;
            r0 = r23
            java.lang.String r1 = r25.zzh()
            java.lang.String r2 = "events"
            r4 = r24
            com.google.android.gms.measurement.internal.zzbd r1 = r0.zzaA(r2, r4, r1)
            if (r1 != 0) goto L4e
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r24)
            com.google.android.gms.measurement.internal.zzgx r1 = r1.zzj()
            r5 = r26
            java.lang.String r1 = r1.zzd(r5)
            java.lang.String r5 = "Event aggregate wasn't created during raw event logging. appId, event"
            r2.zzc(r5, r3, r1)
            com.google.android.gms.measurement.internal.zzbd r1 = new com.google.android.gms.measurement.internal.zzbd
            r3 = r1
            java.lang.String r5 = r25.zzh()
            r6 = 1
            r8 = 1
            r10 = 1
            long r12 = r25.zzd()
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r4 = r24
            r3.<init>(r4, r5, r6, r8, r10, r12, r14, r16, r17, r18, r19)
            goto L7e
        L4e:
            long r2 = r1.zze
            r4 = 1
            long r13 = r2 + r4
            long r2 = r1.zzd
            long r11 = r2 + r4
            long r2 = r1.zzc
            long r9 = r2 + r4
            com.google.android.gms.measurement.internal.zzbd r2 = new com.google.android.gms.measurement.internal.zzbd
            r6 = r2
            java.lang.String r7 = r1.zza
            java.lang.String r8 = r1.zzb
            long r3 = r1.zzf
            r15 = r3
            long r3 = r1.zzg
            r17 = r3
            java.lang.Long r3 = r1.zzh
            r19 = r3
            java.lang.Long r3 = r1.zzi
            r20 = r3
            java.lang.Long r3 = r1.zzj
            r21 = r3
            java.lang.Boolean r1 = r1.zzk
            r22 = r1
            r6.<init>(r7, r8, r9, r11, r13, r15, r17, r19, r20, r21, r22)
            r1 = r2
        L7e:
            return r1
    }

    public final com.google.android.gms.measurement.internal.zzbd zzs(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "events"
            com.google.android.gms.measurement.internal.zzbd r2 = r1.zzaA(r0, r2, r3)
            return r2
    }

    public final com.google.android.gms.measurement.internal.zzjx zzt(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            r2.zzg()
            r2.zzav()
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "select storage_consent_at_bundling from consent_settings where app_id=? limit 1;"
            java.lang.String r1 = ""
            java.lang.String r3 = r2.zzaD(r3, r0, r1)
            r0 = 100
            com.google.android.gms.measurement.internal.zzjx r3 = com.google.android.gms.measurement.internal.zzjx.zzk(r3, r0)
            return r3
    }

    public final com.google.android.gms.measurement.internal.zzjx zzu(java.lang.String r6) {
            r5 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            r5.zzg()
            r5.zzav()
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r1[r2] = r6
            java.lang.String r6 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r5.zzj()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r6 = r4.rawQuery(r6, r1)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L42
            boolean r1 = r6.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3d java.lang.Throwable -> L5f
            if (r1 != 0) goto L30
            com.google.android.gms.measurement.internal.zzio r0 = r5.zzu     // Catch: android.database.sqlite.SQLiteException -> L3d java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L3d java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()     // Catch: android.database.sqlite.SQLiteException -> L3d java.lang.Throwable -> L5f
            java.lang.String r1 = "No data found"
            r0.zza(r1)     // Catch: android.database.sqlite.SQLiteException -> L3d java.lang.Throwable -> L5f
            goto L56
        L30:
            java.lang.String r1 = r6.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L3d java.lang.Throwable -> L5f
            int r0 = r6.getInt(r0)     // Catch: android.database.sqlite.SQLiteException -> L3d java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzjx r3 = com.google.android.gms.measurement.internal.zzjx.zzk(r1, r0)     // Catch: android.database.sqlite.SQLiteException -> L3d java.lang.Throwable -> L5f
            goto L56
        L3d:
            r0 = move-exception
            goto L45
        L3f:
            r6 = move-exception
            r0 = r6
            goto L61
        L42:
            r6 = move-exception
            r0 = r6
            r6 = r3
        L45:
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = "Error querying database."
            r1.zzb(r2, r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L59
        L56:
            r6.close()
        L59:
            if (r3 != 0) goto L5e
            com.google.android.gms.measurement.internal.zzjx r6 = com.google.android.gms.measurement.internal.zzjx.zza
            return r6
        L5e:
            return r3
        L5f:
            r0 = move-exception
            r3 = r6
        L61:
            if (r3 == 0) goto L66
            r3.close()
        L66:
            throw r0
    }

    public final com.google.android.gms.measurement.internal.zzpz zzw(java.lang.String r27) {
            r26 = this;
            r14 = r26
            r15 = r27
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r27)
            r26.zzg()
            r26.zzav()
            com.google.android.gms.measurement.internal.zzio r0 = r14.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzaM
            r12 = 0
            boolean r1 = r1.zzx(r12, r2)
            if (r1 == 0) goto L118
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzaP
            boolean r0 = r0.zzx(r12, r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L46
            com.google.android.gms.measurement.internal.zzmf[] r0 = new com.google.android.gms.measurement.internal.zzmf[r1]
            com.google.android.gms.measurement.internal.zzmf r3 = com.google.android.gms.measurement.internal.zzmf.zzb
            r0[r2] = r3
            com.google.android.gms.measurement.internal.zzpc r0 = com.google.android.gms.measurement.internal.zzpc.zza(r0)
            java.util.List r0 = r14.zzD(r15, r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3f
            return r12
        L3f:
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.measurement.internal.zzpz r0 = (com.google.android.gms.measurement.internal.zzpz) r0
            return r0
        L46:
            android.database.sqlite.SQLiteDatabase r3 = r26.zzj()     // Catch: java.lang.Throwable -> Lea android.database.sqlite.SQLiteException -> Lf2
            java.lang.String r4 = "upload_queue"
            java.lang.String r16 = "rowId"
            java.lang.String r17 = "app_id"
            java.lang.String r18 = "measurement_batch"
            java.lang.String r19 = "upload_uri"
            java.lang.String r20 = "upload_headers"
            java.lang.String r21 = "upload_type"
            java.lang.String r22 = "retry_count"
            java.lang.String r23 = "creation_timestamp"
            java.lang.String r24 = "associated_row_id"
            java.lang.String r25 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}     // Catch: java.lang.Throwable -> Lea android.database.sqlite.SQLiteException -> Lf2
            java.lang.String r0 = r26.zzaC()     // Catch: java.lang.Throwable -> Lea android.database.sqlite.SQLiteException -> Lf2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea android.database.sqlite.SQLiteException -> Lf2
            r6.<init>()     // Catch: java.lang.Throwable -> Lea android.database.sqlite.SQLiteException -> Lf2
            java.lang.String r7 = "app_id=? AND NOT "
            r6.append(r7)     // Catch: java.lang.Throwable -> Lea android.database.sqlite.SQLiteException -> Lf2
            r6.append(r0)     // Catch: java.lang.Throwable -> Lea android.database.sqlite.SQLiteException -> Lf2
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lea android.database.sqlite.SQLiteException -> Lf2
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Lea android.database.sqlite.SQLiteException -> Lf2
            r7[r2] = r15     // Catch: java.lang.Throwable -> Lea android.database.sqlite.SQLiteException -> Lf2
            r8 = 0
            r9 = 0
            java.lang.String r10 = "creation_timestamp ASC"
            java.lang.String r11 = "1"
            android.database.Cursor r13 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lea android.database.sqlite.SQLiteException -> Lf2
            boolean r0 = r13.moveToFirst()     // Catch: java.lang.Throwable -> Ld8 android.database.sqlite.SQLiteException -> Le0
            if (r0 != 0) goto L92
            r20 = r12
            r1 = r14
            goto L10b
        L92:
            long r3 = r13.getLong(r2)     // Catch: java.lang.Throwable -> Ld8 android.database.sqlite.SQLiteException -> Le0
            r0 = 2
            byte[] r5 = r13.getBlob(r0)     // Catch: java.lang.Throwable -> Ld8 android.database.sqlite.SQLiteException -> Le0
            r0 = 3
            java.lang.String r6 = r13.getString(r0)     // Catch: java.lang.Throwable -> Ld8 android.database.sqlite.SQLiteException -> Le0
            r0 = 4
            java.lang.String r7 = r13.getString(r0)     // Catch: java.lang.Throwable -> Ld8 android.database.sqlite.SQLiteException -> Le0
            r0 = 5
            int r8 = r13.getInt(r0)     // Catch: java.lang.Throwable -> Ld8 android.database.sqlite.SQLiteException -> Le0
            r0 = 6
            int r9 = r13.getInt(r0)     // Catch: java.lang.Throwable -> Ld8 android.database.sqlite.SQLiteException -> Le0
            r0 = 7
            long r10 = r13.getLong(r0)     // Catch: java.lang.Throwable -> Ld8 android.database.sqlite.SQLiteException -> Le0
            r0 = 8
            long r16 = r13.getLong(r0)     // Catch: java.lang.Throwable -> Ld8 android.database.sqlite.SQLiteException -> Le0
            r0 = 9
            long r18 = r13.getLong(r0)     // Catch: java.lang.Throwable -> Ld8 android.database.sqlite.SQLiteException -> Le0
            r1 = r26
            r2 = r27
            r20 = r12
            r21 = r13
            r12 = r16
            r14 = r18
            com.google.android.gms.measurement.internal.zzpz r0 = r1.zzaB(r2, r3, r5, r6, r7, r8, r9, r10, r12, r14)     // Catch: java.lang.Throwable -> Ld4 android.database.sqlite.SQLiteException -> Ld6
            r21.close()
            return r0
        Ld4:
            r0 = move-exception
            goto Ldb
        Ld6:
            r0 = move-exception
            goto Le5
        Ld8:
            r0 = move-exception
            r21 = r13
        Ldb:
            r1 = r26
            r12 = r21
            goto L112
        Le0:
            r0 = move-exception
            r20 = r12
            r21 = r13
        Le5:
            r1 = r26
            r12 = r21
            goto Lf9
        Lea:
            r0 = move-exception
            r20 = r12
            r1 = r26
            r12 = r20
            goto L112
        Lf2:
            r0 = move-exception
            r20 = r12
            r1 = r26
            r12 = r20
        Lf9:
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> L111
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> L111
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> L111
            java.lang.String r3 = "Error to querying MeasurementBatch from upload_queue. appId"
            r4 = r27
            r2.zzc(r3, r4, r0)     // Catch: java.lang.Throwable -> L111
            r13 = r12
        L10b:
            if (r13 == 0) goto L110
            r13.close()
        L110:
            return r20
        L111:
            r0 = move-exception
        L112:
            if (r12 == 0) goto L117
            r12.close()
        L117:
            throw r0
        L118:
            r20 = r12
            r1 = r14
            return r20
    }

    public final com.google.android.gms.measurement.internal.zzpz zzx(long r22) {
            r21 = this;
            r14 = r21
            com.google.android.gms.measurement.internal.zzio r0 = r14.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzaP
            r15 = 0
            boolean r0 = r0.zzx(r15, r1)
            if (r0 != 0) goto L12
            return r15
        L12:
            r21.zzg()
            r21.zzav()
            android.database.sqlite.SQLiteDatabase r1 = r21.zzj()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lbd
            java.lang.String r2 = "upload_queue"
            java.lang.String r3 = "rowId"
            java.lang.String r4 = "app_id"
            java.lang.String r5 = "measurement_batch"
            java.lang.String r6 = "upload_uri"
            java.lang.String r7 = "upload_headers"
            java.lang.String r8 = "upload_type"
            java.lang.String r9 = "retry_count"
            java.lang.String r10 = "creation_timestamp"
            java.lang.String r11 = "associated_row_id"
            java.lang.String r12 = "last_upload_timestamp"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lbd
            java.lang.String r4 = "rowId=?"
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lbd
            r6 = 0
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lbd
            r5[r6] = r7     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lbd
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "1"
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lbd
            boolean r1 = r12.moveToFirst()     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            if (r1 != 0) goto L56
            r1 = r14
            r16 = r15
            goto Ld8
        L56:
            java.lang.String r0 = r12.getString(r0)     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            r0 = 2
            byte[] r5 = r12.getBlob(r0)     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            r0 = 3
            java.lang.String r6 = r12.getString(r0)     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            r0 = 4
            java.lang.String r7 = r12.getString(r0)     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            r0 = 5
            int r8 = r12.getInt(r0)     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            r0 = 6
            int r9 = r12.getInt(r0)     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            r0 = 7
            long r10 = r12.getLong(r0)     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            r0 = 8
            long r16 = r12.getLong(r0)     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            r0 = 9
            long r18 = r12.getLong(r0)     // Catch: java.lang.Throwable -> La3 android.database.sqlite.SQLiteException -> Lab
            r1 = r21
            r3 = r22
            r20 = r12
            r12 = r16
            r16 = r15
            r14 = r18
            com.google.android.gms.measurement.internal.zzpz r0 = r1.zzaB(r2, r3, r5, r6, r7, r8, r9, r10, r12, r14)     // Catch: java.lang.Throwable -> L9f android.database.sqlite.SQLiteException -> La1
            r20.close()
            return r0
        L9f:
            r0 = move-exception
            goto La6
        La1:
            r0 = move-exception
            goto Lb0
        La3:
            r0 = move-exception
            r20 = r12
        La6:
            r1 = r21
            r15 = r20
            goto Ldf
        Lab:
            r0 = move-exception
            r20 = r12
            r16 = r15
        Lb0:
            r1 = r21
            r15 = r20
            goto Lc4
        Lb5:
            r0 = move-exception
            r16 = r15
            r1 = r21
            r15 = r16
            goto Ldf
        Lbd:
            r0 = move-exception
            r16 = r15
            r1 = r21
            r15 = r16
        Lc4:
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> Lde
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: java.lang.Throwable -> Lde
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r3 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r4 = java.lang.Long.valueOf(r22)     // Catch: java.lang.Throwable -> Lde
            r2.zzc(r3, r4, r0)     // Catch: java.lang.Throwable -> Lde
            r12 = r15
        Ld8:
            if (r12 == 0) goto Ldd
            r12.close()
        Ldd:
            return r16
        Lde:
            r0 = move-exception
        Ldf:
            if (r15 == 0) goto Le4
            r15.close()
        Le4:
            throw r0
    }

    public final com.google.android.gms.measurement.internal.zzqd zzy(java.lang.String r20, java.lang.String r21) {
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r21)
            r19.zzg()
            r19.zzav()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.zzj()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r12 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            java.lang.String r14 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L77
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
            if (r4 != 0) goto L3d
            goto L94
        L3d:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
            java.lang.Object r8 = r1.zzz(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
            if (r8 != 0) goto L48
            goto L94
        L48:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
            com.google.android.gms.measurement.internal.zzqd r0 = new com.google.android.gms.measurement.internal.zzqd     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
            if (r2 == 0) goto L6f
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zze()     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r20)     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
            r2.zzb(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L73 java.lang.Throwable -> L9a
        L6f:
            r11.close()
            return r0
        L73:
            r0 = move-exception
            goto L79
        L75:
            r0 = move-exception
            goto L9c
        L77:
            r0 = move-exception
            r11 = r10
        L79:
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.measurement.internal.zzhe r3 = r2.zzaW()     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r20)     // Catch: java.lang.Throwable -> L9a
            com.google.android.gms.measurement.internal.zzgx r2 = r2.zzj()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = r2.zzf(r9)     // Catch: java.lang.Throwable -> L9a
            r3.zzd(r4, r5, r2, r0)     // Catch: java.lang.Throwable -> L9a
        L94:
            if (r11 == 0) goto L99
            r11.close()
        L99:
            return r10
        L9a:
            r0 = move-exception
            r10 = r11
        L9c:
            if (r10 == 0) goto La1
            r10.close()
        La1:
            throw r0
    }

    final java.lang.Object zzz(android.database.Cursor r4, int r5) {
            r3 = this;
            int r0 = r4.getType(r5)
            r1 = 0
            if (r0 == 0) goto L4e
            r2 = 1
            if (r0 == r2) goto L45
            r2 = 2
            if (r0 == r2) goto L3c
            r2 = 3
            if (r0 == r2) goto L37
            r4 = 4
            if (r0 == r4) goto L27
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "Loaded invalid unknown value type, ignoring it"
            r4.zzb(r0, r5)
            return r1
        L27:
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            java.lang.String r5 = "Loaded invalid blob type value, ignoring it"
            r4.zza(r5)
            return r1
        L37:
            java.lang.String r4 = r4.getString(r5)
            return r4
        L3c:
            double r4 = r4.getDouble(r5)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        L45:
            long r4 = r4.getLong(r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L4e:
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            java.lang.String r5 = "Loaded invalid null value from database"
            r4.zza(r5)
            return r1
    }
}
