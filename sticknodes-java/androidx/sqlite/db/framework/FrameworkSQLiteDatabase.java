package androidx.sqlite.db.framework;

/* loaded from: classes.dex */
class FrameworkSQLiteDatabase implements androidx.sqlite.db.SupportSQLiteDatabase {
    private static final java.lang.String[] CONFLICT_VALUES = null;
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    private final android.database.sqlite.SQLiteDatabase mDelegate;



    static {
            java.lang.String r0 = ""
            java.lang.String r1 = " OR ROLLBACK "
            java.lang.String r2 = " OR ABORT "
            java.lang.String r3 = " OR FAIL "
            java.lang.String r4 = " OR IGNORE "
            java.lang.String r5 = " OR REPLACE "
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase.CONFLICT_VALUES = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase.EMPTY_STRING_ARRAY = r0
            return
    }

    FrameworkSQLiteDatabase(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.<init>()
            r0.mDelegate = r1
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mDelegate
            r0.beginTransaction()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mDelegate
            r0.close()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String r3) {
            r2 = this;
            androidx.sqlite.db.framework.FrameworkSQLiteStatement r0 = new androidx.sqlite.db.framework.FrameworkSQLiteStatement
            android.database.sqlite.SQLiteDatabase r1 = r2.mDelegate
            android.database.sqlite.SQLiteStatement r3 = r1.compileStatement(r3)
            r0.<init>(r3)
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mDelegate
            r0.endTransaction()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(java.lang.String r2) throws android.database.SQLException {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mDelegate
            r0.execSQL(r2)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(java.lang.String r2, java.lang.Object[] r3) throws android.database.SQLException {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mDelegate
            r0.execSQL(r2, r3)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mDelegate
            java.util.List r0 = r0.getAttachedDbs()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public java.lang.String getPath() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mDelegate
            java.lang.String r0 = r0.getPath()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mDelegate
            boolean r0 = r0.inTransaction()
            return r0
    }

    boolean isDelegate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mDelegate
            if (r0 != r2) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mDelegate
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery r5) {
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.mDelegate
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase$1 r1 = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase$1
            r1.<init>(r4, r5)
            java.lang.String r5 = r5.getSql()
            java.lang.String[] r2 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.EMPTY_STRING_ARRAY
            r3 = 0
            android.database.Cursor r5 = r0.rawQueryWithFactory(r1, r5, r2, r3)
            return r5
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery r7, android.os.CancellationSignal r8) {
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mDelegate
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase$2 r1 = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase$2
            r1.<init>(r6, r7)
            java.lang.String r2 = r7.getSql()
            java.lang.String[] r3 = androidx.sqlite.db.framework.FrameworkSQLiteDatabase.EMPTY_STRING_ARRAY
            r4 = 0
            r5 = r8
            android.database.Cursor r7 = r0.rawQueryWithFactory(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public android.database.Cursor query(java.lang.String r2) {
            r1 = this;
            androidx.sqlite.db.SimpleSQLiteQuery r0 = new androidx.sqlite.db.SimpleSQLiteQuery
            r0.<init>(r2)
            android.database.Cursor r2 = r1.query(r0)
            return r2
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mDelegate
            r0.setTransactionSuccessful()
            return
    }
}
