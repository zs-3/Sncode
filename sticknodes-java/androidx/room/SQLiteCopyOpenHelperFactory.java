package androidx.room;

/* loaded from: classes.dex */
class SQLiteCopyOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {
    private final java.lang.String mCopyFromAssetPath;
    private final java.io.File mCopyFromFile;
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory mDelegate;

    SQLiteCopyOpenHelperFactory(java.lang.String r1, java.io.File r2, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r3) {
            r0 = this;
            r0.<init>()
            r0.mCopyFromAssetPath = r1
            r0.mCopyFromFile = r2
            r0.mDelegate = r3
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public androidx.sqlite.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration r8) {
            r7 = this;
            androidx.room.SQLiteCopyOpenHelper r6 = new androidx.room.SQLiteCopyOpenHelper
            android.content.Context r1 = r8.context
            java.lang.String r2 = r7.mCopyFromAssetPath
            java.io.File r3 = r7.mCopyFromFile
            androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r8.callback
            int r4 = r0.version
            androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r0 = r7.mDelegate
            androidx.sqlite.db.SupportSQLiteOpenHelper r5 = r0.create(r8)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
