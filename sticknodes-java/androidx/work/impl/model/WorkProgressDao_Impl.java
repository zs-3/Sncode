package androidx.work.impl.model;

/* loaded from: classes.dex */
public final class WorkProgressDao_Impl implements androidx.work.impl.model.WorkProgressDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<androidx.work.impl.model.WorkProgress> __insertionAdapterOfWorkProgress;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDelete;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;




    public WorkProgressDao_Impl(androidx.room.RoomDatabase r2) {
            r1 = this;
            r1.<init>()
            r1.__db = r2
            androidx.work.impl.model.WorkProgressDao_Impl$1 r0 = new androidx.work.impl.model.WorkProgressDao_Impl$1
            r0.<init>(r1, r2)
            r1.__insertionAdapterOfWorkProgress = r0
            androidx.work.impl.model.WorkProgressDao_Impl$2 r0 = new androidx.work.impl.model.WorkProgressDao_Impl$2
            r0.<init>(r1, r2)
            r1.__preparedStmtOfDelete = r0
            androidx.work.impl.model.WorkProgressDao_Impl$3 r0 = new androidx.work.impl.model.WorkProgressDao_Impl$3
            r0.<init>(r1, r2)
            r1.__preparedStmtOfDeleteAll = r0
            return
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void delete(java.lang.String r3) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfDelete
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
            androidx.room.SharedSQLiteStatement r3 = r2.__preparedStmtOfDelete
            r3.release(r0)
            return
        L2d:
            r3 = move-exception
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfDelete
            r1.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void deleteAll() {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r3.__preparedStmtOfDeleteAll
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            androidx.room.RoomDatabase r1 = r3.__db
            r1.beginTransaction()
            r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L23
            androidx.room.RoomDatabase r1 = r3.__db     // Catch: java.lang.Throwable -> L23
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L23
            androidx.room.RoomDatabase r1 = r3.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r3.__preparedStmtOfDeleteAll
            r1.release(r0)
            return
        L23:
            r1 = move-exception
            androidx.room.RoomDatabase r2 = r3.__db
            r2.endTransaction()
            androidx.room.SharedSQLiteStatement r2 = r3.__preparedStmtOfDeleteAll
            r2.release(r0)
            throw r1
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void insert(androidx.work.impl.model.WorkProgress r2) {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r0.beginTransaction()
            androidx.room.EntityInsertionAdapter<androidx.work.impl.model.WorkProgress> r0 = r1.__insertionAdapterOfWorkProgress     // Catch: java.lang.Throwable -> L1a
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
