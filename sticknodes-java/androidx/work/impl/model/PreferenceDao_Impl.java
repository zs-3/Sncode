package androidx.work.impl.model;

/* loaded from: classes.dex */
public final class PreferenceDao_Impl implements androidx.work.impl.model.PreferenceDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<androidx.work.impl.model.Preference> __insertionAdapterOfPreference;


    public PreferenceDao_Impl(androidx.room.RoomDatabase r2) {
            r1 = this;
            r1.<init>()
            r1.__db = r2
            androidx.work.impl.model.PreferenceDao_Impl$1 r0 = new androidx.work.impl.model.PreferenceDao_Impl$1
            r0.<init>(r1, r2)
            r1.__insertionAdapterOfPreference = r0
            return
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public java.lang.Long getLongValue(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT long_value FROM Preference where `key`=?"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r5 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r5)
        L10:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r5 = r4.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r1, r2)
            boolean r3 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L32
            boolean r3 = r5.isNull(r1)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L2a
            goto L32
        L2a:
            long r1 = r5.getLong(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L39
        L32:
            r5.close()
            r0.release()
            return r2
        L39:
            r1 = move-exception
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public void insertPreference(androidx.work.impl.model.Preference r2) {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r0.beginTransaction()
            androidx.room.EntityInsertionAdapter<androidx.work.impl.model.Preference> r0 = r1.__insertionAdapterOfPreference     // Catch: java.lang.Throwable -> L1a
            r0.insert(r2)     // Catch: java.lang.Throwable -> L1a
            androidx.room.RoomDatabase r2 = r1.__db     // Catch: java.lang.Throwable -> L1a
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1a
            androidx.room.RoomDatabase r2 = r1.__db
            r2.endTransaction()
            return
        L1a:
            r2 = move-exception
            androidx.room.RoomDatabase r0 = r1.__db
            r0.endTransaction()
            throw r2
    }
}
