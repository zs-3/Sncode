package androidx.sqlite.db.framework;

/* loaded from: classes.dex */
class FrameworkSQLiteStatement extends androidx.sqlite.db.framework.FrameworkSQLiteProgram implements androidx.sqlite.db.SupportSQLiteStatement {
    private final android.database.sqlite.SQLiteStatement mDelegate;

    FrameworkSQLiteStatement(android.database.sqlite.SQLiteStatement r1) {
            r0 = this;
            r0.<init>(r1)
            r0.mDelegate = r1
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
            r2 = this;
            android.database.sqlite.SQLiteStatement r0 = r2.mDelegate
            long r0 = r0.executeInsert()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.mDelegate
            int r0 = r0.executeUpdateDelete()
            return r0
    }
}
