package androidx.sqlite.db.framework;

/* loaded from: classes.dex */
class FrameworkSQLiteOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper {
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback mCallback;
    private final android.content.Context mContext;
    private androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper mDelegate;
    private final java.lang.Object mLock;
    private final java.lang.String mName;
    private final boolean mUseNoBackupDirectory;
    private boolean mWriteAheadLoggingEnabled;

    static class OpenHelper extends android.database.sqlite.SQLiteOpenHelper {
        final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback mCallback;
        final androidx.sqlite.db.framework.FrameworkSQLiteDatabase[] mDbRef;
        private boolean mMigrated;


        OpenHelper(android.content.Context r7, java.lang.String r8, androidx.sqlite.db.framework.FrameworkSQLiteDatabase[] r9, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r10) {
                r6 = this;
                int r4 = r10.version
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$1 r5 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$1
                r5.<init>(r10, r9)
                r3 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                r6.mCallback = r10
                r6.mDbRef = r9
                return
        }

        static androidx.sqlite.db.framework.FrameworkSQLiteDatabase getWrappedDb(androidx.sqlite.db.framework.FrameworkSQLiteDatabase[] r2, android.database.sqlite.SQLiteDatabase r3) {
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto Lb
                boolean r1 = r1.isDelegate(r3)
                if (r1 != 0) goto L12
            Lb:
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r1 = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase
                r1.<init>(r3)
                r2[r0] = r1
            L12:
                r2 = r2[r0]
                return r2
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
                r3 = this;
                monitor-enter(r3)
                super.close()     // Catch: java.lang.Throwable -> Lc
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase[] r0 = r3.mDbRef     // Catch: java.lang.Throwable -> Lc
                r1 = 0
                r2 = 0
                r0[r1] = r2     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r3)
                return
            Lc:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
        }

        androidx.sqlite.db.framework.FrameworkSQLiteDatabase getWrappedDb(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase[] r0 = r1.mDbRef
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r2 = getWrappedDb(r0, r2)
                return r2
        }

        synchronized androidx.sqlite.db.SupportSQLiteDatabase getWritableSupportDatabase() {
                r2 = this;
                monitor-enter(r2)
                r0 = 0
                r2.mMigrated = r0     // Catch: java.lang.Throwable -> L1b
                android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch: java.lang.Throwable -> L1b
                boolean r1 = r2.mMigrated     // Catch: java.lang.Throwable -> L1b
                if (r1 == 0) goto L15
                r2.close()     // Catch: java.lang.Throwable -> L1b
                androidx.sqlite.db.SupportSQLiteDatabase r0 = r2.getWritableSupportDatabase()     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r2)
                return r0
            L15:
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r0 = r2.getWrappedDb(r0)     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r2)
                return r0
            L1b:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r1.mCallback
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r2 = r1.getWrappedDb(r2)
                r0.onConfigure(r2)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r1.mCallback
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r2 = r1.getWrappedDb(r2)
                r0.onCreate(r2)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
                r1 = this;
                r0 = 1
                r1.mMigrated = r0
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r1.mCallback
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r2 = r1.getWrappedDb(r2)
                r0.onDowngrade(r2, r3, r4)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(android.database.sqlite.SQLiteDatabase r2) {
                r1 = this;
                boolean r0 = r1.mMigrated
                if (r0 != 0) goto Ld
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r1.mCallback
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r2 = r1.getWrappedDb(r2)
                r0.onOpen(r2)
            Ld:
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
                r1 = this;
                r0 = 1
                r1.mMigrated = r0
                androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r1.mCallback
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase r2 = r1.getWrappedDb(r2)
                r0.onUpgrade(r2, r3, r4)
                return
        }
    }

    FrameworkSQLiteOpenHelper(android.content.Context r1, java.lang.String r2, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mName = r2
            r0.mCallback = r3
            r0.mUseNoBackupDirectory = r4
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.mLock = r1
            return
    }

    private androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper getDelegate() {
            r6 = this;
            java.lang.Object r0 = r6.mLock
            monitor-enter(r0)
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r1 = r6.mDelegate     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto L49
            r1 = 1
            androidx.sqlite.db.framework.FrameworkSQLiteDatabase[] r1 = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase[r1]     // Catch: java.lang.Throwable -> L4d
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4d
            r3 = 23
            if (r2 < r3) goto L35
            java.lang.String r2 = r6.mName     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L35
            boolean r2 = r6.mUseNoBackupDirectory     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto L35
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4d
            android.content.Context r3 = r6.mContext     // Catch: java.lang.Throwable -> L4d
            java.io.File r3 = r3.getNoBackupFilesDir()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r6.mName     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L4d
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r3 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper     // Catch: java.lang.Throwable -> L4d
            android.content.Context r4 = r6.mContext     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L4d
            androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r5 = r6.mCallback     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r4, r2, r1, r5)     // Catch: java.lang.Throwable -> L4d
            r6.mDelegate = r3     // Catch: java.lang.Throwable -> L4d
            goto L42
        L35:
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r2 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper     // Catch: java.lang.Throwable -> L4d
            android.content.Context r3 = r6.mContext     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r6.mName     // Catch: java.lang.Throwable -> L4d
            androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r5 = r6.mCallback     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r3, r4, r1, r5)     // Catch: java.lang.Throwable -> L4d
            r6.mDelegate = r2     // Catch: java.lang.Throwable -> L4d
        L42:
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r1 = r6.mDelegate     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r6.mWriteAheadLoggingEnabled     // Catch: java.lang.Throwable -> L4d
            r1.setWriteAheadLoggingEnabled(r2)     // Catch: java.lang.Throwable -> L4d
        L49:
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r1 = r6.mDelegate     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            return r1
        L4d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r1
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r0 = r1.getDelegate()
            r0.close()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public java.lang.String getDatabaseName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
            r1 = this;
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r0 = r1.getDelegate()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableSupportDatabase()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper r1 = r2.mDelegate     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto La
            r1.setWriteAheadLoggingEnabled(r3)     // Catch: java.lang.Throwable -> Le
        La:
            r2.mWriteAheadLoggingEnabled = r3     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }
}
