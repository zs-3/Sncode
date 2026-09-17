package androidx.room;

/* loaded from: classes.dex */
public class RoomOpenHelper extends androidx.sqlite.db.SupportSQLiteOpenHelper.Callback {
    private androidx.room.DatabaseConfiguration mConfiguration;
    private final androidx.room.RoomOpenHelper.Delegate mDelegate;
    private final java.lang.String mIdentityHash;
    private final java.lang.String mLegacyHash;

    public static abstract class Delegate {
        public final int version;

        public Delegate(int r1) {
                r0 = this;
                r0.<init>()
                r0.version = r1
                return
        }

        protected abstract void createAllTables(androidx.sqlite.db.SupportSQLiteDatabase r1);

        protected abstract void dropAllTables(androidx.sqlite.db.SupportSQLiteDatabase r1);

        protected abstract void onCreate(androidx.sqlite.db.SupportSQLiteDatabase r1);

        protected abstract void onOpen(androidx.sqlite.db.SupportSQLiteDatabase r1);

        protected abstract void onPostMigrate(androidx.sqlite.db.SupportSQLiteDatabase r1);

        protected abstract void onPreMigrate(androidx.sqlite.db.SupportSQLiteDatabase r1);

        protected abstract androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(androidx.sqlite.db.SupportSQLiteDatabase r1);
    }

    public static class ValidationResult {
        public final java.lang.String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.isValid = r1
                r0.expectedFoundMsg = r2
                return
        }
    }

    public RoomOpenHelper(androidx.room.DatabaseConfiguration r2, androidx.room.RoomOpenHelper.Delegate r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            int r0 = r3.version
            r1.<init>(r0)
            r1.mConfiguration = r2
            r1.mDelegate = r3
            r1.mIdentityHash = r4
            r1.mLegacyHash = r5
            return
    }

    private void checkIdentity(androidx.sqlite.db.SupportSQLiteDatabase r4) {
            r3 = this;
            boolean r0 = hasRoomMasterTable(r4)
            if (r0 == 0) goto L3e
            r0 = 0
            androidx.sqlite.db.SimpleSQLiteQuery r1 = new androidx.sqlite.db.SimpleSQLiteQuery
            java.lang.String r2 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r2)
            android.database.Cursor r4 = r4.query(r1)
            boolean r1 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L1d
            r0 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Throwable -> L39
        L1d:
            r4.close()
            java.lang.String r4 = r3.mIdentityHash
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L50
            java.lang.String r4 = r3.mLegacyHash
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L31
            goto L50
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number."
            r4.<init>(r0)
            throw r4
        L39:
            r0 = move-exception
            r4.close()
            throw r0
        L3e:
            androidx.room.RoomOpenHelper$Delegate r0 = r3.mDelegate
            androidx.room.RoomOpenHelper$ValidationResult r0 = r0.onValidateSchema(r4)
            boolean r1 = r0.isValid
            if (r1 == 0) goto L51
            androidx.room.RoomOpenHelper$Delegate r0 = r3.mDelegate
            r0.onPostMigrate(r4)
            r3.updateIdentity(r4)
        L50:
            return
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.expectedFoundMsg
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
    }

    private void createMasterTableIfNotExists(androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r2.execSQL(r0)
            return
    }

    private static boolean hasEmptySchema(androidx.sqlite.db.SupportSQLiteDatabase r2) {
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r2 = r2.query(r0)
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L18
            r1 = 0
            if (r0 == 0) goto L14
            int r0 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L14
            r1 = 1
        L14:
            r2.close()
            return r1
        L18:
            r0 = move-exception
            r2.close()
            throw r0
    }

    private static boolean hasRoomMasterTable(androidx.sqlite.db.SupportSQLiteDatabase r2) {
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r2 = r2.query(r0)
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L18
            r1 = 0
            if (r0 == 0) goto L14
            int r0 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L14
            r1 = 1
        L14:
            r2.close()
            return r1
        L18:
            r0 = move-exception
            r2.close()
            throw r0
    }

    private void updateIdentity(androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            r1.createMasterTableIfNotExists(r2)
            java.lang.String r0 = r1.mIdentityHash
            java.lang.String r0 = androidx.room.RoomMasterTable.createInsertQuery(r0)
            r2.execSQL(r0)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(androidx.sqlite.db.SupportSQLiteDatabase r1) {
            r0 = this;
            super.onConfigure(r1)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(androidx.sqlite.db.SupportSQLiteDatabase r4) {
            r3 = this;
            boolean r0 = hasEmptySchema(r4)
            androidx.room.RoomOpenHelper$Delegate r1 = r3.mDelegate
            r1.createAllTables(r4)
            if (r0 != 0) goto L2f
            androidx.room.RoomOpenHelper$Delegate r0 = r3.mDelegate
            androidx.room.RoomOpenHelper$ValidationResult r0 = r0.onValidateSchema(r4)
            boolean r1 = r0.isValid
            if (r1 == 0) goto L16
            goto L2f
        L16:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.expectedFoundMsg
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L2f:
            r3.updateIdentity(r4)
            androidx.room.RoomOpenHelper$Delegate r0 = r3.mDelegate
            r0.onCreate(r4)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(androidx.sqlite.db.SupportSQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            r0.onUpgrade(r1, r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            super.onOpen(r2)
            r1.checkIdentity(r2)
            androidx.room.RoomOpenHelper$Delegate r0 = r1.mDelegate
            r0.onOpen(r2)
            r2 = 0
            r1.mConfiguration = r2
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(androidx.sqlite.db.SupportSQLiteDatabase r3, int r4, int r5) {
            r2 = this;
            androidx.room.DatabaseConfiguration r0 = r2.mConfiguration
            if (r0 == 0) goto L52
            androidx.room.RoomDatabase$MigrationContainer r0 = r0.migrationContainer
            java.util.List r0 = r0.findMigrationPath(r4, r5)
            if (r0 == 0) goto L52
            androidx.room.RoomOpenHelper$Delegate r1 = r2.mDelegate
            r1.onPreMigrate(r3)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            androidx.room.migration.Migration r1 = (androidx.room.migration.Migration) r1
            r1.migrate(r3)
            goto L15
        L25:
            androidx.room.RoomOpenHelper$Delegate r0 = r2.mDelegate
            androidx.room.RoomOpenHelper$ValidationResult r0 = r0.onValidateSchema(r3)
            boolean r1 = r0.isValid
            if (r1 == 0) goto L39
            androidx.room.RoomOpenHelper$Delegate r0 = r2.mDelegate
            r0.onPostMigrate(r3)
            r2.updateIdentity(r3)
            r0 = 1
            goto L53
        L39:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Migration didn't properly handle: "
            r4.append(r5)
            java.lang.String r5 = r0.expectedFoundMsg
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L52:
            r0 = 0
        L53:
            if (r0 != 0) goto L8e
            androidx.room.DatabaseConfiguration r0 = r2.mConfiguration
            if (r0 == 0) goto L6a
            boolean r0 = r0.isMigrationRequired(r4, r5)
            if (r0 != 0) goto L6a
            androidx.room.RoomOpenHelper$Delegate r4 = r2.mDelegate
            r4.dropAllTables(r3)
            androidx.room.RoomOpenHelper$Delegate r4 = r2.mDelegate
            r4.createAllTables(r3)
            goto L8e
        L6a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L8e:
            return
    }
}
