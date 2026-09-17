package androidx.work.impl.model;

/* loaded from: classes.dex */
public final class DependencyDao_Impl implements androidx.work.impl.model.DependencyDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<androidx.work.impl.model.Dependency> __insertionAdapterOfDependency;


    public DependencyDao_Impl(androidx.room.RoomDatabase r2) {
            r1 = this;
            r1.<init>()
            r1.__db = r2
            androidx.work.impl.model.DependencyDao_Impl$1 r0 = new androidx.work.impl.model.DependencyDao_Impl$1
            r0.<init>(r1, r2)
            r1.__insertionAdapterOfDependency = r0
            return
    }

    @Override // androidx.work.impl.model.DependencyDao
    public java.util.List<java.lang.String> getDependentWorkIds(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?"
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
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3b
            int r3 = r5.getCount()     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3b
        L26:
            boolean r3 = r5.moveToNext()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L34
            java.lang.String r3 = r5.getString(r2)     // Catch: java.lang.Throwable -> L3b
            r1.add(r3)     // Catch: java.lang.Throwable -> L3b
            goto L26
        L34:
            r5.close()
            r0.release()
            return r1
        L3b:
            r1 = move-exception
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasCompletedAllPrerequisites(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"
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
            r2 = 0
            r3 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r3, r2)
            boolean r2 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2c
            int r2 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2a
            goto L2b
        L2a:
            r1 = 0
        L2b:
            r3 = r1
        L2c:
            r5.close()
            r0.release()
            return r3
        L33:
            r1 = move-exception
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasDependents(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
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
            r2 = 0
            r3 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r3, r2)
            boolean r2 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2c
            int r2 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2a
            goto L2b
        L2a:
            r1 = 0
        L2b:
            r3 = r1
        L2c:
            r5.close()
            r0.release()
            return r3
        L33:
            r1 = move-exception
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.DependencyDao
    public void insertDependency(androidx.work.impl.model.Dependency r2) {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r0.beginTransaction()
            androidx.room.EntityInsertionAdapter<androidx.work.impl.model.Dependency> r0 = r1.__insertionAdapterOfDependency     // Catch: java.lang.Throwable -> L1a
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
