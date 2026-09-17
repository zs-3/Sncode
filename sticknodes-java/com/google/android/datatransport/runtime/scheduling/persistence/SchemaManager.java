package com.google.android.datatransport.runtime.scheduling.persistence;

/* loaded from: classes.dex */
final class SchemaManager extends android.database.sqlite.SQLiteOpenHelper {
    private static final java.lang.String CREATE_CONTEXTS_SQL_V1 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";
    private static final java.lang.String CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
    private static final java.lang.String CREATE_EVENTS_SQL_V1 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";
    private static final java.lang.String CREATE_EVENT_BACKEND_INDEX_V1 = "CREATE INDEX events_backend_id on events(context_id)";
    private static final java.lang.String CREATE_EVENT_METADATA_SQL_V1 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";
    private static final java.lang.String CREATE_GLOBAL_LOG_EVENT_STATE_TABLE = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";
    private static final java.lang.String CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL = null;
    private static final java.lang.String CREATE_LOG_EVENT_DROPPED_TABLE = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";
    private static final java.lang.String CREATE_PAYLOADS_TABLE_V4 = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
    static final java.lang.String DB_NAME = "com.google.android.datatransport.events";
    private static final java.lang.String DROP_CONTEXTS_SQL = "DROP TABLE transport_contexts";
    private static final java.lang.String DROP_EVENTS_SQL = "DROP TABLE events";
    private static final java.lang.String DROP_EVENT_METADATA_SQL = "DROP TABLE event_metadata";
    private static final java.lang.String DROP_GLOBAL_LOG_EVENT_STATE_SQL = "DROP TABLE IF EXISTS global_log_event_state";
    private static final java.lang.String DROP_LOG_EVENT_DROPPED_SQL = "DROP TABLE IF EXISTS log_event_dropped";
    private static final java.lang.String DROP_PAYLOADS_SQL = "DROP TABLE IF EXISTS event_payloads";
    private static final java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration> INCREMENTAL_MIGRATIONS = null;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V1 = null;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V2 = null;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V3 = null;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V4 = null;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V6 = null;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V7 = null;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATION_TO_V5 = null;
    static int SCHEMA_VERSION;
    private boolean configured;
    private final int schemaVersion;

    public interface Migration {
        void upgrade(android.database.sqlite.SQLiteDatabase r1);
    }

    public static /* synthetic */ void $r8$lambda$EvhGxWlmpBVfuj3rXGCdvtKejmA(android.database.sqlite.SQLiteDatabase r0) {
            lambda$static$1(r0)
            return
    }

    /* renamed from: $r8$lambda$PqzYzlQN6BDPO-DF7eZZzbtnVmw, reason: not valid java name */
    public static /* synthetic */ void m33$r8$lambda$PqzYzlQN6BDPODF7eZZzbtnVmw(android.database.sqlite.SQLiteDatabase r0) {
            lambda$static$5(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$XH3bHEgPsw1uBZYVhTMum4Uai4g(android.database.sqlite.SQLiteDatabase r0) {
            lambda$static$2(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$aCl09xQlxj4356RjJu1WvPyjB4o(android.database.sqlite.SQLiteDatabase r0) {
            lambda$static$3(r0)
            return
    }

    /* renamed from: $r8$lambda$nhFFioRqpd7jp6fFHA2EofZ5-bk, reason: not valid java name */
    public static /* synthetic */ void m34$r8$lambda$nhFFioRqpd7jp6fFHA2EofZ5bk(android.database.sqlite.SQLiteDatabase r0) {
            lambda$static$0(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$rGcUdOceFhSffkhz_AHgqHOrsTQ(android.database.sqlite.SQLiteDatabase r0) {
            lambda$static$4(r0)
            return
    }

    /* renamed from: $r8$lambda$ruvJ0agcdlJuVWPvls78Z-MPY8c, reason: not valid java name */
    public static /* synthetic */ void m35$r8$lambda$ruvJ0agcdlJuVWPvls78ZMPY8c(android.database.sqlite.SQLiteDatabase r0) {
            lambda$static$6(r0)
            return
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "INSERT INTO global_log_event_state VALUES ("
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL = r0
            r0 = 7
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.SCHEMA_VERSION = r0
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda4 r1 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda4.INSTANCE
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.MIGRATE_TO_V1 = r1
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda0 r2 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda0.INSTANCE
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.MIGRATE_TO_V2 = r2
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda2 r3 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda2.INSTANCE
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.MIGRATE_TO_V3 = r3
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda3 r4 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda3.INSTANCE
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.MIGRATE_TO_V4 = r4
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda5 r5 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda5.INSTANCE
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.MIGRATION_TO_V5 = r5
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda1 r6 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda1.INSTANCE
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.MIGRATE_TO_V6 = r6
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda6 r7 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$ExternalSyntheticLambda6.INSTANCE
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.MIGRATE_TO_V7 = r7
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration[] r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration[r0]
            r8 = 0
            r0[r8] = r1
            r1 = 1
            r0[r1] = r2
            r1 = 2
            r0[r1] = r3
            r1 = 3
            r0[r1] = r4
            r1 = 4
            r0[r1] = r5
            r1 = 5
            r0[r1] = r6
            r1 = 6
            r0[r1] = r7
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.INCREMENTAL_MIGRATIONS = r0
            return
    }

    SchemaManager(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            r2 = 0
            r1.configured = r2
            r1.schemaVersion = r4
            return
    }

    private void ensureConfigured(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            boolean r0 = r1.configured
            if (r0 != 0) goto L7
            r1.onConfigure(r2)
        L7:
            return
    }

    private static /* synthetic */ void lambda$static$0(android.database.sqlite.SQLiteDatabase r1) {
            java.lang.String r0 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX events_backend_id on events(context_id)"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)"
            r1.execSQL(r0)
            return
    }

    private static /* synthetic */ void lambda$static$1(android.database.sqlite.SQLiteDatabase r1) {
            java.lang.String r0 = "ALTER TABLE transport_contexts ADD COLUMN extras BLOB"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)"
            r1.execSQL(r0)
            java.lang.String r0 = "DROP INDEX contexts_backend_priority"
            r1.execSQL(r0)
            return
    }

    private static /* synthetic */ void lambda$static$2(android.database.sqlite.SQLiteDatabase r1) {
            java.lang.String r0 = "ALTER TABLE events ADD COLUMN payload_encoding TEXT"
            r1.execSQL(r0)
            return
    }

    private static /* synthetic */ void lambda$static$3(android.database.sqlite.SQLiteDatabase r1) {
            java.lang.String r0 = "ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1"
            r1.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS event_payloads"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))"
            r1.execSQL(r0)
            return
    }

    private static /* synthetic */ void lambda$static$4(android.database.sqlite.SQLiteDatabase r1) {
            java.lang.String r0 = "DROP TABLE IF EXISTS log_event_dropped"
            r1.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS global_log_event_state"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))"
            r1.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)"
            r1.execSQL(r0)
            java.lang.String r0 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL
            r1.execSQL(r0)
            return
    }

    private static /* synthetic */ void lambda$static$5(android.database.sqlite.SQLiteDatabase r1) {
            java.lang.String r0 = "ALTER TABLE events ADD COLUMN product_id INTEGER"
            r1.execSQL(r0)
            return
    }

    private static /* synthetic */ void lambda$static$6(android.database.sqlite.SQLiteDatabase r1) {
            java.lang.String r0 = "ALTER TABLE events ADD COLUMN pseudonymous_id TEXT"
            r1.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB"
            r1.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB"
            r1.execSQL(r0)
            return
    }

    private void onCreate(android.database.sqlite.SQLiteDatabase r2, int r3) {
            r1 = this;
            r1.ensureConfigured(r2)
            r0 = 0
            r1.upgrade(r2, r0, r3)
            return
    }

    private void upgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
            r3 = this;
            java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration> r0 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.INCREMENTAL_MIGRATIONS
            int r1 = r0.size()
            if (r6 > r1) goto L19
        L8:
            if (r5 >= r6) goto L18
            java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration> r0 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.INCREMENTAL_MIGRATIONS
            java.lang.Object r0 = r0.get(r5)
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration r0 = (com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration) r0
            r0.upgrade(r4)
            int r5 = r5 + 1
            goto L8
        L18:
            return
        L19:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Migration from "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " to "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = " was requested, but cannot be performed. Only "
            r1.append(r5)
            int r5 = r0.size()
            r1.append(r5)
            java.lang.String r5 = " migrations are provided"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(android.database.sqlite.SQLiteDatabase r4) {
            r3 = this;
            r0 = 1
            r3.configured = r0
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "PRAGMA busy_timeout=0;"
            android.database.Cursor r1 = r4.rawQuery(r2, r1)
            r1.close()
            r4.setForeignKeyConstraintsEnabled(r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            int r0 = r1.schemaVersion
            r1.onCreate(r2, r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = "DROP TABLE events"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE event_metadata"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE transport_contexts"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE IF EXISTS event_payloads"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE IF EXISTS log_event_dropped"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE IF EXISTS global_log_event_state"
            r1.execSQL(r2)
            r0.onCreate(r1, r3)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.ensureConfigured(r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            r0.ensureConfigured(r1)
            r0.upgrade(r1, r2, r3)
            return
    }
}
