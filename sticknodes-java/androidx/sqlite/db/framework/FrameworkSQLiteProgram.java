package androidx.sqlite.db.framework;

/* loaded from: classes.dex */
class FrameworkSQLiteProgram implements androidx.sqlite.db.SupportSQLiteProgram {
    private final android.database.sqlite.SQLiteProgram mDelegate;

    FrameworkSQLiteProgram(android.database.sqlite.SQLiteProgram r1) {
            r0 = this;
            r0.<init>()
            r0.mDelegate = r1
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int r2, byte[] r3) {
            r1 = this;
            android.database.sqlite.SQLiteProgram r0 = r1.mDelegate
            r0.bindBlob(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int r2, double r3) {
            r1 = this;
            android.database.sqlite.SQLiteProgram r0 = r1.mDelegate
            r0.bindDouble(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int r2, long r3) {
            r1 = this;
            android.database.sqlite.SQLiteProgram r0 = r1.mDelegate
            r0.bindLong(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int r2) {
            r1 = this;
            android.database.sqlite.SQLiteProgram r0 = r1.mDelegate
            r0.bindNull(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int r2, java.lang.String r3) {
            r1 = this;
            android.database.sqlite.SQLiteProgram r0 = r1.mDelegate
            r0.bindString(r2, r3)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            android.database.sqlite.SQLiteProgram r0 = r1.mDelegate
            r0.close()
            return
    }
}
