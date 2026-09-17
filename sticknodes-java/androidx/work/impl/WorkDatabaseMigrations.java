package androidx.work.impl;

/* loaded from: classes.dex */
public class WorkDatabaseMigrations {
    public static androidx.room.migration.Migration MIGRATION_11_12;
    public static androidx.room.migration.Migration MIGRATION_1_2;
    public static androidx.room.migration.Migration MIGRATION_3_4;
    public static androidx.room.migration.Migration MIGRATION_4_5;
    public static androidx.room.migration.Migration MIGRATION_6_7;
    public static androidx.room.migration.Migration MIGRATION_7_8;
    public static androidx.room.migration.Migration MIGRATION_8_9;








    public static class RescheduleMigration extends androidx.room.migration.Migration {
        final android.content.Context mContext;

        public RescheduleMigration(android.content.Context r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.mContext = r1
                return
        }

        @Override // androidx.room.migration.Migration
        public void migrate(androidx.sqlite.db.SupportSQLiteDatabase r6) {
                r5 = this;
                int r0 = r5.endVersion
                java.lang.String r1 = "reschedule_needed"
                r2 = 0
                r3 = 1
                r4 = 10
                if (r0 < r4) goto L1b
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r2] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r3] = r1
                java.lang.String r1 = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)"
                r6.execSQL(r1, r0)
                goto L2e
            L1b:
                android.content.Context r6 = r5.mContext
                java.lang.String r0 = "androidx.work.util.preferences"
                android.content.SharedPreferences r6 = r6.getSharedPreferences(r0, r2)
                android.content.SharedPreferences$Editor r6 = r6.edit()
                android.content.SharedPreferences$Editor r6 = r6.putBoolean(r1, r3)
                r6.apply()
            L2e:
                return
        }
    }

    public static class WorkMigration9To10 extends androidx.room.migration.Migration {
        final android.content.Context mContext;

        public WorkMigration9To10(android.content.Context r3) {
                r2 = this;
                r0 = 9
                r1 = 10
                r2.<init>(r0, r1)
                r2.mContext = r3
                return
        }

        @Override // androidx.room.migration.Migration
        public void migrate(androidx.sqlite.db.SupportSQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))"
                r2.execSQL(r0)
                android.content.Context r0 = r1.mContext
                androidx.work.impl.utils.PreferenceUtils.migrateLegacyPreferences(r0, r2)
                android.content.Context r0 = r1.mContext
                androidx.work.impl.utils.IdGenerator.migrateLegacyIdGenerator(r0, r2)
                return
        }
    }

    static {
            androidx.work.impl.WorkDatabaseMigrations$1 r0 = new androidx.work.impl.WorkDatabaseMigrations$1
            r1 = 1
            r2 = 2
            r0.<init>(r1, r2)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_1_2 = r0
            androidx.work.impl.WorkDatabaseMigrations$2 r0 = new androidx.work.impl.WorkDatabaseMigrations$2
            r1 = 3
            r2 = 4
            r0.<init>(r1, r2)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_3_4 = r0
            androidx.work.impl.WorkDatabaseMigrations$3 r0 = new androidx.work.impl.WorkDatabaseMigrations$3
            r1 = 5
            r0.<init>(r2, r1)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_4_5 = r0
            androidx.work.impl.WorkDatabaseMigrations$4 r0 = new androidx.work.impl.WorkDatabaseMigrations$4
            r1 = 6
            r2 = 7
            r0.<init>(r1, r2)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_6_7 = r0
            androidx.work.impl.WorkDatabaseMigrations$5 r0 = new androidx.work.impl.WorkDatabaseMigrations$5
            r1 = 8
            r0.<init>(r2, r1)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_7_8 = r0
            androidx.work.impl.WorkDatabaseMigrations$6 r0 = new androidx.work.impl.WorkDatabaseMigrations$6
            r2 = 9
            r0.<init>(r1, r2)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_8_9 = r0
            androidx.work.impl.WorkDatabaseMigrations$7 r0 = new androidx.work.impl.WorkDatabaseMigrations$7
            r1 = 11
            r2 = 12
            r0.<init>(r1, r2)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_11_12 = r0
            return
    }
}
