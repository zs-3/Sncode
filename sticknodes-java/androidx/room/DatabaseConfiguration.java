package androidx.room;

/* loaded from: classes.dex */
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final java.util.List<androidx.room.RoomDatabase.Callback> callbacks;
    public final android.content.Context context;
    public final java.lang.String copyFromAssetPath;
    public final java.io.File copyFromFile;
    public final androidx.room.RoomDatabase.JournalMode journalMode;
    private final java.util.Set<java.lang.Integer> mMigrationNotRequiredFrom;
    public final androidx.room.RoomDatabase.MigrationContainer migrationContainer;
    public final boolean multiInstanceInvalidation;
    public final java.lang.String name;
    public final java.util.concurrent.Executor queryExecutor;
    public final boolean requireMigration;
    public final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
    public final java.util.concurrent.Executor transactionExecutor;

    public DatabaseConfiguration(android.content.Context r1, java.lang.String r2, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r3, androidx.room.RoomDatabase.MigrationContainer r4, java.util.List<androidx.room.RoomDatabase.Callback> r5, boolean r6, androidx.room.RoomDatabase.JournalMode r7, java.util.concurrent.Executor r8, java.util.concurrent.Executor r9, boolean r10, boolean r11, boolean r12, java.util.Set<java.lang.Integer> r13, java.lang.String r14, java.io.File r15) {
            r0 = this;
            r0.<init>()
            r0.sqliteOpenHelperFactory = r3
            r0.context = r1
            r0.name = r2
            r0.migrationContainer = r4
            r0.callbacks = r5
            r0.allowMainThreadQueries = r6
            r0.journalMode = r7
            r0.queryExecutor = r8
            r0.transactionExecutor = r9
            r0.multiInstanceInvalidation = r10
            r0.requireMigration = r11
            r0.allowDestructiveMigrationOnDowngrade = r12
            r0.mMigrationNotRequiredFrom = r13
            r0.copyFromAssetPath = r14
            r0.copyFromFile = r15
            return
    }

    public boolean isMigrationRequired(int r3, int r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            if (r3 <= r4) goto L6
            r4 = 1
            goto L7
        L6:
            r4 = 0
        L7:
            if (r4 == 0) goto Le
            boolean r4 = r2.allowDestructiveMigrationOnDowngrade
            if (r4 == 0) goto Le
            return r1
        Le:
            boolean r4 = r2.requireMigration
            if (r4 == 0) goto L21
            java.util.Set<java.lang.Integer> r4 = r2.mMigrationNotRequiredFrom
            if (r4 == 0) goto L22
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }
}
