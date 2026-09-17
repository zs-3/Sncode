package androidx.work.impl.model;

/* loaded from: classes.dex */
public final class SystemIdInfoDao_Impl implements androidx.work.impl.model.SystemIdInfoDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<androidx.work.impl.model.SystemIdInfo> __insertionAdapterOfSystemIdInfo;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfRemoveSystemIdInfo;



    public SystemIdInfoDao_Impl(androidx.room.RoomDatabase r2) {
            r1 = this;
            r1.<init>()
            r1.__db = r2
            androidx.work.impl.model.SystemIdInfoDao_Impl$1 r0 = new androidx.work.impl.model.SystemIdInfoDao_Impl$1
            r0.<init>(r1, r2)
            r1.__insertionAdapterOfSystemIdInfo = r0
            androidx.work.impl.model.SystemIdInfoDao_Impl$2 r0 = new androidx.work.impl.model.SystemIdInfoDao_Impl$2
            r0.<init>(r1, r2)
            r1.__preparedStmtOfRemoveSystemIdInfo = r0
            return
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public androidx.work.impl.model.SystemIdInfo getSystemIdInfo(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r6 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r6)
        L10:
            androidx.room.RoomDatabase r6 = r5.__db
            r6.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r6 = r5.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r6 = androidx.room.util.DBUtil.query(r6, r0, r1, r2)
            java.lang.String r1 = "work_spec_id"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "system_id"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r3)     // Catch: java.lang.Throwable -> L44
            boolean r4 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L3d
            java.lang.String r1 = r6.getString(r1)     // Catch: java.lang.Throwable -> L44
            int r2 = r6.getInt(r3)     // Catch: java.lang.Throwable -> L44
            androidx.work.impl.model.SystemIdInfo r3 = new androidx.work.impl.model.SystemIdInfo     // Catch: java.lang.Throwable -> L44
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L44
            r2 = r3
        L3d:
            r6.close()
            r0.release()
            return r2
        L44:
            r1 = move-exception
            r6.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public java.util.List<java.lang.String> getWorkSpecIds() {
            r5 = this;
            java.lang.String r0 = "SELECT DISTINCT work_spec_id FROM SystemIdInfo"
            r1 = 0
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            androidx.room.RoomDatabase r2 = r5.__db
            r2.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r2 = r5.__db
            r3 = 0
            android.database.Cursor r2 = androidx.room.util.DBUtil.query(r2, r0, r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L31
            int r4 = r2.getCount()     // Catch: java.lang.Throwable -> L31
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
        L1c:
            boolean r4 = r2.moveToNext()     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L2a
            java.lang.String r4 = r2.getString(r1)     // Catch: java.lang.Throwable -> L31
            r3.add(r4)     // Catch: java.lang.Throwable -> L31
            goto L1c
        L2a:
            r2.close()
            r0.release()
            return r3
        L31:
            r1 = move-exception
            r2.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void insertSystemIdInfo(androidx.work.impl.model.SystemIdInfo r2) {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r0.beginTransaction()
            androidx.room.EntityInsertionAdapter<androidx.work.impl.model.SystemIdInfo> r0 = r1.__insertionAdapterOfSystemIdInfo     // Catch: java.lang.Throwable -> L1a
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

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(java.lang.String r3) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfRemoveSystemIdInfo
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            if (r3 != 0) goto L12
            r0.bindNull(r1)
            goto L15
        L12:
            r0.bindString(r1, r3)
        L15:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L2d
            androidx.room.RoomDatabase r3 = r2.__db     // Catch: java.lang.Throwable -> L2d
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2d
            androidx.room.RoomDatabase r3 = r2.__db
            r3.endTransaction()
            androidx.room.SharedSQLiteStatement r3 = r2.__preparedStmtOfRemoveSystemIdInfo
            r3.release(r0)
            return
        L2d:
            r3 = move-exception
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfRemoveSystemIdInfo
            r1.release(r0)
            throw r3
    }
}
