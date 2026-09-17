package androidx.room;

/* loaded from: classes.dex */
public abstract class SharedSQLiteStatement {
    private final androidx.room.RoomDatabase mDatabase;
    private final java.util.concurrent.atomic.AtomicBoolean mLock;
    private volatile androidx.sqlite.db.SupportSQLiteStatement mStmt;

    public SharedSQLiteStatement(androidx.room.RoomDatabase r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.mLock = r0
            r2.mDatabase = r3
            return
    }

    private androidx.sqlite.db.SupportSQLiteStatement createNewStatement() {
            r2 = this;
            java.lang.String r0 = r2.createQuery()
            androidx.room.RoomDatabase r1 = r2.mDatabase
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.compileStatement(r0)
            return r0
    }

    private androidx.sqlite.db.SupportSQLiteStatement getStmt(boolean r1) {
            r0 = this;
            if (r1 == 0) goto Lf
            androidx.sqlite.db.SupportSQLiteStatement r1 = r0.mStmt
            if (r1 != 0) goto Lc
            androidx.sqlite.db.SupportSQLiteStatement r1 = r0.createNewStatement()
            r0.mStmt = r1
        Lc:
            androidx.sqlite.db.SupportSQLiteStatement r1 = r0.mStmt
            goto L13
        Lf:
            androidx.sqlite.db.SupportSQLiteStatement r1 = r0.createNewStatement()
        L13:
            return r1
    }

    public androidx.sqlite.db.SupportSQLiteStatement acquire() {
            r3 = this;
            r3.assertNotMainThread()
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.mLock
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r3.getStmt(r0)
            return r0
    }

    protected void assertNotMainThread() {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.mDatabase
            r0.assertNotMainThread()
            return
    }

    protected abstract java.lang.String createQuery();

    public void release(androidx.sqlite.db.SupportSQLiteStatement r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.mStmt
            if (r2 != r0) goto La
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.mLock
            r0 = 0
            r2.set(r0)
        La:
            return
    }
}
