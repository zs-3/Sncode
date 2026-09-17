package androidx.sqlite.db;

/* loaded from: classes.dex */
public interface SupportSQLiteDatabase extends java.io.Closeable {
    void beginTransaction();

    androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String r1);

    void endTransaction();

    void execSQL(java.lang.String r1) throws android.database.SQLException;

    void execSQL(java.lang.String r1, java.lang.Object[] r2) throws android.database.SQLException;

    java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs();

    java.lang.String getPath();

    boolean inTransaction();

    boolean isOpen();

    android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery r1);

    android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery r1, android.os.CancellationSignal r2);

    android.database.Cursor query(java.lang.String r1);

    void setTransactionSuccessful();
}
