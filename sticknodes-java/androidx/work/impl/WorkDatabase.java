package androidx.work.impl;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends androidx.room.RoomDatabase {
    private static final long PRUNE_THRESHOLD_MILLIS = 0;



    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r1 = 1
            long r0 = r0.toMillis(r1)
            androidx.work.impl.WorkDatabase.PRUNE_THRESHOLD_MILLIS = r0
            return
    }

    public WorkDatabase() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.work.impl.WorkDatabase create(android.content.Context r5, java.util.concurrent.Executor r6, boolean r7) {
            java.lang.Class<androidx.work.impl.WorkDatabase> r0 = androidx.work.impl.WorkDatabase.class
            if (r7 == 0) goto Ld
            androidx.room.RoomDatabase$Builder r7 = androidx.room.Room.inMemoryDatabaseBuilder(r5, r0)
            androidx.room.RoomDatabase$Builder r7 = r7.allowMainThreadQueries()
            goto L1d
        Ld:
            java.lang.String r7 = androidx.work.impl.WorkDatabasePathHelper.getWorkDatabaseName()
            androidx.room.RoomDatabase$Builder r7 = androidx.room.Room.databaseBuilder(r5, r0, r7)
            androidx.work.impl.WorkDatabase$1 r0 = new androidx.work.impl.WorkDatabase$1
            r0.<init>(r5)
            r7.openHelperFactory(r0)
        L1d:
            androidx.room.RoomDatabase$Builder r6 = r7.setQueryExecutor(r6)
            androidx.room.RoomDatabase$Callback r7 = generateCleanupCallback()
            androidx.room.RoomDatabase$Builder r6 = r6.addCallback(r7)
            r7 = 1
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r7]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_1_2
            r2 = 0
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r6 = r6.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r7]
            androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration r1 = new androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration
            r3 = 2
            r4 = 3
            r1.<init>(r5, r3, r4)
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r6 = r6.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r7]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_3_4
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r6 = r6.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r7]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_4_5
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r6 = r6.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r7]
            androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration r1 = new androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration
            r3 = 5
            r4 = 6
            r1.<init>(r5, r3, r4)
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r6 = r6.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r7]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_6_7
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r6 = r6.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r7]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_7_8
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r6 = r6.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r7]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_8_9
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r6 = r6.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r7]
            androidx.work.impl.WorkDatabaseMigrations$WorkMigration9To10 r1 = new androidx.work.impl.WorkDatabaseMigrations$WorkMigration9To10
            r1.<init>(r5)
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r6 = r6.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r7]
            androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration r1 = new androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration
            r3 = 10
            r4 = 11
            r1.<init>(r5, r3, r4)
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r5 = r6.addMigrations(r0)
            androidx.room.migration.Migration[] r6 = new androidx.room.migration.Migration[r7]
            androidx.room.migration.Migration r7 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_11_12
            r6[r2] = r7
            androidx.room.RoomDatabase$Builder r5 = r5.addMigrations(r6)
            androidx.room.RoomDatabase$Builder r5 = r5.fallbackToDestructiveMigration()
            androidx.room.RoomDatabase r5 = r5.build()
            androidx.work.impl.WorkDatabase r5 = (androidx.work.impl.WorkDatabase) r5
            return r5
    }

    static androidx.room.RoomDatabase.Callback generateCleanupCallback() {
            androidx.work.impl.WorkDatabase$2 r0 = new androidx.work.impl.WorkDatabase$2
            r0.<init>()
            return r0
    }

    static long getPruneDate() {
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = androidx.work.impl.WorkDatabase.PRUNE_THRESHOLD_MILLIS
            long r0 = r0 - r2
            return r0
    }

    static java.lang.String getPruneSQL() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < "
            r0.append(r1)
            long r1 = getPruneDate()
            r0.append(r1)
            java.lang.String r1 = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public abstract androidx.work.impl.model.DependencyDao dependencyDao();

    public abstract androidx.work.impl.model.PreferenceDao preferenceDao();

    public abstract androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao();

    public abstract androidx.work.impl.model.WorkNameDao workNameDao();

    public abstract androidx.work.impl.model.WorkProgressDao workProgressDao();

    public abstract androidx.work.impl.model.WorkSpecDao workSpecDao();

    public abstract androidx.work.impl.model.WorkTagDao workTagDao();
}
